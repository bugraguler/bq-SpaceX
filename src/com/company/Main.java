package com.company;

public class Main {
    public static void main(String[] args) {
        SystemParts factX = new SystemParts();
        factX.sun = "1";
        factX.moon = "2";
        factX.stars = "155k";

        //added new sun
        SunFeatures suncak = new SunFeatures();
        suncak.color = "red";
        suncak.heat = "1988kj";
        suncak.radius = "4444km";

        //bu kod ftrsun branch ında yazıldı
        //denemedir

        //bundan sonrası stars branchında yazılmıştır
        StarFeature mrv = new StarFeature();
        mrv.color = "white"; //error resolved
        mrv.size = "36";
        mrv.radius = "3500km";


        //planet1 fatures
        Planet1Features tata = new Planet1Features();
        tata.color = "blue";
        tata.size = "14kg";
        tata.nameS = "cucuto";

        //planet1 fatures
        Planet2Features nasa = new Planet2Features();
        nasa.color = "yellow";
        nasa.size = "95kg";
        nasa.name = "mamo";
        
    }
}