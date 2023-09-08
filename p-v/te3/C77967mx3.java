package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mx3 */
public class C77967mx3 extends C49335eu3 {

    /* renamed from: A */
    public String f227842A;

    /* renamed from: B */
    public String f227843B;

    /* renamed from: C */
    public C51043r10 f227844C;

    /* renamed from: D */
    public int f227845D;

    /* renamed from: E */
    public LinkedList<C77961kx3> f227846E = new LinkedList<>();

    /* renamed from: F */
    public String f227847F;

    /* renamed from: G */
    public String f227848G;

    /* renamed from: H */
    public C51018qv3 f227849H;

    /* renamed from: I */
    public String f227850I;

    /* renamed from: J */
    public String f227851J;

    /* renamed from: K */
    public int f227852K;

    /* renamed from: L */
    public String f227853L;

    /* renamed from: M */
    public int f227854M;

    /* renamed from: N */
    public LinkedList<C77917dy3> f227855N = new LinkedList<>();

    /* renamed from: P */
    public int f227856P;

    /* renamed from: d */
    public C51163rv3 f227857d;

    /* renamed from: e */
    public C51163rv3 f227858e;

    /* renamed from: f */
    public C51163rv3 f227859f;

    /* renamed from: g */
    public C51163rv3 f227860g;

    /* renamed from: h */
    public int f227861h;

    /* renamed from: i */
    public C51018qv3 f227862i;

    /* renamed from: j */
    public String f227863j;

    /* renamed from: n */
    public String f227864n;

    /* renamed from: o */
    public String f227865o;

    /* renamed from: p */
    public int f227866p;

    /* renamed from: q */
    public int f227867q;

    /* renamed from: r */
    public String f227868r;

    /* renamed from: s */
    public String f227869s;

    /* renamed from: t */
    public String f227870t;

    /* renamed from: u */
    public String f227871u;

    /* renamed from: v */
    public int f227872v;

    /* renamed from: w */
    public int f227873w;

    /* renamed from: x */
    public int f227874x;

    /* renamed from: y */
    public String f227875y;

    /* renamed from: z */
    public a94 f227876z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77967mx3)) {
            return false;
        }
        C77967mx3 mx32 = (C77967mx3) aVar;
        return C46238a.m51546a(this.BaseResponse, mx32.BaseResponse) && C46238a.m51546a(this.f227857d, mx32.f227857d) && C46238a.m51546a(this.f227858e, mx32.f227858e) && C46238a.m51546a(this.f227859f, mx32.f227859f) && C46238a.m51546a(this.f227860g, mx32.f227860g) && C46238a.m51546a(Integer.valueOf(this.f227861h), Integer.valueOf(mx32.f227861h)) && C46238a.m51546a(this.f227862i, mx32.f227862i) && C46238a.m51546a(this.f227863j, mx32.f227863j) && C46238a.m51546a(this.f227864n, mx32.f227864n) && C46238a.m51546a(this.f227865o, mx32.f227865o) && C46238a.m51546a(Integer.valueOf(this.f227866p), Integer.valueOf(mx32.f227866p)) && C46238a.m51546a(Integer.valueOf(this.f227867q), Integer.valueOf(mx32.f227867q)) && C46238a.m51546a(this.f227868r, mx32.f227868r) && C46238a.m51546a(this.f227869s, mx32.f227869s) && C46238a.m51546a(this.f227870t, mx32.f227870t) && C46238a.m51546a(this.f227871u, mx32.f227871u) && C46238a.m51546a(Integer.valueOf(this.f227872v), Integer.valueOf(mx32.f227872v)) && C46238a.m51546a(Integer.valueOf(this.f227873w), Integer.valueOf(mx32.f227873w)) && C46238a.m51546a(Integer.valueOf(this.f227874x), Integer.valueOf(mx32.f227874x)) && C46238a.m51546a(this.f227875y, mx32.f227875y) && C46238a.m51546a(this.f227876z, mx32.f227876z) && C46238a.m51546a(this.f227842A, mx32.f227842A) && C46238a.m51546a(this.f227843B, mx32.f227843B) && C46238a.m51546a(this.f227844C, mx32.f227844C) && C46238a.m51546a(Integer.valueOf(this.f227845D), Integer.valueOf(mx32.f227845D)) && C46238a.m51546a(this.f227846E, mx32.f227846E) && C46238a.m51546a(this.f227847F, mx32.f227847F) && C46238a.m51546a(this.f227848G, mx32.f227848G) && C46238a.m51546a(this.f227849H, mx32.f227849H) && C46238a.m51546a(this.f227850I, mx32.f227850I) && C46238a.m51546a(this.f227851J, mx32.f227851J) && C46238a.m51546a(Integer.valueOf(this.f227852K), Integer.valueOf(mx32.f227852K)) && C46238a.m51546a(this.f227853L, mx32.f227853L) && C46238a.m51546a(Integer.valueOf(this.f227854M), Integer.valueOf(mx32.f227854M)) && C46238a.m51546a(this.f227855N, mx32.f227855N) && C46238a.m51546a(Integer.valueOf(this.f227856P), Integer.valueOf(mx32.f227856P));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f227857d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227858e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227859f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227860g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227862i != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                C51163rv3 rv32 = this.f227857d;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f227857d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f227858e;
                if (rv33 != null) {
                    aVar.mo74322i(3, rv33.computeSize());
                    this.f227858e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f227859f;
                if (rv34 != null) {
                    aVar.mo74322i(4, rv34.computeSize());
                    this.f227859f.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f227860g;
                if (rv35 != null) {
                    aVar.mo74322i(5, rv35.computeSize());
                    this.f227860g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f227861h);
                C51018qv3 qv32 = this.f227862i;
                if (qv32 != null) {
                    aVar.mo74322i(7, qv32.computeSize());
                    this.f227862i.writeFields(aVar);
                }
                String str = this.f227863j;
                if (str != null) {
                    aVar.mo74323j(8, str);
                }
                String str2 = this.f227864n;
                if (str2 != null) {
                    aVar.mo74323j(9, str2);
                }
                String str3 = this.f227865o;
                if (str3 != null) {
                    aVar.mo74323j(10, str3);
                }
                aVar.mo74318e(11, this.f227866p);
                aVar.mo74318e(12, this.f227867q);
                String str4 = this.f227868r;
                if (str4 != null) {
                    aVar.mo74323j(13, str4);
                }
                String str5 = this.f227869s;
                if (str5 != null) {
                    aVar.mo74323j(14, str5);
                }
                String str6 = this.f227870t;
                if (str6 != null) {
                    aVar.mo74323j(15, str6);
                }
                String str7 = this.f227871u;
                if (str7 != null) {
                    aVar.mo74323j(16, str7);
                }
                aVar.mo74318e(17, this.f227872v);
                aVar.mo74318e(18, this.f227873w);
                aVar.mo74318e(19, this.f227874x);
                String str8 = this.f227875y;
                if (str8 != null) {
                    aVar.mo74323j(20, str8);
                }
                a94 a94 = this.f227876z;
                if (a94 != null) {
                    aVar.mo74322i(21, a94.computeSize());
                    this.f227876z.writeFields(aVar);
                }
                String str9 = this.f227842A;
                if (str9 != null) {
                    aVar.mo74323j(22, str9);
                }
                String str10 = this.f227843B;
                if (str10 != null) {
                    aVar.mo74323j(23, str10);
                }
                C51043r10 r102 = this.f227844C;
                if (r102 != null) {
                    aVar.mo74322i(24, r102.computeSize());
                    this.f227844C.writeFields(aVar);
                }
                aVar.mo74318e(25, this.f227845D);
                aVar.mo74320g(26, 8, this.f227846E);
                String str11 = this.f227847F;
                if (str11 != null) {
                    aVar.mo74323j(27, str11);
                }
                String str12 = this.f227848G;
                if (str12 != null) {
                    aVar.mo74323j(28, str12);
                }
                C51018qv3 qv33 = this.f227849H;
                if (qv33 != null) {
                    aVar.mo74322i(29, qv33.computeSize());
                    this.f227849H.writeFields(aVar);
                }
                String str13 = this.f227850I;
                if (str13 != null) {
                    aVar.mo74323j(30, str13);
                }
                String str14 = this.f227851J;
                if (str14 != null) {
                    aVar.mo74323j(31, str14);
                }
                aVar.mo74318e(32, this.f227852K);
                String str15 = this.f227853L;
                if (str15 != null) {
                    aVar.mo74323j(33, str15);
                }
                aVar.mo74318e(34, this.f227854M);
                aVar.mo74320g(35, 8, this.f227855N);
                aVar.mo74318e(36, this.f227856P);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            C51163rv3 rv36 = this.f227857d;
            if (rv36 != null) {
                i3 += C52418a.m58682i(2, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f227858e;
            if (rv37 != null) {
                i3 += C52418a.m58682i(3, rv37.computeSize());
            }
            C51163rv3 rv38 = this.f227859f;
            if (rv38 != null) {
                i3 += C52418a.m58682i(4, rv38.computeSize());
            }
            C51163rv3 rv39 = this.f227860g;
            if (rv39 != null) {
                i3 += C52418a.m58682i(5, rv39.computeSize());
            }
            int e = i3 + C52418a.m58678e(6, this.f227861h);
            C51018qv3 qv34 = this.f227862i;
            if (qv34 != null) {
                e += C52418a.m58682i(7, qv34.computeSize());
            }
            String str16 = this.f227863j;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            String str17 = this.f227864n;
            if (str17 != null) {
                e += C52418a.m58683j(9, str17);
            }
            String str18 = this.f227865o;
            if (str18 != null) {
                e += C52418a.m58683j(10, str18);
            }
            int e2 = e + C52418a.m58678e(11, this.f227866p) + C52418a.m58678e(12, this.f227867q);
            String str19 = this.f227868r;
            if (str19 != null) {
                e2 += C52418a.m58683j(13, str19);
            }
            String str20 = this.f227869s;
            if (str20 != null) {
                e2 += C52418a.m58683j(14, str20);
            }
            String str21 = this.f227870t;
            if (str21 != null) {
                e2 += C52418a.m58683j(15, str21);
            }
            String str22 = this.f227871u;
            if (str22 != null) {
                e2 += C52418a.m58683j(16, str22);
            }
            int e3 = e2 + C52418a.m58678e(17, this.f227872v) + C52418a.m58678e(18, this.f227873w) + C52418a.m58678e(19, this.f227874x);
            String str23 = this.f227875y;
            if (str23 != null) {
                e3 += C52418a.m58683j(20, str23);
            }
            a94 a942 = this.f227876z;
            if (a942 != null) {
                e3 += C52418a.m58682i(21, a942.computeSize());
            }
            String str24 = this.f227842A;
            if (str24 != null) {
                e3 += C52418a.m58683j(22, str24);
            }
            String str25 = this.f227843B;
            if (str25 != null) {
                e3 += C52418a.m58683j(23, str25);
            }
            C51043r10 r103 = this.f227844C;
            if (r103 != null) {
                e3 += C52418a.m58682i(24, r103.computeSize());
            }
            int e4 = e3 + C52418a.m58678e(25, this.f227845D) + C52418a.m58680g(26, 8, this.f227846E);
            String str26 = this.f227847F;
            if (str26 != null) {
                e4 += C52418a.m58683j(27, str26);
            }
            String str27 = this.f227848G;
            if (str27 != null) {
                e4 += C52418a.m58683j(28, str27);
            }
            C51018qv3 qv35 = this.f227849H;
            if (qv35 != null) {
                e4 += C52418a.m58682i(29, qv35.computeSize());
            }
            String str28 = this.f227850I;
            if (str28 != null) {
                e4 += C52418a.m58683j(30, str28);
            }
            String str29 = this.f227851J;
            if (str29 != null) {
                e4 += C52418a.m58683j(31, str29);
            }
            int e5 = e4 + C52418a.m58678e(32, this.f227852K);
            String str30 = this.f227853L;
            if (str30 != null) {
                e5 += C52418a.m58683j(33, str30);
            }
            return e5 + C52418a.m58678e(34, this.f227854M) + C52418a.m58680g(35, 8, this.f227855N) + C52418a.m58678e(36, this.f227856P);
        } else if (i2 == 2) {
            this.f227846E.clear();
            this.f227855N.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f227857d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227858e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227859f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227860g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227862i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ImgBuf");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77967mx3 mx32 = objArr[1];
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
                        mx32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv310.mo73356d(bArr2);
                        }
                        mx32.f227857d = rv310;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv311 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv311.mo73356d(bArr3);
                        }
                        mx32.f227858e = rv311;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv312 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv312.mo73356d(bArr4);
                        }
                        mx32.f227859f = rv312;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C51163rv3 rv313 = new C51163rv3();
                        if (bArr5 != null && bArr5.length > 0) {
                            rv313.mo73356d(bArr5);
                        }
                        mx32.f227860g = rv313;
                    }
                    return 0;
                case 6:
                    mx32.f227861h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51018qv3 qv36 = new C51018qv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            qv36.mo73348f(bArr6);
                        }
                        mx32.f227862i = qv36;
                    }
                    return 0;
                case 8:
                    mx32.f227863j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mx32.f227864n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    mx32.f227865o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    mx32.f227866p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    mx32.f227867q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    mx32.f227868r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    mx32.f227869s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    mx32.f227870t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    mx32.f227871u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    mx32.f227872v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    mx32.f227873w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    mx32.f227874x = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    mx32.f227875y = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        a94 a943 = new a94();
                        if (bArr7 != null && bArr7.length > 0) {
                            a943.parseFrom(bArr7);
                        }
                        mx32.f227876z = a943;
                    }
                    return 0;
                case 22:
                    mx32.f227842A = aVar3.mo141633k(intValue);
                    return 0;
                case 23:
                    mx32.f227843B = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51043r10 r104 = new C51043r10();
                        if (bArr8 != null && bArr8.length > 0) {
                            r104.parseFrom(bArr8);
                        }
                        mx32.f227844C = r104;
                    }
                    return 0;
                case 25:
                    mx32.f227845D = aVar3.mo141629g(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        C77961kx3 kx32 = new C77961kx3();
                        if (bArr9 != null && bArr9.length > 0) {
                            kx32.parseFrom(bArr9);
                        }
                        mx32.f227846E.add(kx32);
                    }
                    return 0;
                case 27:
                    mx32.f227847F = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    mx32.f227848G = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51018qv3 qv37 = new C51018qv3();
                        if (bArr10 != null && bArr10.length > 0) {
                            qv37.mo73348f(bArr10);
                        }
                        mx32.f227849H = qv37;
                    }
                    return 0;
                case 30:
                    mx32.f227850I = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    mx32.f227851J = aVar3.mo141633k(intValue);
                    return 0;
                case 32:
                    mx32.f227852K = aVar3.mo141629g(intValue);
                    return 0;
                case 33:
                    mx32.f227853L = aVar3.mo141633k(intValue);
                    return 0;
                case 34:
                    mx32.f227854M = aVar3.mo141629g(intValue);
                    return 0;
                case 35:
                    LinkedList<byte[]> j16 = aVar3.mo141632j(intValue);
                    int size11 = j16.size();
                    for (int i19 = 0; i19 < size11; i19++) {
                        byte[] bArr11 = j16.get(i19);
                        C77917dy3 dy32 = new C77917dy3();
                        if (bArr11 != null && bArr11.length > 0) {
                            dy32.parseFrom(bArr11);
                        }
                        mx32.f227855N.add(dy32);
                    }
                    return 0;
                case 36:
                    mx32.f227856P = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
