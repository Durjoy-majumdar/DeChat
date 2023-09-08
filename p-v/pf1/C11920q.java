package pf1;

import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.protocal.protobuf.FinderJumpInfo;
import di0.C86299o;
import fe1.C58969q;
import gy3.C87412m;
import mf1.C10817f1;
import rf1.C12982a;

/* renamed from: pf1.q */
public final class C11920q {

    /* renamed from: A */
    public C10817f1 f34823A;

    /* renamed from: B */
    public boolean f34824B;

    /* renamed from: C */
    public boolean f34825C;

    /* renamed from: D */
    public boolean f34826D;

    /* renamed from: a */
    public final FinderJumpInfo f34827a;

    /* renamed from: b */
    public C12982a f34828b;

    /* renamed from: c */
    public final Object f34829c = new Object();

    /* renamed from: d */
    public BaseFinderFeed f34830d;

    /* renamed from: e */
    public long f34831e;

    /* renamed from: f */
    public C11918p f34832f;

    /* renamed from: g */
    public String f34833g;

    /* renamed from: h */
    public boolean f34834h;

    /* renamed from: i */
    public C58969q f34835i;

    /* renamed from: j */
    public String f34836j;

    /* renamed from: k */
    public C86299o f34837k;

    /* renamed from: l */
    public int f34838l;

    /* renamed from: m */
    public String f34839m;

    /* renamed from: n */
    public String f34840n = "";

    /* renamed from: o */
    public int f34841o;

    /* renamed from: p */
    public int f34842p = -1;

    /* renamed from: q */
    public int f34843q;

    /* renamed from: r */
    public int f34844r;

    /* renamed from: s */
    public boolean f34845s;

    /* renamed from: t */
    public boolean f34846t;

    /* renamed from: u */
    public boolean f34847u;

    /* renamed from: v */
    public boolean f34848v = true;

    /* renamed from: w */
    public boolean f34849w;

    /* renamed from: x */
    public int f34850x;

    /* renamed from: y */
    public int f34851y;

    /* renamed from: z */
    public Integer f34852z;

    public C11920q(FinderJumpInfo finderJumpInfo) {
        C87412m.m108594g(finderJumpInfo, "jumpInfo");
        this.f34827a = finderJumpInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C11920q) && C87412m.m108589b(this.f34827a, ((C11920q) obj).f34827a);
    }

    public int hashCode() {
        return this.f34827a.hashCode();
    }

    public String toString() {
        return "FinderJumpInfoEx(jumpInfo=" + this.f34827a + ')';
    }
}
