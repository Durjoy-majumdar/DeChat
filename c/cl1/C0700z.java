package cl1;

import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import fj1.C45795b;
import gy3.C87412m;
import java.io.Serializable;
import p749xh.C38596k3;

/* renamed from: cl1.z */
public final class C0700z extends C39970c<C45795b> {

    /* renamed from: f */
    public final LiveMutableData<Boolean> f1657f = new LiveMutableData<>();

    /* renamed from: g */
    public final LiveMutableData<Boolean> f1658g = new LiveMutableData<>();

    /* renamed from: h */
    public final LiveMutableData<Boolean> f1659h;

    /* renamed from: i */
    public final LiveMutableData<Boolean> f1660i;

    /* renamed from: j */
    public LiveMutableData<C38596k3> f1661j;

    /* renamed from: n */
    public LiveMutableData<Boolean> f1662n;

    /* renamed from: o */
    public LiveMutableData<C0701a> f1663o;

    /* renamed from: p */
    public LiveMutableData<Boolean> f1664p;

    /* renamed from: q */
    public LiveMutableData<Boolean> f1665q;

    /* renamed from: cl1.z$a */
    public static final class C0701a implements Serializable {

        /* renamed from: d */
        public final String f1666d;

        /* renamed from: e */
        public final String f1667e;

        public C0701a(String str, String str2) {
            C87412m.m108594g(str, "giftId");
            C87412m.m108594g(str2, "wishId");
            this.f1666d = str;
            this.f1667e = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0701a)) {
                return false;
            }
            C0701a aVar = (C0701a) obj;
            return C87412m.m108589b(this.f1666d, aVar.f1666d) && C87412m.m108589b(this.f1667e, aVar.f1667e);
        }

        public int hashCode() {
            return (this.f1666d.hashCode() * 31) + this.f1667e.hashCode();
        }

        public String toString() {
            return "SendGiftData(giftId=" + this.f1666d + ", wishId=" + this.f1667e + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0700z(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
        new LiveMutableData();
        this.f1659h = new LiveMutableData<>();
        this.f1660i = new LiveMutableData<>();
        new LiveMutableData();
        this.f1661j = new LiveMutableData<>();
        this.f1662n = new LiveMutableData<>();
        this.f1663o = new LiveMutableData<>();
        this.f1664p = new LiveMutableData<>();
        this.f1665q = new LiveMutableData<>();
    }

    /* renamed from: c3 */
    public final LiveMutableData<Boolean> mo665c3() {
        return ((C54991o) this.f107146d.mo71262a(C54991o.class)).f154305d3 ? this.f1658g : this.f1657f;
    }
}
