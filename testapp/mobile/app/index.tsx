import {
  Alert,
  Button,
  FlatList,
  Modal,
  StyleSheet,
  Text,
  TextInput,
  TouchableOpacity,
  View
} from 'react-native';
import React, { useEffect, useState } from 'react';

const EmployeeList = () => {
  const [employees, setEmployees] = useState([]);
  const [showForm, setShowForm] = useState(false);
  const [formType, setFormType] = useState('create'); // 'create' or 'update'
  const [formData, setFormData] = useState({ id: null, firstName: '', lastName: '', email: '' });

  useEffect(() => {
    fetchEmployees();
  }, []);

  const fetchEmployees = () => {
    fetch('http://localhost:8080/api/employees')
      .then(res => res.json())
      .then(data => setEmployees(data))
      .catch(error => console.error('Error fetching employees:', error));
  };

  const handleCreate = () => {
    setFormType('create');
    setFormData({ id: null, firstName: '', lastName: '', email: '' });
    setShowForm(true);
  };

  const handleUpdate = (employee) => {
    setFormType('update');
    setFormData(employee);
    setShowForm(true);
  };

  const handleDelete = (id) => {
    console.log('Delete ID:', id);
    Alert.alert(
      'Confirm Delete',
      `Are you sure you want to delete employee with ID: ${id}?`,
      [
        { text: 'Cancel', style: 'cancel' },
        {
          text: 'Delete', style: 'destructive', onPress: () => {
            fetch(`http://localhost:8080/api/employees/${id}`, {
              method: 'DELETE',
              headers: { 'Content-Type': 'application/json' }
            })
              .then(() => fetchEmployees())
              .catch(err => console.error('Delete error:', err));
          }
        }
      ]
    );
  };

  const handleSubmit = () => {
    const method = formType === 'create' ? 'POST' : 'PUT';
    const url = formType === 'create'
      ? 'http://localhost:8080/api/employees'
      : `http://localhost:8080/api/employees/${formData.id}`;

    fetch(url, {
      method,
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(formData)
    })
      .then(res => {
        if (!res.ok) throw new Error('Failed to submit');
        return res.json();
      })
      .then(() => {
        setShowForm(false);
        fetchEmployees();
      })
      .catch(error => console.error('Submit error:', error));
  };

  const handleChange = (name, value) => {
    setFormData({ ...formData, [name]: value });
  };

  const renderItem = ({ item }) => (
    <View style={styles.employeeItem}>
      <Text style={styles.employeeInfo}>
        {item.firstName} {item.lastName} ({item.email})
      </Text>
      <View style={styles.actions}>
        <Button title="Update" onPress={() => handleUpdate(item)} />
        <Button title="Delete" color="red" onPress={() => handleDelete(item.id)} />
      </View>
    </View>
  );

  return (
    <View style={styles.container}>
      <Text style={styles.header}>Employee List</Text>
      <TouchableOpacity style={styles.createBtn} onPress={handleCreate}>
        <Text style={styles.createBtnText}>Create Employee</Text>
      </TouchableOpacity>
      <FlatList
        data={employees}
        keyExtractor={(item) => item.id.toString()}
        renderItem={renderItem}
      />

      <Modal visible={showForm} animationType="slide" transparent>
        <View style={styles.modalOverlay}>
          <View style={styles.formContainer}>
            <Text style={styles.formHeader}>{formType === 'create' ? 'Create' : 'Update'} Employee</Text>
            <TextInput
              placeholder="First Name"
              value={formData.firstName}
              onChangeText={(text) => handleChange('firstName', text)}
              style={styles.input}
            />
            <TextInput
              placeholder="Last Name"
              value={formData.lastName}
              onChangeText={(text) => handleChange('lastName', text)}
              style={styles.input}
            />
            <TextInput
              placeholder="Email"
              value={formData.email}
              onChangeText={(text) => handleChange('email', text)}
              keyboardType="email-address"
              style={styles.input}
            />
            <View style={styles.formButtons}>
              <Button title={formType === 'create' ? 'Create' : 'Update'} onPress={handleSubmit} />
              <Button title="Cancel" color="gray" onPress={() => setShowForm(false)} />
            </View>
          </View>
        </View>
      </Modal>
    </View>
  );
};

const styles = StyleSheet.create({
  container: {
    padding: 16,
    marginTop: 40,
    flex: 1,
    backgroundColor: '#f2f2f2'
  },
  header: {
    fontSize: 24,
    fontWeight: 'bold',
    marginBottom: 12,
    textAlign: 'center'
  },
  createBtn: {
    backgroundColor: '#28a745',
    padding: 12,
    borderRadius: 6,
    alignItems: 'center',
    marginBottom: 16
  },
  createBtnText: {
    color: '#fff',
    fontSize: 16
  },
  employeeItem: {
    backgroundColor: '#fff',
    padding: 12,
    marginVertical: 6,
    borderRadius: 6,
    shadowColor: '#000',
    shadowOpacity: 0.1,
    shadowRadius: 6,
    elevation: 2
  },
  employeeInfo: {
    marginBottom: 8,
    fontSize: 16
  },
  actions: {
    flexDirection: 'row',
    justifyContent: 'space-between'
  },
  modalOverlay: {
    flex: 1,
    backgroundColor: 'rgba(0,0,0,0.4)',
    justifyContent: 'center',
    alignItems: 'center'
  },
  formContainer: {
    backgroundColor: '#fff',
    padding: 20,
    borderRadius: 8,
    width: '90%'
  },
  formHeader: {
    fontSize: 20,
    marginBottom: 12,
    textAlign: 'center'
  },
  input: {
    borderWidth: 1,
    borderColor: '#ccc',
    padding: 10,
    marginVertical: 6,
    borderRadius: 4
  },
  formButtons: {
    flexDirection: 'row',
    justifyContent: 'space-between',
    marginTop: 12
  }
});

export default EmployeeList;
