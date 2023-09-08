package com.tencent.p014mm.plugin.appbrand.jsapi.video;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.C17978c;
import com.tencent.p014mm.plugin.appbrand.jsapi.video.event.AppBrandVideoPlayEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import hn0.C20959a;
import hn0.C20960b;
import on0.C21797a;
import org.json.JSONException;
import org.json.JSONObject;
import ym0.C23312c;
import ym0.C91516n;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.video.b */
public class C17977b implements C17978c.C17981c {

    /* renamed from: d */
    public final /* synthetic */ AppBrandVideoView f49578d;

    public C17977b(AppBrandVideoView appBrandVideoView) {
        this.f49578d = appBrandVideoView;
    }

    /* renamed from: F */
    public void mo22290F(String str, String str2) {
        AppBrandVideoView appBrandVideoView = this.f49578d;
        appBrandVideoView.f49514V = false;
        appBrandVideoView.f49524i.mo22335A();
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22290F(str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0188 A[SYNTHETIC, Splitter:B:22:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo22291L(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.Video.AppBrandVideoView"
            java.lang.String r1 = "onVideoEnded"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            int r1 = com.tencent.p014mm.plugin.appbrand.jsapi.video.AppBrandVideoView.f49488Y0
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f49511T0
            if (r0 == 0) goto L_0x0012
            r0.stopTimer()
        L_0x0012:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.widget.TextView r0 = r0.f49522g
            r1 = 8
            r0.setVisibility(r1)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r0 = r0.f49524i
            r2 = 0
            r0.setIsPlay(r2)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r0 = r0.f49524i
            boolean r0 = r0.mo22343q()
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r0 = r0.f49524i
            boolean r0 = r0.mo22369x()
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            com.tencent.mm.plugin.appbrand.jsapi.video.c$a r0 = r0.f49524i
            r0.hide()
        L_0x003e:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.widget.FrameLayout r0 = r0.f49536w
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x004f
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.widget.FrameLayout r0 = r0.f49536w
            r0.setVisibility(r1)
        L_0x004f:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            boolean r0 = r0.mo22233n()
            if (r0 != 0) goto L_0x00fa
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            boolean r3 = r0.f49506R
            if (r3 != 0) goto L_0x005f
            goto L_0x00fa
        L_0x005f:
            int r1 = r0.f49499K
            if (r1 > 0) goto L_0x0072
            android.widget.TextView r1 = r0.f49527o
            com.tencent.mm.plugin.appbrand.jsapi.video.c r3 = r0.f49521f
            int r3 = r3.getVideoDurationSec()
            java.lang.String r0 = r0.mo22227h(r3)
            r1.setText(r0)
        L_0x0072:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.view.View r0 = r0.f49526n
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r4 = r1.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r6 = "onVideoEnded"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r5 = "onVideoEnded"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.view.View r0 = r0.f49525j
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r3)
            java.lang.Object[] r4 = r1.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r6 = "onVideoEnded"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r5 = "onVideoEnded"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0181
        L_0x00fa:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.view.View r0 = r0.f49526n
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r6 = "onVideoEnded"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r11.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.setVisibility(r3)
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r5 = "onVideoEnded"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            r3 = r0
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            android.view.View r0 = r0.f49525j
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.mo10233c(r1)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r6 = "onVideoEnded"
            java.lang.String r7 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r3 = r0
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r11.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.setVisibility(r1)
            java.lang.String r4 = "com/tencent/mm/plugin/appbrand/jsapi/video/AppBrandVideoView$5"
            java.lang.String r5 = "onVideoEnded"
            java.lang.String r6 = "(Ljava/lang/String;Ljava/lang/String;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setVisibility"
            java.lang.String r9 = "(I)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x0181:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            hn0.b r0 = r0.f49491C
            r1 = 1
            if (r0 == 0) goto L_0x01a9
            hn0.b$c r3 = new hn0.b$c     // Catch:{ JSONException -> 0x0196 }
            r4 = 0
            r3.<init>(r4)     // Catch:{ JSONException -> 0x0196 }
            org.json.JSONObject r4 = r0.mo32717c()     // Catch:{ JSONException -> 0x0196 }
            r0.mo32716b(r3, r4)     // Catch:{ JSONException -> 0x0196 }
            goto L_0x01a2
        L_0x0196:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r4[r2] = r3
            java.lang.String r2 = "MicroMsg.Video.JsApiVideoCallback"
            java.lang.String r3 = "OnVideoEnded e=%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r3, r4)
        L_0x01a2:
            com.tencent.mm.sdk.platformtools.MTimerHandler r0 = r0.f59403f
            if (r0 == 0) goto L_0x01a9
            r0.stopTimer()
        L_0x01a9:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            boolean r2 = r0.f49497I
            if (r2 == 0) goto L_0x01b4
            r2 = 0
            r0.mo22239s(r2, r1)
        L_0x01b4:
            com.tencent.mm.plugin.appbrand.jsapi.video.AppBrandVideoView r0 = r12.f49578d
            com.tencent.mm.plugin.appbrand.jsapi.video.c$c r0 = r0.f49517W0
            if (r0 == 0) goto L_0x01bd
            r0.mo22291L(r13, r14)
        L_0x01bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.video.C17977b.mo22291L(java.lang.String, java.lang.String):void");
    }

    /* renamed from: T */
    public void mo22292T(String str, String str2, String str3, int i, int i2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onError errorMsg=%s what=%d extra=%d", str3, Integer.valueOf(i), Integer.valueOf(i2));
        C20960b bVar = this.f49578d.f49491C;
        if (bVar != null) {
            bVar.f59402e.mo114867r(bVar);
            MTimerHandler mTimerHandler = bVar.f59403f;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
            try {
                JSONObject c = bVar.mo32717c();
                c.put("errMsg", str3);
                bVar.mo32716b(new C20960b.C20964d((C20959a) null), c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onError e=%s", e);
            }
        }
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22292T(str, str2, str3, i, i2);
        }
    }

    /* renamed from: Z */
    public void mo22293Z(String str, String str2) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onPrepared");
        AppBrandVideoView appBrandVideoView = this.f49578d;
        appBrandVideoView.f49513U0 = 0;
        if (appBrandVideoView.f49511T0 == null) {
            appBrandVideoView.f49511T0 = new MTimerHandler(new C23312c(appBrandVideoView), true);
        }
        appBrandVideoView.f49511T0.startTimer(500);
        AppBrandVideoView appBrandVideoView2 = this.f49578d;
        appBrandVideoView2.f49507R0 = true;
        if (appBrandVideoView2.f49509S0) {
            appBrandVideoView2.mo22277w();
        }
        AppBrandVideoView appBrandVideoView3 = this.f49578d;
        C21797a aVar = appBrandVideoView3.f49494F;
        aVar.f61789i = -1;
        aVar.f61790j = 0;
        aVar.f61788h = 0.0f;
        C20960b bVar = appBrandVideoView3.f49491C;
        if (bVar != null) {
            bVar.getClass();
        }
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22293Z(str, str2);
        }
    }

    /* renamed from: a0 */
    public void mo22295a0(String str, String str2) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onVideoPause");
        C20960b bVar = this.f49578d.f49491C;
        if (bVar != null) {
            try {
                bVar.mo32716b(new C20960b.C20967g((C20959a) null), bVar.mo32717c());
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPause e=%s", e);
            }
            MTimerHandler mTimerHandler = bVar.f59403f;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
            }
        }
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22295a0(str, str2);
        }
    }

    /* renamed from: l0 */
    public void mo22311l0(String str, String str2, int i, int i2) {
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onGetVideoSize width=%d height=%d", Integer.valueOf(i), Integer.valueOf(i2));
        AppBrandVideoView appBrandVideoView = this.f49578d;
        if (appBrandVideoView.f49519d == -1) {
            int i3 = i < i2 ? 0 : 90;
            appBrandVideoView.f49519d = i3;
            Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onGetVideoSize adjust direction from AUTO to %s", Integer.valueOf(i3));
        }
        AppBrandVideoView appBrandVideoView2 = this.f49578d;
        C20960b bVar = appBrandVideoView2.f49491C;
        if (bVar != null) {
            int duration = appBrandVideoView2.getDuration();
            bVar.getClass();
            try {
                Log.m105925i("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData, width:%d, height:%d, duration:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(duration));
                JSONObject c = bVar.mo32717c();
                c.put("width", i);
                c.put("height", i2);
                c.put("duration", (((double) duration) * 1.0d) / 1000.0d);
                bVar.mo32716b(new C20960b.C20966f((C20959a) null), c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoLoadedMetaData e=%s", e);
            }
        }
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22311l0(str, str2, i, i2);
        }
    }

    /* renamed from: m0 */
    public void mo22312m0(String str, String str2) {
        AppBrandVideoView appBrandVideoView = this.f49578d;
        int i = AppBrandVideoView.f49488Y0;
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "onVideoPlay, isLive:%b", Boolean.valueOf(appBrandVideoView.mo22233n()));
        AppBrandVideoView appBrandVideoView2 = this.f49578d;
        if (appBrandVideoView2.f49499K <= 0 && !appBrandVideoView2.mo22233n()) {
            AppBrandVideoView appBrandVideoView3 = this.f49578d;
            appBrandVideoView3.f49527o.setText(appBrandVideoView3.mo22227h(appBrandVideoView3.f49521f.getVideoDurationSec()));
        }
        AppBrandVideoView appBrandVideoView4 = this.f49578d;
        boolean n = appBrandVideoView4.mo22233n();
        appBrandVideoView4.getClass();
        Log.m105925i("MicroMsg.Video.AppBrandVideoView", "updateLiveUI isLive:%b", Boolean.valueOf(n));
        appBrandVideoView4.f49524i.setShowProgress((appBrandVideoView4.f49503P || appBrandVideoView4.f49504Q) && !n);
        AppBrandVideoView appBrandVideoView5 = this.f49578d;
        if (appBrandVideoView5.f49490B) {
            AppBrandVideoView.m18397a(appBrandVideoView5);
        }
        C20960b bVar = this.f49578d.f49491C;
        if (bVar != null) {
            bVar.getClass();
            try {
                bVar.f59404g = 0;
                JSONObject c = bVar.mo32717c();
                c.put("timeStamp", System.currentTimeMillis());
                bVar.mo32716b(new C20960b.C20968h((C20959a) null), c);
                if (bVar.f59403f == null) {
                    bVar.f59403f = new MTimerHandler(new C20959a(bVar), true);
                }
                bVar.f59403f.startTimer(250);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "OnVideoPlay e=%s", e);
            }
        }
        C82381f fVar = this.f49578d.f49541z;
        if (fVar != null && C91516n.m114822a(fVar.getAppId())) {
            Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onVideoPlay, send play event");
            new AppBrandVideoPlayEvent().publish();
        }
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22312m0(str, str2);
        }
    }

    /* renamed from: n0 */
    public void mo22313n0(String str, String str2) {
        Log.m105924i("MicroMsg.Video.AppBrandVideoView", "onVideoWaiting");
        C20960b bVar = this.f49578d.f49491C;
        if (bVar != null) {
            bVar.getClass();
            try {
                JSONObject c = bVar.mo32717c();
                c.put("timeStamp", System.currentTimeMillis());
                bVar.mo32716b(new C20960b.C20971m((C20959a) null), c);
            } catch (JSONException e) {
                Log.m105921e("MicroMsg.Video.JsApiVideoCallback", "onVideoWaiting e=%s", e);
            }
        }
        AppBrandVideoView appBrandVideoView = this.f49578d;
        appBrandVideoView.f49514V = true;
        appBrandVideoView.mo22228i();
        C17978c.C17981c cVar = this.f49578d.f49517W0;
        if (cVar != null) {
            cVar.mo22313n0(str, str2);
        }
    }
}
