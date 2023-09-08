package il1;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import cj1.C54758g;
import cj1.C54785k6;
import cl1.C54991o;
import cl1.C54994o1;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import dj1.C45362g1;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import jp3.C9487b;
import kk1.C46729b;
import nj3.C76912y0;
import nr3.C89059e;
import qk1.C63257t;
import rx3.C13598b0;
import wg1.C66109y0;

/* renamed from: il1.r0 */
public final class C60499r0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C60482p0 f172449d;

    /* renamed from: il1.r0$a */
    public static final class C60500a extends C87413o implements C32227p<Integer, LinkedList<String>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60482p0 f172450d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60500a(C60482p0 p0Var) {
            super(2);
            this.f172450d = p0Var;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            LinkedList linkedList = (LinkedList) obj2;
            Class cls = C54994o1.class;
            C87412m.m108594g(linkedList, "unComplianceList");
            if (intValue == 0) {
                C54758g gVar = ((C54994o1) this.f172450d.f172400e.mo71262a(cls)).f154399f;
                C63257t tVar = this.f172450d.f172405j;
                tVar.getClass();
                ArrayList arrayList = new ArrayList();
                Iterator<C54785k6> it = tVar.f179507g.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        break;
                    }
                    C54785k6 next = it.next();
                    if (next.f153566a.length() > 0) {
                        z = true;
                    }
                    if (z && next.f153568c != 1) {
                        arrayList.add(next);
                    }
                }
                gVar.mo75660c(arrayList, ((C54994o1) this.f172450d.f172400e.mo71262a(cls)).f154400g.getValue(), new C60496q0(this.f172450d));
                if (!linkedList.isEmpty()) {
                    C54994o1 o1Var = (C54994o1) this.f172450d.f172400e.mo71262a(cls);
                    o1Var.f154404n.clear();
                    o1Var.f154404n.addAll(linkedList);
                    C76912y0.m92767f(this.f172450d.f172399d.getContext(), this.f172450d.f172399d.getContext().getResources().getString(C0966R.string.mbf));
                }
                C66109y0 y0Var = this.f172450d.f172401f;
                if (y0Var != null) {
                    y0Var.mo90047P0(true);
                }
                C63257t tVar2 = this.f172450d.f172405j;
                tVar2.f179507g.clear();
                tVar2.notifyDataSetChanged();
                Object systemService = this.f172450d.f172399d.getContext().getSystemService("input_method");
                C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f172450d.f172399d.getWindowToken(), 0);
            } else {
                C76912y0.m92767f(this.f172450d.f172399d.getContext(), "请稍后再试");
            }
            return C13598b0.f38549a;
        }
    }

    public C60499r0(C60482p0 p0Var) {
        this.f172449d = p0Var;
    }

    public final void run() {
        Class cls = C55001u.class;
        C60482p0 p0Var = this.f172449d;
        C63257t tVar = p0Var.f172405j;
        Context context = p0Var.f172399d.getContext();
        C87412m.m108593f(context, "root.context");
        if (tVar.mo88161F4(context)) {
            C66109y0 y0Var = this.f172449d.f172401f;
            if (y0Var != null) {
                y0Var.mo90052l();
            }
            this.f172449d.mo85443b(false, true);
            Context context2 = this.f172449d.f172399d.getContext();
            C87412m.m108593f(context2, "root.context");
            C63257t tVar2 = this.f172449d.f172405j;
            tVar2.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<C54785k6> it = tVar2.f179507g.iterator();
            while (it.hasNext()) {
                C54785k6 next = it.next();
                if ((next.f153566a.length() > 0) && next.f153568c != 1) {
                    arrayList.add(next.f153566a);
                }
            }
            long j = ((C55001u) this.f172449d.f172400e.mo71262a(cls)).f154416j;
            long j2 = ((C55001u) this.f172449d.f172400e.mo71262a(cls)).f154420q.f182392d;
            String str = ((C54991o) this.f172449d.f172400e.mo71262a(C54991o.class)).f154345o;
            C60500a aVar = new C60500a(this.f172449d);
            C87412m.m108594g(str, "userName");
            C89059e i = new C45362g1(arrayList, System.currentTimeMillis(), j, j2, str, (C45362g1.C45363a) null, 32, (C8480h) null).mo9225i();
            i.mo123420E(new C46729b(aVar));
            if (context2 instanceof MMActivity) {
                i.mo11397F((C9487b) context2);
            }
        }
    }
}
