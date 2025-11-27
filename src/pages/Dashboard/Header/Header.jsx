import logo from '/logo.png';
import './Header.css';

export default function Header() {
  return (
    <header>
      <img id="logoSistema" src={logo} alt="Logo do sistema de gestão" />
    </header>
  );
}
