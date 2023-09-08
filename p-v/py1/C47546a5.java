package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.a5 */
public class C47546a5 extends C47465a {

    /* renamed from: d */
    public String f127565d;

    /* renamed from: e */
    public String f127566e;

    /* renamed from: f */
    public String f127567f;

    /* renamed from: g */
    public String f127568g;

    /* renamed from: h */
    public String f127569h;

    /* renamed from: i */
    public String f127570i;

    /* renamed from: j */
    public String f127571j;

    /* renamed from: n */
    public String f127572n;

    /* renamed from: o */
    public String f127573o;

    /* renamed from: p */
    public String f127574p;

    /* renamed from: q */
    public int f127575q;

    /* renamed from: r */
    public String f127576r;

    /* renamed from: s */
    public C47709y4 f127577s;

    /* renamed from: t */
    public C47715z4 f127578t;

    /* renamed from: u */
    public boolean f127579u;

    /* renamed from: v */
    public int f127580v;

    /* renamed from: w */
    public boolean f127581w;

    /* renamed from: x */
    public LinkedList<C47697w4> f127582x = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47546a5)) {
            return false;
        }
        C47546a5 a5Var = (C47546a5) aVar;
        return C46238a.m51546a(this.f127565d, a5Var.f127565d) && C46238a.m51546a(this.f127566e, a5Var.f127566e) && C46238a.m51546a(this.f127567f, a5Var.f127567f) && C46238a.m51546a(this.f127568g, a5Var.f127568g) && C46238a.m51546a(this.f127569h, a5Var.f127569h) && C46238a.m51546a(this.f127570i, a5Var.f127570i) && C46238a.m51546a(this.f127571j, a5Var.f127571j) && C46238a.m51546a(this.f127572n, a5Var.f127572n) && C46238a.m51546a(this.f127573o, a5Var.f127573o) && C46238a.m51546a(this.f127574p, a5Var.f127574p) && C46238a.m51546a(Integer.valueOf(this.f127575q), Integer.valueOf(a5Var.f127575q)) && C46238a.m51546a(this.f127576r, a5Var.f127576r) && C46238a.m51546a(this.f127577s, a5Var.f127577s) && C46238a.m51546a(this.f127578t, a5Var.f127578t) && C46238a.m51546a(Boolean.valueOf(this.f127579u), Boolean.valueOf(a5Var.f127579u)) && C46238a.m51546a(Integer.valueOf(this.f127580v), Integer.valueOf(a5Var.f127580v)) && C46238a.m51546a(Boolean.valueOf(this.f127581w), Boolean.valueOf(a5Var.f127581w)) && C46238a.m51546a(this.f127582x, a5Var.f127582x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127565d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f127566e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f127567f;
                if (str3 != null) {
                    aVar.mo74323j(11, str3);
                }
                String str4 = this.f127568g;
                if (str4 != null) {
                    aVar.mo74323j(12, str4);
                }
                String str5 = this.f127569h;
                if (str5 != null) {
                    aVar.mo74323j(13, str5);
                }
                String str6 = this.f127570i;
                if (str6 != null) {
                    aVar.mo74323j(14, str6);
                }
                String str7 = this.f127571j;
                if (str7 != null) {
                    aVar.mo74323j(3, str7);
                }
                String str8 = this.f127572n;
                if (str8 != null) {
                    aVar.mo74323j(4, str8);
                }
                String str9 = this.f127573o;
                if (str9 != null) {
                    aVar.mo74323j(9, str9);
                }
                String str10 = this.f127574p;
                if (str10 != null) {
                    aVar.mo74323j(10, str10);
                }
                aVar.mo74318e(5, this.f127575q);
                String str11 = this.f127576r;
                if (str11 != null) {
                    aVar.mo74323j(6, str11);
                }
                C47709y4 y4Var = this.f127577s;
                if (y4Var != null) {
                    aVar.mo74322i(7, y4Var.computeSize());
                    this.f127577s.writeFields(aVar);
                }
                C47715z4 z4Var = this.f127578t;
                if (z4Var != null) {
                    aVar.mo74322i(8, z4Var.computeSize());
                    this.f127578t.writeFields(aVar);
                }
                aVar.mo74314a(15, this.f127579u);
                aVar.mo74318e(16, this.f127580v);
                aVar.mo74314a(17, this.f127581w);
                aVar.mo74320g(18, 8, this.f127582x);
                return 0;
            }
            throw new C52419b("Not all required fields were included: Key");
        } else if (i2 == 1) {
            String str12 = this.f127565d;
            if (str12 != null) {
                i3 = C52418a.m58683j(1, str12) + 0;
            }
            String str13 = this.f127566e;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f127567f;
            if (str14 != null) {
                i3 += C52418a.m58683j(11, str14);
            }
            String str15 = this.f127568g;
            if (str15 != null) {
                i3 += C52418a.m58683j(12, str15);
            }
            String str16 = this.f127569h;
            if (str16 != null) {
                i3 += C52418a.m58683j(13, str16);
            }
            String str17 = this.f127570i;
            if (str17 != null) {
                i3 += C52418a.m58683j(14, str17);
            }
            String str18 = this.f127571j;
            if (str18 != null) {
                i3 += C52418a.m58683j(3, str18);
            }
            String str19 = this.f127572n;
            if (str19 != null) {
                i3 += C52418a.m58683j(4, str19);
            }
            String str20 = this.f127573o;
            if (str20 != null) {
                i3 += C52418a.m58683j(9, str20);
            }
            String str21 = this.f127574p;
            if (str21 != null) {
                i3 += C52418a.m58683j(10, str21);
            }
            int e = i3 + C52418a.m58678e(5, this.f127575q);
            String str22 = this.f127576r;
            if (str22 != null) {
                e += C52418a.m58683j(6, str22);
            }
            C47709y4 y4Var2 = this.f127577s;
            if (y4Var2 != null) {
                e += C52418a.m58682i(7, y4Var2.computeSize());
            }
            C47715z4 z4Var2 = this.f127578t;
            if (z4Var2 != null) {
                e += C52418a.m58682i(8, z4Var2.computeSize());
            }
            return e + C52418a.m58674a(15, this.f127579u) + C52418a.m58678e(16, this.f127580v) + C52418a.m58674a(17, this.f127581w) + C52418a.m58680g(18, 8, this.f127582x);
        } else if (i2 == 2) {
            this.f127582x.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127565d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Key");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47546a5 a5Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    a5Var.f127565d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    a5Var.f127566e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    a5Var.f127571j = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    a5Var.f127572n = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    a5Var.f127575q = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a5Var.f127576r = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C47709y4 y4Var3 = new C47709y4();
                        if (bArr != null && bArr.length > 0) {
                            y4Var3.parseFrom(bArr);
                        }
                        a5Var.f127577s = y4Var3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C47715z4 z4Var3 = new C47715z4();
                        if (bArr2 != null && bArr2.length > 0) {
                            z4Var3.parseFrom(bArr2);
                        }
                        a5Var.f127578t = z4Var3;
                    }
                    return 0;
                case 9:
                    a5Var.f127573o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    a5Var.f127574p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    a5Var.f127567f = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    a5Var.f127568g = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    a5Var.f127569h = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    a5Var.f127570i = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    a5Var.f127579u = aVar3.mo141625c(intValue);
                    return 0;
                case 16:
                    a5Var.f127580v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    a5Var.f127581w = aVar3.mo141625c(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C47697w4 w4Var = new C47697w4();
                        if (bArr3 != null && bArr3.length > 0) {
                            w4Var.parseFrom(bArr3);
                        }
                        a5Var.f127582x.add(w4Var);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
