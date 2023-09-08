package hn0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import hn0.C20960b;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: hn0.a */
public class C20959a implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C20960b f59400d;

    public C20959a(C20960b bVar) {
        this.f59400d = bVar;
    }

    public boolean onTimerExpired() {
        try {
            int currPosMs = this.f59400d.f59401d.getCurrPosMs();
            if (Math.abs(currPosMs - this.f59400d.f59404g) < 250) {
                return true;
            }
            JSONObject c = this.f59400d.mo32717c();
            this.f59400d.f59404g = currPosMs;
            c.put("position", new BigDecimal((((double) currPosMs) * 1.0d) / 1000.0d).setScale(3, 4).doubleValue());
            c.put("duration", this.f59400d.f59401d.getDuration());
            this.f59400d.mo32716b(new C20960b.C20970l((C20959a) null), c);
            return true;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e);
        }
    }
}
