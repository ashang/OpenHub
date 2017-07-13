/*
 *    Copyright 2017 ThirtyDegressRay
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.thirtydegreesray.openhub.http;

import retrofit2.Response;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created on 2017/7/13.
 *
 * @author ThirtyDegreesRay
 */

public interface AuthService {

    @POST("login/oauth/access_token")
    @Headers("Accept: application/json")
    Observable<Response<Object>> getAccessToken(
            @Query("client_id") String clientId,
            @Query("client_secret") String clientSecret,
            @Query("code") String code,
            @Query("state") String state
    );

}
