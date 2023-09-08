package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b80 */
public class C48820b80 extends C47465a {

    /* renamed from: d */
    public String f131006d;

    /* renamed from: e */
    public String f131007e;

    /* renamed from: f */
    public int f131008f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48820b80)) {
            return false;
        }
        C48820b80 b802 = (C48820b80) aVar;
        return C46238a.m51546a(this.f131006d, b802.f131006d) && C46238a.m51546a(this.f131007e, b802.f131007e) && C46238a.m51546a(Integer.valueOf(this.f131008f), Integer.valueOf(b802.f131008f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131006d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f131007e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f131008f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f131006d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f131007e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f131008f);
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
            C48820b80 b802 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b802.f131006d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                b802.f131007e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                b802.f131008f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
