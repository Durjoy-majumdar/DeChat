package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class t85 extends C47465a {

    /* renamed from: d */
    public String f142036d;

    /* renamed from: e */
    public String f142037e;

    /* renamed from: f */
    public int f142038f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t85)) {
            return false;
        }
        t85 t85 = (t85) aVar;
        return C46238a.m51546a(this.f142036d, t85.f142036d) && C46238a.m51546a(this.f142037e, t85.f142037e) && C46238a.m51546a(Integer.valueOf(this.f142038f), Integer.valueOf(t85.f142038f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142036d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: rankid");
            } else if (this.f142037e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f142037e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f142038f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: title");
            }
        } else if (i == 1) {
            String str3 = this.f142036d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f142037e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f142038f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142036d == null) {
                throw new C52419b("Not all required fields were included: rankid");
            } else if (this.f142037e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: title");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            t85 t85 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t85.f142036d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                t85.f142037e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t85.f142038f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
