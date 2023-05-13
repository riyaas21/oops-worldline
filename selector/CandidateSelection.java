package selector;

import java.time.LocalDate;



public class CandidateSelection {
	double hscAggregate;
    double pcmAverage;
    double ugCgpa;
    double pgCgpa;
    double numProjects;
    boolean isFullTime;
    int interviewScore;
    boolean isIndianCitizen;
	int result;
	String name;
	boolean scst;
	LocalDate date;
	 
	
	 public CandidateSelection(String name, LocalDate date,boolean isIndianCitizen,double pcmAverage,double ugCgpa,double pgCgpa,double numProjects,boolean isFullTime,int interviewScore,boolean scst) {
		
        this.pcmAverage = pcmAverage;
        this.ugCgpa = ugCgpa;
        this.pgCgpa = pgCgpa;
        this.numProjects = numProjects;
        this.isFullTime = isFullTime;
        this.interviewScore = interviewScore;
        this.name = name;
        this.date = date;
	
	}
	 
}
	
	

