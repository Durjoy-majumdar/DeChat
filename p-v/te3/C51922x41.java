package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.x41 */
public class C51922x41 extends C47465a {

    /* renamed from: d */
    public int f144442d;

    /* renamed from: e */
    public String f144443e;

    /* renamed from: f */
    public String f144444f;

    /* renamed from: g */
    public String f144445g;

    /* renamed from: h */
    public String f144446h;

    /* renamed from: i */
    public String f144447i;

    /* renamed from: j */
    public boolean f144448j;

    /* renamed from: n */
    public String f144449n;

    /* renamed from: o */
    public String f144450o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51922x41)) {
            return false;
        }
        C51922x41 x412 = (C51922x41) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144442d), Integer.valueOf(x412.f144442d)) && C46238a.m51546a(this.f144443e, x412.f144443e) && C46238a.m51546a(this.f144444f, x412.f144444f) && C46238a.m51546a(this.f144445g, x412.f144445g) && C46238a.m51546a(this.f144446h, x412.f144446h) && C46238a.m51546a(this.f144447i, x412.f144447i) && C46238a.m51546a(Boolean.valueOf(this.f144448j), Boolean.valueOf(x412.f144448j)) && C46238a.m51546a(this.f144449n, x412.f144449n) && C46238a.m51546a(this.f144450o, x412.f144450o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144442d);
            String str = this.f144443e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f144444f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f144445g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144446h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f144447i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74314a(7, this.f144448j);
            String str6 = this.f144449n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            String str7 = this.f144450o;
            if (str7 != null) {
                aVar.mo74323j(9, str7);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144442d) + 0;
            String str8 = this.f144443e;
            if (str8 != null) {
                e += C52418a.m58683j(2, str8);
            }
            String str9 = this.f144444f;
            if (str9 != null) {
                e += C52418a.m58683j(3, str9);
            }
            String str10 = this.f144445g;
            if (str10 != null) {
                e += C52418a.m58683j(4, str10);
            }
            String str11 = this.f144446h;
            if (str11 != null) {
                e += C52418a.m58683j(5, str11);
            }
            String str12 = this.f144447i;
            if (str12 != null) {
                e += C52418a.m58683j(6, str12);
            }
            int a = e + C52418a.m58674a(7, this.f144448j);
            String str13 = this.f144449n;
            if (str13 != null) {
                a += C52418a.m58683j(8, str13);
            }
            String str14 = this.f144450o;
            return str14 != null ? a + C52418a.m58683j(9, str14) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51922x41 x412 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    x412.f144442d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    x412.f144443e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    x412.f144444f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    x412.f144445g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    x412.f144446h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    x412.f144447i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    x412.f144448j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    x412.f144449n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    x412.f144450o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
