import React from 'react';
import logo from './logo.svg';
import './App.css';
import ListMemberComponent from './components/ListMemberComponent';
import HeaderComponent from './components/HeaderComponent';
import FooterComponent from './components/FooterComponent';

function App() {
  return (
    <div>
      <HeaderComponent />
      <div className="container">
      <ListMemberComponent />
    </div>
    <FooterComponent />
    </div>
    
  );
}

export default App;
