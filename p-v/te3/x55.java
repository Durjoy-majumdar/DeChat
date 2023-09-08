package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x55 extends C47465a {

    /* renamed from: d */
    public int f186268d;

    /* renamed from: e */
    public int f186269e;

    /* renamed from: f */
    public int f186270f;

    /* renamed from: g */
    public int f186271g;

    /* renamed from: h */
    public int f186272h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x55)) {
            return false;
        }
        x55 x55 = (x55) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186268d), Integer.valueOf(x55.f186268d)) && C46238a.m51546a(Integer.valueOf(this.f186269e), Integer.valueOf(x55.f186269e)) && C46238a.m51546a(Integer.valueOf(this.f186270f), Integer.valueOf(x55.f186270f)) && C46238a.m51546a(Integer.valueOf(this.f186271g), Integer.valueOf(x55.f186271g)) && C46238a.m51546a(Integer.valueOf(this.f186272h), Integer.valueOf(x55.f186272h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186268d);
            aVar.mo74318e(2, this.f186269e);
            aVar.mo74318e(3, this.f186270f);
            aVar.mo74318e(5, this.f186271g);
            aVar.mo74318e(6, this.f186272h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f186268d) + 0 + C52418a.m58678e(2, this.f186269e) + C52418a.m58678e(3, this.f186270f) + C52418a.m58678e(5, this.f186271g) + C52418a.m58678e(6, this.f186272h);
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
                x55 x55 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    x55.f186268d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    x55.f186269e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    x55.f186270f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 5) {
                    x55.f186271g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 6) {
                    return -1;
                } else {
                    x55.f186272h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
