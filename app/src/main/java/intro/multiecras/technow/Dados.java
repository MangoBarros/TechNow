package intro.multiecras.technow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import intro.multiecras.technow.Fragments.EncomendaObj;
import intro.multiecras.technow.Objetos.Morada;
import intro.multiecras.technow.Objetos.Product;

public class Dados {





    public static final int[] imgs = {
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

    public static HashMap<Product,Integer> cart = new HashMap<>() ;







    public static final String[] spec = {
                    "Smartphone Dual SIM\n" +
                    "Android 9.0 Pie\n" +
                    "Ecrã - 6,7 ''"
                    ,
            " Smartphone Dual SIM\n" +
                    "Android 9.0 Pie\n" +
                    "Operador - Livre\n" +
                    "3G HSDPA 850, 900, 1700\n" +
                    "4G LTE\n" +
                    " Ecrã - 6,4 ''\n" +
                    "Dynamic AMOLED Quad HD+ ",
            "Tipo Telemóvel Smartphone iOS\n" +
                    "Sistema Operativo iOS\n" +
                    "Operador Livre\n" +
                    "Comunicações 2G GSM\n" +
                    "3G HSDPA\n" +
                    "4G LTE\n" +
                    "Wi-Fi 802.11a/b/g/n/ac\n" +
                    "Bluetooth 4.2\n" +
                    "Dimensão do Ecrã 4,7 ''\n" +
                    "Resolução do Ecrã 1334 x 750 px\n" +
                    "Tipo de Ecrã Retina HD Display\n" +
                    "LED IPS tátil capacitivo com multi-touch\n" +
                    "Vidro resistente com revestimento oleofóbico resistente a dedadas ",
            "fewef",
            "É",
            "É",
            "É",
            "É",
            "É"

    };
    private static final Product[] prodArr = {
        new Product("Samsung", 419 , Dados.spec[0], Dados.imgs[0]),
        new Product("Samsung2", 919 , Dados.spec[1], Dados.imgs[1]),
        new Product("Apple 6s", 3419, Dados.spec[2], Dados.imgs[2]),
        new Product("Apple MacBook 13", 1200, Dados.spec[3], Dados.imgs[3]),
        new Product("Huawei", 819 , Dados.spec[4], Dados.imgs[4]),
        new Product("SmartWatch", 219 , Dados.spec[5], Dados.imgs[5]),
        new Product("Mac Pro", 1419 , Dados.spec[6], Dados.imgs[6]),
        new Product("surface Windows", 219 , Dados.spec[7], Dados.imgs[7]),
        new Product("surface Windows Pro", 719, Dados.spec[8], Dados.imgs[8])
    };
    public static final List<Product> produtos = new ArrayList<>(Arrays.asList(prodArr));
    public static final List<Product> produtosComparar = new ArrayList<>();
    private static final Morada[] moradas_arr = {
            new Morada("Rua do Caçamba","Viana do Castilho",10),
            new Morada("Rua do Macaco Voador","Porta",311),

    };
    public static final List<Morada> moradas = new ArrayList<>(Arrays.asList(moradas_arr));
    public static final List<EncomendaObj> encomendas = new ArrayList<>();



}

