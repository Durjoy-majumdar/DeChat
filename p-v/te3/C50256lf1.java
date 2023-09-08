package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lf1 */
public class C50256lf1 extends C47465a {

    /* renamed from: d */
    public int f137383d;

    /* renamed from: e */
    public int f137384e;

    /* renamed from: f */
    public int f137385f;

    /* renamed from: g */
    public int f137386g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50256lf1)) {
            return false;
        }
        C50256lf1 lf12 = (C50256lf1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137383d), Integer.valueOf(lf12.f137383d)) && C46238a.m51546a(Integer.valueOf(this.f137384e), Integer.valueOf(lf12.f137384e)) && C46238a.m51546a(Integer.valueOf(this.f137385f), Integer.valueOf(lf12.f137385f)) && C46238a.m51546a(Integer.valueOf(this.f137386g), Integer.valueOf(lf12.f137386g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137383d);
            aVar.mo74318e(2, this.f137384e);
            aVar.mo74318e(3, this.f137385f);
            aVar.mo74318e(4, this.f137386g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f137383d) + 0 + C52418a.m58678e(2, this.f137384e) + C52418a.m58678e(3, this.f137385f) + C52418a.m58678e(4, this.f137386g);
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
                C50256lf1 lf12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    lf12.f137383d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    lf12.f137384e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    lf12.f137385f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    lf12.f137386g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
