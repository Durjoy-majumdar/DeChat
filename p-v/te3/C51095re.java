package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.re */
public class C51095re extends C47465a {

    /* renamed from: d */
    public String f140851d;

    /* renamed from: e */
    public String f140852e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51095re)) {
            return false;
        }
        C51095re reVar = (C51095re) aVar;
        return C46238a.m51546a(this.f140851d, reVar.f140851d) && C46238a.m51546a(this.f140852e, reVar.f140852e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140851d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140852e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f140851d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140852e;
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
            C51095re reVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                reVar.f140851d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                reVar.f140852e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
