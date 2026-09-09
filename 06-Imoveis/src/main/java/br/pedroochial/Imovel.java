package br.pedroochial;

public abstract class Imovel {

    private String nomeProprietario;
private int areaConstruida;
private Geo geoLocalizacao;
private static double vr;

public abstract double calculaImposto();

public Imovel (String nomeProprietario, int areaConstruida, Geo geoLocalizacao, double vr ){
    this.nomeProprietario = nomeProprietario;
    this.areaConstruida = areaConstruida;
    this.geoLocalizacao = geoLocalizacao;
    this.vr = vr;
}

public String getNomeProprietario(){
    return this.nomeProprietario;
}
public int getAreaConstruida(){
    return this.areaConstruida;
}
public Geo getGeoLocalizacao(){
    return this.geoLocalizacao;
}
public double getVr(){
    return this.vr;
}
public String toString(){
return "Nome Proprietario " + this.nomeProprietario +
        "Area Construida " + this.areaConstruida +
        " Geo Localizacao" + this.geoLocalizacao;

 }
}
