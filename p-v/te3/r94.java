package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class r94 extends C47465a {

    /* renamed from: d */
    public int f140778d;

    /* renamed from: e */
    public int f140779e;

    /* renamed from: f */
    public int f140780f;

    /* renamed from: g */
    public int f140781g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof r94)) {
            return false;
        }
        r94 r94 = (r94) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140778d), Integer.valueOf(r94.f140778d)) && C46238a.m51546a(Integer.valueOf(this.f140779e), Integer.valueOf(r94.f140779e)) && C46238a.m51546a(Integer.valueOf(this.f140780f), Integer.valueOf(r94.f140780f)) && C46238a.m51546a(Integer.valueOf(this.f140781g), Integer.valueOf(r94.f140781g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140778d);
            aVar.mo74318e(2, this.f140779e);
            aVar.mo74318e(3, this.f140780f);
            aVar.mo74318e(4, this.f140781g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f140778d) + 0 + C52418a.m58678e(2, this.f140779e) + C52418a.m58678e(3, this.f140780f) + C52418a.m58678e(4, this.f140781g);
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
                r94 r94 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    r94.f140778d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    r94.f140779e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    r94.f140780f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    r94.f140781g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
