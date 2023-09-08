package ml0;

import com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView;
import com.tencent.p014mm.plugin.appbrand.utils.C84795y;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import fl0.C86921f;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ml0.k */
public class C88771k implements C84795y.C40572a {

    /* renamed from: a */
    public final /* synthetic */ JSONObject f256189a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandLivePusherView f256190b;

    /* renamed from: c */
    public final /* synthetic */ String f256191c;

    public C88771k(C88773m mVar, JSONObject jSONObject, AppBrandLivePusherView appBrandLivePusherView, String str) {
        this.f256189a = jSONObject;
        this.f256190b = appBrandLivePusherView;
        this.f256191c = str;
    }

    /* renamed from: a */
    public void mo1966a(String str) {
        if (!Util.isNullOrNil(str)) {
            String i = C86013q1.m106448i(str, false);
            Log.m105925i("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, local file path:%s, realLocalPath: %s", str, i);
            JSONObject jSONObject = this.f256189a;
            try {
                jSONObject.put("BGMFilePath", i);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, set param fail", e);
            }
            if (!this.f256190b.mo114910f("playBGM", jSONObject)) {
                Log.m105921e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, play bgm fail, url:%s", this.f256191c);
                HashMap hashMap = new HashMap();
                hashMap.put("url", this.f256191c);
                this.f256190b.mo114908d(C86921f.f252339m, 10003, "download file fail", hashMap);
                return;
            }
            return;
        }
        Log.m105921e("MicroMsg.JsApiOperateLivePusher", "operatePlayBgm, download file fail, url:%s", this.f256191c);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("url", this.f256191c);
        this.f256190b.mo114908d(C86921f.f252339m, 10003, "download file fail", hashMap2);
    }
}
