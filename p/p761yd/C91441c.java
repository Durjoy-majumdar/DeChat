package p761yd;

import android.app.Application;
import com.tencent.matrix.lifecycle.C80414k;
import com.tencent.matrix.lifecycle.C80504z;
import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import java.util.HashSet;
import java.util.Iterator;
import p1060we.C90970b;
import p1060we.C90971c;

/* renamed from: yd.c */
public class C91441c {

    /* renamed from: c */
    public static volatile C91441c f262166c;

    /* renamed from: a */
    public final HashSet<C90970b> f262167a;

    /* renamed from: b */
    public final Application f262168b;

    /* renamed from: yd.c$b */
    public static class C91443b {

        /* renamed from: a */
        public final Application f262169a;

        /* renamed from: b */
        public C90971c f262170b;

        /* renamed from: c */
        public C80414k f262171c = new C80414k();

        /* renamed from: d */
        public final HashSet<C90970b> f262172d = new HashSet<>();

        public C91443b(Application application) {
            if (application != null) {
                this.f262169a = application;
                return;
            }
            throw new RuntimeException("matrix init, application is null");
        }

        /* renamed from: a */
        public C91443b mo125379a(C90970b bVar) {
            String b = bVar.mo112098b();
            Iterator<C90970b> it = this.f262172d.iterator();
            while (it.hasNext()) {
                if (b.equals(it.next().mo112098b())) {
                    throw new RuntimeException(String.format("plugin with tag %s is already exist", new Object[]{b}));
                }
            }
            this.f262172d.add(bVar);
            return this;
        }
    }

    public C91441c(Application application, C90971c cVar, HashSet hashSet, C80414k kVar, C91442a aVar) {
        this.f262168b = application;
        this.f262167a = hashSet;
        C80504z.m98067a(application, kVar);
        ProcessSupervisor.f235421k.mo111976c(application, kVar.f235352a);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((C90970b) it.next()).mo112099c(this.f262168b, cVar);
        }
    }

    /* renamed from: c */
    public static boolean m114729c() {
        return f262166c != null;
    }

    /* renamed from: d */
    public static C91441c m114730d() {
        if (f262166c != null) {
            return f262166c;
        }
        throw new RuntimeException("you must init Matrix sdk first");
    }

    /* renamed from: a */
    public <T extends C90970b> T mo125377a(Class<T> cls) {
        String name = cls.getName();
        Iterator<C90970b> it = this.f262167a.iterator();
        while (it.hasNext()) {
            T t = (C90970b) it.next();
            if (t.getClass().getName().equals(name)) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: b */
    public C90970b mo125378b(String str) {
        Iterator<C90970b> it = this.f262167a.iterator();
        while (it.hasNext()) {
            C90970b next = it.next();
            if (next.mo112098b().equals(str)) {
                return next;
            }
        }
        return null;
    }
}
