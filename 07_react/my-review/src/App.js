import './App.css';
import {BrowserRouter,Routes,Route, Link} from 'react-router-dom';
import Timer from './component/Timer';
import CountLetters from './component/CountLetters';

function App() {
  return (
    <BrowserRouter>
    <div className="App">
      <header className="App-header">
        <nav style={{backgroundColor : 'teal'}}>
          <Link to="/">Home</Link>
          <Link to="/timer">타이머</Link>
          <Link to="/countLetters">글자 수 세기</Link>
        </nav>
      </header>
      <Routes>
        <Route path="/" element={<p>메인</p>} />
        <Route path="/timer" element={<Timer />} />
        <Route path="/countLetters" element={<CountLetters />} />
      </Routes>
    </div>
    </BrowserRouter>
  );
}

export default App;
