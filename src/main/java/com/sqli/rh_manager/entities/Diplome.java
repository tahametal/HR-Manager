package com.sqli.rh_manager.entities;
// Generated Dec 19, 2013 6:37:54 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Diplome generated by hbm2java
 */
@Entity
@Table(name="diplome"
    ,catalog="rh_manager"
)
public class Diplome  implements java.io.Serializable {


     private int id;
     private Ecole ecole;
     private Niveau niveau;
     private String promotion;
     private Set<Collaborateur> collaborateurs = new HashSet<Collaborateur>(0);

    public Diplome() {
    }

	
    public Diplome(int id, Ecole ecole, Niveau niveau) {
        this.id = id;
        this.ecole = ecole;
        this.niveau = niveau;
    }
    public Diplome(int id, Ecole ecole, Niveau niveau, String promotion, Set<Collaborateur> collaborateurs) {
       this.id = id;
       this.ecole = ecole;
       this.niveau = niveau;
       this.promotion = promotion;
       this.collaborateurs = collaborateurs;
    }
   
     @Id 
    
    @Column(name="Id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Ecole", nullable=false)
    public Ecole getEcole() {
        return this.ecole;
    }
    
    public void setEcole(Ecole ecole) {
        this.ecole = ecole;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Niveau", nullable=false)
    public Niveau getNiveau() {
        return this.niveau;
    }
    
    public void setNiveau(Niveau niveau) {
        this.niveau = niveau;
    }
    
    @Column(name="Promotion", length=254)
    public String getPromotion() {
        return this.promotion;
    }
    
    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="diplomes", catalog="rh_manager", joinColumns = { 
        @JoinColumn(name="Diplome", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="Collaborateur", nullable=false, updatable=false) })
    public Set<Collaborateur> getCollaborateurs() {
        return this.collaborateurs;
    }
    
    public void setCollaborateurs(Set<Collaborateur> collaborateurs) {
        this.collaborateurs = collaborateurs;
    }




}


