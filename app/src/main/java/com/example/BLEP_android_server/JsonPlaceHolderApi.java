package com.example.BLEP_android_server;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface JsonPlaceHolderApi {

/*    @POST("posts")
    Call<Post> createPost(@Body Post post);*/

/*    @FormUrlEncoded
    @POST("Posts")
    Call<Post> createPost(
            @Field("userId") int userId,
            @Field("title") String title,
            @Field("body") String text
    );*/

    @FormUrlEncoded
    @POST("Posts")
    Call<Post> createPost(@FieldMap Map<String, Post> fields);
}
