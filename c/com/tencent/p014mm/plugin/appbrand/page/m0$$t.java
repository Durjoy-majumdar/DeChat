package com.tencent.p014mm.plugin.appbrand.page;

import com.tencent.p014mm.sdk.platformtools.Log;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.page.m0$$t */
public class m0$$t implements m0$$y {

    /* renamed from: a */
    public boolean f244817a = false;

    /* renamed from: b */
    public boolean f244818b = false;

    /* renamed from: c */
    public boolean f244819c = false;

    /* renamed from: d */
    public final /* synthetic */ String f244820d;

    /* renamed from: e */
    public final /* synthetic */ C83817h4 f244821e;

    /* renamed from: f */
    public final /* synthetic */ long f244822f;

    /* renamed from: g */
    public final /* synthetic */ JSONObject f244823g;

    /* renamed from: h */
    public final /* synthetic */ C83849m0 f244824h;

    public m0$$t(C83849m0 m0Var, String str, C83817h4 h4Var, long j, JSONObject jSONObject) {
        this.f244824h = m0Var;
        this.f244820d = str;
        this.f244821e = h4Var;
        this.f244822f = j;
        this.f244823g = jSONObject;
    }

    /* renamed from: c */
    public void mo116241c(String str, Object obj) {
        this.f244824h.f244753x.mo116604a(this.f244822f, str, obj, false);
    }

    public void cancel() {
        this.f244818b = true;
    }

    public void proceed() {
        if (!this.f244818b) {
            C83849m0 m0Var = this.f244824h;
            if (m0Var.f244737e == null) {
                Log.m105929w("MicroMsg.AppBrandPageContainer", "attempt to proceed but destroyed, url[%s], type[%s]", this.f244820d, this.f244821e);
            } else if (!this.f244817a) {
                m0Var.mo116330A(this.f244822f, this.f244820d, this.f244821e, this.f244819c, this.f244823g);
                this.f244817a = true;
            }
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.f244819c = !z;
    }
}
