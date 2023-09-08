package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dn3 */
public class C64320dn3 extends C47465a {

    /* renamed from: d */
    public int f182785d;

    /* renamed from: e */
    public String f182786e;

    /* renamed from: f */
    public String f182787f;

    /* renamed from: g */
    public String f182788g;

    /* renamed from: h */
    public String f182789h;

    /* renamed from: i */
    public String f182790i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64320dn3)) {
            return false;
        }
        C64320dn3 dn32 = (C64320dn3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182785d), Integer.valueOf(dn32.f182785d)) && C46238a.m51546a(this.f182786e, dn32.f182786e) && C46238a.m51546a(this.f182787f, dn32.f182787f) && C46238a.m51546a(this.f182788g, dn32.f182788g) && C46238a.m51546a(this.f182789h, dn32.f182789h) && C46238a.m51546a(this.f182790i, dn32.f182790i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182785d);
            String str = this.f182786e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182787f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f182788g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f182789h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f182790i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182785d) + 0;
            String str6 = this.f182786e;
            if (str6 != null) {
                e += C52418a.m58683j(2, str6);
            }
            String str7 = this.f182787f;
            if (str7 != null) {
                e += C52418a.m58683j(3, str7);
            }
            String str8 = this.f182788g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f182789h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f182790i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            C64320dn3 dn32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dn32.f182785d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dn32.f182786e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    dn32.f182787f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    dn32.f182788g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dn32.f182789h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dn32.f182790i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
