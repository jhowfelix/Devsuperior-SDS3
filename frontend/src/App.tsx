import React from 'react';
import NavBar from 'components/NavBar';
import Footer from 'components/NavBar/Footer/footer';
import DataTable from 'components/DataTable/dataTable';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Olá Mundo!</h1>
      </div>

      <DataTable/>
      <Footer/>
    </>
  );

}

export default App;
