public class App {
    public static void main(String[] args) throws Exception {
        Macaco macacoPrego = new Macaco();
        Macaco gorila = new Macaco();

        macacoPrego.nome("Ranzinza");
        macacoPrego.comer("Banana");
        System.out.printf("O nome do macaco é %s, vamos ver o que tem no seu estomago: %s",macacoPrego.nome,macacoPrego.verBucho());
        System.out.println("");
        macacoPrego.comer("Maçã");
        System.out.printf("Ele comeu mais alguma coisa, vamos ver o que tem no seu estomago agora: %s",macacoPrego.verBucho());
        macacoPrego.comer("Uva");
        System.out.printf("Ele comeu mais alguma coisa, vamos ver o que tem no seu estomago agora: %s",macacoPrego.verBucho());
    }
}
