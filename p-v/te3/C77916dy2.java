package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dy2 */
public class C77916dy2 extends C47465a {

    /* renamed from: A */
    public int f227159A;

    /* renamed from: B */
    public int f227160B;

    /* renamed from: C */
    public int f227161C;

    /* renamed from: D */
    public String f227162D;

    /* renamed from: E */
    public String f227163E;

    /* renamed from: F */
    public a94 f227164F;

    /* renamed from: G */
    public String f227165G;

    /* renamed from: H */
    public String f227166H;

    /* renamed from: I */
    public String f227167I;

    /* renamed from: J */
    public String f227168J;

    /* renamed from: K */
    public C51043r10 f227169K;

    /* renamed from: d */
    public C51163rv3 f227170d;

    /* renamed from: e */
    public C51163rv3 f227171e;

    /* renamed from: f */
    public C51163rv3 f227172f;

    /* renamed from: g */
    public C51163rv3 f227173g;

    /* renamed from: h */
    public int f227174h;

    /* renamed from: i */
    public C51018qv3 f227175i;

    /* renamed from: j */
    public int f227176j;

    /* renamed from: n */
    public C51163rv3 f227177n;

    /* renamed from: o */
    public C51163rv3 f227178o;

    /* renamed from: p */
    public C51163rv3 f227179p;

    /* renamed from: q */
    public int f227180q;

    /* renamed from: r */
    public String f227181r;

    /* renamed from: s */
    public String f227182s;

    /* renamed from: t */
    public String f227183t;

    /* renamed from: u */
    public int f227184u;

    /* renamed from: v */
    public int f227185v;

    /* renamed from: w */
    public String f227186w;

    /* renamed from: x */
    public String f227187x;

    /* renamed from: y */
    public String f227188y;

    /* renamed from: z */
    public String f227189z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77916dy2)) {
            return false;
        }
        C77916dy2 dy22 = (C77916dy2) aVar;
        return C46238a.m51546a(this.f227170d, dy22.f227170d) && C46238a.m51546a(this.f227171e, dy22.f227171e) && C46238a.m51546a(this.f227172f, dy22.f227172f) && C46238a.m51546a(this.f227173g, dy22.f227173g) && C46238a.m51546a(Integer.valueOf(this.f227174h), Integer.valueOf(dy22.f227174h)) && C46238a.m51546a(this.f227175i, dy22.f227175i) && C46238a.m51546a(Integer.valueOf(this.f227176j), Integer.valueOf(dy22.f227176j)) && C46238a.m51546a(this.f227177n, dy22.f227177n) && C46238a.m51546a(this.f227178o, dy22.f227178o) && C46238a.m51546a(this.f227179p, dy22.f227179p) && C46238a.m51546a(Integer.valueOf(this.f227180q), Integer.valueOf(dy22.f227180q)) && C46238a.m51546a(this.f227181r, dy22.f227181r) && C46238a.m51546a(this.f227182s, dy22.f227182s) && C46238a.m51546a(this.f227183t, dy22.f227183t) && C46238a.m51546a(Integer.valueOf(this.f227184u), Integer.valueOf(dy22.f227184u)) && C46238a.m51546a(Integer.valueOf(this.f227185v), Integer.valueOf(dy22.f227185v)) && C46238a.m51546a(this.f227186w, dy22.f227186w) && C46238a.m51546a(this.f227187x, dy22.f227187x) && C46238a.m51546a(this.f227188y, dy22.f227188y) && C46238a.m51546a(this.f227189z, dy22.f227189z) && C46238a.m51546a(Integer.valueOf(this.f227159A), Integer.valueOf(dy22.f227159A)) && C46238a.m51546a(Integer.valueOf(this.f227160B), Integer.valueOf(dy22.f227160B)) && C46238a.m51546a(Integer.valueOf(this.f227161C), Integer.valueOf(dy22.f227161C)) && C46238a.m51546a(this.f227162D, dy22.f227162D) && C46238a.m51546a(this.f227163E, dy22.f227163E) && C46238a.m51546a(this.f227164F, dy22.f227164F) && C46238a.m51546a(this.f227165G, dy22.f227165G) && C46238a.m51546a(this.f227166H, dy22.f227166H) && C46238a.m51546a(this.f227167I, dy22.f227167I) && C46238a.m51546a(this.f227168J, dy22.f227168J) && C46238a.m51546a(this.f227169K, dy22.f227169K);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f227170d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227171e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227172f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227173g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227175i == null) {
                throw new C52419b("Not all required fields were included: ImgBuf");
            } else if (this.f227177n == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f227178o == null) {
                throw new C52419b("Not all required fields were included: RemarkPYInitial");
            } else if (this.f227179p != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f227170d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f227171e;
                if (rv33 != null) {
                    aVar.mo74322i(2, rv33.computeSize());
                    this.f227171e.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f227172f;
                if (rv34 != null) {
                    aVar.mo74322i(3, rv34.computeSize());
                    this.f227172f.writeFields(aVar);
                }
                C51163rv3 rv35 = this.f227173g;
                if (rv35 != null) {
                    aVar.mo74322i(4, rv35.computeSize());
                    this.f227173g.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f227174h);
                C51018qv3 qv32 = this.f227175i;
                if (qv32 != null) {
                    aVar.mo74322i(6, qv32.computeSize());
                    this.f227175i.writeFields(aVar);
                }
                aVar.mo74318e(7, this.f227176j);
                C51163rv3 rv36 = this.f227177n;
                if (rv36 != null) {
                    aVar.mo74322i(8, rv36.computeSize());
                    this.f227177n.writeFields(aVar);
                }
                C51163rv3 rv37 = this.f227178o;
                if (rv37 != null) {
                    aVar.mo74322i(9, rv37.computeSize());
                    this.f227178o.writeFields(aVar);
                }
                C51163rv3 rv38 = this.f227179p;
                if (rv38 != null) {
                    aVar.mo74322i(10, rv38.computeSize());
                    this.f227179p.writeFields(aVar);
                }
                aVar.mo74318e(11, this.f227180q);
                String str = this.f227181r;
                if (str != null) {
                    aVar.mo74323j(12, str);
                }
                String str2 = this.f227182s;
                if (str2 != null) {
                    aVar.mo74323j(13, str2);
                }
                String str3 = this.f227183t;
                if (str3 != null) {
                    aVar.mo74323j(14, str3);
                }
                aVar.mo74318e(15, this.f227184u);
                aVar.mo74318e(16, this.f227185v);
                String str4 = this.f227186w;
                if (str4 != null) {
                    aVar.mo74323j(17, str4);
                }
                String str5 = this.f227187x;
                if (str5 != null) {
                    aVar.mo74323j(18, str5);
                }
                String str6 = this.f227188y;
                if (str6 != null) {
                    aVar.mo74323j(19, str6);
                }
                String str7 = this.f227189z;
                if (str7 != null) {
                    aVar.mo74323j(20, str7);
                }
                aVar.mo74318e(21, this.f227159A);
                aVar.mo74318e(22, this.f227160B);
                aVar.mo74318e(23, this.f227161C);
                String str8 = this.f227162D;
                if (str8 != null) {
                    aVar.mo74323j(24, str8);
                }
                String str9 = this.f227163E;
                if (str9 != null) {
                    aVar.mo74323j(25, str9);
                }
                a94 a94 = this.f227164F;
                if (a94 != null) {
                    aVar.mo74322i(26, a94.computeSize());
                    this.f227164F.writeFields(aVar);
                }
                String str10 = this.f227165G;
                if (str10 != null) {
                    aVar.mo74323j(27, str10);
                }
                String str11 = this.f227166H;
                if (str11 != null) {
                    aVar.mo74323j(28, str11);
                }
                String str12 = this.f227167I;
                if (str12 != null) {
                    aVar.mo74323j(29, str12);
                }
                String str13 = this.f227168J;
                if (str13 != null) {
                    aVar.mo74323j(30, str13);
                }
                C51043r10 r102 = this.f227169K;
                if (r102 != null) {
                    aVar.mo74322i(31, r102.computeSize());
                    this.f227169K.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RemarkQuanPin");
            }
        } else if (i2 == 1) {
            C51163rv3 rv39 = this.f227170d;
            if (rv39 != null) {
                i3 = C52418a.m58682i(1, rv39.computeSize()) + 0;
            }
            C51163rv3 rv310 = this.f227171e;
            if (rv310 != null) {
                i3 += C52418a.m58682i(2, rv310.computeSize());
            }
            C51163rv3 rv311 = this.f227172f;
            if (rv311 != null) {
                i3 += C52418a.m58682i(3, rv311.computeSize());
            }
            C51163rv3 rv312 = this.f227173g;
            if (rv312 != null) {
                i3 += C52418a.m58682i(4, rv312.computeSize());
            }
            int e = i3 + C52418a.m58678e(5, this.f227174h);
            C51018qv3 qv33 = this.f227175i;
            if (qv33 != null) {
                e += C52418a.m58682i(6, qv33.computeSize());
            }
            int e2 = e + C52418a.m58678e(7, this.f227176j);
            C51163rv3 rv313 = this.f227177n;
            if (rv313 != null) {
                e2 += C52418a.m58682i(8, rv313.computeSize());
            }
            C51163rv3 rv314 = this.f227178o;
            if (rv314 != null) {
                e2 += C52418a.m58682i(9, rv314.computeSize());
            }
            C51163rv3 rv315 = this.f227179p;
            if (rv315 != null) {
                e2 += C52418a.m58682i(10, rv315.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(11, this.f227180q);
            String str14 = this.f227181r;
            if (str14 != null) {
                e3 += C52418a.m58683j(12, str14);
            }
            String str15 = this.f227182s;
            if (str15 != null) {
                e3 += C52418a.m58683j(13, str15);
            }
            String str16 = this.f227183t;
            if (str16 != null) {
                e3 += C52418a.m58683j(14, str16);
            }
            int e4 = e3 + C52418a.m58678e(15, this.f227184u) + C52418a.m58678e(16, this.f227185v);
            String str17 = this.f227186w;
            if (str17 != null) {
                e4 += C52418a.m58683j(17, str17);
            }
            String str18 = this.f227187x;
            if (str18 != null) {
                e4 += C52418a.m58683j(18, str18);
            }
            String str19 = this.f227188y;
            if (str19 != null) {
                e4 += C52418a.m58683j(19, str19);
            }
            String str20 = this.f227189z;
            if (str20 != null) {
                e4 += C52418a.m58683j(20, str20);
            }
            int e5 = e4 + C52418a.m58678e(21, this.f227159A) + C52418a.m58678e(22, this.f227160B) + C52418a.m58678e(23, this.f227161C);
            String str21 = this.f227162D;
            if (str21 != null) {
                e5 += C52418a.m58683j(24, str21);
            }
            String str22 = this.f227163E;
            if (str22 != null) {
                e5 += C52418a.m58683j(25, str22);
            }
            a94 a942 = this.f227164F;
            if (a942 != null) {
                e5 += C52418a.m58682i(26, a942.computeSize());
            }
            String str23 = this.f227165G;
            if (str23 != null) {
                e5 += C52418a.m58683j(27, str23);
            }
            String str24 = this.f227166H;
            if (str24 != null) {
                e5 += C52418a.m58683j(28, str24);
            }
            String str25 = this.f227167I;
            if (str25 != null) {
                e5 += C52418a.m58683j(29, str25);
            }
            String str26 = this.f227168J;
            if (str26 != null) {
                e5 += C52418a.m58683j(30, str26);
            }
            C51043r10 r103 = this.f227169K;
            return r103 != null ? e5 + C52418a.m58682i(31, r103.computeSize()) : e5;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f227170d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f227171e == null) {
                throw new C52419b("Not all required fields were included: NickName");
            } else if (this.f227172f == null) {
                throw new C52419b("Not all required fields were included: PYInitial");
            } else if (this.f227173g == null) {
                throw new C52419b("Not all required fields were included: QuanPin");
            } else if (this.f227175i == null) {
                throw new C52419b("Not all required fields were included: ImgBuf");
            } else if (this.f227177n == null) {
                throw new C52419b("Not all required fields were included: Remark");
            } else if (this.f227178o == null) {
                throw new C52419b("Not all required fields were included: RemarkPYInitial");
            } else if (this.f227179p != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: RemarkQuanPin");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77916dy2 dy22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51163rv3 rv316 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv316.mo73356d(bArr);
                        }
                        dy22.f227170d = rv316;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv317 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv317.mo73356d(bArr2);
                        }
                        dy22.f227171e = rv317;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv318 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv318.mo73356d(bArr3);
                        }
                        dy22.f227172f = rv318;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv319 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv319.mo73356d(bArr4);
                        }
                        dy22.f227173g = rv319;
                    }
                    return 0;
                case 5:
                    dy22.f227174h = aVar3.mo141629g(intValue);
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
                        dy22.f227175i = qv34;
                    }
                    return 0;
                case 7:
                    dy22.f227176j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51163rv3 rv320 = new C51163rv3();
                        if (bArr6 != null && bArr6.length > 0) {
                            rv320.mo73356d(bArr6);
                        }
                        dy22.f227177n = rv320;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51163rv3 rv321 = new C51163rv3();
                        if (bArr7 != null && bArr7.length > 0) {
                            rv321.mo73356d(bArr7);
                        }
                        dy22.f227178o = rv321;
                    }
                    return 0;
                case 10:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        C51163rv3 rv322 = new C51163rv3();
                        if (bArr8 != null && bArr8.length > 0) {
                            rv322.mo73356d(bArr8);
                        }
                        dy22.f227179p = rv322;
                    }
                    return 0;
                case 11:
                    dy22.f227180q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    dy22.f227181r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    dy22.f227182s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    dy22.f227183t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    dy22.f227184u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    dy22.f227185v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    dy22.f227186w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    dy22.f227187x = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    dy22.f227188y = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    dy22.f227189z = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    dy22.f227159A = aVar3.mo141629g(intValue);
                    return 0;
                case 22:
                    dy22.f227160B = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    dy22.f227161C = aVar3.mo141629g(intValue);
                    return 0;
                case 24:
                    dy22.f227162D = aVar3.mo141633k(intValue);
                    return 0;
                case 25:
                    dy22.f227163E = aVar3.mo141633k(intValue);
                    return 0;
                case 26:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        a94 a943 = new a94();
                        if (bArr9 != null && bArr9.length > 0) {
                            a943.parseFrom(bArr9);
                        }
                        dy22.f227164F = a943;
                    }
                    return 0;
                case 27:
                    dy22.f227165G = aVar3.mo141633k(intValue);
                    return 0;
                case 28:
                    dy22.f227166H = aVar3.mo141633k(intValue);
                    return 0;
                case 29:
                    dy22.f227167I = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    dy22.f227168J = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        C51043r10 r104 = new C51043r10();
                        if (bArr10 != null && bArr10.length > 0) {
                            r104.parseFrom(bArr10);
                        }
                        dy22.f227169K = r104;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
