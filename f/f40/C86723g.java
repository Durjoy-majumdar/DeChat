package f40;

import android.os.RemoteException;
import com.tencent.p014mm.autogen.events.NetworkDiagnoseResultEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114778k;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.network.C81035d;
import com.tencent.p014mm.network.C81039e;
import com.tencent.p014mm.network.C81040l;
import com.tencent.p014mm.sdk.crash.CallbackForReset;
import com.tencent.p014mm.sdk.crash.CrashReportFactory;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C85798u1;
import eb0.C86482a6;
import g40.C32313e;
import g40.C32315i;
import java.util.HashSet;
import java.util.Iterator;
import junit.framework.Assert;
import kj2.C117407d;
import nr3.C89055a;
import ob0.C89137b0;
import ob0.C89144l0;
import ob0.b0$$h;
import ob0.l0$$f;
import p261wl.C15510f;
import p261wl.C38166b;
import p261wl.C38174i;
import qe3.C89619a1;
import qe3.C89623b0;

/* renamed from: f40.g */
public class C86723g {

    /* renamed from: a */
    public final C86729h f251778a;

    /* renamed from: b */
    public final C89137b0 f251779b;

    /* renamed from: c */
    public HashSet<C29060q> f251780c = new HashSet<>();

    /* renamed from: d */
    public C29060q f251781d = new C31883b();

    /* renamed from: f40.g$b */
    public class C31883b extends C29060q.C29061a {
        public C31883b() {
        }

        public void onNetworkChange(int i) {
            try {
                C38166b.C38167a aVar = (C38166b.C38167a) C38166b.m41759f(C32315i.class);
                C38166b.C38167a.C38169b bVar = new C38166b.C38167a.C38169b(aVar, aVar.f100837d.all().iterator());
                while (bVar.hasNext()) {
                    C38174i iVar = (C38174i) bVar.next();
                    if (C38166b.m41757d(C38166b.f100836c, iVar)) {
                        ((C32315i) ((C15510f) iVar.get())).onNetworkChange(i);
                    }
                }
                HashSet hashSet = new HashSet();
                synchronized (C86723g.this.f251780c) {
                    hashSet.addAll(C86723g.this.f251780c);
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C29060q) it.next()).onNetworkChange(i);
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MMKernel.CoreNetwork", e, "onNetworkChange caught crash", new Object[0]);
            }
        }
    }

    /* renamed from: f40.g$a */
    public class C86724a implements l0$$f {
        public C86724a() {
        }

        /* renamed from: a */
        public C89137b0 mo121131a() {
            return C86723g.this.f251779b;
        }
    }

    /* renamed from: f40.g$d */
    public class C86725d extends C89619a1.C89620a {

        /* renamed from: d */
        public byte[] f251783d;

        public C86725d(C86723g gVar) {
        }
    }

    /* renamed from: f40.g$e */
    public class C86726e implements CallbackForReset {
        public C86726e(C86723g gVar) {
        }

        public void callbackForReset(String str) {
            Log.m105929w("MMKernel.CoreNetwork", "CallbackForReset errorStack %s ", str);
            C86709a0.m107528h();
            if (C86709a0.m107526f() != null) {
                C86709a0.m107528h();
                C86482a6 f = C86709a0.m107526f();
                f.f251307a = true;
                Iterator it = ((HashSet) f.f251308b).iterator();
                while (it.hasNext()) {
                    C86482a6.C86483a aVar = (C86482a6.C86483a) it.next();
                    if (aVar != null) {
                        aVar.mo120943a();
                    }
                }
                f.f251307a = false;
            }
            C86709a0.m107528h();
            if (C86709a0.m107535s() != null) {
                C86709a0.m107528h();
                C86709a0.m107535s().mo121137c(str);
            }
        }
    }

    /* renamed from: f40.g$f */
    public class C86727f implements C81035d.C81036a {
        public C86727f() {
        }

        /* renamed from: a */
        public C114770g mo112932a() {
            try {
                return C86723g.this.f251779b.f256809d;
            } catch (Throwable th) {
                Log.m105921e("MMKernel.CoreNetwork", "%s", Util.stackTraceToString(th));
                return null;
            }
        }
    }

    /* renamed from: f40.g$g */
    public class C86728g implements C81035d.C81036a {
        public C86728g() {
        }

        /* renamed from: a */
        public C114770g mo112932a() {
            try {
                return C86723g.this.f251779b.f256809d;
            } catch (Throwable th) {
                Log.m105921e("MMKernel.CoreNetwork", "%s", Util.stackTraceToString(th));
                return null;
            }
        }
    }

    /* renamed from: f40.g$h */
    public static class C86729h extends C89055a<C32313e> implements C32313e {

        /* renamed from: f40.g$h$a */
        public class C86730a implements C89055a.C89056a<C32313e> {

            /* renamed from: a */
            public final /* synthetic */ C114770g f251786a;

            public C86730a(C86729h hVar, C114770g gVar) {
                this.f251786a = gVar;
            }

            /* renamed from: a */
            public void mo54201a(Object obj) {
                ((C32313e) obj).mo56418c(this.f251786a);
            }
        }

        /* renamed from: c */
        public void mo56418c(C114770g gVar) {
            mo123416n(new C86730a(this, gVar));
        }
    }

    /* renamed from: f40.g$c */
    public class C86731c extends C114778k.C114779a {
        public C86731c() {
        }

        public void networkAnalysisCallBack(int i, int i2, boolean z, String str) {
            Log.m105925i("MMKernel.CoreNetwork", "callback, kv:%s", str);
            C86723g.this.getClass();
            NetworkDiagnoseResultEvent networkDiagnoseResultEvent = new NetworkDiagnoseResultEvent();
            NetworkDiagnoseResultEvent.C114680a aVar = networkDiagnoseResultEvent.f343573d;
            aVar.f343574a = i;
            aVar.f343575b = i2;
            aVar.f343576c = z;
            aVar.f343577d = str;
            networkDiagnoseResultEvent.publish();
        }
    }

    public C86723g(b0$$h b0__h, C86729h hVar) {
        if (C89137b0.f256807w == null) {
            C89137b0.f256807w = new C89137b0(b0__h);
        }
        C89137b0 b0Var = C89137b0.f256807w;
        this.f251779b = b0Var;
        b0Var.f256810e = C86709a0.m107525e();
        C89144l0.f256845a = new C86724a();
        this.f251778a = hVar;
    }

    /* renamed from: a */
    public void mo121126a(C29060q qVar) {
        synchronized (this.f251780c) {
            this.f251780c.add(qVar);
        }
    }

    /* renamed from: b */
    public C89137b0 mo121127b() {
        return this.f251779b;
    }

    /* renamed from: c */
    public byte[] mo121128c(int i) {
        C114770g gVar;
        try {
            C89137b0 b0Var = this.f251779b;
            if (!(b0Var == null || (gVar = b0Var.f256809d) == null)) {
                if (gVar.mo55443A3() != null) {
                    return this.f251779b.f256809d.mo55443A3().mo55421S(i);
                }
            }
            return null;
        } catch (Exception e) {
            Log.m105929w("MMKernel.CoreNetwork", "get session key error, %s", e.getMessage());
            Log.m105921e("MMKernel.CoreNetwork", "exception:%s", Util.stackTraceToString(e));
            return null;
        }
    }

    /* renamed from: d */
    public void mo121129d(C29060q qVar) {
        synchronized (this.f251780c) {
            this.f251780c.remove(qVar);
        }
    }

    /* renamed from: e */
    public void mo121130e(C114770g gVar) {
        C114770g gVar2 = gVar;
        Log.m105928w("MMKernel.CoreNetwork", "setting up remote dispatcher " + gVar2);
        this.f251778a.mo56418c(gVar2);
        if (gVar2 == null) {
            Log.m105920e("MMKernel.CoreNetwork", "setAutoAuth autoAuh is null");
            return;
        }
        gVar2.mo55456Q2(new C86731c());
        boolean z = true;
        try {
            C81040l Z5 = gVar.mo55465Z5();
            if (Z5 != null) {
                Z5.mo112945gY(this.f251781d);
            }
        } catch (RemoteException e) {
            Log.m105921e("MMKernel.CoreNetwork", "exception:%s", Util.stackTraceToString(e));
        }
        gVar2.mo55484n3(new C86725d(this));
        C81039e A3 = gVar.mo55443A3();
        if (A3 == null) {
            Log.m105922f("MMKernel.CoreNetwork", "accInfo is null, it would assert before!!!");
            this.f251779b.mo123471q();
            this.f251779b.mo123472r();
            return;
        }
        CrashReportFactory.setCallbackForReset(new C86726e(this));
        C86709a0.m107528h();
        C85798u1 l = C86709a0.m107535s().mo121145l();
        Assert.assertTrue("setAutoAuth, getSysCfg() is null, stack = " + Util.getStack(), l != null);
        int c = l.mo119662c(47, 0);
        String str = (String) l.mo119660a(2);
        String str2 = (String) l.mo119660a(3);
        String str3 = (String) l.mo119660a(6);
        String str4 = (String) l.mo119660a(7);
        String str5 = (String) l.mo119660a(25);
        String str6 = (String) l.mo119660a(24);
        C89623b0.C89624a b = C89623b0.m112053b(str3, str4);
        Log.m105919d("MMKernel.CoreNetwork", "dkidc host[s:%s l:%s] builtin[s:%s l:%s] ports[%s] timeout[%s] mmtls[%d]", str6, str5, str, str2, str3, str4, Integer.valueOf(c));
        Assert.assertTrue("setAutoAuth, autoAuth is null, stack = " + Util.getStack(), true);
        gVar.mo55483n1(false, str, str2, b.mo123922c(), b.mo123920a(), b.mo123923d(), b.mo123921b(), str6, str5);
        gVar2.mo55468b3((c & 1) == 0);
        C86709a0.m107528h();
        C86718e b2 = C86709a0.m107523b();
        Assert.assertTrue("setAutoAuth, accInfo is null, stack = " + Util.getStack(), true);
        if (!C86709a0.m107522a() || !C86709a0.m107523b().mo121119s()) {
            Log.m105929w("MMKernel.CoreNetwork", "need to clear acc info and maybe stop networking accHasReady():%b isInitializedNotifyAllDone:%b", Boolean.valueOf(C86709a0.m107522a()), Boolean.valueOf(C86709a0.m107523b().mo121119s()));
            C117407d dVar = C117407d.INSTANCE;
            dVar.idkeyStat(148, C86709a0.m107522a() ? 44 : 43, 1, false);
            A3.reset();
            gVar.reset();
            this.f251779b.mo123473s(gVar2);
            C81035d.m98967h(new C86727f());
            if (b2.mo121110g() != A3.getUin()) {
                dVar.idkeyStat(148, 45, 1, false);
                Log.m105929w("MMKernel.CoreNetwork", "summerauth update acc info with acc stg: old acc uin=%d, acc stg uin=%d, acc init %b %b", Integer.valueOf(A3.getUin()), Integer.valueOf(b2.mo121110g()), Boolean.valueOf(C86709a0.m107523b().mo121114l()), Boolean.valueOf(C86709a0.m107523b().mo121119s()));
                A3.mo55425b(b2.mo121110g());
                return;
            }
            Log.m105925i("MMKernel.CoreNetwork", "acc info uin same with acc stg", Integer.valueOf(A3.getUin()), Integer.valueOf(b2.mo121110g()));
            return;
        }
        Log.m105925i("MMKernel.CoreNetwork", "setAutoAuth differrent accStg uin[%d], accInfo uin[%d], acc init[%b]", Integer.valueOf(b2.mo121110g()), Integer.valueOf(A3.getUin()), Boolean.valueOf(C86709a0.m107523b().mo121114l()));
        if (b2.mo121110g() != A3.getUin()) {
            Log.m105928w("MMKernel.CoreNetwork", "update acc info with acc stg: uin =" + A3.getUin());
            String str7 = "setAutoAuth, getConfigStg() is null, stack = " + Util.getStack();
            C86709a0.m107528h();
            if (C86709a0.m107535s().mo121142i() == null) {
                z = false;
            }
            Assert.assertTrue(str7, z);
            C86709a0.m107528h();
            A3.mo55422X0(new byte[0], new byte[0], new byte[0], b2.mo121110g());
            A3.setUsername((String) C86709a0.m107535s().mo121142i().mo119683d(2));
        }
        this.f251779b.mo123473s(gVar2);
        C81035d.m98967h(new C86728g());
    }
}
