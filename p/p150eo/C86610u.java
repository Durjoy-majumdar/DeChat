package p150eo;

import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82870p;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiOnWebPageUrlExposed;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.plugin.magicbrush.report.IMagicBrushMonitor;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.xweb.IXWebBroadcastListener;
import di3.C86312j;
import e42.C86431j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import kr0.C88274h0;
import o40.C61926c;
import p467co.C80111b;
import p522fo.C32139a;
import p522fo.C32140b;
import rx3.C13598b0;
import sx3.C110826x0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: eo.u */
public final class C86610u extends C86596j {

    /* renamed from: t */
    public FrameLayout f251570t;

    /* renamed from: u */
    public C32140b<C86596j> f251571u = C32139a.f85452a.mo58503a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE);

    /* renamed from: v */
    public final HashSet<C86431j<C86596j>> f251572v;

    /* renamed from: w */
    public final HashSet<String> f251573w;

    /* renamed from: eo.u$a */
    public static final class C86611a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C86610u f251574d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C86611a(C86610u uVar) {
            super(0);
            this.f251574d = uVar;
        }

        public Object invoke() {
            C86610u uVar = this.f251574d;
            if (uVar.f251570t != null) {
                uVar.f251570t = null;
            }
            uVar.getClass();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: eo.u$b */
    public static final class C86612b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86610u f251575d;

        /* renamed from: e */
        public final /* synthetic */ MBBuildConfig<C86596j> f251576e;

        public C86612b(C86610u uVar, MBBuildConfig<C86596j> mBBuildConfig) {
            this.f251575d = uVar;
            this.f251576e = mBBuildConfig;
        }

        public final void run() {
            this.f251575d.mo121036A0(this.f251576e);
            this.f251575d.mo121029B0();
        }
    }

    /* renamed from: eo.u$c */
    public static final class C86613c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C86610u f251577d;

        public C86613c(C86610u uVar) {
            this.f251577d = uVar;
        }

        public final void run() {
            ((IMagicBrushMonitor) C86312j.m106911c(IMagicBrushMonitor.class)).Ov0(IMagicBrushMonitor.Key.MagicBrandServicePendingEvent.name(), this.f251577d.f253918e.size(), (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C86610u(C80111b bVar) {
        super(bVar);
        Class cls = C30172a0.class;
        Class cls2 = C88274h0.class;
        C87412m.m108594g(bVar, "flutterPlugin");
        C82870p Xg0 = ((C88274h0) C86312j.m106911c(cls2)).Xg0(508);
        C87412m.m108592e(Xg0, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        C30172a0 a0Var = (C30172a0) C86312j.m106911c(cls);
        C82870p Xg02 = ((C88274h0) C86312j.m106911c(cls2)).Xg0(764);
        C87412m.m108592e(Xg02, "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.AppBrandAsyncJsApi<*>");
        HashSet<C86431j<C86596j>> b = C110826x0.m151014b(a0Var.Cu0((C82268c) Xg0, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE), ((C30172a0) C86312j.m106911c(cls)).Cu0((C82268c) Xg02, MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE));
        b.addAll(this.f251571u.f85453a);
        this.f251572v = b;
        this.f251573w = C110826x0.m151014b(((C88274h0) C86312j.m106911c(cls2)).Xg0(JsApiOnWebPageUrlExposed.CTRL_INDEX).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(969).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(970).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(1112).getClass().getName(), ((C88274h0) C86312j.m106911c(cls2)).Xg0(JsApiOnWebPageUrlExposed.CTRL_INDEX).getClass().getName());
    }

    /* renamed from: B0 */
    public void mo121029B0() {
        super.mo121029B0();
        Log.m105924i("MagicBrandServiceBiz", IXWebBroadcastListener.STAGE_START);
    }

    /* renamed from: T */
    public void mo109584T(String str, String str2) {
        C87412m.m108594g(str, "envId");
        C87412m.m108594g(str2, "msg");
        super.mo109584T(str, str2);
        Log.m105920e("MagicBrandServiceBiz", "onJSException envId:" + str + " msg:" + str2);
    }

    /* renamed from: b */
    public void mo109587b() {
        super.mo109587b();
        Log.m105924i("MagicBrandServiceBiz", "onMainScriptInjected");
        ((C119157j) C119157j.f356862d).mo183884o(new C86613c(this));
    }

    /* renamed from: d0 */
    public void mo109589d0(int i) {
        super.mo109589d0(i);
        Log.m105924i("MagicBrandServiceBiz", "onDestroy reason:" + i);
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        Log.m105924i("MagicBrandServiceBiz", "destroyBrandServiceBiz");
        if (WeChatEnvironment.hasDebugger()) {
            C61926c.m72668M(new C86611a(this));
        }
        super.mo118861j0();
    }

    /* renamed from: l0 */
    public String mo118862l0() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_BRAND_SERVICE;
    }

    public void onCreated() {
        super.onCreated();
        Log.m105924i("MagicBrandServiceBiz", "onCreated");
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        super.mo118863q0();
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.mo118367a(this.f251572v);
        C85280q0.m105251b(mBBuildConfig, this.f251573w);
        C119179t tVar = C119157j.f356862d;
        ((C119157j) tVar).mo183875f(new C86612b(this, mBBuildConfig));
    }
}
