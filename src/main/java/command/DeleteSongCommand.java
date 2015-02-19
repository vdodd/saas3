package command;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Song;
import connectionprovider.ConnectionProvider;

public class DeleteSongCommand {

	public DeleteSongCommand() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean execute(int id) {
		Song s = new Song();
		Boolean rt = false;
		try {
			Connection connection = ConnectionProvider.getConnection();
			// Statement stmt = connection.createStatement();
			PreparedStatement stmt = connection
					.prepareStatement("DELETE FROM Songs WHERE id = ?");
			stmt.setInt(1, id);
			
			//ResultSet rs = stmt.executeQuery();
			rt =stmt.execute();
			
			
			
			
		} catch (URISyntaxException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rt;
		
	}
	public static void main(String[] arg){
		
		DeleteSongCommand a = new DeleteSongCommand();
		a.execute(4);
		System.out.println("dele executed");
		
		
		
	}
	

}
