package zh2;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C8480h;
import gy3.C87412m;
import jq3.C9493c;
import p749xh.C66261f3;

/* renamed from: zh2.b */
public final class C66820b implements C9493c {

    /* renamed from: d */
    public final FinderObject f191938d;

    /* renamed from: e */
    public boolean f191939e;

    /* renamed from: f */
    public boolean f191940f;

    public C66820b(FinderObject finderObject, boolean z, boolean z2, int i, C8480h hVar) {
        z = (i & 2) != 0 ? false : z;
        z2 = (i & 4) != 0 ? false : z2;
        C87412m.m108594g(finderObject, C66261f3.COL_FINDEROBJECT);
        this.f191938d = finderObject;
        this.f191939e = z;
        this.f191940f = z2;
    }

    /* renamed from: c */
    public int mo75c() {
        return 0;
    }

    public long getItemId() {
        return this.f191938d.f164794id;
    }
}
