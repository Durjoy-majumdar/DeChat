package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.n */
public class C47533n extends C47465a {

    /* renamed from: d */
    public int f127527d;

    /* renamed from: e */
    public int f127528e;

    /* renamed from: f */
    public String f127529f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47533n)) {
            return false;
        }
        C47533n nVar = (C47533n) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127527d), Integer.valueOf(nVar.f127527d)) && C46238a.m51546a(Integer.valueOf(this.f127528e), Integer.valueOf(nVar.f127528e)) && C46238a.m51546a(this.f127529f, nVar.f127529f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127529f != null) {
                aVar.mo74318e(1, this.f127527d);
                aVar.mo74318e(2, this.f127528e);
                String str = this.f127529f;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127527d) + 0 + C52418a.m58678e(2, this.f127528e);
            String str2 = this.f127529f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127529f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47533n nVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nVar.f127527d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                nVar.f127528e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nVar.f127529f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
