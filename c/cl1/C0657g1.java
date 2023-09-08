package cl1;

import al1.C0080f;
import com.tencent.p014mm.plugin.finder.live.infrastructure.livedata.LiveMutableData;
import fj1.C45795b;
import gy3.C87412m;
import te3.C51068r71;

/* renamed from: cl1.g1 */
public final class C0657g1 extends C39970c<C45795b> {

    /* renamed from: f */
    public final LiveMutableData<Long> f1554f = new LiveMutableData<>();

    /* renamed from: g */
    public float f1555g;

    /* renamed from: h */
    public C51068r71 f1556h;

    /* renamed from: i */
    public C0080f f1557i;

    /* renamed from: j */
    public LiveMutableData<C0661d> f1558j = new LiveMutableData<>();

    /* renamed from: cl1.g1$a */
    public static final class C0658a extends C0661d {

        /* renamed from: a */
        public static final C0658a f1559a = new C0658a();
    }

    /* renamed from: cl1.g1$b */
    public static final class C0659b extends C0661d {

        /* renamed from: a */
        public static final C0659b f1560a = new C0659b();
    }

    /* renamed from: cl1.g1$c */
    public static final class C0660c {

        /* renamed from: a */
        public final String f1561a;

        /* renamed from: b */
        public final int f1562b;

        /* renamed from: c */
        public final String f1563c;

        /* renamed from: d */
        public final int f1564d;

        /* renamed from: e */
        public final boolean f1565e;

        public C0660c(String str, int i, String str2, int i2, boolean z) {
            C87412m.m108594g(str, "curGiftId");
            C87412m.m108594g(str2, "comboId");
            this.f1561a = str;
            this.f1562b = i;
            this.f1563c = str2;
            this.f1564d = i2;
            this.f1565e = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0660c)) {
                return false;
            }
            C0660c cVar = (C0660c) obj;
            return C87412m.m108589b(this.f1561a, cVar.f1561a) && this.f1562b == cVar.f1562b && C87412m.m108589b(this.f1563c, cVar.f1563c) && this.f1564d == cVar.f1564d && this.f1565e == cVar.f1565e;
        }

        public int hashCode() {
            int hashCode = ((((((this.f1561a.hashCode() * 31) + this.f1562b) * 31) + this.f1563c.hashCode()) * 31) + this.f1564d) * 31;
            boolean z = this.f1565e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            return "QuotaSendGiftData(curGiftId=" + this.f1561a + ", clickCnt=" + this.f1562b + ", comboId=" + this.f1563c + ", diffCnt=" + this.f1564d + ", isFromPatchSend=" + this.f1565e + ')';
        }
    }

    /* renamed from: cl1.g1$d */
    public static abstract class C0661d {
    }

    /* renamed from: cl1.g1$e */
    public static final class C0662e extends C0661d {

        /* renamed from: a */
        public static final C0662e f1566a = new C0662e();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0657g1(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }
}
