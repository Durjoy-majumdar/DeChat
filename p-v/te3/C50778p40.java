package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.p40 */
public class C50778p40 extends C47465a {

    /* renamed from: d */
    public int f139563d;

    /* renamed from: e */
    public int f139564e;

    /* renamed from: f */
    public int f139565f;

    /* renamed from: g */
    public int f139566g;

    /* renamed from: h */
    public int f139567h;

    /* renamed from: i */
    public int f139568i;

    /* renamed from: j */
    public int f139569j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50778p40)) {
            return false;
        }
        C50778p40 p402 = (C50778p40) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139563d), Integer.valueOf(p402.f139563d)) && C46238a.m51546a(Integer.valueOf(this.f139564e), Integer.valueOf(p402.f139564e)) && C46238a.m51546a(Integer.valueOf(this.f139565f), Integer.valueOf(p402.f139565f)) && C46238a.m51546a(Integer.valueOf(this.f139566g), Integer.valueOf(p402.f139566g)) && C46238a.m51546a(Integer.valueOf(this.f139567h), Integer.valueOf(p402.f139567h)) && C46238a.m51546a(Integer.valueOf(this.f139568i), Integer.valueOf(p402.f139568i)) && C46238a.m51546a(Integer.valueOf(this.f139569j), Integer.valueOf(p402.f139569j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139563d);
            aVar.mo74318e(2, this.f139564e);
            aVar.mo74318e(3, this.f139565f);
            aVar.mo74318e(4, this.f139566g);
            aVar.mo74318e(5, this.f139567h);
            aVar.mo74318e(6, this.f139568i);
            aVar.mo74318e(7, this.f139569j);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f139563d) + 0 + C52418a.m58678e(2, this.f139564e) + C52418a.m58678e(3, this.f139565f) + C52418a.m58678e(4, this.f139566g) + C52418a.m58678e(5, this.f139567h) + C52418a.m58678e(6, this.f139568i) + C52418a.m58678e(7, this.f139569j);
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
                C50778p40 p402 = objArr[1];
                int intValue = objArr[2].intValue();
                switch (intValue) {
                    case 1:
                        p402.f139563d = aVar3.mo141629g(intValue);
                        return 0;
                    case 2:
                        p402.f139564e = aVar3.mo141629g(intValue);
                        return 0;
                    case 3:
                        p402.f139565f = aVar3.mo141629g(intValue);
                        return 0;
                    case 4:
                        p402.f139566g = aVar3.mo141629g(intValue);
                        return 0;
                    case 5:
                        p402.f139567h = aVar3.mo141629g(intValue);
                        return 0;
                    case 6:
                        p402.f139568i = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        p402.f139569j = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        return -1;
                }
            }
        }
    }
}
