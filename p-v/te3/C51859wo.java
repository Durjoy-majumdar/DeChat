package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wo */
public class C51859wo extends C47465a {

    /* renamed from: d */
    public int f144162d;

    /* renamed from: e */
    public int f144163e;

    /* renamed from: f */
    public String f144164f;

    /* renamed from: g */
    public String f144165g;

    /* renamed from: h */
    public String f144166h;

    /* renamed from: i */
    public String f144167i;

    /* renamed from: j */
    public boolean f144168j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51859wo)) {
            return false;
        }
        C51859wo woVar = (C51859wo) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f144162d), Integer.valueOf(woVar.f144162d)) && C46238a.m51546a(Integer.valueOf(this.f144163e), Integer.valueOf(woVar.f144163e)) && C46238a.m51546a(this.f144164f, woVar.f144164f) && C46238a.m51546a(this.f144165g, woVar.f144165g) && C46238a.m51546a(this.f144166h, woVar.f144166h) && C46238a.m51546a(this.f144167i, woVar.f144167i) && C46238a.m51546a(Boolean.valueOf(this.f144168j), Boolean.valueOf(woVar.f144168j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f144162d);
            aVar.mo74318e(2, this.f144163e);
            String str = this.f144164f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f144165g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f144166h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f144167i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            aVar.mo74314a(7, this.f144168j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f144162d) + 0 + C52418a.m58678e(2, this.f144163e);
            String str5 = this.f144164f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f144165g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            String str7 = this.f144166h;
            if (str7 != null) {
                e += C52418a.m58683j(5, str7);
            }
            String str8 = this.f144167i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            return e + C52418a.m58674a(7, this.f144168j);
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
            C51859wo woVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    woVar.f144162d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    woVar.f144163e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    woVar.f144164f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    woVar.f144165g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    woVar.f144166h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    woVar.f144167i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    woVar.f144168j = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
