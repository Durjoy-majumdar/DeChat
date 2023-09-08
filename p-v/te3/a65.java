package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class a65 extends C47465a {

    /* renamed from: d */
    public boolean f130333d;

    /* renamed from: e */
    public int f130334e;

    /* renamed from: f */
    public double f130335f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof a65)) {
            return false;
        }
        a65 a65 = (a65) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f130333d), Boolean.valueOf(a65.f130333d)) && C46238a.m51546a(Integer.valueOf(this.f130334e), Integer.valueOf(a65.f130334e)) && C46238a.m51546a(Double.valueOf(this.f130335f), Double.valueOf(a65.f130335f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f130333d);
            aVar.mo74318e(2, this.f130334e);
            aVar.mo74316c(3, this.f130335f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f130333d) + 0 + C52418a.m58678e(2, this.f130334e) + C52418a.m58676c(3, this.f130335f);
        } else {
            if (i == 2) {
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
                a65 a65 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    a65.f130333d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 2) {
                    a65.f130334e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    a65.f130335f = aVar3.mo141627e(intValue);
                    return 0;
                }
            }
        }
    }
}
