package com.tencent.p014mm.plugin.appbrand.jsruntime;

import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.appbrand.p942v8.IJSRuntime;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83156e;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83174m;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83179p;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p774zg.C91749x;

/* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.a */
public abstract class C83139a extends C83148d implements C83165i, C83185u, C83174m, C83179p {

    /* renamed from: f */
    public final IJSRuntime f242938f;

    /* renamed from: g */
    public final C80669j f242939g;

    /* renamed from: h */
    public final C83156e f242940h;

    /* renamed from: i */
    public ArrayList<C83174m.C83175a> f242941i;

    /* renamed from: j */
    public ArrayList<C83174m.C83175a> f242942j;

    /* renamed from: n */
    public final Object f242943n;

    /* renamed from: o */
    public ArrayList<C83179p.C83180a> f242944o;

    /* renamed from: p */
    public final boolean f242945p;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.a$a */
    public class C83140a implements Runnable {
        public C83140a() {
        }

        public void run() {
            ArrayList arrayList;
            synchronized (C83139a.this.f242943n) {
                arrayList = new ArrayList(C83139a.this.f242944o);
                C83139a.this.f242944o.clear();
                C83139a.this.f242944o = null;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C83179p.C83180a) it.next()).mo115436a();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.a$b */
    public class C83141b implements C83156e.C83157a {
        public C83141b() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsruntime.a$c */
    public class C83142c implements Runnable {
        public C83142c() {
        }

        public void run() {
            ArrayList arrayList;
            synchronized (C83139a.this) {
                arrayList = new ArrayList(C83139a.this.f242941i);
                arrayList.addAll(C83139a.this.f242942j);
                C83139a.this.f242941i.clear();
                C83139a.this.f242942j.clear();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                C83174m.C83175a aVar = (C83174m.C83175a) arrayList.get(i);
                if (aVar != null) {
                    aVar.onDestroy();
                }
            }
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED) {
                synchronized (C83139a.this) {
                    if (C83139a.this.f242941i.size() != 0 || C83139a.this.f242942j.size() != 0) {
                        throw new IllegalStateException("OnDestroyListener execute failed. Add Destroy listener recursively is forbidden.");
                    }
                }
            }
        }
    }

    public C83139a() {
        this((IJSRuntime.Config) null);
    }

    /* renamed from: C */
    public final List<? extends C40480g> mo115373C(boolean z) {
        C83156e eVar = this.f242940h;
        eVar.getClass();
        LinkedList linkedList = new LinkedList();
        synchronized (eVar.f242969c) {
            for (int i = 0; i < eVar.f242969c.size(); i++) {
                C83148d valueAt = eVar.f242969c.valueAt(i);
                if (!valueAt.mo63262w() || z) {
                    linkedList.add(valueAt);
                }
            }
        }
        return linkedList;
    }

    /* renamed from: E0 */
    public final void mo115374E0(C83179p.C83180a aVar) {
        if (aVar != null) {
            synchronized (this.f242943n) {
                ArrayList<C83179p.C83180a> arrayList = this.f242944o;
                if (arrayList != null) {
                    arrayList.add(aVar);
                }
            }
        }
    }

    /* renamed from: F0 */
    public final C40480g mo115375F0(int i) {
        C40480g gVar;
        C83156e eVar = this.f242940h;
        synchronized (eVar.f242969c) {
            gVar = eVar.f242969c.get(i);
        }
        return gVar;
    }

    /* renamed from: I */
    public final void mo115376I(int i) {
        C83148d dVar;
        C83156e eVar = this.f242940h;
        eVar.getClass();
        Log.m105925i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyJsContext id:%d", Integer.valueOf(i));
        synchronized (eVar.f242969c) {
            dVar = eVar.f242969c.get(i);
            eVar.f242969c.delete(i);
        }
        if (dVar != null) {
            dVar.destroy();
        }
    }

    /* renamed from: L */
    public C40480g mo115377L(int i) {
        C83156e eVar = this.f242940h;
        int incrementAndGet = eVar.f242968b.incrementAndGet();
        C83161f fVar = new C83161f(C83139a.this.f242938f.mo112431B(incrementAndGet, i), incrementAndGet);
        if (fVar.f242977g.mo112501e() == null) {
            return null;
        }
        synchronized (eVar.f242969c) {
            eVar.f242969c.put(incrementAndGet, fVar);
        }
        Log.m105925i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContextFromSnapshot id:%d, index: %d", Integer.valueOf(incrementAndGet), Integer.valueOf(i));
        return fVar;
    }

    /* renamed from: X */
    public final C40480g mo115378X() {
        C83156e eVar = this.f242940h;
        int incrementAndGet = eVar.f242968b.incrementAndGet();
        C83161f fVar = new C83161f(C83139a.this.f242938f.mo112451w(incrementAndGet), incrementAndGet);
        synchronized (eVar.f242969c) {
            eVar.f242969c.put(incrementAndGet, fVar);
        }
        C80669j jVar = fVar.f242977g;
        jVar.f236041b.mo112450v(new C91749x(jVar, eVar.f242970d));
        Log.m105925i("MicroMsg.AppBrandJ2V8ContextMgr", "allocJsContext id:%d", Integer.valueOf(incrementAndGet));
        return fVar;
    }

    public void destroy() {
        this.f242939g.f236041b.mo112452x(new C83142c());
        C83156e eVar = this.f242940h;
        synchronized (eVar.f242969c) {
            for (int i = 0; i < eVar.f242969c.size(); i++) {
                int keyAt = eVar.f242969c.keyAt(i);
                if (keyAt != 1) {
                    Log.m105925i("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d", Integer.valueOf(keyAt));
                    if (eVar.f242969c.get(keyAt) == null) {
                        Log.m105929w("MicroMsg.AppBrandJ2V8ContextMgr", "destroyRestButNotMainContext contextId:%d null", Integer.valueOf(keyAt));
                    } else {
                        eVar.f242969c.get(keyAt).destroy();
                    }
                }
            }
            eVar.f242969c.clear();
        }
        super.destroy();
        this.f242938f.quit();
    }

    /* renamed from: f1 */
    public synchronized void mo115379f1(C83174m.C83175a aVar, boolean z) {
        if (z) {
            this.f242942j.add(aVar);
        } else {
            this.f242941i.add(aVar);
        }
    }

    public final int getContextId() {
        return 1;
    }

    /* renamed from: n0 */
    public final <T extends C40481j> T mo63321n0(Class<T> cls) {
        if ((cls != C83176n.class || this.f242945p) && cls.isInstance(this)) {
            return this;
        }
        return null;
    }

    public void setJsExceptionHandler(C83164h hVar) {
        this.f242939g.f236041b.mo112430A(1, hVar);
    }

    /* renamed from: t1 */
    public IJSRuntime mo115380t1() {
        return this.f242938f;
    }

    /* renamed from: u1 */
    public final C80669j mo115381u1() {
        return this.f242939g;
    }

    /* renamed from: v1 */
    public abstract IJSRuntime mo73002v1(IJSRuntime.Config config);

    /* renamed from: w */
    public final boolean mo63262w() {
        return true;
    }

    /* renamed from: w1 */
    public abstract C80669j mo115382w1(IJSRuntime iJSRuntime, int i);

    /* renamed from: z */
    public final C40480g mo115383z() {
        C40480g gVar;
        C83156e eVar = this.f242940h;
        synchronized (eVar.f242969c) {
            gVar = eVar.f242969c.get(1);
        }
        return gVar;
    }

    /* renamed from: z0 */
    public synchronized void mo115384z0(C83174m.C83175a aVar) {
        mo115379f1(aVar, false);
    }

    public C83139a(IJSRuntime.Config config) {
        this.f242941i = new ArrayList<>();
        this.f242942j = new ArrayList<>();
        this.f242943n = new byte[0];
        this.f242944o = new ArrayList<>();
        IJSRuntime v1 = mo73002v1(config);
        this.f242938f = v1;
        this.f242945p = config != null && config.f235979g;
        C80669j w1 = mo115382w1(v1, 1);
        this.f242939g = w1;
        v1.mo112450v(new C83140a());
        C83156e eVar = new C83156e(new C83141b());
        this.f242940h = eVar;
        Log.m105925i("MicroMsg.AppBrandJ2V8ContextMgr", "setMainContext id:%d", 1);
        synchronized (eVar.f242969c) {
            eVar.f242969c.put(1, this);
        }
        w1.f236041b.mo112450v(new C91749x(w1, eVar.f242970d));
    }
}
