package be.vdab.valueobjects;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Adres implements Serializable {

    private static final long serialVersionUID = 1L;
    private String straat;
    private String huisNr;
    private String postcode;
    private String gemeente;

    public Adres(String straat, String huisNr, String postcode, String gemeente) {
	this.straat = straat;
	this.huisNr = huisNr;
	this.postcode = postcode;
	this.gemeente = gemeente;
    }

    protected Adres() {
    }

    public String getStraat() {
	return straat;
    }

    public String getHuisNr() {
	return huisNr;
    }

    public String getPostcode() {
	return postcode;
    }

    public String getGemeente() {
	return gemeente;
    }

    @Override
    public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (gemeente == null ? 0 : gemeente.hashCode());
	result = prime * result + (huisNr == null ? 0 : huisNr.hashCode());
	result = prime * result + (postcode == null ? 0 : postcode.hashCode());
	result = prime * result + (straat == null ? 0 : straat.hashCode());
	return result;
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (!(obj instanceof Adres))
	    return false;
	Adres adres = (Adres) obj;
	if (gemeente == null) {
	    if (adres.gemeente != null)
		return false;
	} else if (!gemeente.equals(adres.gemeente))
	    return false;
	if (huisNr == null) {
	    if (adres.huisNr != null)
		return false;
	} else if (!huisNr.equals(adres.huisNr))
	    return false;
	if (postcode == null) {
	    if (adres.postcode != null)
		return false;
	} else if (!postcode.equals(adres.postcode))
	    return false;
	if (straat == null) {
	    if (adres.straat != null)
		return false;
	} else if (!straat.equals(adres.straat))
	    return false;
	return true;
    }

}
