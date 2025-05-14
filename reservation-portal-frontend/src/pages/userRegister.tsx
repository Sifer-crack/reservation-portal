import './styling/registerStyling.css';

function UserRegister() {
  return (
    <div className="register-container">
      <div className="register-card">
        <h2 className="register-title">Register</h2>

        <div className="form-row">
          <div className="form-group">
            <label className="register-label" htmlFor="firstName">First Name</label>
            <input className="register-input" type="text" id="firstName" placeholder="First Name" />
          </div>
          <div className="form-group">
            <label className="register-label" htmlFor="lastName">Last Name</label>
            <input className="register-input" type="text" id="lastName" placeholder="Last Name" />
          </div>
        </div>

        <label className="register-label" htmlFor="email">Email</label>
        <input className="register-input" type="email" id="email" placeholder="Email" />

        <label className="register-label" htmlFor="phone">Phone Number</label>
        <input className="register-input" type="tel" id="phone" placeholder="Phone Number" />

        <label className="register-label" htmlFor="address">Address</label>
        <input className="register-input" type="text" id="address" placeholder="Address" />

        <label className="register-label" htmlFor="password">Create Password</label>
        <input className="register-input" type="password" id="password" placeholder="Password" />

        <label className="register-label" htmlFor="confirmPassword">Confirm Password</label>
        <input className="register-input" type="password" id="confirmPassword" placeholder="Confirm Password" />

        <label className="register-label" htmlFor="referral">How did you hear about us?</label>
        <input className="register-input" type="text" id="referral" placeholder="e.g., Google, Friend..." />

        <button className="register-button">Register</button>
      </div>
    </div>
  );
}

export default UserRegister;
