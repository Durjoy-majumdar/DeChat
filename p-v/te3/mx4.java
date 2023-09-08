package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mx4 extends C47465a {

    /* renamed from: d */
    public String f138274d;

    /* renamed from: e */
    public String f138275e;

    /* renamed from: f */
    public int f138276f;

    /* renamed from: g */
    public String f138277g;

    /* renamed from: h */
    public String f138278h;

    /* renamed from: i */
    public String f138279i;

    /* renamed from: j */
    public String f138280j;

    /* renamed from: n */
    public String f138281n;

    /* renamed from: o */
    public String f138282o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mx4)) {
            return false;
        }
        mx4 mx4 = (mx4) aVar;
        return C46238a.m51546a(this.f138274d, mx4.f138274d) && C46238a.m51546a(this.f138275e, mx4.f138275e) && C46238a.m51546a(Integer.valueOf(this.f138276f), Integer.valueOf(mx4.f138276f)) && C46238a.m51546a(this.f138277g, mx4.f138277g) && C46238a.m51546a(this.f138278h, mx4.f138278h) && C46238a.m51546a(this.f138279i, mx4.f138279i) && C46238a.m51546a(this.f138280j, mx4.f138280j) && C46238a.m51546a(this.f138281n, mx4.f138281n) && C46238a.m51546a(this.f138282o, mx4.f138282o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138274d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f138275e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f138276f);
            String str3 = this.f138277g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f138278h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f138279i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f138280j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f138281n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f138282o;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            return 0;
        } else if (i == 1) {
            String str9 = this.f138274d;
            if (str9 != null) {
                i2 = 0 + C52418a.m58683j(1, str9);
            }
            String str10 = this.f138275e;
            if (str10 != null) {
                i2 += C52418a.m58683j(2, str10);
            }
            int e = i2 + C52418a.m58678e(3, this.f138276f);
            String str11 = this.f138277g;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f138278h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f138279i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            String str14 = this.f138280j;
            if (str14 != null) {
                e += C52418a.m58683j(7, str14);
            }
            String str15 = this.f138281n;
            if (str15 != null) {
                e += C52418a.m58683j(8, str15);
            }
            String str16 = this.f138282o;
            return str16 != null ? e + C52418a.m58683j(9, str16) : e;
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
            mx4 mx4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mx4.f138274d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    mx4.f138275e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    mx4.f138276f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    mx4.f138277g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    mx4.f138278h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    mx4.f138279i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    mx4.f138280j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    mx4.f138281n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    mx4.f138282o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
