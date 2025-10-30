import './Login.css';
import { useNavigate } from 'react-router-dom';

export default function Login() {
  const navigate = useNavigate();

  return (
    <>
      <section>
        <main className="login-container">
          <h1>Login</h1>
          <form>
            <input type="text" placeholder="Usuário" />
            <input type="password" placeholder="Senha" />
            <button type="submit" onClick={() => navigate('/dashboard')}>
              Entrar
            </button>
          </form>
        </main>
      </section>
    </>
  );
}
