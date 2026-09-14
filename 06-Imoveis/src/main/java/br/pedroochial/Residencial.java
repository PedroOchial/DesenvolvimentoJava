package br.pedroochial;

public class Residencial extends Imovel {

    private int areaTerreno;

    public Residencial (String nomeProprietario, int areaConstruida, Geo geoLocalizacao, int areaTerreno, double vr){
        super( nomeProprietario, areaConstruida, geoLocalizacao);
        this.areaTerreno = areaTerreno;
    }


@Override
public double calculaImposto(){
    if (getAreaConstruida() <= 200) {
        return 0;
    }

    double imposto = (getAreaConstruida() - 200) * Imovel.getVr();

    if (areaTerreno > 1000) {
        imposto = imposto + (100 * Imovel.getVr());
    }

    return imposto;
}
