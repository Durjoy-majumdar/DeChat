package p009c2;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import p683s0.C36601l;
import p683s0.C36602m;
import p683s0.C36606n;
import p735w1.C37958a;
import p735w1.C37969q;
import p735w1.C38006x;
import p735w1.C38007y;
import sx3.C64197v;

/* renamed from: c2.z */
public final class C28482z {

    /* renamed from: d */
    public static final C36601l<C28482z, Object> f78284d = C36602m.m41009a(C28483a.f78288d, C28484b.f78289d);

    /* renamed from: a */
    public final C37958a f78285a;

    /* renamed from: b */
    public final long f78286b;

    /* renamed from: c */
    public final C38006x f78287c;

    /* renamed from: c2.z$a */
    public static final class C28483a extends C87413o implements C32227p<C36606n, C28482z, Object> {

        /* renamed from: d */
        public static final C28483a f78288d = new C28483a();

        public C28483a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            C36606n nVar = (C36606n) obj;
            C28482z zVar = (C28482z) obj2;
            C87412m.m108594g(nVar, "$this$Saver");
            C87412m.m108594g(zVar, LocaleUtil.ITALIAN);
            return C64197v.m75534c(C37969q.m41692a(zVar.f78285a, C37969q.f100444a, nVar), C37969q.m41692a(new C38006x(zVar.f78286b), C37969q.f100455l, nVar));
        }
    }

    /* renamed from: c2.z$b */
    public static final class C28484b extends C87413o implements C32226l<Object, C28482z> {

        /* renamed from: d */
        public static final C28484b f78289d = new C28484b();

        public C28484b() {
            super(1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: w1.x} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r9, r0)
                java.util.List r9 = (java.util.List) r9
                c2.z r7 = new c2.z
                r0 = 0
                java.lang.Object r0 = r9.get(r0)
                s0.l<w1.a, java.lang.Object> r1 = p735w1.C37969q.f100444a
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r3 = gy3.C87412m.m108589b(r0, r2)
                r4 = 0
                if (r3 == 0) goto L_0x001a
                goto L_0x0026
            L_0x001a:
                if (r0 == 0) goto L_0x0026
                s0.m$c r1 = (p683s0.C36602m.C36605c) r1
                java.lang.Object r0 = r1.mo60750b(r0)
                w1.a r0 = (p735w1.C37958a) r0
                r1 = r0
                goto L_0x0027
            L_0x0026:
                r1 = r4
            L_0x0027:
                gy3.C87412m.m108591d(r1)
                r0 = 1
                java.lang.Object r9 = r9.get(r0)
                int r0 = p735w1.C38006x.f100499c
                s0.l<w1.x, java.lang.Object> r0 = p735w1.C37969q.f100455l
                boolean r2 = gy3.C87412m.m108589b(r9, r2)
                if (r2 == 0) goto L_0x003a
                goto L_0x0045
            L_0x003a:
                if (r9 == 0) goto L_0x0045
                s0.m$c r0 = (p683s0.C36602m.C36605c) r0
                java.lang.Object r9 = r0.mo60750b(r9)
                r4 = r9
                w1.x r4 = (p735w1.C38006x) r4
            L_0x0045:
                gy3.C87412m.m108591d(r4)
                long r2 = r4.f100500a
                r4 = 0
                r5 = 4
                r6 = 0
                r0 = r7
                r0.<init>((p735w1.C37958a) r1, (long) r2, (p735w1.C38006x) r4, (int) r5, (gy3.C8480h) r6)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p009c2.C28482z.C28484b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    public C28482z(C37958a aVar, long j, C38006x xVar, C8480h hVar) {
        this.f78285a = aVar;
        this.f78286b = C38007y.m41702b(j, 0, aVar.f100413d.length());
        this.f78287c = xVar != null ? new C38006x(C38007y.m41702b(xVar.f100500a, 0, aVar.f100413d.length())) : null;
    }

    /* renamed from: a */
    public static C28482z m38223a(C28482z zVar, C37958a aVar, long j, C38006x xVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = zVar.f78285a;
        }
        C37958a aVar2 = aVar;
        if ((i & 2) != 0) {
            j = zVar.f78286b;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            xVar = zVar.f78287c;
        }
        zVar.getClass();
        C87412m.m108594g(aVar2, "annotatedString");
        return new C28482z(aVar2, j2, xVar, (C8480h) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28482z)) {
            return false;
        }
        C28482z zVar = (C28482z) obj;
        return C38006x.m41693a(this.f78286b, zVar.f78286b) && C87412m.m108589b(this.f78287c, zVar.f78287c) && C87412m.m108589b(this.f78285a, zVar.f78285a);
    }

    public int hashCode() {
        int i;
        long j = this.f78286b;
        int i2 = C38006x.f100499c;
        int hashCode = ((this.f78285a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C38006x xVar = this.f78287c;
        if (xVar != null) {
            long j2 = xVar.f100500a;
            i = (int) (j2 ^ (j2 >>> 32));
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public String toString() {
        return "TextFieldValue(text='" + this.f78285a + "', selection=" + C38006x.m41700h(this.f78286b) + ", composition=" + this.f78287c + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28482z(p735w1.C37958a r7, long r8, p735w1.C38006x r10, int r11, gy3.C8480h r12) {
        /*
            r6 = this;
            r12 = r11 & 2
            if (r12 == 0) goto L_0x0008
            int r8 = p735w1.C38006x.f100499c
            long r8 = p735w1.C38006x.f100498b
        L_0x0008:
            r2 = r8
            r8 = r11 & 4
            if (r8 == 0) goto L_0x000e
            r10 = 0
        L_0x000e:
            r4 = r10
            r5 = 0
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009c2.C28482z.<init>(w1.a, long, w1.x, int, gy3.h):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C28482z(java.lang.String r9, long r10, p735w1.C38006x r12, int r13, gy3.C8480h r14) {
        /*
            r8 = this;
            r14 = r13 & 1
            if (r14 == 0) goto L_0x0006
            java.lang.String r9 = ""
        L_0x0006:
            r1 = r9
            r9 = r13 & 2
            if (r9 == 0) goto L_0x000f
            int r9 = p735w1.C38006x.f100499c
            long r10 = p735w1.C38006x.f100498b
        L_0x000f:
            r9 = r13 & 4
            if (r9 == 0) goto L_0x0014
            r12 = 0
        L_0x0014:
            r6 = r12
            w1.a r9 = new w1.a
            r2 = 0
            r3 = 0
            r4 = 6
            r7 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r2 = r8
            r3 = r9
            r4 = r10
            r2.<init>(r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p009c2.C28482z.<init>(java.lang.String, long, w1.x, int, gy3.h):void");
    }
}
