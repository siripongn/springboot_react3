import React from 'react';
import {BrowserRouter as Router,Switch,Route } from 'react-router';

import {HomeTest} from './mycomponent/HomeTest';
import {AddTest} from './mycomponent/AddTest';
import {EditTest} from './mycomponent/EditTest';

import 'bootstrap/dist/css/bootstrap.min.css';

function AppTest() {
    return (
        <div className="AppTest" style={{maxWidth:"30rem", margin:"4rem auto"}}>
            <Router>
                <Switch>

                <Route exact Path="/" component={HomeTest} />
                <Route Path="/add" component={AddTest} />
                <Route Path="/Edit/:id" component={EditTest} />
                
                
                </Switch>
            </Router>

        </div>
    );
}
export default AppTest;
