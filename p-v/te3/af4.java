package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class af4 extends C47465a {

    /* renamed from: d */
    public String f130484d;

    /* renamed from: e */
    public int f130485e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof af4)) {
            return false;
        }
        af4 af4 = (af4) aVar;
        return C46238a.m51546a(this.f130484d, af4.f130484d) && C46238a.m51546a(Integer.valueOf(this.f130485e), Integer.valueOf(af4.f130485e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130484d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f130485e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: ip_str");
        } else if (i == 1) {
            String str2 = this.f130484d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f130485e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130484d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ip_str");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            af4 af4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                af4.f130484d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                af4.f130485e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
