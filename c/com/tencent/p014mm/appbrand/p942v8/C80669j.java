package com.tencent.p014mm.appbrand.p942v8;

import com.eclipsesource.mmv8.ExecuteDetails;
import com.eclipsesource.mmv8.V8Context;
import com.eclipsesource.mmv8.V8Object;
import com.eclipsesource.mmv8.V8RuntimeException;
import com.eclipsesource.mmv8.V8ScriptEvaluateRequest;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import p774zg.C91687c;
import p774zg.C91688c0;
import p774zg.C91689d;
import p774zg.C91694e;
import p774zg.C91714h;
import p774zg.C91727j0;
import p774zg.C91728k;

/* renamed from: com.tencent.mm.appbrand.v8.j */
public class C80669j {

    /* renamed from: j */
    public static boolean f236038j;

    /* renamed from: k */
    public static volatile Log.LogImp f236039k;

    /* renamed from: a */
    public final String f236040a = ("MicroMsg.J2V8.V8ContextEngine#" + hashCode());

    /* renamed from: b */
    public final IJSRuntime f236041b;

    /* renamed from: c */
    public final C91694e f236042c;

    /* renamed from: d */
    public final C91689d f236043d;

    /* renamed from: e */
    public final C91687c f236044e;

    /* renamed from: f */
    public final LinkedList<C91688c0> f236045f = new LinkedList<>();

    /* renamed from: g */
    public final FutureTask<V8Context> f236046g;

    /* renamed from: h */
    public V8Object f236047h = null;

    /* renamed from: i */
    public boolean f236048i = true;

    /* renamed from: com.tencent.mm.appbrand.v8.j$a */
    public class C80670a implements Runnable {
        public C80670a() {
        }

        public void run() {
            Log.m105924i("MicroMsg.J2V8.V8ContextEngine", "destroy");
            Iterator<C91688c0> it = C80669j.this.f236045f.iterator();
            while (it.hasNext()) {
                it.next().mo125556a();
            }
            C80669j.this.f236045f.clear();
            V8Context e = C80669j.this.mo112501e();
            if (e != null) {
                try {
                    e.release();
                } catch (Exception e2) {
                    Log.m105921e("MicroMsg.J2V8.V8ContextEngine", "destroy :%s", e2);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$b */
    public class C80671b implements Callable<V8Context> {

        /* renamed from: d */
        public final /* synthetic */ C80674e f236050d;

        public C80671b(C80669j jVar, C80674e eVar) {
            this.f236050d = eVar;
        }

        public Object call() {
            return this.f236050d.mo112475a();
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$c */
    public class C80672c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80675f f236051d;

        /* renamed from: e */
        public final /* synthetic */ String f236052e;

        public C80672c(C80675f fVar, String str) {
            this.f236051d = fVar;
            this.f236052e = str;
        }

        public void run() {
            String str = null;
            if (this.f236051d != null) {
                C80676g gVar = new C80676g();
                gVar.f236058a = System.currentTimeMillis();
                Object executeScript = C80669j.this.mo112501e().executeScript(this.f236052e, gVar);
                C80676g.m98373a(gVar);
                C80675f fVar = this.f236051d;
                if (executeScript != null) {
                    str = executeScript.toString();
                }
                fVar.mo112506a(str, gVar);
                return;
            }
            C80669j.this.mo112501e().executeVoidScript(this.f236052e, (ExecuteDetails) null);
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$d */
    public class C80673d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80675f f236054d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList f236055e;

        /* renamed from: f */
        public final /* synthetic */ String f236056f;

        public C80673d(C80675f fVar, ArrayList arrayList, String str) {
            this.f236054d = fVar;
            this.f236055e = arrayList;
            this.f236056f = str;
        }

        public void run() {
            C80676g gVar;
            String str;
            String str2 = null;
            if (this.f236054d != null) {
                gVar = new C80676g();
                gVar.f236058a = System.currentTimeMillis();
                try {
                    Object batchExecuteScripts = C80669j.this.mo112501e().batchExecuteScripts(this.f236055e, this.f236056f, gVar);
                    C80676g.m98373a(gVar);
                    C80675f fVar = this.f236054d;
                    if (batchExecuteScripts != null) {
                        str2 = batchExecuteScripts.toString();
                    }
                    fVar.mo112506a(str2, gVar);
                    return;
                } catch (V8RuntimeException e) {
                    str = e.getMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                }
            } else {
                C80669j.this.mo112501e().batchExecuteScripts(this.f236055e, this.f236056f, (ExecuteDetails) null);
                return;
            }
            C80676g.m98373a(gVar);
            C80675f fVar2 = this.f236054d;
            if (str != null) {
                str2 = str.toString();
            }
            fVar2.mo112506a(str2, gVar);
            throw th;
        }
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$e */
    public interface C80674e {
        /* renamed from: a */
        V8Context mo112475a();
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$f */
    public interface C80675f {
        /* renamed from: a */
        void mo112506a(String str, C80676g gVar);
    }

    /* renamed from: com.tencent.mm.appbrand.v8.j$g */
    public static class C80676g extends ExecuteDetails {

        /* renamed from: a */
        public long f236058a;

        /* renamed from: b */
        public long f236059b;

        /* renamed from: c */
        public int f236060c;

        /* renamed from: a */
        public static void m98373a(C80676g gVar) {
            gVar.getClass();
            gVar.f236059b = System.currentTimeMillis();
        }

        public String toString() {
            return "ExecuteDetails{evaluateJSStartTimestampMs=" + this.f236058a + ", evaluateJSEndTimestampMs=" + this.f236059b + ", cacheType=" + this.f236060c + ", codeCacheStatus=" + this.codeCacheStatus + ", flatJSCompileCost=" + this.flatJSCompileCost + ", flatJSRunCost=" + this.flatJSRunCost + ", sourceLength=" + this.sourceLength + '}';
        }
    }

    public C80669j(IJSRuntime iJSRuntime, C91694e eVar, C80674e eVar2) {
        new HashMap();
        this.f236041b = iJSRuntime;
        FutureTask<V8Context> futureTask = new FutureTask<>(new C80671b(this, eVar2));
        this.f236046g = futureTask;
        iJSRuntime.mo112450v(futureTask);
        this.f236042c = eVar == null ? new C91727j0() : eVar;
        this.f236043d = new C91728k(this);
        this.f236044e = new C91714h();
        iJSRuntime.mo112454z(new C80677k(this), false);
    }

    /* renamed from: a */
    public static String m98366a(C80669j jVar, String str) {
        jVar.getClass();
        if (!f236038j) {
            return str;
        }
        if (str == null) {
            return null;
        }
        return str.startsWith(HttpWrapperBase.PROTOCAL_HTTPS) ? str.substring(8) : str;
    }

    /* renamed from: b */
    public final void mo112498b(ArrayList<V8ScriptEvaluateRequest> arrayList, String str, C80675f fVar) {
        Objects.requireNonNull(arrayList);
        this.f236041b.mo112450v(new C80673d(fVar, arrayList, str));
    }

    /* renamed from: c */
    public void mo112499c() {
        this.f236041b.mo112452x(new C80670a());
    }

    /* renamed from: d */
    public void mo112500d(String str, C80675f fVar) {
        this.f236041b.mo112450v(new C80672c(fVar, str));
    }

    /* renamed from: e */
    public V8Context mo112501e() {
        try {
            return this.f236046g.get(10, TimeUnit.SECONDS);
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.J2V8.V8ContextEngine", e, "getV8Context failed", new Object[0]);
            return null;
        }
    }
}
