package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t33 */
public class C118468t33 extends C49335eu3 {

    /* renamed from: A */
    public C52114yg2 f354400A;

    /* renamed from: B */
    public String f354401B;

    /* renamed from: C */
    public C101795jm f354402C;

    /* renamed from: D */
    public String f354403D;

    /* renamed from: E */
    public String f354404E;

    /* renamed from: F */
    public C51018qv3 f354405F;

    /* renamed from: G */
    public d54 f354406G;

    /* renamed from: H */
    public C101795jm f354407H;

    /* renamed from: I */
    public C101795jm f354408I;

    /* renamed from: J */
    public C64819wy3 f354409J;

    /* renamed from: K */
    public int f354410K;

    /* renamed from: L */
    public int f354411L;

    /* renamed from: M */
    public int f354412M;

    /* renamed from: N */
    public j85 f354413N;

    /* renamed from: P */
    public g85 f354414P;

    /* renamed from: d */
    public int f354415d;

    /* renamed from: e */
    public String f354416e;

    /* renamed from: f */
    public String f354417f;

    /* renamed from: g */
    public String f354418g;

    /* renamed from: h */
    public String f354419h;

    /* renamed from: i */
    public String f354420i;

    /* renamed from: j */
    public int f354421j;

    /* renamed from: n */
    public int f354422n;

    /* renamed from: o */
    public String f354423o;

    /* renamed from: p */
    public C50270lj f354424p;

    /* renamed from: q */
    public String f354425q;

    /* renamed from: r */
    public String f354426r;

    /* renamed from: s */
    public int f354427s;

    /* renamed from: t */
    public C49227e33 f354428t;

    /* renamed from: u */
    public int f354429u;

    /* renamed from: v */
    public int f354430v;

    /* renamed from: w */
    public String f354431w;

    /* renamed from: x */
    public C49274ee3 f354432x;

    /* renamed from: y */
    public String f354433y;

    /* renamed from: z */
    public int f354434z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118468t33)) {
            return false;
        }
        C118468t33 t332 = (C118468t33) aVar;
        return C46238a.m51546a(this.BaseResponse, t332.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f354415d), Integer.valueOf(t332.f354415d)) && C46238a.m51546a(this.f354416e, t332.f354416e) && C46238a.m51546a(this.f354417f, t332.f354417f) && C46238a.m51546a(this.f354418g, t332.f354418g) && C46238a.m51546a(this.f354419h, t332.f354419h) && C46238a.m51546a(this.f354420i, t332.f354420i) && C46238a.m51546a(Integer.valueOf(this.f354421j), Integer.valueOf(t332.f354421j)) && C46238a.m51546a(Integer.valueOf(this.f354422n), Integer.valueOf(t332.f354422n)) && C46238a.m51546a(this.f354423o, t332.f354423o) && C46238a.m51546a(this.f354424p, t332.f354424p) && C46238a.m51546a(this.f354425q, t332.f354425q) && C46238a.m51546a(this.f354426r, t332.f354426r) && C46238a.m51546a(Integer.valueOf(this.f354427s), Integer.valueOf(t332.f354427s)) && C46238a.m51546a(this.f354428t, t332.f354428t) && C46238a.m51546a(Integer.valueOf(this.f354429u), Integer.valueOf(t332.f354429u)) && C46238a.m51546a(Integer.valueOf(this.f354430v), Integer.valueOf(t332.f354430v)) && C46238a.m51546a(this.f354431w, t332.f354431w) && C46238a.m51546a(this.f354432x, t332.f354432x) && C46238a.m51546a(this.f354433y, t332.f354433y) && C46238a.m51546a(Integer.valueOf(this.f354434z), Integer.valueOf(t332.f354434z)) && C46238a.m51546a(this.f354400A, t332.f354400A) && C46238a.m51546a(this.f354401B, t332.f354401B) && C46238a.m51546a(this.f354402C, t332.f354402C) && C46238a.m51546a(this.f354403D, t332.f354403D) && C46238a.m51546a(this.f354404E, t332.f354404E) && C46238a.m51546a(this.f354405F, t332.f354405F) && C46238a.m51546a(this.f354406G, t332.f354406G) && C46238a.m51546a(this.f354407H, t332.f354407H) && C46238a.m51546a(this.f354408I, t332.f354408I) && C46238a.m51546a(this.f354409J, t332.f354409J) && C46238a.m51546a(Integer.valueOf(this.f354410K), Integer.valueOf(t332.f354410K)) && C46238a.m51546a(Integer.valueOf(this.f354411L), Integer.valueOf(t332.f354411L)) && C46238a.m51546a(Integer.valueOf(this.f354412M), Integer.valueOf(t332.f354412M)) && C46238a.m51546a(this.f354413N, t332.f354413N) && C46238a.m51546a(this.f354414P, t332.f354414P);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f354415d);
                String str = this.f354416e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f354417f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f354418g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f354419h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f354420i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74318e(8, this.f354421j);
                aVar.mo74318e(9, this.f354422n);
                String str6 = this.f354423o;
                if (str6 != null) {
                    aVar.mo74323j(10, str6);
                }
                C50270lj ljVar = this.f354424p;
                if (ljVar != null) {
                    aVar.mo74322i(14, ljVar.computeSize());
                    this.f354424p.writeFields(aVar);
                }
                String str7 = this.f354425q;
                if (str7 != null) {
                    aVar.mo74323j(15, str7);
                }
                String str8 = this.f354426r;
                if (str8 != null) {
                    aVar.mo74323j(16, str8);
                }
                aVar.mo74318e(17, this.f354427s);
                C49227e33 e332 = this.f354428t;
                if (e332 != null) {
                    aVar.mo74322i(18, e332.computeSize());
                    this.f354428t.writeFields(aVar);
                }
                aVar.mo74318e(19, this.f354429u);
                aVar.mo74318e(20, this.f354430v);
                String str9 = this.f354431w;
                if (str9 != null) {
                    aVar.mo74323j(21, str9);
                }
                C49274ee3 ee32 = this.f354432x;
                if (ee32 != null) {
                    aVar.mo74322i(22, ee32.computeSize());
                    this.f354432x.writeFields(aVar);
                }
                String str10 = this.f354433y;
                if (str10 != null) {
                    aVar.mo74323j(23, str10);
                }
                aVar.mo74318e(24, this.f354434z);
                C52114yg2 yg22 = this.f354400A;
                if (yg22 != null) {
                    aVar.mo74322i(25, yg22.computeSize());
                    this.f354400A.writeFields(aVar);
                }
                String str11 = this.f354401B;
                if (str11 != null) {
                    aVar.mo74323j(26, str11);
                }
                C101795jm jmVar = this.f354402C;
                if (jmVar != null) {
                    aVar.mo74322i(27, jmVar.computeSize());
                    this.f354402C.writeFields(aVar);
                }
                String str12 = this.f354403D;
                if (str12 != null) {
                    aVar.mo74323j(28, str12);
                }
                String str13 = this.f354404E;
                if (str13 != null) {
                    aVar.mo74323j(29, str13);
                }
                C51018qv3 qv32 = this.f354405F;
                if (qv32 != null) {
                    aVar.mo74322i(30, qv32.computeSize());
                    this.f354405F.writeFields(aVar);
                }
                d54 d54 = this.f354406G;
                if (d54 != null) {
                    aVar.mo74322i(31, d54.computeSize());
                    this.f354406G.writeFields(aVar);
                }
                C101795jm jmVar2 = this.f354407H;
                if (jmVar2 != null) {
                    aVar.mo74322i(32, jmVar2.computeSize());
                    this.f354407H.writeFields(aVar);
                }
                C101795jm jmVar3 = this.f354408I;
                if (jmVar3 != null) {
                    aVar.mo74322i(33, jmVar3.computeSize());
                    this.f354408I.writeFields(aVar);
                }
                C64819wy3 wy32 = this.f354409J;
                if (wy32 != null) {
                    aVar.mo74322i(34, wy32.computeSize());
                    this.f354409J.writeFields(aVar);
                }
                aVar.mo74318e(35, this.f354410K);
                aVar.mo74318e(36, this.f354411L);
                aVar.mo74318e(37, this.f354412M);
                j85 j85 = this.f354413N;
                if (j85 != null) {
                    aVar.mo74322i(38, j85.computeSize());
                    this.f354413N.writeFields(aVar);
                }
                g85 g85 = this.f354414P;
                if (g85 != null) {
                    aVar.mo74322i(39, g85.computeSize());
                    this.f354414P.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f354415d);
            String str14 = this.f354416e;
            if (str14 != null) {
                e += C52418a.m58683j(3, str14);
            }
            String str15 = this.f354417f;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f354418g;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f354419h;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f354420i;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            int e2 = e + C52418a.m58678e(8, this.f354421j) + C52418a.m58678e(9, this.f354422n);
            String str19 = this.f354423o;
            if (str19 != null) {
                e2 += C52418a.m58683j(10, str19);
            }
            C50270lj ljVar2 = this.f354424p;
            if (ljVar2 != null) {
                e2 += C52418a.m58682i(14, ljVar2.computeSize());
            }
            String str20 = this.f354425q;
            if (str20 != null) {
                e2 += C52418a.m58683j(15, str20);
            }
            String str21 = this.f354426r;
            if (str21 != null) {
                e2 += C52418a.m58683j(16, str21);
            }
            int e3 = e2 + C52418a.m58678e(17, this.f354427s);
            C49227e33 e333 = this.f354428t;
            if (e333 != null) {
                e3 += C52418a.m58682i(18, e333.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(19, this.f354429u) + C52418a.m58678e(20, this.f354430v);
            String str22 = this.f354431w;
            if (str22 != null) {
                e4 += C52418a.m58683j(21, str22);
            }
            C49274ee3 ee33 = this.f354432x;
            if (ee33 != null) {
                e4 += C52418a.m58682i(22, ee33.computeSize());
            }
            String str23 = this.f354433y;
            if (str23 != null) {
                e4 += C52418a.m58683j(23, str23);
            }
            int e5 = e4 + C52418a.m58678e(24, this.f354434z);
            C52114yg2 yg23 = this.f354400A;
            if (yg23 != null) {
                e5 += C52418a.m58682i(25, yg23.computeSize());
            }
            String str24 = this.f354401B;
            if (str24 != null) {
                e5 += C52418a.m58683j(26, str24);
            }
            C101795jm jmVar4 = this.f354402C;
            if (jmVar4 != null) {
                e5 += C52418a.m58682i(27, jmVar4.computeSize());
            }
            String str25 = this.f354403D;
            if (str25 != null) {
                e5 += C52418a.m58683j(28, str25);
            }
            String str26 = this.f354404E;
            if (str26 != null) {
                e5 += C52418a.m58683j(29, str26);
            }
            C51018qv3 qv33 = this.f354405F;
            if (qv33 != null) {
                e5 += C52418a.m58682i(30, qv33.computeSize());
            }
            d54 d542 = this.f354406G;
            if (d542 != null) {
                e5 += C52418a.m58682i(31, d542.computeSize());
            }
            C101795jm jmVar5 = this.f354407H;
            if (jmVar5 != null) {
                e5 += C52418a.m58682i(32, jmVar5.computeSize());
            }
            C101795jm jmVar6 = this.f354408I;
            if (jmVar6 != null) {
                e5 += C52418a.m58682i(33, jmVar6.computeSize());
            }
            C64819wy3 wy33 = this.f354409J;
            if (wy33 != null) {
                e5 += C52418a.m58682i(34, wy33.computeSize());
            }
            int e6 = e5 + C52418a.m58678e(35, this.f354410K) + C52418a.m58678e(36, this.f354411L) + C52418a.m58678e(37, this.f354412M);
            j85 j852 = this.f354413N;
            if (j852 != null) {
                e6 += C52418a.m58682i(38, j852.computeSize());
            }
            g85 g852 = this.f354414P;
            return g852 != null ? e6 + C52418a.m58682i(39, g852.computeSize()) : e6;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C118468t33 t332 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        t332.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    t332.f354415d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    t332.f354416e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    t332.f354417f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    t332.f354418g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    t332.f354419h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    t332.f354420i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    t332.f354421j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    t332.f354422n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    t332.f354423o = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C50270lj ljVar3 = new C50270lj();
                        if (bArr2 != null && bArr2.length > 0) {
                            ljVar3.parseFrom(bArr2);
                        }
                        t332.f354424p = ljVar3;
                    }
                    return 0;
                case 15:
                    t332.f354425q = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    t332.f354426r = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    t332.f354427s = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49227e33 e334 = new C49227e33();
                        if (bArr3 != null && bArr3.length > 0) {
                            e334.parseFrom(bArr3);
                        }
                        t332.f354428t = e334;
                    }
                    return 0;
                case 19:
                    t332.f354429u = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    t332.f354430v = aVar3.mo141629g(intValue);
                    return 0;
                case 21:
                    t332.f354431w = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49274ee3 ee34 = new C49274ee3();
                        if (bArr4 != null && bArr4.length > 0) {
                            ee34.parseFrom(bArr4);
                        }
                        t332.f354432x = ee34;
                    }
                    return 0;
                case 23:
                    t332.f354433y = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    t332.f354434z = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C52114yg2 yg24 = new C52114yg2();
                        if (bArr5 != null && bArr5.length > 0) {
                            yg24.parseFrom(bArr5);
                        }
                        t332.f354400A = yg24;
                    }
                    return 0;
                case 26:
                    t332.f354401B = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C101795jm jmVar7 = new C101795jm();
                        if (bArr6 != null && bArr6.length > 0) {
                            jmVar7.parseFrom(bArr6);
                        }
                        t332.f354402C = jmVar7;
                    }
                    return 0;
                case 28:
                    t332.f354403D = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    t332.f354404E = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            qv34.mo73348f(bArr7);
                        }
                        t332.f354405F = qv34;
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        d54 d543 = new d54();
                        if (bArr8 != null && bArr8.length > 0) {
                            d543.parseFrom(bArr8);
                        }
                        t332.f354406G = d543;
                    }
                    return 0;
                case 32:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C101795jm jmVar8 = new C101795jm();
                        if (bArr9 != null && bArr9.length > 0) {
                            jmVar8.parseFrom(bArr9);
                        }
                        t332.f354407H = jmVar8;
                    }
                    return 0;
                case 33:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C101795jm jmVar9 = new C101795jm();
                        if (bArr10 != null && bArr10.length > 0) {
                            jmVar9.parseFrom(bArr10);
                        }
                        t332.f354408I = jmVar9;
                    }
                    return 0;
                case 34:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C64819wy3 wy34 = new C64819wy3();
                        if (bArr11 != null && bArr11.length > 0) {
                            wy34.parseFrom(bArr11);
                        }
                        t332.f354409J = wy34;
                    }
                    return 0;
                case 35:
                    t332.f354410K = aVar3.mo141629g(intValue);
                    return 0;
                case 36:
                    t332.f354411L = aVar3.mo141629g(intValue);
                    return 0;
                case 37:
                    t332.f354412M = aVar3.mo141629g(intValue);
                    return 0;
                case 38:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        j85 j853 = new j85();
                        if (bArr12 != null && bArr12.length > 0) {
                            j853.parseFrom(bArr12);
                        }
                        t332.f354413N = j853;
                    }
                    return 0;
                case 39:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        g85 g853 = new g85();
                        if (bArr13 != null && bArr13.length > 0) {
                            g853.parseFrom(bArr13);
                        }
                        t332.f354414P = g853;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
