import React from 'react';
import  "./App.css"
import DataTable from 'components/DataTable/dataTable';
import BarChart from 'components/BarChart/barChart';

import NavBar from 'components/NavBar';
import Footer from 'components/Footer/footer';
import DonutChart from 'components/DonutChart/donutChart';


function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard Vendas!</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Todas as vendas</h5>
       <DonutChart/>
          </div>
        </div>
        <div className="py-3">
          <h2 className="text-primary">Todas Vendas</h2>
          <DataTable />
        </div>
      </div>


      <Footer />
    </>
  );

}

export default App;
