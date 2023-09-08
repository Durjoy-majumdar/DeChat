package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m34 */
public class C22512m34 extends C49335eu3 {

    /* renamed from: d */
    public int f64202d;

    /* renamed from: e */
    public String f64203e;

    /* renamed from: f */
    public String f64204f;

    /* renamed from: g */
    public String f64205g;

    /* renamed from: h */
    public String f64206h;

    /* renamed from: i */
    public String f64207i;

    /* renamed from: j */
    public String f64208j;

    /* renamed from: n */
    public String f64209n;

    /* renamed from: o */
    public String f64210o;

    /* renamed from: p */
    public int f64211p;

    /* renamed from: q */
    public int f64212q;

    /* renamed from: r */
    public String f64213r;

    /* renamed from: s */
    public String f64214s;

    /* renamed from: t */
    public String f64215t;

    /* renamed from: u */
    public String f64216u;

    /* renamed from: v */
    public int f64217v;

    /* renamed from: w */
    public String f64218w;

    /* renamed from: x */
    public boolean f64219x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22512m34)) {
            return false;
        }
        C22512m34 m342 = (C22512m34) aVar;
        return C46238a.m51546a(this.BaseResponse, m342.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f64202d), Integer.valueOf(m342.f64202d)) && C46238a.m51546a(this.f64203e, m342.f64203e) && C46238a.m51546a(this.f64204f, m342.f64204f) && C46238a.m51546a(this.f64205g, m342.f64205g) && C46238a.m51546a(this.f64206h, m342.f64206h) && C46238a.m51546a(this.f64207i, m342.f64207i) && C46238a.m51546a(this.f64208j, m342.f64208j) && C46238a.m51546a(this.f64209n, m342.f64209n) && C46238a.m51546a(this.f64210o, m342.f64210o) && C46238a.m51546a(Integer.valueOf(this.f64211p), Integer.valueOf(m342.f64211p)) && C46238a.m51546a(Integer.valueOf(this.f64212q), Integer.valueOf(m342.f64212q)) && C46238a.m51546a(this.f64213r, m342.f64213r) && C46238a.m51546a(this.f64214s, m342.f64214s) && C46238a.m51546a(this.f64215t, m342.f64215t) && C46238a.m51546a(this.f64216u, m342.f64216u) && C46238a.m51546a(Integer.valueOf(this.f64217v), Integer.valueOf(m342.f64217v)) && C46238a.m51546a(this.f64218w, m342.f64218w) && C46238a.m51546a(Boolean.valueOf(this.f64219x), Boolean.valueOf(m342.f64219x));
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
                aVar.mo74318e(2, this.f64202d);
                String str = this.f64203e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f64204f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f64205g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f64206h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f64207i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f64208j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f64209n;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                String str8 = this.f64210o;
                if (str8 != null) {
                    aVar.mo74323j(10, str8);
                }
                aVar.mo74318e(11, this.f64211p);
                aVar.mo74318e(12, this.f64212q);
                String str9 = this.f64213r;
                if (str9 != null) {
                    aVar.mo74323j(13, str9);
                }
                String str10 = this.f64214s;
                if (str10 != null) {
                    aVar.mo74323j(14, str10);
                }
                String str11 = this.f64215t;
                if (str11 != null) {
                    aVar.mo74323j(19, str11);
                }
                String str12 = this.f64216u;
                if (str12 != null) {
                    aVar.mo74323j(21, str12);
                }
                aVar.mo74318e(22, this.f64217v);
                String str13 = this.f64218w;
                if (str13 != null) {
                    aVar.mo74323j(23, str13);
                }
                aVar.mo74314a(24, this.f64219x);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f64202d);
            String str14 = this.f64203e;
            if (str14 != null) {
                e += C52418a.m58683j(3, str14);
            }
            String str15 = this.f64204f;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f64205g;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f64206h;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f64207i;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            String str19 = this.f64208j;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            String str20 = this.f64209n;
            if (str20 != null) {
                e += C52418a.m58683j(9, str20);
            }
            String str21 = this.f64210o;
            if (str21 != null) {
                e += C52418a.m58683j(10, str21);
            }
            int e2 = e + C52418a.m58678e(11, this.f64211p) + C52418a.m58678e(12, this.f64212q);
            String str22 = this.f64213r;
            if (str22 != null) {
                e2 += C52418a.m58683j(13, str22);
            }
            String str23 = this.f64214s;
            if (str23 != null) {
                e2 += C52418a.m58683j(14, str23);
            }
            String str24 = this.f64215t;
            if (str24 != null) {
                e2 += C52418a.m58683j(19, str24);
            }
            String str25 = this.f64216u;
            if (str25 != null) {
                e2 += C52418a.m58683j(21, str25);
            }
            int e3 = e2 + C52418a.m58678e(22, this.f64217v);
            String str26 = this.f64218w;
            if (str26 != null) {
                e3 += C52418a.m58683j(23, str26);
            }
            return e3 + C52418a.m58674a(24, this.f64219x);
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
            C22512m34 m342 = objArr[1];
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
                        m342.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    m342.f64202d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    m342.f64203e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    m342.f64204f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m342.f64205g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m342.f64206h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    m342.f64207i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    m342.f64208j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    m342.f64209n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    m342.f64210o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    m342.f64211p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    m342.f64212q = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    m342.f64213r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    m342.f64214s = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    m342.f64215t = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    m342.f64216u = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    m342.f64217v = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    m342.f64218w = aVar3.mo141633k(intValue);
                    return 0;
                case 24:
                    m342.f64219x = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
