package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class u94 extends C47465a {

    /* renamed from: d */
    public String f142688d;

    /* renamed from: e */
    public boolean f142689e;

    /* renamed from: f */
    public boolean f142690f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u94)) {
            return false;
        }
        u94 u94 = (u94) aVar;
        return C46238a.m51546a(this.f142688d, u94.f142688d) && C46238a.m51546a(Boolean.valueOf(this.f142689e), Boolean.valueOf(u94.f142689e)) && C46238a.m51546a(Boolean.valueOf(this.f142690f), Boolean.valueOf(u94.f142690f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142688d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74314a(2, this.f142689e);
            aVar.mo74314a(3, this.f142690f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f142688d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58674a(2, this.f142689e) + C52418a.m58674a(3, this.f142690f);
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
            u94 u94 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u94.f142688d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u94.f142689e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                u94.f142690f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
