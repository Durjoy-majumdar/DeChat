package com.tencent.p014mm.plugin.scanner;

import android.content.Context;
import android.net.Uri;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.scanner.model.ExternRequestDealQBarStrHandler;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import com.tencent.p014mm.vfs.C116281f0;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.util.FrequentLimiter;
import di3.C86301e;
import di3.C86312j;
import ei3.C86522b;
import f40.C86709a0;
import p823sg.C90193h;
import sl2.C36680a;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.plugin.scanner.z */
public class C71030z extends C86301e {

    /* renamed from: d */
    public String f205574d;

    /* renamed from: e */
    public C36680a f205575e;

    /* renamed from: com.tencent.mm.plugin.scanner.z$a */
    public class C71031a implements Runnable {
        public C71031a() {
        }

        public void run() {
            if (C86709a0.m107522a()) {
                if (Util.isNullOrNil(C71030z.this.f205574d)) {
                    Log.m105920e("MicroMsg.scanner.SubCoreScanner", "accPath == null in onAccountPostReset");
                    return;
                }
                Util.deleteOutOfDateFile(C71030z.this.f205574d + "image/scan/img", "scanbook", FrequentLimiter.WEEK_MILLS);
            }
        }

        public String toString() {
            return super.toString() + "|onAccountPostReset";
        }
    }

    public C71030z() {
        new ExternRequestDealQBarStrHandler();
    }

    public static synchronized C71030z vx0() {
        C71030z zVar;
        Class cls = C71030z.class;
        synchronized (cls) {
            zVar = (C71030z) C86312j.m106911c(cls);
        }
        return zVar;
    }

    public String Gp0() {
        StringBuilder sb = new StringBuilder();
        C86709a0.m107528h();
        sb.append(C86709a0.m107535s().f251806d);
        sb.append("scanner/");
        return sb.toString();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        zx0();
        ThreadPool.post(new C71031a(), "MicroMsg.scanner.SubCoreScannerdeleteOutDateImg");
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        ExternRequestDealQBarStrHandler.m119495d();
    }

    public C36680a wx0() {
        C86709a0.m107523b().mo121108c();
        if (this.f205575e == null) {
            this.f205575e = new C36680a(C86709a0.m107535s().f251811i);
        }
        return this.f205575e;
    }

    public String xx0(String str, String str2) {
        if (!C86709a0.m107522a() || Util.isNullOrNil(str)) {
            return "";
        }
        return String.format("%s/scanbook%s_%s", new Object[]{this.f205574d + "image/scan/img", str2, C90193h.m112878f(str.getBytes())});
    }

    public String yx0() {
        return Gp0() + "scan_camera/";
    }

    public void zx0() {
        if (this.f205574d != null) {
            String str = C86709a0.m107535s().f251806d;
            Log.m105918d("MicroMsg.scanner.SubCoreScanner", "resetAccPath on accPath : " + str);
            this.f205574d = str;
            Uri n = C116299g2.m163858n(str);
            String path = n.getPath();
            boolean z = false;
            if (path != null) {
                String k = C116299g2.m163855k(path, false, false);
                if (!n.getPath().equals(k)) {
                    n = n.buildUpon().path(k).build();
                }
            }
            C116281f0 f0Var = C116281f0.C116289i.f348994a;
            C116281f0.C116288h l = f0Var.mo177799l(n, (C116281f0.C116288h) null);
            if (!(!l.mo177810a() ? false : l.f348991a.mo119948x(l.f348992b))) {
                C116281f0.C116288h l2 = f0Var.mo177799l(n, l);
                if (l2.mo177810a()) {
                    l2.f348991a.mo119937g(l2.f348992b);
                }
            }
            Uri n2 = C116299g2.m163858n(str + "image/scan/img");
            String path2 = n2.getPath();
            if (path2 != null) {
                String k2 = C116299g2.m163855k(path2, false, false);
                if (!n2.getPath().equals(k2)) {
                    n2 = n2.buildUpon().path(k2).build();
                }
            }
            C116281f0.C116288h l3 = f0Var.mo177799l(n2, (C116281f0.C116288h) null);
            if (!(!l3.mo177810a() ? false : l3.f348991a.mo119948x(l3.f348992b))) {
                C116281f0.C116288h l4 = f0Var.mo177799l(n2, l3);
                if (l4.mo177810a()) {
                    l4.f348991a.mo119937g(l4.f348992b);
                }
            }
            Uri n3 = C116299g2.m163858n(str + "image/scan/music");
            String path3 = n3.getPath();
            if (path3 != null) {
                String k3 = C116299g2.m163855k(path3, false, false);
                if (!n3.getPath().equals(k3)) {
                    n3 = n3.buildUpon().path(k3).build();
                }
            }
            C116281f0.C116288h l5 = f0Var.mo177799l(n3, (C116281f0.C116288h) null);
            if (!(!l5.mo177810a() ? false : l5.f348991a.mo119948x(l5.f348992b))) {
                C116281f0.C116288h l6 = f0Var.mo177799l(n3, l5);
                if (l6.mo177810a()) {
                    l6.f348991a.mo119937g(l6.f348992b);
                }
            }
            Uri n4 = C116299g2.m163858n(Gp0());
            String path4 = n4.getPath();
            if (path4 != null) {
                String k4 = C116299g2.m163855k(path4, false, false);
                if (!n4.getPath().equals(k4)) {
                    n4 = n4.buildUpon().path(k4).build();
                }
            }
            C116281f0.C116288h l7 = f0Var.mo177799l(n4, (C116281f0.C116288h) null);
            if (!(!l7.mo177810a() ? false : l7.f348991a.mo119948x(l7.f348992b))) {
                C116281f0.C116288h l8 = f0Var.mo177799l(n4, l7);
                if (l8.mo177810a()) {
                    l8.f348991a.mo119937g(l8.f348992b);
                }
            }
            Uri n5 = C116299g2.m163858n(vx0().yx0());
            String path5 = n5.getPath();
            if (path5 != null) {
                String k5 = C116299g2.m163855k(path5, false, false);
                if (!n5.getPath().equals(k5)) {
                    n5 = n5.buildUpon().path(k5).build();
                }
            }
            C116281f0.C116288h l9 = f0Var.mo177799l(n5, (C116281f0.C116288h) null);
            if (l9.mo177810a()) {
                z = l9.f348991a.mo119948x(l9.f348992b);
            }
            if (!z) {
                C116281f0.C116288h l15 = f0Var.mo177799l(n5, l9);
                if (l15.mo177810a()) {
                    l15.f348991a.mo119937g(l15.f348992b);
                }
            }
            C86013q1.m106460u(vx0().yx0());
        }
    }
}
