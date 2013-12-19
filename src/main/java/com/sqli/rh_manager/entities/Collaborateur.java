package com.sqli.rh_manager.entities;
// Generated Dec 19, 2013 6:37:54 PM by Hibernate Tools 3.2.1.GA


import java.util.Date;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Collaborateur generated by hbm2java
 */
@Entity
@Table(name="collaborateur"
    ,catalog="rh_manager"
)
public class Collaborateur  implements java.io.Serializable {


     private int matricule;
     private ManagerRhStatus managerRhStatusByActualManagerRh;
     private ManagerRhStatus managerRhStatusByAncienManagerRh;
     private Bu bu;
     private String nom;
     private String prenom;
     private String abreviation;
     private Character sexe;
     private String site;
     private Date dateEmbauche;
     private Integer moisBap;
     private Date dateDepart;
     private Boolean ancienCollaborateur;
     private Boolean seminaireParticipation;
     private Date dateParticipation;
     private String email;
     private Set<Diplome> diplomes = new HashSet<Diplome>(0);
     private Set<PosteSalaire> posteSalaires = new HashSet<PosteSalaire>(0);
     private Set<TechnologiesMaitrisees> technologiesMaitriseeses = new HashSet<TechnologiesMaitrisees>(0);
     private Set<ManagerRhStatus> managerRhStatuses = new HashSet<ManagerRhStatus>(0);

    public Collaborateur() {
    }

	
    public Collaborateur(int matricule) {
        this.matricule = matricule;
    }
    public Collaborateur(int matricule, ManagerRhStatus managerRhStatusByActualManagerRh, ManagerRhStatus managerRhStatusByAncienManagerRh, Bu bu, String nom, String prenom, String abreviation, Character sexe, String site, Date dateEmbauche, Integer moisBap, Date dateDepart, Boolean ancienCollaborateur, Boolean seminaireParticipation, Date dateParticipation, String email, Set<Diplome> diplomes, Set<PosteSalaire> posteSalaires, Set<TechnologiesMaitrisees> technologiesMaitriseeses, Set<ManagerRhStatus> managerRhStatuses) {
       this.matricule = matricule;
       this.managerRhStatusByActualManagerRh = managerRhStatusByActualManagerRh;
       this.managerRhStatusByAncienManagerRh = managerRhStatusByAncienManagerRh;
       this.bu = bu;
       this.nom = nom;
       this.prenom = prenom;
       this.abreviation = abreviation;
       this.sexe = sexe;
       this.site = site;
       this.dateEmbauche = dateEmbauche;
       this.moisBap = moisBap;
       this.dateDepart = dateDepart;
       this.ancienCollaborateur = ancienCollaborateur;
       this.seminaireParticipation = seminaireParticipation;
       this.dateParticipation = dateParticipation;
       this.email = email;
       this.diplomes = diplomes;
       this.posteSalaires = posteSalaires;
       this.technologiesMaitriseeses = technologiesMaitriseeses;
       this.managerRhStatuses = managerRhStatuses;
    }
   
     @Id 
    
    @Column(name="Matricule", unique=true, nullable=false)
    public int getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Actual_Manager_RH")
    public ManagerRhStatus getManagerRhStatusByActualManagerRh() {
        return this.managerRhStatusByActualManagerRh;
    }
    
    public void setManagerRhStatusByActualManagerRh(ManagerRhStatus managerRhStatusByActualManagerRh) {
        this.managerRhStatusByActualManagerRh = managerRhStatusByActualManagerRh;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Ancien_Manager_RH")
    public ManagerRhStatus getManagerRhStatusByAncienManagerRh() {
        return this.managerRhStatusByAncienManagerRh;
    }
    
    public void setManagerRhStatusByAncienManagerRh(ManagerRhStatus managerRhStatusByAncienManagerRh) {
        this.managerRhStatusByAncienManagerRh = managerRhStatusByAncienManagerRh;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Bu")
    public Bu getBu() {
        return this.bu;
    }
    
    public void setBu(Bu bu) {
        this.bu = bu;
    }
    
    @Column(name="Nom", length=254)
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    @Column(name="Prenom", length=254)
    public String getPrenom() {
        return this.prenom;
    }
    
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    
    @Column(name="Abreviation", length=3)
    public String getAbreviation() {
        return this.abreviation;
    }
    
    public void setAbreviation(String abreviation) {
        this.abreviation = abreviation;
    }
    
    @Column(name="Sexe", length=1)
    public Character getSexe() {
        return this.sexe;
    }
    
    public void setSexe(Character sexe) {
        this.sexe = sexe;
    }
    
    @Column(name="Site", length=254)
    public String getSite() {
        return this.site;
    }
    
    public void setSite(String site) {
        this.site = site;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Date_embauche", length=19)
    public Date getDateEmbauche() {
        return this.dateEmbauche;
    }
    
    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    
    @Column(name="Mois_bap")
    public Integer getMoisBap() {
        return this.moisBap;
    }
    
    public void setMoisBap(Integer moisBap) {
        this.moisBap = moisBap;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Date_depart", length=19)
    public Date getDateDepart() {
        return this.dateDepart;
    }
    
    public void setDateDepart(Date dateDepart) {
        this.dateDepart = dateDepart;
    }
    
    @Column(name="Ancien_collaborateur")
    public Boolean getAncienCollaborateur() {
        return this.ancienCollaborateur;
    }
    
    public void setAncienCollaborateur(Boolean ancienCollaborateur) {
        this.ancienCollaborateur = ancienCollaborateur;
    }
    
    @Column(name="Seminaire_participation")
    public Boolean getSeminaireParticipation() {
        return this.seminaireParticipation;
    }
    
    public void setSeminaireParticipation(Boolean seminaireParticipation) {
        this.seminaireParticipation = seminaireParticipation;
    }
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="Date_participation", length=19)
    public Date getDateParticipation() {
        return this.dateParticipation;
    }
    
    public void setDateParticipation(Date dateParticipation) {
        this.dateParticipation = dateParticipation;
    }
    
    @Column(name="Email", length=254)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="diplomes", catalog="rh_manager", joinColumns = { 
        @JoinColumn(name="Collaborateur", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="Diplome", nullable=false, updatable=false) })
    public Set<Diplome> getDiplomes() {
        return this.diplomes;
    }
    
    public void setDiplomes(Set<Diplome> diplomes) {
        this.diplomes = diplomes;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="collaborateur")
    public Set<PosteSalaire> getPosteSalaires() {
        return this.posteSalaires;
    }
    
    public void setPosteSalaires(Set<PosteSalaire> posteSalaires) {
        this.posteSalaires = posteSalaires;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="collaborateur")
    public Set<TechnologiesMaitrisees> getTechnologiesMaitriseeses() {
        return this.technologiesMaitriseeses;
    }
    
    public void setTechnologiesMaitriseeses(Set<TechnologiesMaitrisees> technologiesMaitriseeses) {
        this.technologiesMaitriseeses = technologiesMaitriseeses;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="collaborateur")
    public Set<ManagerRhStatus> getManagerRhStatuses() {
        return this.managerRhStatuses;
    }
    
    public void setManagerRhStatuses(Set<ManagerRhStatus> managerRhStatuses) {
        this.managerRhStatuses = managerRhStatuses;
    }




}

