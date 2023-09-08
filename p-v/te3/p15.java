package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class p15 extends C47465a {

    /* renamed from: d */
    public String f139531d;

    /* renamed from: e */
    public String f139532e;

    /* renamed from: f */
    public int f139533f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof p15)) {
            return false;
        }
        p15 p15 = (p15) aVar;
        return C46238a.m51546a(this.f139531d, p15.f139531d) && C46238a.m51546a(this.f139532e, p15.f139532e) && C46238a.m51546a(Integer.valueOf(this.f139533f), Integer.valueOf(p15.f139533f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139531d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f139532e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f139532e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f139533f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Text");
            }
        } else if (i == 1) {
            String str3 = this.f139531d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f139532e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f139533f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139531d == null) {
                throw new C52419b("Not all required fields were included: Talker");
            } else if (this.f139532e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Text");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            p15 p15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                p15.f139531d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                p15.f139532e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                p15.f139533f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
