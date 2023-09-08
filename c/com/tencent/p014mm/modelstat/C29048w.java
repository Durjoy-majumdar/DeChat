package com.tencent.p014mm.modelstat;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.modelstat.C114750t;
import com.tencent.p014mm.modelstat.C29039o;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114786m0;
import com.tencent.p014mm.network.C29060q;
import com.tencent.p014mm.plugin.zero.C85597u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86301e;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C31536y2;
import ei3.C86522b;
import f40.C86709a0;
import f40.C86723g;
import f40.C86744o;
import g40.C32313e;
import java.util.HashMap;
import nr3.C35015b;
import nr3.C35016g;
import zh3.C91753f;
import zt3.C119157j;

@C86522b(dependencies = {C85597u.class}, onProcess = {C80625v0.MATCH_MM})
/* renamed from: com.tencent.mm.modelstat.w */
public class C29048w extends C86301e {

    /* renamed from: d */
    public C35016g<C114748r> f79596d = new C35016g<>(new C29049a(this));

    /* renamed from: e */
    public C35016g<C81031j> f79597e = new C35016g<>(new C29050b(this));

    /* renamed from: f */
    public C29060q f79598f = new C29051c(this);

    /* renamed from: com.tencent.mm.modelstat.w$a */
    public class C29049a implements C35015b<C114748r> {
        public C29049a(C29048w wVar) {
        }

        public Object get() {
            return new C114748r(C86709a0.m107535s().f251811i);
        }
    }

    /* renamed from: com.tencent.mm.modelstat.w$b */
    public class C29050b implements C35015b<C81031j> {
        public C29050b(C29048w wVar) {
        }

        public Object get() {
            return new C81031j(C72994y1.f212832a);
        }
    }

    /* renamed from: com.tencent.mm.modelstat.w$c */
    public class C29051c extends C29060q.C29061a {

        /* renamed from: com.tencent.mm.modelstat.w$c$a */
        public class C29052a implements Runnable {
            public C29052a(C29051c cVar) {
            }

            public void run() {
                if (C86709a0.m107523b().mo121114l()) {
                    C29048w.vx0().mo112913a();
                }
            }

            public String toString() {
                return super.toString() + "|onNetworkChange";
            }
        }

        public C29051c(C29048w wVar) {
        }

        public void onNetworkChange(int i) {
            if (i == 4 || i == 6) {
                C86709a0.m107525e().postToWorkerDelayed(new C29052a(this), 3000);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelstat.w$d */
    public class C29053d implements C32313e {
        public C29053d(C29048w wVar) {
        }

        /* renamed from: c */
        public void mo56418c(C114770g gVar) {
            Object[] objArr = new Object[2];
            objArr[0] = Boolean.valueOf(gVar == null);
            objArr[1] = Util.getStack();
            Log.m105919d("MicroMsg.SubCoreStat", "dknetstat setNetworkMoniter  isnull:%b  ,  %s ", objArr);
            if (gVar != null) {
                int i = C29039o.f79581e;
                gVar.mo55451J3(C29039o.C29042c.f79585a);
            }
        }
    }

    /* renamed from: com.tencent.mm.modelstat.w$e */
    public class C29054e implements C91753f.C91754a {
        public C29054e(C29048w wVar) {
        }

        /* renamed from: d */
        public void mo56419d() {
            C114748r wx02;
            C86709a0.m107528h();
            if (C86709a0.m107522a() && (wx02 = C29048w.wx0()) != null) {
                Log.m105924i("MicroMsg.SubCoreStat", "summer preCloseCallback netStatStg: " + wx02);
                long currentTimeMillis = System.currentTimeMillis();
                wx02.f344054f.appendAll(true);
                Log.m105924i("MicroMsg.NetStat", "summer net appendAllToDisk end takes: " + (System.currentTimeMillis() - currentTimeMillis) + " ms");
            }
        }

        /* renamed from: f */
        public void mo56420f() {
        }

        /* renamed from: m */
        public void mo56421m() {
        }
    }

    /* renamed from: com.tencent.mm.modelstat.w$f */
    public class C29055f implements C31536y2 {

        /* renamed from: com.tencent.mm.modelstat.w$f$a */
        public class C29056a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ int f79599d;

            /* renamed from: e */
            public final /* synthetic */ int f79600e;

            /* renamed from: f */
            public final /* synthetic */ int f79601f;

            public C29056a(C29055f fVar, int i, int i2, int i3) {
                this.f79599d = i;
                this.f79600e = i2;
                this.f79601f = i3;
            }

            public void run() {
                long j = (long) this.f79599d;
                long j2 = (long) this.f79600e;
                int i = this.f79601f;
                if (C114786m0.m161568a(MMApplicationContext.getContext())) {
                    Log.m105925i("MicroMsg.NetStatStorageLogic", "dknetflow wifi recv:%d send:%d type:%d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
                    C114749s.m161433b(j, j2, i);
                    return;
                }
                Log.m105925i("MicroMsg.NetStatStorageLogic", "dknetflow mobile recv:%d send:%d type:%d", Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i));
                C114749s.m161432a(j, j2, i);
            }
        }

        public C29055f(C29048w wVar) {
        }

        /* renamed from: a */
        public void mo56422a(int i, int i2, int i3) {
            Log.m105919d("MicroMsg.SubCoreStat", "ReportDataFlow [%d][%d][%d] : %s ", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Util.getStack());
            ((C119157j) C119157j.f356862d).mo183876g(new C29056a(this, i, i2, i3), "SubCoreStat-NetStatStorageLogic");
        }
    }

    public static C81031j vx0() {
        C86709a0.m107523b().mo121108c();
        return ((C29048w) C86312j.m106911c(C29048w.class)).f79597e.mo59825a();
    }

    public static C114748r wx0() {
        C86709a0.m107523b().mo121108c();
        return ((C29048w) C86312j.m106911c(C29048w.class)).f79596d.mo59825a();
    }

    public void onAccountInitialized(Context context) {
        super.onAccountInitialized(context);
        C86709a0.m107528h();
        C86744o s = C86709a0.m107535s();
        s.f251804b.add(new C29054e(this));
        C86709a0.m107529k().mo121126a(this.f79598f);
        C31519v2.f84271a = new C29055f(this);
    }

    public void onAccountReleased(Context context) {
        super.onAccountReleased(context);
        C86709a0.m107529k().mo121129d(this.f79598f);
    }

    public void onCreate(Context context) {
        super.onCreate(context);
        C86709a0.m107528h();
        C86723g k = C86709a0.m107529k();
        k.f251778a.add(new C29053d(this));
        Context context2 = MMApplicationContext.getContext();
        HashMap<String, Long> hashMap = C114750t.f344056a;
        if (context2 == null) {
            try {
                Log.m105920e("MicroMsg.NetTypeReporter", "registerReceiver ctx == null");
            } catch (Throwable th) {
                Log.m105921e("MicroMsg.NetTypeReporter", "registerReceiver : %s", Util.stackTraceToString(th));
            }
        } else {
            C114750t.C29047e eVar = new C114750t.C29047e((C114750t.C29046a) null);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context2.registerReceiver(eVar, intentFilter);
            Log.m105924i("MicroMsg.NetTypeReporter", "registerReceiver finish");
        }
    }
}
