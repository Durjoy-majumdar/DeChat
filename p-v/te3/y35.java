package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class y35 extends C47465a {

    /* renamed from: d */
    public int f145102d;

    /* renamed from: e */
    public int f145103e;

    /* renamed from: f */
    public int f145104f;

    /* renamed from: g */
    public int f145105g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof y35)) {
            return false;
        }
        y35 y35 = (y35) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145102d), Integer.valueOf(y35.f145102d)) && C46238a.m51546a(Integer.valueOf(this.f145103e), Integer.valueOf(y35.f145103e)) && C46238a.m51546a(Integer.valueOf(this.f145104f), Integer.valueOf(y35.f145104f)) && C46238a.m51546a(Integer.valueOf(this.f145105g), Integer.valueOf(y35.f145105g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145102d);
            aVar.mo74318e(2, this.f145103e);
            aVar.mo74318e(3, this.f145104f);
            aVar.mo74318e(4, this.f145105g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f145102d) + 0 + C52418a.m58678e(2, this.f145103e) + C52418a.m58678e(3, this.f145104f) + C52418a.m58678e(4, this.f145105g);
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
                y35 y35 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    y35.f145102d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    y35.f145103e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    y35.f145104f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    y35.f145105g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
