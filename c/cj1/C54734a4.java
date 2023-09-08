package cj1;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: cj1.a4 */
public final class C54734a4 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ List<Integer> f153395d;

    /* renamed from: e */
    public final /* synthetic */ C54847z3 f153396e;

    public C54734a4(List<Integer> list, C54847z3 z3Var) {
        this.f153395d = list;
        this.f153396e = z3Var;
    }

    public final void run() {
        boolean z;
        if (this.f153395d.size() == ((LinkedList) this.f153396e.f153755d).size()) {
            List<Integer> list = this.f153395d;
            C54847z3 z3Var = this.f153396e;
            z = true;
            for (Number intValue : list) {
                int intValue2 = intValue.intValue();
                if (!((LinkedList) z3Var.f153755d).contains(Integer.valueOf(intValue2))) {
                    z = false;
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("enableCmdIds old: ");
            C54847z3 z3Var2 = this.f153396e;
            sb.append(z3Var2.mo75798d(z3Var2.f153755d));
            sb.append(" new:");
            sb.append(this.f153396e.mo75798d(this.f153395d));
            sb.append(' ');
            sb.append(this.f153396e.mo75797c());
            Log.m105924i("MicroMsg.FinderLivePollingService", sb.toString());
            List<Integer> list2 = this.f153395d;
            C54847z3 z3Var3 = this.f153396e;
            ArrayList<Number> arrayList = new ArrayList<>();
            for (T next : list2) {
                int intValue3 = ((Number) next).intValue();
                if (!((LinkedList) z3Var3.f153755d).contains(Integer.valueOf(intValue3))) {
                    arrayList.add(next);
                }
            }
            C54847z3 z3Var4 = this.f153396e;
            for (Number intValue4 : arrayList) {
                z3Var4.mo75801g(intValue4.intValue(), false, true);
            }
            List<Integer> list3 = this.f153396e.f153755d;
            List<Integer> list4 = this.f153395d;
            ArrayList<Number> arrayList2 = new ArrayList<>();
            for (T next2 : list3) {
                if (!list4.contains(Integer.valueOf(((Number) next2).intValue()))) {
                    arrayList2.add(next2);
                }
            }
            C54847z3 z3Var5 = this.f153396e;
            for (Number intValue5 : arrayList2) {
                z3Var5.mo75801g(intValue5.intValue(), true, false);
            }
            ((LinkedList) this.f153396e.f153755d).clear();
            ((LinkedList) this.f153396e.f153755d).addAll(this.f153395d);
            C54847z3.m61835b(this.f153396e);
        }
    }
}
