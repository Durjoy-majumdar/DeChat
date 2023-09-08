package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b44 extends C47465a {

    /* renamed from: d */
    public String f130936d;

    /* renamed from: e */
    public int f130937e;

    /* renamed from: f */
    public int f130938f;

    /* renamed from: g */
    public String f130939g;

    /* renamed from: h */
    public String f130940h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b44)) {
            return false;
        }
        b44 b44 = (b44) aVar;
        return C46238a.m51546a(this.f130936d, b44.f130936d) && C46238a.m51546a(Integer.valueOf(this.f130937e), Integer.valueOf(b44.f130937e)) && C46238a.m51546a(Integer.valueOf(this.f130938f), Integer.valueOf(b44.f130938f)) && C46238a.m51546a(this.f130939g, b44.f130939g) && C46238a.m51546a(this.f130940h, b44.f130940h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130936d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f130937e);
            aVar.mo74318e(3, this.f130938f);
            String str2 = this.f130939g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f130940h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f130936d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f130937e) + C52418a.m58678e(3, this.f130938f);
            String str5 = this.f130939g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f130940h;
            return str6 != null ? e + C52418a.m58683j(5, str6) : e;
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
            b44 b44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b44.f130936d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                b44.f130937e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b44.f130938f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                b44.f130939g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b44.f130940h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
