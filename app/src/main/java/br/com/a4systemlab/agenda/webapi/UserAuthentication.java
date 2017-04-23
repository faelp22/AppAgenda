package br.com.a4systemlab.agenda.webapi;

import br.com.a4systemlab.agenda.entity.User;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by isael on 22/04/17.
 */

public interface UserAuthentication {
    @POST("authentication")
    Call<User> login(@Body User user);
}
