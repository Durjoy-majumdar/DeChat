package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.w */
public class C47537w extends C47465a {

    /* renamed from: d */
    public String f127548d;

    /* renamed from: e */
    public int f127549e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47537w)) {
            return false;
        }
        C47537w wVar = (C47537w) aVar;
        return C46238a.m51546a(this.f127548d, wVar.f127548d) && C46238a.m51546a(Integer.valueOf(this.f127549e), Integer.valueOf(wVar.f127549e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127548d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f127549e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i == 1) {
            String str2 = this.f127548d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f127549e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127548d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ID");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47537w wVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wVar.f127548d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                wVar.f127549e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
