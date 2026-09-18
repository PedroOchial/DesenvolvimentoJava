package br.pedroochial;

public class Comercial extends Imovel {

    public Comercial (String nomeProprietario, int areaConstruida, Geo geoLocalizacao){
        super (nomeProprietario, areaConstruida, geoLocalizacao);
    }

         @Override
    public double calculaImposto(){
        return getAreaConstruida() * Imovel.getVr();
    }
@Override
    public String toString(){
        return super.toString();

    }

}
