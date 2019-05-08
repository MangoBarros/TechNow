package intro.multiecras.technow;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    public static final List<Product> produtos = new ArrayList<>();
    public static final List<Product> produtosComparar = new ArrayList<>();
    public static final int[] imgs =new int[]{
            R.drawable.samsung,
            R.drawable.samsung2,
            R.drawable.apple_iphone_6s,
            R.drawable.apple_mac_pro,
            R.drawable.huawuei,
            R.drawable.smartwatch,
            R.drawable.mac_2,
            R.drawable.surface,
            R.drawable.surface_pro


    };


    Product item1 = new Product("Samsung",419,"É muito bom",imgs[0]);
    Product item2 = new Product("Samsung2",919,"É muito muito bom",imgs[1]);
    Product item3 = new Product("Apple 6s",3419,"É muito bom",imgs[2]);
    Product item4 = new Product("Apple MacBook 13",1200,"É muito bom",imgs[3]);
    Product item5 = new Product("Huawei",819,"É muito bom",imgs[4]);
    Product item6 = new Product("SmartWatch",219,"É muito bom",imgs[5]);
    Product item7 = new Product("Mac Pro",1419,"É muito bom",imgs[6]);
    Product item8 = new Product("surface Windows",219,"É muito bom",imgs[7]);
    Product item9 = new Product("surface Windows Pro",719,"É muito bom",imgs[8]);

    public Dados(){
        produtos.add(item1);
        produtos.add(item2);
        produtos.add(item3);
        produtos.add(item4);
        produtos.add(item5);
        produtos.add(item6);
        produtos.add(item7);
        produtos.add(item8);
        produtos.add(item9);


        produtosComparar.add(item1);
        produtosComparar.add(item2);

    }



}
