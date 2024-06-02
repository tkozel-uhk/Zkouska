package cz.uhk.pro1.zkouska.utils;

/**
 * Interface tříd poskytujicich slova z vhodneho zdroje.
 */
public interface WordProvider {
    /**
     * Nastavuje zdroj dat na zacatek.
     */
    void reset();
    /**
     * Vraci dalsi slovo ze zdroje prevedene na mala pismena.
     * @return dalsi slovo nebo null, pokud uz zadne slovo neni.
     */
    String getNextWord();
}
