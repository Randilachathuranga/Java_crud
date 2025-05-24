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
            .then(response => response.json())
            .then(data => setEmployees(data))
            .catch(error => console.error('Error:', error));
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
        if (window.confirm(`Are you sure you want to delete employee with id: ${id}?`)) {
            fetch(`http://localhost:8080/api/employees/${id}`, {
                method: 'DELETE',
                headers: { 'Content-Type': 'application/json' }
            })
                .then(() => fetchEmployees())
                .catch(error => console.error('Error:', error));
        }
    };

    const handleSubmit = (e) => {
        e.preventDefault();
        const method = formType === 'create' ? 'POST' : 'PUT';
        const url = formType === 'create'
            ? 'http://localhost:8080/api/employees'
            : `http://localhost:8080/api/employees/${formData.id}`;

        fetch(url, {
            method,
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(formData)
        })
            .then(response => {
                if (!response.ok) throw new Error('Failed to submit form');
                return response.json();
            })
            .then(() => {
                setShowForm(false);
                fetchEmployees();
            })
            .catch(error => console.error('Error:', error));
    };

    const handleChange = (e) => {
        setFormData({ ...formData, [e.target.name]: e.target.value });
    };

    return (
        <div className="employee-list-container">
            <h2>Employee List</h2>
            <button onClick={handleCreate} className="create-btn">Create Employee</button>
            <ul className="employee-list">
                {employees.map(emp => (
                    <li key={emp.id} className="employee-item">
                        <span className="employee-info">{emp.firstName} {emp.lastName} ({emp.email})</span>
                        <div className="employee-actions">
                            <button className="update-btn" onClick={() => handleUpdate(emp)}>Update</button>
                            <button className="delete-btn" onClick={() => handleDelete(emp.id)}>Delete</button>
                        </div>
                    </li>
                ))}
            </ul>

            {showForm && (
                <div className="popup-form">
                    <form onSubmit={handleSubmit} className="form">
                        <h3>{formType === 'create' ? 'Create' : 'Update'} Employee</h3>
                        <input type="text" name="firstName" placeholder="First Name" value={formData.firstName} onChange={handleChange} required />
                        <input type="text" name="lastName" placeholder="Last Name" value={formData.lastName} onChange={handleChange} required />
                        <input type="email" name="email" placeholder="Email" value={formData.email} onChange={handleChange} required />
                        <div className="form-actions">
                            <button type="submit">{formType === 'create' ? 'Create' : 'Update'}</button>
                            <button type="button" onClick={() => setShowForm(false)}>Cancel</button>
                        </div>
                    </form>
                </div>
            )}

            <style>{`
                .employee-list-container {
                    max-width: 600px;
                    margin: 40px auto;
                    background: #f9f9f9;
                    padding: 24px;
                    border-radius: 8px;
                    box-shadow: 0 2px 8px rgba(0,0,0,0.1);
                }
                .create-btn {
                    background: #28a745;
                    color: #fff;
                    padding: 8px 16px;
                    border: none;
                    border-radius: 4px;
                    margin-bottom: 16px;
                    cursor: pointer;
                    font-size: 1em;
                }
                .employee-list {
                    list-style: none;
                    padding: 0;
                }
                .employee-item {
                    display: flex;
                    justify-content: space-between;
                    padding: 12px 0;
                    border-bottom: 1px solid #ddd;
                }
                .employee-info {
                    flex: 1;
                }
                .employee-actions button {
                    margin-left: 8px;
                    padding: 6px 12px;
                    border: none;
                    border-radius: 4px;
                    cursor: pointer;
                }
                .update-btn {
                    background: #007bff;
                    color: white;
                }
                .delete-btn {
                    background: #dc3545;
                    color: white;
                }

                .popup-form {
                    position: fixed;
                    top: 0;
                    left: 0;
                    right: 0;
                    bottom: 0;
                    background: rgba(0,0,0,0.5);
                    display: flex;
                    justify-content: center;
                    align-items: center;
                }
                .form {
                    background: white;
                    padding: 20px;
                    border-radius: 8px;
                    max-width: 400px;
                    width: 100%;
                    display: flex;
                    flex-direction: column;
                    gap: 12px;
                }
                .form input {
                    padding: 8px;
                    font-size: 1em;
                    border: 1px solid #ccc;
                    border-radius: 4px;
                }
                .form-actions {
                    display: flex;
                    justify-content: space-between;
                }
            `}</style>
        </div>
    );
};

export default EmployeeList;
