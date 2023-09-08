package sz3;

import qz3.C26019c;
import qz3.C26044j;
import qz3.C26045k;
import qz3.C26093x;
import xz3.C23159i;

/* renamed from: sz3.b */
public class C26238b {

    /* renamed from: A */
    public static final C26240b f73138A;

    /* renamed from: B */
    public static final C26240b f73139B;

    /* renamed from: C */
    public static final C26240b f73140C;

    /* renamed from: D */
    public static final C26240b f73141D;

    /* renamed from: E */
    public static final C26240b f73142E;

    /* renamed from: F */
    public static final C26240b f73143F;

    /* renamed from: G */
    public static final C26240b f73144G;

    /* renamed from: H */
    public static final C26240b f73145H;

    /* renamed from: I */
    public static final C26240b f73146I;

    /* renamed from: J */
    public static final C26240b f73147J;

    /* renamed from: K */
    public static final C26240b f73148K;

    /* renamed from: L */
    public static final C26240b f73149L;

    /* renamed from: M */
    public static final C26240b f73150M = C26242d.m33726b();

    /* renamed from: a */
    public static final C26240b f73151a;

    /* renamed from: b */
    public static final C26240b f73152b;

    /* renamed from: c */
    public static final C26240b f73153c;

    /* renamed from: d */
    public static final C26242d<C26093x> f73154d;

    /* renamed from: e */
    public static final C26242d<C26045k> f73155e;

    /* renamed from: f */
    public static final C26242d<C26019c.C26022c> f73156f;

    /* renamed from: g */
    public static final C26240b f73157g;

    /* renamed from: h */
    public static final C26240b f73158h;

    /* renamed from: i */
    public static final C26240b f73159i;

    /* renamed from: j */
    public static final C26240b f73160j;

    /* renamed from: k */
    public static final C26240b f73161k;

    /* renamed from: l */
    public static final C26240b f73162l;

    /* renamed from: m */
    public static final C26240b f73163m;

    /* renamed from: n */
    public static final C26240b f73164n;

    /* renamed from: o */
    public static final C26242d<C26044j> f73165o;

    /* renamed from: p */
    public static final C26240b f73166p;

    /* renamed from: q */
    public static final C26240b f73167q;

    /* renamed from: r */
    public static final C26240b f73168r;

    /* renamed from: s */
    public static final C26240b f73169s;

    /* renamed from: t */
    public static final C26240b f73170t;

    /* renamed from: u */
    public static final C26240b f73171u;

    /* renamed from: v */
    public static final C26240b f73172v;

    /* renamed from: w */
    public static final C26240b f73173w;

    /* renamed from: x */
    public static final C26240b f73174x;

    /* renamed from: y */
    public static final C26240b f73175y;

    /* renamed from: z */
    public static final C26240b f73176z;

    /* renamed from: sz3.b$b */
    public static class C26240b extends C26242d<Boolean> {
        public C26240b(int i) {
            super(i, 1, (C26239a) null);
        }

        /* renamed from: d */
        public Boolean mo53140c(int i) {
            Boolean valueOf = Boolean.valueOf((i & (1 << this.f73178a)) != 0);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: e */
        public int mo53142e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f73178a;
            }
            return 0;
        }
    }

    /* renamed from: sz3.b$c */
    public static class C26241c<E extends C23159i.C23160a> extends C26242d<E> {

        /* renamed from: c */
        public final E[] f73177c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C26241c(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0037
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001c
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0019
                int r0 = r0 + r2
            L_0x0012:
                r1 = 0
                r4.<init>(r5, r0, r1)
                r4.f73177c = r6
                return
            L_0x0019:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001c:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Empty enum: "
                r0.append(r1)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0037:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sz3.C26238b.C26241c.<init>(int, xz3.i$a[]):void");
        }

        /* renamed from: c */
        public Object mo53140c(int i) {
            int i2 = this.f73178a;
            int i3 = (i & (((1 << this.f73179b) - 1) << i2)) >> i2;
            for (E e : this.f73177c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }
    }

    /* renamed from: sz3.b$d */
    public static abstract class C26242d<E> {

        /* renamed from: a */
        public final int f73178a;

        /* renamed from: b */
        public final int f73179b;

        public C26242d(int i, int i2, C26239a aVar) {
            this.f73178a = i;
            this.f73179b = i2;
        }

        /* renamed from: a */
        public static C26240b m33725a(C26242d<?> dVar) {
            return new C26240b(dVar.f73178a + dVar.f73179b);
        }

        /* renamed from: b */
        public static C26240b m33726b() {
            return new C26240b(0);
        }

        /* renamed from: c */
        public abstract E mo53140c(int i);
    }

    static {
        C26240b b = C26242d.m33726b();
        f73151a = b;
        f73152b = C26242d.m33725a(b);
        C26240b b2 = C26242d.m33726b();
        f73153c = b2;
        C26241c cVar = new C26241c(1, C26093x.values());
        f73154d = cVar;
        C26045k[] values = C26045k.values();
        int i = 1 + cVar.f73179b;
        C26241c cVar2 = new C26241c(i, values);
        f73155e = cVar2;
        C26241c cVar3 = new C26241c(cVar2.f73179b + i, C26019c.C26022c.values());
        f73156f = cVar3;
        C26240b a = C26242d.m33725a(cVar3);
        f73157g = a;
        C26240b a2 = C26242d.m33725a(a);
        f73158h = a2;
        C26240b a3 = C26242d.m33725a(a2);
        f73159i = a3;
        C26240b a4 = C26242d.m33725a(a3);
        f73160j = a4;
        C26240b a5 = C26242d.m33725a(a4);
        f73161k = a5;
        f73162l = C26242d.m33725a(a5);
        C26240b a6 = C26242d.m33725a(cVar);
        f73163m = a6;
        f73164n = C26242d.m33725a(a6);
        C26241c cVar4 = new C26241c(i + cVar2.f73179b, C26044j.values());
        f73165o = cVar4;
        C26240b a7 = C26242d.m33725a(cVar4);
        f73166p = a7;
        C26240b a8 = C26242d.m33725a(a7);
        f73167q = a8;
        C26240b a9 = C26242d.m33725a(a8);
        f73168r = a9;
        C26240b a15 = C26242d.m33725a(a9);
        f73169s = a15;
        C26240b a16 = C26242d.m33725a(a15);
        f73170t = a16;
        C26240b a17 = C26242d.m33725a(a16);
        f73171u = a17;
        C26240b a18 = C26242d.m33725a(a17);
        f73172v = a18;
        f73173w = C26242d.m33725a(a18);
        C26240b a19 = C26242d.m33725a(cVar4);
        f73174x = a19;
        C26240b a25 = C26242d.m33725a(a19);
        f73175y = a25;
        C26240b a26 = C26242d.m33725a(a25);
        f73176z = a26;
        C26240b a27 = C26242d.m33725a(a26);
        f73138A = a27;
        C26240b a28 = C26242d.m33725a(a27);
        f73139B = a28;
        C26240b a29 = C26242d.m33725a(a28);
        f73140C = a29;
        C26240b a35 = C26242d.m33725a(a29);
        f73141D = a35;
        C26240b a36 = C26242d.m33725a(a35);
        f73142E = a36;
        f73143F = C26242d.m33725a(a36);
        C26240b a37 = C26242d.m33725a(b2);
        f73144G = a37;
        C26240b a38 = C26242d.m33725a(a37);
        f73145H = a38;
        f73146I = C26242d.m33725a(a38);
        C26240b a39 = C26242d.m33725a(cVar2);
        f73147J = a39;
        C26240b a44 = C26242d.m33725a(a39);
        f73148K = a44;
        f73149L = C26242d.m33725a(a44);
        C26242d.m33725a(C26242d.m33726b());
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m33720a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sz3.C26238b.m33720a(int):void");
    }
}
