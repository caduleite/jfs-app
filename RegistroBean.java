/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensode.jfs.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Carlos Eduardo
 */
@ManagedBean
@RequestScoped
public class RegistroBean {
   private String solução;
   private String PrimeiroNome;
   private Integer Idade;
   private String Email;
   private String SegNome;
    /**
     * @return the solução
     */
    public String getSolução() {
        return solução;
    }

    /**
     * @param solução the solução to set
     */
    public void setSolução(String solução) {
        this.solução = solução;
    }

    /**
     * @return the PrimeiroNome
     */
    public String getPrimeiroNome() {
        return PrimeiroNome;
    }

    /**
     * @param PrimeiroNome the PrimeiroNome to set
     */
    public void setPrimeiroNome(String PrimeiroNome) {
        this.PrimeiroNome = PrimeiroNome;
    }
    /**
     * @return the Idade
     */
    public Integer getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(Integer Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the SegNome
     */
    public String getSegNome() {
        return SegNome;
    }

    /**
     * @param SegNome the SegNome to set
     */
    public void setSegNome(String SegNome) {
        this.SegNome = SegNome;
    }
   
   
    
}
