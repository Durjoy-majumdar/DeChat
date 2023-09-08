package p1223z3;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p1168a4.C112754a;
import p1188d4.C116562b;
import p1188d4.C116563c;
import p1188d4.C116568e;
import p1191e4.C116683a;
import p1191e4.C116685b;

/* renamed from: z3.g */
public abstract class C119038g {
    @Deprecated

    /* renamed from: a */
    public volatile C116562b f356517a;

    /* renamed from: b */
    public Executor f356518b;

    /* renamed from: c */
    public C116563c f356519c;

    /* renamed from: d */
    public final C119033f f356520d;

    /* renamed from: e */
    public boolean f356521e;

    /* renamed from: f */
    public boolean f356522f;
    @Deprecated

    /* renamed from: g */
    public List<C119040b> f356523g;

    /* renamed from: h */
    public final ReentrantReadWriteLock f356524h = new ReentrantReadWriteLock();

    /* renamed from: i */
    public final ThreadLocal<Integer> f356525i = new ThreadLocal<>();

    /* renamed from: z3.g$a */
    public static class C119039a<T extends C119038g> {

        /* renamed from: a */
        public final Class<T> f356526a;

        /* renamed from: b */
        public final String f356527b;

        /* renamed from: c */
        public final Context f356528c;

        /* renamed from: d */
        public ArrayList<C119040b> f356529d;

        /* renamed from: e */
        public Executor f356530e;

        /* renamed from: f */
        public Executor f356531f;

        /* renamed from: g */
        public C116563c.C116566c f356532g;

        /* renamed from: h */
        public boolean f356533h;

        /* renamed from: i */
        public boolean f356534i = true;

        /* renamed from: j */
        public boolean f356535j;

        /* renamed from: k */
        public final C119042d f356536k = new C119042d();

        /* renamed from: l */
        public Set<Integer> f356537l;

        public C119039a(Context context, Class<T> cls, String str) {
            this.f356528c = context;
            this.f356526a = cls;
            this.f356527b = str;
        }

        /* renamed from: a */
        public C119039a<T> mo183707a(C112754a... aVarArr) {
            if (this.f356537l == null) {
                this.f356537l = new HashSet();
            }
            for (C112754a aVar : aVarArr) {
                this.f356537l.add(Integer.valueOf(aVar.f337628a));
                this.f356537l.add(Integer.valueOf(aVar.f337629b));
            }
            C119042d dVar = this.f356536k;
            dVar.getClass();
            for (C112754a aVar2 : aVarArr) {
                int i = aVar2.f337628a;
                int i2 = aVar2.f337629b;
                TreeMap treeMap = dVar.f356541a.get(Integer.valueOf(i));
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    dVar.f356541a.put(Integer.valueOf(i), treeMap);
                }
                C112754a aVar3 = (C112754a) treeMap.get(Integer.valueOf(i2));
                if (aVar3 != null) {
                    aVar3.toString();
                    aVar2.toString();
                }
                treeMap.put(Integer.valueOf(i2), aVar2);
            }
            return this;
        }
    }

    /* renamed from: z3.g$b */
    public static abstract class C119040b {
        /* renamed from: a */
        public void mo182733a(C116562b bVar) {
        }
    }

    /* renamed from: z3.g$c */
    public enum C119041c {
        TRUNCATE,
        WRITE_AHEAD_LOGGING
    }

    /* renamed from: z3.g$d */
    public static class C119042d {

        /* renamed from: a */
        public HashMap<Integer, TreeMap<Integer, C112754a>> f356541a = new HashMap<>();
    }

    public C119038g() {
        new ConcurrentHashMap();
        this.f356520d = mo165534d();
    }

    /* renamed from: a */
    public void mo183701a() {
        if (!this.f356521e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
            }
        }
    }

    /* renamed from: b */
    public void mo183702b() {
        if (!((C116683a) this.f356519c.mo180540K()).f349940d.inTransaction() && this.f356525i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: c */
    public void mo183703c() {
        mo183701a();
        C116562b K = this.f356519c.mo180540K();
        this.f356520d.mo183696c(K);
        ((C116683a) K).mo180682a();
    }

    /* renamed from: d */
    public abstract C119033f mo165534d();

    /* renamed from: e */
    public abstract C116563c mo165535e(C119028a aVar);

    @Deprecated
    /* renamed from: f */
    public void mo183704f() {
        ((C116683a) this.f356519c.mo180540K()).mo180683b();
        if (!((C116683a) this.f356519c.mo180540K()).f349940d.inTransaction()) {
            C119033f fVar = this.f356520d;
            if (fVar.f356505e.compareAndSet(false, true)) {
                fVar.f356504d.f356518b.execute(fVar.f356510j);
            }
        }
    }

    /* renamed from: g */
    public Cursor mo183705g(C116568e eVar, CancellationSignal cancellationSignal) {
        mo183701a();
        mo183702b();
        if (cancellationSignal == null) {
            return ((C116683a) this.f356519c.mo180540K()).mo180686d(eVar);
        }
        C116683a aVar = (C116683a) this.f356519c.mo180540K();
        return aVar.f349940d.rawQueryWithFactory(new C116685b(aVar, eVar), eVar.mo180538a(), C116683a.f349939e, (String) null, cancellationSignal);
    }

    @Deprecated
    /* renamed from: h */
    public void mo183706h() {
        ((C116683a) this.f356519c.mo180540K()).mo180688g();
    }
}
