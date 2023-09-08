package ej0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: ej0.a */
public class C58606a {

    /* renamed from: d */
    public static C58606a f167794d;

    /* renamed from: a */
    public boolean f167795a = false;

    /* renamed from: b */
    public Map<String, C86525c> f167796b = new HashMap();

    /* renamed from: c */
    public List<C58607a> f167797c = new ArrayList();

    /* renamed from: ej0.a$a */
    public interface C58607a {
        /* renamed from: n */
        void mo80100n(C86525c cVar);

        /* renamed from: q */
        void mo80102q(C86525c cVar);

        /* renamed from: t */
        void mo80103t(C86525c cVar);
    }

    /* renamed from: a */
    public static C58606a m68054a() {
        if (f167794d == null) {
            synchronized (C58606a.class) {
                if (f167794d == null) {
                    f167794d = new C58606a();
                }
            }
        }
        return f167794d;
    }

    /* renamed from: b */
    public void mo83497b(C58607a aVar) {
        if (!this.f167795a && !((ArrayList) this.f167797c).contains(aVar)) {
            ((ArrayList) this.f167797c).add(aVar);
        }
    }

    /* renamed from: c */
    public void mo83498c(String str) {
        if (!this.f167795a) {
            C86525c cVar = (C86525c) ((HashMap) this.f167796b).remove(str);
            int i = 0;
            while (i < ((ArrayList) this.f167797c).size()) {
                C58607a aVar = (C58607a) ((ArrayList) this.f167797c).get(i);
                if (aVar != null) {
                    aVar.mo80102q(cVar);
                    i++;
                } else {
                    ((ArrayList) this.f167797c).remove(i);
                }
            }
        }
    }

    /* renamed from: d */
    public void mo83499d(C58607a aVar) {
        ((ArrayList) this.f167797c).remove(aVar);
    }
}
