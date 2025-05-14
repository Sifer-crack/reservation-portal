import { useNavigate } from 'react-router-dom';
import './styling/homePageStyling.css'; // Import the CSS file

export default function HomePage() {
  const navigate = useNavigate();

  return (
    <div className="home-container">
      <div className="home-island">
        <h1 className="home-title">Welcome to Reservation Portal</h1>
        <div className="home-buttons">
          <button className="home-button login-button" onClick={() => navigate('/userLogin')}>
            Login
          </button>
          <button className="home-button register-button" onClick={() => navigate('/userRegister')}>
            Register
          </button>
        </div>
      </div>
    </div>
  );
}
