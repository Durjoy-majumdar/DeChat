package dp1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import ef1.C7637b;
import gy3.C87412m;
import java.util.LinkedList;
import te3.C64689rq2;

/* renamed from: dp1.c2 */
public final class C7429c2 extends C7637b {

    /* renamed from: b */
    public final long f25610b;

    /* renamed from: c */
    public final C64689rq2 f25611c;

    /* renamed from: d */
    public final String f25612d;

    /* renamed from: e */
    public final int f25613e;

    /* renamed from: f */
    public final LinkedList<C64689rq2> f25614f;

    /* renamed from: g */
    public final BaseFinderFeed f25615g;

    /* renamed from: h */
    public final boolean f25616h;

    public C7429c2(long j, C64689rq2 rq22, String str, int i, LinkedList<C64689rq2> linkedList, BaseFinderFeed baseFinderFeed, boolean z) {
        C87412m.m108594g(rq22, "media");
        C87412m.m108594g(str, "objectNonceId");
        C87412m.m108594g(linkedList, "mediaList");
        C87412m.m108594g(baseFinderFeed, "feed");
        this.f25610b = j;
        this.f25611c = rq22;
        this.f25612d = str;
        this.f25613e = i;
        this.f25614f = linkedList;
        this.f25615g = baseFinderFeed;
        this.f25616h = z;
    }

    /* renamed from: b */
    public final long mo8562b() {
        return this.f25610b;
    }

    /* renamed from: c */
    public final int mo8563c() {
        return this.f25613e;
    }

    /* renamed from: d */
    public final C64689rq2 mo8564d() {
        return this.f25611c;
    }

    /* renamed from: e */
    public final boolean mo8565e() {
        return this.f25616h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7429c2)) {
            return false;
        }
        C7429c2 c2Var = (C7429c2) obj;
        return this.f25610b == c2Var.f25610b && C87412m.m108589b(this.f25611c, c2Var.f25611c) && C87412m.m108589b(this.f25612d, c2Var.f25612d) && this.f25613e == c2Var.f25613e && C87412m.m108589b(this.f25614f, c2Var.f25614f) && C87412m.m108589b(this.f25615g, c2Var.f25615g) && this.f25616h == c2Var.f25616h;
    }

    public int hashCode() {
        long j = this.f25610b;
        int hashCode = ((((((((((((int) (j ^ (j >>> 32))) * 31) + this.f25611c.hashCode()) * 31) + this.f25612d.hashCode()) * 31) + this.f25613e) * 31) + this.f25614f.hashCode()) * 31) + this.f25615g.hashCode()) * 31;
        boolean z = this.f25616h;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public String toString() {
        return "PageChangeEvent(feedId=" + this.f25610b + ", media=" + this.f25611c + ", objectNonceId=" + this.f25612d + ", index=" + this.f25613e + ", mediaList=" + this.f25614f + ", feed=" + this.f25615g + ", isAuto=" + this.f25616h + ')';
    }
}
