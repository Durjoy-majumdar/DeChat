package np1;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fj1.C45795b;
import fy3.C32224a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import o40.C61926c;
import ok1.C62042e;
import op1.C62084h;
import rx3.C13598b0;
import sk1.C63965x;
import sx3.C64197v;
import te3.C49712hj1;
import tf0.C64916p1;
import zp3.C23555k;

/* renamed from: np1.g0 */
public final class C61863g0 extends C23555k.C23558c {

    /* renamed from: a */
    public final HashSet<Long> f175901a = new HashSet<>();

    /* renamed from: b */
    public final /* synthetic */ C62084h f175902b;

    /* renamed from: c */
    public final /* synthetic */ C49712hj1 f175903c;

    /* renamed from: d */
    public final /* synthetic */ C45795b f175904d;

    /* renamed from: np1.g0$a */
    public static final class C61864a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8479f0<LinkedList<Long>> f175905d;

        /* renamed from: e */
        public final /* synthetic */ C49712hj1 f175906e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f175907f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61864a(C8479f0<LinkedList<Long>> f0Var, C61863g0 g0Var, C49712hj1 hj12, C45795b bVar) {
            super(0);
            this.f175905d = f0Var;
            this.f175906e = hj12;
            this.f175907f = bVar;
        }

        public Object invoke() {
            StringBuilder sb = new StringBuilder();
            LinkedList linkedList = (LinkedList) this.f175905d.f27484d;
            int i = 0;
            int size = linkedList != null ? linkedList.size() : 0;
            LinkedList linkedList2 = (LinkedList) this.f175905d.f27484d;
            if (linkedList2 != null) {
                for (Object next : linkedList2) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        long longValue = ((Number) next).longValue();
                        if (i >= 9) {
                            break;
                        }
                        sb.append(longValue);
                        if (i < size - 1) {
                            sb.append("|");
                        }
                        i = i2;
                    } else {
                        C64197v.m75542k();
                        throw null;
                    }
                }
            }
            C49712hj1 hj12 = this.f175906e;
            C62042e eVar = C62042e.f176370a;
            C45795b bVar = this.f175907f;
            String sb4 = sb.toString();
            C87412m.m108593f(sb4, "strvalue.toString()");
            ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76728y(hj12, 18054, C62042e.m72804V(eVar, bVar, 32, sb4, 0, 8, (Object) null));
            return C13598b0.f38549a;
        }
    }

    public C61863g0(C62084h hVar, C49712hj1 hj12, C45795b bVar) {
        this.f175902b = hVar;
        this.f175903c = hj12;
        this.f175904d = bVar;
    }

    /* renamed from: d */
    public boolean mo777d() {
        return true;
    }

    /* renamed from: e */
    public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
        C87412m.m108594g(view, "parent");
        C87412m.m108594g(list, "exposedHolders");
        C8479f0 f0Var = new C8479f0();
        C62084h hVar = this.f175902b;
        for (RecyclerView.C16631z j : list) {
            C0740i2 S5 = hVar.mo87156S5(hVar.mo87160W5(j.mo17363j(), 2));
            if (S5 instanceof C63965x) {
                C63965x xVar = (C63965x) S5;
                if (!this.f175901a.contains(Long.valueOf(xVar.f181347t))) {
                    this.f175901a.add(Long.valueOf(xVar.f181347t));
                    if (f0Var.f27484d == null) {
                        f0Var.f27484d = new LinkedList();
                    }
                    LinkedList linkedList = (LinkedList) f0Var.f27484d;
                    if (linkedList != null) {
                        linkedList.add(Long.valueOf(xVar.f181347t));
                    }
                }
            }
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "[onChildExposeChanged] exposed=" + f0Var.f27484d);
        LinkedList linkedList2 = (LinkedList) f0Var.f27484d;
        boolean z = false;
        if (linkedList2 != null && (!linkedList2.isEmpty())) {
            z = true;
        }
        if (z) {
            C61926c.m72661F("FinderLiveShoppingListExpose", new C61864a(f0Var, this, this.f175903c, this.f175904d));
        }
    }
}
