package lesson_DesignAReportCardClass;

public class ReportCard {

	private String name, englishGrade, mathGrade, historyGrade;

	public ReportCard(String name) {
		this.name = name;
	}

	public void setEnglishGrade(String eGrade) {
		englishGrade = eGrade;
	}

	public void setMathGrade(String mGrade) {
		mathGrade = mGrade;
	}

	public void setHistoryGrade(String hGrade) {
		historyGrade = hGrade;
	}

	public String getName() {
		return name;
	}

	public String getEnglishGrade() {
		return englishGrade;
	}

	public String getMathGradee() {
		return mathGrade;
	}

	public String getHistoryGrad() {
		return historyGrade;
	}

	@Override
	public String toString() {
		// Your code here! Return a representation of
		// the report card rather than the empty string
		return "Name: " + getName() + "; English grade: " + getEnglishGrade() + "; History grade: " + getHistoryGrad()
				+ "; Math grade: " + getMathGradee() + ";";
	}

	public static void main(String[] args) {

		ReportCard a = new ReportCard("Charles");
		a.setEnglishGrade("A-");
		a.setMathGrade("B+");
		a.setHistoryGrade("d-");
		System.out.println(a.toString());
	}
}
