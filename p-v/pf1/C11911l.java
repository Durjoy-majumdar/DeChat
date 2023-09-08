package pf1;

import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import gy3.C8480h;
import gy3.C87412m;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: pf1.l */
public final class C11911l {

    /* renamed from: a */
    public final int f34803a;

    /* renamed from: b */
    public final long f34804b;

    /* renamed from: c */
    public final int f34805c;

    /* renamed from: d */
    public final List<FinderJumpInfo> f34806d;

    /* renamed from: e */
    public final boolean f34807e;

    /* renamed from: f */
    public final String f34808f;

    /* renamed from: g */
    public final Set<Integer> f34809g;

    public C11911l(int i, long j, int i2, List list, boolean z, String str, int i3, C8480h hVar) {
        z = (i3 & 16) != 0 ? false : z;
        str = (i3 & 32) != 0 ? "" : str;
        C87412m.m108594g(list, "list");
        C87412m.m108594g(str, "bypassData");
        this.f34803a = i;
        this.f34804b = j;
        this.f34805c = i2;
        this.f34806d = list;
        this.f34807e = z;
        this.f34808f = str;
        this.f34809g = new LinkedHashSet();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C11911l) && ((C11911l) obj).f34805c == this.f34805c;
    }

    public int hashCode() {
        return this.f34805c;
    }

    public String toString() {
        return "FinderFeedAllJumpInfo(commentScene=" + this.f34803a + ", feedId=" + this.f34804b + ", position=" + this.f34805c + ", list=" + this.f34806d + ", isFromFeed=" + this.f34807e + ", bypassData=" + this.f34808f + ')';
    }
}
