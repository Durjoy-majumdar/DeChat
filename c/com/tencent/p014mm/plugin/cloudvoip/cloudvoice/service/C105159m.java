package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import android.content.Context;
import b43.C104034c;
import com.tencent.p014mm.plugin.voip.video.camera.prev.CaptureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import n11.C109669c;
import n11.C109674f;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.m */
public class C105159m extends CaptureView implements C105130c, C104034c {

    /* renamed from: h */
    public int f312266h = 0;

    /* renamed from: i */
    public String f312267i = "";

    /* renamed from: j */
    public int f312268j = -1;

    /* renamed from: n */
    public int f312269n = 0;

    /* renamed from: o */
    public C105153k f312270o = null;

    /* renamed from: p */
    public int f312271p;

    /* renamed from: q */
    public int f312272q;

    public C105159m(Context context, C109669c cVar, int i, int i2) {
        super(context);
        this.f312271p = i;
        this.f312272q = i2;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "anlin OpenVoiceCameraView: mWidth: " + this.f312271p + ", height: " + this.f312272q);
        this.f312270o = new C105153k(this.f312271p, this.f312272q);
        this.f312268j = cVar.f328293a;
        this.f312267i = cVar.f328294b;
    }

    /* renamed from: D */
    public /* synthetic */ void mo145645D(int i) {
    }

    /* renamed from: I */
    public void mo145646I(byte[] bArr, long j, int i, int i2, int i3, int i4, double d) {
        boolean z;
        int i5 = this.f312269n;
        this.f312269n = i5 + 1;
        if (i5 % 50 == 0) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "onFrameDataReady, w:" + i + ",h:" + i2 + ",format:" + i3 + ",len:" + bArr.length + ",size:" + j + ",rotate:" + i4 + ",time:" + d);
        }
        C105181w wVar = C105181w.INSTANCE;
        C105140f1 f1Var = wVar.f312378h;
        synchronized (f1Var) {
            z = f1Var.f312170c;
        }
        if (z) {
            wVar.mo149500g(new C105167o0(wVar, i3 + i4, i, i2, bArr));
        }
    }

    /* renamed from: c */
    public void mo145647c(int i) {
        C109674f.m148993a(i, this.f312270o.f308666d);
    }

    public int getLogicHeight() {
        return getHeight();
    }

    public int getLogicWidth() {
        return getWidth();
    }

    public int getMemberId() {
        return this.f312268j;
    }

    public String getOpenId() {
        return this.f312267i;
    }

    public int getViewId() {
        return this.f312266h;
    }

    /* renamed from: h */
    public void mo149436h(int i) {
        if (i != this.f312268j) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "updateMemberId, viewId:" + this.f312266h + ", openId:" + this.f312267i + ", memberId:[" + this.f312268j + "->" + i + "]");
            this.f312268j = i;
        }
    }

    /* renamed from: k */
    public /* synthetic */ void mo145648k() {
    }

    /* renamed from: l */
    public boolean mo149437l() {
        return true;
    }

    /* renamed from: p */
    public void mo149438p() {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "uint, viewId:" + this.f312266h + ", openId:" + this.f312267i + ", memberId:" + this.f312268j);
        this.f312270o.mo145981i();
        this.f312270o.getClass();
    }

    /* renamed from: r */
    public void mo149439r(JSONObject jSONObject) {
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "update, viewId:" + this.f312266h + ", openId:" + this.f312267i + ", memberId:" + this.f312268j + ", data:" + jSONObject.toString());
        mo149438p();
        mo149440v(jSONObject);
    }

    /* renamed from: t */
    public /* synthetic */ void mo145649t(int i, int i2) {
    }

    /* renamed from: v */
    public void mo149440v(JSONObject jSONObject) {
        boolean z;
        this.f312266h = jSONObject.optInt("viewId");
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("camera", "back");
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "camera:" + optString);
            if (optString.equals("back")) {
                z = false;
                this.f312270o.mo145977e(this, z);
                C105153k kVar = this.f312270o;
                kVar.getClass();
                Log.m105918d("MicroMsg.Voip.CaptureRender", "bind ObservableSurfaceView");
                kVar.f308675p = this;
                setSurfaceChangeCallback(kVar);
                kVar.f308674o = true;
                this.f312270o.mo145980h();
                Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f312266h + ", openId:" + this.f312267i + ", memberId:" + this.f312268j + ", data:" + jSONObject.toString());
            }
        }
        z = true;
        this.f312270o.mo145977e(this, z);
        C105153k kVar2 = this.f312270o;
        kVar2.getClass();
        Log.m105918d("MicroMsg.Voip.CaptureRender", "bind ObservableSurfaceView");
        kVar2.f308675p = this;
        setSurfaceChangeCallback(kVar2);
        kVar2.f308674o = true;
        this.f312270o.mo145980h();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceCameraView", "init, viewId:" + this.f312266h + ", openId:" + this.f312267i + ", memberId:" + this.f312268j + ", data:" + jSONObject.toString());
    }

    /* renamed from: w */
    public boolean mo149441w() {
        return false;
    }

    /* renamed from: y */
    public boolean mo149442y() {
        return false;
    }
}
