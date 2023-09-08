package p1222y4;

import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import p1014o4.C117693m;
import p1014o4.C117696p;
import p1014o4.C117705u;
import p1206p4.C117970c;
import p1206p4.C117971d;
import p1206p4.C117973e;
import p1206p4.C117979k;
import p1206p4.C117982n;
import p1221x4.C118827b;
import p1221x4.C118828c;
import p1221x4.C118849p;
import p1221x4.C118850q;

/* renamed from: y4.d */
public abstract class C118919d implements Runnable {

    /* renamed from: d */
    public final C117970c f356197d = new C117970c();

    /* renamed from: a */
    public void mo183601a(C117979k kVar, String str) {
        boolean z;
        WorkDatabase workDatabase = kVar.f352606c;
        C118849p n = workDatabase.mo165532n();
        C118827b i = workDatabase.mo165527i();
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (true) {
            z = true;
            if (linkedList.isEmpty()) {
                break;
            }
            String str2 = (String) linkedList.remove();
            C118850q qVar = (C118850q) n;
            C117705u f = qVar.mo183557f(str2);
            if (!(f == C117705u.SUCCEEDED || f == C117705u.FAILED)) {
                qVar.mo183567p(C117705u.CANCELLED, str2);
            }
            linkedList.addAll(((C118828c) i).mo183529a(str2));
        }
        C117971d dVar = kVar.f352609f;
        synchronized (dVar.f352583q) {
            C117693m.m165966c().mo182389a(C117971d.f352572r, String.format("Processor cancelling %s", new Object[]{str}), new Throwable[0]);
            ((HashSet) dVar.f352581o).add(str);
            C117982n nVar = (C117982n) ((HashMap) dVar.f352578i).remove(str);
            if (nVar == null) {
                z = false;
            }
            if (nVar == null) {
                nVar = (C117982n) ((HashMap) dVar.f352579j).remove(str);
            }
            C117971d.m166368b(str, nVar);
            if (z) {
                dVar.mo182726g();
            }
        }
        for (C117973e a : kVar.f352608e) {
            a.mo182730a(str);
        }
    }

    /* renamed from: b */
    public abstract void mo183600b();

    public void run() {
        try {
            mo183600b();
            this.f356197d.mo182721a(C117696p.f352024a);
        } catch (Throwable th) {
            this.f356197d.mo182721a(new C117696p.C117698b.C117699a(th));
        }
    }
}
