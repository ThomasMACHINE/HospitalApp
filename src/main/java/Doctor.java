public abstract class Doctor extends Person
{
    /**
     * @param firstName - first name of Person
     * @param lastName - last name of Person
     * @param socialSecurityNumber - Unique ID of Person (Don't know why a social security number is in string)
     */
    public Doctor(String firstName, String lastName, String socialSecurityNumber)
    {
        super(firstName, lastName, socialSecurityNumber);
    }
}
