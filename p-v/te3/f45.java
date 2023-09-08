package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class f45 extends C47465a {

    /* renamed from: d */
    public int f133293d;

    /* renamed from: e */
    public String f133294e;

    /* renamed from: f */
    public String f133295f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof f45)) {
            return false;
        }
        f45 f45 = (f45) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133293d), Integer.valueOf(f45.f133293d)) && C46238a.m51546a(this.f133294e, f45.f133294e) && C46238a.m51546a(this.f133295f, f45.f133295f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133293d);
            String str = this.f133294e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133295f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133293d) + 0;
            String str3 = this.f133294e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f133295f;
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
            f45 f45 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f45.f133293d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                f45.f133294e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f45.f133295f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
