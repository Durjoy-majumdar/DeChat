package it1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import gy3.C8480h;
import gy3.C87412m;
import java.util.List;
import jp3.C9487b;
import ob0.C117747y;
import te3.C49335eu3;
import te3.C49712hj1;
import vp1.C65834e;

/* renamed from: it1.d */
public abstract class C9251d<RESP extends C49335eu3> extends C60625c<RESP> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9251d(C49712hj1 hj12, C9487b bVar, int i, C8480h hVar) {
        super((i & 1) != 0 ? null : hj12, (i & 2) != 0 ? null : bVar);
    }

    /* renamed from: r */
    public void mo332r(int i, int i2, String str, RESP resp, C117747y yVar) {
        C87412m.m108594g(resp, "resp");
        for (FinderItem l : mo10027s(resp)) {
            C65834e.f189316a.mo89878l(l, new C65834e.C65835a(this.f256789f.f127058d, mo10028t()));
        }
    }

    /* renamed from: s */
    public abstract List<FinderItem> mo10027s(RESP resp);

    /* renamed from: t */
    public abstract long mo10028t();
}
