public class Patient extends Person{
    private String diagnosis;
    /**
     * @param firstName - first name of Person
     * @param lastName - last name of Person
     * @param socialSecurityNumber - Unique ID of Person (Don't know why a social security number is in string)
     */
    public Patient(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }

    /**
     * gets diagnosis of patient
      * @return diagnosis of patient
     */
    public String getDiagnose() {
        return diagnosis;
    }
}
