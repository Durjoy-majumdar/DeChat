package p821rk;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: rk.t */
public class C48047t extends C47465a {

    /* renamed from: d */
    public String f128894d;

    /* renamed from: e */
    public String f128895e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48047t)) {
            return false;
        }
        C48047t tVar = (C48047t) aVar;
        return C46238a.m51546a(this.f128894d, tVar.f128894d) && C46238a.m51546a(this.f128895e, tVar.f128895e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128894d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f128895e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f128894d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f128895e;
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
            C48047t tVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tVar.f128894d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                tVar.f128895e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
