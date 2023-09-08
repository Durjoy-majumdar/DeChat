package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class jv4 extends C47465a {

    /* renamed from: A */
    public C51018qv3 f332079A;

    /* renamed from: B */
    public int f332080B;

    /* renamed from: C */
    public C51018qv3 f332081C;

    /* renamed from: D */
    public int f332082D;

    /* renamed from: E */
    public int f332083E;

    /* renamed from: F */
    public int f332084F;

    /* renamed from: G */
    public C110969pk2 f332085G;

    /* renamed from: H */
    public C51018qv3 f332086H;

    /* renamed from: I */
    public int f332087I;

    /* renamed from: J */
    public String f332088J;

    /* renamed from: K */
    public int f332089K;

    /* renamed from: L */
    public LinkedList<kv4> f332090L = new LinkedList<>();

    /* renamed from: M */
    public C101858vq3 f332091M;

    /* renamed from: N */
    public C101763c50 f332092N;

    /* renamed from: P */
    public C49798i42 f332093P;

    /* renamed from: d */
    public pv4 f332094d;

    /* renamed from: e */
    public pv4 f332095e;

    /* renamed from: f */
    public int f332096f;

    /* renamed from: g */
    public wt4 f332097g;

    /* renamed from: h */
    public wt4 f332098h;

    /* renamed from: i */
    public int f332099i;

    /* renamed from: j */
    public int f332100j;

    /* renamed from: n */
    public int f332101n;

    /* renamed from: o */
    public int f332102o;

    /* renamed from: p */
    public C51018qv3 f332103p;

    /* renamed from: q */
    public int f332104q;

    /* renamed from: r */
    public wt4 f332105r;

    /* renamed from: s */
    public int f332106s;

    /* renamed from: t */
    public int f332107t;

    /* renamed from: u */
    public int f332108u;

    /* renamed from: v */
    public int f332109v;

    /* renamed from: w */
    public int f332110w;

    /* renamed from: x */
    public int f332111x;

    /* renamed from: y */
    public int f332112y;

    /* renamed from: z */
    public C51018qv3 f332113z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jv4)) {
            return false;
        }
        jv4 jv4 = (jv4) aVar;
        return C46238a.m51546a(this.f332094d, jv4.f332094d) && C46238a.m51546a(this.f332095e, jv4.f332095e) && C46238a.m51546a(Integer.valueOf(this.f332096f), Integer.valueOf(jv4.f332096f)) && C46238a.m51546a(this.f332097g, jv4.f332097g) && C46238a.m51546a(this.f332098h, jv4.f332098h) && C46238a.m51546a(Integer.valueOf(this.f332099i), Integer.valueOf(jv4.f332099i)) && C46238a.m51546a(Integer.valueOf(this.f332100j), Integer.valueOf(jv4.f332100j)) && C46238a.m51546a(Integer.valueOf(this.f332101n), Integer.valueOf(jv4.f332101n)) && C46238a.m51546a(Integer.valueOf(this.f332102o), Integer.valueOf(jv4.f332102o)) && C46238a.m51546a(this.f332103p, jv4.f332103p) && C46238a.m51546a(Integer.valueOf(this.f332104q), Integer.valueOf(jv4.f332104q)) && C46238a.m51546a(this.f332105r, jv4.f332105r) && C46238a.m51546a(Integer.valueOf(this.f332106s), Integer.valueOf(jv4.f332106s)) && C46238a.m51546a(Integer.valueOf(this.f332107t), Integer.valueOf(jv4.f332107t)) && C46238a.m51546a(Integer.valueOf(this.f332108u), Integer.valueOf(jv4.f332108u)) && C46238a.m51546a(Integer.valueOf(this.f332109v), Integer.valueOf(jv4.f332109v)) && C46238a.m51546a(Integer.valueOf(this.f332110w), Integer.valueOf(jv4.f332110w)) && C46238a.m51546a(Integer.valueOf(this.f332111x), Integer.valueOf(jv4.f332111x)) && C46238a.m51546a(Integer.valueOf(this.f332112y), Integer.valueOf(jv4.f332112y)) && C46238a.m51546a(this.f332113z, jv4.f332113z) && C46238a.m51546a(this.f332079A, jv4.f332079A) && C46238a.m51546a(Integer.valueOf(this.f332080B), Integer.valueOf(jv4.f332080B)) && C46238a.m51546a(this.f332081C, jv4.f332081C) && C46238a.m51546a(Integer.valueOf(this.f332082D), Integer.valueOf(jv4.f332082D)) && C46238a.m51546a(Integer.valueOf(this.f332083E), Integer.valueOf(jv4.f332083E)) && C46238a.m51546a(Integer.valueOf(this.f332084F), Integer.valueOf(jv4.f332084F)) && C46238a.m51546a(this.f332085G, jv4.f332085G) && C46238a.m51546a(this.f332086H, jv4.f332086H) && C46238a.m51546a(Integer.valueOf(this.f332087I), Integer.valueOf(jv4.f332087I)) && C46238a.m51546a(this.f332088J, jv4.f332088J) && C46238a.m51546a(Integer.valueOf(this.f332089K), Integer.valueOf(jv4.f332089K)) && C46238a.m51546a(this.f332090L, jv4.f332090L) && C46238a.m51546a(this.f332091M, jv4.f332091M) && C46238a.m51546a(this.f332092N, jv4.f332092N) && C46238a.m51546a(this.f332093P, jv4.f332093P);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            pv4 pv4 = this.f332094d;
            if (pv4 == null) {
                throw new C52419b("Not all required fields were included: PeerId");
            } else if (this.f332095e != null) {
                if (pv4 != null) {
                    aVar.mo74322i(1, pv4.computeSize());
                    this.f332094d.writeFields(aVar);
                }
                pv4 pv42 = this.f332095e;
                if (pv42 != null) {
                    aVar.mo74322i(2, pv42.computeSize());
                    this.f332095e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f332096f);
                wt4 wt4 = this.f332097g;
                if (wt4 != null) {
                    aVar.mo74322i(4, wt4.computeSize());
                    this.f332097g.writeFields(aVar);
                }
                wt4 wt42 = this.f332098h;
                if (wt42 != null) {
                    aVar.mo74322i(5, wt42.computeSize());
                    this.f332098h.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f332099i);
                aVar.mo74318e(7, this.f332100j);
                aVar.mo74318e(8, this.f332101n);
                aVar.mo74318e(9, this.f332102o);
                C51018qv3 qv32 = this.f332103p;
                if (qv32 != null) {
                    aVar.mo74322i(10, qv32.computeSize());
                    this.f332103p.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f332104q);
                wt4 wt43 = this.f332105r;
                if (wt43 != null) {
                    aVar.mo74322i(12, wt43.computeSize());
                    this.f332105r.writeFields(aVar);
                }
                aVar.mo74318e(13, this.f332106s);
                aVar.mo74318e(14, this.f332107t);
                aVar.mo74318e(15, this.f332108u);
                aVar.mo74318e(16, this.f332109v);
                aVar.mo74318e(17, this.f332110w);
                aVar.mo74318e(18, this.f332111x);
                aVar.mo74318e(19, this.f332112y);
                C51018qv3 qv33 = this.f332113z;
                if (qv33 != null) {
                    aVar.mo74322i(20, qv33.computeSize());
                    this.f332113z.writeFields(aVar);
                }
                C51018qv3 qv34 = this.f332079A;
                if (qv34 != null) {
                    aVar.mo74322i(21, qv34.computeSize());
                    this.f332079A.writeFields(aVar);
                }
                aVar.mo74318e(22, this.f332080B);
                C51018qv3 qv35 = this.f332081C;
                if (qv35 != null) {
                    aVar.mo74322i(23, qv35.computeSize());
                    this.f332081C.writeFields(aVar);
                }
                aVar.mo74318e(24, this.f332082D);
                aVar.mo74318e(25, this.f332083E);
                aVar.mo74318e(26, this.f332084F);
                C110969pk2 pk22 = this.f332085G;
                if (pk22 != null) {
                    aVar.mo74322i(27, pk22.computeSize());
                    this.f332085G.writeFields(aVar);
                }
                C51018qv3 qv36 = this.f332086H;
                if (qv36 != null) {
                    aVar.mo74322i(28, qv36.computeSize());
                    this.f332086H.writeFields(aVar);
                }
                aVar.mo74318e(29, this.f332087I);
                String str = this.f332088J;
                if (str != null) {
                    aVar.mo74323j(30, str);
                }
                aVar.mo74318e(31, this.f332089K);
                aVar.mo74320g(32, 8, this.f332090L);
                C101858vq3 vq32 = this.f332091M;
                if (vq32 != null) {
                    aVar.mo74322i(33, vq32.computeSize());
                    this.f332091M.writeFields(aVar);
                }
                C101763c50 c502 = this.f332092N;
                if (c502 != null) {
                    aVar.mo74322i(34, c502.computeSize());
                    this.f332092N.writeFields(aVar);
                }
                C49798i42 i422 = this.f332093P;
                if (i422 != null) {
                    aVar.mo74322i(35, i422.computeSize());
                    this.f332093P.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i2 == 1) {
            pv4 pv43 = this.f332094d;
            if (pv43 != null) {
                i3 = C52418a.m58682i(1, pv43.computeSize()) + 0;
            }
            pv4 pv44 = this.f332095e;
            if (pv44 != null) {
                i3 += C52418a.m58682i(2, pv44.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f332096f);
            wt4 wt44 = this.f332097g;
            if (wt44 != null) {
                e += C52418a.m58682i(4, wt44.computeSize());
            }
            wt4 wt45 = this.f332098h;
            if (wt45 != null) {
                e += C52418a.m58682i(5, wt45.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f332099i) + C52418a.m58678e(7, this.f332100j) + C52418a.m58678e(8, this.f332101n) + C52418a.m58678e(9, this.f332102o);
            C51018qv3 qv37 = this.f332103p;
            if (qv37 != null) {
                e2 += C52418a.m58682i(10, qv37.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(11, this.f332104q);
            wt4 wt46 = this.f332105r;
            if (wt46 != null) {
                e3 += C52418a.m58682i(12, wt46.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(13, this.f332106s) + C52418a.m58678e(14, this.f332107t) + C52418a.m58678e(15, this.f332108u) + C52418a.m58678e(16, this.f332109v) + C52418a.m58678e(17, this.f332110w) + C52418a.m58678e(18, this.f332111x) + C52418a.m58678e(19, this.f332112y);
            C51018qv3 qv38 = this.f332113z;
            if (qv38 != null) {
                e4 += C52418a.m58682i(20, qv38.computeSize());
            }
            C51018qv3 qv39 = this.f332079A;
            if (qv39 != null) {
                e4 += C52418a.m58682i(21, qv39.computeSize());
            }
            int e5 = e4 + C52418a.m58678e(22, this.f332080B);
            C51018qv3 qv310 = this.f332081C;
            if (qv310 != null) {
                e5 += C52418a.m58682i(23, qv310.computeSize());
            }
            int e6 = e5 + C52418a.m58678e(24, this.f332082D) + C52418a.m58678e(25, this.f332083E) + C52418a.m58678e(26, this.f332084F);
            C110969pk2 pk23 = this.f332085G;
            if (pk23 != null) {
                e6 += C52418a.m58682i(27, pk23.computeSize());
            }
            C51018qv3 qv311 = this.f332086H;
            if (qv311 != null) {
                e6 += C52418a.m58682i(28, qv311.computeSize());
            }
            int e7 = e6 + C52418a.m58678e(29, this.f332087I);
            String str2 = this.f332088J;
            if (str2 != null) {
                e7 += C52418a.m58683j(30, str2);
            }
            int e8 = e7 + C52418a.m58678e(31, this.f332089K) + C52418a.m58680g(32, 8, this.f332090L);
            C101858vq3 vq33 = this.f332091M;
            if (vq33 != null) {
                e8 += C52418a.m58682i(33, vq33.computeSize());
            }
            C101763c50 c503 = this.f332092N;
            if (c503 != null) {
                e8 += C52418a.m58682i(34, c503.computeSize());
            }
            C49798i42 i423 = this.f332093P;
            return i423 != null ? e8 + C52418a.m58682i(35, i423.computeSize()) : e8;
        } else if (i2 == 2) {
            this.f332090L.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f332094d == null) {
                throw new C52419b("Not all required fields were included: PeerId");
            } else if (this.f332095e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: CapInfo");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            jv4 jv4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        pv4 pv45 = new pv4();
                        if (bArr != null && bArr.length > 0) {
                            pv45.parseFrom(bArr);
                        }
                        jv4.f332094d = pv45;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        pv4 pv46 = new pv4();
                        if (bArr2 != null && bArr2.length > 0) {
                            pv46.parseFrom(bArr2);
                        }
                        jv4.f332095e = pv46;
                    }
                    return 0;
                case 3:
                    jv4.f332096f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        wt4 wt47 = new wt4();
                        if (bArr3 != null && bArr3.length > 0) {
                            wt47.parseFrom(bArr3);
                        }
                        jv4.f332097g = wt47;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        wt4 wt48 = new wt4();
                        if (bArr4 != null && bArr4.length > 0) {
                            wt48.parseFrom(bArr4);
                        }
                        jv4.f332098h = wt48;
                    }
                    return 0;
                case 6:
                    jv4.f332099i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    jv4.f332100j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    jv4.f332101n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    jv4.f332102o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv312.mo73348f(bArr5);
                        }
                        jv4.f332103p = qv312;
                    }
                    return 0;
                case 11:
                    jv4.f332104q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        wt4 wt49 = new wt4();
                        if (bArr6 != null && bArr6.length > 0) {
                            wt49.parseFrom(bArr6);
                        }
                        jv4.f332105r = wt49;
                    }
                    return 0;
                case 13:
                    jv4.f332106s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    jv4.f332107t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jv4.f332108u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    jv4.f332109v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    jv4.f332110w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    jv4.f332111x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    jv4.f332112y = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv313.mo73348f(bArr7);
                        }
                        jv4.f332113z = qv313;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51018qv3 qv314 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv314.mo73348f(bArr8);
                        }
                        jv4.f332079A = qv314;
                    }
                    return 0;
                case 22:
                    jv4.f332080B = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51018qv3 qv315 = new C51018qv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            qv315.mo73348f(bArr9);
                        }
                        jv4.f332081C = qv315;
                    }
                    return 0;
                case 24:
                    jv4.f332082D = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    jv4.f332083E = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    jv4.f332084F = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C110969pk2 pk24 = new C110969pk2();
                        if (bArr10 != null && bArr10.length > 0) {
                            pk24.parseFrom(bArr10);
                        }
                        jv4.f332085G = pk24;
                    }
                    return 0;
                case 28:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C51018qv3 qv316 = new C51018qv3();
                        if (bArr11 != null && bArr11.length > 0) {
                            qv316.mo73348f(bArr11);
                        }
                        jv4.f332086H = qv316;
                    }
                    return 0;
                case 29:
                    jv4.f332087I = aVar3.mo141629g(intValue);
                    return 0;
                case 30:
                    jv4.f332088J = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    jv4.f332089K = aVar3.mo141629g(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        kv4 kv4 = new kv4();
                        if (bArr12 != null && bArr12.length > 0) {
                            kv4.parseFrom(bArr12);
                        }
                        jv4.f332090L.add(kv4);
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C101858vq3 vq34 = new C101858vq3();
                        if (bArr13 != null && bArr13.length > 0) {
                            vq34.parseFrom(bArr13);
                        }
                        jv4.f332091M = vq34;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j19 = aVar3.mo141632j(intValue);
                    int size14 = j19.size();
                    for (int i27 = 0; i27 < size14; i27++) {
                        byte[] bArr14 = j19.get(i27);
                        C101763c50 c504 = new C101763c50();
                        if (bArr14 != null && bArr14.length > 0) {
                            c504.parseFrom(bArr14);
                        }
                        jv4.f332092N = c504;
                    }
                    return 0;
                case 35:
                    LinkedList<byte[]> j25 = aVar3.mo141632j(intValue);
                    int size15 = j25.size();
                    for (int i28 = 0; i28 < size15; i28++) {
                        byte[] bArr15 = j25.get(i28);
                        C49798i42 i424 = new C49798i42();
                        if (bArr15 != null && bArr15.length > 0) {
                            i424.parseFrom(bArr15);
                        }
                        jv4.f332093P = i424;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
