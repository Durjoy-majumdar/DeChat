package p1206p4;

import android.os.Build;
import androidx.work.C113038a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p1014o4.C117693m;
import p1221x4.C118847o;
import p1221x4.C118849p;
import p1221x4.C118850q;

/* renamed from: p4.f */
public class C117974f {

    /* renamed from: a */
    public static final String f352587a = C117693m.m165967e("Schedulers");

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m166380a(C113038a aVar, WorkDatabase workDatabase, List<C117973e> list) {
        if (list != null && list.size() != 0) {
            C118849p n = workDatabase.mo165532n();
            workDatabase.mo183703c();
            try {
                C118850q qVar = (C118850q) n;
                List<C118847o> c = qVar.mo183554c(Build.VERSION.SDK_INT == 23 ? aVar.f338351h / 2 : aVar.f338351h);
                List<C118847o> b = qVar.mo183553b(200);
                if (((ArrayList) c).size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = ((ArrayList) c).iterator();
                    while (it.hasNext()) {
                        qVar.mo183563l(((C118847o) it.next()).f355541a, currentTimeMillis);
                    }
                }
                workDatabase.mo183706h();
                workDatabase.mo183704f();
                ArrayList arrayList = (ArrayList) c;
                if (arrayList.size() > 0) {
                    C118847o[] oVarArr = (C118847o[]) arrayList.toArray(new C118847o[arrayList.size()]);
                    for (C117973e next : list) {
                        if (next.mo182731b()) {
                            next.mo182732c(oVarArr);
                        }
                    }
                }
                ArrayList arrayList2 = (ArrayList) b;
                if (arrayList2.size() > 0) {
                    C118847o[] oVarArr2 = (C118847o[]) arrayList2.toArray(new C118847o[arrayList2.size()]);
                    for (C117973e next2 : list) {
                        if (!next2.mo182731b()) {
                            next2.mo182732c(oVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.mo183704f();
                throw th;
            }
        }
    }
}
