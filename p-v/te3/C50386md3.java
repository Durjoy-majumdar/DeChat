package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.md3 */
public class C50386md3 extends C47465a {

    /* renamed from: d */
    public String f137960d;

    /* renamed from: e */
    public String f137961e;

    /* renamed from: f */
    public boolean f137962f;

    /* renamed from: g */
    public boolean f137963g;

    /* renamed from: h */
    public String f137964h;

    /* renamed from: i */
    public String f137965i;

    /* renamed from: j */
    public String f137966j;

    /* renamed from: n */
    public String f137967n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50386md3)) {
            return false;
        }
        C50386md3 md32 = (C50386md3) aVar;
        return C46238a.m51546a(this.f137960d, md32.f137960d) && C46238a.m51546a(this.f137961e, md32.f137961e) && C46238a.m51546a(Boolean.valueOf(this.f137962f), Boolean.valueOf(md32.f137962f)) && C46238a.m51546a(Boolean.valueOf(this.f137963g), Boolean.valueOf(md32.f137963g)) && C46238a.m51546a(this.f137964h, md32.f137964h) && C46238a.m51546a(this.f137965i, md32.f137965i) && C46238a.m51546a(this.f137966j, md32.f137966j) && C46238a.m51546a(this.f137967n, md32.f137967n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137960d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137961e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74314a(3, this.f137962f);
            aVar.mo74314a(4, this.f137963g);
            String str3 = this.f137964h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f137965i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f137966j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f137967n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f137960d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f137961e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int a = i2 + C52418a.m58674a(3, this.f137962f) + C52418a.m58674a(4, this.f137963g);
            String str9 = this.f137964h;
            if (str9 != null) {
                a += C52418a.m58683j(5, str9);
            }
            String str10 = this.f137965i;
            if (str10 != null) {
                a += C52418a.m58683j(6, str10);
            }
            String str11 = this.f137966j;
            if (str11 != null) {
                a += C52418a.m58683j(7, str11);
            }
            String str12 = this.f137967n;
            return str12 != null ? a + C52418a.m58683j(8, str12) : a;
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
            C50386md3 md32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    md32.f137960d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    md32.f137961e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    md32.f137962f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    md32.f137963g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    md32.f137964h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    md32.f137965i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    md32.f137966j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    md32.f137967n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
