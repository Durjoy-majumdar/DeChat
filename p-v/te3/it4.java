package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class it4 extends C47465a {

    /* renamed from: d */
    public int f135657d;

    /* renamed from: e */
    public int f135658e;

    /* renamed from: f */
    public int f135659f;

    /* renamed from: g */
    public int f135660g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof it4)) {
            return false;
        }
        it4 it4 = (it4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135657d), Integer.valueOf(it4.f135657d)) && C46238a.m51546a(Integer.valueOf(this.f135658e), Integer.valueOf(it4.f135658e)) && C46238a.m51546a(Integer.valueOf(this.f135659f), Integer.valueOf(it4.f135659f)) && C46238a.m51546a(Integer.valueOf(this.f135660g), Integer.valueOf(it4.f135660g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135657d);
            aVar.mo74318e(2, this.f135658e);
            aVar.mo74318e(3, this.f135659f);
            aVar.mo74318e(4, this.f135660g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135657d) + 0 + C52418a.m58678e(2, this.f135658e) + C52418a.m58678e(3, this.f135659f) + C52418a.m58678e(4, this.f135660g);
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
                it4 it4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    it4.f135657d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    it4.f135658e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    it4.f135659f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    it4.f135660g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
