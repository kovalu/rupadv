/* The file is saved in UTF-8 codepage.
 * Check: «Stereotype», Section mark-§, Copyright-©, Alpha-α, Beta-β, Smile-☺
 */
package cz.kovalu.rupadv;

import eu.pedu.adv15p_fw.game_txt.BasicActions;
import eu.pedu.adv15p_fw.game_txt.IAction;
import eu.pedu.adv15p_fw.game_txt.IBag;
import eu.pedu.adv15p_fw.game_txt.IGame;
import eu.pedu.adv15p_fw.game_txt.IWorld;

import java.util.Collection;



/*******************************************************************************
 * Instance třídy {@code EmptyGame} mají na starosti logiku hry.
 * Jsou schopny akceptovat jednotlivé příkazy a poskytovat informace
 * o průběžném stavu hry a jejích součástí.
 * <p>
 * Třída hry musí být definována jako jedináček (singleton)
 * a kromě metod deklarovaných v interfejsu {@link IGame} musí definovat
 * statickou tovární metodu {@code getInstance()}.
 * Splnění této podmínky nemůže prověřit překladač,
 * ale prověří ji až následné testy hry.
 * <p>
 * Instance třídy {@code EmptyGame} představují prototypy instancí hry,
 * které ještě nejsou schopny plnohodnotného spuštění a slouží pouze
 * ke kompletaci těch vlastností správce scénářů, které bude v budoucnu
 * plnit ve spolupráci s plnohodnotnou hrou.
 *
 * @author  Rudolf PECINOVSKÝ
 * @version 2015-Podzim
 */
public class MyGame extends ANamed implements IGame, IAuthorMe
{
//== CONSTANT CLASS ATTRIBUTES =================================================

    /** Tovární třída, jejíž instancemi jsou tovární objekty poskytující
     *  instanci správce scénářů i hry, jejíž scénáře daný správce spravuje. */
    private final static Class<MyGSMFactory> FACTORY_CLASS = MyGSMFactory.class;

    /** Odkaz na jedinou instanci (jedináčka) této hry. */
    private static final MyGame SINGLETON = new MyGame();



//== VARIABLE CLASS ATTRIBUTES =================================================



//##############################################################################
//== STATIC INITIALIZER (CLASS CONSTRUCTOR) ====================================
//== CLASS GETTERS AND SETTERS =================================================
//== OTHER NON-PRIVATE CLASS METHODS ===========================================
//== PRIVATE AND AUXILIARY CLASS METHODS =======================================



//##############################################################################
//== CONSTANT INSTANCE ATTRIBUTES ==============================================
//== VARIABLE INSTANCE ATTRIBUTES ==============================================



//##############################################################################
//== CONSTUCTORS AND FACTORY METHODS ===========================================

    /***************************************************************************
     * Tovární metoda vracející odkaz na jedninou existující instanci dané hry.
     *
     * @return Instance dané hry
     */
    public static MyGame getInstance()
    {
        return SINGLETON;
    }


    /***************************************************************************
     * Soukromý konstruktor definující jedinou instanci.
     * Protože je soukromý, musí být definován, i když má prázdné tělo.
     */
    private MyGame()
    {
        super("My game");
    }



//== ABSTRACT METHODS ==========================================================
//== INSTANCE GETTERS AND SETTERS ==============================================

    /***************************************************************************
     * Vrátí class-objekt tovární třídy, jejíž instance umějí zprostředkovat
     * získání všech klíčových objektů aplikace.
     *
     * @return Class-objekt tovární třídy
     */
    @Override
    public Class<MyGSMFactory> getFactoryClass()
    {
        return FACTORY_CLASS;
    }


    /***************************************************************************
     * Vrátí informaci o tom, je-li hra aktuálně spuštěná.
     * Spuštěnou hru není možno pustit znovu.
     * Chceme-li hru spustit znovu, musíme ji nejprve ukončit.
     *
     * @return Je-li hra spuštěná, vrátí {@code true},
     *         jinak vrátí {@code false}
     */
    @Override
    public boolean isAlive()
    {
        //TODO EmptyGame.isAlive - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }


    /***************************************************************************
     * Vrátí odkaz na batoh, do nějž bude hráč ukládat sebrané předměty.
     *
     * @return Batoh, do nějž hráč ukládá sebrané předměty
     */
    @Override
    public IBag getBag()
    {
        //TODO EmptyGame.getBag - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }


    /***************************************************************************
     * Vrátí kolekci všech příkazů použitelných ve hře.
     *
     * @return Kolekce všech příkazů použitelných ve hře
     */
    @Override
    public Collection<? extends IAction> getAllActions()
    {
        //TODO EmptyGame.getAllActions - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }


    /***************************************************************************
     * Vrátí odkaz na přepravku s názvy povinných příkazů, tj. příkazů pro
     * <ul>
     *   <li>přesun hráče do jiného prostoru,</li>
     *   <li>zvednutí objektu (odebrání z prostoru a vložení do batohu),</li>
     *   <li>položení objektu (odebrání z batohu a vložení do prostoru),</li>
     *   <li>vyvolání nápovědy,</li>
     *   <li>okamžité ukončení hry.</li>
     * </ul>
     *
     * @return Přepravka názvy povinných příkazů
     */
    @Override
    public BasicActions getBasicActions()
    {
        //TODO EmptyGame.getBasicActions - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }


    /***************************************************************************
     * Vrátí odkaz na svět, v němž se hra odehrává.
     *
     * @return Svět, v němž se hra odehrává
     */
    @Override
    public IWorld getWorld()
    {
        //TODO EmptyGame.getWorld - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }



//== OTHER NON-PRIVATE INSTANCE METHODS ========================================

    /***************************************************************************
     * Zpracuje zadaný příkaz a vrátí text zprávy pro uživatele.
     *
     * @param command Zadávaný příkaz
     * @return Textová odpověď hry na zadaný příkaz
     */
    @Override
    public String executeCommand(String command)
    {
        //TODO EmptyGame.executeCommand(String) - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }


    /***************************************************************************
     * Ukončí celou hru a vrátí alokované prostředky.
     */
    @Override
    public void stop()
    {
        //TODO EmptyGame.stop - Metoda ještě není hotova
        throw new UnsupportedOperationException("\nMetoda ještě není hotova.");
    }



//== PRIVATE AND AUXILIARY INSTANCE METHODS ====================================



//##############################################################################
//== NESTED DATA TYPES =========================================================
}
