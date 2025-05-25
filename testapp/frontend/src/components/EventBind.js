import React, { use, useEffect, useState } from 'react'

export default function EventBind() {

const [name,setName] = useState([]);

useEffect(() => {
    setName(["randila","saman","kumar"]);
},[]);
    
  return (
    <div>
      <h1>Event Binding</h1>
      <ul>
        {name.map((n, index) => (
          <li key={index}>{n}</li>
        ))}
      </ul>
    </div>
  )
}
