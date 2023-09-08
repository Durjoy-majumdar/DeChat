package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lg3 */
public class C64524lg3 extends C47465a {

    /* renamed from: d */
    public String f184103d;

    /* renamed from: e */
    public String f184104e;

    /* renamed from: f */
    public int f184105f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64524lg3)) {
            return false;
        }
        C64524lg3 lg32 = (C64524lg3) aVar;
        return C46238a.m51546a(this.f184103d, lg32.f184103d) && C46238a.m51546a(this.f184104e, lg32.f184104e) && C46238a.m51546a(Integer.valueOf(this.f184105f), Integer.valueOf(lg32.f184105f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184103d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184104e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f184105f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f184103d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f184104e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f184105f);
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
            C64524lg3 lg32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lg32.f184103d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                lg32.f184104e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lg32.f184105f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
