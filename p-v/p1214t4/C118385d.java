package p1214t4;

import android.content.Context;
import java.util.ArrayList;
import p1014o4.C117693m;
import p1169a5.C112757a;
import p1215u4.C118577a;
import p1215u4.C118578b;
import p1215u4.C118579c;
import p1215u4.C118581d;
import p1215u4.C118582e;
import p1215u4.C118583f;
import p1215u4.C118584g;
import p1215u4.C118585h;
import p1218v4.C118655d;
import p1221x4.C118847o;

/* renamed from: t4.d */
public class C118385d implements C118579c.C118580a {

    /* renamed from: d */
    public static final String f353792d = C117693m.m165967e("WorkConstraintsTracker");

    /* renamed from: a */
    public final C118384c f353793a;

    /* renamed from: b */
    public final C118579c<?>[] f353794b;

    /* renamed from: c */
    public final Object f353795c = new Object();

    public C118385d(Context context, C112757a aVar, C118384c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f353793a = cVar;
        this.f353794b = new C118579c[]{new C118577a(applicationContext, aVar), new C118578b(applicationContext, aVar), new C118585h(applicationContext, aVar), new C118581d(applicationContext, aVar), new C118584g(applicationContext, aVar), new C118583f(applicationContext, aVar), new C118582e(applicationContext, aVar)};
    }

    /* renamed from: a */
    public boolean mo183174a(String str) {
        synchronized (this.f353795c) {
            for (C118579c<?> cVar : this.f353794b) {
                T t = cVar.f354873b;
                if (t != null && cVar.mo183333c(t) && ((ArrayList) cVar.f354872a).contains(str)) {
                    C117693m.m165966c().mo182389a(f353792d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public void mo183175b(Iterable<C118847o> iterable) {
        synchronized (this.f353795c) {
            for (C118579c<?> cVar : this.f353794b) {
                if (cVar.f354875d != null) {
                    cVar.f354875d = null;
                    cVar.mo183335e((C118579c.C118580a) null, cVar.f354873b);
                }
            }
            for (C118579c<?> d : this.f353794b) {
                d.mo183334d(iterable);
            }
            for (C118579c<?> cVar2 : this.f353794b) {
                if (cVar2.f354875d != this) {
                    cVar2.f354875d = this;
                    cVar2.mo183335e(this, cVar2.f354873b);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo183176c() {
        synchronized (this.f353795c) {
            for (C118579c<?> cVar : this.f353794b) {
                if (!((ArrayList) cVar.f354872a).isEmpty()) {
                    ((ArrayList) cVar.f354872a).clear();
                    C118655d<T> dVar = cVar.f354874c;
                    synchronized (dVar.f355049c) {
                        if (dVar.f355050d.remove(cVar) && dVar.f355050d.isEmpty()) {
                            dVar.mo183378d();
                        }
                    }
                }
            }
        }
    }
}
