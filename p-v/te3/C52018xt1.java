package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xt1 */
public class C52018xt1 extends C49335eu3 {

    /* renamed from: A */
    public C51018qv3 f144936A;

    /* renamed from: B */
    public String f144937B;

    /* renamed from: C */
    public C51018qv3 f144938C;

    /* renamed from: D */
    public C51018qv3 f144939D;

    /* renamed from: E */
    public C51018qv3 f144940E;

    /* renamed from: d */
    public String f144941d;

    /* renamed from: e */
    public String f144942e;

    /* renamed from: f */
    public int f144943f;

    /* renamed from: g */
    public String f144944g;

    /* renamed from: h */
    public String f144945h;

    /* renamed from: i */
    public C51555uj2 f144946i;

    /* renamed from: j */
    public C48904bt1 f144947j;

    /* renamed from: n */
    public String f144948n;

    /* renamed from: o */
    public String f144949o;

    /* renamed from: p */
    public int f144950p;

    /* renamed from: q */
    public LinkedList<C51832wh> f144951q = new LinkedList<>();

    /* renamed from: r */
    public String f144952r;

    /* renamed from: s */
    public String f144953s;

    /* renamed from: t */
    public String f144954t;

    /* renamed from: u */
    public C49082d20 f144955u;

    /* renamed from: v */
    public C51018qv3 f144956v;

    /* renamed from: w */
    public int f144957w;

    /* renamed from: x */
    public LinkedList<C48857bh2> f144958x = new LinkedList<>();

    /* renamed from: y */
    public String f144959y;

    /* renamed from: z */
    public String f144960z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52018xt1)) {
            return false;
        }
        C52018xt1 xt12 = (C52018xt1) aVar;
        return C46238a.m51546a(this.BaseResponse, xt12.BaseResponse) && C46238a.m51546a(this.f144941d, xt12.f144941d) && C46238a.m51546a(this.f144942e, xt12.f144942e) && C46238a.m51546a(Integer.valueOf(this.f144943f), Integer.valueOf(xt12.f144943f)) && C46238a.m51546a(this.f144944g, xt12.f144944g) && C46238a.m51546a(this.f144945h, xt12.f144945h) && C46238a.m51546a(this.f144946i, xt12.f144946i) && C46238a.m51546a(this.f144947j, xt12.f144947j) && C46238a.m51546a(this.f144948n, xt12.f144948n) && C46238a.m51546a(this.f144949o, xt12.f144949o) && C46238a.m51546a(Integer.valueOf(this.f144950p), Integer.valueOf(xt12.f144950p)) && C46238a.m51546a(this.f144951q, xt12.f144951q) && C46238a.m51546a(this.f144952r, xt12.f144952r) && C46238a.m51546a(this.f144953s, xt12.f144953s) && C46238a.m51546a(this.f144954t, xt12.f144954t) && C46238a.m51546a(this.f144955u, xt12.f144955u) && C46238a.m51546a(this.f144956v, xt12.f144956v) && C46238a.m51546a(Integer.valueOf(this.f144957w), Integer.valueOf(xt12.f144957w)) && C46238a.m51546a(this.f144958x, xt12.f144958x) && C46238a.m51546a(this.f144959y, xt12.f144959y) && C46238a.m51546a(this.f144960z, xt12.f144960z) && C46238a.m51546a(this.f144936A, xt12.f144936A) && C46238a.m51546a(this.f144937B, xt12.f144937B) && C46238a.m51546a(this.f144938C, xt12.f144938C) && C46238a.m51546a(this.f144939D, xt12.f144939D) && C46238a.m51546a(this.f144940E, xt12.f144940E);
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
                String str = this.f144941d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f144942e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f144943f);
                String str3 = this.f144944g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f144945h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                C51555uj2 uj22 = this.f144946i;
                if (uj22 != null) {
                    aVar.mo74322i(7, uj22.computeSize());
                    this.f144946i.writeFields(aVar);
                }
                C48904bt1 bt12 = this.f144947j;
                if (bt12 != null) {
                    aVar.mo74322i(8, bt12.computeSize());
                    this.f144947j.writeFields(aVar);
                }
                String str5 = this.f144948n;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                String str6 = this.f144949o;
                if (str6 != null) {
                    aVar.mo74323j(15, str6);
                }
                aVar.mo74318e(16, this.f144950p);
                aVar.mo74320g(17, 8, this.f144951q);
                String str7 = this.f144952r;
                if (str7 != null) {
                    aVar.mo74323j(18, str7);
                }
                String str8 = this.f144953s;
                if (str8 != null) {
                    aVar.mo74323j(20, str8);
                }
                String str9 = this.f144954t;
                if (str9 != null) {
                    aVar.mo74323j(21, str9);
                }
                C49082d20 d202 = this.f144955u;
                if (d202 != null) {
                    aVar.mo74322i(22, d202.computeSize());
                    this.f144955u.writeFields(aVar);
                }
                C51018qv3 qv32 = this.f144956v;
                if (qv32 != null) {
                    aVar.mo74322i(23, qv32.computeSize());
                    this.f144956v.writeFields(aVar);
                }
                aVar.mo74318e(24, this.f144957w);
                aVar.mo74320g(25, 8, this.f144958x);
                String str10 = this.f144959y;
                if (str10 != null) {
                    aVar.mo74323j(26, str10);
                }
                String str11 = this.f144960z;
                if (str11 != null) {
                    aVar.mo74323j(27, str11);
                }
                C51018qv3 qv33 = this.f144936A;
                if (qv33 != null) {
                    aVar.mo74322i(28, qv33.computeSize());
                    this.f144936A.writeFields(aVar);
                }
                String str12 = this.f144937B;
                if (str12 != null) {
                    aVar.mo74323j(29, str12);
                }
                C51018qv3 qv34 = this.f144938C;
                if (qv34 != null) {
                    aVar.mo74322i(30, qv34.computeSize());
                    this.f144938C.writeFields(aVar);
                }
                C51018qv3 qv35 = this.f144939D;
                if (qv35 != null) {
                    aVar.mo74322i(31, qv35.computeSize());
                    this.f144939D.writeFields(aVar);
                }
                C51018qv3 qv36 = this.f144940E;
                if (qv36 != null) {
                    aVar.mo74322i(32, qv36.computeSize());
                    this.f144940E.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str13 = this.f144941d;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f144942e;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            int e = i3 + C52418a.m58678e(4, this.f144943f);
            String str15 = this.f144944g;
            if (str15 != null) {
                e += C52418a.m58683j(5, str15);
            }
            String str16 = this.f144945h;
            if (str16 != null) {
                e += C52418a.m58683j(6, str16);
            }
            C51555uj2 uj23 = this.f144946i;
            if (uj23 != null) {
                e += C52418a.m58682i(7, uj23.computeSize());
            }
            C48904bt1 bt13 = this.f144947j;
            if (bt13 != null) {
                e += C52418a.m58682i(8, bt13.computeSize());
            }
            String str17 = this.f144948n;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            String str18 = this.f144949o;
            if (str18 != null) {
                e += C52418a.m58683j(15, str18);
            }
            int e2 = e + C52418a.m58678e(16, this.f144950p) + C52418a.m58680g(17, 8, this.f144951q);
            String str19 = this.f144952r;
            if (str19 != null) {
                e2 += C52418a.m58683j(18, str19);
            }
            String str20 = this.f144953s;
            if (str20 != null) {
                e2 += C52418a.m58683j(20, str20);
            }
            String str21 = this.f144954t;
            if (str21 != null) {
                e2 += C52418a.m58683j(21, str21);
            }
            C49082d20 d203 = this.f144955u;
            if (d203 != null) {
                e2 += C52418a.m58682i(22, d203.computeSize());
            }
            C51018qv3 qv37 = this.f144956v;
            if (qv37 != null) {
                e2 += C52418a.m58682i(23, qv37.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(24, this.f144957w) + C52418a.m58680g(25, 8, this.f144958x);
            String str22 = this.f144959y;
            if (str22 != null) {
                e3 += C52418a.m58683j(26, str22);
            }
            String str23 = this.f144960z;
            if (str23 != null) {
                e3 += C52418a.m58683j(27, str23);
            }
            C51018qv3 qv38 = this.f144936A;
            if (qv38 != null) {
                e3 += C52418a.m58682i(28, qv38.computeSize());
            }
            String str24 = this.f144937B;
            if (str24 != null) {
                e3 += C52418a.m58683j(29, str24);
            }
            C51018qv3 qv39 = this.f144938C;
            if (qv39 != null) {
                e3 += C52418a.m58682i(30, qv39.computeSize());
            }
            C51018qv3 qv310 = this.f144939D;
            if (qv310 != null) {
                e3 += C52418a.m58682i(31, qv310.computeSize());
            }
            C51018qv3 qv311 = this.f144940E;
            return qv311 != null ? e3 + C52418a.m58682i(32, qv311.computeSize()) : e3;
        } else if (i2 == 2) {
            this.f144951q.clear();
            this.f144958x.clear();
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
            C52018xt1 xt12 = objArr[1];
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
                        xt12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    xt12.f144941d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xt12.f144942e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xt12.f144943f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    xt12.f144944g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xt12.f144945h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51555uj2 uj24 = new C51555uj2();
                        if (bArr2 != null && bArr2.length > 0) {
                            uj24.parseFrom(bArr2);
                        }
                        xt12.f144946i = uj24;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C48904bt1 bt14 = new C48904bt1();
                        if (bArr3 != null && bArr3.length > 0) {
                            bt14.parseFrom(bArr3);
                        }
                        xt12.f144947j = bt14;
                    }
                    return 0;
                case 9:
                    xt12.f144948n = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    xt12.f144949o = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    xt12.f144950p = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51832wh whVar = new C51832wh();
                        if (bArr4 != null && bArr4.length > 0) {
                            whVar.parseFrom(bArr4);
                        }
                        xt12.f144951q.add(whVar);
                    }
                    return 0;
                case 18:
                    xt12.f144952r = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    xt12.f144953s = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    xt12.f144954t = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C49082d20 d204 = new C49082d20();
                        if (bArr5 != null && bArr5.length > 0) {
                            d204.parseFrom(bArr5);
                        }
                        xt12.f144955u = d204;
                    }
                    return 0;
                case 23:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv312 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv312.mo73348f(bArr6);
                        }
                        xt12.f144956v = qv312;
                    }
                    return 0;
                case 24:
                    xt12.f144957w = aVar3.mo141629g(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C48857bh2 bh22 = new C48857bh2();
                        if (bArr7 != null && bArr7.length > 0) {
                            bh22.parseFrom(bArr7);
                        }
                        xt12.f144958x.add(bh22);
                    }
                    return 0;
                case 26:
                    xt12.f144959y = aVar3.mo141633k(intValue);
                    return 0;
                case 27:
                    xt12.f144960z = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51018qv3 qv313 = new C51018qv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            qv313.mo73348f(bArr8);
                        }
                        xt12.f144936A = qv313;
                    }
                    return 0;
                case 29:
                    xt12.f144937B = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C51018qv3 qv314 = new C51018qv3();
                        if (bArr9 != null && bArr9.length > 0) {
                            qv314.mo73348f(bArr9);
                        }
                        xt12.f144938C = qv314;
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51018qv3 qv315 = new C51018qv3();
                        if (bArr10 != null && bArr10.length > 0) {
                            qv315.mo73348f(bArr10);
                        }
                        xt12.f144939D = qv315;
                    }
                    return 0;
                case 32:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C51018qv3 qv316 = new C51018qv3();
                        if (bArr11 != null && bArr11.length > 0) {
                            qv316.mo73348f(bArr11);
                        }
                        xt12.f144940E = qv316;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
