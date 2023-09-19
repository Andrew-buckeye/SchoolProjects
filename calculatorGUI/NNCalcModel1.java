import components.naturalnumber.NaturalNumber;
import components.naturalnumber.NaturalNumber2;

/**
 * Model class.
 *
 * @author AndrewThompson
 */
public final class NNCalcModel1 implements NNCalcModel {

    /**
     * Model variables.
     */
    private  NaturalNumber top, bottom;
    /**
     * No argument constructor.
     */
    public NNCalcModel1() {
       /*
        * Initializes both variables as 0
        */
        this.top = new NaturalNumber2();
        this.bottom = new NaturalNumber2();
    }
    @Override
    public NaturalNumber top() {
        return this.top;
    }

    @Override
    public NaturalNumber bottom() {
        return this.bottom;
    }

}
