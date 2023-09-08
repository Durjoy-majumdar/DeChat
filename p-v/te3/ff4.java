package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ff4 extends C47465a {

    /* renamed from: d */
    public int f133483d;

    /* renamed from: e */
    public int f133484e;

    /* renamed from: f */
    public String f133485f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ff4)) {
            return false;
        }
        ff4 ff4 = (ff4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133483d), Integer.valueOf(ff4.f133483d)) && C46238a.m51546a(Integer.valueOf(this.f133484e), Integer.valueOf(ff4.f133484e)) && C46238a.m51546a(this.f133485f, ff4.f133485f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133483d);
            aVar.mo74318e(2, this.f133484e);
            String str = this.f133485f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133483d) + 0 + C52418a.m58678e(2, this.f133484e);
            String str2 = this.f133485f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            ff4 ff4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ff4.f133483d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ff4.f133484e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ff4.f133485f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
