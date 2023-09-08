package dp1;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C46525m1;
import o40.C61926c;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C36907w;
import te3.C49712hj1;
import te3.db4;

/* renamed from: dp1.m1 */
public final class C58389m1 {

    /* renamed from: a */
    public static final C58389m1 f167287a = new C58389m1();

    /* renamed from: dp1.m1$a */
    public static final class C58390a<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ LinkedList<db4> f167288a;

        /* renamed from: b */
        public final /* synthetic */ LinkedList<db4> f167289b;

        /* renamed from: c */
        public final /* synthetic */ C49712hj1 f167290c;

        /* renamed from: d */
        public final /* synthetic */ int f167291d;

        public C58390a(LinkedList<db4> linkedList, LinkedList<db4> linkedList2, C49712hj1 hj12, int i) {
            this.f167288a = linkedList;
            this.f167289b = linkedList2;
            this.f167290c = hj12;
            this.f167291d = i;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            if (cVar.f256794b == 0 && cVar.f256793a == 0) {
                Log.m105924i("Finder.StatLogicReporter", "successfully! size=" + this.f167288a.size());
                C58389m1.f167287a.mo83224a(this.f167289b, this.f167290c, 0);
            } else if (this.f167291d <= 2) {
                this.f167289b.addAll(0, this.f167288a);
                Log.m105924i("Finder.StatLogicReporter", "failure! try next time, size=" + this.f167288a.size());
                C58389m1.f167287a.mo83224a(this.f167289b, this.f167290c, this.f167291d + 1);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("tryCount=");
                sb.append(this.f167291d);
                sb.append(", throw this sendList=");
                LinkedList<db4> linkedList = this.f167288a;
                ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList, 10));
                for (db4 db4 : linkedList) {
                    arrayList.add(C61926c.m72691p(db4.f182676d));
                }
                sb.append(arrayList);
                Log.m105920e("Finder.StatLogicReporter", sb.toString());
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public final void mo83224a(List<? extends db4> list, C49712hj1 hj12, int i) {
        C87412m.m108594g(list, "list");
        if (i <= 2 && !list.isEmpty()) {
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            if (list.size() > 20) {
                linkedList2.addAll(list.subList(0, 20));
                linkedList.addAll(list.subList(20, list.size()));
            } else {
                linkedList2.addAll(list);
            }
            Log.m105924i("Finder.StatLogicReporter", "[sendStatsLimit] list=" + list.size() + " tryCount=" + i);
            C46525m1 m1Var = new C46525m1(linkedList2, hj12);
            m1Var.f256791h = true;
            m1Var.mo9225i().mo123419C(new C58390a(linkedList2, linkedList, hj12, i));
        }
    }
}
