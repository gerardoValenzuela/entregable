/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionsalarial;

/**
 *
 * @author Jose Luis
 */
class Empleado {
  private int clave;
  private String nombre;
  public double monto;

  public void setClave(int clave) {
    this.clave = clave;
  }
  public int getClave() {
    return clave;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  public String getNombre() {
    return nombre;
  }
  public void setMonto(double monto) {
    this.monto = monto;  
  }
  public double getMonto() {
    return monto;
  }
  public double calculaPercepcionIVA() {
    return this.monto * 0.15;
  }

  public double calculaSubTotal() {
    return this.monto + calculaPercepcionIVA();
  }

  public double calculaRetencionIVA() {
    return this.monto * 0.1;
  }

  public double calculaRetencionISR() {
    return this.monto * 0.1;
  }

  public double calculaTotal() {
  return this.calculaSubTotal() - this.calculaRetencionISR() - this.calculaRetencionIVA();
  }

}