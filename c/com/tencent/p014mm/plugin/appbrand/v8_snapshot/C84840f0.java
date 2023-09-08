package com.tencent.p014mm.plugin.appbrand.v8_snapshot;

import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import h81.C32735h;
import ny3.C89104m;
import p225rc.C89918i;
import rx3.C13603j;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.appbrand.v8_snapshot.f0 */
public final class C84840f0 {

    /* renamed from: a */
    public static final C84840f0 f247297a;

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f247298b;

    /* renamed from: c */
    public static final boolean f247299c;

    /* renamed from: d */
    public static final C89918i f247300d;

    /* renamed from: e */
    public static final C89918i f247301e;

    /* renamed from: f */
    public static final C89918i f247302f;

    /* renamed from: g */
    public static final C89918i f247303g;

    /* renamed from: h */
    public static final C89918i f247304h;

    /* renamed from: i */
    public static final C89918i f247305i;

    /* renamed from: j */
    public static final C89918i f247306j;

    /* renamed from: k */
    public static final C89918i f247307k;

    /* renamed from: l */
    public static final C32735h f247308l;

    /* renamed from: m */
    public static final boolean f247309m;

    /* renamed from: n */
    public static final boolean f247310n;

    /* renamed from: o */
    public static final boolean f247311o;

    /* renamed from: p */
    public static final boolean f247312p;

    /* renamed from: q */
    public static final boolean f247313q;

    /* renamed from: r */
    public static final int f247314r = 3;

    /* renamed from: s */
    public static final long f247315s = 259200000;

    /* renamed from: t */
    public static final int f247316t = 3;

    /* renamed from: u */
    public static final int f247317u = 6;

    /* renamed from: v */
    public static final int f247318v = 10;

    /* renamed from: w */
    public static final String[] f247319w = {"2.27.3", "2.28.0"};

    static {
        Class<C84840f0> cls = C84840f0.class;
        boolean z = false;
        f247298b = new C89104m[]{C24560g0.m30726b(new C24570s(cls, "APP_DEBUG_ENABLE", "getAPP_DEBUG_ENABLE()Z", 0)), C24560g0.m30726b(new C24570s(cls, "GAME_DEBUG_ENABLE", "getGAME_DEBUG_ENABLE()Z", 0)), C24560g0.m30726b(new C24570s(cls, "DISABLE_PRE_CONDITIONS_BLOCK", "getDISABLE_PRE_CONDITIONS_BLOCK()Z", 0)), C24560g0.m30726b(new C24570s(cls, "ENABLE_NOT_COMPRESS_LIB_SNAPSHOT", "getENABLE_NOT_COMPRESS_LIB_SNAPSHOT()Z", 0)), C24560g0.m30726b(new C24570s(cls, "KEEP_COMPILED_DATA_IN_SNAPSHOT", "getKEEP_COMPILED_DATA_IN_SNAPSHOT()Z", 0)), C24560g0.m30726b(new C24570s(cls, "NODE_DEBUG_ENABLE", "getNODE_DEBUG_ENABLE()Z", 0)), C24560g0.m30726b(new C24570s(cls, "NODE_APP_DEBUG_ENABLE", "getNODE_APP_DEBUG_ENABLE()Z", 0)), C24560g0.m30726b(new C24570s(cls, "NODE_GAME_DEBUG_ENABLE", "getNODE_GAME_DEBUG_ENABLE()Z", 0))};
        C84840f0 f0Var = new C84840f0();
        f247297a = f0Var;
        if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger()) {
            z = true;
        }
        f247299c = z;
        Boolean bool = Boolean.FALSE;
        f247300d = new C89918i(bool);
        f247301e = new C89918i(bool);
        f247302f = new C89918i(bool);
        f247303g = new C89918i(bool);
        f247304h = new C89918i(bool);
        f247305i = new C89918i(bool);
        f247306j = new C89918i(bool);
        f247307k = new C89918i(bool);
        C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
        f247308l = hVar;
        f247309m = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_wxa_enable_comm_lib_v8_snapshot_app, f0Var.mo117569a()) : f0Var.mo117569a();
        f247310n = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_wxa_enable_comm_lib_v8_snapshot_game, f0Var.mo117572d()) : f0Var.mo117572d();
        f247311o = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_wxa_enable_comm_lib_v8_snapshot_node, f0Var.mo117574f()) : f0Var.mo117574f();
        f247312p = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_wxa_enable_comm_lib_v8_snapshot_node_app, f0Var.mo117573e()) : f0Var.mo117573e();
        f247313q = hVar != null ? hVar.mo58784wf(C32735h.C32737c.clicfg_wxa_enable_comm_lib_v8_snapshot_node_game, f0Var.mo117575g()) : f0Var.mo117575g();
    }

    /* renamed from: a */
    public final boolean mo117569a() {
        return ((Boolean) f247300d.mo124238b(this, f247298b[0])).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo117570b() {
        return ((Boolean) f247302f.mo124238b(this, f247298b[2])).booleanValue();
    }

    /* renamed from: c */
    public final boolean mo117571c() {
        return f247309m || f247310n || f247311o;
    }

    /* renamed from: d */
    public final boolean mo117572d() {
        return ((Boolean) f247301e.mo124238b(this, f247298b[1])).booleanValue();
    }

    /* renamed from: e */
    public final boolean mo117573e() {
        return ((Boolean) f247306j.mo124238b(this, f247298b[6])).booleanValue();
    }

    /* renamed from: f */
    public final boolean mo117574f() {
        return ((Boolean) f247305i.mo124238b(this, f247298b[5])).booleanValue();
    }

    /* renamed from: g */
    public final boolean mo117575g() {
        return ((Boolean) f247307k.mo124238b(this, f247298b[7])).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo117576h(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "commLibReader");
        C87412m.m108594g(v0Var, "category");
        boolean z = false;
        if (C84872v0.APP == v0Var) {
            if (!f247309m) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, ban by category");
                return false;
            }
            String i = iCommLibReader.mo113377i();
            C87412m.m108593f(i, "commLibReader.versionName()");
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, libVersionName: " + i);
            return i.compareTo("2.28.1") >= 0;
        } else if (C84872v0.GAME != v0Var) {
            return false;
        } else {
            if (!f247310n) {
                Log.m105924i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, ban by category");
                return false;
            }
            String i2 = iCommLibReader.mo113377i();
            C87412m.m108593f(i2, "commLibReader.versionName()");
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotConfig", "isEnable, libVersionName: " + i2);
            String[] strArr = f247319w;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (C112551y.m153819s(i2, strArr[i3], false)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            return !z;
        }
    }

    /* renamed from: i */
    public final boolean mo117577i(ICommLibReader iCommLibReader, C84872v0 v0Var) {
        C87412m.m108594g(iCommLibReader, "commLibReader");
        C87412m.m108594g(v0Var, "category");
        int ordinal = v0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return f247313q;
            }
            if (ordinal == 2) {
                return f247311o;
            }
            throw new C13603j();
        } else if (!f247312p) {
            return false;
        } else {
            String i = iCommLibReader.mo113377i();
            C87412m.m108593f(i, "commLibReader.versionName()");
            Log.m105924i("MicroMsg.WxaCommLibV8SnapshotConfig", "isNodeEnable, libVersionName: " + i);
            return i.compareTo("2.28.1") >= 0;
        }
    }
}
