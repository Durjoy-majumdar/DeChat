package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class s94 extends C47465a {

    /* renamed from: d */
    public String f185389d;

    /* renamed from: e */
    public String f185390e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof s94)) {
            return false;
        }
        s94 s94 = (s94) aVar;
        return C46238a.m51546a(this.f185389d, s94.f185389d) && C46238a.m51546a(this.f185390e, s94.f185390e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185389d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185390e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185389d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185390e;
            return str4 != null ? i2 + C52418a.m58683j(2, str4) : i2;
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
            s94 s94 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s94.f185389d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                s94.f185390e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
