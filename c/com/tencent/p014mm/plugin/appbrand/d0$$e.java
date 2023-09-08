package com.tencent.p014mm.plugin.appbrand;

import android.text.TextUtils;
import com.tencent.p014mm.plugin.appbrand.debugger.C81734g;
import com.tencent.p014mm.plugin.appbrand.debugger.DebuggerShell;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import lp3.C88633e;
import mp3.C88819d;
import mp3.C88825i;
import nr3.C89059e;

/* renamed from: com.tencent.mm.plugin.appbrand.d0$$e */
public class d0$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C81688d0 f239758d;

    public d0$$e(C81688d0 d0Var) {
        this.f239758d = d0Var;
    }

    public void run() {
        LinkedList linkedList;
        if (!this.f239758d.f239738d) {
            C81688d0 d0Var = this.f239758d;
            if (d0Var.f239736b.mo113215r1()) {
                d0Var.mo114031f("service countDown by remoteDebug", new Object[0]);
                d0Var.f239747m = null;
                d0Var.mo114034i();
            } else {
                if (d0Var.f239736b.mo113208k1() == 1030 && DebuggerShell.f239772d) {
                    String d = C81734g.m100284d(d0Var.f239736b.f238147j, "Needmainjs");
                    String d2 = C81734g.m100284d(d0Var.f239736b.f238147j, "Needjs");
                    if (!TextUtils.isEmpty(d) || !TextUtils.isEmpty(d2)) {
                        C89059e<_Ret> A = d0Var.mo114032g("preloadMonkeyTestAppService").mo123064p(new C85047z0(d0Var, d, d2));
                        C88825i iVar = C88819d.LOGIC;
                        d0Var.f239747m = (C88633e) A.mo114039c(iVar, new C85034x0(d0Var)).mo123066f(iVar, new C84885w0(d0Var));
                    }
                }
                C89059e<_Ret> A2 = d0Var.mo114032g("preloadAppService").mo123064p(new C81893h0(d0Var));
                A2.mo123420E(new C81829f0(d0Var));
                C88825i iVar2 = C88819d.LOGIC;
                d0Var.f239747m = (C88633e) A2.mo114039c(iVar2, new C81550b1(d0Var)).mo123066f(iVar2, new C81107a1(d0Var));
            }
            if (d0Var.f239736b.mo121254q1()) {
                d0Var.mo114031f("tryPreloadPageView ignore for game, countdown", new Object[0]);
                d0Var.f239748n = null;
                d0Var.mo114033h();
            } else {
                if (d0Var.f239736b.mo113208k1() == 1030 && DebuggerShell.f239772d) {
                    String d3 = C81734g.m100284d(d0Var.f239736b.f238147j, "Needwebviewjs");
                    if (!TextUtils.isEmpty(d3)) {
                        d0Var.f239748n = d0Var.mo114032g("tryPreloadMonkeyTestAppPageView").mo123064p(new C81971j0(d0Var)).mo123062e(new C81923i0(d0Var, d3));
                    }
                }
                if (!"wxb1320569c2a2b6d2".equals(d0Var.f239736b.f238147j) || 1190 != d0Var.f239736b.mo113208k1() || !C29611p4.m38833a()) {
                    C89059e<_Ret> A3 = d0Var.mo114032g("tryPreloadPageView").mo123064p(new C83236l0(d0Var));
                    A3.mo123420E(new C83192k0(d0Var));
                    d0Var.f239748n = A3;
                } else {
                    d0Var.mo114031f("skyline only, skip preload pageview", new Object[0]);
                    d0Var.f239748n = null;
                    d0Var.mo114033h();
                }
            }
            try {
                d0Var.mo114035j(d0$$h.X_CONFIG);
            } catch (C88633e.C88640h e) {
                Log.printErrStackTrace("MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]", e, "tryPreloadBeforeResourceDone(PreloadReason.X_CONFIG)", new Object[0]);
            }
            synchronized (d0Var.f239746l) {
                d0Var.f239745k.set(true);
                linkedList = new LinkedList(d0Var.f239746l);
                d0Var.f239746l.clear();
            }
            while (!linkedList.isEmpty()) {
                ((Runnable) linkedList.poll()).run();
            }
        }
    }
}
