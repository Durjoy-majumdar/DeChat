package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class fa4 extends C47465a {

    /* renamed from: d */
    public long f183102d;

    /* renamed from: e */
    public int f183103e;

    /* renamed from: f */
    public int f183104f;

    /* renamed from: g */
    public boolean f183105g;

    /* renamed from: h */
    public boolean f183106h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof fa4)) {
            return false;
        }
        fa4 fa4 = (fa4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183102d), Long.valueOf(fa4.f183102d)) && C46238a.m51546a(Integer.valueOf(this.f183103e), Integer.valueOf(fa4.f183103e)) && C46238a.m51546a(Integer.valueOf(this.f183104f), Integer.valueOf(fa4.f183104f)) && C46238a.m51546a(Boolean.valueOf(this.f183105g), Boolean.valueOf(fa4.f183105g)) && C46238a.m51546a(Boolean.valueOf(this.f183106h), Boolean.valueOf(fa4.f183106h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183102d);
            aVar.mo74318e(2, this.f183103e);
            aVar.mo74318e(3, this.f183104f);
            aVar.mo74314a(4, this.f183105g);
            aVar.mo74314a(5, this.f183106h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f183102d) + 0 + C52418a.m58678e(2, this.f183103e) + C52418a.m58678e(3, this.f183104f) + C52418a.m58674a(4, this.f183105g) + C52418a.m58674a(5, this.f183106h);
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
                fa4 fa4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    fa4.f183102d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    fa4.f183103e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    fa4.f183104f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    fa4.f183105g = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    fa4.f183106h = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
