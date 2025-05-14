import './styling/loginStyling.css';

function userLogin() {
  return (
    <div className="login-container">
      <div className="login-card">
        <h2 className="login-title">Login Here</h2>

        <label className="login-label" htmlFor="username">Username</label>
        <input
          className="login-input"
          type="text"
          id="username"
          placeholder="Email"
        />

        <label className="login-label" htmlFor="password">Password</label>
        <input
          className="login-input"
          type="password"
          id="password"
          placeholder="Password"
        />

        <button className="login-button">Log In</button>

        <div className="social-buttons">
          <button className="social-button google">G&nbsp;&nbsp;Google</button>
          <button className="social-button facebook">f&nbsp;&nbsp;Facebook</button>
        </div>
      </div>
    </div>
  );
}

export default userLogin;
