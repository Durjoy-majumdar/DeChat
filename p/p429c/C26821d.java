package p429c;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import h81.C32735h;

/* renamed from: c.d */
public final class C26821d {

    /* renamed from: a */
    public static final C26821d f74611a = new C26821d();

    /* renamed from: c.d$a */
    public static abstract class C26822a {

        /* renamed from: a */
        public final boolean f74612a;

        /* renamed from: b */
        public final C32735h.C32736a f74613b;

        /* renamed from: c */
        public final String f74614c;

        public C26822a(boolean z, C32735h.C32736a aVar, String str, C8480h hVar) {
            this.f74612a = z;
            this.f74613b = aVar;
            this.f74614c = str;
        }

        public String toString() {
            return getClass().getSimpleName();
        }
    }

    /* renamed from: c.d$b */
    public static final class C26823b extends C26822a {

        /* renamed from: d */
        public static final C26823b f74615d = new C26823b();

        public C26823b() {
            super(true, C32735h.C32738b.clicfg_magicbrush_parallel_mainscript, "mainScriptParallel", (C8480h) null);
        }
    }

    /* renamed from: c.d$c */
    public static final class C26824c extends C26822a {

        /* renamed from: d */
        public static final C26824c f74616d = new C26824c();

        public C26824c() {
            super(false, C32735h.C32738b.clicfg_magicbrush_preload_ps, "preloadPs", (C8480h) null);
        }
    }

    /* renamed from: c.d$d */
    public static final class C26825d extends C26822a {

        /* renamed from: d */
        public static final C26825d f74617d = new C26825d();

        public C26825d() {
            super(false, C32735h.C32738b.clicfg_magicbrush_use_main, "mainProcess", (C8480h) null);
        }
    }

    /* renamed from: a */
    public final boolean mo53792a(C26822a aVar) {
        Boolean bool;
        boolean z;
        String str;
        C87412m.m108594g(aVar, TPReportKeys.LiveExKeys.LIVE_EX_DEFINATION_SWICH);
        long currentTicks = Util.currentTicks();
        boolean hasDebugger = WeChatEnvironment.hasDebugger();
        C32735h.C32736a aVar2 = aVar.f74613b;
        Boolean bool2 = null;
        if (aVar2 != null) {
            boolean z2 = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(aVar2, aVar.f74612a ? 1 : 0) != 1) {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        } else {
            bool = null;
        }
        if (hasDebugger && (str = aVar.f74614c) != null) {
            boolean z3 = aVar.f74612a;
            bool2 = Boolean.valueOf(MultiProcessMMKV.getMMKV("MagicBrushDebugStorage").getBoolean("MagicBrushTestSwitch_" + str, z3));
        }
        if (bool2 != null) {
            bool2.booleanValue();
            z = bool2.booleanValue();
        } else if (bool != null) {
            bool.booleanValue();
            z = bool.booleanValue();
        } else {
            z = aVar.f74612a;
        }
        Log.m105924i("MicroMsg.MagicBrushInternalSwitchMgr", "hy: try get switch " + aVar + " result is " + z + " using " + Util.ticksToNow(currentTicks) + ": abtest " + bool + " local " + bool2 + " hasDebugger " + hasDebugger + " default " + aVar.f74612a);
        return z;
    }
}
