package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ch4 extends C47465a {

    /* renamed from: d */
    public boolean f131729d;

    /* renamed from: e */
    public String f131730e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ch4)) {
            return false;
        }
        ch4 ch4 = (ch4) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f131729d), Boolean.valueOf(ch4.f131729d)) && C46238a.m51546a(this.f131730e, ch4.f131730e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f131729d);
            String str = this.f131730e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f131729d) + 0;
            String str2 = this.f131730e;
            return str2 != null ? a + C52418a.m58683j(2, str2) : a;
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
            ch4 ch4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ch4.f131729d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                ch4.f131730e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}