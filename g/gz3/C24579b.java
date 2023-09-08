package gz3;

import b04.C23649g;
import fy3.C32224a;
import gy3.C24560g0;
import gy3.C24575y;
import gy3.C87412m;
import gy3.C87413o;
import hz3.C24615g;
import iz3.C24651h;
import java.util.Map;
import m04.C21480i;
import m04.C24979m;
import mz3.C25050b;
import n04.C25143j0;
import n04.C25176s0;
import ny3.C89104m;
import sx3.C36903g0;
import vz3.C22826c;
import vz3.C22830f;
import wy3.C26521y0;
import xy3.C26566c;

/* renamed from: gz3.b */
public class C24579b implements C26566c, C24615g {

    /* renamed from: f */
    public static final /* synthetic */ C89104m<Object>[] f70163f = {C24560g0.m30727c(new C24575y(C24560g0.m30725a(C24579b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a */
    public final C22826c f70164a;

    /* renamed from: b */
    public final C26521y0 f70165b;

    /* renamed from: c */
    public final C21480i f70166c;

    /* renamed from: d */
    public final C25050b f70167d;

    /* renamed from: e */
    public final boolean f70168e;

    /* renamed from: gz3.b$a */
    public static final class C24580a extends C87413o implements C32224a<C25176s0> {

        /* renamed from: d */
        public final /* synthetic */ C24651h f70169d;

        /* renamed from: e */
        public final /* synthetic */ C24579b f70170e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24580a(C24651h hVar, C24579b bVar) {
            super(0);
            this.f70169d = hVar;
            this.f70170e = bVar;
        }

        public Object invoke() {
            C25176s0 s = this.f70169d.f70290a.f70270o.mo52623m().mo53318j(this.f70170e.f70164a).mo36111s();
            C87412m.m108593f(s, "c.module.builtIns.getBui…qName(fqName).defaultType");
            return s;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0011, code lost:
        r4 = r2.f70290a.f70265j.mo37235a(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C24579b(iz3.C24651h r2, mz3.C25048a r3, vz3.C22826c r4) {
        /*
            r1 = this;
            java.lang.String r0 = "c"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "fqName"
            gy3.C87412m.m108594g(r4, r0)
            r1.<init>()
            r1.f70164a = r4
            if (r3 == 0) goto L_0x001c
            iz3.c r4 = r2.f70290a
            lz3.b r4 = r4.f70265j
            lz3.a r4 = r4.mo37235a(r3)
            if (r4 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            wy3.y0 r4 = wy3.C26521y0.f73808a
        L_0x001e:
            r1.f70165b = r4
            iz3.c r4 = r2.f70290a
            m04.n r4 = r4.f70256a
            gz3.b$a r0 = new gz3.b$a
            r0.<init>(r2, r1)
            m04.i r2 = r4.mo52006g(r0)
            r1.f70166c = r2
            if (r3 == 0) goto L_0x003e
            java.util.Collection r2 = r3.getArguments()
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = sx3.C110818d0.m150915M(r2)
            mz3.b r2 = (mz3.C25050b) r2
            goto L_0x003f
        L_0x003e:
            r2 = 0
        L_0x003f:
            r1.f70167d = r2
            r2 = 1
            r4 = 0
            if (r3 == 0) goto L_0x004c
            boolean r3 = r3.mo51040c()
            if (r3 != r2) goto L_0x004c
            goto L_0x004d
        L_0x004c:
            r2 = 0
        L_0x004d:
            r1.f70168e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gz3.C24579b.<init>(iz3.h, mz3.a, vz3.c):void");
    }

    /* renamed from: a */
    public Map<C22830f, C23649g<?>> mo51296a() {
        return C36903g0.f97931d;
    }

    /* renamed from: c */
    public boolean mo51297c() {
        return this.f70168e;
    }

    /* renamed from: d */
    public C22826c mo51298d() {
        return this.f70164a;
    }

    public C26521y0 getSource() {
        return this.f70165b;
    }

    public C25143j0 getType() {
        return (C25176s0) C24979m.m31587a(this.f70166c, this, f70163f[0]);
    }
}
