package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class n54 extends C47465a {

    /* renamed from: d */
    public int f138418d;

    /* renamed from: e */
    public String f138419e;

    /* renamed from: f */
    public String f138420f;

    /* renamed from: g */
    public String f138421g;

    /* renamed from: h */
    public String f138422h;

    /* renamed from: i */
    public String f138423i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n54)) {
            return false;
        }
        n54 n54 = (n54) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138418d), Integer.valueOf(n54.f138418d)) && C46238a.m51546a(this.f138419e, n54.f138419e) && C46238a.m51546a(this.f138420f, n54.f138420f) && C46238a.m51546a(this.f138421g, n54.f138421g) && C46238a.m51546a(this.f138422h, n54.f138422h) && C46238a.m51546a(this.f138423i, n54.f138423i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138418d);
            String str = this.f138419e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138420f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f138421g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f138422h;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f138423i;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138418d) + 0;
            String str6 = this.f138419e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f138420f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f138421g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f138422h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f138423i;
            return str10 != null ? e + C52418a.m58683j(7, str10) : e;
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
            n54 n54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n54.f138418d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                n54.f138419e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n54.f138420f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                n54.f138421g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 6) {
                n54.f138422h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 7) {
                return -1;
            } else {
                n54.f138423i = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
