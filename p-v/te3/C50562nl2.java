package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nl2 */
public class C50562nl2 extends C47465a {

    /* renamed from: d */
    public int f138655d = -1;

    /* renamed from: e */
    public String f138656e;

    /* renamed from: f */
    public String f138657f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50562nl2)) {
            return false;
        }
        C50562nl2 nl22 = (C50562nl2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138655d), Integer.valueOf(nl22.f138655d)) && C46238a.m51546a(this.f138656e, nl22.f138656e) && C46238a.m51546a(this.f138657f, nl22.f138657f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f138656e == null) {
                throw new C52419b("Not all required fields were included: key");
            } else if (this.f138657f != null) {
                aVar.mo74318e(1, this.f138655d);
                String str = this.f138656e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f138657f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: val");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138655d) + 0;
            String str3 = this.f138656e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138657f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f138656e == null) {
                throw new C52419b("Not all required fields were included: key");
            } else if (this.f138657f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: val");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50562nl2 nl22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nl22.f138655d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nl22.f138656e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nl22.f138657f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
