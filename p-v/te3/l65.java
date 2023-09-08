package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class l65 extends C47465a {

    /* renamed from: d */
    public String f184041d;

    /* renamed from: e */
    public int f184042e;

    /* renamed from: f */
    public String f184043f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof l65)) {
            return false;
        }
        l65 l65 = (l65) aVar;
        return C46238a.m51546a(this.f184041d, l65.f184041d) && C46238a.m51546a(Integer.valueOf(this.f184042e), Integer.valueOf(l65.f184042e)) && C46238a.m51546a(this.f184043f, l65.f184043f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184041d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f184042e);
            String str2 = this.f184043f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f184041d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f184042e);
            String str4 = this.f184043f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            l65 l65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l65.f184041d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                l65.f184042e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                l65.f184043f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
