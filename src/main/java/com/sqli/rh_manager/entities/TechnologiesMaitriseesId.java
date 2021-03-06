package com.sqli.rh_manager.entities;
// Generated Dec 19, 2013 6:37:54 PM by Hibernate Tools 3.2.1.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TechnologiesMaitriseesId generated by hbm2java
 */
@Embeddable
public class TechnologiesMaitriseesId  implements java.io.Serializable {


     private int technologie;
     private int collaborateur;

    public TechnologiesMaitriseesId() {
    }

    public TechnologiesMaitriseesId(int technologie, int collaborateur) {
       this.technologie = technologie;
       this.collaborateur = collaborateur;
    }
   

    @Column(name="Technologie", nullable=false)
    public int getTechnologie() {
        return this.technologie;
    }
    
    public void setTechnologie(int technologie) {
        this.technologie = technologie;
    }

    @Column(name="Collaborateur", nullable=false)
    public int getCollaborateur() {
        return this.collaborateur;
    }
    
    public void setCollaborateur(int collaborateur) {
        this.collaborateur = collaborateur;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof TechnologiesMaitriseesId) ) return false;
		 TechnologiesMaitriseesId castOther = ( TechnologiesMaitriseesId ) other; 
         
		 return (this.getTechnologie()==castOther.getTechnologie())
 && (this.getCollaborateur()==castOther.getCollaborateur());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getTechnologie();
         result = 37 * result + this.getCollaborateur();
         return result;
   }   


}


