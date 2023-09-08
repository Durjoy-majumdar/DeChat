package xm3;

import com.tencent.p014mm.plugin.mvvmlist.MvvmList;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import om3.C77020b;
import rx3.C13598b0;
import tm3.C64957k;

/* renamed from: xm3.k0 */
public final class C78912k0 extends C87413o implements C32226l<List<? extends C77020b>, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C64957k f231778d;

    /* renamed from: e */
    public final /* synthetic */ C78889f0 f231779e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78912k0(C64957k kVar, C78889f0 f0Var) {
        super(1);
        this.f231778d = kVar;
        this.f231779e = f0Var;
    }

    public Object invoke(Object obj) {
        List<C77020b> list = (List) obj;
        C87412m.m108594g(list, "snapshotList");
        ArrayList arrayList = new ArrayList();
        for (C77020b bVar : this.f231778d.f187039c) {
            if (!arrayList.contains(bVar)) {
                arrayList.add(bVar);
            }
        }
        for (C77020b bVar2 : list) {
            int i = bVar2.f225006e;
            if ((i == 30 || i == 20) && !arrayList.contains(bVar2)) {
                arrayList.add(bVar2.mo90777Ow());
            }
        }
        MvvmList<C77020b> mvvmList = this.f231779e.f231749g;
        if (mvvmList != null) {
            mvvmList.mo129613q(arrayList);
        }
        return C13598b0.f38549a;
    }
}
