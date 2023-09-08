package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class c65 extends C47465a {

    /* renamed from: d */
    public int f182417d;

    /* renamed from: e */
    public int f182418e;

    /* renamed from: f */
    public int f182419f;

    /* renamed from: g */
    public int f182420g;

    /* renamed from: h */
    public int f182421h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof c65)) {
            return false;
        }
        c65 c65 = (c65) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182417d), Integer.valueOf(c65.f182417d)) && C46238a.m51546a(Integer.valueOf(this.f182418e), Integer.valueOf(c65.f182418e)) && C46238a.m51546a(Integer.valueOf(this.f182419f), Integer.valueOf(c65.f182419f)) && C46238a.m51546a(Integer.valueOf(this.f182420g), Integer.valueOf(c65.f182420g)) && C46238a.m51546a(Integer.valueOf(this.f182421h), Integer.valueOf(c65.f182421h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182417d);
            aVar.mo74318e(2, this.f182418e);
            aVar.mo74318e(3, this.f182419f);
            aVar.mo74318e(4, this.f182420g);
            aVar.mo74318e(5, this.f182421h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182417d) + 0 + C52418a.m58678e(2, this.f182418e) + C52418a.m58678e(3, this.f182419f) + C52418a.m58678e(4, this.f182420g) + C52418a.m58678e(5, this.f182421h);
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
                c65 c65 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    c65.f182417d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    c65.f182418e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    c65.f182419f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    c65.f182420g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    c65.f182421h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
