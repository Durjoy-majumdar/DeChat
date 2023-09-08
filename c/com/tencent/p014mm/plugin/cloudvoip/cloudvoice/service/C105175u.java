package com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service;

import a43.C103304c;
import a43.C103306e;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.widget.RelativeLayout;
import b43.C104034c;
import com.tencent.p014mm.plugin.voip.model.v2protocal;
import com.tencent.p014mm.plugin.voip.video.OpenGlRender;
import com.tencent.p014mm.plugin.voip.video.OpenGlView;
import com.tencent.p014mm.plugin.voip.video.camera.prev.CaptureView;
import com.tencent.p014mm.sdk.platformtools.Log;
import f43.C107474b;
import f43.C107476d;
import f43.C107479f;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import js0.C88020k;
import n11.C109669c;
import n11.C109674f;
import org.json.JSONException;
import org.json.JSONObject;
import p80.C110194c;

/* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u */
public class C105175u extends RelativeLayout implements C105130c, C104034c {

    /* renamed from: d */
    public int f312307d = 0;

    /* renamed from: e */
    public String f312308e = "";

    /* renamed from: f */
    public int f312309f = -1;

    /* renamed from: g */
    public int f312310g = 0;

    /* renamed from: h */
    public C105153k f312311h = null;

    /* renamed from: i */
    public CaptureView f312312i;

    /* renamed from: j */
    public OpenGlRender f312313j;

    /* renamed from: n */
    public OpenGlView f312314n;

    /* renamed from: o */
    public boolean f312315o;

    /* renamed from: p */
    public boolean f312316p = false;

    /* renamed from: q */
    public int f312317q = 0;

    /* renamed from: r */
    public int f312318r = 0;

    /* renamed from: s */
    public int f312319s;

    /* renamed from: t */
    public int f312320t;

    /* renamed from: com.tencent.mm.plugin.cloudvoip.cloudvoice.service.u$a */
    public class C105176a implements C107476d.C107477a {
        public C105176a() {
        }

        /* renamed from: a */
        public void mo149495a() {
            OpenGlRender openGlRender;
            C105175u uVar = C105175u.this;
            SurfaceTexture surfaceTexture = v2protocal.f317547h2;
            C110194c cVar = v2protocal.f317546g2;
            uVar.getClass();
            if (surfaceTexture == null || cVar == null) {
                Log.m105921e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture error, videoTexture:%s, videoTexture:%s", surfaceTexture, cVar);
            } else if (!uVar.f312315o || (openGlRender = uVar.f312313j) == null) {
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture failed , texId:%d,mInitDone:%b", Integer.valueOf(cVar.f329652e), Boolean.valueOf(uVar.f312315o));
            } else {
                C107479f fVar = openGlRender.f318136m;
                if (!(fVar == null || fVar.f321561b == null)) {
                    C107474b bVar = fVar.f321561b;
                    bVar.f321526e = surfaceTexture;
                    bVar.f321525d = cVar;
                }
                Log.m105925i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "setSurfaceTexture OK , videoTexture:%d", Integer.valueOf(cVar.f329652e));
            }
        }
    }

    public C105175u(Context context, C109669c cVar, int i, int i2) {
        super(context);
        this.f312319s = i;
        this.f312320t = i2;
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "anlin OpenVoiceOpenGlView: mWidth: " + this.f312319s + ", height: " + this.f312320t);
        this.f312311h = new C105153k(this.f312319s, this.f312320t);
        this.f312309f = cVar.f328293a;
        this.f312308e = cVar.f328294b;
        this.f312314n = new OpenGlView(context);
        OpenGlRender openGlRender = new OpenGlRender(this.f312314n, (OpenGlRender.C106501e) null, 0);
        this.f312313j = openGlRender;
        this.f312315o = true;
        this.f312314n.setRenderer(openGlRender);
        this.f312314n.setRenderMode(0);
        addView(this.f312314n);
        CaptureView captureView = new CaptureView(context);
        this.f312312i = captureView;
        addView(captureView, new RelativeLayout.LayoutParams(1, 1));
        this.f312312i.setVisibility(0);
        this.f312312i.setAlpha(0.0f);
    }

    /* renamed from: D */
    public /* synthetic */ void mo145645D(int i) {
    }

    /* renamed from: I */
    public void mo145646I(byte[] bArr, long j, int i, int i2, int i3, int i4, double d) {
        boolean z;
        int i5;
        int i6;
        OpenGlView openGlView;
        byte[] bArr2 = bArr;
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i15 = i4;
        int i16 = this.f312310g;
        this.f312310g = i16 + 1;
        if (i16 % 50 == 0) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "onFrameDataReady, w:" + i7 + ",h:" + i8 + ",format:" + i9 + ",len:" + bArr2.length + ",size:" + j + ",rotate:" + i15 + ",time:" + d);
        }
        C105140f1 f1Var = C105181w.INSTANCE.f312378h;
        synchronized (f1Var) {
            z = f1Var.f312170c;
        }
        if (z) {
            OpenGlRender openGlRender = this.f312313j;
            int i17 = OpenGlRender.f318118B;
            if (openGlRender.f318141r && openGlRender.f318137n != null && bArr2.length >= i7 * i8) {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                openGlRender.f318138o = bArr2;
                WeakReference<OpenGlView> weakReference = openGlRender.f318128e;
                if (!(weakReference == null || (openGlView = weakReference.get()) == null)) {
                    openGlView.mo153056b(new C103306e(openGlRender, i, i2, 0, countDownLatch));
                }
                try {
                    countDownLatch.await(2, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                }
            }
            int i18 = i9 + i15;
            C105181w wVar = C105181w.INSTANCE;
            wVar.getClass();
            wVar.mo149500g(new C105167o0(wVar, i18, i, i2, bArr));
            C105153k kVar = this.f312311h;
            if (kVar.f308666d) {
                int i19 = OpenGlRender.f318118B;
                i5 = 16;
            } else {
                i5 = 0;
            }
            if (kVar.f308667e) {
                int i25 = OpenGlRender.f318118B;
                i6 = 12;
            } else {
                int i26 = OpenGlRender.f318118B;
                i6 = 4;
            }
            this.f312313j.mo153103c(bArr, i, i2, i5 + 3 + i6, true, 3);
        }
    }

    /* renamed from: a */
    public float[] mo149494a(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("position"));
            float i = C88020k.m109558i(jSONObject2, "left", 0.0f);
            float i2 = C88020k.m109558i(jSONObject2, "top", 0.0f);
            float i3 = C88020k.m109558i(jSONObject2, "width", 0.0f);
            float i4 = C88020k.m109558i(jSONObject2, "height", 0.0f);
            int optInt = jSONObject.optInt("zIndex", 0);
            try {
                this.f312317q = (int) jSONObject2.optDouble("width", 0.0d);
                this.f312318r = (int) jSONObject2.optDouble("height", 0.0d);
            } catch (Exception unused) {
            }
            Log.m105925i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "w:%f, h:%f, logicWidth:%d, logicHeight:%d", Float.valueOf(i3), Float.valueOf(i4), Integer.valueOf(this.f312317q), Integer.valueOf(this.f312318r));
            return new float[]{i, i2, i3, i4, (float) optInt};
        } catch (Exception unused2) {
            return null;
        }
    }

    /* renamed from: c */
    public void mo145647c(int i) {
        C109674f.m148993a(i, this.f312311h.f308666d);
    }

    public int getLogicHeight() {
        int i = this.f312318r;
        return i > 0 ? i : C88020k.m109554e(getHeight());
    }

    public int getLogicWidth() {
        int i = this.f312317q;
        return i > 0 ? i : C88020k.m109554e(getWidth());
    }

    public int getMemberId() {
        return this.f312309f;
    }

    public String getOpenId() {
        return this.f312308e;
    }

    public int getViewId() {
        return this.f312307d;
    }

    /* renamed from: h */
    public void mo149436h(int i) {
        if (i != this.f312309f) {
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "updateMemberId, viewId:" + this.f312307d + ", openId:" + this.f312308e + ", memberId:[" + this.f312309f + "->" + i + "]");
            this.f312309f = i;
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
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "uint, viewId:" + this.f312307d + ", openId:" + this.f312308e + ", memberId:" + this.f312309f);
        this.f312311h.mo145981i();
        this.f312311h.getClass();
        OpenGlRender openGlRender = this.f312313j;
        WeakReference<OpenGlView> weakReference = openGlRender.f318128e;
        if (!(weakReference == null || weakReference.get() == null)) {
            OpenGlView openGlView = openGlRender.f318128e.get();
            Log.printInfoStack("OpenGlRender", "releaseSurfaceTexture:%s", openGlView);
            openGlView.mo153056b(new C103304c(openGlRender));
            Object obj = OpenGlRender.f318121E;
            synchronized (obj) {
                try {
                    obj.wait(100);
                    Log.m105924i("OpenGlRender", "releaseSurfaceTexture wait finish");
                } catch (Exception e) {
                    Log.printErrStackTrace("OpenGlRender", e, "", new Object[0]);
                }
            }
        }
        this.f312313j.mo153106g();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0081 A[Catch:{ JSONException -> 0x00bd }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo149439r(org.json.JSONObject r10) {
        /*
            r9 = this;
            java.lang.String r0 = "back"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "update, viewId:"
            r1.append(r2)
            int r2 = r9.f312307d
            r1.append(r2)
            java.lang.String r2 = ", openId:"
            r1.append(r2)
            java.lang.String r2 = r9.f312308e
            r1.append(r2)
            java.lang.String r2 = ", memberId:"
            r1.append(r2)
            int r2 = r9.f312309f
            r1.append(r2)
            java.lang.String r2 = ", data:"
            r1.append(r2)
            java.lang.String r2 = r10.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.OpenVoice.OpenVoiceOpenGlView"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            r1 = 0
            r3 = 1
            float[] r4 = r9.mo149494a(r10)     // Catch:{ JSONException -> 0x00bd }
            if (r4 == 0) goto L_0x0052
            com.tencent.mm.plugin.voip.video.OpenGlView r5 = r9.f312314n     // Catch:{ JSONException -> 0x00bd }
            android.graphics.SurfaceTexture r6 = com.tencent.p014mm.plugin.voip.model.v2protocal.f317547h2     // Catch:{ JSONException -> 0x00bd }
            r7 = 2
            r7 = r4[r7]     // Catch:{ JSONException -> 0x00bd }
            int r7 = (int) r7     // Catch:{ JSONException -> 0x00bd }
            r8 = 3
            r4 = r4[r8]     // Catch:{ JSONException -> 0x00bd }
            int r4 = (int) r4     // Catch:{ JSONException -> 0x00bd }
            r5.onSurfaceTextureSizeChanged(r6, r7, r4)     // Catch:{ JSONException -> 0x00bd }
        L_0x0052:
            java.lang.String r4 = "config"
            org.json.JSONObject r10 = r10.optJSONObject(r4)     // Catch:{ JSONException -> 0x00bd }
            if (r10 == 0) goto L_0x007c
            java.lang.String r4 = "camera"
            java.lang.String r10 = r10.optString(r4, r0)     // Catch:{ JSONException -> 0x00bd }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00bd }
            r4.<init>()     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r5 = "camera:"
            r4.append(r5)     // Catch:{ JSONException -> 0x00bd }
            r4.append(r10)     // Catch:{ JSONException -> 0x00bd }
            java.lang.String r4 = r4.toString()     // Catch:{ JSONException -> 0x00bd }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)     // Catch:{ JSONException -> 0x00bd }
            boolean r10 = r10.equals(r0)     // Catch:{ JSONException -> 0x00bd }
            if (r10 == 0) goto L_0x007c
            r10 = 0
            goto L_0x007d
        L_0x007c:
            r10 = 1
        L_0x007d:
            boolean r0 = r9.f312316p     // Catch:{ JSONException -> 0x00bd }
            if (r10 == r0) goto L_0x00c8
            r9.f312316p = r10     // Catch:{ JSONException -> 0x00bd }
            com.tencent.mm.plugin.cloudvoip.cloudvoice.service.k r10 = r9.f312311h     // Catch:{ JSONException -> 0x00bd }
            r10.mo145975a()     // Catch:{ JSONException -> 0x00bd }
            com.tencent.mm.plugin.voip.video.OpenGlRender r10 = r9.f312313j     // Catch:{ JSONException -> 0x00bd }
            boolean r0 = r10.f318141r     // Catch:{ JSONException -> 0x00bd }
            if (r0 == 0) goto L_0x00c8
            ac3.g1 r0 = r10.f318137n     // Catch:{ JSONException -> 0x00bd }
            if (r0 != 0) goto L_0x0093
            goto L_0x00c8
        L_0x0093:
            int r0 = r10.f318139p     // Catch:{ JSONException -> 0x00bd }
            if (r0 == 0) goto L_0x00c8
            int r0 = r10.f318140q     // Catch:{ JSONException -> 0x00bd }
            if (r0 != 0) goto L_0x009c
            goto L_0x00c8
        L_0x009c:
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ JSONException -> 0x00bd }
            r0.<init>(r3)     // Catch:{ JSONException -> 0x00bd }
            java.lang.ref.WeakReference<com.tencent.mm.plugin.voip.video.OpenGlView> r4 = r10.f318128e     // Catch:{ JSONException -> 0x00bd }
            if (r4 == 0) goto L_0x00b5
            java.lang.Object r4 = r4.get()     // Catch:{ JSONException -> 0x00bd }
            com.tencent.mm.plugin.voip.video.OpenGlView r4 = (com.tencent.p014mm.plugin.voip.video.OpenGlView) r4     // Catch:{ JSONException -> 0x00bd }
            if (r4 == 0) goto L_0x00b5
            a43.d r5 = new a43.d     // Catch:{ JSONException -> 0x00bd }
            r5.<init>(r10, r0)     // Catch:{ JSONException -> 0x00bd }
            r4.mo153056b(r5)     // Catch:{ JSONException -> 0x00bd }
        L_0x00b5:
            r4 = 2
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00c8 }
            r0.await(r4, r10)     // Catch:{ InterruptedException -> 0x00c8 }
            goto L_0x00c8
        L_0x00bd:
            r10 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r1] = r10
            java.lang.String r10 = "parse position error. Exception :%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r10, r0)
        L_0x00c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.cloudvoip.cloudvoice.service.C105175u.mo149439r(org.json.JSONObject):void");
    }

    /* renamed from: t */
    public /* synthetic */ void mo145649t(int i, int i2) {
    }

    /* renamed from: v */
    public void mo149440v(JSONObject jSONObject) {
        this.f312307d = jSONObject.optInt("viewId");
        this.f312316p = true;
        JSONObject optJSONObject = jSONObject.optJSONObject("config");
        if (optJSONObject != null) {
            String optString = optJSONObject.optString("camera", "back");
            Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "camera:" + optString);
            if (optString.equals("back")) {
                this.f312316p = false;
            }
        }
        this.f312311h.mo145977e(this, this.f312316p);
        C105153k kVar = this.f312311h;
        CaptureView captureView = this.f312312i;
        kVar.getClass();
        Log.m105918d("MicroMsg.Voip.CaptureRender", "bind ObservableSurfaceView");
        if (captureView != null) {
            kVar.f308675p = captureView;
            captureView.setSurfaceChangeCallback(kVar);
            kVar.f308674o = true;
        }
        this.f312311h.mo145980h();
        Log.m105924i("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "init, viewId:" + this.f312307d + ", openId:" + this.f312308e + ", memberId:" + this.f312309f + ", data:" + jSONObject.toString());
        C107476d.m145590b().f321556d = new C105176a();
        try {
            float[] a = mo149494a(jSONObject);
            if (a != null) {
                this.f312314n.mo67520f((int) a[2], (int) a[3]);
            }
        } catch (JSONException e) {
            Log.m105921e("MicroMsg.OpenVoice.OpenVoiceOpenGlView", "parse position error. Exception :%s", e);
        }
        OpenGlRender openGlRender = this.f312313j;
        openGlRender.f318125b = true;
        openGlRender.mo153109j();
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
