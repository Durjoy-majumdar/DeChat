package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class d94 extends C47465a {

    /* renamed from: d */
    public int f132203d;

    /* renamed from: e */
    public int f132204e;

    /* renamed from: f */
    public int f132205f;

    /* renamed from: g */
    public int f132206g;

    /* renamed from: h */
    public int f132207h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof d94)) {
            return false;
        }
        d94 d94 = (d94) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132203d), Integer.valueOf(d94.f132203d)) && C46238a.m51546a(Integer.valueOf(this.f132204e), Integer.valueOf(d94.f132204e)) && C46238a.m51546a(Integer.valueOf(this.f132205f), Integer.valueOf(d94.f132205f)) && C46238a.m51546a(Integer.valueOf(this.f132206g), Integer.valueOf(d94.f132206g)) && C46238a.m51546a(Integer.valueOf(this.f132207h), Integer.valueOf(d94.f132207h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132203d);
            aVar.mo74318e(2, this.f132204e);
            aVar.mo74318e(3, this.f132205f);
            aVar.mo74318e(4, this.f132206g);
            aVar.mo74318e(5, this.f132207h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f132203d) + 0 + C52418a.m58678e(2, this.f132204e) + C52418a.m58678e(3, this.f132205f) + C52418a.m58678e(4, this.f132206g) + C52418a.m58678e(5, this.f132207h);
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
                d94 d94 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    d94.f132203d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    d94.f132204e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    d94.f132205f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    d94.f132206g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    d94.f132207h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
