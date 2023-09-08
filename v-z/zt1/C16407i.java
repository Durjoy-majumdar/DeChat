package zt1;

import android.app.Activity;
import android.content.Intent;
import android.widget.TextView;
import com.tencent.youtu.sdkkitframework.framework.YtSDKKitFramework;
import java.util.HashMap;

/* renamed from: zt1.i */
public interface C16407i {
    /* renamed from: a */
    void mo14859a(TextView textView);

    /* renamed from: b */
    void mo14863b(TextView textView, String str);

    /* renamed from: c */
    void mo14864c(Intent intent, Activity activity);

    void onNetworkRequestEvent(String str, String str2, HashMap<String, String> hashMap, YtSDKKitFramework.IYtSDKKitNetResponseParser iYtSDKKitNetResponseParser);

    void release();

    void reset();
}
