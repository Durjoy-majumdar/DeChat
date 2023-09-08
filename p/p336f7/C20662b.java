package p336f7;

import android.util.Pair;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import p333e8.C20528a;
import p333e8.C20541m;
import p333e8.C20551y;
import p336f7.C20659a;

/* renamed from: f7.b */
public final class C20662b {

    /* renamed from: a */
    public static final int f58268a = C20551y.m22316f("vide");

    /* renamed from: b */
    public static final int f58269b = C20551y.m22316f("soun");

    /* renamed from: c */
    public static final int f58270c = C20551y.m22316f(MimeTypes.BASE_TYPE_TEXT);

    /* renamed from: d */
    public static final int f58271d = C20551y.m22316f("sbtl");

    /* renamed from: e */
    public static final int f58272e = C20551y.m22316f("subt");

    /* renamed from: f */
    public static final int f58273f = C20551y.m22316f("clcp");

    /* renamed from: g */
    public static final int f58274g = C20551y.m22316f("meta");

    /* renamed from: f7.b$a */
    public static final class C20663a {

        /* renamed from: a */
        public final int f58275a;

        /* renamed from: b */
        public int f58276b;

        /* renamed from: c */
        public int f58277c;

        /* renamed from: d */
        public long f58278d;

        /* renamed from: e */
        public final boolean f58279e;

        /* renamed from: f */
        public final C20541m f58280f;

        /* renamed from: g */
        public final C20541m f58281g;

        /* renamed from: h */
        public int f58282h;

        /* renamed from: i */
        public int f58283i;

        public C20663a(C20541m mVar, C20541m mVar2, boolean z) {
            this.f58281g = mVar;
            this.f58280f = mVar2;
            this.f58279e = z;
            mVar2.mo32113x(12);
            this.f58275a = mVar2.mo32106q();
            mVar.mo32113x(12);
            this.f58283i = mVar.mo32106q();
            C20528a.m22241e(mVar.mo32092c() != 1 ? false : true, "first_chunk must be 1");
            this.f58276b = -1;
        }

        /* renamed from: a */
        public boolean mo32358a() {
            int i = this.f58276b + 1;
            this.f58276b = i;
            if (i == this.f58275a) {
                return false;
            }
            this.f58278d = this.f58279e ? this.f58280f.mo32107r() : this.f58280f.mo32104o();
            if (this.f58276b == this.f58282h) {
                this.f58277c = this.f58281g.mo32106q();
                this.f58281g.mo32114y(4);
                int i2 = this.f58283i - 1;
                this.f58283i = i2;
                this.f58282h = i2 > 0 ? this.f58281g.mo32106q() - 1 : -1;
            }
            return true;
        }
    }

    /* renamed from: f7.b$b */
    public interface C20664b {
        /* renamed from: a */
        int mo32359a();

        /* renamed from: b */
        int mo32360b();

        /* renamed from: c */
        boolean mo32361c();
    }

    /* renamed from: f7.b$c */
    public static final class C20665c implements C20664b {

        /* renamed from: a */
        public final int f58284a;

        /* renamed from: b */
        public final int f58285b;

        /* renamed from: c */
        public final C20541m f58286c;

        public C20665c(C20659a.C20661b bVar) {
            C20541m mVar = bVar.f58267P0;
            this.f58286c = mVar;
            mVar.mo32113x(12);
            this.f58284a = mVar.mo32106q();
            this.f58285b = mVar.mo32106q();
        }

        /* renamed from: a */
        public int mo32359a() {
            int i = this.f58284a;
            return i == 0 ? this.f58286c.mo32106q() : i;
        }

        /* renamed from: b */
        public int mo32360b() {
            return this.f58285b;
        }

        /* renamed from: c */
        public boolean mo32361c() {
            return this.f58284a != 0;
        }
    }

    /* renamed from: f7.b$d */
    public static final class C20666d implements C20664b {

        /* renamed from: a */
        public final C20541m f58287a;

        /* renamed from: b */
        public final int f58288b;

        /* renamed from: c */
        public final int f58289c;

        /* renamed from: d */
        public int f58290d;

        /* renamed from: e */
        public int f58291e;

        public C20666d(C20659a.C20661b bVar) {
            C20541m mVar = bVar.f58267P0;
            this.f58287a = mVar;
            mVar.mo32113x(12);
            this.f58289c = mVar.mo32106q() & 255;
            this.f58288b = mVar.mo32106q();
        }

        /* renamed from: a */
        public int mo32359a() {
            int i = this.f58289c;
            if (i == 8) {
                return this.f58287a.mo32103n();
            }
            if (i == 16) {
                return this.f58287a.mo32108s();
            }
            int i2 = this.f58290d;
            this.f58290d = i2 + 1;
            if (i2 % 2 != 0) {
                return this.f58291e & 15;
            }
            int n = this.f58287a.mo32103n();
            this.f58291e = n;
            return (n & 240) >> 4;
        }

        /* renamed from: b */
        public int mo32360b() {
            return this.f58288b;
        }

        /* renamed from: c */
        public boolean mo32361c() {
            return false;
        }
    }

    static {
        C20551y.m22316f("cenc");
    }

    /* renamed from: a */
    public static Pair<String, byte[]> m22576a(C20541m mVar, int i) {
        mVar.mo32113x(i + 8 + 4);
        mVar.mo32114y(1);
        m22577b(mVar);
        mVar.mo32114y(2);
        int n = mVar.mo32103n();
        if ((n & 128) != 0) {
            mVar.mo32114y(2);
        }
        if ((n & 64) != 0) {
            mVar.mo32114y(mVar.mo32108s());
        }
        if ((n & 32) != 0) {
            mVar.mo32114y(2);
        }
        mVar.mo32114y(1);
        m22577b(mVar);
        int n2 = mVar.mo32103n();
        String str = null;
        if (n2 == 32) {
            str = MimeTypes.VIDEO_MP4V;
        } else if (n2 == 33) {
            str = "video/avc";
        } else if (n2 != 35) {
            if (n2 != 64) {
                if (n2 == 107) {
                    return Pair.create(MimeTypes.AUDIO_MPEG, (Object) null);
                }
                if (n2 == 96 || n2 == 97) {
                    str = MimeTypes.VIDEO_MPEG2;
                } else if (n2 == 165) {
                    str = MimeTypes.AUDIO_AC3;
                } else if (n2 != 166) {
                    switch (n2) {
                        case 102:
                        case 103:
                        case 104:
                            break;
                        default:
                            switch (n2) {
                                case 169:
                                case 172:
                                    return Pair.create(MimeTypes.AUDIO_DTS, (Object) null);
                                case 170:
                                case 171:
                                    return Pair.create(MimeTypes.AUDIO_DTS_HD, (Object) null);
                            }
                    }
                } else {
                    str = MimeTypes.AUDIO_E_AC3;
                }
            }
            str = "audio/mp4a-latm";
        } else {
            str = "video/hevc";
        }
        mVar.mo32114y(12);
        mVar.mo32114y(1);
        int b = m22577b(mVar);
        byte[] bArr = new byte[b];
        mVar.mo32091b(bArr, 0, b);
        return Pair.create(str, bArr);
    }

    /* renamed from: b */
    public static int m22577b(C20541m mVar) {
        int n = mVar.mo32103n();
        int i = n & 127;
        while ((n & 128) == 128) {
            n = mVar.mo32103n();
            i = (i << 7) | (n & 127);
        }
        return i;
    }

    /* renamed from: c */
    public static Pair<Integer, C20676i> m22578c(C20541m mVar, int i, int i2) {
        Pair<Integer, C20676i> pair;
        Integer num;
        C20676i iVar;
        int i3;
        int i4;
        byte[] bArr;
        C20541m mVar2 = mVar;
        int i5 = mVar2.f57810b;
        while (i5 - i < i2) {
            mVar2.mo32113x(i5);
            int c = mVar.mo32092c();
            boolean z = true;
            C20528a.m22238b(c > 0, "childAtomSize should be positive");
            if (mVar.mo32092c() == C20659a.f58208W) {
                int i6 = i5 + 8;
                int i7 = -1;
                int i8 = 0;
                String str = null;
                Integer num2 = null;
                while (i6 - i5 < c) {
                    mVar2.mo32113x(i6);
                    int c2 = mVar.mo32092c();
                    int c3 = mVar.mo32092c();
                    if (c3 == C20659a.f58216c0) {
                        num2 = Integer.valueOf(mVar.mo32092c());
                    } else if (c3 == C20659a.f58209X) {
                        mVar2.mo32114y(4);
                        str = mVar2.mo32101l(4);
                    } else if (c3 == C20659a.f58210Y) {
                        i7 = i6;
                        i8 = c2;
                    }
                    i6 += c2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    C20528a.m22238b(num2 != null, "frma atom is mandatory");
                    C20528a.m22238b(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = num2;
                            iVar = null;
                            break;
                        }
                        mVar2.mo32113x(i9);
                        int c4 = mVar.mo32092c();
                        if (mVar.mo32092c() == C20659a.f58211Z) {
                            int c5 = (mVar.mo32092c() >> 24) & 255;
                            mVar2.mo32114y(1);
                            if (c5 == 0) {
                                mVar2.mo32114y(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int n = mVar.mo32103n();
                                i4 = n & 15;
                                i3 = (n & 240) >> 4;
                            }
                            boolean z2 = mVar.mo32103n() == 1;
                            int n2 = mVar.mo32103n();
                            byte[] bArr2 = new byte[16];
                            mVar2.mo32091b(bArr2, 0, 16);
                            if (!z2 || n2 != 0) {
                                bArr = null;
                            } else {
                                int n3 = mVar.mo32103n();
                                byte[] bArr3 = new byte[n3];
                                mVar2.mo32091b(bArr3, 0, n3);
                                bArr = bArr3;
                            }
                            num = num2;
                            iVar = new C20676i(z2, str, n2, bArr2, i3, i4, bArr);
                        } else {
                            Integer num3 = num2;
                            i9 += c4;
                        }
                    }
                    if (iVar == null) {
                        z = false;
                    }
                    C20528a.m22238b(z, "tenc atom is mandatory");
                    pair = Pair.create(num, iVar);
                } else {
                    pair = null;
                }
                if (pair != null) {
                    return pair;
                }
            }
            i5 += c;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v23, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v6, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a0, code lost:
        if (r24 == 0) goto L_0x00a2;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p336f7.C20675h m22579d(p336f7.C20659a.C20660a r46, p336f7.C20659a.C20661b r47, long r48, com.google.android.exoplayer2.drm.DrmInitData r50, boolean r51, boolean r52) {
        /*
            r0 = r46
            r1 = r50
            int r2 = p336f7.C20659a.f58181F
            f7.a$a r2 = r0.mo32356b(r2)
            int r3 = p336f7.C20659a.f58205T
            f7.a$b r3 = r2.mo32357c(r3)
            e8.m r3 = r3.f58267P0
            r4 = 16
            r3.mo32113x(r4)
            int r3 = r3.mo32092c()
            int r5 = f58269b
            r7 = 4
            r9 = -1
            if (r3 != r5) goto L_0x0023
            r13 = 1
            goto L_0x0043
        L_0x0023:
            int r5 = f58268a
            if (r3 != r5) goto L_0x0029
            r13 = 2
            goto L_0x0043
        L_0x0029:
            int r5 = f58270c
            if (r3 == r5) goto L_0x0042
            int r5 = f58271d
            if (r3 == r5) goto L_0x0042
            int r5 = f58272e
            if (r3 == r5) goto L_0x0042
            int r5 = f58273f
            if (r3 != r5) goto L_0x003a
            goto L_0x0042
        L_0x003a:
            int r5 = f58274g
            if (r3 != r5) goto L_0x0040
            r13 = 4
            goto L_0x0043
        L_0x0040:
            r13 = -1
            goto L_0x0043
        L_0x0042:
            r13 = 3
        L_0x0043:
            r3 = 0
            if (r13 != r9) goto L_0x0047
            return r3
        L_0x0047:
            int r5 = p336f7.C20659a.f58201P
            f7.a$b r5 = r0.mo32357c(r5)
            e8.m r5 = r5.f58267P0
            r11 = 8
            r5.mo32113x(r11)
            int r12 = r5.mo32092c()
            int r12 = r12 >> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            if (r12 != 0) goto L_0x0061
            r14 = 8
            goto L_0x0063
        L_0x0061:
            r14 = 16
        L_0x0063:
            r5.mo32114y(r14)
            int r14 = r5.mo32092c()
            r5.mo32114y(r7)
            int r15 = r5.f57810b
            if (r12 != 0) goto L_0x0073
            r6 = 4
            goto L_0x0075
        L_0x0073:
            r6 = 8
        L_0x0075:
            r10 = 0
        L_0x0076:
            if (r10 >= r6) goto L_0x0085
            byte[] r8 = r5.f57809a
            int r20 = r15 + r10
            byte r8 = r8[r20]
            if (r8 == r9) goto L_0x0082
            r8 = 0
            goto L_0x0086
        L_0x0082:
            int r10 = r10 + 1
            goto L_0x0076
        L_0x0085:
            r8 = 1
        L_0x0086:
            r20 = 0
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 == 0) goto L_0x0093
            r5.mo32114y(r6)
            goto L_0x00a2
        L_0x0093:
            if (r12 != 0) goto L_0x009a
            long r24 = r5.mo32104o()
            goto L_0x009e
        L_0x009a:
            long r24 = r5.mo32107r()
        L_0x009e:
            int r6 = (r24 > r20 ? 1 : (r24 == r20 ? 0 : -1))
            if (r6 != 0) goto L_0x00a4
        L_0x00a2:
            r24 = r22
        L_0x00a4:
            r5.mo32114y(r4)
            int r6 = r5.mo32092c()
            int r8 = r5.mo32092c()
            r5.mo32114y(r7)
            int r10 = r5.mo32092c()
            int r5 = r5.mo32092c()
            r12 = 65536(0x10000, float:9.18355E-41)
            r15 = -65536(0xffffffffffff0000, float:NaN)
            if (r6 != 0) goto L_0x00c9
            if (r8 != r12) goto L_0x00c9
            if (r10 != r15) goto L_0x00c9
            if (r5 != 0) goto L_0x00c9
            r5 = 90
            goto L_0x00e0
        L_0x00c9:
            if (r6 != 0) goto L_0x00d4
            if (r8 != r15) goto L_0x00d4
            if (r10 != r12) goto L_0x00d4
            if (r5 != 0) goto L_0x00d4
            r5 = 270(0x10e, float:3.78E-43)
            goto L_0x00e0
        L_0x00d4:
            if (r6 != r15) goto L_0x00df
            if (r8 != 0) goto L_0x00df
            if (r10 != 0) goto L_0x00df
            if (r5 != r15) goto L_0x00df
            r5 = 180(0xb4, float:2.52E-43)
            goto L_0x00e0
        L_0x00df:
            r5 = 0
        L_0x00e0:
            int r6 = (r48 > r22 ? 1 : (r48 == r22 ? 0 : -1))
            if (r6 != 0) goto L_0x00e9
            r6 = r47
            r26 = r24
            goto L_0x00ed
        L_0x00e9:
            r6 = r47
            r26 = r48
        L_0x00ed:
            e8.m r6 = r6.f58267P0
            r6.mo32113x(r11)
            int r8 = r6.mo32092c()
            int r10 = p336f7.C20659a.f58213b
            int r8 = r8 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != 0) goto L_0x0101
            r8 = 8
            goto L_0x0103
        L_0x0101:
            r8 = 16
        L_0x0103:
            r6.mo32114y(r8)
            long r24 = r6.mo32104o()
            int r6 = (r26 > r22 ? 1 : (r26 == r22 ? 0 : -1))
            if (r6 != 0) goto L_0x010f
            goto L_0x0118
        L_0x010f:
            r28 = 1000000(0xf4240, double:4.940656E-318)
            r30 = r24
            long r22 = p333e8.C20551y.m22320j(r26, r28, r30)
        L_0x0118:
            int r6 = p336f7.C20659a.f58183G
            f7.a$a r6 = r2.mo32356b(r6)
            int r8 = p336f7.C20659a.f58185H
            f7.a$a r6 = r6.mo32356b(r8)
            int r8 = p336f7.C20659a.f58204S
            f7.a$b r2 = r2.mo32357c(r8)
            e8.m r2 = r2.f58267P0
            r2.mo32113x(r11)
            int r8 = r2.mo32092c()
            int r8 = r8 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 != 0) goto L_0x013c
            r10 = 8
            goto L_0x013e
        L_0x013c:
            r10 = 16
        L_0x013e:
            r2.mo32114y(r10)
            long r26 = r2.mo32104o()
            if (r8 != 0) goto L_0x0149
            r8 = 4
            goto L_0x014b
        L_0x0149:
            r8 = 8
        L_0x014b:
            r2.mo32114y(r8)
            int r2 = r2.mo32108s()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = ""
            r8.append(r10)
            int r10 = r2 >> 10
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            r8.append(r10)
            int r10 = r2 >> 5
            r10 = r10 & 31
            int r10 = r10 + 96
            char r10 = (char) r10
            r8.append(r10)
            r2 = r2 & 31
            int r2 = r2 + 96
            char r2 = (char) r2
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            java.lang.Long r8 = java.lang.Long.valueOf(r26)
            android.util.Pair r2 = android.util.Pair.create(r8, r2)
            int r8 = p336f7.C20659a.f58206U
            f7.a$b r6 = r6.mo32357c(r8)
            e8.m r6 = r6.f58267P0
            java.lang.Object r8 = r2.second
            java.lang.String r8 = (java.lang.String) r8
            r10 = 12
            r6.mo32113x(r10)
            int r10 = r6.mo32092c()
            f7.i[] r15 = new p336f7.C20676i[r10]
            r7 = r1
            r26 = r3
            r12 = 0
            r38 = 0
            r41 = 0
        L_0x01a3:
            if (r12 >= r10) goto L_0x0764
            int r4 = r6.f57810b
            int r11 = r6.mo32092c()
            if (r11 <= 0) goto L_0x01af
            r3 = 1
            goto L_0x01b0
        L_0x01af:
            r3 = 0
        L_0x01b0:
            java.lang.String r9 = "childAtomSize should be positive"
            p333e8.C20528a.m22238b(r3, r9)
            int r3 = r6.mo32092c()
            r47 = r10
            int r10 = p336f7.C20659a.f58215c
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58217d
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58212a0
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58234l0
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58219e
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58221f
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58223g
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58192K0
            if (r3 == r10) goto L_0x0577
            int r10 = p336f7.C20659a.f58194L0
            if (r3 != r10) goto L_0x01e1
            goto L_0x0577
        L_0x01e1:
            int r10 = p336f7.C20659a.f58229j
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58214b0
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58239o
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58243q
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58247s
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58253v
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58249t
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58251u
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58260y0
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58262z0
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58235m
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58237n
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58231k
            if (r3 == r10) goto L_0x02ca
            int r10 = p336f7.C20659a.f58200O0
            if (r3 != r10) goto L_0x021b
            goto L_0x02ca
        L_0x021b:
            int r9 = p336f7.C20659a.f58232k0
            if (r3 == r9) goto L_0x0248
            int r10 = p336f7.C20659a.f58252u0
            if (r3 == r10) goto L_0x0248
            int r10 = p336f7.C20659a.f58254v0
            if (r3 == r10) goto L_0x0248
            int r10 = p336f7.C20659a.f58256w0
            if (r3 == r10) goto L_0x0248
            int r10 = p336f7.C20659a.f58258x0
            if (r3 != r10) goto L_0x0230
            goto L_0x0248
        L_0x0230:
            int r9 = p336f7.C20659a.f58198N0
            if (r3 != r9) goto L_0x0244
            java.lang.String r3 = java.lang.Integer.toString(r14)
            java.lang.String r9 = "application/x-camera-motion"
            r42 = r13
            r10 = -1
            r13 = 0
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16645f(r3, r9, r13, r10, r13)
            goto L_0x02b6
        L_0x0244:
            r42 = r13
            goto L_0x02b6
        L_0x0248:
            r42 = r13
            int r10 = r4 + 8
            r13 = 8
            int r10 = r10 + r13
            r6.mo32113x(r10)
            r26 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r10 = "application/ttml+xml"
            if (r3 != r9) goto L_0x0262
            r34 = r26
            r36 = 0
            r27 = r10
            goto L_0x02a2
        L_0x0262:
            int r9 = p336f7.C20659a.f58252u0
            if (r3 != r9) goto L_0x027d
            int r3 = r11 + -8
            int r3 = r3 + -8
            byte[] r9 = new byte[r3]
            r10 = 0
            r6.mo32091b(r9, r10, r3)
            java.util.List r3 = java.util.Collections.singletonList(r9)
            java.lang.String r9 = "application/x-quicktime-tx3g"
            r36 = r3
            r34 = r26
            r27 = r9
            goto L_0x02a2
        L_0x027d:
            int r9 = p336f7.C20659a.f58254v0
            if (r3 != r9) goto L_0x028a
            java.lang.String r3 = "application/x-mp4-vtt"
            r34 = r26
            r36 = 0
        L_0x0287:
            r27 = r3
            goto L_0x02a2
        L_0x028a:
            int r9 = p336f7.C20659a.f58256w0
            if (r3 != r9) goto L_0x0295
            r27 = r10
            r34 = r20
            r36 = 0
            goto L_0x02a2
        L_0x0295:
            int r9 = p336f7.C20659a.f58258x0
            if (r3 != r9) goto L_0x02c4
            java.lang.String r3 = "application/x-mp4-cea-608"
            r34 = r26
            r36 = 0
            r41 = 1
            goto L_0x0287
        L_0x02a2:
            java.lang.String r26 = java.lang.Integer.toString(r14)
            r28 = 0
            r29 = -1
            r30 = 0
            r32 = -1
            r33 = 0
            r31 = r8
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16648i(r26, r27, r28, r29, r30, r31, r32, r33, r34, r36)
        L_0x02b6:
            r49 = r2
            r43 = r5
            r44 = r12
            r45 = r15
            r2 = 3
            r19 = 0
            r5 = r1
            goto L_0x0749
        L_0x02c4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x02ca:
            r42 = r13
            int r10 = r4 + 8
            r13 = 8
            int r10 = r10 + r13
            r6.mo32113x(r10)
            r10 = 6
            if (r52 == 0) goto L_0x02e1
            int r27 = r6.mo32108s()
            r6.mo32114y(r10)
            r13 = r27
            goto L_0x02e5
        L_0x02e1:
            r6.mo32114y(r13)
            r13 = 0
        L_0x02e5:
            if (r13 == 0) goto L_0x0317
            r10 = 1
            if (r13 != r10) goto L_0x02eb
            goto L_0x0317
        L_0x02eb:
            r10 = 2
            if (r13 != r10) goto L_0x030a
            r10 = 16
            r6.mo32114y(r10)
            long r27 = r6.mo32098i()
            double r27 = java.lang.Double.longBitsToDouble(r27)
            long r0 = java.lang.Math.round(r27)
            int r1 = (int) r0
            int r0 = r6.mo32106q()
            r10 = 20
            r6.mo32114y(r10)
            goto L_0x0345
        L_0x030a:
            r49 = r2
            r43 = r5
            r44 = r12
            r45 = r15
            r9 = -1
            r19 = 0
            goto L_0x0572
        L_0x0317:
            int r0 = r6.mo32108s()
            r1 = 6
            r6.mo32114y(r1)
            byte[] r1 = r6.f57809a
            int r10 = r6.f57810b
            int r27 = r10 + 1
            byte r10 = r1[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            r28 = 8
            int r10 = r10 << 8
            int r28 = r27 + 1
            byte r1 = r1[r27]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r1 = r1 | r10
            r49 = r0
            r10 = 2
            int r0 = r28 + 2
            r6.f57810b = r0
            r0 = 1
            if (r13 != r0) goto L_0x0343
            r0 = 16
            r6.mo32114y(r0)
        L_0x0343:
            r0 = r49
        L_0x0345:
            int r10 = r6.f57810b
            int r13 = p336f7.C20659a.f58214b0
            if (r3 != r13) goto L_0x0379
            android.util.Pair r13 = m22578c(r6, r4, r11)
            if (r13 == 0) goto L_0x0373
            java.lang.Object r3 = r13.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r7 != 0) goto L_0x035f
            r49 = r0
            r7 = 0
            goto L_0x036c
        L_0x035f:
            r49 = r0
            java.lang.Object r0 = r13.second
            f7.i r0 = (p336f7.C20676i) r0
            java.lang.String r0 = r0.f58399a
            com.google.android.exoplayer2.drm.DrmInitData r0 = r7.mo18404a(r0)
            r7 = r0
        L_0x036c:
            java.lang.Object r0 = r13.second
            f7.i r0 = (p336f7.C20676i) r0
            r15[r12] = r0
            goto L_0x0375
        L_0x0373:
            r49 = r0
        L_0x0375:
            r6.mo32113x(r10)
            goto L_0x037b
        L_0x0379:
            r49 = r0
        L_0x037b:
            int r0 = p336f7.C20659a.f58239o
            java.lang.String r13 = "audio/raw"
            if (r3 != r0) goto L_0x0384
            java.lang.String r0 = "audio/ac3"
            goto L_0x03cd
        L_0x0384:
            int r0 = p336f7.C20659a.f58243q
            if (r3 != r0) goto L_0x038b
            java.lang.String r0 = "audio/eac3"
            goto L_0x03cd
        L_0x038b:
            int r0 = p336f7.C20659a.f58247s
            if (r3 != r0) goto L_0x0392
            java.lang.String r0 = "audio/vnd.dts"
            goto L_0x03cd
        L_0x0392:
            int r0 = p336f7.C20659a.f58249t
            if (r3 == r0) goto L_0x03cb
            int r0 = p336f7.C20659a.f58251u
            if (r3 != r0) goto L_0x039b
            goto L_0x03cb
        L_0x039b:
            int r0 = p336f7.C20659a.f58253v
            if (r3 != r0) goto L_0x03a2
            java.lang.String r0 = "audio/vnd.dts.hd;profile=lbr"
            goto L_0x03cd
        L_0x03a2:
            int r0 = p336f7.C20659a.f58260y0
            if (r3 != r0) goto L_0x03a9
            java.lang.String r0 = "audio/3gpp"
            goto L_0x03cd
        L_0x03a9:
            int r0 = p336f7.C20659a.f58262z0
            if (r3 != r0) goto L_0x03b0
            java.lang.String r0 = "audio/amr-wb"
            goto L_0x03cd
        L_0x03b0:
            int r0 = p336f7.C20659a.f58235m
            if (r3 == r0) goto L_0x03c9
            int r0 = p336f7.C20659a.f58237n
            if (r3 != r0) goto L_0x03b9
            goto L_0x03c9
        L_0x03b9:
            int r0 = p336f7.C20659a.f58231k
            if (r3 != r0) goto L_0x03c0
            java.lang.String r0 = "audio/mpeg"
            goto L_0x03cd
        L_0x03c0:
            int r0 = p336f7.C20659a.f58200O0
            if (r3 != r0) goto L_0x03c7
            java.lang.String r0 = "audio/alac"
            goto L_0x03cd
        L_0x03c7:
            r0 = 0
            goto L_0x03cd
        L_0x03c9:
            r0 = r13
            goto L_0x03cd
        L_0x03cb:
            java.lang.String r0 = "audio/vnd.dts.hd"
        L_0x03cd:
            r3 = r49
            r37 = r1
            r49 = r2
            r1 = r0
            r0 = 0
        L_0x03d5:
            int r2 = r10 - r4
            if (r2 >= r11) goto L_0x0535
            r6.mo32113x(r10)
            int r2 = r6.mo32092c()
            r43 = r5
            if (r2 <= 0) goto L_0x03e6
            r5 = 1
            goto L_0x03e7
        L_0x03e6:
            r5 = 0
        L_0x03e7:
            p333e8.C20528a.m22238b(r5, r9)
            int r5 = r6.mo32092c()
            r44 = r12
            int r12 = p336f7.C20659a.f58191K
            r45 = r15
            if (r5 == r12) goto L_0x04cb
            if (r52 == 0) goto L_0x03fe
            int r15 = p336f7.C20659a.f58233l
            if (r5 != r15) goto L_0x03fe
            goto L_0x04cb
        L_0x03fe:
            int r12 = p336f7.C20659a.f58241p
            if (r5 != r12) goto L_0x0448
            int r5 = r10 + 8
            r6.mo32113x(r5)
            java.lang.String r26 = java.lang.Integer.toString(r14)
            int r5 = r6.mo32103n()
            r5 = r5 & 192(0xc0, float:2.69E-43)
            r12 = 6
            int r5 = r5 >> r12
            int[] r12 = p401y6.C23224a.f66666b
            r32 = r12[r5]
            int r5 = r6.mo32103n()
            int[] r12 = p401y6.C23224a.f66668d
            r15 = r5 & 56
            r16 = 3
            int r15 = r15 >> 3
            r12 = r12[r15]
            r15 = 4
            r5 = r5 & r15
            if (r5 == 0) goto L_0x042b
            int r12 = r12 + 1
        L_0x042b:
            r31 = r12
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r35 = 0
            java.lang.String r27 = "audio/ac3"
            r34 = r7
            r36 = r8
            com.google.android.exoplayer2.Format r5 = com.google.android.exoplayer2.Format.m16642c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            r26 = r5
            r5 = 0
            r39 = 6
            goto L_0x04c5
        L_0x0448:
            r15 = 4
            int r12 = p336f7.C20659a.f58245r
            if (r5 != r12) goto L_0x0493
            int r5 = r10 + 8
            r6.mo32113x(r5)
            java.lang.String r26 = java.lang.Integer.toString(r14)
            r5 = 2
            r6.mo32114y(r5)
            int r5 = r6.mo32103n()
            r5 = r5 & 192(0xc0, float:2.69E-43)
            r39 = 6
            int r5 = r5 >> 6
            int[] r12 = p401y6.C23224a.f66666b
            r32 = r12[r5]
            int r5 = r6.mo32103n()
            int[] r12 = p401y6.C23224a.f66668d
            r27 = r5 & 14
            r18 = 1
            int r27 = r27 >> 1
            r12 = r12[r27]
            r5 = r5 & 1
            if (r5 == 0) goto L_0x047c
            int r12 = r12 + 1
        L_0x047c:
            r31 = r12
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r35 = 0
            java.lang.String r27 = "audio/eac3"
            r34 = r7
            r36 = r8
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16642c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x04c4
        L_0x0493:
            r39 = 6
            int r12 = p336f7.C20659a.f58255w
            if (r5 != r12) goto L_0x04b6
            java.lang.String r26 = java.lang.Integer.toString(r14)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = 0
            r35 = 0
            r27 = r1
            r31 = r3
            r32 = r37
            r34 = r7
            r36 = r8
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16642c(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            goto L_0x04c4
        L_0x04b6:
            int r12 = p336f7.C20659a.f58200O0
            if (r5 != r12) goto L_0x04c4
            byte[] r0 = new byte[r2]
            r6.mo32113x(r10)
            r5 = 0
            r6.mo32091b(r0, r5, r2)
            goto L_0x04c5
        L_0x04c4:
            r5 = 0
        L_0x04c5:
            r48 = r9
            r9 = -1
            r19 = 0
            goto L_0x052a
        L_0x04cb:
            r15 = 4
            r19 = 0
            r39 = 6
            if (r5 != r12) goto L_0x04d6
            r48 = r9
            r5 = r10
            goto L_0x04f5
        L_0x04d6:
            int r5 = r6.f57810b
        L_0x04d8:
            int r12 = r5 - r10
            if (r12 >= r2) goto L_0x04fc
            r6.mo32113x(r5)
            int r12 = r6.mo32092c()
            if (r12 <= 0) goto L_0x04e7
            r15 = 1
            goto L_0x04e8
        L_0x04e7:
            r15 = 0
        L_0x04e8:
            p333e8.C20528a.m22238b(r15, r9)
            int r15 = r6.mo32092c()
            r48 = r9
            int r9 = p336f7.C20659a.f58191K
            if (r15 != r9) goto L_0x04f7
        L_0x04f5:
            r9 = -1
            goto L_0x0500
        L_0x04f7:
            int r5 = r5 + r12
            r9 = r48
            r15 = 4
            goto L_0x04d8
        L_0x04fc:
            r48 = r9
            r5 = -1
            goto L_0x04f5
        L_0x0500:
            if (r5 == r9) goto L_0x052a
            android.util.Pair r0 = m22576a(r6, r5)
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.second
            byte[] r0 = (byte[]) r0
            java.lang.String r5 = "audio/mp4a-latm"
            boolean r5 = r5.equals(r1)
            if (r5 == 0) goto L_0x052a
            android.util.Pair r3 = p333e8.C20530d.m22243b(r0)
            java.lang.Object r5 = r3.first
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r37 = r5.intValue()
            java.lang.Object r3 = r3.second
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
        L_0x052a:
            int r10 = r10 + r2
            r9 = r48
            r5 = r43
            r12 = r44
            r15 = r45
            goto L_0x03d5
        L_0x0535:
            r43 = r5
            r44 = r12
            r45 = r15
            r9 = -1
            r19 = 0
            if (r26 != 0) goto L_0x0572
            if (r1 == 0) goto L_0x0572
            boolean r2 = r13.equals(r1)
            if (r2 == 0) goto L_0x054b
            r33 = 2
            goto L_0x054d
        L_0x054b:
            r33 = -1
        L_0x054d:
            java.lang.String r26 = java.lang.Integer.toString(r14)
            r28 = 0
            r29 = -1
            r30 = -1
            if (r0 != 0) goto L_0x055c
            r34 = 0
            goto L_0x0562
        L_0x055c:
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r34 = r0
        L_0x0562:
            r36 = 0
            r27 = r1
            r31 = r3
            r32 = r37
            r35 = r7
            r37 = r8
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16641b(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
        L_0x0572:
            r5 = r50
            r2 = 3
            goto L_0x0748
        L_0x0577:
            r49 = r2
            r43 = r5
            r48 = r9
            r44 = r12
            r42 = r13
            r45 = r15
            r9 = -1
            r19 = 0
            int r0 = r4 + 8
            r1 = 8
            int r0 = r0 + r1
            r6.mo32113x(r0)
            r0 = 16
            r6.mo32114y(r0)
            int r31 = r6.mo32108s()
            int r32 = r6.mo32108s()
            r1 = 50
            r6.mo32114y(r1)
            int r1 = r6.f57810b
            int r2 = p336f7.C20659a.f58212a0
            if (r3 != r2) goto L_0x05d4
            android.util.Pair r2 = m22578c(r6, r4, r11)
            if (r2 == 0) goto L_0x05cb
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r5 = r50
            if (r5 != 0) goto L_0x05ba
            r13 = 0
            goto L_0x05c4
        L_0x05ba:
            java.lang.Object r7 = r2.second
            f7.i r7 = (p336f7.C20676i) r7
            java.lang.String r7 = r7.f58399a
            com.google.android.exoplayer2.drm.DrmInitData r13 = r5.mo18404a(r7)
        L_0x05c4:
            java.lang.Object r2 = r2.second
            f7.i r2 = (p336f7.C20676i) r2
            r45[r44] = r2
            goto L_0x05ce
        L_0x05cb:
            r5 = r50
            r13 = r5
        L_0x05ce:
            r6.mo32113x(r1)
            r40 = r13
            goto L_0x05d8
        L_0x05d4:
            r5 = r50
            r40 = r5
        L_0x05d8:
            r2 = 1065353216(0x3f800000, float:1.0)
            r7 = r38
            r2 = 0
            r27 = 0
            r34 = 0
            r36 = 1065353216(0x3f800000, float:1.0)
            r37 = 0
            r38 = -1
        L_0x05e7:
            int r10 = r1 - r4
            if (r10 >= r11) goto L_0x072e
            r6.mo32113x(r1)
            int r10 = r6.f57810b
            int r12 = r6.mo32092c()
            if (r12 != 0) goto L_0x05fd
            int r13 = r6.f57810b
            int r13 = r13 - r4
            if (r13 != r11) goto L_0x05fd
            goto L_0x072e
        L_0x05fd:
            r15 = r48
            if (r12 <= 0) goto L_0x0603
            r13 = 1
            goto L_0x0604
        L_0x0603:
            r13 = 0
        L_0x0604:
            p333e8.C20528a.m22238b(r13, r15)
            int r13 = r6.mo32092c()
            int r0 = p336f7.C20659a.f58187I
            if (r13 != r0) goto L_0x0633
            if (r27 != 0) goto L_0x0613
            r0 = 1
            goto L_0x0614
        L_0x0613:
            r0 = 0
        L_0x0614:
            p333e8.C20528a.m22240d(r0)
            int r10 = r10 + 8
            r6.mo32113x(r10)
            f8.a r0 = p337f8.C20679a.m22613a(r6)
            java.util.List<byte[]> r7 = r0.f58427a
            int r10 = r0.f58428b
            if (r2 != 0) goto L_0x062a
            float r0 = r0.f58431e
            r36 = r0
        L_0x062a:
            java.lang.String r0 = "video/avc"
            r27 = r0
            r34 = r7
            r7 = r10
            goto L_0x0654
        L_0x0633:
            int r0 = p336f7.C20659a.f58189J
            if (r13 != r0) goto L_0x0658
            if (r27 != 0) goto L_0x063b
            r0 = 1
            goto L_0x063c
        L_0x063b:
            r0 = 0
        L_0x063c:
            p333e8.C20528a.m22240d(r0)
            int r10 = r10 + 8
            r6.mo32113x(r10)
            f8.b r0 = p337f8.C20680b.m22614a(r6)
            java.util.List<byte[]> r7 = r0.f58432a
            int r0 = r0.f58433b
            java.lang.String r10 = "video/hevc"
            r34 = r7
            r27 = r10
            r7 = r0
        L_0x0654:
            r0 = r2
        L_0x0655:
            r2 = 3
            goto L_0x0721
        L_0x0658:
            int r0 = p336f7.C20659a.f58196M0
            if (r13 != r0) goto L_0x0670
            if (r27 != 0) goto L_0x0660
            r0 = 1
            goto L_0x0661
        L_0x0660:
            r0 = 0
        L_0x0661:
            p333e8.C20528a.m22240d(r0)
            int r0 = p336f7.C20659a.f58192K0
            if (r3 != r0) goto L_0x066c
            java.lang.String r27 = "video/x-vnd.on2.vp8"
            goto L_0x0654
        L_0x066c:
            java.lang.String r27 = "video/x-vnd.on2.vp9"
            goto L_0x0654
        L_0x0670:
            int r0 = p336f7.C20659a.f58225h
            if (r13 != r0) goto L_0x0680
            if (r27 != 0) goto L_0x0678
            r0 = 1
            goto L_0x0679
        L_0x0678:
            r0 = 0
        L_0x0679:
            p333e8.C20528a.m22240d(r0)
            java.lang.String r27 = "video/3gpp"
            goto L_0x0654
        L_0x0680:
            int r0 = p336f7.C20659a.f58191K
            if (r13 != r0) goto L_0x069d
            if (r27 != 0) goto L_0x0688
            r0 = 1
            goto L_0x0689
        L_0x0688:
            r0 = 0
        L_0x0689:
            p333e8.C20528a.m22240d(r0)
            android.util.Pair r0 = m22576a(r6, r10)
            java.lang.Object r10 = r0.first
            r27 = r10
            java.lang.String r27 = (java.lang.String) r27
            java.lang.Object r0 = r0.second
            java.util.List r34 = java.util.Collections.singletonList(r0)
            goto L_0x0654
        L_0x069d:
            int r0 = p336f7.C20659a.f58230j0
            if (r13 != r0) goto L_0x06b4
            int r10 = r10 + 8
            r6.mo32113x(r10)
            int r0 = r6.mo32106q()
            int r2 = r6.mo32106q()
            float r0 = (float) r0
            float r2 = (float) r2
            float r36 = r0 / r2
            r0 = 1
            goto L_0x0655
        L_0x06b4:
            int r0 = p336f7.C20659a.f58188I0
            if (r13 != r0) goto L_0x06e7
            int r0 = r10 + 8
        L_0x06ba:
            int r13 = r0 - r10
            if (r13 >= r12) goto L_0x06df
            r6.mo32113x(r0)
            int r13 = r6.mo32092c()
            int r9 = r6.mo32092c()
            r48 = r2
            int r2 = p336f7.C20659a.f58190J0
            if (r9 != r2) goto L_0x06da
            byte[] r2 = r6.f57809a
            int r13 = r13 + r0
            byte[] r37 = java.util.Arrays.copyOfRange(r2, r0, r13)
            r0 = r48
            goto L_0x0655
        L_0x06da:
            int r0 = r0 + r13
            r2 = r48
            r9 = -1
            goto L_0x06ba
        L_0x06df:
            r48 = r2
            r0 = r48
            r2 = 3
            r37 = 0
            goto L_0x0725
        L_0x06e7:
            r48 = r2
            int r0 = p336f7.C20659a.f58186H0
            if (r13 != r0) goto L_0x071f
            int r0 = r6.mo32103n()
            r2 = 3
            r6.mo32114y(r2)
            if (r0 != 0) goto L_0x071c
            int r0 = r6.mo32103n()
            if (r0 == 0) goto L_0x0717
            r9 = 1
            if (r0 == r9) goto L_0x0712
            r9 = 2
            if (r0 == r9) goto L_0x070d
            if (r0 == r2) goto L_0x0708
            r0 = r48
            goto L_0x0725
        L_0x0708:
            r0 = r48
            r38 = 3
            goto L_0x0725
        L_0x070d:
            r0 = r48
            r38 = 2
            goto L_0x0725
        L_0x0712:
            r0 = r48
            r38 = 1
            goto L_0x0725
        L_0x0717:
            r0 = r48
            r38 = 0
            goto L_0x0725
        L_0x071c:
            r0 = r48
            goto L_0x0721
        L_0x071f:
            r2 = 3
            goto L_0x071c
        L_0x0721:
            r13 = r37
            r37 = r13
        L_0x0725:
            int r1 = r1 + r12
            r2 = r0
            r48 = r15
            r0 = 16
            r9 = -1
            goto L_0x05e7
        L_0x072e:
            r2 = 3
            if (r27 != 0) goto L_0x0732
            goto L_0x0746
        L_0x0732:
            java.lang.String r26 = java.lang.Integer.toString(r14)
            r28 = 0
            r29 = -1
            r30 = -1
            r33 = -1082130432(0xffffffffbf800000, float:-1.0)
            r39 = 0
            r35 = r43
            com.google.android.exoplayer2.Format r26 = com.google.android.exoplayer2.Format.m16650m(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
        L_0x0746:
            r38 = r7
        L_0x0748:
            r7 = r5
        L_0x0749:
            int r4 = r4 + r11
            r6.mo32113x(r4)
            int r12 = r44 + 1
            r0 = r46
            r10 = r47
            r2 = r49
            r1 = r5
            r13 = r42
            r5 = r43
            r15 = r45
            r3 = 0
            r4 = 16
            r9 = -1
            r11 = 8
            goto L_0x01a3
        L_0x0764:
            r49 = r2
            r42 = r13
            r45 = r15
            r19 = 0
            if (r51 != 0) goto L_0x07f5
            int r0 = p336f7.C20659a.f58202Q
            r1 = r46
            f7.a$a r0 = r1.mo32356b(r0)
            if (r0 == 0) goto L_0x07e7
            int r1 = p336f7.C20659a.f58203R
            f7.a$b r0 = r0.mo32357c(r1)
            if (r0 != 0) goto L_0x0781
            goto L_0x07e7
        L_0x0781:
            e8.m r0 = r0.f58267P0
            r1 = 8
            r0.mo32113x(r1)
            int r1 = r0.mo32092c()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r2 = r0.mo32106q()
            long[] r3 = new long[r2]
            long[] r4 = new long[r2]
            r8 = 0
        L_0x0799:
            if (r8 >= r2) goto L_0x07e0
            r5 = 1
            if (r1 != r5) goto L_0x07a3
            long r6 = r0.mo32107r()
            goto L_0x07a7
        L_0x07a3:
            long r6 = r0.mo32104o()
        L_0x07a7:
            r3[r8] = r6
            if (r1 != r5) goto L_0x07b0
            long r5 = r0.mo32098i()
            goto L_0x07b5
        L_0x07b0:
            int r5 = r0.mo32092c()
            long r5 = (long) r5
        L_0x07b5:
            r4[r8] = r5
            byte[] r5 = r0.f57809a
            int r6 = r0.f57810b
            int r7 = r6 + 1
            byte r6 = r5[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r9 = 8
            int r6 = r6 << r9
            int r10 = r7 + 1
            r0.f57810b = r10
            byte r5 = r5[r7]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            short r5 = (short) r5
            r6 = 1
            if (r5 != r6) goto L_0x07d8
            r5 = 2
            r0.mo32114y(r5)
            int r8 = r8 + 1
            goto L_0x0799
        L_0x07d8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported media rate."
            r0.<init>(r1)
            throw r0
        L_0x07e0:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            r1 = r0
            r0 = 0
            goto L_0x07ec
        L_0x07e7:
            r0 = 0
            android.util.Pair r1 = android.util.Pair.create(r0, r0)
        L_0x07ec:
            java.lang.Object r2 = r1.first
            long[] r2 = (long[]) r2
            java.lang.Object r1 = r1.second
            long[] r1 = (long[]) r1
            goto L_0x07f8
        L_0x07f5:
            r0 = 0
            r1 = r0
            r2 = r1
        L_0x07f8:
            if (r26 != 0) goto L_0x07fc
            r3 = r0
            goto L_0x0822
        L_0x07fc:
            f7.h r3 = new f7.h
            r0 = r49
            java.lang.Object r0 = r0.first
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            r11 = r3
            r12 = r14
            r13 = r42
            r0 = r45
            r14 = r4
            r16 = r24
            r18 = r22
            r20 = r26
            r21 = r41
            r22 = r0
            r23 = r38
            r24 = r2
            r25 = r1
            r11.<init>(r12, r13, r14, r16, r18, r20, r21, r22, r23, r24, r25)
        L_0x0822:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p336f7.C20662b.m22579d(f7.a$a, f7.a$b, long, com.google.android.exoplayer2.drm.DrmInitData, boolean, boolean):f7.h");
    }
}
