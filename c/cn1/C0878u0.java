package cn1;

import an1.C0094g;
import an1.C0095h;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import er1.C58784w3;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;
import sx3.C110818d0;
import sx3.C26236u;
import sx3.C36907w;
import te3.C52231z81;
import wp1.C15585f;
import xm1.C15829e0;
import zm1.C16303g;

/* renamed from: cn1.u0 */
public final class C0878u0 extends C15829e0.C15830a.C15831a {

    /* renamed from: a */
    public final /* synthetic */ C0095h f2085a;

    /* renamed from: b */
    public final /* synthetic */ C0870s0 f2086b;

    /* renamed from: c */
    public final /* synthetic */ C16303g f2087c;

    public C0878u0(C0095h hVar, C0870s0 s0Var, C16303g gVar) {
        this.f2085a = hVar;
        this.f2086b = s0Var;
        this.f2087c = gVar;
    }

    /* renamed from: d */
    public void mo763d(int i, List<? extends C52231z81> list) {
        C87412m.m108594g(list, "cards");
        if (i == this.f2085a.f532d.f130377d && !list.isEmpty()) {
            this.f2085a.f532d.f130381h.addAll(0, list);
            C0870s0 s0Var = this.f2086b;
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (C52231z81 z812 : list) {
                FinderObject finderObject = z812.f145756f;
                arrayList.add(finderObject != null ? new C0094g((FinderItem) C110818d0.m150914L(C15585f.f42211a.mo14343f(C26236u.m33719b(finderObject), C58784w3.f168295a.mo83887M1(0), s0Var.f2069i))) : null);
            }
            C0095h hVar = this.f2085a;
            C16303g gVar = this.f2087c;
            if (!arrayList.isEmpty()) {
                hVar.f533e.addAll(0, arrayList);
                gVar.notifyItemRangeInserted(0, arrayList.size());
            }
        }
    }
}
