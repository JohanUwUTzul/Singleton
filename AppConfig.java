public class AppConfig {
    private static AppConfig inst;
    private AppConfig() {

    public static synchronized AppConfig getInstance() {
        if (inst == null) {
            inst = new AppConfig();
        }
        return inst;
    }
    private int AnioDecreacion;
    private String PaginaName;
    private String serverUrl;
    private int port;
    public int getAnioDecreacion() {
        return AnioDecreacion;
    }
    public void setAnioDecreacion(int anioDecreacion) {
        AnioDecreacion = anioDecreacion;
    }
    public String getPaginaName() {
        return PaginaName;
    }
    public void setPaginaName(String paginaName) {
        PaginaName = paginaName;
    }
    public String getServerUrl() {
        return serverUrl;
    }
    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
}