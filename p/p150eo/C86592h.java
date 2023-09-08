package p150eo;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.feature.brandservice.flutter.magicbrush.jsapi.mixedflow.event.MBJsEventOnAdServerInfo;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C86195z;
import di3.C7335d;
import di3.C86312j;
import ei3.C86522b;
import f70.C31956e;
import f70.C86770d;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p007bo.C0336e;
import p227rn.C13089q;
import p467co.C80110a;
import p493do.C86380f;
import p493do.C86383j;
import rx3.C13598b0;
import zt3.C119157j;

@C86522b
/* renamed from: eo.h */
public final class C86592h extends C86606q implements C86380f {

    /* renamed from: eo.h$a */
    public static final class C86593a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86592h f251528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86593a(C86592h hVar) {
            super(0);
            this.f251528d = hVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C86591g(this.f251528d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.h$b */
    public static final class C86594b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86592h f251529d;

        /* renamed from: e */
        public final /* synthetic */ String f251530e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86594b(C86592h hVar, String str) {
            super(0);
            this.f251529d = hVar;
            this.f251530e = str;
        }

        public Object invoke() {
            this.f251529d.vx0(1);
            C86596j jVar = this.f251529d.f251562e;
            if (jVar != null) {
                jVar.mo122098z0(new MBJsEventOnAdServerInfo().f81581d, this.f251530e);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.h$c */
    public static final class C86595c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f251531d;

        /* renamed from: e */
        public final /* synthetic */ C86592h f251532e;

        public C86595c(String str, C86592h hVar) {
            this.f251531d = str;
            this.f251532e = hVar;
        }

        public final void run() {
            Class cls = IMagicBrushMonitor.class;
            if (C87412m.m108589b(this.f251531d, "brandServiceBoxClick")) {
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicAdBrandServiceEnterByClick.name(), 1, (String) null);
                ((IMagicBrushMonitor) C86312j.m106911c(cls)).Ov0(IMagicBrushMonitor.Key.MagicAdBrandServiceCardNum.name(), ((C13089q) C86312j.m106911c(C13089q.class)).Z90(1).size(), (String) null);
                IMagicBrushMonitor iMagicBrushMonitor = (IMagicBrushMonitor) C86312j.m106911c(cls);
                String name = IMagicBrushMonitor.Key.MagicAdBrandServiceStatusOnClick.name();
                C86596j jVar = this.f251532e.f251562e;
                iMagicBrushMonitor.Ov0(name, jVar != null ? jVar.mo122095o0().currentStatus() : 0, (String) null);
            }
        }
    }

    /* renamed from: DN */
    public synchronized void mo120802DN(int i, Activity activity) {
        Log.m105924i("MagicAdBrandServiceFeatureService", "create adBrandService");
        if (!C0336e.f914a.mo376a()) {
            Log.m105924i("MagicAdBrandServiceFeatureService", "create adBrandService not open");
        } else {
            super.mo120802DN(i, activity);
        }
    }

    /* renamed from: Lo */
    public void mo120803Lo(String str) {
        C87412m.m108594g(str, "eventName");
        Log.m105924i("MagicAdBrandServiceFeatureService", "notifyStateChange eventName:" + str);
        super.mo120803Lo(str);
        ((C119157j) C119157j.f356862d).mo183884o(new C86595c(str, this));
    }

    /* renamed from: O4 */
    public synchronized void mo120804O4(int i) {
        Log.m105924i("MagicAdBrandServiceFeatureService", "destroyAdBrandServiceBiz");
        super.mo120804O4(i);
    }

    public synchronized void Pq0(String str) {
        C87412m.m108594g(str, "testJs");
        Log.m105918d("MagicAdBrandServiceFeatureService", "testJs:" + str);
        if (WeChatEnvironment.hasDebugger()) {
            vx0(0);
            C86596j jVar = this.f251562e;
            if (jVar != null && WeChatEnvironment.hasDebugger()) {
                synchronized (jVar.mo122095o0()) {
                    if (jVar.f253919f) {
                        C86195z.C86196a.m106752a(jVar.mo122095o0(), str, (C32226l) null, 2, (Object) null);
                        C13598b0 b0Var = C13598b0.f38549a;
                    } else {
                        jVar.f251535o.add(str);
                    }
                }
            }
        }
    }

    /* renamed from: TY */
    public void mo120801TY(String str) {
        C87412m.m108594g(str, "adInfo");
        Log.m105924i("MagicAdBrandServiceFeatureService", "notifyAdServerInfoEvent adInfo:" + str);
        if (!xx0()) {
            Log.m105920e("MagicAdBrandServiceFeatureService", "notifyFrameSetInfo not open!");
        } else {
            C61926c.m72668M(new C86594b(this, str));
        }
    }

    /* renamed from: bD */
    public void mo120805bD(long j, String str, String str2) {
        Class cls = IMagicBrushMonitor.class;
        C87412m.m108594g(str, "frameSetName");
        C87412m.m108594g(str2, "frameSetData");
        boolean z = true;
        if (str.length() == 0) {
            Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetName null");
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IMagicBrushMonitor::class.java)");
            IMagicBrushMonitor.C85281a.m105253a((IMagicBrushMonitor) c, IMagicBrushMonitor.Key.MagicAdBrandServiceFrameSetNameEmpty.name(), 1, (String) null, 4, (Object) null);
            return;
        }
        if (str2.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetData null");
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IMagicBrushMonitor::class.java)");
            IMagicBrushMonitor.C85281a.m105253a((IMagicBrushMonitor) c2, IMagicBrushMonitor.Key.MagicAdBrandServiceFrameSetDataEmpty.name(), 1, (String) null, 4, (Object) null);
            return;
        }
        Log.m105924i("MagicAdBrandServiceFeatureService", "notifyFrameSetInfo frameSetName:" + str + " frameSetDataLen:" + str2.length());
        super.mo120805bD(j, str, str2);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MagicAdBrandServiceFeatureService", "onAccountReleased");
        super.onAccountReleased(context);
    }

    public synchronized void vx0(int i) {
        Log.m105924i("MagicAdBrandServiceFeatureService", "createAdBrandServiceBiz");
        if (this.f251562e == null) {
            C80110a yh02 = ((C86383j) C86312j.m106911c(C86383j.class)).yh0();
            C86587f fVar = new C86587f(yh02);
            fVar.f251538r = new C86593a(this);
            this.f251562e = fVar;
            fVar.f253924k = yh02;
            fVar.mo118863q0();
            ((C119157j) C119157j.f356862d).mo183884o(new C86609r(i));
        }
    }

    public C86770d<?, ?> wx0() {
        return ((C86383j) C86312j.m106911c(C86383j.class)).yh0();
    }

    public void yx0() {
        synchronized (this) {
        }
        ((C86383j) C86312j.m106911c(C86383j.class)).yh0().mo121193A("notifyBizRecreate", (byte[]) null, C31956e.f85097d);
    }
}
