package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class k85 extends C47465a {

    /* renamed from: d */
    public int f136616d;

    /* renamed from: e */
    public String f136617e;

    /* renamed from: f */
    public String f136618f;

    /* renamed from: g */
    public String f136619g;

    /* renamed from: h */
    public String f136620h;

    /* renamed from: i */
    public String f136621i;

    /* renamed from: j */
    public int f136622j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k85)) {
            return false;
        }
        k85 k85 = (k85) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f136616d), Integer.valueOf(k85.f136616d)) && C46238a.m51546a(this.f136617e, k85.f136617e) && C46238a.m51546a(this.f136618f, k85.f136618f) && C46238a.m51546a(this.f136619g, k85.f136619g) && C46238a.m51546a(this.f136620h, k85.f136620h) && C46238a.m51546a(this.f136621i, k85.f136621i) && C46238a.m51546a(Integer.valueOf(this.f136622j), Integer.valueOf(k85.f136622j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f136616d);
            String str = this.f136617e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f136618f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f136619g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f136620h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f136621i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            aVar.mo74318e(7, this.f136622j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f136616d) + 0;
            String str6 = this.f136617e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f136618f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f136619g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f136620h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f136621i;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            return e + C52418a.m58678e(7, this.f136622j);
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
            k85 k85 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    k85.f136616d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    k85.f136617e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    k85.f136618f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    k85.f136619g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    k85.f136620h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    k85.f136621i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    k85.f136622j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
