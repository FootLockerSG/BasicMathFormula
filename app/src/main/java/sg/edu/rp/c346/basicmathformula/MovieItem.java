package sg.edu.rp.c346.basicmathformula;

public class MovieItem {

    private String name;
    private String date;
    private String formula;

    public MovieItem(String name, String date, String formula) {
        this.name = name;
        this.date = date;
        this.formula = formula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula;
    }

    @Override
    public String toString() {
        return "MovieItem{" +
                "name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", formula='" + formula + '\'' +
                '}';
    }
}

