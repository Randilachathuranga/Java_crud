import EmployeeList from "./components/EmployeeList";
import EventBind from "./components/EventBind";
import Example from "./components/Example";
import Message from "./components/Message";
import React from "react";
import Test from "./components/Test";

const App = () => {
  return (
    <div>
      <EmployeeList/>
      {/* <Test name="halloo">
        <p>mm moo wenne</p>
        <button onClick={()=>{
          alert("ddd");
        }}>hello</button>
      </Test>
            <Test name="randila" /> */
      }
      {/* <Message /> */}
      {/* <EventBind/> */}
      {/* <Example/> */}
    </div>
    
  );
};

export default App;
