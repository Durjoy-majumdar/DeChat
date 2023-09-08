package com.tencent.p014mm.feature.performance;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import he2.C32870a;
import he2.C32871b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p723vf.C118672d;
import sx3.C110823p;
import sx3.C36907w;

/* renamed from: com.tencent.mm.feature.performance.q$$i */
public class q$$i implements Runnable {
    public q$$i(C80864q qVar) {
    }

    public void run() {
        C32871b.f89373a.getClass();
        C86009m1 m1Var = C32871b.f89375c;
        if (m1Var != null && !m1Var.mo119962b()) {
            Log.m105920e("MicroMsg.HprofCleaner", m1Var.mo119971i() + " not writable");
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            List z = C110823p.m151010z(C32871b.f89376d);
            ArrayList arrayList = new ArrayList(C36907w.m41090l(z, 10));
            Iterator it = ((ArrayList) z).iterator();
            while (it.hasNext()) {
                arrayList.add(new C86009m1((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object next = it4.next();
                C86009m1 m1Var2 = (C86009m1) next;
                if (m1Var2.mo119967g() && m1Var2.mo119977o()) {
                    arrayList2.add(next);
                }
            }
            Iterator it5 = arrayList2.iterator();
            while (it5.hasNext()) {
                C86009m1[] v = ((C86009m1) it5.next()).mo119985v(new C32870a(currentTimeMillis));
                if (v != null) {
                    for (C86009m1 m1Var3 : v) {
                        if (m1Var3.mo119967g() && m1Var3.mo119978p()) {
                            Log.m105924i("MicroMsg.HprofCleaner", "clean " + m1Var3.mo119971i() + ", last modify: " + m1Var3.mo119979q());
                            m1Var3.mo119966f();
                        }
                    }
                }
            }
        } catch (Throwable th) {
            C118672d.m167354d("MicroMsg.HprofCleaner", th, "", new Object[0]);
        }
    }
}
