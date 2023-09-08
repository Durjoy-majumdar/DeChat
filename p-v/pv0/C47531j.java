package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.j */
public class C47531j extends C47465a {

    /* renamed from: d */
    public String f127523d;

    /* renamed from: e */
    public int f127524e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47531j)) {
            return false;
        }
        C47531j jVar = (C47531j) aVar;
        return C46238a.m51546a(this.f127523d, jVar.f127523d) && C46238a.m51546a(Integer.valueOf(this.f127524e), Integer.valueOf(jVar.f127524e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127523d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f127524e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i == 1) {
            String str2 = this.f127523d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f127524e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127523d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47531j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jVar.f127523d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                jVar.f127524e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
