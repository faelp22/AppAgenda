package br.com.a4systemlab.agenda.webapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by isael on 22/04/17.
 */

public interface TeteService {
    @GET("status")
    Call<TesteApi> teste();
}