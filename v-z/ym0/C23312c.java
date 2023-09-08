package ym0;

import com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import hn0.C20959a;
import hn0.C20960b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ym0.c */
public class C23312c implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ AppBrandVideoView f67029d;

    public C23312c(AppBrandVideoView appBrandVideoView) {
        this.f67029d = appBrandVideoView;
    }

    public boolean onTimerExpired() {
        int cacheTimeSec = this.f67029d.getCacheTimeSec();
        int duration = this.f67029d.getDuration();
        if (duration != 0) {
            int i = (int) ((((float) cacheTimeSec) * 100.0f) / ((float) duration));
            AppBrandVideoView appBrandVideoView = this.f67029d;
            if (i != appBrandVideoView.f49513U0) {
                appBrandVideoView.f49513U0 = i;
                C20960b bVar = appBrandVideoView.f49491C;
                if (bVar != null) {
                    bVar.getClass();
                    try {
                        Log.m105925i("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate, percent:%d, duration:%s", Integer.valueOf(i), Integer.valueOf(duration));
                        JSONObject c = bVar.mo32717c();
                        c.put("buffered", i);
                        c.put("duration", duration);
                        bVar.mo32716b(new C20960b.C20969i((C20959a) null), c);
                    } catch (JSONException e) {
                        Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoCacheUpdate e=%s", e);
                    }
                }
            }
        }
        return true;
    }
}
