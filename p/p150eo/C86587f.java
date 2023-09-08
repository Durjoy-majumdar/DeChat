package p150eo;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.IXWebBroadcastListener;
import d42.C31067e0;
import di3.C86312j;
import e42.C86431j;
import e70.C86458e;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import o40.C61926c;
import p005bg.C0277c;
import p172io.C9215c;
import p172io.C9221d;
import p172io.C9222e;
import p467co.C80110a;
import p522fo.C32139a;
import p522fo.C32140b;
import rx3.C13598b0;
import sx3.C110826x0;
import sx3.C26236u;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: eo.f */
public final class C86587f extends C86596j {

    /* renamed from: t */
    public FrameLayout f251518t;

    /* renamed from: u */
    public C32140b<C86596j> f251519u = C32139a.f85452a.mo58503a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE);

    /* renamed from: v */
    public C31067e0<C86596j> f251520v = ((C0277c) C86312j.m106911c(C0277c.class)).mo554S(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE);

    /* renamed from: w */
    public final HashSet<C86431j<C86596j>> f251521w;

    /* renamed from: x */
    public final HashSet<String> f251522x;

    /* renamed from: eo.f$a */
    public static final class C86588a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86587f f251523d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86588a(C86587f fVar) {
            super(0);
            this.f251523d = fVar;
        }

        public Object invoke() {
            C86587f fVar = this.f251523d;
            if (fVar.f251518t != null) {
                fVar.f251518t = null;
            }
            fVar.getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.f$b */
    public static final class C86589b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86587f f251524d;

        /* renamed from: e */
        public final /* synthetic */ MBBuildConfig<C86596j> f251525e;

        public C86589b(C86587f fVar, MBBuildConfig<C86596j> mBBuildConfig) {
            this.f251524d = fVar;
            this.f251525e = mBBuildConfig;
        }

        public final void run() {
            this.f251524d.mo121036A0(this.f251525e);
            this.f251524d.mo121029B0();
        }
    }

    /* renamed from: eo.f$c */
    public static final class C86590c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86587f f251526d;

        public C86590c(C86587f fVar) {
            this.f251526d = fVar;
        }

        public final void run() {
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicAdBrandServicePendingEvent.name(), this.f251526d.f253918e.size(), (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86587f(C80110a aVar) {
        super(aVar);
        C87412m.m108594g(aVar, "flutterPlugin");
        HashSet<C86431j<C86596j>> b = C110826x0.m151014b(new C9222e(), new C9221d(), new C9215c());
        b.addAll(this.f251519u.f85453a);
        b.addAll(this.f251520v.f83320a);
        this.f251521w = b;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(this.f251519u.f85454b);
        hashSet.addAll(this.f251520v.f83321b);
        this.f251522x = hashSet;
    }

    /* renamed from: B0 */
    public void mo121029B0() {
        super.mo121029B0();
        Log.m105924i("MagicAdBrandServiceBiz", IXWebBroadcastListener.STAGE_START);
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        super.mo109584T(str, str2);
        Log.m105920e("MagicAdBrandServiceBiz", "onJSException envId:" + str + " msg:" + str2);
    }

    /* renamed from: b */
    public void mo109587b() {
        Log.m105924i("MagicAdBrandServiceBiz", "onMainScriptInjected");
        super.mo109587b();
        ((C119157j) C119157j.f356862d).mo183884o(new C86590c(this));
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        super.mo109589d0(i);
        Log.m105924i("MagicAdBrandServiceBiz", "onDestroy reason:" + i);
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        Log.m105924i("MagicAdBrandServiceBiz", "destroyADBrandServiceBiz");
        super.mo118861j0();
        if (WeChatEnvironment.hasDebugger()) {
            C61926c.m72668M(new C86588a(this));
        }
    }

    /* renamed from: l0 */
    public String mo118862l0() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE;
    }

    public void onCreated() {
        super.onCreated();
        Log.m105924i("MagicAdBrandServiceBiz", "onCreated");
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        super.mo118863q0();
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.mo118367a(this.f251521w);
        C85280q0.m105251b(mBBuildConfig, this.f251522x);
        mBBuildConfig.mo118367a(C26236u.m33719b(new C86458e()));
        C119179t tVar = C119157j.f356862d;
        ((C119157j) tVar).mo183875f(new C86589b(this, mBBuildConfig));
        Log.m105918d("MagicAdBrandServiceBiz", "MagicAdAppBrandBizService setup");
    }
}
