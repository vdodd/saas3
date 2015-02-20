package services;

import java.util.ArrayList;
import java.util.HashMap;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.fasterxml.jackson.databind.ObjectMapper;

import model.Song;
import command.CreateSongCommand;
import command.GetSongCommand;
import command.ListSongsCommand;
import command.UpdateSongCommand;
import command.DeleteSongCommand;
import util.Constants;

@Path("delete")
public class DelService {
	
	// Delete a song
	//@DELETE

	

}
