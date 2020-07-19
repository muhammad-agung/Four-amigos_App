package sg.edu.rp.c346.id18004536.fouramigos.Fragments;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import sg.edu.rp.c346.id18004536.fouramigos.Notifications.MyResponse;
import sg.edu.rp.c346.id18004536.fouramigos.Notifications.Sender;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA8lNXMSk:APA91bF3bPsUrh01v8uNuEwI4t8Z-fsIbqApBwWm6doVln36xFkUq0gnZAXMX3KO1yW1HNQksSamVOuT-q4Pp2uztgwYLgHRGv4rI4btDmyDbHnejYRrd12xenEnpIT55GSVFzeEwFo3"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}