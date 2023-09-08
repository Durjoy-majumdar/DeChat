package k52;

import android.app.Activity;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82543i5;
import com.tencent.p014mm.plugin.appbrand.jsapi.appdownload.JsApiGetInstallState;
import com.tencent.p014mm.plugin.magicbrush.C85280q0;
import com.tencent.p014mm.plugin.magicbrush.MBBuildConfig;
import com.tencent.p014mm.plugin.magicbrush.api.MagicBrushConstants$BizNames;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import d42.C31067e0;
import d42.C86177e;
import d42.C86195z;
import d52.C45265b;
import d52.C45266c;
import di3.C86312j;
import e42.C86431j;
import e70.C86457d;
import f52.C45754a;
import f52.C45757c;
import fy3.C32224a;
import fy3.C32226l;
import g70.C87164i;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i70.C87667c;
import i70.C87674f;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import kr0.C88274h0;
import m52.C88697a;
import m52.C88698b;
import o40.C61926c;
import o52.C61944e;
import p005bg.C0277c;
import q52.C62582g;
import rx3.C13598b0;
import rx3.C48096k;
import sx3.C110826x0;
import w42.C90896b;

/* renamed from: k52.a */
public final class C88115a extends C87667c<C86457d, C88115a> {

    /* renamed from: n */
    public C62582g f254864n;

    /* renamed from: o */
    public FrameLayout f254865o;

    /* renamed from: p */
    public C61944e f254866p;

    /* renamed from: q */
    public WeakReference<Activity> f254867q;

    /* renamed from: r */
    public final HashSet<C86431j<C88115a>> f254868r = C110826x0.m151014b(new C90896b(), new C88697a(), new C88698b(), new C45754a(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE), new C45757c(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_AD_BRAND_SERVICE), new C45266c(), new C45265b());

    /* renamed from: s */
    public final HashSet<String> f254869s;

    /* renamed from: t */
    public long f254870t;

    /* renamed from: u */
    public long f254871u;

    /* renamed from: k52.a$a */
    public static final class C60976a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88115a f173680d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60976a(C88115a aVar) {
            super(0);
            this.f173680d = aVar;
        }

        public Object invoke() {
            C88115a aVar = this.f173680d;
            FrameLayout frameLayout = aVar.f254865o;
            if (frameLayout != null) {
                C62582g gVar = aVar.f254864n;
                if (gVar != null) {
                    gVar.mo87641e(frameLayout);
                }
                aVar.f254865o = null;
            }
            C62582g gVar2 = this.f173680d.f254864n;
            if (gVar2 != null) {
                gVar2.mo87640d();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: k52.a$b */
    public static final class C60977b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C88115a f173681d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60977b(C88115a aVar) {
            super(0);
            this.f173681d = aVar;
        }

        public Object invoke() {
            Log.m105924i("vird", "prelayout cost" + (System.currentTimeMillis() - this.f173681d.f254871u));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88115a() {
        super((C87674f) null, 1, (C8480h) null);
        Class cls = C88274h0.class;
        C31067e0 S = ((C0277c) C86312j.m106911c(C0277c.class)).mo554S(MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO);
        HashSet<String> b = C110826x0.m151014b(JsApiGetInstallState.class.getName(), ((C88274h0) C86312j.m106911c(cls)).Xg0(C82543i5.CTRL_INDEX).getClass().getName(), ((C88274h0) C86312j.m106911c(cls)).Xg0(64).getClass().getName(), ((C88274h0) C86312j.m106911c(cls)).Xg0(63).getClass().getName());
        b.addAll(S.f83321b);
        this.f254869s = b;
        this.f254870t = System.currentTimeMillis();
        this.f254871u = System.currentTimeMillis();
    }

    /* renamed from: b */
    public void mo109587b() {
        super.mo109587b();
        C86195z.C86196a.m106752a(mo122095o0(), "mb.switchVConsole(true);", (C32226l) null, 2, (Object) null);
        Log.m105924i("MagicSclDemoBiz", "onMainScriptInjected");
    }

    /* renamed from: c */
    public void mo109588c(int i, boolean z) {
        super.mo109588c(i, z);
        Log.m105924i("vird", "cost " + (System.currentTimeMillis() - this.f254870t));
    }

    /* renamed from: e0 */
    public Activity mo8720e0() {
        WeakReference<Activity> weakReference = this.f254867q;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: g0 */
    public C86177e<C86457d, ? extends Object> mo118860g0(String str) {
        C87412m.m108594g(str, "containerTag");
        throw new C48096k("An operation is not implemented: not implemented");
    }

    /* renamed from: j0 */
    public void mo118861j0() {
        C61926c.m72668M(new C60976a(this));
        super.mo118861j0();
    }

    /* renamed from: l0 */
    public String mo118862l0() {
        return MagicBrushConstants$BizNames.BIZ_NAME_MAGIC_SCL_DEMO;
    }

    /* renamed from: q0 */
    public void mo118863q0() {
        super.mo118863q0();
        MBBuildConfig mBBuildConfig = new MBBuildConfig((HashSet) null, (HashSet) null, (String) null, (String) null, false, false, 63, (C8480h) null);
        mBBuildConfig.f248378q = this;
        mBBuildConfig.f248372h = true;
        C62582g gVar = this.f254864n;
        if (gVar != null) {
            mBBuildConfig.f248377p = gVar;
        }
        mBBuildConfig.f248372h = WeChatEnvironment.hasDebugger();
        mBBuildConfig.mo118367a(this.f254868r);
        C85280q0.m105251b(mBBuildConfig, this.f254869s);
        mo121036A0(mBBuildConfig);
    }

    /* renamed from: r0 */
    public void mo118864r0(C87667c<?, ?>.a aVar, C87164i iVar, String str) {
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        C87412m.m108594g(str, "info");
        super.mo118864r0(aVar, iVar, str);
        this.f254870t = System.currentTimeMillis();
    }

    /* renamed from: v0 */
    public void mo121540v0(C87667c<?, ?>.a aVar, C87164i iVar) {
        C87412m.m108594g(aVar, "root");
        C87412m.m108594g(iVar, "frameSet");
        super.mo121540v0(aVar, iVar);
        this.f254871u = System.currentTimeMillis();
        iVar.f252792h = new C60977b(this);
    }
}
