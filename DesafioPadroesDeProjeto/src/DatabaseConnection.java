
public class DatabaseConnection {
private static DatabaseConnection instance;
    
    // Outros atributos relacionados � conex�o do banco de dados
    private String databaseUrl;
    private String username;
    private String password;
    
    // Construtor privado para evitar a cria��o direta de objetos
    private DatabaseConnection() {
        // Configurar a conex�o do banco de dados
        this.databaseUrl = "jdbc:mysql://localhost/mydatabase";
        this.username = "user";
        this.password = "password";
    }
    
    // M�todo est�tico para obter a �nica inst�ncia da classe
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Outros m�todos relacionados � conex�o do banco de dados
    public void connect() {
        System.out.println("Conectado ao banco de dados em " + databaseUrl);
    }
    
    public void disconnect() {
        System.out.println("Desconectado do banco de dados.");
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        // Obtendo a inst�ncia �nica da conex�o de banco de dados
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        
        // Conectando ao banco de dados
        dbConnection.connect();
        
        // Fazendo opera��es no banco de dados
        
        // Desconectando do banco de dados
        dbConnection.disconnect();
    }
}
