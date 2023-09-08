package vk0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import jk0.C87983g;
import org.json.JSONObject;

/* renamed from: vk0.o */
public class C90820o extends C87983g {
    private static final int CTRL_INDEX = 332;
    public static final String NAME = "operateCamera";

    /* renamed from: g */
    public Runnable f260765g;

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (jSONObject == null) {
            fVar.mo109647a(i, mo115109j("fail:data is null or nil"));
        } else {
            MMHandlerThread.postToMainThread(new o$$b(this, jSONObject, fVar, i));
        }
    }
}
