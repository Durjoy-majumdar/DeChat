package p1209q4;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.C113038a;
import androidx.work.WorkerParameters;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p1014o4.C117693m;
import p1014o4.C117705u;
import p1169a5.C112757a;
import p1206p4.C117968a;
import p1206p4.C117969b;
import p1206p4.C117973e;
import p1206p4.C117979k;
import p1214t4.C118384c;
import p1214t4.C118385d;
import p1221x4.C118847o;
import p1222y4.C118924i;

/* renamed from: q4.c */
public class C118168c implements C117973e, C118384c, C117969b {

    /* renamed from: o */
    public static final String f353204o = C117693m.m165967e("GreedyScheduler");

    /* renamed from: d */
    public final Context f353205d;

    /* renamed from: e */
    public final C117979k f353206e;

    /* renamed from: f */
    public final C118385d f353207f;

    /* renamed from: g */
    public final Set<C118847o> f353208g = new HashSet();

    /* renamed from: h */
    public C118167b f353209h;

    /* renamed from: i */
    public boolean f353210i;

    /* renamed from: j */
    public final Object f353211j;

    /* renamed from: n */
    public Boolean f353212n;

    public C118168c(Context context, C113038a aVar, C112757a aVar2, C117979k kVar) {
        this.f353205d = context;
        this.f353206e = kVar;
        this.f353207f = new C118385d(context, aVar2, this);
        this.f353209h = new C118167b(this, aVar.f338348e);
        this.f353211j = new Object();
    }

    /* renamed from: a */
    public void mo182730a(String str) {
        Runnable runnable;
        if (this.f353212n == null) {
            this.f353212n = Boolean.valueOf(C118924i.m167678a(this.f353205d, this.f353206e.f352605b));
        }
        if (!this.f353212n.booleanValue()) {
            C117693m.m165966c().mo182391d(f353204o, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f353210i) {
            this.f353206e.f352609f.mo182722a(this);
            this.f353210i = true;
        }
        C117693m.m165966c().mo182389a(f353204o, String.format("Cancelling work ID %s", new Object[]{str}), new Throwable[0]);
        C118167b bVar = this.f353209h;
        if (!(bVar == null || (runnable = (Runnable) ((HashMap) bVar.f353203c).remove(str)) == null)) {
            ((C117968a) bVar.f353202b).f352569a.removeCallbacks(runnable);
        }
        this.f353206e.mo182737g(str);
    }

    /* renamed from: b */
    public boolean mo182731b() {
        return false;
    }

    /* renamed from: c */
    public void mo182732c(C118847o... oVarArr) {
        if (this.f353212n == null) {
            this.f353212n = Boolean.valueOf(C118924i.m167678a(this.f353205d, this.f353206e.f352605b));
        }
        if (!this.f353212n.booleanValue()) {
            C117693m.m165966c().mo182391d(f353204o, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f353210i) {
            this.f353206e.f352609f.mo182722a(this);
            this.f353210i = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (C118847o oVar : oVarArr) {
            long a = oVar.mo183544a();
            long currentTimeMillis = System.currentTimeMillis();
            if (oVar.f355542b == C117705u.ENQUEUED) {
                if (currentTimeMillis < a) {
                    C118167b bVar = this.f353209h;
                    if (bVar != null) {
                        Runnable runnable = (Runnable) ((HashMap) bVar.f353203c).remove(oVar.f355541a);
                        if (runnable != null) {
                            ((C117968a) bVar.f353202b).f352569a.removeCallbacks(runnable);
                        }
                        C118166a aVar = new C118166a(bVar, oVar);
                        ((HashMap) bVar.f353203c).put(oVar.f355541a, aVar);
                        ((C117968a) bVar.f353202b).f352569a.postDelayed(aVar, oVar.mo183544a() - System.currentTimeMillis());
                    }
                } else if (oVar.mo183545b()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i < 23 || !oVar.f355550j.f351997c) {
                        if (i >= 24) {
                            if (((HashSet) oVar.f355550j.f352002h.f352004a).size() > 0) {
                                C117693m.m165966c().mo182389a(f353204o, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", new Object[]{oVar}), new Throwable[0]);
                            }
                        }
                        hashSet.add(oVar);
                        hashSet2.add(oVar.f355541a);
                    } else {
                        C117693m.m165966c().mo182389a(f353204o, String.format("Ignoring WorkSpec %s, Requires device idle.", new Object[]{oVar}), new Throwable[0]);
                    }
                } else {
                    C117693m.m165966c().mo182389a(f353204o, String.format("Starting work for %s", new Object[]{oVar.f355541a}), new Throwable[0]);
                    this.f353206e.mo182736f(oVar.f355541a, (WorkerParameters.C113037a) null);
                }
            }
        }
        synchronized (this.f353211j) {
            if (!hashSet.isEmpty()) {
                C117693m.m165966c().mo182389a(f353204o, String.format("Starting tracking for [%s]", new Object[]{TextUtils.join(",", hashSet2)}), new Throwable[0]);
                this.f353208g.addAll(hashSet);
                this.f353207f.mo183175b(this.f353208g);
            }
        }
    }

    /* renamed from: d */
    public void mo165549d(List<String> list) {
        for (String next : list) {
            C117693m.m165966c().mo182389a(f353204o, String.format("Constraints not met: Cancelling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f353206e.mo182737g(next);
        }
    }

    /* renamed from: e */
    public void mo165545e(String str, boolean z) {
        synchronized (this.f353211j) {
            Iterator it = ((HashSet) this.f353208g).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C118847o oVar = (C118847o) it.next();
                if (oVar.f355541a.equals(str)) {
                    C117693m.m165966c().mo182389a(f353204o, String.format("Stopping tracking for %s", new Object[]{str}), new Throwable[0]);
                    ((HashSet) this.f353208g).remove(oVar);
                    this.f353207f.mo183175b(this.f353208g);
                    break;
                }
            }
        }
    }

    /* renamed from: f */
    public void mo165550f(List<String> list) {
        for (String next : list) {
            C117693m.m165966c().mo182389a(f353204o, String.format("Constraints met: Scheduling work ID %s", new Object[]{next}), new Throwable[0]);
            this.f353206e.mo182736f(next, (WorkerParameters.C113037a) null);
        }
    }
}
