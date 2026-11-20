package db;

//Excessão personalizada de integridade referencial.
public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String message) {

        super(message);
    }
}
