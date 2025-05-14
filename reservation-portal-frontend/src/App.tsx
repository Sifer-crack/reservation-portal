import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import HomePage from './pages/HomePage';
import UserLogin from './pages/userLogin';
import UserRegister from './pages/userRegister';
import './App.css';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/" element={<HomePage />} />
        <Route path="/userLogin" element={<UserLogin />} />
        <Route path="/userRegister" element={<UserRegister />} />
      </Routes>
    </Router>
  );
}

export default App;
