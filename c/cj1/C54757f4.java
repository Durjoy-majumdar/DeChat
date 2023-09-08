package cj1;

import cj1.C54847z3;
import com.tencent.p014mm.sdk.platformtools.Log;
import it1.C60625c;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import pe3.C47465a;
import sx3.C64175a0;
import te3.C49335eu3;

/* renamed from: cj1.f4 */
public final class C54757f4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C54847z3 f153476d;

    public C54757f4(C54847z3 z3Var) {
        this.f153476d = z3Var;
    }

    /* renamed from: a */
    public static final boolean m61614a(int i, List<Integer> list) {
        boolean z = false;
        for (Number intValue : list) {
            if (intValue.intValue() == i) {
                z = true;
            }
        }
        return z;
    }

    public final void run() {
        Log.m105924i("MicroMsg.FinderLivePollingService", "release before " + this.f153476d.mo75797c());
        C54847z3 z3Var = this.f153476d;
        z3Var.f153758g.removeCallbacks(z3Var.f153759h);
        if (!this.f153476d.f153756e.isEmpty()) {
            C54847z3 z3Var2 = this.f153476d;
            List<Integer> list = z3Var2.f153756e;
            C64175a0.m75511s(z3Var2.f153752a, new C54746d4(list));
            Iterator<Map.Entry<Integer, C54847z3.C54848a<? extends C47465a>>> it = z3Var2.f153753b.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                if (!m61614a(((C54847z3.C54848a) next.getValue()).f153760d, list)) {
                    C60625c<? extends C49335eu3> cVar = ((C54847z3.C54848a) next.getValue()).f153765i;
                    if (cVar != null) {
                        cVar.mo85581g();
                    }
                    it.remove();
                }
            }
            LinkedList<Number> linkedList = new LinkedList<>();
            int size = z3Var2.f153754c.size();
            for (int i = 0; i < size; i++) {
                int keyAt = z3Var2.f153754c.keyAt(i);
                if (!m61614a(keyAt, list)) {
                    linkedList.add(Integer.valueOf(keyAt));
                }
            }
            for (Number intValue : linkedList) {
                z3Var2.f153754c.remove(intValue.intValue());
            }
            C64175a0.m75512t(z3Var2.f153755d, new C54750e4(list));
            Log.m105924i("MicroMsg.FinderLivePollingService", "releaseIgnoreCmdId after " + z3Var2.mo75797c());
            return;
        }
        C54847z3 z3Var3 = this.f153476d;
        z3Var3.f153757f = null;
        z3Var3.f153752a.clear();
        for (C54847z3.C54848a aVar : z3Var3.f153753b.values()) {
            C60625c<? extends C49335eu3> cVar2 = aVar.f153765i;
            if (cVar2 != null) {
                cVar2.mo85581g();
            }
        }
        z3Var3.f153753b.clear();
        z3Var3.f153754c.clear();
        ((LinkedList) z3Var3.f153755d).clear();
        Log.m105924i("MicroMsg.FinderLivePollingService", "releaseIgnoreCmdId after " + z3Var3.mo75797c());
    }
}
