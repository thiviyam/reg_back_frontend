import React from 'react';
import './header.css';
import Chefinfo from './personalinfo';
import Userinfo from './userinfo';
import {BrowserRouter as Router, Route, Link, Switch} from "react-router-dom";

export default function Heading() {

    
    return (
        <div>
            

        <Router>
            <Link exact to = "/userinfo"> click here</Link>
            <Link exact to = "/personalinfo"> click here persinal</Link>
           <Switch>
            <Route exact path = "/userinfo" component={Userinfo}></Route>
            <Route exact path = "/personalinfo" component={Chefinfo}></Route>
            </Switch>
        </Router>
            
        </div>
    )
}
