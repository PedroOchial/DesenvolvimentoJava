package br.pedroochial;

public class Residencial extends Imovel {

    private int areaTerreno;

    public Residencial (String nomeProprietario, int areaConstruida, Geo geoLocalizacao, int areaTerreno, double vr){
        super( nomeProprietario, areaConstruida, geoLocalizacao,vr);
        this.areaTerreno = areaTerreno;
    }
    @Override
    public double calculaImposto(){
        if (getAreaConstruida()  < 200){
            return 0;
        }
        else if (getAreaConstruida() >= 200 && getAreaConstruida() < 1000 ){
            return ((areaTerreno - 200) * getVr());
        }

        else  
         return ((areaTerreno - 200) *  getVr() *100);

    }

    }
