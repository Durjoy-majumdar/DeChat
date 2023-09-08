package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class j05 extends C47465a {

    /* renamed from: d */
    public int f135799d;

    /* renamed from: e */
    public String f135800e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof j05)) {
            return false;
        }
        j05 j05 = (j05) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135799d), Integer.valueOf(j05.f135799d)) && C46238a.m51546a(this.f135800e, j05.f135800e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135800e != null) {
                aVar.mo74318e(1, this.f135799d);
                String str = this.f135800e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: MD5");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135799d) + 0;
            String str2 = this.f135800e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135800e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MD5");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            j05 j05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j05.f135799d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                j05.f135800e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
