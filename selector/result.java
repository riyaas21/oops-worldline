package selector;

import java.time.LocalDate;



public class result extends CandidateSelection {
	
//	private LocalDate of;

	public result(String name, LocalDate date, boolean isIndianCitizen, double pcmAverage, double ugCgpa, double pgCgpa,
			double numProjects, boolean isFullTime, int interviewScore, boolean scst) {
		super(name, date, isIndianCitizen, pcmAverage, ugCgpa, pgCgpa, numProjects, isFullTime, interviewScore, scst);
		// TODO Auto-generated constructor stub
	}
	
	public String return3() {
		LocalDate cutoffDate = LocalDate.of(1999, 7, 1);
		LocalDate dateOfBirth = this.date;
		String res = "";
		if(this.scst) {
			if(this.pcmAverage>50) {
				if(!dateOfBirth.isBefore(cutoffDate)) {
					if(this.ugCgpa>8 && this.pgCgpa>8 && this.isFullTime && this.numProjects>2 && this.interviewScore>35) {
						res = this.name + " is eligible";
					}
					
				}
			}
			else {
				res = this.name + "not ellible";
			}
		}
		if(!this.scst)  {
			if(this.pcmAverage>60) {
				if(!dateOfBirth.isBefore(cutoffDate)) {
					if(this.ugCgpa>8 && this.pgCgpa>8 && this.isFullTime && this.numProjects>2 && this.interviewScore>35) {
						res = this.name + " is eligible";
					}
					
				}
				
			}
		}
		return res;
	}

	public static void main(String args[]) {
		
		result r1 = new result("nizar", LocalDate.of(2000, 1, 1), true, 40, 70, 9, 9, true, 40, true);
		result r2 = new result("bob" ,LocalDate.of(1888, 1, 1), true, 80, 70, 9, 9, true, 40, true);
		result r3 = new result("riyaas" ,LocalDate.of(2000, 1, 1), true, 80, 70, 9, 9, true, 40, true);
		result r4 = new result("soib", LocalDate.of(2000, 1, 1), true, 40, 70, 9, 9, true, 40, false);
		result r5 = new result("nat" ,LocalDate.of(1998, 1, 1), true, 80, 70, 9, 9, true, 40, false);
		result r6 = new result("kishore" ,LocalDate.of(2000, 1, 1), true, 80, 70, 9, 9, true, 40, true);
		System.out.println(r1.return3());
		System.out.println(r2.return3());
		System.out.println(r3.return3());
		System.out.println(r4.return3());
		System.out.println(r5.return3());
		System.out.println(r6.return3());
	
	
	}
}
