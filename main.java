import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Boba> shops = new ArrayList<Boba>();
        ArrayList<Boba> sort;

        for(int i = 0; i < shops.size(); i++) {
            sort.add(shops.get(i));
        }

        String name;
        double minPrice = -1.0; //
        double maxPrice = 10000.0; //
        double distance = -1.0; //
        double rating = -1.0;
        boolean dairyFree; //
        boolean noCaffeine; //
        boolean hot; //

        //System.out.println("Hello! Looking for a boba shop? \nWe can help you with that! 
        //Our program will help you narrow down which of the nearby boba shops are perfect for you, 
        //so you can spend less time choosing a place and more time drinking some beautiful boba.");
        //System.out.println("Let's get started! First off, are you looking for vegan boba? \nType Y for yes or N for no, and then click enter.");

        if(dairyFree) {
            for(int i = 0; i < sort.size(); i++) {
                if(!((sort.get(i)).getDairyFree())) {
                    sort.remove(i);
                    i--;
                }
            }
        }

        if(hot) {
            for(int i = 0; i < sort.size(); i++) {
                if(!((sort.get(i)).getHot())) {
                    sort.remove(i);
                    i--;
                }
            }
        }

        if(noCaffeine) {
            for(int i = 0; i < sort.size(); i++) {
                if(!((sort.get(i)).getNoCaffeine())) {
                    sort.remove(i);
                    i--;
                }
            }
        }

        if((minPrice != -1.0) && (maxPrice != 10000.0)) {
            for(int i = 0; i < sort.size(); i++) {
                if(!(minPrice <= ((sort.get(i)).getMedianPrice())) && (maxPrice >= ((sort.get(i)).getMedianPrice()))) {
                    sort.remove(i);
                    i--;
                }
            }
        }

        if(distance !=-1.0) {
            for(int i = 0; i < sort.size(); i++) {
                if((sort.get(i).getDistance()) > distance) {
                    sort.remove(i);
                    i--;
                }
            }
        }

        if(rating !=-1.0) {
            for(int i = 0; i < sort.size(); i++) {
                if((sort.get(i).getRating()) < rating) {
                    sort.remove(i);
                    i--;
                }
            }
        }



    }
}