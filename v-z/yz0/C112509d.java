package yz0;

import a01.C103219b;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import c30.C104289g;
import com.tencent.p014mm.app.AppForegroundDelegate;
import com.tencent.p014mm.app.C114668z;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.autogen.events.ScreenCastEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.cast.service.ScreenCastForegroundService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86301e;
import e01.C107075a;
import ei3.C86522b;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import rx3.C13598b0;
import sx3.C110818d0;
import z04.C112550d0;
import z04.C66731x;
import zt3.C119157j;
import zt3.C119179t;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: yz0.d */
public final class C112509d extends C86301e implements C39289c {

    /* renamed from: e */
    public static C107075a f336921e;

    /* renamed from: d */
    public final C112511b f336922d = new C112511b(this);

    /* renamed from: yz0.d$a */
    public static final class C112510a {
        public C112510a(C8480h hVar) {
        }
    }

    /* renamed from: yz0.d$b */
    public static final class C112511b implements C114668z {

        /* renamed from: d */
        public final /* synthetic */ C112509d f336923d;

        /* renamed from: yz0.d$b$a */
        public static final class C112512a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112509d f336924d;

            public C112512a(C112509d dVar) {
                this.f336924d = dVar;
            }

            public final void run() {
                if (this.f336924d.xx0()) {
                    ScreenCastEvent screenCastEvent = new ScreenCastEvent();
                    screenCastEvent.f9475d.f9476a = true;
                    screenCastEvent.publish();
                    return;
                }
                ScreenCastEvent screenCastEvent2 = new ScreenCastEvent();
                screenCastEvent2.f9475d.f9476a = false;
                screenCastEvent2.publish();
                this.f336924d.vx0();
            }
        }

        /* renamed from: yz0.d$b$b */
        public static final class C112513b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C112509d f336925d;

            public C112513b(C112509d dVar) {
                this.f336925d = dVar;
            }

            public final void run() {
                if (this.f336925d.xx0()) {
                    ScreenCastEvent screenCastEvent = new ScreenCastEvent();
                    screenCastEvent.f9475d.f9476a = true;
                    screenCastEvent.publish();
                    return;
                }
                ScreenCastEvent screenCastEvent2 = new ScreenCastEvent();
                screenCastEvent2.f9475d.f9476a = false;
                screenCastEvent2.publish();
                this.f336925d.vx0();
            }
        }

        public C112511b(C112509d dVar) {
            this.f336923d = dVar;
        }

        public void onAppBackground(String str) {
            Log.m105924i("MicroMsg.PluginCast", "onAppBackground " + this.f336923d.xx0());
            C119179t tVar = C119157j.f356862d;
            C112512a aVar = new C112512a(this.f336923d);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(aVar, 2000, false);
        }

        public void onAppForeground(String str) {
            Log.m105924i("MicroMsg.PluginCast", "onAppForeground " + this.f336923d.xx0());
            C119179t tVar = C119157j.f356862d;
            C112513b bVar = new C112513b(this.f336923d);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(bVar, 2000, false);
        }
    }

    static {
        new C112510a((C8480h) null);
    }

    public void onAccountInitialized(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.PluginCast", "happened account release");
        AppForegroundDelegate.INSTANCE.mo174208a(this.f336922d);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.PluginCast", "happened account release");
        vx0();
        AppForegroundDelegate.INSTANCE.mo174215k(this.f336922d);
    }

    public void vx0() {
        MMApplicationContext.getContext().stopService(new Intent(MMApplicationContext.getContext(), ScreenCastForegroundService.class));
        if (f336921e == null) {
            f336921e = new C107075a();
        }
        C107075a aVar = f336921e;
        if (aVar != null) {
            aVar.mo157529b();
        }
    }

    public final C103219b wx0(Intent intent) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        Intent intent2 = intent;
        C87412m.m108594g(intent2, "intent");
        C103219b bVar = new C103219b();
        String stringExtra = intent2.getStringExtra("remoteConfig");
        if (stringExtra != null) {
            try {
                C104289g gVar = new C104289g(stringExtra);
                bVar.f327161d = gVar.optInt("VideoBitRate") * 1000;
                bVar.f304418o = gVar.optString(TPReportKeys.PlayerStep.PLAYER_CGI_PROXY_IP);
                bVar.f304419p = Integer.valueOf(gVar.optInt("port"));
                String optString = gVar.optString("CanvasDirection");
                C87412m.m108593f(optString, "json.optString(REMOTE_CONDIF_PC_CANVAS_DIRECTION)");
                Integer e = C66731x.m78731e(optString);
                if (e != null) {
                    bVar.f304423t = e.intValue();
                }
                String optString2 = gVar.optString("VideoSolution");
                C87412m.m108593f(optString2, LocaleUtil.ITALIAN);
                List U = C112550d0.m153785U(optString2, new String[]{"*"}, false, 0, 6, (Object) null);
                Integer e2 = C66731x.m78731e((String) C110818d0.m150914L(U));
                int intValue = e2 != null ? e2.intValue() : 0;
                Integer e3 = C66731x.m78731e((String) C110818d0.m150923U(U));
                int intValue2 = e3 != null ? e3.intValue() : 0;
                if (intValue == 0 || intValue2 == 0) {
                    Point h = C85875k4.m106184h(MMApplicationContext.getContext());
                    if (bVar.f304423t == 0) {
                        int i = h.y;
                        bVar.f327160c = (h.x / 16) * 16;
                        bVar.f327159b = (i / 16) * 16;
                        Log.m105924i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h.x + " amd " + h.y);
                    } else {
                        int i2 = h.x;
                        bVar.f327160c = (h.y / 16) * 16;
                        bVar.f327159b = (i2 / 16) * 16;
                    }
                } else {
                    Point h2 = C85875k4.m106184h(MMApplicationContext.getContext());
                    if (intValue > intValue2) {
                        int i3 = h2.x;
                        int i4 = h2.y;
                        h2.x = i4;
                        h2.y = i3;
                        if (i4 > i3) {
                            f = (float) intValue;
                            f2 = ((float) i3) / (((float) i4) / f);
                            Log.m105924i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h2.x + " amd " + h2.y + " and resule is " + f + " * " + f2);
                            bVar.f327160c = (((int) f2) / 16) * 16;
                            bVar.f327159b = (((int) f) / 16) * 16;
                        } else {
                            f3 = (float) intValue;
                            f5 = ((float) i3) / f3;
                            f4 = (float) i4;
                        }
                    } else {
                        int i5 = h2.x;
                        int i6 = h2.y;
                        if (i5 > i6) {
                            f3 = (float) intValue;
                            f4 = ((float) i6) / f3;
                            f5 = (float) i5;
                        } else {
                            f = (float) intValue2;
                            f2 = (((float) i5) / f) * ((float) i6);
                            Log.m105924i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h2.x + " amd " + h2.y + " and resule is " + f + " * " + f2);
                            bVar.f327160c = (((int) f2) / 16) * 16;
                            bVar.f327159b = (((int) f) / 16) * 16;
                        }
                    }
                    float f6 = f3;
                    f = f5 * f4;
                    f2 = f6;
                    Log.m105924i("MicroMsg.PluginCast", "width is " + intValue + " and height is " + intValue2 + " and screen size is" + h2.x + " amd " + h2.y + " and resule is " + f + " * " + f2);
                    bVar.f327160c = (((int) f2) / 16) * 16;
                    bVar.f327159b = (((int) f) / 16) * 16;
                }
                String optString3 = gVar.optString("VideoFrameRate");
                C87412m.m108593f(optString3, "json.optString(REMOTE_CONFIG_VIDEO_FRAME)");
                Integer e4 = C66731x.m78731e(optString3);
                if (e4 != null) {
                    bVar.f327162e = e4.intValue();
                }
                String optString4 = gVar.optString("VideoIFrameInterval");
                C87412m.m108593f(optString4, "json.optString(REMOTE_CO…G_VIDEO_I_FRAME_INTERVAL)");
                Integer e5 = C66731x.m78731e(optString4);
                if (e5 != null) {
                    bVar.f327164g = e5.intValue();
                }
                String optString5 = gVar.optString("AudioRecordUseAndroidMic");
                C87412m.m108593f(optString5, "json.optString(REMOTE_CO…AUDIO_USE_ANDROID_RECORD)");
                Integer e6 = C66731x.m78731e(optString5);
                if (e6 != null) {
                    boolean z = true;
                    if (e6.intValue() != 1) {
                        z = false;
                    }
                    bVar.f304420q.f76741a = z;
                }
                String optString6 = gVar.optString("AudioSampleRate");
                C87412m.m108593f(optString6, "json.optString(REMOTE_CONFIG_AUDIO_SAMPLERATE)");
                Integer e7 = C66731x.m78731e(optString6);
                if (e7 != null) {
                    bVar.f304420q.f76742b = e7.intValue();
                }
                String optString7 = gVar.optString("AudioChannelCnt");
                C87412m.m108593f(optString7, "json.optString(REMOTE_CONFIG_AUDIO_CHANNEL_CNT)");
                Integer e8 = C66731x.m78731e(optString7);
                if (e8 != null) {
                    bVar.f304420q.f76743c = e8.intValue();
                    C13598b0 b0Var = C13598b0.f38549a;
                }
            } catch (Exception e9) {
                Log.printErrStackTrace("MicroMsg.PluginCast", e9, "isScreenCastCode error", new Object[0]);
                C13598b0 b0Var2 = C13598b0.f38549a;
            }
        }
        String stringExtra2 = intent2.getStringExtra("pc_ip");
        if (stringExtra2 != null) {
            bVar.f304421r = stringExtra2;
        }
        String stringExtra3 = intent2.getStringExtra("phone_ip");
        if (stringExtra3 != null) {
            bVar.f304422s = stringExtra3;
        }
        return bVar;
    }

    public boolean xx0() {
        if (f336921e == null) {
            f336921e = new C107075a();
        }
        C107075a aVar = f336921e;
        if (aVar != null) {
            return aVar.f320505k;
        }
        return false;
    }
}
