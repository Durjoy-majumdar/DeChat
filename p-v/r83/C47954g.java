package r83;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: r83.g */
public class C47954g implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C47955h f128643d;

    public C47954g(C47955h hVar) {
        this.f128643d = hVar;
    }

    public boolean onTimerExpired() {
        try {
            int currPosMs = this.f128643d.f128644a.getCurrPosMs();
            if (Math.abs(currPosMs - this.f128643d.f128646c) < 250) {
                return true;
            }
            C47955h hVar = this.f128643d;
            hVar.f128646c = currPosMs;
            JSONObject h = hVar.mo72726h();
            h.put("currentTime", hVar.f128644a.getCurrPosSec());
            hVar.mo72728j(hVar.mo72725g(4, h));
            return true;
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.JsApiVideoCallback", "OnVideoTimeUpdate e=%s", e);
        }
    }
}
