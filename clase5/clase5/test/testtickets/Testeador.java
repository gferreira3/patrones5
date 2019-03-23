/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtickets;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sensorvelocidad.VehiculoData;
import ticketsdetransito.GrabadorTicketImpl;
import ticketsdetransito.VerificadorVelocidad;

/**
 *
 * @author educacionit
 */
public class Testeador {
    
    public Testeador() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void caso1() {
        GrabadorTicketMock grabadorTrucho = new GrabadorTicketMock();
        
        VerificadorVelocidad verificador = 
                new VerificadorVelocidad(grabadorTrucho);
        
        VehiculoData vehiculoData = new VehiculoData();
        
        vehiculoData.patente = "TESTCASE";
        vehiculoData.tipoVehiculo = "N/A";
        vehiculoData.limiteVelocidad = 100;
        vehiculoData.velocidadMedida = 100;
        
        verificador.verificarSiCorrespondeMulta(vehiculoData);
        Assert.assertEquals(false, grabadorTrucho.isHuboTicket());
    }
    @Test
    public void caso2() {
        GrabadorTicketMock grabadorTrucho = new GrabadorTicketMock();
        
        VerificadorVelocidad verificador = 
                new VerificadorVelocidad(grabadorTrucho);
        
        VehiculoData vehiculoData = new VehiculoData();
        
        vehiculoData.patente = "TESTCASE";
        vehiculoData.tipoVehiculo = "N/A";
        vehiculoData.limiteVelocidad = 100;
        vehiculoData.velocidadMedida = 150;
        
        verificador.verificarSiCorrespondeMulta(vehiculoData);
        Assert.assertEquals(true, grabadorTrucho.isHuboTicket());
    }
}
