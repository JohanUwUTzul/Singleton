public class Main {
    public static void main(String[] args) {
        AppConfig config = AppConfig.getInstance();

        config.setPaginaName("papulandia.com");
        config.setAnioDecreacion(1996);
        config.setServerUrl("gatitoshot.com");
        config.setPort(6666);

        System.out.println("nombre de la web: "+config.getPaginaName());
        System.out.println("año de lanciamiento: "+config.getAnioDecreacion());
        System.out.println("URL de la pagina: " + config.getServerUrl());
        System.out.println("Numero del Puerto: " + config.getPort());
    }
}
