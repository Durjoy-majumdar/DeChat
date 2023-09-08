package pi0;

import android.graphics.Canvas;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.BaseDrawActionArg;
import com.tencent.p014mm.plugin.appbrand.canvas.action.arg.DrawActionWrapper;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.C81602a;
import com.tencent.p014mm.plugin.appbrand.canvas.widget.DrawCanvasArg;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import qi0.C110408d;

/* renamed from: pi0.b */
public class C110222b implements C81602a {

    /* renamed from: d */
    public volatile boolean f329721d;

    /* renamed from: e */
    public JSONArray f329722e;

    /* renamed from: f */
    public volatile DrawCanvasArg f329723f;

    /* renamed from: g */
    public C110229d f329724g;

    /* renamed from: h */
    public C110228c f329725h;

    /* renamed from: i */
    public C81602a f329726i;

    /* renamed from: j */
    public volatile String f329727j;

    /* renamed from: n */
    public volatile boolean f329728n;

    /* renamed from: o */
    public Runnable f329729o = new C110223a();

    /* renamed from: p */
    public Runnable f329730p = new C110224b();

    /* renamed from: q */
    public volatile long f329731q;

    /* renamed from: r */
    public boolean f329732r = true;

    /* renamed from: s */
    public String f329733s;

    /* renamed from: pi0.b$a */
    public class C110223a implements Runnable {
        public C110223a() {
        }

        public void run() {
            C110222b.this.getClass();
            C110222b.this.f329728n = true;
        }
    }

    /* renamed from: pi0.b$b */
    public class C110224b implements Runnable {
        public C110224b() {
        }

        public void run() {
            boolean z = C110222b.this.f329728n;
            C110222b.this.f329728n = false;
            Log.m105925i("MicroMsg.DrawActionDelegateImpl", "preStae %b, hasChanged %b", Boolean.valueOf(z), Boolean.valueOf(C110222b.this.f329721d));
            if (z && C110222b.this.f329721d) {
                C110222b.this.f329726i.mo113883c();
            }
        }
    }

    /* renamed from: pi0.b$c */
    public class C110225c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONArray f329736d;

        /* renamed from: e */
        public final /* synthetic */ C81602a.C81603a f329737e;

        public C110225c(JSONArray jSONArray, C81602a.C81603a aVar) {
            this.f329736d = jSONArray;
            this.f329737e = aVar;
        }

        public void run() {
            DrawCanvasArg drawCanvasArg = C110222b.this.f329723f;
            C110222b.this.f329723f = null;
            C110222b bVar = C110222b.this;
            bVar.f329722e = this.f329736d;
            bVar.f329732r = true;
            bVar.f329721d = true;
            C81602a.C81603a aVar = this.f329737e;
            if (aVar != null) {
                aVar.mo113886a(drawCanvasArg);
            }
            C110222b bVar2 = C110222b.this;
            if (bVar2.f329731q != 0) {
                System.nanoTime();
                bVar2.f329731q = 0;
                bVar2.getClass();
            }
        }
    }

    /* renamed from: pi0.b$d */
    public class C110226d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JSONArray f329739d;

        /* renamed from: e */
        public final /* synthetic */ C81602a.C81603a f329740e;

        public C110226d(JSONArray jSONArray, C81602a.C81603a aVar) {
            this.f329739d = jSONArray;
            this.f329740e = aVar;
        }

        public void run() {
            C110222b bVar = C110222b.this;
            bVar.f329732r = true;
            if (bVar.f329722e == null) {
                bVar.f329722e = this.f329739d;
            } else {
                for (int i = 0; i < this.f329739d.length(); i++) {
                    C110222b.this.f329722e.put(this.f329739d.opt(i));
                }
            }
            C110222b.this.f329721d = true;
            C81602a.C81603a aVar = this.f329740e;
            if (aVar != null) {
                aVar.mo113886a((DrawCanvasArg) null);
            }
        }
    }

    /* renamed from: pi0.b$e */
    public static class C110227e implements C110221a {

        /* renamed from: a */
        public WeakReference<C81602a> f329742a;

        public C110227e(C81602a aVar) {
            this.f329742a = new WeakReference<>(aVar);
        }

        public void invalidate() {
            C81602a aVar = this.f329742a.get();
            if (aVar != null) {
                aVar.mo113883c();
            }
        }
    }

    public C110222b(C81602a aVar) {
        this.f329726i = aVar;
        this.f329724g = new C110229d(new C110227e(aVar));
        this.f329725h = new C110228c();
    }

    /* renamed from: a */
    public void mo113881a(JSONArray jSONArray, C81602a.C81603a aVar) {
        if (jSONArray != null && jSONArray.length() != 0) {
            this.f329726i.mo113884d(new C110226d(jSONArray, aVar));
        }
    }

    /* renamed from: b */
    public void mo113882b(JSONArray jSONArray, C81602a.C81603a aVar) {
        this.f329726i.mo113884d(new C110225c(jSONArray, aVar));
    }

    /* renamed from: c */
    public void mo113883c() {
    }

    /* renamed from: d */
    public void mo113884d(Runnable runnable) {
        if (!equals(this.f329726i)) {
            MMHandlerThread.postToMainThread(runnable);
        }
    }

    /* renamed from: e */
    public boolean mo113885e(Canvas canvas) {
        if (this.f329732r) {
            this.f329724g.f329753j = false;
            return mo161629f(canvas, this.f329722e);
        }
        this.f329724g.f329753j = true;
        if (this.f329723f == null) {
            this.f329721d = false;
            return false;
        }
        List<DrawActionWrapper> list = null;
        if (this.f329723f.f239270h) {
            this.f329723f.getClass();
            this.f329723f.getClass();
            return mo161629f(canvas, (JSONArray) null);
        }
        this.f329721d = false;
        if (this.f329723f != null) {
            list = this.f329723f.f239268f;
        }
        if (list == null || list.size() == 0) {
            return false;
        }
        System.nanoTime();
        this.f329724g.mo161636a();
        for (DrawActionWrapper next : list) {
            try {
                if (next != null) {
                    try {
                        int i = next.f311055d;
                        if (i == 1) {
                            this.f329725h.mo161635b(this.f329724g, canvas, next.f311057f);
                            throw new IllegalStateException("please use draw obj " + next.f311057f.toString());
                        } else if (i != 2) {
                            Log.m105929w("MicroMsg.DrawActionDelegateImpl", "unknown arg type %d", Integer.valueOf(i));
                        } else {
                            C110228c cVar = this.f329725h;
                            C110229d dVar = this.f329724g;
                            BaseDrawActionArg baseDrawActionArg = next.f311056e;
                            C110408d dVar2 = (C110408d) ((HashMap) cVar.f329743a).get(baseDrawActionArg.f311050d);
                            if (dVar2 != null) {
                                dVar2.mo161914a(dVar, canvas, baseDrawActionArg);
                            }
                        }
                    } catch (Exception e) {
                        Log.m105921e("MicroMsg.DrawActionDelegateImpl", "drawAction error, exception : %s", e);
                    }
                }
            } catch (Exception e2) {
                Log.printErrStackTrace("MicroMsg.DrawActionDelegateImpl", e2, "", new Object[0]);
            }
        }
        System.nanoTime();
        System.currentTimeMillis();
        return true;
    }

    /* renamed from: f */
    public final boolean mo161629f(Canvas canvas, JSONArray jSONArray) {
        this.f329721d = false;
        if (jSONArray == null || jSONArray.length() == 0) {
            return false;
        }
        System.nanoTime();
        this.f329724g.mo161636a();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                try {
                    this.f329725h.mo161635b(this.f329724g, canvas, optJSONObject);
                } catch (Exception e) {
                    Log.m105921e("MicroMsg.DrawActionDelegateImpl", "drawAction error with method[%s], exception : %s", optJSONObject.optString(FirebaseAnalytics.C113379b.METHOD), e);
                }
            }
        }
        System.nanoTime();
        System.currentTimeMillis();
        return true;
    }
}
