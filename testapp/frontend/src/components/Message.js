import React, { Component } from 'react'

export class Message extends Component {
    
    constructor(props) {
      super(props)
    
      this.state = {
        count : 0
      } 
    }

    
    

    changeMessage(){
        this.setState({
            count : this.state.count + 5
        },()=>{console.log(this.state.count)})
    }

    
  render() {
    return (
      <div>
        <h1>{this.state.count}</h1>
        <button onClick={()=> this.changeMessage()}>Subccribe</button>
      </div>
    )
  }
}

export default Message

