//import logo from './logo.svg';
import './App.css';
import React from 'react';

import axios from 'axios';
import Table from '@mui/material/Table';
import TableBody from '@mui/material/TableBody';
import TableCell from '@mui/material/TableCell';
import TableContainer from '@mui/material/TableContainer';
import TableHead from '@mui/material/TableHead';
import TableRow from '@mui/material/TableRow';
import Paper from '@mui/material/Paper';


class App extends React.Component {

  constructor(prop){
    super(prop);
    this.state={
      student:[],
      id:0,
      firstname:'',
      lastname:'',
      email:''
    }
  }
  componentDidMount(){
    axios.get("http://localhost:5050/apistudent/")
    .then((res)=>{
      this.setState({
        student:res.data,
        id:0,
        firstname:'',
        lastname:'',
        email:''
      })
    })
  }
  submit(event,id){
    event.preventDefault();
    if(id===0){
      axios.post("http://localhost:5050/apistudent/",{
        firstname:this.state.firstname,
        lastname:this.state.lastname,
        email:this.state.email
      })
      .then((res)=>{
        this.componentDidMount();
      })
    }else{
      axios.put("http://localhost:5050/apistudent/",{
        id:this.state.id,
        firstname:this.state.firstname,
        lastname:this.state.lastname,
        email:this.state.email
      }).then(()=>{
        this.componentDidMount();
      })
    }
  }
    delete(id){
      axios.delete(`http://localhost:5050/apistudent/${id}`)
      .then(()=>{
        this.componentDidMount();
      })
    }
      edit(id){
        axios.get(`http://localhost:5050/apistudent/${id}`)
        .then((res)=>{
          console.log(res.data);
          this.setState({
            id:res.data.id,
            firstname:res.data.firstname,
            lastname:res.data.lastname,
            email:res.data.email
          })
        })
      }
  render(){
    return(
      <div className="container">
        <div className="row">
        <form onSubmit={(e)=>this.submit(e,this.state.id)}>
          <div class="input-field col s12">
              <i class="material-icons prefix">textsms</i>
              <input onChange={(e)=>this.setState({firstname:e.target.value})} value={this.state.firstname} type="text" id="autocomplete-input" class="autocomplete" />
              <label for="autocomplete-input">FIRSTNAME</label>
          </div>
          <div class="input-field col s12">
              <i class="material-icons prefix">textsms</i>
              <input onChange={(e)=>this.setState({lastname:e.target.value})} value={this.state.lastname} type="text" id="autocomplete-input" class="autocomplete" />
              <label for="autocomplete-input">LASTEMAIL</label>
          </div>
          <div class="input-field col s12">
              <i class="material-icons prefix">email</i>
              <input onChange={(e)=>this.setState({email:e.target.value})} value={this.state.email} type="email" id="autocomplete-input" class="autocomplete" />
              <label for="autocomplete-input">EMAIL</label>
          </div>
          <button class="btn waves-effect waves-light" type="submit" name="action">Submit
            <i class="material-icons right">send</i>
          </button>
        </form>

        <TableContainer component={Paper}>
          <Table sx={{ minWidth: 650 }} size="small" aria-label="a dense table">
            <TableHead>
              <TableRow>
                <TableCell>Firstname</TableCell>
                <TableCell>Lastname</TableCell>
                <TableCell>Email</TableCell>
                <TableCell align="right">Edit&nbsp;</TableCell>
                <TableCell align="right">Delete&nbsp;</TableCell>
              </TableRow>
            </TableHead>
            <TableBody>

              {this.state.student.map(stud=>
              //rows.map((row) => (
                <TableRow
                  //key={row.name}
                  sx={{ '&:last-child td, &:last-child th': { border: 0 } }}
                >
                  <TableCell component="th" scope="row">{stud.firstname}</TableCell>
                  <TableCell >{stud.lastname}</TableCell>
                  <TableCell >{stud.email}</TableCell>
                   <TableCell align="right">
                   <button onClick={(e)=>this.edit(stud.id)} class="btn waves-effect waves-light" type="submit" name="action">
                    <i class="material-icons">edit</i>
                   </button>
                   </TableCell>
                   <TableCell align="right">
                   <button onClick={(e)=>this.delete(stud.id)} class="btn waves-effect waves-light" type="submit" name="action">
                    <i class="material-icons">delete</i>
                   </button>
                   </TableCell>
                </TableRow>
              )
              }

            </TableBody>
          </Table>
        </TableContainer>

        </div>
      </div>

    );
  }
  // return (
  //   <div className="App">
  //     <header className="App-header">
  //       <img src={logo} className="App-logo" alt="logo" />
  //       <p>
  //         Edit <code>src/App.js</code> and save to reload.
  //       </p>
  //       <a
  //         className="App-link"
  //         href="https://reactjs.org"
  //         target="_blank"
  //         rel="noopener noreferrer"
  //       >
  //         Learn React
  //       </a>
  //     </header>
  //   </div>
  // );
}

export default App;
