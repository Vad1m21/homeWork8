import flowers.Flower;
import flowers.Rose;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws IOException {
        FlowerStore flowerStore = new FlowerStore();
        int amountRose = 2;
        int amountChamomile = 1;
        int amountTulip = 3;
        List<String> flowersForSale = new ArrayList<>();
        flowerStore.outPutFlowers( flowersForSale = flowerStore.sell(amountRose ,amountTulip,amountChamomile));
        flowerStore.countMoneyFromFlowers(flowersForSale);
        System.out.println("Money after sale first flowers: " + flowerStore.getWallet());

        List<String> flowersForSaleSequence = new ArrayList<String>();
       flowerStore.outPutFlowers(flowersForSaleSequence = flowerStore.sellSequence(amountRose, amountTulip, amountChamomile));
        flowerStore.countMoneyFromFlowers(flowersForSaleSequence);
        System.out.println("Money after sale second flowers: " + flowerStore.getWallet());

        System.out.println();
        FlowersSaver.save(flowersForSaleSequence);
        List<String> flowerFromFile = new ArrayList<>();
        flowerFromFile = FlowersLoader.load();
        flowerStore.outPutFlowers(flowerFromFile);

        //   flowerFromFile.stream().forEach(x-> System.out.println(x));





        }



    }

