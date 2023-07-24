/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alura.conversor.util;

import com.alura.cambioMoneda.cambios.Dolares;
import com.alura.cambioMoneda.cambios.Euro;
import com.alura.cambioMoneda.cambios.Libras_Esterlinas;
import com.alura.cambioMoneda.cambios.Soles;
import com.alura.cambioMoneda.cambios.Won;
import com.alura.cambioMoneda.cambios.Yen;
import com.alura.cambioMoneda.enum_divisas.Divisas;

/**
 *
 * @author Usuario
 */
public class MonedasAgrupadas {

    public String divisa1;
    public String divisa2;
    public String valor;

    public String getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(String divisa1) {
        this.divisa1 = divisa1;
    }

    public String getDivisa2() {
        return divisa2;
    }

    public void setDivisa2(String divisa2) {
        this.divisa2 = divisa2;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public MonedasAgrupadas() {
        // TODO Auto-generated constructor stub

    }

    public Divisas BuscarMoneda(String divisaBuscar) {
        for (Divisas divisa : Divisas.values()) {
            if (divisa.name() == divisaBuscar) {
                return divisa;
            }
        }
        return null;
    }

    public String OperaciónMoneda(String divisa1, String divisa2) {
        Divisas divisaBuscada1 = BuscarMoneda(divisa1);
        Divisas divisaBuscada2 = BuscarMoneda(divisa2);

        if (divisaBuscada1 != null && divisaBuscada2 != null && divisaBuscada1 != divisaBuscada2) {
            if (Divisas.SOLES == divisaBuscada1) {
                Soles soles = new Soles();
                double cambio = soles.CambioRetornado(divisa1, divisa2);
                return soles.Operacion(this.valor, cambio);
            }
            if (Divisas.DOLAR == divisaBuscada1) {
                Dolares dolares = new Dolares();
                double cambio = dolares.CambioRetornado(divisa1, divisa2);
                return dolares.Operacion(this.valor, cambio);

            }
            if (Divisas.EURO == divisaBuscada1) {
                Euro euro = new Euro();
                double cambio = euro.CambioRetornado(divisa1, divisa2);
                return euro.Operacion(this.valor, cambio);

            }
            if (Divisas.LIBRAS_ESTERLINAS == divisaBuscada1) {
                Libras_Esterlinas librasEsterlinas = new Libras_Esterlinas();
                double cambio = librasEsterlinas.CambioRetornado(divisa1, divisa2);
                return librasEsterlinas.Operacion(this.valor, cambio);

            }
            if (Divisas.WON == divisaBuscada1) {
                Won won = new Won();
                double cambio = won.CambioRetornado(divisa1, divisa2);
                return won.Operacion(this.valor, cambio);

            }
            if (Divisas.YEN == divisaBuscada1) {
                Yen yen = new Yen();
                double cambio = yen.CambioRetornado(divisa1, divisa2);
                return yen.Operacion(this.valor, cambio);

            }

        }

        return "Operación invalida, revisar las opciones";

    }
}
