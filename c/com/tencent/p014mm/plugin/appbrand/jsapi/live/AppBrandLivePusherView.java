package com.tencent.p014mm.plugin.appbrand.jsapi.live;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.WindowManager;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82520h;
import com.tencent.p014mm.plugin.appbrand.jsapi.live.C82618a;
import com.tencent.p014mm.plugin.appbrand.utils.C84800z1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.rtmp.ITXLivePushListener;
import com.tencent.rtmp.TXLivePusher;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import fl0.C86918c;
import java.util.HashMap;
import ml0.C21511u;
import ml0.C88745a0;
import ml0.C88751d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView */
public class AppBrandLivePusherView extends TXCloudVideoView {

    /* renamed from: d */
    public C84800z1 f241755d;

    /* renamed from: e */
    public Handler f241756e = new Handler(getContext().getMainLooper());

    /* renamed from: f */
    public int f241757f = 0;

    /* renamed from: g */
    public C82615b f241758g = new C82615b();

    /* renamed from: h */
    public String f241759h = "";

    /* renamed from: i */
    public C88751d f241760i;

    /* renamed from: j */
    public ITXLivePushListener f241761j;

    /* renamed from: n */
    public C82617d f241762n;

    /* renamed from: o */
    public C82616c f241763o;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$a */
    public class C82614a implements C84800z1.C84802b {
        public C82614a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x000f, code lost:
            if (r4 != 4) goto L_0x0011;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo22146a(com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a r4, com.tencent.p014mm.plugin.appbrand.utils.C84800z1.C84801a r5) {
            /*
                r3 = this;
                int r4 = r5.ordinal()
                r5 = 3
                r0 = 2
                r1 = 1
                r2 = 0
                if (r4 == r1) goto L_0x0011
                if (r4 == r0) goto L_0x0015
                if (r4 == r5) goto L_0x0013
                r0 = 4
                if (r4 == r0) goto L_0x0016
            L_0x0011:
                r5 = 0
                goto L_0x0016
            L_0x0013:
                r5 = 2
                goto L_0x0016
            L_0x0015:
                r5 = 1
            L_0x0016:
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView r4 = com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.this
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$b r4 = r4.f241758g
                r4.f241766e = r2
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView r0 = com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.this
                android.os.Handler r0 = r0.f241756e
                r0.removeCallbacks(r4)
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView r4 = com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.this
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$b r4 = r4.f241758g
                r4.f241765d = r5
                com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView r5 = com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.this
                android.os.Handler r5 = r5.f241756e
                r0 = 250(0xfa, double:1.235E-321)
                r5.postDelayed(r4, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView.C82614a.mo22146a(com.tencent.mm.plugin.appbrand.utils.z1$a, com.tencent.mm.plugin.appbrand.utils.z1$a):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$b */
    public class C82615b implements Runnable {

        /* renamed from: d */
        public int f241765d;

        /* renamed from: e */
        public int f241766e = 0;

        public C82615b() {
        }

        public void run() {
            this.f241766e++;
            Log.m105924i("MicroMsg.AppBrandLivePusherView", "[CheckRotateTask] number=" + this.f241766e + "  senorAngle=" + this.f241765d);
            int a = AppBrandLivePusherView.this.getRotationAngle();
            if (a == this.f241765d) {
                AppBrandLivePusherView.this.mo114907c(a);
            } else if (this.f241766e < 8) {
                AppBrandLivePusherView.this.f241756e.postDelayed(this, 250);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$c */
    public interface C82616c {
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.live.AppBrandLivePusherView$d */
    public interface C82617d {
    }

    public AppBrandLivePusherView(Context context) {
        super(context);
        mo114906b(context);
    }

    /* access modifiers changed from: private */
    public int getRotationAngle() {
        return ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    /* renamed from: b */
    public final void mo114906b(Context context) {
        this.f241760i = new C88745a0(context);
        setBackgroundColor(-16777216);
        C84800z1 z1Var = new C84800z1(getContext(), new C82614a());
        this.f241755d = z1Var;
        z1Var.enable();
        mo114907c(getRotationAngle());
    }

    /* renamed from: c */
    public final boolean mo114907c(int i) {
        if (i == this.f241757f) {
            return false;
        }
        this.f241757f = i;
        Log.m105924i("MicroMsg.AppBrandLivePusherView", "orientation changed senorAngle = " + i);
        this.f241760i.mo33717i(i);
        return true;
    }

    /* renamed from: d */
    public void mo114908d(C86918c cVar, int i, String str, HashMap<String, Object> hashMap) {
        Log.m105929w("MicroMsg.AppBrandLivePusherView", "onError code:%d msg:%s", Integer.valueOf(i), str);
        C82616c cVar2 = this.f241763o;
        if (cVar2 != null) {
            C82618a.C82630j jVar = (C82618a.C82630j) cVar2;
            jVar.getClass();
            Log.m105925i("MicroMsg.JsApiInsertLivePusher", "onError, error:%s", Integer.valueOf(i));
            C82618a.C82636p pVar = new C82618a.C82636p((C82618a.C82623c) null);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("errno", cVar.f252304a);
                jSONObject.put("errCode", i);
                jSONObject.put("errMsg", Util.nullAsNil(str));
                jSONObject.put("livePusherId", jVar.f241795a);
                if (hashMap != null && !hashMap.isEmpty()) {
                    jSONObject.put("data", new JSONObject(hashMap));
                }
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.JsApiInsertLivePusher", "onError fail", e);
            }
            C82520h hVar = jVar.f241796b;
            pVar.f242407f = jSONObject.toString();
            hVar.mo109669n(pVar, (int[]) null);
        }
    }

    /* renamed from: e */
    public void mo114909e() {
        C21511u h = ((C88745a0) this.f241760i).mo21076h();
        Log.m105925i("MicroMsg.AppBrandLivePusherView", "onDestroy code:%d info:%s", Integer.valueOf(h.f60905a), h.f60906b);
        C82617d dVar = this.f241762n;
        if (dVar != null) {
            C82618a.C82627g gVar = (C82618a.C82627g) dVar;
            gVar.f241788a.mo114866q(gVar.f241789b);
            gVar.f241788a.mo114863i(gVar.f241790c);
        }
    }

    /* renamed from: f */
    public boolean mo114910f(String str, JSONObject jSONObject) {
        C21511u f = ((C88745a0) this.f241760i).mo21074f(str, jSONObject);
        Log.m105925i("MicroMsg.AppBrandLivePusherView", "onOperate code:%d info:%s", Integer.valueOf(f.f60905a), f.f60906b);
        return f.f60905a == 0;
    }

    /* renamed from: g */
    public void mo114911g(Bundle bundle) {
        C21511u e = ((C88745a0) this.f241760i).mo21073e(bundle);
        Log.m105925i("MicroMsg.AppBrandLivePusherView", "onUpdate code:%d info:%s", Integer.valueOf(e.f60905a), e.f60906b);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo114907c(getRotationAngle());
    }

    public void setAudioVolumeNotifyListener(TXLivePusher.ITXAudioVolumeEvaluationListener iTXAudioVolumeEvaluationListener) {
        ((C88745a0) this.f241760i).mo33720m(iTXAudioVolumeEvaluationListener);
    }

    public void setBGMNotifyListener(TXLivePusher.OnBGMNotify onBGMNotify) {
        ((C88745a0) this.f241760i).mo33716g(onBGMNotify);
    }

    public void setOnErrorListener(C82616c cVar) {
        this.f241763o = cVar;
    }

    public void setOnExitListener(C82617d dVar) {
        this.f241762n = dVar;
    }

    public void setOnPushEventListener(ITXLivePushListener iTXLivePushListener) {
        this.f241761j = iTXLivePushListener;
        ((C88745a0) this.f241760i).setPushListener(iTXLivePushListener);
    }

    public void setSnapshotListener(TXLivePusher.ITXSnapshotListener iTXSnapshotListener) {
        ((C88745a0) this.f241760i).mo33719k(iTXSnapshotListener);
    }

    public AppBrandLivePusherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo114906b(context);
    }
}
