import flowers.Chamomile;
import flowers.Flower;
import flowers.Rose;
import flowers.Tulip;

import java.util.ArrayList;
import java.util.List;

public class FlowerStore {

private int Wallet = 0;

    public int getWallet() {
        return Wallet;
    }

    public void setWallet(int wallet) {
        Wallet = wallet;
    }

    public List<String> sell(int amountRose, int amountTulip, int amountChamomile) {
        int amountFlowers = amountChamomile + amountRose + amountTulip;
       List<Rose> roseArray = new ArrayList<Rose>();
       List<Chamomile> chamomileArray = new ArrayList<Chamomile>();
       List<Tulip> tulipArray = new ArrayList<Tulip>();
       List<String> flowerArray = new ArrayList<>();

        for (int i = 0; i < amountFlowers; i++) {
            if (i < amountRose) {
                for (int j = 0; j < amountRose; j++) {
                   roseArray.add(new Rose());
                   flowerArray.add("Rose");
                   roseArray.remove(j);

                    break;
                }
            }

            if (i >= amountRose && i<amountRose+amountTulip) {
                for (int z = 0; z < amountTulip; z++) {
                   tulipArray.add(new Tulip());
                   flowerArray.add("Tulip");
                   tulipArray.remove(z);
                 break;
                }

            }
            if (i >= amountRose + amountTulip ) {
                for (int y = 0; y < amountChamomile; y++) {
                   chamomileArray.add(new Chamomile());
                   flowerArray.add("Chamomile");
                   chamomileArray.remove(y);

                    break;
                }
            }
        }
        return flowerArray;
    }




    public List<String> sellSequence(int amountRose, int amountTulip, int amountChamomile) {

        List<Rose> roses = new ArrayList<Rose>();
        for (int i = 0;i <amountRose;i++) {
            roses.add(new Rose());
        }
        List<Chamomile> chamomiles = new ArrayList<Chamomile>();
        for (int i = 0;i <amountChamomile;i++){
            chamomiles.add(new Chamomile());
        }
        List<Tulip> tulips = new ArrayList<Tulip>();

       for (int i = 0;i <amountTulip;i++){
            tulips.add(new Tulip());
        }
        List<String > flowers = new ArrayList<String>();

        boolean end = false;

        while (!end){
            end = true;

            if(roses.size()>0){
                for (int j = 0; j <roses.size(); j++) {
                    flowers.add("Rose");
                    roses.remove(j);
                    break;
                }
                end = false;
            }

            if (chamomiles.size()>0){
                for (int z = 0; z <chamomiles.size(); z++) {
                    flowers.add("Chamomile");
                    chamomiles.remove(z);
                    break;
                }
                end = false;
            }
            if (tulips.size()>0){
                for (int y = 0; y < tulips.size(); y++) {

                    flowers.add("Tulip");
                    tulips.remove(y);

                    break;
                }
                end = false;
            }

        }
        return flowers;
    }



    public int countMoneyFromFlowers (List<String> flowers){
        int countMoneyFromFlowers = 0;

        for (int i = 0;i<flowers.size();i++) {

            if(flowers.get(i).equals("Rose")){
                countMoneyFromFlowers += new Rose().getRosePrice();
            }
            else if(flowers.get(i).equals("Chamomile")){
                countMoneyFromFlowers += new Chamomile().getChamomilePrice();
            }
            else if(flowers.get(i).equals("Tulip")){
                countMoneyFromFlowers += new Tulip().getTulipPrice();
            }
        }
        return this.Wallet += countMoneyFromFlowers;
    }


    public void outPutFlowers (List <String> flowerArray){
        for (int i = 0; i < flowerArray.size(); i++) {
            if(i == 0){
                System.out.print("[");
            }
            if(i>=0 && i < flowerArray.size()-1) {
                System.out.print(" <" + flowerArray.get(i) + ">, ");

            }
            if (flowerArray.size() - 1 == i){
                System.out.print("<" + flowerArray.get(i) + "> ");
            }
            if(i ==flowerArray.size()-1){
                System.out.println("]");
            }
        }
    }

}









