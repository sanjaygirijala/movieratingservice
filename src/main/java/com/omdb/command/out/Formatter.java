package com.omdb.command.out;

import com.omdb.rest.model.MovieRatingResponse;

public interface Formatter {
	
	public  void format(MovieRatingResponse rating);

}
