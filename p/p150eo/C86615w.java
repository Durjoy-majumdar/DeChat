package p150eo;

import android.app.Activity;
import android.content.Context;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import ei3.C86522b;
import f70.C31956e;
import f70.C86770d;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p007bo.C0336e;
import p467co.C80111b;
import p493do.C86382i;
import p493do.C86383j;
import rx3.C13598b0;
import rx3.C36570n;
import zt3.C119157j;

@C86522b
/* renamed from: eo.w */
public final class C86615w extends C86606q implements C86382i {

    /* renamed from: eo.w$a */
    public static final class C86616a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86615w f251579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86616a(C86615w wVar) {
            super(0);
            this.f251579d = wVar;
        }

        public Object invoke() {
            C61926c.m72668M(new C86614v(this.f251579d));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: DN */
    public synchronized void mo120802DN(int i, Activity activity) {
        Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "create BrandService");
        C0336e eVar = C0336e.f914a;
        if (!((Boolean) ((C36570n) C0336e.f916c).getValue()).booleanValue()) {
            Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "create BrandService not open");
        } else {
            super.mo120802DN(i, activity);
        }
    }

    /* renamed from: Lo */
    public void mo120803Lo(String str) {
        C87412m.m108594g(str, "eventName");
        Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "notifyStateChange eventName:" + str);
        super.mo120803Lo(str);
    }

    /* renamed from: O4 */
    public synchronized void mo120804O4(int i) {
        Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "destroyBrandServiceBiz");
        super.mo120804O4(i);
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
            IMagicBrushMonitor.C85281a.m105253a((IMagicBrushMonitor) c, IMagicBrushMonitor.Key.MagicBrandServiceFrameSetNameEmpty.name(), 1, (String) null, 4, (Object) null);
            return;
        }
        if (str2.length() != 0) {
            z = false;
        }
        if (z) {
            Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetData null");
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IMagicBrushMonitor::class.java)");
            IMagicBrushMonitor.C85281a.m105253a((IMagicBrushMonitor) c2, IMagicBrushMonitor.Key.MagicBrandServiceFrameSetDataEmpty.name(), 1, (String) null, 4, (Object) null);
            return;
        }
        Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "notifyFrameSetInfo frameSetName:" + str + " frameSetData len:" + str2.length());
        super.mo120805bD(j, str, str2);
    }

    public void onAccountReleased(Context context) {
        C87412m.m108594g(context, "context");
        Log.m105924i("MicroMsg.IMagicBrandServiceFeatureService", "onAccountReleased");
        super.onAccountReleased(context);
    }

    public synchronized void vx0(int i) {
        if (this.f251562e == null) {
            C80111b lx = ((C86383j) C86312j.m106911c(C86383j.class)).mo120806lx();
            C86610u uVar = new C86610u(lx);
            uVar.f251538r = new C86616a(this);
            this.f251562e = uVar;
            uVar.f253924k = lx;
            uVar.mo118863q0();
            ((C119157j) C119157j.f356862d).mo183884o(new C86609r(i));
        }
    }

    public C86770d<?, ?> wx0() {
        return ((C86383j) C86312j.m106911c(C86383j.class)).mo120806lx();
    }

    public void yx0() {
        synchronized (this) {
        }
        ((C86383j) C86312j.m106911c(C86383j.class)).mo120806lx().mo121193A("notifyBizRecreate", (byte[]) null, C31956e.f85097d);
    }
}
