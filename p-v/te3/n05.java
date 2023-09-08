package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class n05 extends C47465a {

    /* renamed from: d */
    public int f138318d;

    /* renamed from: e */
    public String f138319e;

    /* renamed from: f */
    public String f138320f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n05)) {
            return false;
        }
        n05 n05 = (n05) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138318d), Integer.valueOf(n05.f138318d)) && C46238a.m51546a(this.f138319e, n05.f138319e) && C46238a.m51546a(this.f138320f, n05.f138320f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138319e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f138320f != null) {
                aVar.mo74318e(1, this.f138318d);
                String str = this.f138319e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f138320f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138318d) + 0;
            String str3 = this.f138319e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138320f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138319e == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f138320f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Content");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            n05 n05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n05.f138318d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                n05.f138319e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                n05.f138320f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
