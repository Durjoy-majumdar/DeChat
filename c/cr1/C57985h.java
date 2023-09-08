package cr1;

import com.tencent.p014mm.plugin.finder.storage.FinderItem;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C87412m;
import o40.C61926c;
import uq1.C65437f;
import uq1.C65445i;
import xq1.C66414k;

/* renamed from: cr1.h */
public final class C57985h extends C66414k {

    /* renamed from: e */
    public final FinderItem f165921e;

    /* renamed from: f */
    public final int f165922f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57985h(FinderItem finderItem, int i) {
        super(String.valueOf(finderItem.getLocalId()));
        C87412m.m108594g(finderItem, "finderObj");
        this.f165921e = finderItem;
        this.f165922f = i;
    }

    /* renamed from: a */
    public int mo75100a() {
        return 100;
    }

    /* renamed from: c */
    public void mo75101c() {
        if (this.f165922f != 1) {
            boolean isLongVideo = this.f165921e.isLongVideo();
            C115669n nVar = C115669n.INSTANCE;
            nVar.mo175913w(1253, 18, 1);
            if (isLongVideo) {
                nVar.mo175913w(1523, 18, 1);
            }
        }
        C65437f fVar = C65437f.f188296h;
        long localId = this.f165921e.getLocalId();
        fVar.getClass();
        C61926c.m72668M(new C65445i(fVar, localId, false));
    }
}
