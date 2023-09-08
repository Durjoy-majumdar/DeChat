package it1;

import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C8480h;
import java.util.List;
import te3.C49712hj1;
import vp1.C65834e;

/* renamed from: it1.j */
public abstract class C9255j extends C60628i {
    public C9255j(C49712hj1 hj12) {
        super(hj12);
    }

    /* renamed from: k1 */
    public void mo8516k1(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        for (FinderItem l : mo10031l1(uVar)) {
            C65834e.f189316a.mo89878l(l, new C65834e.C65835a(uVar != null ? uVar.getType() : 0, mo10032m1()));
        }
    }

    /* renamed from: l1 */
    public abstract List<FinderItem> mo10031l1(C114799u uVar);

    /* renamed from: m1 */
    public abstract long mo10032m1();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9255j(C49712hj1 hj12, int i, C8480h hVar) {
        super((i & 1) != 0 ? null : hj12);
    }
}
