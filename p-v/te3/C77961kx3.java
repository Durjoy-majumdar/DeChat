package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kx3 */
public class C77961kx3 extends C47465a {

    /* renamed from: A */
    public String f227756A;

    /* renamed from: B */
    public String f227757B;

    /* renamed from: C */
    public C51043r10 f227758C;

    /* renamed from: D */
    public String f227759D;

    /* renamed from: E */
    public String f227760E;

    /* renamed from: F */
    public String f227761F;

    /* renamed from: G */
    public int f227762G;

    /* renamed from: d */
    public C51163rv3 f227763d;

    /* renamed from: e */
    public C51163rv3 f227764e;

    /* renamed from: f */
    public C51163rv3 f227765f;

    /* renamed from: g */
    public C51163rv3 f227766g;

    /* renamed from: h */
    public int f227767h;

    /* renamed from: i */
    public C51018qv3 f227768i;

    /* renamed from: j */
    public String f227769j;

    /* renamed from: n */
    public String f227770n;

    /* renamed from: o */
    public String f227771o;

    /* renamed from: p */
    public int f227772p;

    /* renamed from: q */
    public int f227773q;

    /* renamed from: r */
    public String f227774r;

    /* renamed from: s */
    public String f227775s;

    /* renamed from: t */
    public String f227776t;

    /* renamed from: u */
    public String f227777u;

    /* renamed from: v */
    public int f227778v;

    /* renamed from: w */
    public int f227779w;

    /* renamed from: x */
    public int f227780x;

    /* renamed from: y */
    public String f227781y;

    /* renamed from: z */
    public a94 f227782z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77961kx3)) {
            return false;
        }
        C77961kx3 kx32 = (C77961kx3) aVar;
        return C46238a.m51546a(this.f227763d, kx32.f227763d) && C46238a.m51546a(this.f227764e, kx32.f227764e) && C46238a.m51546a(this.f227765f, kx32.f227765f) && C46238a.m51546a(this.f227766g, kx32.f227766g) && C46238a.m51546a(Integer.valueOf(this.f227767h), Integer.valueOf(kx32.f227767h)) && C46238a.m51546a(this.f227768i, kx32.f227768i) && C46238a.m51546a(this.f227769j, kx32.f227769j) && C46238a.m51546a(this.f227770n, kx32.f227770n) && C46238a.m51546a(this.f227771o, kx32.f227771o) && C46238a.m51546a(Integer.valueOf(this.f227772p), Integer.valueOf(kx32.f227772p)) && C46238a.m51546a(Integer.valueOf(this.f227773q), Integer.valueOf(kx32.f227773q)) && C46238a.m51546a(this.f227774r, kx32.f227774r) && C46238a.m51546a(this.f227775s, kx32.f227775s) && C46238a.m51546a(this.f227776t, kx32.f227776t) && C46238a.m51546a(this.f227777u, kx32.f227777u) && C46238a.m51546a(Integer.valueOf(this.f227778v), Integer.valueOf(kx32.f227778v)) && C46238a.m51546a(Integer.valueOf(this.f227779w), Integer.valueOf(kx32.f227779w)) && C46238a.m51546a(Integer.valueOf(this.f227780x), Integer.valueOf(kx32.f227780x)) && C46238a.m51546a(this.f227781y, kx32.f227781y) && C46238a.m51546a(this.f227782z, kx32.f227782z) && C46238a.m51546a(this.f227756A, kx32.f227756A) && C46238a.m51546a(this.f227757B, kx32.f227757B) && C46238a.m51546a(this.f227758C, kx32.f227758C) && C46238a.m51546a(this.f227759D, kx32.f227759D) && C46238a.m51546a(this.f227760E, kx32.f227760E) && C46238a.m51546a(this.f227761F, kx32.f227761F) && C46238a.m51546a(Integer.valueOf(this.f227762G), Integer.valueOf(kx32.f227762G));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f227763d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227764e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227765f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227766g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227768i != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f227763d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f227764e;
                if (rv33 != null) {
                    aVar.mo74322i(2, rv33.computeSize());
                    this.f227764e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f227765f;
                if (rv34 != null) {
                    aVar.mo74322i(3, rv34.computeSize());
                    this.f227765f.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f227766g;
                if (rv35 != null) {
                    aVar.mo74322i(4, rv35.computeSize());
                    this.f227766g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f227767h);
                C51018qv3 qv32 = this.f227768i;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f227768i.writeFields(aVar);
                }
                String str = this.f227769j;
                if (str != null) {
                    aVar.mo74323j(7, str);
                }
                String str2 = this.f227770n;
                if (str2 != null) {
                    aVar.mo74323j(8, str2);
                }
                String str3 = this.f227771o;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                aVar.mo74318e(10, this.f227772p);
                aVar.mo74318e(11, this.f227773q);
                String str4 = this.f227774r;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                String str5 = this.f227775s;
                if (str5 != null) {
                    aVar.mo74323j(13, str5);
                }
                String str6 = this.f227776t;
                if (str6 != null) {
                    aVar.mo74323j(14, str6);
                }
                String str7 = this.f227777u;
                if (str7 != null) {
                    aVar.mo74323j(15, str7);
                }
                aVar.mo74318e(16, this.f227778v);
                aVar.mo74318e(17, this.f227779w);
                aVar.mo74318e(18, this.f227780x);
                String str8 = this.f227781y;
                if (str8 != null) {
                    aVar.mo74323j(19, str8);
                }
                a94 a94 = this.f227782z;
                if (a94 != null) {
                    aVar.mo74322i(20, a94.computeSize());
                    this.f227782z.writeFields(aVar);
                }
                String str9 = this.f227756A;
                if (str9 != null) {
                    aVar.mo74323j(21, str9);
                }
                String str10 = this.f227757B;
                if (str10 != null) {
                    aVar.mo74323j(22, str10);
                }
                C51043r10 r102 = this.f227758C;
                if (r102 != null) {
                    aVar.mo74322i(23, r102.computeSize());
                    this.f227758C.writeFields(aVar);
                }
                String str11 = this.f227759D;
                if (str11 != null) {
                    aVar.mo74323j(24, str11);
                }
                String str12 = this.f227760E;
                if (str12 != null) {
                    aVar.mo74323j(25, str12);
                }
                String str13 = this.f227761F;
                if (str13 != null) {
                    aVar.mo74323j(26, str13);
                }
                aVar.mo74318e(27, this.f227762G);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 == 1) {
            C51163rv3 rv36 = this.f227763d;
            if (rv36 != null) {
                i3 = C52418a.m58682i(1, rv36.computeSize()) + 0;
            }
            C51163rv3 rv37 = this.f227764e;
            if (rv37 != null) {
                i3 += C52418a.m58682i(2, rv37.computeSize());
            }
            C51163rv3 rv38 = this.f227765f;
            if (rv38 != null) {
                i3 += C52418a.m58682i(3, rv38.computeSize());
            }
            C51163rv3 rv39 = this.f227766g;
            if (rv39 != null) {
                i3 += C52418a.m58682i(4, rv39.computeSize());
            }
            int e = i3 + C52418a.m58678e(5, this.f227767h);
            C51018qv3 qv33 = this.f227768i;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            String str14 = this.f227769j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f227770n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f227771o;
            if (str16 != null) {
                e += C52418a.m58683j(9, str16);
            }
            int e2 = e + C52418a.m58678e(10, this.f227772p) + C52418a.m58678e(11, this.f227773q);
            String str17 = this.f227774r;
            if (str17 != null) {
                e2 += C52418a.m58683j(12, str17);
            }
            String str18 = this.f227775s;
            if (str18 != null) {
                e2 += C52418a.m58683j(13, str18);
            }
            String str19 = this.f227776t;
            if (str19 != null) {
                e2 += C52418a.m58683j(14, str19);
            }
            String str20 = this.f227777u;
            if (str20 != null) {
                e2 += C52418a.m58683j(15, str20);
            }
            int e3 = e2 + C52418a.m58678e(16, this.f227778v) + C52418a.m58678e(17, this.f227779w) + C52418a.m58678e(18, this.f227780x);
            String str21 = this.f227781y;
            if (str21 != null) {
                e3 += C52418a.m58683j(19, str21);
            }
            a94 a942 = this.f227782z;
            if (a942 != null) {
                e3 += C52418a.m58682i(20, a942.computeSize());
            }
            String str22 = this.f227756A;
            if (str22 != null) {
                e3 += C52418a.m58683j(21, str22);
            }
            String str23 = this.f227757B;
            if (str23 != null) {
                e3 += C52418a.m58683j(22, str23);
            }
            C51043r10 r103 = this.f227758C;
            if (r103 != null) {
                e3 += C52418a.m58682i(23, r103.computeSize());
            }
            String str24 = this.f227759D;
            if (str24 != null) {
                e3 += C52418a.m58683j(24, str24);
            }
            String str25 = this.f227760E;
            if (str25 != null) {
                e3 += C52418a.m58683j(25, str25);
            }
            String str26 = this.f227761F;
            if (str26 != null) {
                e3 += C52418a.m58683j(26, str26);
            }
            return e3 + C52418a.m58678e(27, this.f227762G);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227763d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227764e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227765f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227766g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227768i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77961kx3 kx32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv310.mo73356d(bArr);
                        }
                        kx32.f227763d = rv310;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv311 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv311.mo73356d(bArr2);
                        }
                        kx32.f227764e = rv311;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv312 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv312.mo73356d(bArr3);
                        }
                        kx32.f227765f = rv312;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv313 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv313.mo73356d(bArr4);
                        }
                        kx32.f227766g = rv313;
                    }
                    return 0;
                case 5:
                    kx32.f227767h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            qv34.mo73348f(bArr5);
                        }
                        kx32.f227768i = qv34;
                    }
                    return 0;
                case 7:
                    kx32.f227769j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kx32.f227770n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kx32.f227771o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    kx32.f227772p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    kx32.f227773q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    kx32.f227774r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    kx32.f227775s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    kx32.f227776t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    kx32.f227777u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    kx32.f227778v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    kx32.f227779w = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    kx32.f227780x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    kx32.f227781y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        a94 a943 = new a94();
                        if (bArr6 != null && bArr6.length > 0) {
                            a943.parseFrom(bArr6);
                        }
                        kx32.f227782z = a943;
                    }
                    return 0;
                case 21:
                    kx32.f227756A = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    kx32.f227757B = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51043r10 r104 = new C51043r10();
                        if (bArr7 != null && bArr7.length > 0) {
                            r104.parseFrom(bArr7);
                        }
                        kx32.f227758C = r104;
                    }
                    return 0;
                case 24:
                    kx32.f227759D = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    kx32.f227760E = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    kx32.f227761F = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    kx32.f227762G = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
