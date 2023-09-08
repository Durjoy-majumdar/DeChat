package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zl1 */
public class C52280zl1 extends C49335eu3 {

    /* renamed from: A */
    public C89349b f146063A;

    /* renamed from: B */
    public String f146064B;

    /* renamed from: C */
    public int f146065C;

    /* renamed from: D */
    public C48878bm1 f146066D;

    /* renamed from: E */
    public int f146067E;

    /* renamed from: F */
    public C51847wl1 f146068F;

    /* renamed from: d */
    public LinkedList<FinderObject> f146069d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f146070e;

    /* renamed from: f */
    public String f146071f;

    /* renamed from: g */
    public String f146072g;

    /* renamed from: h */
    public int f146073h;

    /* renamed from: i */
    public int f146074i;

    /* renamed from: j */
    public int f146075j;

    /* renamed from: n */
    public int f146076n;

    /* renamed from: o */
    public C51974xh1 f146077o;

    /* renamed from: p */
    public C50547ni0 f146078p;

    /* renamed from: q */
    public int f146079q;

    /* renamed from: r */
    public LinkedList<FinderObject> f146080r = new LinkedList<>();

    /* renamed from: s */
    public C51419tn1 f146081s;

    /* renamed from: t */
    public C52112yg0 f146082t;

    /* renamed from: u */
    public String f146083u;

    /* renamed from: v */
    public C50141kk1 f146084v;

    /* renamed from: w */
    public C64777vl1 f146085w;

    /* renamed from: x */
    public C51412tl1 f146086x;

    /* renamed from: y */
    public String f146087y;

    /* renamed from: z */
    public C50497n51 f146088z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52280zl1)) {
            return false;
        }
        C52280zl1 zl12 = (C52280zl1) aVar;
        return C46238a.m51546a(this.BaseResponse, zl12.BaseResponse) && C46238a.m51546a(this.f146069d, zl12.f146069d) && C46238a.m51546a(this.f146070e, zl12.f146070e) && C46238a.m51546a(this.f146071f, zl12.f146071f) && C46238a.m51546a(this.f146072g, zl12.f146072g) && C46238a.m51546a(Integer.valueOf(this.f146073h), Integer.valueOf(zl12.f146073h)) && C46238a.m51546a(Integer.valueOf(this.f146074i), Integer.valueOf(zl12.f146074i)) && C46238a.m51546a(Integer.valueOf(this.f146075j), Integer.valueOf(zl12.f146075j)) && C46238a.m51546a(Integer.valueOf(this.f146076n), Integer.valueOf(zl12.f146076n)) && C46238a.m51546a(this.f146077o, zl12.f146077o) && C46238a.m51546a(this.f146078p, zl12.f146078p) && C46238a.m51546a(Integer.valueOf(this.f146079q), Integer.valueOf(zl12.f146079q)) && C46238a.m51546a(this.f146080r, zl12.f146080r) && C46238a.m51546a(this.f146081s, zl12.f146081s) && C46238a.m51546a(this.f146082t, zl12.f146082t) && C46238a.m51546a(this.f146083u, zl12.f146083u) && C46238a.m51546a(this.f146084v, zl12.f146084v) && C46238a.m51546a(this.f146085w, zl12.f146085w) && C46238a.m51546a(this.f146086x, zl12.f146086x) && C46238a.m51546a(this.f146087y, zl12.f146087y) && C46238a.m51546a(this.f146088z, zl12.f146088z) && C46238a.m51546a(this.f146063A, zl12.f146063A) && C46238a.m51546a(this.f146064B, zl12.f146064B) && C46238a.m51546a(Integer.valueOf(this.f146065C), Integer.valueOf(zl12.f146065C)) && C46238a.m51546a(this.f146066D, zl12.f146066D) && C46238a.m51546a(Integer.valueOf(this.f146067E), Integer.valueOf(zl12.f146067E)) && C46238a.m51546a(this.f146068F, zl12.f146068F);
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
                aVar.mo74320g(2, 8, this.f146069d);
                C89349b bVar = this.f146070e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                String str = this.f146071f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f146072g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                aVar.mo74318e(6, this.f146073h);
                aVar.mo74318e(7, this.f146074i);
                aVar.mo74318e(8, this.f146075j);
                aVar.mo74318e(9, this.f146076n);
                C51974xh1 xh12 = this.f146077o;
                if (xh12 != null) {
                    aVar.mo74322i(10, xh12.computeSize());
                    this.f146077o.writeFields(aVar);
                }
                C50547ni0 ni02 = this.f146078p;
                if (ni02 != null) {
                    aVar.mo74322i(11, ni02.computeSize());
                    this.f146078p.writeFields(aVar);
                }
                aVar.mo74318e(12, this.f146079q);
                aVar.mo74320g(13, 8, this.f146080r);
                C51419tn1 tn12 = this.f146081s;
                if (tn12 != null) {
                    aVar.mo74322i(14, tn12.computeSize());
                    this.f146081s.writeFields(aVar);
                }
                C52112yg0 yg02 = this.f146082t;
                if (yg02 != null) {
                    aVar.mo74322i(15, yg02.computeSize());
                    this.f146082t.writeFields(aVar);
                }
                String str3 = this.f146083u;
                if (str3 != null) {
                    aVar.mo74323j(16, str3);
                }
                C50141kk1 kk12 = this.f146084v;
                if (kk12 != null) {
                    aVar.mo74322i(17, kk12.computeSize());
                    this.f146084v.writeFields(aVar);
                }
                C64777vl1 vl12 = this.f146085w;
                if (vl12 != null) {
                    aVar.mo74322i(18, vl12.computeSize());
                    this.f146085w.writeFields(aVar);
                }
                C51412tl1 tl12 = this.f146086x;
                if (tl12 != null) {
                    aVar.mo74322i(19, tl12.computeSize());
                    this.f146086x.writeFields(aVar);
                }
                String str4 = this.f146087y;
                if (str4 != null) {
                    aVar.mo74323j(20, str4);
                }
                C50497n51 n512 = this.f146088z;
                if (n512 != null) {
                    aVar.mo74322i(21, n512.computeSize());
                    this.f146088z.writeFields(aVar);
                }
                C89349b bVar2 = this.f146063A;
                if (bVar2 != null) {
                    aVar.mo74315b(22, bVar2);
                }
                String str5 = this.f146064B;
                if (str5 != null) {
                    aVar.mo74323j(23, str5);
                }
                aVar.mo74318e(24, this.f146065C);
                C48878bm1 bm12 = this.f146066D;
                if (bm12 != null) {
                    aVar.mo74322i(25, bm12.computeSize());
                    this.f146066D.writeFields(aVar);
                }
                aVar.mo74318e(26, this.f146067E);
                C51847wl1 wl12 = this.f146068F;
                if (wl12 != null) {
                    aVar.mo74322i(27, wl12.computeSize());
                    this.f146068F.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f146069d);
            C89349b bVar3 = this.f146070e;
            if (bVar3 != null) {
                g += C52418a.m58675b(3, bVar3);
            }
            String str6 = this.f146071f;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            String str7 = this.f146072g;
            if (str7 != null) {
                g += C52418a.m58683j(5, str7);
            }
            int e = g + C52418a.m58678e(6, this.f146073h) + C52418a.m58678e(7, this.f146074i) + C52418a.m58678e(8, this.f146075j) + C52418a.m58678e(9, this.f146076n);
            C51974xh1 xh13 = this.f146077o;
            if (xh13 != null) {
                e += C52418a.m58682i(10, xh13.computeSize());
            }
            C50547ni0 ni03 = this.f146078p;
            if (ni03 != null) {
                e += C52418a.m58682i(11, ni03.computeSize());
            }
            int e2 = e + C52418a.m58678e(12, this.f146079q) + C52418a.m58680g(13, 8, this.f146080r);
            C51419tn1 tn13 = this.f146081s;
            if (tn13 != null) {
                e2 += C52418a.m58682i(14, tn13.computeSize());
            }
            C52112yg0 yg03 = this.f146082t;
            if (yg03 != null) {
                e2 += C52418a.m58682i(15, yg03.computeSize());
            }
            String str8 = this.f146083u;
            if (str8 != null) {
                e2 += C52418a.m58683j(16, str8);
            }
            C50141kk1 kk13 = this.f146084v;
            if (kk13 != null) {
                e2 += C52418a.m58682i(17, kk13.computeSize());
            }
            C64777vl1 vl13 = this.f146085w;
            if (vl13 != null) {
                e2 += C52418a.m58682i(18, vl13.computeSize());
            }
            C51412tl1 tl13 = this.f146086x;
            if (tl13 != null) {
                e2 += C52418a.m58682i(19, tl13.computeSize());
            }
            String str9 = this.f146087y;
            if (str9 != null) {
                e2 += C52418a.m58683j(20, str9);
            }
            C50497n51 n513 = this.f146088z;
            if (n513 != null) {
                e2 += C52418a.m58682i(21, n513.computeSize());
            }
            C89349b bVar4 = this.f146063A;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(22, bVar4);
            }
            String str10 = this.f146064B;
            if (str10 != null) {
                e2 += C52418a.m58683j(23, str10);
            }
            int e3 = e2 + C52418a.m58678e(24, this.f146065C);
            C48878bm1 bm13 = this.f146066D;
            if (bm13 != null) {
                e3 += C52418a.m58682i(25, bm13.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(26, this.f146067E);
            C51847wl1 wl13 = this.f146068F;
            return wl13 != null ? e4 + C52418a.m58682i(27, wl13.computeSize()) : e4;
        } else if (i2 == 2) {
            this.f146069d.clear();
            this.f146080r.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
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
            C52280zl1 zl12 = objArr[1];
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
                        zl12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        zl12.f146069d.add(finderObject);
                    }
                    return 0;
                case 3:
                    zl12.f146070e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    zl12.f146071f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zl12.f146072g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zl12.f146073h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    zl12.f146074i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    zl12.f146075j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    zl12.f146076n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh14.parseFrom(bArr3);
                        }
                        zl12.f146077o = xh14;
                    }
                    return 0;
                case 11:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C50547ni0 ni04 = new C50547ni0();
                        if (bArr4 != null && bArr4.length > 0) {
                            ni04.parseFrom(bArr4);
                        }
                        zl12.f146078p = ni04;
                    }
                    return 0;
                case 12:
                    zl12.f146079q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        FinderObject finderObject2 = new FinderObject();
                        if (bArr5 != null && bArr5.length > 0) {
                            finderObject2.parseFrom(bArr5);
                        }
                        zl12.f146080r.add(finderObject2);
                    }
                    return 0;
                case 14:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51419tn1 tn14 = new C51419tn1();
                        if (bArr6 != null && bArr6.length > 0) {
                            tn14.parseFrom(bArr6);
                        }
                        zl12.f146081s = tn14;
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C52112yg0 yg04 = new C52112yg0();
                        if (bArr7 != null && bArr7.length > 0) {
                            yg04.parseFrom(bArr7);
                        }
                        zl12.f146082t = yg04;
                    }
                    return 0;
                case 16:
                    zl12.f146083u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C50141kk1 kk14 = new C50141kk1();
                        if (bArr8 != null && bArr8.length > 0) {
                            kk14.parseFrom(bArr8);
                        }
                        zl12.f146084v = kk14;
                    }
                    return 0;
                case 18:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C64777vl1 vl14 = new C64777vl1();
                        if (bArr9 != null && bArr9.length > 0) {
                            vl14.parseFrom(bArr9);
                        }
                        zl12.f146085w = vl14;
                    }
                    return 0;
                case 19:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51412tl1 tl14 = new C51412tl1();
                        if (bArr10 != null && bArr10.length > 0) {
                            tl14.parseFrom(bArr10);
                        }
                        zl12.f146086x = tl14;
                    }
                    return 0;
                case 20:
                    zl12.f146087y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C50497n51 n514 = new C50497n51();
                        if (bArr11 != null && bArr11.length > 0) {
                            n514.parseFrom(bArr11);
                        }
                        zl12.f146088z = n514;
                    }
                    return 0;
                case 22:
                    zl12.f146063A = aVar3.mo141626d(intValue);
                    return 0;
                case 23:
                    zl12.f146064B = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    zl12.f146065C = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j17 = aVar3.mo141632j(intValue);
                    int size12 = j17.size();
                    for (int i25 = 0; i25 < size12; i25++) {
                        byte[] bArr12 = j17.get(i25);
                        C48878bm1 bm14 = new C48878bm1();
                        if (bArr12 != null && bArr12.length > 0) {
                            bm14.parseFrom(bArr12);
                        }
                        zl12.f146066D = bm14;
                    }
                    return 0;
                case 26:
                    zl12.f146067E = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    LinkedList<byte[]> j18 = aVar3.mo141632j(intValue);
                    int size13 = j18.size();
                    for (int i26 = 0; i26 < size13; i26++) {
                        byte[] bArr13 = j18.get(i26);
                        C51847wl1 wl14 = new C51847wl1();
                        if (bArr13 != null && bArr13.length > 0) {
                            wl14.parseFrom(bArr13);
                        }
                        zl12.f146068F = wl14;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
