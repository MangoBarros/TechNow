package intro.multiecras.technow;

import java.util.ArrayList;
import java.util.List;

public class Dados {

    static final List<Product> produtos = new ArrayList<>();
    static final List<Product> produtosComparar = new ArrayList<>();
    private static final int[] imgs =new int[]{
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

    private static final String[] spec = new String[]{
            "Éqwdqdqw",
            "É",
            "É",
            "É",
            "É",
            "É",
            "É",
            "É",
            "É",

    };


    public Dados(){
        Product item1 = new Product("Samsung", "419 €", spec[0], imgs[0]);
        produtos.add(item1);
        Product item2 = new Product("Samsung2", "919 €", spec[1], imgs[1]);
        produtos.add(item2);
        Product item3 = new Product("Apple 6s", "3419 €", spec[2], imgs[2]);
        produtos.add(item3);
        Product item4 = new Product("Apple MacBook 13", "1200 €", spec[3], imgs[3]);
        produtos.add(item4);
        Product item5 = new Product("Huawei", "819 €", spec[4], imgs[4]);
        produtos.add(item5);
        Product item6 = new Product("SmartWatch", "219 €", spec[5], imgs[5]);
        produtos.add(item6);
        Product item7 = new Product("Mac Pro", "1419 €", spec[6], imgs[6]);
        produtos.add(item7);
        Product item8 = new Product("surface Windows", "219 €", spec[7], imgs[7]);
        produtos.add(item8);
        Product item9 = new Product("surface Windows Pro", "719 €", spec[8], imgs[8]);
        produtos.add(item9);


        produtosComparar.add(item1);
        produtosComparar.add(item2);

    }



}
