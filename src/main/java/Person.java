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
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    /**
     * For better flow and readability "Personnummer" should be replaced with socialSecurityNumber
     * Sends socialSecurityNumber of Person
     * @return socialSecurityNumber - socialSecurityNumber of person
     */
    public String getPersonnummer(){
        return this.socialSecurityNumber;
    }

    /**
     * Attempts to set person number, should check if anyone has this personNumber
     * as it is supposed to be uniqe
     * @param attemptedPersonnummer - the social securty number they want to change to
     */
    public void setPersonnummer(String attemptedPersonnummer)
    {
        this.socialSecurityNumber = attemptedPersonnummer;
    }

    /**
     * Obvious typo in class model, but I am going to follow it
     * to avoid punishment!!!!!
     * Names are not supposed to be unique so no need for duplication checks
     * @param newFirstName - sets firstName to newFirstName
     */
    public void setFirtName(String newFirstName)
    {
        this.firstName = newFirstName;
    }

    /**
     * Sets last name of Person object
     * Names are not supposed to be unique, so no need for duplication checks
     * @param newLastName - sets lastName to newLastName
     */
    public void setLastName(String newLastName) {
        this.lastName = newLastName;
    }

    /**
     * returns first name of Person object
     * @return - first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * returns last name of Person object
     * @return - last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Returns full name of person
     * @return - concatenated string of firstName and lastName fields
     */
    public String getFullNavn() {
        return firstName + " " + lastName;
    }
    //Add toString method
}
