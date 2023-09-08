package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w93 */
public class C101860w93 extends C47465a {

    /* renamed from: d */
    public int f299719d;

    /* renamed from: e */
    public String f299720e;

    /* renamed from: f */
    public String f299721f;

    /* renamed from: g */
    public String f299722g;

    /* renamed from: h */
    public String f299723h;

    /* renamed from: i */
    public String f299724i;

    /* renamed from: j */
    public String f299725j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101860w93)) {
            return false;
        }
        C101860w93 w932 = (C101860w93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299719d), Integer.valueOf(w932.f299719d)) && C46238a.m51546a(this.f299720e, w932.f299720e) && C46238a.m51546a(this.f299721f, w932.f299721f) && C46238a.m51546a(this.f299722g, w932.f299722g) && C46238a.m51546a(this.f299723h, w932.f299723h) && C46238a.m51546a(this.f299724i, w932.f299724i) && C46238a.m51546a(this.f299725j, w932.f299725j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299719d);
            String str = this.f299720e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f299721f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f299722g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f299723h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f299724i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f299725j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299719d) + 0;
            String str7 = this.f299720e;
            if (str7 != null) {
                e += C52418a.m58683j(2, str7);
            }
            String str8 = this.f299721f;
            if (str8 != null) {
                e += C52418a.m58683j(3, str8);
            }
            String str9 = this.f299722g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f299723h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f299724i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f299725j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            C101860w93 w932 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w932.f299719d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    w932.f299720e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    w932.f299721f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    w932.f299722g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    w932.f299723h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w932.f299724i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    w932.f299725j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
