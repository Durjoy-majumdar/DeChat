package pu3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.AbstractList;
import java.util.RandomAccess;
import pu3.C25499u;
import qu3.C25903a;

/* renamed from: pu3.i */
public final class C25478i {

    /* renamed from: e */
    public static final short[] f72124e = new short[0];

    /* renamed from: a */
    public final C25499u f72125a;

    /* renamed from: b */
    public final C25485g f72126b = new C25485g((C25479a) null);

    /* renamed from: c */
    public ByteBuffer f72127c;

    /* renamed from: d */
    public byte[] f72128d;

    /* renamed from: pu3.i$b */
    public final class C25480b extends AbstractList<C25473f> implements RandomAccess {
        public C25480b(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i.m32883a(i, C25478i.this.f72125a.f72160g.f72182f);
            C25478i iVar = C25478i.this;
            return iVar.mo52715c(iVar.f72125a.f72160g.f72183g + (i * 32)).mo52731g();
        }

        public int size() {
            return C25478i.this.f72125a.f72160g.f72182f;
        }
    }

    /* renamed from: pu3.i$c */
    public final class C25481c extends AbstractList<C25493o> implements RandomAccess {
        public C25481c(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i.m32883a(i, C25478i.this.f72125a.f72158e.f72182f);
            C25478i iVar = C25478i.this;
            return iVar.mo52715c(iVar.f72125a.f72158e.f72183g + (i * 8)).mo52735k();
        }

        public int size() {
            return C25478i.this.f72125a.f72158e.f72182f;
        }
    }

    /* renamed from: pu3.i$d */
    public final class C25482d extends AbstractList<C25495q> implements RandomAccess {
        public C25482d(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i.m32883a(i, C25478i.this.f72125a.f72159f.f72182f);
            C25478i iVar = C25478i.this;
            return iVar.mo52715c(iVar.f72125a.f72159f.f72183g + (i * 8)).mo52736m();
        }

        public int size() {
            return C25478i.this.f72125a.f72159f.f72182f;
        }
    }

    /* renamed from: pu3.i$e */
    public final class C25483e extends AbstractList<C25497s> implements RandomAccess {
        public C25483e(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i.m32883a(i, C25478i.this.f72125a.f72157d.f72182f);
            C25478i iVar = C25478i.this;
            return iVar.mo52715c(iVar.f72125a.f72157d.f72183g + (i * 12)).mo52737p();
        }

        public int size() {
            return C25478i.this.f72125a.f72157d.f72182f;
        }
    }

    /* renamed from: pu3.i$f */
    public final class C25484f extends C25903a {
        public C25484f(String str, ByteBuffer byteBuffer, C25479a aVar) {
            super(byteBuffer);
        }

        /* renamed from: A */
        public int mo52725A(C25490l lVar) {
            mo52740z(C25478i.this.f72125a.f72170q, true);
            int position = this.f72245a.position();
            mo52792u(lVar.f72139e);
            return position;
        }

        /* renamed from: b */
        public C25466a mo52726b() {
            mo52740z(C25478i.this.f72125a.f72169p, false);
            return super.mo52726b();
        }

        /* renamed from: c */
        public C25467b mo52727c() {
            mo52740z(C25478i.this.f72125a.f72164k, false);
            return super.mo52727c();
        }

        /* renamed from: d */
        public C25468c mo52728d() {
            mo52740z(C25478i.this.f72125a.f72163j, false);
            return super.mo52728d();
        }

        /* renamed from: e */
        public C25469d mo52729e() {
            mo52740z(C25478i.this.f72125a.f72171r, false);
            return super.mo52729e();
        }

        /* renamed from: f */
        public C25470e mo52730f() {
            mo52740z(C25478i.this.f72125a.f72165l, false);
            return super.mo52730f();
        }

        /* renamed from: g */
        public C25473f mo52731g() {
            mo52740z(C25478i.this.f72125a.f72160g, false);
            return super.mo52731g();
        }

        /* renamed from: h */
        public C25474g mo52732h() {
            mo52740z(C25478i.this.f72125a.f72166m, false);
            return super.mo52732h();
        }

        /* renamed from: i */
        public C25477h mo52733i() {
            mo52740z(C25478i.this.f72125a.f72168o, false);
            return super.mo52733i();
        }

        /* renamed from: j */
        public C25490l mo52734j() {
            mo52740z(C25478i.this.f72125a.f72170q, false);
            return super.mo52734j();
        }

        /* renamed from: k */
        public C25493o mo52735k() {
            mo52740z(C25478i.this.f72125a.f72158e, false);
            return super.mo52735k();
        }

        /* renamed from: m */
        public C25495q mo52736m() {
            mo52740z(C25478i.this.f72125a.f72159f, false);
            return super.mo52736m();
        }

        /* renamed from: p */
        public C25497s mo52737p() {
            mo52740z(C25478i.this.f72125a.f72157d, false);
            return super.mo52737p();
        }

        /* renamed from: q */
        public C25498t mo52738q() {
            mo52740z(C25478i.this.f72125a.f72167n, false);
            return super.mo52738q();
        }

        /* renamed from: r */
        public C25502v mo52739r() {
            mo52740z(C25478i.this.f72125a.f72162i, false);
            return super.mo52739r();
        }

        /* renamed from: z */
        public final void mo52740z(C25499u.C25500a aVar, boolean z) {
            if (!aVar.f72181e) {
                return;
            }
            if (z) {
                mo52786a((((this.f72245a.position() + 3) & -4) - this.f72245a.position()) * 1);
                while ((this.f72245a.position() & 3) != 0) {
                    this.f72245a.put((byte) 0);
                }
                if (this.f72245a.position() > this.f72246b) {
                    this.f72246b = this.f72245a.position();
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer = this.f72245a;
            byteBuffer.position((byteBuffer.position() + 3) & -4);
        }
    }

    /* renamed from: pu3.i$g */
    public final class C25485g extends AbstractList<String> implements RandomAccess {
        public C25485g(C25479a aVar) {
        }

        /* renamed from: f */
        public String get(int i) {
            C25478i.m32883a(i, C25478i.this.f72125a.f72155b.f72182f);
            C25478i iVar = C25478i.this;
            return C25478i.this.mo52715c(iVar.mo52715c(iVar.f72125a.f72155b.f72183g + (i * 4)).mo52787l()).mo52738q().f72153e;
        }

        public int size() {
            return C25478i.this.f72125a.f72155b.f72182f;
        }
    }

    /* renamed from: pu3.i$h */
    public final class C25486h extends AbstractList<Integer> implements RandomAccess {
        public C25486h(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i iVar = C25478i.this;
            C25478i.m32883a(i, iVar.f72125a.f72156c.f72182f);
            return Integer.valueOf(iVar.f72127c.getInt(iVar.f72125a.f72156c.f72183g + (i * 4)));
        }

        public int size() {
            return C25478i.this.f72125a.f72156c.f72182f;
        }
    }

    /* renamed from: pu3.i$i */
    public final class C25487i extends AbstractList<String> implements RandomAccess {
        public C25487i(C25479a aVar) {
        }

        public Object get(int i) {
            C25478i iVar = C25478i.this;
            C25485g gVar = iVar.f72126b;
            C25478i.m32883a(i, iVar.f72125a.f72156c.f72182f);
            return gVar.get(iVar.f72127c.getInt(iVar.f72125a.f72156c.f72183g + (i * 4)));
        }

        public int size() {
            return C25478i.this.f72125a.f72156c.f72182f;
        }
    }

    public C25478i(int i) {
        C25499u uVar = new C25499u();
        this.f72125a = uVar;
        new C25486h((C25479a) null);
        new C25487i((C25479a) null);
        new C25483e((C25479a) null);
        new C25481c((C25479a) null);
        new C25482d((C25479a) null);
        new C25480b((C25479a) null);
        this.f72128d = null;
        ByteBuffer wrap = ByteBuffer.wrap(new byte[i]);
        this.f72127c = wrap;
        wrap.order(ByteOrder.LITTLE_ENDIAN);
        uVar.f72175v = i;
    }

    /* renamed from: a */
    public static void m32883a(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("index:" + i + ", length=" + i2);
        }
    }

    /* renamed from: b */
    public byte[] mo52714b(boolean z) {
        byte[] bArr = this.f72128d;
        if (bArr != null && !z) {
            return bArr;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bArr2 = new byte[8192];
            ByteBuffer duplicate = this.f72127c.duplicate();
            duplicate.limit(duplicate.capacity());
            duplicate.position(32);
            while (duplicate.hasRemaining()) {
                int min = Math.min(8192, duplicate.remaining());
                duplicate.get(bArr2, 0, min);
                instance.update(bArr2, 0, min);
            }
            byte[] digest = instance.digest();
            this.f72128d = digest;
            return digest;
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: c */
    public C25484f mo52715c(int i) {
        if (i < 0 || i >= this.f72127c.capacity()) {
            throw new IllegalArgumentException("position=" + i + " length=" + this.f72127c.capacity());
        }
        ByteBuffer duplicate = this.f72127c.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        duplicate.position(i);
        duplicate.limit(this.f72127c.capacity());
        return new C25484f("temp-section", duplicate, (C25479a) null);
    }

    /* renamed from: d */
    public C25484f mo52716d(C25499u.C25500a aVar) {
        int i = aVar.f72183g;
        if (i < 0 || i >= this.f72127c.capacity()) {
            throw new IllegalArgumentException("position=" + i + " length=" + this.f72127c.capacity());
        }
        ByteBuffer duplicate = this.f72127c.duplicate();
        duplicate.order(ByteOrder.LITTLE_ENDIAN);
        duplicate.position(i);
        duplicate.limit(i + aVar.f72184h);
        return new C25484f("section", duplicate, (C25479a) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x025e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25478i(java.io.InputStream r14) {
        /*
            r13 = this;
            r13.<init>()
            pu3.u r0 = new pu3.u
            r0.<init>()
            r13.f72125a = r0
            pu3.i$g r1 = new pu3.i$g
            r2 = 0
            r1.<init>(r2)
            r13.f72126b = r1
            pu3.i$h r1 = new pu3.i$h
            r1.<init>(r2)
            pu3.i$i r1 = new pu3.i$i
            r1.<init>(r2)
            pu3.i$e r1 = new pu3.i$e
            r1.<init>(r2)
            pu3.i$c r1 = new pu3.i$c
            r1.<init>(r2)
            pu3.i$d r1 = new pu3.i$d
            r1.<init>(r2)
            pu3.i$b r1 = new pu3.i$b
            r1.<init>(r2)
            r13.f72128d = r2
            r1 = 0
            byte[] r14 = ru3.C118234d.m166795a(r14, r1)
            java.nio.ByteBuffer r14 = java.nio.ByteBuffer.wrap(r14)
            r13.f72127c = r14
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r14.order(r3)
            pu3.u$a r14 = r0.f72154a
            pu3.i$f r14 = r13.mo52716d(r14)
            r3 = 8
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r4 = r14.f72245a
            r4.get(r3)
            byte r4 = r3[r1]
            r5 = 100
            r6 = 13
            r7 = -1
            r8 = 1
            if (r4 != r5) goto L_0x00ae
            byte r4 = r3[r8]
            r5 = 101(0x65, float:1.42E-43)
            if (r4 != r5) goto L_0x00ae
            r4 = 2
            byte r4 = r3[r4]
            r5 = 120(0x78, float:1.68E-43)
            if (r4 != r5) goto L_0x00ae
            r4 = 3
            byte r4 = r3[r4]
            r5 = 10
            if (r4 != r5) goto L_0x00ae
            r4 = 7
            byte r4 = r3[r4]
            if (r4 == 0) goto L_0x0075
            goto L_0x00ae
        L_0x0075:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = ""
            r4.append(r5)
            r5 = 4
            byte r5 = r3[r5]
            char r5 = (char) r5
            r4.append(r5)
            r5 = 5
            byte r5 = r3[r5]
            char r5 = (char) r5
            r4.append(r5)
            r5 = 6
            byte r5 = r3[r5]
            char r5 = (char) r5
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "036"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x00a3
            r4 = 14
            goto L_0x00af
        L_0x00a3:
            java.lang.String r5 = "035"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x00ae
            r4 = 13
            goto L_0x00af
        L_0x00ae:
            r4 = -1
        L_0x00af:
            if (r4 != r6) goto L_0x025e
            int r3 = r14.mo52787l()
            r0.f72173t = r3
            r3 = 20
            byte[] r3 = new byte[r3]
            java.nio.ByteBuffer r4 = r14.f72245a
            r4.get(r3)
            r0.f72174u = r3
            int r3 = r14.mo52787l()
            r0.f72175v = r3
            int r3 = r14.mo52787l()
            r4 = 112(0x70, float:1.57E-43)
            if (r3 != r4) goto L_0x0243
            int r3 = r14.mo52787l()
            r4 = 305419896(0x12345678, float:5.6904566E-28)
            if (r3 != r4) goto L_0x0228
            int r3 = r14.mo52787l()
            r0.f72176w = r3
            int r3 = r14.mo52787l()
            r0.f72177x = r3
            pu3.u$a r3 = r0.f72161h
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72161h
            int r3 = r3.f72183g
            if (r3 == 0) goto L_0x0220
            pu3.u$a r3 = r0.f72155b
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72155b
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72156c
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72156c
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72157d
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72157d
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72158e
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72158e
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72159f
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72159f
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            pu3.u$a r3 = r0.f72160g
            int r4 = r14.mo52787l()
            r3.f72182f = r4
            pu3.u$a r3 = r0.f72160g
            int r4 = r14.mo52787l()
            r3.f72183g = r4
            int r3 = r14.mo52787l()
            r0.f72178y = r3
            int r14 = r14.mo52787l()
            r0.f72179z = r14
            pu3.u$a r14 = r0.f72161h
            int r14 = r14.f72183g
            pu3.i$f r14 = r13.mo52715c(r14)
            int r3 = r14.mo52787l()
            r4 = 0
        L_0x016c:
            if (r4 >= r3) goto L_0x01fd
            java.nio.ByteBuffer r5 = r14.f72245a
            short r5 = r5.getShort()
            java.nio.ByteBuffer r6 = r14.f72245a
            r6.getShort()
            pu3.u$a[] r6 = r0.f72172s
            int r9 = r6.length
            r10 = 0
        L_0x017d:
            if (r10 >= r9) goto L_0x01e6
            r11 = r6[r10]
            short r12 = r11.f72180d
            if (r12 != r5) goto L_0x01e3
            int r6 = r14.mo52787l()
            int r9 = r14.mo52787l()
            int r10 = r11.f72182f
            if (r10 == 0) goto L_0x0193
            if (r10 != r6) goto L_0x019a
        L_0x0193:
            int r10 = r11.f72183g
            if (r10 == r7) goto L_0x01b5
            if (r10 != r9) goto L_0x019a
            goto L_0x01b5
        L_0x019a:
            pu3.j r14 = new pu3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected map value for 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x01b5:
            r11.f72182f = r6
            r11.f72183g = r9
            if (r2 == 0) goto L_0x01df
            int r5 = r2.f72183g
            if (r5 > r9) goto L_0x01c0
            goto L_0x01df
        L_0x01c0:
            pu3.j r14 = new pu3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Map is unsorted at "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x01df:
            int r4 = r4 + 1
            r2 = r11
            goto L_0x016c
        L_0x01e3:
            int r10 = r10 + 1
            goto L_0x017d
        L_0x01e6:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "No such map item: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L_0x01fd:
            pu3.u$a r14 = r0.f72154a
            r14.f72183g = r1
            pu3.u$a[] r14 = r0.f72172s
            java.util.Arrays.sort(r14)
        L_0x0206:
            pu3.u$a[] r14 = r0.f72172s
            int r1 = r14.length
            if (r8 >= r1) goto L_0x021c
            r1 = r14[r8]
            int r2 = r1.f72183g
            if (r2 != r7) goto L_0x0219
            int r2 = r8 + -1
            r14 = r14[r2]
            int r14 = r14.f72183g
            r1.f72183g = r14
        L_0x0219:
            int r8 = r8 + 1
            goto L_0x0206
        L_0x021c:
            r0.mo52763a()
            return
        L_0x0220:
            pu3.j r14 = new pu3.j
            java.lang.String r0 = "Cannot merge dex files that do not contain a map"
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x0228:
            pu3.j r14 = new pu3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected endian tag: 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x0243:
            pu3.j r14 = new pu3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected header: 0x"
            r0.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        L_0x025e:
            pu3.j r14 = new pu3.j
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unexpected magic: "
            r0.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r3)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>((java.lang.String) r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pu3.C25478i.<init>(java.io.InputStream):void");
    }
}
