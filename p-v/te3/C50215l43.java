package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l43 */
public class C50215l43 extends C47465a {

    /* renamed from: d */
    public String f137161d;

    /* renamed from: e */
    public int f137162e;

    /* renamed from: f */
    public String f137163f;

    /* renamed from: g */
    public String f137164g;

    /* renamed from: h */
    public String f137165h;

    /* renamed from: i */
    public String f137166i;

    /* renamed from: j */
    public int f137167j;

    /* renamed from: n */
    public int f137168n;

    /* renamed from: o */
    public int f137169o;

    /* renamed from: p */
    public String f137170p;

    /* renamed from: q */
    public String f137171q;

    /* renamed from: r */
    public String f137172r;

    /* renamed from: s */
    public int f137173s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50215l43)) {
            return false;
        }
        C50215l43 l432 = (C50215l43) aVar;
        return C46238a.m51546a(this.f137161d, l432.f137161d) && C46238a.m51546a(Integer.valueOf(this.f137162e), Integer.valueOf(l432.f137162e)) && C46238a.m51546a(this.f137163f, l432.f137163f) && C46238a.m51546a(this.f137164g, l432.f137164g) && C46238a.m51546a(this.f137165h, l432.f137165h) && C46238a.m51546a(this.f137166i, l432.f137166i) && C46238a.m51546a(Integer.valueOf(this.f137167j), Integer.valueOf(l432.f137167j)) && C46238a.m51546a(Integer.valueOf(this.f137168n), Integer.valueOf(l432.f137168n)) && C46238a.m51546a(Integer.valueOf(this.f137169o), Integer.valueOf(l432.f137169o)) && C46238a.m51546a(this.f137170p, l432.f137170p) && C46238a.m51546a(this.f137171q, l432.f137171q) && C46238a.m51546a(this.f137172r, l432.f137172r) && C46238a.m51546a(Integer.valueOf(this.f137173s), Integer.valueOf(l432.f137173s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137161d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f137162e);
            String str2 = this.f137163f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f137164g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f137165h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f137166i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f137167j);
            aVar.mo74318e(8, this.f137168n);
            aVar.mo74318e(9, this.f137169o);
            String str6 = this.f137170p;
            if (str6 != null) {
                aVar.mo74323j(10, str6);
            }
            String str7 = this.f137171q;
            if (str7 != null) {
                aVar.mo74323j(11, str7);
            }
            String str8 = this.f137172r;
            if (str8 != null) {
                aVar.mo74323j(12, str8);
            }
            aVar.mo74318e(13, this.f137173s);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f137161d;
            int j = (str9 != null ? 0 + C52418a.m58683j(1, str9) : 0) + C52418a.m58678e(2, this.f137162e);
            String str10 = this.f137163f;
            if (str10 != null) {
                j += C52418a.m58683j(3, str10);
            }
            String str11 = this.f137164g;
            if (str11 != null) {
                j += C52418a.m58683j(4, str11);
            }
            String str12 = this.f137165h;
            if (str12 != null) {
                j += C52418a.m58683j(5, str12);
            }
            String str13 = this.f137166i;
            if (str13 != null) {
                j += C52418a.m58683j(6, str13);
            }
            int e = j + C52418a.m58678e(7, this.f137167j) + C52418a.m58678e(8, this.f137168n) + C52418a.m58678e(9, this.f137169o);
            String str14 = this.f137170p;
            if (str14 != null) {
                e += C52418a.m58683j(10, str14);
            }
            String str15 = this.f137171q;
            if (str15 != null) {
                e += C52418a.m58683j(11, str15);
            }
            String str16 = this.f137172r;
            if (str16 != null) {
                e += C52418a.m58683j(12, str16);
            }
            return e + C52418a.m58678e(13, this.f137173s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50215l43 l432 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l432.f137161d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    l432.f137162e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    l432.f137163f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l432.f137164g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l432.f137165h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l432.f137166i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    l432.f137167j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    l432.f137168n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    l432.f137169o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    l432.f137170p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    l432.f137171q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    l432.f137172r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    l432.f137173s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
