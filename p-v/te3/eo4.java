package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class eo4 extends C47465a {

    /* renamed from: d */
    public String f133042d;

    /* renamed from: e */
    public int f133043e;

    /* renamed from: f */
    public String f133044f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof eo4)) {
            return false;
        }
        eo4 eo4 = (eo4) aVar;
        return C46238a.m51546a(this.f133042d, eo4.f133042d) && C46238a.m51546a(Integer.valueOf(this.f133043e), Integer.valueOf(eo4.f133043e)) && C46238a.m51546a(this.f133044f, eo4.f133044f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133042d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f133043e);
            String str2 = this.f133044f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f133042d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f133043e);
            String str4 = this.f133044f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            eo4 eo4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eo4.f133042d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                eo4.f133043e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                eo4.f133044f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
