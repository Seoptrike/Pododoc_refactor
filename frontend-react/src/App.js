import './App.css';
import { useEffect, useState } from 'react';
import axios from 'axios';

function App() {
  const [data, setData] = useState({});
  const [test, setTest] = useState({});

  const callAPI = async () => {
    try {
      const res = await axios.post("/users/list");
      if (res.data) {
        setData(res.data);  
      } else {
        setData("test");
      }
      console.log(res.data);
    } catch (error) {
      console.error("API 호출 중 오류 발생:", error);
      setData("Error fetching data");
    }
  };

  useEffect(() => { callAPI() }, []);

  return (
    <div className="App">
      <header className="App-header">
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <p>API Data: {JSON.stringify(data)}</p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
    </div>
  );
}

export default App;