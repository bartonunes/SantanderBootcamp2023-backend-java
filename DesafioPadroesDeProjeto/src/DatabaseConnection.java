
public class DatabaseConnection {
private static DatabaseConnection instance;
    
    // Outros atributos relacionados à conexão do banco de dados
    private String databaseUrl;
    private String username;
    private String password;
    
    // Construtor privado para evitar a criação direta de objetos
    private DatabaseConnection() {
        // Configurar a conexão do banco de dados
        this.databaseUrl = "jdbc:mysql://localhost/mydatabase";
        this.username = "user";
        this.password = "password";
    }
    
    // Método estático para obter a única instância da classe
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    // Outros métodos relacionados à conexão do banco de dados
    public void connect() {
        System.out.println("Conectado ao banco de dados em " + databaseUrl);
    }
    
    public void disconnect() {
        System.out.println("Desconectado do banco de dados.");
    }
    
    // Exemplo de uso
    public static void main(String[] args) {
        // Obtendo a instância única da conexão de banco de dados
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();
        
        // Conectando ao banco de dados
        dbConnection.connect();
        
        // Fazendo operações no banco de dados
        
        // Desconectando do banco de dados
        dbConnection.disconnect();
    }
}
