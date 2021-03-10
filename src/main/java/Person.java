public abstract class Person {
    private String firstName; // first name of person
    private String lastName; // last name of Person
    private String socialSecurityNumber; // Unique ID of Person (Don't know why a social security number is in string)
    /**
     *
     * @param firstName - first name of Person
     * @param lastName - last name of Person
     * @param socialSecurityNumber - Unique ID of Person (Don't know why a social security number is in string)
     */
    public Person(String firstName, String lastName, String socialSecurityNumber)
    {
        private this.firstName = firstName;
        private this.lastName = lastName;
        private this.socialSecurityNumber = socialSecurityNumber;
    }
}
