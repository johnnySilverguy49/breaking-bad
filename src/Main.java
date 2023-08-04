public class Main {
    public static void main(String[] args) {
        //Jesse se tornou um objeto, ele existe
        Jesse jesse = new Jesse();

        //Abaixo estamos editando os dados do Jesse
        jesse.setNome("Jesse");
        jesse.setBurrice("Burrão");
        jesse.setCarisma("Tem bastante carisma");
        jesse.setIdade(26);
        jesse.setTalentoEmFazerCristal("96.2% puro");

        //Abaixo estamos usando o comando System.out.println pra mostrar os dados do Jesse na tela
        System.out.println("Seu nome é: " + jesse.getNome());
        System.out.println("Burrice: "+ jesse.getBurrice());
        System.out.println("Carisma:" + jesse.getCarisma());
        System.out.println("Idade:" + jesse.getIdade());
        System.out.println("Cristal:"+ jesse.getTalentoEmFazerCristal());
        System.out.println("");
        WalterWhite walterWhite = new WalterWhite();
        walterWhite.setNome("WalterWhite");
        walterWhite.setInteligencia("250");
        walterWhite.setCarisma("1000");
        walterWhite.setIdade(50);
        walterWhite.setManipulacao("400");
        walterWhite.setTalentoEmFazerCristal("900");

        System.out.println("Seu nome é: "+ walterWhite.getNome());
        System.out.println("Sua inteligencia é "+ walterWhite.getInteligencia());
        System.out.println("Sua idade é " + walterWhite.getIdade());
        System.out.println("Seu talento pra fazer cristal é "+walterWhite.getTalentoEmFazerCristal());
        System.out.println("Seu carisma é "+walterWhite.getCarisma());
        System.out.println("");
        JaneMargolis janeMargolis = new JaneMargolis();
        janeMargolis.setIdade("24");
        janeMargolis.setNamoradaPerfeita("ela e nota dez ");
        janeMargolis.setFumante("fuma pra caramba ");
        janeMargolis.setCarisma("8000 ");
        janeMargolis.setNome("jane ");
        System.out.println("seu nome é " + janeMargolis.getNome());
        System.out.println("sua namorada perfeita " + janeMargolis.getNamoradaPerfeita());
        System.out.println("Sua idade é "+ janeMargolis.getIdade());
        System.out.println("seu carisma é de  " + janeMargolis.getCarisma());
        System.out.println("");
        MikeHermantraut mikeHermantraut = new MikeHermantraut();
        mikeHermantraut.setInteligencia("240.00 ");
        mikeHermantraut.setNome("mike hermantraut ");
        mikeHermantraut.setPerspicacia("muito alta ");
        System.out.println("seu nome é  " + mikeHermantraut.getNome());
        System.out.println("sua inteligencia é " + mikeHermantraut.getInteligencia());
        System.out.println("sua perspicacia é " + mikeHermantraut.getPerspicacia());



    }
}