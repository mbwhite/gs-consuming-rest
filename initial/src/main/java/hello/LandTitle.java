package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LandTitle {

    private String dclass;
    private String titleId;
    private String owner;
    private String information;
    private boolean forSale;

    public LandTitle() {
    }

    public String getDlcass() {
        return dclass;
    }

    public void setDclass(String type) {
        this.dclass = type;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String value) {
        this.titleId = value;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String value) {
        this.owner = value;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String value) {
        this.information = value;
    }

    public boolean getForSale() {
        return forSale;
    }

    public void setForSale(boolean value) {
        this.forSale = value;
    }

    @Override
    public String toString() {
        return "LandTitle{" +
                "titleId='" + titleId + '\'' +
                ", information=" + information +
                '}';
    }
}
