package p436a1;

import gy3.C87412m;
import p1166z0.C112541g;
import p1166z0.C112543i;

/* renamed from: a1.h0 */
public abstract class C103237h0 {

    /* renamed from: a1.h0$a */
    public static final class C27725a extends C103237h0 {
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C27725a)) {
                return false;
            }
            ((C27725a) obj).getClass();
            return C87412m.m108589b((Object) null, (Object) null);
        }

        public int hashCode() {
            throw null;
        }
    }

    /* renamed from: a1.h0$b */
    public static final class C103238b extends C103237h0 {

        /* renamed from: a */
        public final C112541g f304446a;

        public C103238b(C112541g gVar) {
            C87412m.m108594g(gVar, "rect");
            this.f304446a = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C103238b) && C87412m.m108589b(this.f304446a, ((C103238b) obj).f304446a);
        }

        public int hashCode() {
            return this.f304446a.hashCode();
        }
    }

    /* renamed from: a1.h0$c */
    public static final class C103239c extends C103237h0 {

        /* renamed from: a */
        public final C112543i f304447a;

        /* renamed from: b */
        public final C27726j0 f304448b;

        /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x0098  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a3  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C103239c(p1166z0.C112543i r7) {
            /*
                r6 = this;
                java.lang.String r0 = "roundRect"
                gy3.C87412m.m108594g(r7, r0)
                r6.<init>()
                r6.f304447a = r7
                long r0 = r7.f336972h
                float r0 = p1166z0.C112535a.m153728b(r0)
                long r1 = r7.f336971g
                float r1 = p1166z0.C112535a.m153728b(r1)
                r2 = 1
                r3 = 0
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x001e
                r0 = 1
                goto L_0x001f
            L_0x001e:
                r0 = 0
            L_0x001f:
                if (r0 == 0) goto L_0x004d
                long r0 = r7.f336971g
                float r0 = p1166z0.C112535a.m153728b(r0)
                long r4 = r7.f336970f
                float r1 = p1166z0.C112535a.m153728b(r4)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x0033
                r0 = 1
                goto L_0x0034
            L_0x0033:
                r0 = 0
            L_0x0034:
                if (r0 == 0) goto L_0x004d
                long r0 = r7.f336970f
                float r0 = p1166z0.C112535a.m153728b(r0)
                long r4 = r7.f336969e
                float r1 = p1166z0.C112535a.m153728b(r4)
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 != 0) goto L_0x0048
                r0 = 1
                goto L_0x0049
            L_0x0048:
                r0 = 0
            L_0x0049:
                if (r0 == 0) goto L_0x004d
                r0 = 1
                goto L_0x004e
            L_0x004d:
                r0 = 0
            L_0x004e:
                long r4 = r7.f336972h
                float r1 = p1166z0.C112535a.m153729c(r4)
                long r4 = r7.f336971g
                float r4 = p1166z0.C112535a.m153729c(r4)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x0060
                r1 = 1
                goto L_0x0061
            L_0x0060:
                r1 = 0
            L_0x0061:
                if (r1 == 0) goto L_0x008f
                long r4 = r7.f336971g
                float r1 = p1166z0.C112535a.m153729c(r4)
                long r4 = r7.f336970f
                float r4 = p1166z0.C112535a.m153729c(r4)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x0075
                r1 = 1
                goto L_0x0076
            L_0x0075:
                r1 = 0
            L_0x0076:
                if (r1 == 0) goto L_0x008f
                long r4 = r7.f336970f
                float r1 = p1166z0.C112535a.m153729c(r4)
                long r4 = r7.f336969e
                float r4 = p1166z0.C112535a.m153729c(r4)
                int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
                if (r1 != 0) goto L_0x008a
                r1 = 1
                goto L_0x008b
            L_0x008a:
                r1 = 0
            L_0x008b:
                if (r1 == 0) goto L_0x008f
                r1 = 1
                goto L_0x0090
            L_0x008f:
                r1 = 0
            L_0x0090:
                if (r0 == 0) goto L_0x0095
                if (r1 == 0) goto L_0x0095
                goto L_0x0096
            L_0x0095:
                r2 = 0
            L_0x0096:
                if (r2 != 0) goto L_0x00a3
                a1.j0 r0 = p436a1.C103245l.m136700a()
                r1 = r0
                a1.i r1 = (p436a1.C103240i) r1
                r1.mo55582g(r7)
                goto L_0x00a4
            L_0x00a3:
                r0 = 0
            L_0x00a4:
                r6.f304448b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p436a1.C103237h0.C103239c.<init>(z0.i):void");
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C103239c) && C87412m.m108589b(this.f304447a, ((C103239c) obj).f304447a);
        }

        public int hashCode() {
            return this.f304447a.hashCode();
        }
    }
}
