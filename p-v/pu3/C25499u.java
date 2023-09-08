package pu3;

/* renamed from: pu3.u */
public final class C25499u {

    /* renamed from: a */
    public final C25500a f72154a;

    /* renamed from: b */
    public final C25500a f72155b;

    /* renamed from: c */
    public final C25500a f72156c;

    /* renamed from: d */
    public final C25500a f72157d;

    /* renamed from: e */
    public final C25500a f72158e;

    /* renamed from: f */
    public final C25500a f72159f;

    /* renamed from: g */
    public final C25500a f72160g;

    /* renamed from: h */
    public final C25500a f72161h;

    /* renamed from: i */
    public final C25500a f72162i;

    /* renamed from: j */
    public final C25500a f72163j;

    /* renamed from: k */
    public final C25500a f72164k;

    /* renamed from: l */
    public final C25500a f72165l;

    /* renamed from: m */
    public final C25500a f72166m;

    /* renamed from: n */
    public final C25500a f72167n;

    /* renamed from: o */
    public final C25500a f72168o;

    /* renamed from: p */
    public final C25500a f72169p;

    /* renamed from: q */
    public final C25500a f72170q;

    /* renamed from: r */
    public final C25500a f72171r;

    /* renamed from: s */
    public final C25500a[] f72172s;

    /* renamed from: t */
    public int f72173t;

    /* renamed from: u */
    public byte[] f72174u = new byte[20];

    /* renamed from: v */
    public int f72175v;

    /* renamed from: w */
    public int f72176w;

    /* renamed from: x */
    public int f72177x;

    /* renamed from: y */
    public int f72178y;

    /* renamed from: z */
    public int f72179z;

    /* renamed from: pu3.u$a */
    public static class C25500a implements Comparable<C25500a> {

        /* renamed from: d */
        public final short f72180d;

        /* renamed from: e */
        public boolean f72181e;

        /* renamed from: f */
        public int f72182f = 0;

        /* renamed from: g */
        public int f72183g = -1;

        /* renamed from: h */
        public int f72184h = 0;

        /* renamed from: pu3.u$a$a */
        public static abstract class C25501a<T> implements Comparable<T> {

            /* renamed from: d */
            public int f72185d;

            public C25501a(int i) {
                this.f72185d = i;
            }

            public boolean equals(Object obj) {
                return compareTo(obj) == 0;
            }

            public int hashCode() {
                return super.hashCode();
            }
        }

        public C25500a(int i, boolean z) {
            this.f72180d = (short) i;
            this.f72181e = z;
            if (i == 0) {
                this.f72183g = 0;
                this.f72182f = 1;
                this.f72184h = 112;
            } else if (i == 4096) {
                this.f72182f = 1;
            }
        }

        /* renamed from: a */
        public boolean mo52764a() {
            return this.f72182f > 0;
        }

        /* renamed from: b */
        public final int mo52765b(int i) {
            switch (i) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                default:
                    switch (i) {
                        case 4096:
                            return 17;
                        case 4097:
                            return 8;
                        case 4098:
                            return 11;
                        case 4099:
                            return 10;
                        default:
                            switch (i) {
                                case 8192:
                                    return 15;
                                case 8193:
                                    return 14;
                                case 8194:
                                    return 7;
                                case 8195:
                                    return 13;
                                case 8196:
                                    return 9;
                                case 8197:
                                    return 16;
                                case 8198:
                                    return 12;
                                default:
                                    throw new IllegalArgumentException("unknown section type: " + i);
                            }
                    }
            }
        }

        public int compareTo(Object obj) {
            C25500a aVar = (C25500a) obj;
            int i = this.f72183g;
            int i2 = aVar.f72183g;
            if (i == i2) {
                int b = mo52765b(this.f72180d);
                int b2 = mo52765b(aVar.f72180d);
                if (b == b2) {
                    return 0;
                }
                if (b < b2) {
                    return -1;
                }
            } else if (i < i2) {
                return -1;
            }
            return 1;
        }

        public String toString() {
            return String.format("Section[type=%#x,off=%#x,size=%#x]", new Object[]{Short.valueOf(this.f72180d), Integer.valueOf(this.f72183g), Integer.valueOf(this.f72182f)});
        }
    }

    public C25499u() {
        C25500a aVar = new C25500a(0, true);
        this.f72154a = aVar;
        C25500a aVar2 = new C25500a(1, true);
        this.f72155b = aVar2;
        C25500a aVar3 = new C25500a(2, true);
        this.f72156c = aVar3;
        C25500a aVar4 = new C25500a(3, true);
        this.f72157d = aVar4;
        C25500a aVar5 = new C25500a(4, true);
        this.f72158e = aVar5;
        C25500a aVar6 = new C25500a(5, true);
        this.f72159f = aVar6;
        C25500a aVar7 = new C25500a(6, true);
        this.f72160g = aVar7;
        C25500a aVar8 = new C25500a(4096, true);
        this.f72161h = aVar8;
        C25500a aVar9 = new C25500a(4097, true);
        this.f72162i = aVar9;
        C25500a aVar10 = new C25500a(4098, true);
        this.f72163j = aVar10;
        C25500a aVar11 = new C25500a(4099, true);
        this.f72164k = aVar11;
        C25500a aVar12 = new C25500a(8192, false);
        this.f72165l = aVar12;
        C25500a aVar13 = new C25500a(8193, true);
        this.f72166m = aVar13;
        C25500a aVar14 = new C25500a(8194, false);
        this.f72167n = aVar14;
        C25500a aVar15 = aVar14;
        C25500a aVar16 = new C25500a(8195, false);
        this.f72168o = aVar16;
        C25500a aVar17 = aVar16;
        C25500a aVar18 = new C25500a(8196, false);
        this.f72169p = aVar18;
        C25500a aVar19 = aVar18;
        C25500a aVar20 = new C25500a(8197, false);
        this.f72170q = aVar20;
        C25500a aVar21 = new C25500a(8198, true);
        this.f72171r = aVar21;
        this.f72172s = new C25500a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar15, aVar17, aVar19, aVar20, aVar21};
    }

    /* renamed from: a */
    public void mo52763a() {
        int i = this.f72175v;
        for (int length = this.f72172s.length - 1; length >= 0; length--) {
            C25500a aVar = this.f72172s[length];
            int i2 = aVar.f72183g;
            if (i2 != -1) {
                if (i2 <= i) {
                    aVar.f72184h = i - i2;
                    i = i2;
                } else {
                    throw new C25488j("Map is unsorted at " + aVar);
                }
            }
        }
        int i3 = this.f72154a.f72184h + this.f72155b.f72184h + this.f72156c.f72184h + this.f72157d.f72184h + this.f72158e.f72184h + this.f72159f.f72184h + this.f72160g.f72184h;
        this.f72179z = i3;
        this.f72178y = this.f72175v - i3;
    }
}
