package com.omdb.command;
import com.omdb.command.out.Formatter;
import com.omdb.rest.client.OMDBRestClient;
import com.omdb.rest.model.MovieRatingResponse;

public class MovieRatingCommand implements Command{
	private String[] cmdParams;
	Formatter clioutput=null;
	
	public MovieRatingCommand(String[] cmdParams,Formatter clioutput){
		this.cmdParams=cmdParams;
		this.clioutput=clioutput;
	}

	public void execute() {

		MovieRatingResponse rating=OMDBRestClient.getMovieRating(cmdParams[0]);
		clioutput.format(rating);
		
	}

	

}
