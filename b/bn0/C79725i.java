package bn0;

import android.os.ConditionVariable;
import bn0.C79714a;
import com.tencent.p014mm.vfs.C86009m1;
import dn0.C86358b;
import fn0.C87002g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;

/* renamed from: bn0.i */
public class C79725i implements C79714a {

    /* renamed from: a */
    public long f233669a;

    /* renamed from: b */
    public final C86009m1 f233670b;

    /* renamed from: c */
    public final C79720d f233671c;

    /* renamed from: d */
    public final HashMap<String, C79722f> f233672d = new HashMap<>();

    /* renamed from: e */
    public final HashMap<String, TreeSet<C79722f>> f233673e = new HashMap<>();

    /* renamed from: f */
    public final HashMap<String, ArrayList<C79714a.C79715a>> f233674f = new HashMap<>();

    /* renamed from: bn0.i$a */
    public class C79726a extends Thread {

        /* renamed from: d */
        public final /* synthetic */ ConditionVariable f233675d;

        public C79726a(ConditionVariable conditionVariable) {
            this.f233675d = conditionVariable;
        }

        public void run() {
            synchronized (C79725i.this) {
                this.f233675d.open();
                C79725i.m96858a(C79725i.this);
            }
        }
    }

    public C79725i(C86009m1 m1Var, C79720d dVar) {
        this.f233670b = m1Var;
        this.f233671c = dVar;
        ConditionVariable conditionVariable = new ConditionVariable();
        new C79726a(conditionVariable).start();
        conditionVariable.block();
    }

    /* renamed from: a */
    public static void m96858a(C79725i iVar) {
        if (!iVar.f233670b.mo119967g()) {
            iVar.f233670b.mo119987x();
        }
        C86009m1[] u = iVar.f233670b.mo119984u();
        if (u != null) {
            for (C86009m1 m1Var : u) {
                if (m1Var.mo119980r() == 0) {
                    m1Var.mo119966f();
                } else {
                    C79722f b = C79722f.m96852b(m1Var);
                    if (b == null) {
                        m1Var.mo119966f();
                    } else if (!iVar.mo109851b(b)) {
                        C87002g.m108023q(3, "SimpleCache", "remove duplicated span " + b.f233664j, (Throwable) null);
                        iVar.mo109855f(b);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo109851b(C79722f fVar) {
        TreeSet treeSet = this.f233673e.get(fVar.f233658d);
        if (treeSet == null) {
            treeSet = new TreeSet();
            this.f233673e.put(fVar.f233658d, treeSet);
        }
        boolean add = treeSet.add(fVar);
        this.f233669a += fVar.f233660f;
        ArrayList arrayList = this.f233674f.get(fVar.f233658d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C79714a.C79715a) arrayList.get(size)).mo109827a(this, fVar);
            }
        }
        ((C79724h) this.f233671c).mo109827a(this, fVar);
        return add;
    }

    /* renamed from: c */
    public synchronized NavigableSet<C79722f> mo109852c(String str) {
        TreeSet treeSet;
        treeSet = this.f233673e.get(str);
        return treeSet == null ? null : new TreeSet(treeSet);
    }

    /* renamed from: d */
    public final C79722f mo109853d(C79722f fVar) {
        String str = fVar.f233658d;
        long j = fVar.f233659e;
        TreeSet treeSet = this.f233673e.get(str);
        if (treeSet == null) {
            return new C79722f(str, fVar.f233659e, -1, -1, C86358b.f251077c, false, -1, (C86009m1) null);
        }
        C79722f fVar2 = (C79722f) treeSet.floor(fVar);
        if (fVar2 != null) {
            long j2 = fVar2.f233659e;
            if (j2 <= j && j < j2 + fVar2.f233660f) {
                if (fVar2.f233664j.mo119967g()) {
                    return fVar2;
                }
                mo109856g();
                return mo109853d(fVar);
            }
        }
        C79722f fVar3 = (C79722f) treeSet.ceiling(fVar);
        if (fVar3 == null) {
            return new C79722f(str, fVar.f233659e, -1, -1, C86358b.f251077c, false, -1, (C86009m1) null);
        }
        long j3 = fVar.f233659e;
        return new C79722f(str, j3, fVar3.f233659e - j3, -1, C86358b.f251077c, false, -1, (C86009m1) null);
    }

    /* renamed from: e */
    public final void mo109854e(C79722f fVar) {
        ArrayList arrayList = this.f233674f.get(fVar.f233658d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C79714a.C79715a) arrayList.get(size)).mo109828b(this, fVar);
            }
        }
        ((C79724h) this.f233671c).mo109828b(this, fVar);
    }

    /* renamed from: f */
    public synchronized void mo109855f(C79722f fVar) {
        TreeSet treeSet = this.f233673e.get(fVar.f233658d);
        this.f233669a -= fVar.f233660f;
        fVar.f233664j.mo119966f();
        if (treeSet == null || treeSet.isEmpty()) {
            this.f233673e.remove(fVar.f233658d);
        }
        mo109854e(fVar);
    }

    /* renamed from: g */
    public final void mo109856g() {
        Iterator<Map.Entry<String, TreeSet<C79722f>>> it = this.f233673e.entrySet().iterator();
        while (it.hasNext()) {
            Iterator it4 = ((TreeSet) it.next().getValue()).iterator();
            boolean z = true;
            while (it4.hasNext()) {
                C79722f fVar = (C79722f) it4.next();
                if (!fVar.f233664j.mo119967g()) {
                    it4.remove();
                    if (fVar.f233663i) {
                        this.f233669a -= fVar.f233660f;
                    }
                    mo109854e(fVar);
                } else {
                    z = false;
                }
            }
            if (z) {
                it.remove();
            }
        }
    }

    /* renamed from: h */
    public final synchronized C79722f mo109857h(C79722f fVar) {
        C79722f d = mo109853d(fVar);
        if (d.f233663i) {
            return d;
        }
        if (this.f233672d.containsKey(fVar.f233658d)) {
            return null;
        }
        this.f233672d.put(fVar.f233658d, d);
        return d;
    }
}
