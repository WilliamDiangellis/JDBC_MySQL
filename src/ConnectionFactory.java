import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


public class ConnectionFactory {
	
	public DataSource dataSource;
	
	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSouce = new ComboPooledDataSource();
		comboPooledDataSouce.setJdbcUrl("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");
		comboPooledDataSouce.setUser("root");
		comboPooledDataSouce.setPassword("Aluno123");
		
		comboPooledDataSouce.setMaxPoolSize(20);
		
		this.dataSource = comboPooledDataSouce;
	}
	
	public Connection recuperaConexao() throws SQLException {
		return this.dataSource.getConnection();
	}
}
