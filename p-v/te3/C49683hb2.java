package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hb2 */
public class C49683hb2 extends C49335eu3 {

    /* renamed from: A */
    public LinkedList<oa4> f134537A = new LinkedList<>();

    /* renamed from: d */
    public String f134538d;

    /* renamed from: e */
    public String f134539e;

    /* renamed from: f */
    public r85 f134540f;

    /* renamed from: g */
    public LinkedList<t85> f134541g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<s85> f134542h = new LinkedList<>();

    /* renamed from: i */
    public String f134543i;

    /* renamed from: j */
    public LinkedList<String> f134544j = new LinkedList<>();

    /* renamed from: n */
    public String f134545n;

    /* renamed from: o */
    public String f134546o;

    /* renamed from: p */
    public LinkedList<kb4> f134547p = new LinkedList<>();

    /* renamed from: q */
    public LinkedList<C51723vp1> f134548q = new LinkedList<>();

    /* renamed from: r */
    public boolean f134549r;

    /* renamed from: s */
    public LinkedList<C51984xk> f134550s = new LinkedList<>();

    /* renamed from: t */
    public boolean f134551t;

    /* renamed from: u */
    public int f134552u;

    /* renamed from: v */
    public String f134553v;

    /* renamed from: w */
    public LinkedList<pa4> f134554w = new LinkedList<>();

    /* renamed from: x */
    public int f134555x;

    /* renamed from: y */
    public o85 f134556y;

    /* renamed from: z */
    public boolean f134557z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49683hb2)) {
            return false;
        }
        C49683hb2 hb22 = (C49683hb2) aVar;
        return C46238a.m51546a(this.BaseResponse, hb22.BaseResponse) && C46238a.m51546a(this.f134538d, hb22.f134538d) && C46238a.m51546a(this.f134539e, hb22.f134539e) && C46238a.m51546a(this.f134540f, hb22.f134540f) && C46238a.m51546a(this.f134541g, hb22.f134541g) && C46238a.m51546a(this.f134542h, hb22.f134542h) && C46238a.m51546a(this.f134543i, hb22.f134543i) && C46238a.m51546a(this.f134544j, hb22.f134544j) && C46238a.m51546a(this.f134545n, hb22.f134545n) && C46238a.m51546a(this.f134546o, hb22.f134546o) && C46238a.m51546a(this.f134547p, hb22.f134547p) && C46238a.m51546a(this.f134548q, hb22.f134548q) && C46238a.m51546a(Boolean.valueOf(this.f134549r), Boolean.valueOf(hb22.f134549r)) && C46238a.m51546a(this.f134550s, hb22.f134550s) && C46238a.m51546a(Boolean.valueOf(this.f134551t), Boolean.valueOf(hb22.f134551t)) && C46238a.m51546a(Integer.valueOf(this.f134552u), Integer.valueOf(hb22.f134552u)) && C46238a.m51546a(this.f134553v, hb22.f134553v) && C46238a.m51546a(this.f134554w, hb22.f134554w) && C46238a.m51546a(Integer.valueOf(this.f134555x), Integer.valueOf(hb22.f134555x)) && C46238a.m51546a(this.f134556y, hb22.f134556y) && C46238a.m51546a(Boolean.valueOf(this.f134557z), Boolean.valueOf(hb22.f134557z)) && C46238a.m51546a(this.f134537A, hb22.f134537A);
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
            } else if (this.f134538d == null) {
                throw new C52419b("Not all required fields were included: coverurl");
            } else if (this.f134539e == null) {
                throw new C52419b("Not all required fields were included: motto");
            } else if (this.f134540f != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                String str = this.f134538d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f134539e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                r85 r85 = this.f134540f;
                if (r85 != null) {
                    aVar.mo74322i(4, r85.computeSize());
                    this.f134540f.writeFields(aVar);
                }
                aVar.mo74320g(5, 8, this.f134541g);
                aVar.mo74320g(6, 8, this.f134542h);
                String str3 = this.f134543i;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                aVar.mo74320g(8, 1, this.f134544j);
                String str4 = this.f134545n;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f134546o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                aVar.mo74320g(14, 8, this.f134547p);
                aVar.mo74320g(15, 8, this.f134548q);
                aVar.mo74314a(16, this.f134549r);
                aVar.mo74320g(17, 8, this.f134550s);
                aVar.mo74314a(18, this.f134551t);
                aVar.mo74318e(19, this.f134552u);
                String str6 = this.f134553v;
                if (str6 != null) {
                    aVar.mo74323j(20, str6);
                }
                aVar.mo74320g(21, 8, this.f134554w);
                aVar.mo74318e(22, this.f134555x);
                o85 o85 = this.f134556y;
                if (o85 != null) {
                    aVar.mo74322i(23, o85.computeSize());
                    this.f134556y.writeFields(aVar);
                }
                aVar.mo74314a(24, this.f134557z);
                aVar.mo74320g(25, 8, this.f134537A);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankdesc");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            String str7 = this.f134538d;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f134539e;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            r85 r852 = this.f134540f;
            if (r852 != null) {
                i3 += C52418a.m58682i(4, r852.computeSize());
            }
            int g = i3 + C52418a.m58680g(5, 8, this.f134541g) + C52418a.m58680g(6, 8, this.f134542h);
            String str9 = this.f134543i;
            if (str9 != null) {
                g += C52418a.m58683j(7, str9);
            }
            int g2 = g + C52418a.m58680g(8, 1, this.f134544j);
            String str10 = this.f134545n;
            if (str10 != null) {
                g2 += C52418a.m58683j(9, str10);
            }
            String str11 = this.f134546o;
            if (str11 != null) {
                g2 += C52418a.m58683j(10, str11);
            }
            int g3 = g2 + C52418a.m58680g(14, 8, this.f134547p) + C52418a.m58680g(15, 8, this.f134548q) + C52418a.m58674a(16, this.f134549r) + C52418a.m58680g(17, 8, this.f134550s) + C52418a.m58674a(18, this.f134551t) + C52418a.m58678e(19, this.f134552u);
            String str12 = this.f134553v;
            if (str12 != null) {
                g3 += C52418a.m58683j(20, str12);
            }
            int g4 = g3 + C52418a.m58680g(21, 8, this.f134554w) + C52418a.m58678e(22, this.f134555x);
            o85 o852 = this.f134556y;
            if (o852 != null) {
                g4 += C52418a.m58682i(23, o852.computeSize());
            }
            return g4 + C52418a.m58674a(24, this.f134557z) + C52418a.m58680g(25, 8, this.f134537A);
        } else if (i2 == 2) {
            this.f134541g.clear();
            this.f134542h.clear();
            this.f134544j.clear();
            this.f134547p.clear();
            this.f134548q.clear();
            this.f134550s.clear();
            this.f134554w.clear();
            this.f134537A.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f134538d == null) {
                throw new C52419b("Not all required fields were included: coverurl");
            } else if (this.f134539e == null) {
                throw new C52419b("Not all required fields were included: motto");
            } else if (this.f134540f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: rankdesc");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49683hb2 hb22 = objArr[1];
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
                        hb22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    hb22.f134538d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hb22.f134539e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        r85 r853 = new r85();
                        if (bArr2 != null && bArr2.length > 0) {
                            r853.parseFrom(bArr2);
                        }
                        hb22.f134540f = r853;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        t85 t85 = new t85();
                        if (bArr3 != null && bArr3.length > 0) {
                            t85.parseFrom(bArr3);
                        }
                        hb22.f134541g.add(t85);
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        s85 s85 = new s85();
                        if (bArr4 != null && bArr4.length > 0) {
                            s85.parseFrom(bArr4);
                        }
                        hb22.f134542h.add(s85);
                    }
                    return 0;
                case 7:
                    hb22.f134543i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hb22.f134544j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 9:
                    hb22.f134545n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    hb22.f134546o = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        kb4 kb4 = new kb4();
                        if (bArr5 != null && bArr5.length > 0) {
                            kb4.parseFrom(bArr5);
                        }
                        hb22.f134547p.add(kb4);
                    }
                    return 0;
                case 15:
                    LinkedList<byte[]> j6 = aVar3.mo141632j(intValue);
                    int size6 = j6.size();
                    for (int i9 = 0; i9 < size6; i9++) {
                        byte[] bArr6 = j6.get(i9);
                        C51723vp1 vp12 = new C51723vp1();
                        if (bArr6 != null && bArr6.length > 0) {
                            vp12.parseFrom(bArr6);
                        }
                        hb22.f134548q.add(vp12);
                    }
                    return 0;
                case 16:
                    hb22.f134549r = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j7 = aVar3.mo141632j(intValue);
                    int size7 = j7.size();
                    for (int i15 = 0; i15 < size7; i15++) {
                        byte[] bArr7 = j7.get(i15);
                        C51984xk xkVar = new C51984xk();
                        if (bArr7 != null && bArr7.length > 0) {
                            xkVar.parseFrom(bArr7);
                        }
                        hb22.f134550s.add(xkVar);
                    }
                    return 0;
                case 18:
                    hb22.f134551t = aVar3.mo141625c(intValue);
                    return 0;
                case 19:
                    hb22.f134552u = aVar3.mo141629g(intValue);
                    return 0;
                case 20:
                    hb22.f134553v = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    LinkedList<byte[]> j8 = aVar3.mo141632j(intValue);
                    int size8 = j8.size();
                    for (int i16 = 0; i16 < size8; i16++) {
                        byte[] bArr8 = j8.get(i16);
                        pa4 pa4 = new pa4();
                        if (bArr8 != null && bArr8.length > 0) {
                            pa4.parseFrom(bArr8);
                        }
                        hb22.f134554w.add(pa4);
                    }
                    return 0;
                case 22:
                    hb22.f134555x = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    LinkedList<byte[]> j9 = aVar3.mo141632j(intValue);
                    int size9 = j9.size();
                    for (int i17 = 0; i17 < size9; i17++) {
                        byte[] bArr9 = j9.get(i17);
                        o85 o853 = new o85();
                        if (bArr9 != null && bArr9.length > 0) {
                            o853.parseFrom(bArr9);
                        }
                        hb22.f134556y = o853;
                    }
                    return 0;
                case 24:
                    hb22.f134557z = aVar3.mo141625c(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j15 = aVar3.mo141632j(intValue);
                    int size10 = j15.size();
                    for (int i18 = 0; i18 < size10; i18++) {
                        byte[] bArr10 = j15.get(i18);
                        oa4 oa4 = new oa4();
                        if (bArr10 != null && bArr10.length > 0) {
                            oa4.parseFrom(bArr10);
                        }
                        hb22.f134537A.add(oa4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
