package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nr4 extends C47465a {

    /* renamed from: d */
    public int f184549d;

    /* renamed from: e */
    public int f184550e;

    /* renamed from: f */
    public int f184551f;

    /* renamed from: g */
    public int f184552g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nr4)) {
            return false;
        }
        nr4 nr4 = (nr4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184549d), Integer.valueOf(nr4.f184549d)) && C46238a.m51546a(Integer.valueOf(this.f184550e), Integer.valueOf(nr4.f184550e)) && C46238a.m51546a(Integer.valueOf(this.f184551f), Integer.valueOf(nr4.f184551f)) && C46238a.m51546a(Integer.valueOf(this.f184552g), Integer.valueOf(nr4.f184552g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184549d);
            aVar.mo74318e(2, this.f184550e);
            aVar.mo74318e(3, this.f184551f);
            aVar.mo74318e(4, this.f184552g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184549d) + 0 + C52418a.m58678e(2, this.f184550e) + C52418a.m58678e(3, this.f184551f) + C52418a.m58678e(4, this.f184552g);
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
                nr4 nr4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    nr4.f184549d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    nr4.f184550e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    nr4.f184551f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    nr4.f184552g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
