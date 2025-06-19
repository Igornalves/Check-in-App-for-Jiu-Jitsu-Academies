package com.qgdaluta.inteface_check_in.config;

// Importa a classe base Dialect do Hibernate
import org.hibernate.dialect.Dialect;

/**
 * Classe de dialeto customizado para uso do Hibernate com SQLite.
 * ATENÇÃO: Só deve ser usada em projetos com Hibernate 5.x.
 * No Hibernate 6.x, use o dialeto oficial: org.hibernate.community.dialect.SQLiteDialect
 */
public class SQLiteDialect extends Dialect {

    // Construtor da classe, chamado ao instanciar o dialeto
    public SQLiteDialect() {
        super(); // Chama o construtor da classe Dialect

        // Mapeia tipos SQL padrão para tipos do SQLite
        // Cada linha associa um tipo Java SQL a um tipo do SQLite
        registerColumnTypes(java.sql.Types.BIT, "integer");
        registerColumnTypes(java.sql.Types.TINYINT, "tinyint");
        registerColumnTypes(java.sql.Types.SMALLINT, "smallint");
        registerColumnTypes(java.sql.Types.INTEGER, "integer");
        registerColumnTypes(java.sql.Types.BIGINT, "bigint");
        registerColumnTypes(java.sql.Types.FLOAT, "float");
        registerColumnTypes(java.sql.Types.DOUBLE, "double");
        registerColumnTypes(java.sql.Types.NUMERIC, "numeric");
        registerColumnTypes(java.sql.Types.DECIMAL, "decimal");
    }

    // Este método NÃO deveria existir!
    // O correto é usar registerColumnType (singular), herdado da classe Dialect.
    // Aqui, ele lança uma exceção se for chamado.
    private void registerColumnTypes(int f, String string) {
        throw new UnsupportedOperationException("Unimplemented method 'registerColumnTypes'");
    }

}
