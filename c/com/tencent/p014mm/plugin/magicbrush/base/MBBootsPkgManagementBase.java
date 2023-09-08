package com.tencent.p014mm.plugin.magicbrush.base;

import a70.C112760b;
import com.tencent.p014mm.plugin.appbrand.appcache.C40427l0;
import com.tencent.p014mm.plugin.appbrand.appcache.C81255h;
import com.tencent.p014mm.plugin.appbrand.appcache.C81291m0;
import com.tencent.p014mm.plugin.appbrand.appcache.WxaPkg;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.magicbrush.C30172a0;
import com.tencent.p014mm.plugin.magicbrush.C30211n0;
import com.tencent.p014mm.plugin.magicbrush.api.WxaMagicPkgInfo;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.p014mm.vfs.C86013q1;
import d42.C31064a0;
import di3.C86312j;
import e42.C86425a;
import e42.C86426b;
import e42.C86427c;
import e42.C86433l;
import e42.C86434m;
import e42.C86435o;
import e42.C86437q;
import e42.C86438r;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Collection;
import java.util.List;
import junit.framework.Assert;
import q52.C89480u;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C26236u;
import z04.C112550d0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase */
public abstract class MBBootsPkgManagementBase extends C86433l {

    /* renamed from: b */
    public final C13601g f248381b = C36568h.m40985a(C85250d.f248387d);

    /* renamed from: c */
    public final C13601g f248382c;

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$a */
    public interface C85247a {
        /* renamed from: a */
        C81415h0 mo118402a();

        /* renamed from: b */
        C86434m mo118403b(String str);

        /* renamed from: c */
        String mo118404c();
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$b */
    public final class C85248b implements C85247a {

        /* renamed from: a */
        public final C40427l0 f248383a;

        /* renamed from: b */
        public final /* synthetic */ MBBootsPkgManagementBase f248384b;

        public C85248b(MBBootsPkgManagementBase mBBootsPkgManagementBase, C40427l0 l0Var) {
            C87412m.m108594g(l0Var, "pkg");
            this.f248384b = mBBootsPkgManagementBase;
            this.f248383a = l0Var;
        }

        /* renamed from: a */
        public C81415h0 mo118402a() {
            C86438r rVar;
            C40427l0 l0Var = this.f248383a;
            if (l0Var instanceof C81255h) {
                rVar = new C86438r.C86439a(new C86435o(l0Var));
            } else {
                String c = l0Var.mo63190c();
                C87412m.m108593f(c, "pkg.pkgPath");
                rVar = new C86438r.C86440b(c);
            }
            return MBBootsPkgManagementBase.m105175g(this.f248384b, rVar);
        }

        /* renamed from: b */
        public C86434m mo118403b(String str) {
            C87412m.m108594g(str, "path");
            return C89480u.m111876e(this.f248383a, str);
        }

        /* renamed from: c */
        public String mo118404c() {
            return C81291m0.m99665a(this.f248383a);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$c */
    public final class C85249c implements C85247a {

        /* renamed from: a */
        public final WxaMagicPkgInfo f248385a;

        /* renamed from: b */
        public final /* synthetic */ MBBootsPkgManagementBase f248386b;

        public C85249c(MBBootsPkgManagementBase mBBootsPkgManagementBase, WxaMagicPkgInfo wxaMagicPkgInfo) {
            C87412m.m108594g(wxaMagicPkgInfo, "bootsPkgInfo");
            this.f248386b = mBBootsPkgManagementBase;
            this.f248385a = wxaMagicPkgInfo;
        }

        /* renamed from: a */
        public C81415h0 mo118402a() {
            MBBootsPkgManagementBase mBBootsPkgManagementBase = this.f248386b;
            String str = this.f248385a.f81573p;
            C87412m.m108593f(str, "bootsPkgInfo.wxapath");
            return MBBootsPkgManagementBase.m105175g(mBBootsPkgManagementBase, new C86438r.C86440b(str));
        }

        /* renamed from: b */
        public C86434m mo118403b(String str) {
            C87412m.m108594g(str, "path");
            String str2 = this.f248385a.f81573p;
            C87412m.m108593f(str2, "bootsPkgInfo.wxapath");
            return new C86437q(str2, str);
        }

        /* renamed from: c */
        public String mo118404c() {
            return this.f248385a.f81566f;
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$d */
    public static final class C85250d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C85250d f248387d = new C85250d();

        public C85250d() {
            super(0);
        }

        public Object invoke() {
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$e */
    public static final class C85251e extends C87413o implements C32224a<C85247a> {

        /* renamed from: d */
        public final /* synthetic */ MBBootsPkgManagementBase f248388d;

        /* renamed from: e */
        public final /* synthetic */ String f248389e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C85251e(MBBootsPkgManagementBase mBBootsPkgManagementBase, String str) {
            super(0);
            this.f248388d = mBBootsPkgManagementBase;
            this.f248389e = str;
        }

        public Object invoke() {
            if (!this.f248388d.mo118396h() || this.f248388d.mo118401p()) {
                return MBBootsPkgManagementBase.m105174f(this.f248388d);
            }
            WxaMagicPkgInfo zs02 = ((C30211n0) C86312j.m106911c(C30211n0.class)).zs0(this.f248388d.mo118397j());
            if (zs02 == null) {
                return MBBootsPkgManagementBase.m105174f(this.f248388d);
            }
            MBBootsPkgManagementBase mBBootsPkgManagementBase = this.f248388d;
            String str = this.f248389e;
            long j = -1;
            long j2 = Util.getLong(zs02.f81572o, -1);
            C86425a i = mBBootsPkgManagementBase.mo112232i();
            if (i != null) {
                j = i.f251215b;
            }
            if (WeChatEnvironment.isCoolassistEnv() || BuildInfo.DEBUG) {
                j = MultiProcessMMKV.getMMKV("MagicBootsPkgVersion").decodeLong(mBBootsPkgManagementBase.mo118397j(), j);
            }
            if (j2 <= j) {
                return MBBootsPkgManagementBase.m105174f(mBBootsPkgManagementBase);
            }
            Log.m105924i("MircoMsg.MBBootsPkgManagementBase", "use boots pkg,instance:" + str + ",bootsPkgVersion:" + j2 + ",basePkgVersion:" + j);
            return new C85249c(mBBootsPkgManagementBase, zs02);
        }
    }

    /* renamed from: com.tencent.mm.plugin.magicbrush.base.MBBootsPkgManagementBase$f */
    public static final class C85252f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<List<? extends C86434m>, C13598b0> f248390d;

        /* renamed from: e */
        public final /* synthetic */ MBBootsPkgManagementBase f248391e;

        public C85252f(C32226l<? super List<? extends C86434m>, C13598b0> lVar, MBBootsPkgManagementBase mBBootsPkgManagementBase) {
            this.f248390d = lVar;
            this.f248391e = mBBootsPkgManagementBase;
        }

        public final void run() {
            this.f248390d.invoke(C26236u.m33719b(this.f248391e.mo118399n().mo118403b(this.f248391e.mo112234m())));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MBBootsPkgManagementBase(String str) {
        super(str);
        C87412m.m108594g(str, "instanceName");
        this.f248382c = C36568h.m40985a(new C85251e(this, str));
    }

    /* renamed from: f */
    public static final C85247a m105174f(MBBootsPkgManagementBase mBBootsPkgManagementBase) {
        C40427l0 l = mBBootsPkgManagementBase.mo118398l();
        if (l != null) {
            return new C85248b(mBBootsPkgManagementBase, l);
        }
        throw new RuntimeException("You do not provide any local package for " + mBBootsPkgManagementBase.f251229a);
    }

    /* renamed from: g */
    public static final C81415h0 m105175g(MBBootsPkgManagementBase mBBootsPkgManagementBase, C86438r rVar) {
        C81415h0 h0Var;
        Class cls = C30172a0.class;
        Collection<String> o = mBBootsPkgManagementBase.mo118400o();
        Assert.assertTrue("No biz permits current pkg manager to manage file!", !o.isEmpty());
        String str = null;
        if (rVar instanceof C86438r.C86440b) {
            str = ((C86438r.C86440b) rVar).mo120860a();
            h0Var = null;
        } else {
            h0Var = rVar instanceof C86438r.C86439a ? ((C86438r.C86439a) rVar).mo120856a() : null;
        }
        if (o.size() <= 1) {
            return ((C30172a0) C86312j.m106911c(cls)).mo57189Eo(mBBootsPkgManagementBase.mo120849e(), str, h0Var);
        }
        C31064a0 H20 = ((C30172a0) C86312j.m106911c(cls)).H20(mBBootsPkgManagementBase.mo120849e(), str, h0Var, C110818d0.m150953y0(o));
        ((C30172a0) C86312j.m106911c(cls)).mo57192VF(mBBootsPkgManagementBase.mo118397j(), C110818d0.m150953y0(o));
        return H20;
    }

    /* renamed from: a */
    public final C81415h0 mo109577a() {
        C81415h0 a = mo118399n().mo118402a();
        C87412m.m108591d(a);
        return a;
    }

    /* renamed from: b */
    public final String mo109578b() {
        String c = mo118399n().mo118404c();
        C87412m.m108591d(c);
        return c;
    }

    /* renamed from: d */
    public final void mo109580d(C32226l<? super List<? extends C86434m>, C13598b0> lVar) {
        C87412m.m108594g(lVar, "cb");
        Log.m105918d("MircoMsg.MBBootsPkgManagementBase", "hy: using fd to provide main scripts");
        if (((Boolean) ((C36570n) this.f248381b).getValue()).booleanValue()) {
            C119179t tVar = C119157j.f356862d;
            C85252f fVar = new C85252f(lVar, this);
            ((C119157j) tVar).mo183876g(fVar, "SERIAL_TAG_PREFIX" + this.f251229a);
            return;
        }
        lVar.invoke(C26236u.m33719b(mo118399n().mo118403b(mo112234m())));
    }

    /* renamed from: h */
    public boolean mo118396h() {
        return true;
    }

    /* renamed from: i */
    public abstract C86425a mo112232i();

    /* renamed from: j */
    public final String mo118397j() {
        String str = this.f251229a;
        C87412m.m108594g(str, "instanceName");
        return C112550d0.m153797g0(str, "-", str);
    }

    /* renamed from: k */
    public abstract C86427c mo112233k();

    /* renamed from: l */
    public final C40427l0 mo118398l() {
        C40427l0 d;
        if (mo118401p()) {
            Log.m105924i("MircoMsg.MBBootsPkgManagementBase", "hy: boots file system with instance name " + this.f251229a + " use debug!");
            C86427c k = mo112233k();
            C87412m.m108591d(k);
            WxaPkg wxaPkg = new WxaPkg(C112760b.m154195C() + k.f251221a);
            wxaPkg.mo63189b();
            return wxaPkg;
        }
        Log.m105924i("MircoMsg.MBBootsPkgManagementBase", "hy: boots file system with instance name " + this.f251229a + " use assets!");
        C86425a i = mo112232i();
        if (i != null && (d = C89480u.m111875d(i, mo118397j())) != null) {
            return d;
        }
        Log.m105920e("MircoMsg.MBBootsPkgManagementBase", "hy: fail to copy embed pkg to local file system. use fallback assets");
        C86425a i2 = mo112232i();
        if (i2 != null) {
            C81255h hVar = new C81255h(MMApplicationContext.getContext(), i2.f251214a);
            if (hVar.mo63189b()) {
                return hVar;
            }
        }
        return null;
    }

    /* renamed from: m */
    public abstract String mo112234m();

    /* renamed from: n */
    public final C85247a mo118399n() {
        return (C85247a) ((C36570n) this.f248382c).getValue();
    }

    /* renamed from: o */
    public abstract Collection<String> mo118400o();

    /* renamed from: p */
    public final boolean mo118401p() {
        C86427c k = mo112233k();
        if (k != null && ((k.f251222b == C86426b.FORCE_USE_DEBUG || BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || WeChatEnvironment.hasDebugger()) && k.f251222b != C86426b.FORCE_NOT_DEBUG)) {
            if (C86013q1.m106450k(C112760b.m154195C() + k.f251221a)) {
                return true;
            }
        }
        return false;
    }

    public void release() {
        ((C30172a0) C86312j.m106911c(C30172a0.class)).mo57194rr(this.f251229a);
    }
}
