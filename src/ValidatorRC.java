public class ValidatorRC {
    /**
     * Validuje české rodné číslo bez lomítka.
     * @param rc rodné číslo
     * @return vrací true pro validní r.č.
     */
    public static boolean validate(String rc) {
        //noinspection RedundantIfStatement
        if (!rc.matches("[0-9]{9,10}"))
            return false;

        return true;
    }
}
