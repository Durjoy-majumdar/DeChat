package p368o2;

import java.util.ArrayList;
import p363n2.C21587c;
import p363n2.C21589e;
import p368o2.C21735e;

/* renamed from: o2.f */
public class C21738f {

    /* renamed from: A */
    public C21735e[] f61551A;

    /* renamed from: B */
    public ArrayList<C21735e> f61552B;

    /* renamed from: C */
    public C21739a[] f61553C;

    /* renamed from: D */
    public C21738f f61554D;

    /* renamed from: E */
    public int f61555E;

    /* renamed from: F */
    public int f61556F;

    /* renamed from: G */
    public float f61557G;

    /* renamed from: H */
    public int f61558H;

    /* renamed from: I */
    public int f61559I;

    /* renamed from: J */
    public int f61560J;

    /* renamed from: K */
    public int f61561K;

    /* renamed from: L */
    public int f61562L;

    /* renamed from: M */
    public int f61563M;

    /* renamed from: N */
    public int f61564N;

    /* renamed from: O */
    public int f61565O;

    /* renamed from: P */
    public int f61566P;

    /* renamed from: Q */
    public int f61567Q;

    /* renamed from: R */
    public int f61568R;

    /* renamed from: S */
    public int f61569S;

    /* renamed from: T */
    public int f61570T;

    /* renamed from: U */
    public int f61571U;

    /* renamed from: V */
    public float f61572V;

    /* renamed from: W */
    public float f61573W;

    /* renamed from: X */
    public Object f61574X;

    /* renamed from: Y */
    public int f61575Y;

    /* renamed from: Z */
    public String f61576Z;

    /* renamed from: a */
    public int f61577a = -1;

    /* renamed from: a0 */
    public boolean f61578a0;

    /* renamed from: b */
    public int f61579b = -1;

    /* renamed from: b0 */
    public boolean f61580b0;

    /* renamed from: c */
    public C21746m f61581c;

    /* renamed from: c0 */
    public boolean f61582c0;

    /* renamed from: d */
    public C21746m f61583d;

    /* renamed from: d0 */
    public int f61584d0;

    /* renamed from: e */
    public int f61585e = 0;

    /* renamed from: e0 */
    public int f61586e0;

    /* renamed from: f */
    public int f61587f = 0;

    /* renamed from: f0 */
    public float[] f61588f0;

    /* renamed from: g */
    public int[] f61589g = new int[2];

    /* renamed from: g0 */
    public C21738f[] f61590g0;

    /* renamed from: h */
    public int f61591h = 0;

    /* renamed from: h0 */
    public C21738f[] f61592h0;

    /* renamed from: i */
    public int f61593i = 0;

    /* renamed from: j */
    public float f61594j = 1.0f;

    /* renamed from: k */
    public int f61595k = 0;

    /* renamed from: l */
    public int f61596l = 0;

    /* renamed from: m */
    public float f61597m = 1.0f;

    /* renamed from: n */
    public int f61598n = -1;

    /* renamed from: o */
    public float f61599o = 1.0f;

    /* renamed from: p */
    public C21741h f61600p = null;

    /* renamed from: q */
    public int[] f61601q = {Integer.MAX_VALUE, Integer.MAX_VALUE};

    /* renamed from: r */
    public float f61602r = 0.0f;

    /* renamed from: s */
    public C21735e f61603s = new C21735e(this, C21735e.C21737b.LEFT);

    /* renamed from: t */
    public C21735e f61604t = new C21735e(this, C21735e.C21737b.TOP);

    /* renamed from: u */
    public C21735e f61605u = new C21735e(this, C21735e.C21737b.RIGHT);

    /* renamed from: v */
    public C21735e f61606v = new C21735e(this, C21735e.C21737b.BOTTOM);

    /* renamed from: w */
    public C21735e f61607w = new C21735e(this, C21735e.C21737b.BASELINE);

    /* renamed from: x */
    public C21735e f61608x = new C21735e(this, C21735e.C21737b.CENTER_X);

    /* renamed from: y */
    public C21735e f61609y = new C21735e(this, C21735e.C21737b.CENTER_Y);

    /* renamed from: z */
    public C21735e f61610z;

    /* renamed from: o2.f$a */
    public enum C21739a {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public C21738f() {
        C21735e eVar = new C21735e(this, C21735e.C21737b.CENTER);
        this.f61610z = eVar;
        this.f61551A = new C21735e[]{this.f61603s, this.f61605u, this.f61604t, this.f61606v, this.f61607w, eVar};
        ArrayList<C21735e> arrayList = new ArrayList<>();
        this.f61552B = arrayList;
        C21739a aVar = C21739a.FIXED;
        this.f61553C = new C21739a[]{aVar, aVar};
        this.f61554D = null;
        this.f61555E = 0;
        this.f61556F = 0;
        this.f61557G = 0.0f;
        this.f61558H = -1;
        this.f61559I = 0;
        this.f61560J = 0;
        this.f61561K = 0;
        this.f61562L = 0;
        this.f61563M = 0;
        this.f61564N = 0;
        this.f61565O = 0;
        this.f61566P = 0;
        this.f61567Q = 0;
        this.f61572V = 0.5f;
        this.f61573W = 0.5f;
        this.f61575Y = 0;
        this.f61576Z = null;
        this.f61578a0 = false;
        this.f61580b0 = false;
        this.f61582c0 = false;
        this.f61584d0 = 0;
        this.f61586e0 = 0;
        this.f61588f0 = new float[]{-1.0f, -1.0f};
        this.f61590g0 = new C21738f[]{null, null};
        this.f61592h0 = new C21738f[]{null, null};
        arrayList.add(this.f61603s);
        this.f61552B.add(this.f61604t);
        this.f61552B.add(this.f61605u);
        this.f61552B.add(this.f61606v);
        this.f61552B.add(this.f61608x);
        this.f61552B.add(this.f61609y);
        this.f61552B.add(this.f61610z);
        this.f61552B.add(this.f61607w);
    }

    /* renamed from: A */
    public void mo34030A(C21739a aVar) {
        this.f61553C[0] = aVar;
        if (aVar == C21739a.WRAP_CONTENT) {
            mo34033D(this.f61570T);
        }
    }

    /* renamed from: B */
    public void mo34031B(int i, int i2) {
        this.f61565O = i;
        this.f61566P = i2;
    }

    /* renamed from: C */
    public void mo34032C(C21739a aVar) {
        this.f61553C[1] = aVar;
        if (aVar == C21739a.WRAP_CONTENT) {
            mo34057z(this.f61571U);
        }
    }

    /* renamed from: D */
    public void mo34033D(int i) {
        this.f61555E = i;
        int i2 = this.f61568R;
        if (i < i2) {
            this.f61555E = i2;
        }
    }

    /* renamed from: E */
    public void mo34034E() {
        int i = this.f61559I;
        int i2 = this.f61560J;
        this.f61563M = i;
        this.f61564N = i2;
    }

    /* renamed from: F */
    public void mo34035F(C21589e eVar) {
        int i;
        int i2;
        int m = eVar.mo33846m(this.f61603s);
        int m2 = eVar.mo33846m(this.f61604t);
        int m3 = eVar.mo33846m(this.f61605u);
        int m4 = eVar.mo33846m(this.f61606v);
        int i3 = m4 - m2;
        if (m3 - m < 0 || i3 < 0 || m == Integer.MIN_VALUE || m == Integer.MAX_VALUE || m2 == Integer.MIN_VALUE || m2 == Integer.MAX_VALUE || m3 == Integer.MIN_VALUE || m3 == Integer.MAX_VALUE || m4 == Integer.MIN_VALUE || m4 == Integer.MAX_VALUE) {
            m4 = 0;
            m = 0;
            m2 = 0;
            m3 = 0;
        }
        int i4 = m3 - m;
        int i5 = m4 - m2;
        this.f61559I = m;
        this.f61560J = m2;
        if (this.f61575Y == 8) {
            this.f61555E = 0;
            this.f61556F = 0;
            return;
        }
        C21739a[] aVarArr = this.f61553C;
        C21739a aVar = aVarArr[0];
        C21739a aVar2 = C21739a.FIXED;
        if (aVar == aVar2 && i4 < (i2 = this.f61555E)) {
            i4 = i2;
        }
        if (aVarArr[1] == aVar2 && i5 < (i = this.f61556F)) {
            i5 = i;
        }
        this.f61555E = i4;
        this.f61556F = i5;
        int i6 = this.f61569S;
        if (i5 < i6) {
            this.f61556F = i6;
        }
        int i7 = this.f61568R;
        if (i4 < i7) {
            this.f61555E = i7;
        }
        this.f61580b0 = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:173:0x0287  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0319  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x032c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0382  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0391  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:243:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34019a(p363n2.C21589e r47) {
        /*
            r46 = this;
            r15 = r46
            r14 = r47
            o2.f$a r10 = p368o2.C21738f.C21739a.WRAP_CONTENT
            o2.e r0 = r15.f61603s
            n2.h r6 = r14.mo33843j(r0)
            o2.e r0 = r15.f61605u
            n2.h r4 = r14.mo33843j(r0)
            o2.e r0 = r15.f61604t
            n2.h r3 = r14.mo33843j(r0)
            o2.e r0 = r15.f61606v
            n2.h r2 = r14.mo33843j(r0)
            o2.e r0 = r15.f61607w
            n2.h r1 = r14.mo33843j(r0)
            o2.f r0 = r15.f61554D
            r5 = 8
            r13 = 1
            r12 = 0
            if (r0 == 0) goto L_0x00cd
            o2.f$a[] r0 = r0.f61553C
            r7 = r0[r12]
            if (r7 != r10) goto L_0x0034
            r7 = 1
            goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            r0 = r0[r13]
            if (r0 != r10) goto L_0x003b
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            boolean r8 = r15.mo34051s(r12)
            if (r8 == 0) goto L_0x004a
            o2.f r8 = r15.f61554D
            o2.g r8 = (p368o2.C21740g) r8
            r8.mo34059H(r15, r12)
            goto L_0x005e
        L_0x004a:
            o2.e r8 = r15.f61603s
            o2.e r9 = r8.f61533d
            if (r9 == 0) goto L_0x0054
            o2.e r9 = r9.f61533d
            if (r9 == r8) goto L_0x005e
        L_0x0054:
            o2.e r8 = r15.f61605u
            o2.e r9 = r8.f61533d
            if (r9 == 0) goto L_0x0060
            o2.e r9 = r9.f61533d
            if (r9 != r8) goto L_0x0060
        L_0x005e:
            r8 = 1
            goto L_0x0061
        L_0x0060:
            r8 = 0
        L_0x0061:
            boolean r9 = r15.mo34051s(r13)
            if (r9 == 0) goto L_0x006f
            o2.f r9 = r15.f61554D
            o2.g r9 = (p368o2.C21740g) r9
            r9.mo34059H(r15, r13)
            goto L_0x0083
        L_0x006f:
            o2.e r9 = r15.f61604t
            o2.e r11 = r9.f61533d
            if (r11 == 0) goto L_0x0079
            o2.e r11 = r11.f61533d
            if (r11 == r9) goto L_0x0083
        L_0x0079:
            o2.e r9 = r15.f61606v
            o2.e r11 = r9.f61533d
            if (r11 == 0) goto L_0x0085
            o2.e r11 = r11.f61533d
            if (r11 != r9) goto L_0x0085
        L_0x0083:
            r9 = 1
            goto L_0x0086
        L_0x0085:
            r9 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x00a3
            int r11 = r15.f61575Y
            if (r11 == r5) goto L_0x00a3
            o2.e r11 = r15.f61603s
            o2.e r11 = r11.f61533d
            if (r11 != 0) goto L_0x00a3
            o2.e r11 = r15.f61605u
            o2.e r11 = r11.f61533d
            if (r11 != 0) goto L_0x00a3
            o2.f r11 = r15.f61554D
            o2.e r11 = r11.f61605u
            n2.h r11 = r14.mo33843j(r11)
            r14.mo33839f(r11, r4, r12, r13)
        L_0x00a3:
            if (r0 == 0) goto L_0x00c4
            int r11 = r15.f61575Y
            if (r11 == r5) goto L_0x00c4
            o2.e r11 = r15.f61604t
            o2.e r11 = r11.f61533d
            if (r11 != 0) goto L_0x00c4
            o2.e r11 = r15.f61606v
            o2.e r11 = r11.f61533d
            if (r11 != 0) goto L_0x00c4
            o2.e r11 = r15.f61607w
            if (r11 != 0) goto L_0x00c4
            o2.f r11 = r15.f61554D
            o2.e r11 = r11.f61606v
            n2.h r11 = r14.mo33843j(r11)
            r14.mo33839f(r11, r2, r12, r13)
        L_0x00c4:
            r21 = r0
            r16 = r7
            r20 = r8
            r22 = r9
            goto L_0x00d5
        L_0x00cd:
            r16 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x00d5:
            int r0 = r15.f61555E
            int r7 = r15.f61568R
            if (r0 >= r7) goto L_0x00dc
            goto L_0x00dd
        L_0x00dc:
            r7 = r0
        L_0x00dd:
            int r8 = r15.f61556F
            int r9 = r15.f61569S
            if (r8 >= r9) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r9 = r8
        L_0x00e5:
            o2.f$a[] r11 = r15.f61553C
            r5 = r11[r12]
            o2.f$a r12 = p368o2.C21738f.C21739a.MATCH_CONSTRAINT
            if (r5 == r12) goto L_0x00f0
            r19 = 1
            goto L_0x00f2
        L_0x00f0:
            r19 = 0
        L_0x00f2:
            r11 = r11[r13]
            if (r11 == r12) goto L_0x00f9
            r23 = 1
            goto L_0x00fb
        L_0x00f9:
            r23 = 0
        L_0x00fb:
            int r13 = r15.f61558H
            r15.f61598n = r13
            r25 = r1
            float r1 = r15.f61557G
            r15.f61599o = r1
            r26 = r2
            int r2 = r15.f61585e
            r27 = r3
            int r3 = r15.f61587f
            r28 = 0
            r29 = 4
            r30 = r6
            int r28 = (r1 > r28 ? 1 : (r1 == r28 ? 0 : -1))
            if (r28 <= 0) goto L_0x026f
            int r6 = r15.f61575Y
            r32 = r4
            r4 = 8
            if (r6 == r4) goto L_0x0271
            r4 = 3
            if (r5 != r12) goto L_0x0125
            if (r2 != 0) goto L_0x0125
            r2 = 3
        L_0x0125:
            if (r11 != r12) goto L_0x012a
            if (r3 != 0) goto L_0x012a
            r3 = 3
        L_0x012a:
            if (r5 != r12) goto L_0x0223
            if (r11 != r12) goto L_0x0223
            if (r2 != r4) goto L_0x0223
            if (r3 != r4) goto L_0x0223
            r6 = -1
            if (r13 != r6) goto L_0x014c
            if (r19 == 0) goto L_0x013d
            if (r23 != 0) goto L_0x013d
            r0 = 0
            r15.f61598n = r0
            goto L_0x014c
        L_0x013d:
            if (r19 != 0) goto L_0x014c
            if (r23 == 0) goto L_0x014c
            r0 = 1
            r15.f61598n = r0
            if (r13 != r6) goto L_0x014c
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r0 / r1
            r15.f61599o = r6
        L_0x014c:
            int r0 = r15.f61598n
            if (r0 != 0) goto L_0x0164
            o2.e r0 = r15.f61604t
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x0160
            o2.e r0 = r15.f61606v
            boolean r0 = r0.mo34026c()
            if (r0 != 0) goto L_0x0164
        L_0x0160:
            r0 = 1
            r15.f61598n = r0
            goto L_0x017c
        L_0x0164:
            r0 = 1
            int r1 = r15.f61598n
            if (r1 != r0) goto L_0x017c
            o2.e r0 = r15.f61603s
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x0179
            o2.e r0 = r15.f61605u
            boolean r0 = r0.mo34026c()
            if (r0 != 0) goto L_0x017c
        L_0x0179:
            r0 = 0
            r15.f61598n = r0
        L_0x017c:
            int r0 = r15.f61598n
            r1 = -1
            if (r0 != r1) goto L_0x01d0
            o2.e r0 = r15.f61604t
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01a1
            o2.e r0 = r15.f61606v
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01a1
            o2.e r0 = r15.f61603s
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01a1
            o2.e r0 = r15.f61605u
            boolean r0 = r0.mo34026c()
            if (r0 != 0) goto L_0x01d0
        L_0x01a1:
            o2.e r0 = r15.f61604t
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01b5
            o2.e r0 = r15.f61606v
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01b5
            r0 = 0
            r15.f61598n = r0
            goto L_0x01d0
        L_0x01b5:
            o2.e r0 = r15.f61603s
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01d0
            o2.e r0 = r15.f61605u
            boolean r0 = r0.mo34026c()
            if (r0 == 0) goto L_0x01d0
            float r0 = r15.f61599o
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 / r0
            r15.f61599o = r6
            r0 = 1
            r15.f61598n = r0
        L_0x01d0:
            int r0 = r15.f61598n
            r1 = -1
            if (r0 != r1) goto L_0x01ec
            if (r16 == 0) goto L_0x01dd
            if (r21 != 0) goto L_0x01dd
            r0 = 0
            r15.f61598n = r0
            goto L_0x01ec
        L_0x01dd:
            if (r16 != 0) goto L_0x01ec
            if (r21 == 0) goto L_0x01ec
            float r0 = r15.f61599o
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 / r0
            r15.f61599o = r6
            r0 = 1
            r15.f61598n = r0
        L_0x01ec:
            int r0 = r15.f61598n
            r1 = -1
            if (r0 != r1) goto L_0x020e
            int r0 = r15.f61591h
            if (r0 <= 0) goto L_0x01fd
            int r1 = r15.f61595k
            if (r1 != 0) goto L_0x01fd
            r1 = 0
            r15.f61598n = r1
            goto L_0x020e
        L_0x01fd:
            if (r0 != 0) goto L_0x020e
            int r0 = r15.f61595k
            if (r0 <= 0) goto L_0x020e
            float r0 = r15.f61599o
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 / r0
            r15.f61599o = r6
            r0 = 1
            r15.f61598n = r0
        L_0x020e:
            int r0 = r15.f61598n
            r1 = -1
            if (r0 != r1) goto L_0x0262
            if (r16 == 0) goto L_0x0262
            if (r21 == 0) goto L_0x0262
            float r0 = r15.f61599o
            r1 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 / r0
            r15.f61599o = r6
            r0 = 1
            r15.f61598n = r0
            goto L_0x0262
        L_0x0223:
            if (r5 != r12) goto L_0x023f
            if (r2 != r4) goto L_0x023f
            r6 = 0
            r15.f61598n = r6
            float r0 = (float) r8
            float r1 = r1 * r0
            int r0 = (int) r1
            if (r11 == r12) goto L_0x023d
            r29 = r0
            r34 = r3
            r31 = r9
            r6 = 1065353216(0x3f800000, float:1.0)
            r23 = 0
            r33 = 4
            goto L_0x027d
        L_0x023d:
            r7 = r0
            goto L_0x0262
        L_0x023f:
            if (r11 != r12) goto L_0x0262
            if (r3 != r4) goto L_0x0262
            r4 = 1
            r15.f61598n = r4
            r4 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r13 != r4) goto L_0x024f
            float r1 = r6 / r1
            r15.f61599o = r1
        L_0x024f:
            float r1 = r15.f61599o
            float r0 = (float) r0
            float r1 = r1 * r0
            int r9 = (int) r1
            if (r5 == r12) goto L_0x0264
            r33 = r2
            r29 = r7
            r31 = r9
            r23 = 0
            r34 = 4
            goto L_0x027d
        L_0x0262:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0264:
            r33 = r2
            r34 = r3
            r29 = r7
            r31 = r9
            r23 = 1
            goto L_0x027d
        L_0x026f:
            r32 = r4
        L_0x0271:
            r6 = 1065353216(0x3f800000, float:1.0)
            r33 = r2
            r34 = r3
            r29 = r7
            r31 = r9
            r23 = 0
        L_0x027d:
            int[] r0 = r15.f61589g
            r1 = 0
            r0[r1] = r33
            r1 = 1
            r0[r1] = r34
            if (r23 == 0) goto L_0x0291
            int r0 = r15.f61598n
            r4 = -1
            if (r0 == 0) goto L_0x028e
            if (r0 != r4) goto L_0x0292
        L_0x028e:
            r28 = 1
            goto L_0x0294
        L_0x0291:
            r4 = -1
        L_0x0292:
            r28 = 0
        L_0x0294:
            o2.f$a[] r0 = r15.f61553C
            r1 = 0
            r0 = r0[r1]
            if (r0 != r10) goto L_0x02a2
            boolean r0 = r15 instanceof p368o2.C21740g
            if (r0 == 0) goto L_0x02a2
            r35 = 1
            goto L_0x02a4
        L_0x02a2:
            r35 = 0
        L_0x02a4:
            o2.e r0 = r15.f61610z
            boolean r0 = r0.mo34026c()
            r1 = 1
            r24 = r0 ^ 1
            int r0 = r15.f61577a
            r36 = 0
            r3 = 2
            if (r0 == r3) goto L_0x0319
            o2.f r0 = r15.f61554D
            if (r0 == 0) goto L_0x02c1
            o2.e r0 = r0.f61605u
            n2.h r0 = r14.mo33843j(r0)
            r37 = r0
            goto L_0x02c3
        L_0x02c1:
            r37 = r36
        L_0x02c3:
            o2.f r0 = r15.f61554D
            if (r0 == 0) goto L_0x02d0
            o2.e r0 = r0.f61603s
            n2.h r0 = r14.mo33843j(r0)
            r38 = r0
            goto L_0x02d2
        L_0x02d0:
            r38 = r36
        L_0x02d2:
            o2.f$a[] r0 = r15.f61553C
            r2 = 0
            r5 = r0[r2]
            o2.e r7 = r15.f61603s
            o2.e r8 = r15.f61605u
            int r9 = r15.f61559I
            int r11 = r15.f61568R
            int[] r0 = r15.f61601q
            r12 = r0[r2]
            float r13 = r15.f61572V
            int r0 = r15.f61591h
            r17 = r0
            int r0 = r15.f61593i
            r18 = r0
            float r0 = r15.f61594j
            r19 = r0
            r0 = r46
            r39 = r25
            r1 = r47
            r40 = r26
            r2 = r16
            r41 = r27
            r3 = r38
            r42 = r32
            r16 = -1
            r4 = r37
            r43 = r30
            r6 = r35
            r44 = r10
            r10 = r29
            r14 = r28
            r15 = r20
            r16 = r33
            r20 = r24
            r0.mo34036d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0325
        L_0x0319:
            r44 = r10
            r39 = r25
            r40 = r26
            r41 = r27
            r43 = r30
            r42 = r32
        L_0x0325:
            r15 = r46
            int r0 = r15.f61579b
            r1 = 2
            if (r0 != r1) goto L_0x032d
            return
        L_0x032d:
            o2.f$a[] r0 = r15.f61553C
            r14 = 1
            r0 = r0[r14]
            r1 = r44
            if (r0 != r1) goto L_0x033c
            boolean r0 = r15 instanceof p368o2.C21740g
            if (r0 == 0) goto L_0x033c
            r6 = 1
            goto L_0x033d
        L_0x033c:
            r6 = 0
        L_0x033d:
            if (r23 == 0) goto L_0x0349
            int r0 = r15.f61598n
            if (r0 == r14) goto L_0x0346
            r1 = -1
            if (r0 != r1) goto L_0x0349
        L_0x0346:
            r16 = 1
            goto L_0x034b
        L_0x0349:
            r16 = 0
        L_0x034b:
            int r0 = r15.f61567Q
            if (r0 <= 0) goto L_0x0378
            o2.e r1 = r15.f61607w
            o2.l r1 = r1.f61530a
            int r2 = r1.f61662b
            if (r2 != r14) goto L_0x035d
            r10 = r47
            r1.mo34068f(r10)
            goto L_0x037a
        L_0x035d:
            r10 = r47
            r1 = 6
            r2 = r39
            r4 = r41
            r10.mo33837d(r2, r4, r0, r1)
            o2.e r0 = r15.f61607w
            o2.e r0 = r0.f61533d
            if (r0 == 0) goto L_0x037c
            n2.h r0 = r10.mo33843j(r0)
            r3 = 0
            r10.mo33837d(r2, r0, r3, r1)
            r20 = 0
            goto L_0x037e
        L_0x0378:
            r10 = r47
        L_0x037a:
            r4 = r41
        L_0x037c:
            r20 = r24
        L_0x037e:
            o2.f r0 = r15.f61554D
            if (r0 == 0) goto L_0x038b
            o2.e r0 = r0.f61606v
            n2.h r0 = r10.mo33843j(r0)
            r24 = r0
            goto L_0x038d
        L_0x038b:
            r24 = r36
        L_0x038d:
            o2.f r0 = r15.f61554D
            if (r0 == 0) goto L_0x0399
            o2.e r0 = r0.f61604t
            n2.h r0 = r10.mo33843j(r0)
            r3 = r0
            goto L_0x039b
        L_0x0399:
            r3 = r36
        L_0x039b:
            o2.f$a[] r0 = r15.f61553C
            r5 = r0[r14]
            o2.e r7 = r15.f61604t
            o2.e r8 = r15.f61606v
            int r9 = r15.f61560J
            int r11 = r15.f61569S
            int[] r0 = r15.f61601q
            r12 = r0[r14]
            float r13 = r15.f61573W
            int r0 = r15.f61595k
            r17 = r0
            int r0 = r15.f61596l
            r18 = r0
            float r0 = r15.f61597m
            r19 = r0
            r0 = r46
            r1 = r47
            r2 = r21
            r45 = r4
            r4 = r24
            r10 = r31
            r14 = r16
            r15 = r22
            r16 = r34
            r0.mo34036d(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            if (r23 == 0) goto L_0x042f
            r0 = r46
            int r1 = r0.f61598n
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3 = 1
            if (r1 != r3) goto L_0x0404
            float r1 = r0.f61599o
            n2.b r3 = r47.mo33844k()
            n2.a r4 = r3.f61129c
            r5 = r40
            r4.mo33825f(r5, r2)
            n2.a r2 = r3.f61129c
            r4 = r45
            r6 = 1065353216(0x3f800000, float:1.0)
            r2.mo33825f(r4, r6)
            n2.a r2 = r3.f61129c
            r7 = r42
            r2.mo33825f(r7, r1)
            n2.a r2 = r3.f61129c
            float r1 = -r1
            r8 = r43
            r2.mo33825f(r8, r1)
            r1 = r47
            r1.mo33836c(r3)
            goto L_0x0433
        L_0x0404:
            r1 = r47
            r5 = r40
            r7 = r42
            r8 = r43
            r4 = r45
            r6 = 1065353216(0x3f800000, float:1.0)
            float r3 = r0.f61599o
            n2.b r9 = r47.mo33844k()
            n2.a r10 = r9.f61129c
            r10.mo33825f(r7, r2)
            n2.a r2 = r9.f61129c
            r2.mo33825f(r8, r6)
            n2.a r2 = r9.f61129c
            r2.mo33825f(r5, r3)
            n2.a r2 = r9.f61129c
            float r3 = -r3
            r2.mo33825f(r4, r3)
            r1.mo33836c(r9)
            goto L_0x0433
        L_0x042f:
            r0 = r46
            r1 = r47
        L_0x0433:
            o2.e r2 = r0.f61610z
            boolean r2 = r2.mo34026c()
            if (r2 == 0) goto L_0x04f2
            o2.e r2 = r0.f61610z
            o2.e r2 = r2.f61533d
            o2.f r2 = r2.f61531b
            float r3 = r0.f61602r
            r4 = 1119092736(0x42b40000, float:90.0)
            float r3 = r3 + r4
            double r3 = (double) r3
            double r3 = java.lang.Math.toRadians(r3)
            float r3 = (float) r3
            o2.e r4 = r0.f61610z
            int r4 = r4.mo34025b()
            o2.e$b r5 = p368o2.C21735e.C21737b.LEFT
            o2.e r6 = r0.mo34038f(r5)
            n2.h r6 = r1.mo33843j(r6)
            o2.e$b r7 = p368o2.C21735e.C21737b.TOP
            o2.e r8 = r0.mo34038f(r7)
            n2.h r8 = r1.mo33843j(r8)
            o2.e$b r9 = p368o2.C21735e.C21737b.RIGHT
            o2.e r10 = r0.mo34038f(r9)
            n2.h r10 = r1.mo33843j(r10)
            o2.e$b r11 = p368o2.C21735e.C21737b.BOTTOM
            o2.e r12 = r0.mo34038f(r11)
            n2.h r12 = r1.mo33843j(r12)
            o2.e r5 = r2.mo34038f(r5)
            n2.h r5 = r1.mo33843j(r5)
            o2.e r7 = r2.mo34038f(r7)
            n2.h r7 = r1.mo33843j(r7)
            o2.e r9 = r2.mo34038f(r9)
            n2.h r9 = r1.mo33843j(r9)
            o2.e r2 = r2.mo34038f(r11)
            n2.h r2 = r1.mo33843j(r2)
            n2.b r11 = r47.mo33844k()
            double r13 = (double) r3
            double r15 = java.lang.Math.sin(r13)
            double r3 = (double) r4
            r18 = r9
            r17 = r10
            double r9 = r15 * r3
            float r9 = (float) r9
            n2.a r10 = r11.f61129c
            r15 = 1056964608(0x3f000000, float:0.5)
            r10.mo33825f(r7, r15)
            n2.a r7 = r11.f61129c
            r7.mo33825f(r2, r15)
            n2.a r2 = r11.f61129c
            r7 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2.mo33825f(r8, r7)
            n2.a r2 = r11.f61129c
            r2.mo33825f(r12, r7)
            float r2 = -r9
            r11.f61128b = r2
            r1.mo33836c(r11)
            n2.b r2 = r47.mo33844k()
            double r8 = java.lang.Math.cos(r13)
            double r8 = r8 * r3
            float r3 = (float) r8
            n2.a r4 = r2.f61129c
            r4.mo33825f(r5, r15)
            n2.a r4 = r2.f61129c
            r5 = r18
            r4.mo33825f(r5, r15)
            n2.a r4 = r2.f61129c
            r4.mo33825f(r6, r7)
            n2.a r4 = r2.f61129c
            r5 = r17
            r4.mo33825f(r5, r7)
            float r3 = -r3
            r2.f61128b = r3
            r1.mo33836c(r2)
        L_0x04f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21738f.mo34019a(n2.e):void");
    }

    /* renamed from: b */
    public boolean mo34020b() {
        return this.f61575Y != 8;
    }

    /* renamed from: c */
    public void mo34021c(int i) {
        C21739a aVar = C21739a.FIXED;
        for (int i2 = 0; i2 < 6; i2++) {
            C21745l lVar = this.f61551A[i2].f61530a;
            C21735e eVar = lVar.f61650c;
            C21735e eVar2 = eVar.f61533d;
            if (eVar2 != null) {
                if (eVar2.f61533d == eVar) {
                    lVar.f61655h = 4;
                    eVar2.f61530a.f61655h = 4;
                }
                int b = eVar.mo34025b();
                C21735e.C21737b bVar = lVar.f61650c.f61532c;
                if (bVar == C21735e.C21737b.RIGHT || bVar == C21735e.C21737b.BOTTOM) {
                    b = -b;
                }
                lVar.mo34070h(eVar2.f61530a, b);
            }
        }
        C21745l lVar2 = this.f61603s.f61530a;
        C21745l lVar3 = this.f61604t.f61530a;
        C21745l lVar4 = this.f61605u.f61530a;
        C21745l lVar5 = this.f61606v.f61530a;
        boolean z = (i & 8) == 8;
        C21739a aVar2 = this.f61553C[0];
        C21739a aVar3 = C21739a.MATCH_CONSTRAINT;
        boolean z2 = aVar2 == aVar3 && C21744k.m24782a(this, 0);
        if (!(lVar2.f61655h == 4 || lVar4.f61655h == 4)) {
            if (this.f61553C[0] == aVar || (z2 && this.f61575Y == 8)) {
                C21735e eVar3 = this.f61603s.f61533d;
                if (eVar3 == null && this.f61605u.f61533d == null) {
                    lVar2.f61655h = 1;
                    lVar4.f61655h = 1;
                    if (z) {
                        lVar4.mo34071i(lVar2, 1, mo34046n());
                    } else {
                        lVar4.mo34070h(lVar2, mo34049q());
                    }
                } else if (eVar3 != null && this.f61605u.f61533d == null) {
                    lVar2.f61655h = 1;
                    lVar4.f61655h = 1;
                    if (z) {
                        lVar4.mo34071i(lVar2, 1, mo34046n());
                    } else {
                        lVar4.mo34070h(lVar2, mo34049q());
                    }
                } else if (eVar3 == null && this.f61605u.f61533d != null) {
                    lVar2.f61655h = 1;
                    lVar4.f61655h = 1;
                    lVar2.mo34070h(lVar4, -mo34049q());
                    if (z) {
                        lVar2.mo34071i(lVar4, -1, mo34046n());
                    } else {
                        lVar2.mo34070h(lVar4, -mo34049q());
                    }
                } else if (!(eVar3 == null || this.f61605u.f61533d == null)) {
                    lVar2.f61655h = 2;
                    lVar4.f61655h = 2;
                    if (z) {
                        mo34046n().mo34078a(lVar2);
                        mo34046n().mo34078a(lVar4);
                        C21746m n = mo34046n();
                        lVar2.f61656i = lVar4;
                        lVar2.f61659l = n;
                        C21746m n2 = mo34046n();
                        lVar4.f61656i = lVar2;
                        lVar4.f61659l = n2;
                    } else {
                        lVar2.f61656i = lVar4;
                        lVar4.f61656i = lVar2;
                    }
                }
            } else if (z2) {
                int q = mo34049q();
                lVar2.f61655h = 1;
                lVar4.f61655h = 1;
                C21735e eVar4 = this.f61603s.f61533d;
                if (eVar4 == null && this.f61605u.f61533d == null) {
                    if (z) {
                        lVar4.mo34071i(lVar2, 1, mo34046n());
                    } else {
                        lVar4.mo34070h(lVar2, q);
                    }
                } else if (eVar4 == null || this.f61605u.f61533d != null) {
                    if (eVar4 != null || this.f61605u.f61533d == null) {
                        if (!(eVar4 == null || this.f61605u.f61533d == null)) {
                            if (z) {
                                mo34046n().mo34078a(lVar2);
                                mo34046n().mo34078a(lVar4);
                            }
                            if (this.f61557G == 0.0f) {
                                lVar2.f61655h = 3;
                                lVar4.f61655h = 3;
                                lVar2.f61656i = lVar4;
                                lVar4.f61656i = lVar2;
                            } else {
                                lVar2.f61655h = 2;
                                lVar4.f61655h = 2;
                                lVar2.f61656i = lVar4;
                                lVar4.f61656i = lVar2;
                                mo34033D(q);
                            }
                        }
                    } else if (z) {
                        lVar2.mo34071i(lVar4, -1, mo34046n());
                    } else {
                        lVar2.mo34070h(lVar4, -q);
                    }
                } else if (z) {
                    lVar4.mo34071i(lVar2, 1, mo34046n());
                } else {
                    lVar4.mo34070h(lVar2, q);
                }
            }
        }
        boolean z3 = this.f61553C[1] == aVar3 && C21744k.m24782a(this, 1);
        if (lVar3.f61655h != 4 && lVar5.f61655h != 4) {
            if (this.f61553C[1] == aVar || (z3 && this.f61575Y == 8)) {
                C21735e eVar5 = this.f61604t.f61533d;
                if (eVar5 == null && this.f61606v.f61533d == null) {
                    lVar3.f61655h = 1;
                    lVar5.f61655h = 1;
                    if (z) {
                        lVar5.mo34071i(lVar3, 1, mo34045m());
                    } else {
                        lVar5.mo34070h(lVar3, mo34043k());
                    }
                    C21735e eVar6 = this.f61607w;
                    if (eVar6.f61533d != null) {
                        C21745l lVar6 = eVar6.f61530a;
                        lVar6.f61655h = 1;
                        lVar3.mo34069g(1, lVar6, -this.f61567Q);
                    }
                } else if (eVar5 != null && this.f61606v.f61533d == null) {
                    lVar3.f61655h = 1;
                    lVar5.f61655h = 1;
                    if (z) {
                        lVar5.mo34071i(lVar3, 1, mo34045m());
                    } else {
                        lVar5.mo34070h(lVar3, mo34043k());
                    }
                    int i3 = this.f61567Q;
                    if (i3 > 0) {
                        this.f61607w.f61530a.mo34069g(1, lVar3, i3);
                    }
                } else if (eVar5 == null && this.f61606v.f61533d != null) {
                    lVar3.f61655h = 1;
                    lVar5.f61655h = 1;
                    if (z) {
                        lVar3.mo34071i(lVar5, -1, mo34045m());
                    } else {
                        lVar3.mo34070h(lVar5, -mo34043k());
                    }
                    int i4 = this.f61567Q;
                    if (i4 > 0) {
                        this.f61607w.f61530a.mo34069g(1, lVar3, i4);
                    }
                } else if (eVar5 != null && this.f61606v.f61533d != null) {
                    lVar3.f61655h = 2;
                    lVar5.f61655h = 2;
                    if (z) {
                        C21746m m = mo34045m();
                        lVar3.f61656i = lVar5;
                        lVar3.f61659l = m;
                        C21746m m2 = mo34045m();
                        lVar5.f61656i = lVar3;
                        lVar5.f61659l = m2;
                        mo34045m().mo34078a(lVar3);
                        mo34046n().mo34078a(lVar5);
                    } else {
                        lVar3.f61656i = lVar5;
                        lVar5.f61656i = lVar3;
                    }
                    int i5 = this.f61567Q;
                    if (i5 > 0) {
                        this.f61607w.f61530a.mo34069g(1, lVar3, i5);
                    }
                }
            } else if (z3) {
                int k = mo34043k();
                lVar3.f61655h = 1;
                lVar5.f61655h = 1;
                C21735e eVar7 = this.f61604t.f61533d;
                if (eVar7 == null && this.f61606v.f61533d == null) {
                    if (z) {
                        lVar5.mo34071i(lVar3, 1, mo34045m());
                    } else {
                        lVar5.mo34070h(lVar3, k);
                    }
                } else if (eVar7 == null || this.f61606v.f61533d != null) {
                    if (eVar7 != null || this.f61606v.f61533d == null) {
                        if (eVar7 != null && this.f61606v.f61533d != null) {
                            if (z) {
                                mo34045m().mo34078a(lVar3);
                                mo34046n().mo34078a(lVar5);
                            }
                            if (this.f61557G == 0.0f) {
                                lVar3.f61655h = 3;
                                lVar5.f61655h = 3;
                                lVar3.f61656i = lVar5;
                                lVar5.f61656i = lVar3;
                                return;
                            }
                            lVar3.f61655h = 2;
                            lVar5.f61655h = 2;
                            lVar3.f61656i = lVar5;
                            lVar5.f61656i = lVar3;
                            mo34057z(k);
                            int i6 = this.f61567Q;
                            if (i6 > 0) {
                                this.f61607w.f61530a.mo34069g(1, lVar3, i6);
                            }
                        }
                    } else if (z) {
                        lVar3.mo34071i(lVar5, -1, mo34045m());
                    } else {
                        lVar3.mo34070h(lVar5, -k);
                    }
                } else if (z) {
                    lVar5.mo34071i(lVar3, 1, mo34045m());
                } else {
                    lVar5.mo34070h(lVar3, k);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:143:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0290  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x02b2  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x017c  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34036d(p363n2.C21589e r23, boolean r24, p363n2.C21593h r25, p363n2.C21593h r26, p368o2.C21738f.C21739a r27, boolean r28, p368o2.C21735e r29, p368o2.C21735e r30, int r31, int r32, int r33, int r34, float r35, boolean r36, boolean r37, int r38, int r39, int r40, float r41, boolean r42) {
        /*
            r22 = this;
            r0 = r22
            r10 = r23
            r11 = r25
            r12 = r26
            r13 = r29
            r14 = r30
            r1 = r33
            r2 = r34
            r3 = r41
            o2.e$b r4 = p368o2.C21735e.C21737b.BOTTOM
            n2.h r15 = r10.mo33843j(r13)
            n2.h r9 = r10.mo33843j(r14)
            o2.e r5 = r13.f61533d
            n2.h r8 = r10.mo33843j(r5)
            o2.e r5 = r14.f61533d
            n2.h r7 = r10.mo33843j(r5)
            boolean r5 = r10.f61140f
            if (r5 == 0) goto L_0x004b
            o2.l r5 = r13.f61530a
            int r6 = r5.f61662b
            r11 = 1
            if (r6 != r11) goto L_0x004b
            o2.l r6 = r14.f61530a
            int r6 = r6.f61662b
            if (r6 != r11) goto L_0x004b
            r5.mo34068f(r10)
            o2.l r1 = r14.f61530a
            r1.mo34068f(r10)
            if (r37 != 0) goto L_0x004a
            if (r24 == 0) goto L_0x004a
            r1 = 0
            r2 = 6
            r10.mo33839f(r12, r9, r1, r2)
        L_0x004a:
            return
        L_0x004b:
            boolean r5 = r29.mo34026c()
            boolean r6 = r30.mo34026c()
            o2.e r11 = r0.f61610z
            boolean r11 = r11.mo34026c()
            if (r6 == 0) goto L_0x005e
            int r19 = r5 + 1
            goto L_0x0060
        L_0x005e:
            r19 = r5
        L_0x0060:
            if (r11 == 0) goto L_0x0064
            int r19 = r19 + 1
        L_0x0064:
            r14 = r19
            r19 = r7
            if (r36 == 0) goto L_0x006c
            r7 = 3
            goto L_0x006e
        L_0x006c:
            r7 = r38
        L_0x006e:
            int r12 = r27.ordinal()
            r20 = r14
            r14 = 2
            if (r12 == 0) goto L_0x0083
            r3 = 1
            if (r12 == r3) goto L_0x0083
            if (r12 == r14) goto L_0x007d
            goto L_0x0083
        L_0x007d:
            r3 = 4
            if (r7 != r3) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r3 = 1
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            int r12 = r0.f61575Y
            r14 = 8
            if (r12 != r14) goto L_0x008d
            r3 = 0
            r12 = 0
            goto L_0x0090
        L_0x008d:
            r12 = r3
            r3 = r32
        L_0x0090:
            if (r42 == 0) goto L_0x00ad
            if (r5 != 0) goto L_0x009e
            if (r6 != 0) goto L_0x009e
            if (r11 != 0) goto L_0x009e
            r14 = r31
            r10.mo33838e(r15, r14)
            goto L_0x00ad
        L_0x009e:
            if (r5 == 0) goto L_0x00ad
            if (r6 != 0) goto L_0x00ad
            int r14 = r29.mo34025b()
            r21 = r11
            r11 = 6
            r10.mo33837d(r15, r8, r14, r11)
            goto L_0x00b0
        L_0x00ad:
            r21 = r11
            r11 = 6
        L_0x00b0:
            if (r12 != 0) goto L_0x00d2
            if (r28 == 0) goto L_0x00c7
            r4 = 3
            r14 = 0
            r10.mo33837d(r9, r15, r14, r4)
            if (r1 <= 0) goto L_0x00be
            r10.mo33839f(r9, r15, r1, r11)
        L_0x00be:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 >= r3) goto L_0x00ca
            r10.mo33840g(r9, r15, r2, r11)
            goto L_0x00ca
        L_0x00c7:
            r10.mo33837d(r9, r15, r3, r11)
        L_0x00ca:
            r14 = r39
            r11 = r40
            r0 = r20
            goto L_0x017a
        L_0x00d2:
            r2 = -2
            r14 = r39
            r11 = r40
            if (r14 != r2) goto L_0x00da
            r14 = r3
        L_0x00da:
            if (r11 != r2) goto L_0x00dd
            r11 = r3
        L_0x00dd:
            r2 = 6
            if (r14 <= 0) goto L_0x00e7
            r10.mo33839f(r9, r15, r14, r2)
            int r3 = java.lang.Math.max(r3, r14)
        L_0x00e7:
            if (r11 <= 0) goto L_0x00f0
            r10.mo33840g(r9, r15, r11, r2)
            int r3 = java.lang.Math.min(r3, r11)
        L_0x00f0:
            r2 = 1
            if (r7 != r2) goto L_0x0106
            if (r24 == 0) goto L_0x00fa
            r4 = 6
            r10.mo33837d(r9, r15, r3, r4)
            goto L_0x0162
        L_0x00fa:
            if (r37 == 0) goto L_0x0101
            r4 = 4
            r10.mo33837d(r9, r15, r3, r4)
            goto L_0x0162
        L_0x0101:
            r4 = 4
            r10.mo33837d(r9, r15, r3, r2)
            goto L_0x0162
        L_0x0106:
            r2 = 2
            if (r7 != r2) goto L_0x0162
            o2.e$b r2 = r13.f61532c
            o2.e$b r12 = p368o2.C21735e.C21737b.TOP
            if (r2 == r12) goto L_0x012b
            if (r2 != r4) goto L_0x0112
            goto L_0x012b
        L_0x0112:
            o2.f r2 = r0.f61554D
            o2.e$b r4 = p368o2.C21735e.C21737b.LEFT
            o2.e r2 = r2.mo34038f(r4)
            n2.h r2 = r10.mo33843j(r2)
            o2.f r4 = r0.f61554D
            o2.e$b r12 = p368o2.C21735e.C21737b.RIGHT
            o2.e r4 = r4.mo34038f(r12)
            n2.h r4 = r10.mo33843j(r4)
            goto L_0x013f
        L_0x012b:
            o2.f r2 = r0.f61554D
            o2.e r2 = r2.mo34038f(r12)
            n2.h r2 = r10.mo33843j(r2)
            o2.f r12 = r0.f61554D
            o2.e r4 = r12.mo34038f(r4)
            n2.h r4 = r10.mo33843j(r4)
        L_0x013f:
            n2.b r12 = r23.mo33844k()
            n2.a r13 = r12.f61129c
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r13.mo33825f(r9, r0)
            n2.a r0 = r12.f61129c
            r13 = 1065353216(0x3f800000, float:1.0)
            r0.mo33825f(r15, r13)
            n2.a r0 = r12.f61129c
            r13 = r41
            r0.mo33825f(r4, r13)
            n2.a r0 = r12.f61129c
            float r4 = -r13
            r0.mo33825f(r2, r4)
            r10.mo33836c(r12)
            r12 = 0
        L_0x0162:
            r0 = r20
            if (r12 == 0) goto L_0x017a
            r2 = 2
            if (r0 == r2) goto L_0x017a
            if (r36 != 0) goto L_0x017a
            int r2 = java.lang.Math.max(r14, r3)
            if (r11 <= 0) goto L_0x0175
            int r2 = java.lang.Math.min(r11, r2)
        L_0x0175:
            r3 = 6
            r10.mo33837d(r9, r15, r2, r3)
            r12 = 0
        L_0x017a:
            if (r42 == 0) goto L_0x02c4
            if (r37 == 0) goto L_0x0189
            r2 = r26
            r5 = r0
            r1 = r9
            r3 = 6
            r4 = 0
            r6 = 2
            r0 = r25
            goto L_0x02cd
        L_0x0189:
            r0 = 5
            if (r5 != 0) goto L_0x019a
            if (r6 != 0) goto L_0x019a
            if (r21 != 0) goto L_0x019a
            r4 = r26
            if (r24 == 0) goto L_0x02b8
            r13 = 0
            r10.mo33839f(r4, r9, r13, r0)
            goto L_0x02b8
        L_0x019a:
            r4 = r26
            r13 = 0
            if (r5 == 0) goto L_0x01a8
            if (r6 != 0) goto L_0x01a8
            if (r24 == 0) goto L_0x02b8
            r10.mo33839f(r4, r9, r13, r0)
            goto L_0x02b8
        L_0x01a8:
            if (r5 != 0) goto L_0x01c0
            if (r6 == 0) goto L_0x01c0
            int r1 = r30.mo34025b()
            int r1 = -r1
            r3 = r19
            r2 = 6
            r10.mo33837d(r9, r3, r1, r2)
            if (r24 == 0) goto L_0x02b8
            r2 = r25
            r10.mo33839f(r15, r2, r13, r0)
            goto L_0x02b8
        L_0x01c0:
            r2 = r25
            r3 = r19
            if (r5 == 0) goto L_0x02b8
            if (r6 == 0) goto L_0x02b8
            if (r12 == 0) goto L_0x0230
            if (r24 == 0) goto L_0x01d3
            if (r1 != 0) goto L_0x01d3
            r6 = 6
            r10.mo33839f(r9, r15, r13, r6)
            goto L_0x01d4
        L_0x01d3:
            r6 = 6
        L_0x01d4:
            if (r7 != 0) goto L_0x01ff
            if (r11 > 0) goto L_0x01de
            if (r14 <= 0) goto L_0x01db
            goto L_0x01de
        L_0x01db:
            r1 = 6
            r5 = 0
            goto L_0x01e0
        L_0x01de:
            r1 = 4
            r5 = 1
        L_0x01e0:
            int r7 = r29.mo34025b()
            r10.mo33837d(r15, r8, r7, r1)
            int r7 = r30.mo34025b()
            int r7 = -r7
            r10.mo33837d(r9, r3, r7, r1)
            if (r11 > 0) goto L_0x01f6
            if (r14 <= 0) goto L_0x01f4
            goto L_0x01f6
        L_0x01f4:
            r11 = 0
            goto L_0x01f7
        L_0x01f6:
            r11 = 1
        L_0x01f7:
            r7 = r22
            r16 = r5
            r1 = r11
            r11 = 5
            r14 = 1
            goto L_0x023a
        L_0x01ff:
            r14 = 1
            if (r7 != r14) goto L_0x0209
            r1 = 1
            r11 = 6
            r16 = 1
            r7 = r22
            goto L_0x023a
        L_0x0209:
            r1 = 3
            if (r7 != r1) goto L_0x022c
            r7 = r22
            if (r36 != 0) goto L_0x0219
            int r1 = r7.f61598n
            r5 = -1
            if (r1 == r5) goto L_0x0219
            if (r11 > 0) goto L_0x0219
            r1 = 6
            goto L_0x021a
        L_0x0219:
            r1 = 4
        L_0x021a:
            int r5 = r29.mo34025b()
            r10.mo33837d(r15, r8, r5, r1)
            int r5 = r30.mo34025b()
            int r5 = -r5
            r10.mo33837d(r9, r3, r5, r1)
            r1 = 1
            r11 = 1
            goto L_0x0236
        L_0x022c:
            r7 = r22
            r11 = 0
            goto L_0x0235
        L_0x0230:
            r7 = r22
            r6 = 6
            r14 = 1
            r11 = 1
        L_0x0235:
            r1 = 0
        L_0x0236:
            r16 = r1
            r1 = r11
            r11 = 5
        L_0x023a:
            if (r1 == 0) goto L_0x0282
            int r5 = r29.mo34025b()
            int r17 = r30.mo34025b()
            r1 = r23
            r0 = r2
            r2 = r15
            r18 = r3
            r3 = r8
            r13 = r4
            r4 = r5
            r5 = r35
            r13 = 0
            r14 = 6
            r6 = r18
            r13 = r18
            r7 = r9
            r14 = r8
            r8 = r17
            r0 = r9
            r9 = r11
            r1.mo33835b(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = r29
            o2.e r2 = r1.f61533d
            o2.f r2 = r2.f61531b
            boolean r2 = r2 instanceof p368o2.C21732b
            r3 = r30
            o2.e r4 = r3.f61533d
            o2.f r4 = r4.f61531b
            boolean r4 = r4 instanceof p368o2.C21732b
            if (r2 == 0) goto L_0x0278
            if (r4 != 0) goto L_0x0278
            r6 = r24
            r2 = 5
            r4 = 1
            r5 = 6
            goto L_0x028e
        L_0x0278:
            if (r2 != 0) goto L_0x0289
            if (r4 == 0) goto L_0x0289
            r4 = r24
            r2 = 6
            r5 = 5
            r6 = 1
            goto L_0x028e
        L_0x0282:
            r1 = r29
            r13 = r3
            r14 = r8
            r0 = r9
            r3 = r30
        L_0x0289:
            r4 = r24
            r6 = r4
            r2 = 5
            r5 = 5
        L_0x028e:
            if (r16 == 0) goto L_0x0292
            r2 = 6
            r5 = 6
        L_0x0292:
            if (r12 != 0) goto L_0x0296
            if (r6 != 0) goto L_0x0298
        L_0x0296:
            if (r16 == 0) goto L_0x029f
        L_0x0298:
            int r1 = r29.mo34025b()
            r10.mo33839f(r15, r14, r1, r2)
        L_0x029f:
            if (r12 != 0) goto L_0x02a3
            if (r4 != 0) goto L_0x02a5
        L_0x02a3:
            if (r16 == 0) goto L_0x02ad
        L_0x02a5:
            int r1 = r30.mo34025b()
            int r1 = -r1
            r10.mo33840g(r0, r13, r1, r5)
        L_0x02ad:
            r1 = r0
            r2 = 0
            r3 = 6
            if (r24 == 0) goto L_0x02bb
            r0 = r25
            r10.mo33839f(r15, r0, r2, r3)
            goto L_0x02bb
        L_0x02b8:
            r1 = r9
            r2 = 0
            r3 = 6
        L_0x02bb:
            if (r24 == 0) goto L_0x02c3
            r2 = r26
            r4 = 0
            r10.mo33839f(r2, r1, r4, r3)
        L_0x02c3:
            return
        L_0x02c4:
            r2 = r26
            r5 = r0
            r1 = r9
            r3 = 6
            r4 = 0
            r0 = r25
            r6 = 2
        L_0x02cd:
            if (r5 >= r6) goto L_0x02d7
            if (r24 == 0) goto L_0x02d7
            r10.mo33839f(r15, r0, r4, r3)
            r10.mo33839f(r2, r1, r4, r3)
        L_0x02d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21738f.mo34036d(n2.e, boolean, n2.h, n2.h, o2.f$a, boolean, o2.e, o2.e, int, int, int, int, float, boolean, boolean, int, int, int, float, boolean):void");
    }

    /* renamed from: e */
    public void mo34037e(C21589e eVar) {
        eVar.mo33843j(this.f61603s);
        eVar.mo33843j(this.f61604t);
        eVar.mo33843j(this.f61605u);
        eVar.mo33843j(this.f61606v);
        if (this.f61567Q > 0) {
            eVar.mo33843j(this.f61607w);
        }
    }

    /* renamed from: f */
    public C21735e mo34038f(C21735e.C21737b bVar) {
        switch (bVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.f61603s;
            case 2:
                return this.f61604t;
            case 3:
                return this.f61605u;
            case 4:
                return this.f61606v;
            case 5:
                return this.f61607w;
            case 6:
                return this.f61610z;
            case 7:
                return this.f61608x;
            case 8:
                return this.f61609y;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    /* renamed from: g */
    public ArrayList<C21735e> mo34039g() {
        return this.f61552B;
    }

    /* renamed from: h */
    public int mo34040h() {
        return this.f61567Q;
    }

    /* renamed from: i */
    public int mo34041i() {
        return this.f61560J + this.f61556F;
    }

    /* renamed from: j */
    public Object mo34042j() {
        return this.f61574X;
    }

    /* renamed from: k */
    public int mo34043k() {
        if (this.f61575Y == 8) {
            return 0;
        }
        return this.f61556F;
    }

    /* renamed from: l */
    public int mo34044l(int i) {
        if (i == 0) {
            return mo34049q();
        }
        if (i == 1) {
            return mo34043k();
        }
        return 0;
    }

    /* renamed from: m */
    public C21746m mo34045m() {
        if (this.f61583d == null) {
            this.f61583d = new C21746m();
        }
        return this.f61583d;
    }

    /* renamed from: n */
    public C21746m mo34046n() {
        if (this.f61581c == null) {
            this.f61581c = new C21746m();
        }
        return this.f61581c;
    }

    /* renamed from: o */
    public int mo34047o() {
        return this.f61559I + this.f61555E;
    }

    /* renamed from: p */
    public int mo34048p() {
        return this.f61575Y;
    }

    /* renamed from: q */
    public int mo34049q() {
        if (this.f61575Y == 8) {
            return 0;
        }
        return this.f61555E;
    }

    /* renamed from: r */
    public void mo34050r(C21735e.C21737b bVar, C21738f fVar, C21735e.C21737b bVar2, int i, int i2) {
        mo34038f(bVar).mo34024a(fVar.mo34038f(bVar2), i, i2, C21735e.C21736a.STRONG, 0, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = r0[r5 + 1];
        r0 = r5.f61533d;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo34051s(int r5) {
        /*
            r4 = this;
            int r5 = r5 * 2
            o2.e[] r0 = r4.f61551A
            r1 = r0[r5]
            o2.e r2 = r1.f61533d
            r3 = 1
            if (r2 == 0) goto L_0x001b
            o2.e r2 = r2.f61533d
            if (r2 == r1) goto L_0x001b
            int r5 = r5 + r3
            r5 = r0[r5]
            o2.e r0 = r5.f61533d
            if (r0 == 0) goto L_0x001b
            o2.e r0 = r0.f61533d
            if (r0 != r5) goto L_0x001b
            goto L_0x001c
        L_0x001b:
            r3 = 0
        L_0x001c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p368o2.C21738f.mo34051s(int):boolean");
    }

    /* renamed from: t */
    public boolean mo34052t() {
        return this.f61603s.f61530a.f61662b == 1 && this.f61605u.f61530a.f61662b == 1 && this.f61604t.f61530a.f61662b == 1 && this.f61606v.f61530a.f61662b == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(str);
        if (this.f61576Z != null) {
            str = "id: " + this.f61576Z + " ";
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f61559I);
        sb.append(", ");
        sb.append(this.f61560J);
        sb.append(") - (");
        sb.append(this.f61555E);
        sb.append(" x ");
        sb.append(this.f61556F);
        sb.append(") wrap: (");
        sb.append(this.f61570T);
        sb.append(" x ");
        sb.append(this.f61571U);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: u */
    public void mo34054u() {
        this.f61603s.mo34027d();
        this.f61604t.mo34027d();
        this.f61605u.mo34027d();
        this.f61606v.mo34027d();
        this.f61607w.mo34027d();
        this.f61608x.mo34027d();
        this.f61609y.mo34027d();
        this.f61610z.mo34027d();
        this.f61554D = null;
        this.f61602r = 0.0f;
        this.f61555E = 0;
        this.f61556F = 0;
        this.f61557G = 0.0f;
        this.f61558H = -1;
        this.f61559I = 0;
        this.f61560J = 0;
        this.f61563M = 0;
        this.f61564N = 0;
        this.f61565O = 0;
        this.f61566P = 0;
        this.f61567Q = 0;
        this.f61568R = 0;
        this.f61569S = 0;
        this.f61570T = 0;
        this.f61571U = 0;
        this.f61572V = 0.5f;
        this.f61573W = 0.5f;
        C21739a[] aVarArr = this.f61553C;
        C21739a aVar = C21739a.FIXED;
        aVarArr[0] = aVar;
        aVarArr[1] = aVar;
        this.f61574X = null;
        this.f61575Y = 0;
        this.f61584d0 = 0;
        this.f61586e0 = 0;
        float[] fArr = this.f61588f0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f61577a = -1;
        this.f61579b = -1;
        int[] iArr = this.f61601q;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f61585e = 0;
        this.f61587f = 0;
        this.f61594j = 1.0f;
        this.f61597m = 1.0f;
        this.f61593i = Integer.MAX_VALUE;
        this.f61596l = Integer.MAX_VALUE;
        this.f61591h = 0;
        this.f61595k = 0;
        this.f61598n = -1;
        this.f61599o = 1.0f;
        C21746m mVar = this.f61581c;
        if (mVar != null) {
            mVar.mo34076f();
        }
        C21746m mVar2 = this.f61583d;
        if (mVar2 != null) {
            mVar2.mo34076f();
        }
        this.f61600p = null;
        this.f61578a0 = false;
        this.f61580b0 = false;
        this.f61582c0 = false;
    }

    /* renamed from: v */
    public void mo34022v() {
        for (int i = 0; i < 6; i++) {
            this.f61551A[i].f61530a.mo34072j();
        }
    }

    /* renamed from: w */
    public void mo34055w(C21587c cVar) {
        this.f61603s.mo34028e(cVar);
        this.f61604t.mo34028e(cVar);
        this.f61605u.mo34028e(cVar);
        this.f61606v.mo34028e(cVar);
        this.f61607w.mo34028e(cVar);
        this.f61610z.mo34028e(cVar);
        this.f61608x.mo34028e(cVar);
        this.f61609y.mo34028e(cVar);
    }

    /* renamed from: x */
    public void mo34023x() {
    }

    /* renamed from: y */
    public void mo34056y(int i) {
        this.f61567Q = i;
    }

    /* renamed from: z */
    public void mo34057z(int i) {
        this.f61556F = i;
        int i2 = this.f61569S;
        if (i < i2) {
            this.f61556F = i2;
        }
    }
}
