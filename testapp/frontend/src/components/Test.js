import React from 'react'

function test(props) {
  return (
    <div>
       <h1> hi {props.name}</h1>
        {props.children}
    </div>
  )
}

export default test