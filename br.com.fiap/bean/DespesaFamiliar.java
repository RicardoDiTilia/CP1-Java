package br.com.fiap.bean;
 
 public class DespesaFamiliar {
     // atributos
     public double rendaFamiliar;
     public int numeroDeMoradores;
     public double gastoComLuz;
     public double gastoComInternet;
     public double valorMensalidadeDaAcademia;
     // metodos
     public double calcularTotalDeDespesas(){
         return gastoComLuz + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);
     }
     public double calcularRendaFamiliarLiquida(){
         return rendaFamiliar - calcularTotalDeDespesas();
     }
 }