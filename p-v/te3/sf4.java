package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class sf4 extends C47465a {

    /* renamed from: d */
    public int f141475d;

    /* renamed from: e */
    public int f141476e;

    /* renamed from: f */
    public int f141477f;

    /* renamed from: g */
    public int f141478g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sf4)) {
            return false;
        }
        sf4 sf4 = (sf4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141475d), Integer.valueOf(sf4.f141475d)) && C46238a.m51546a(Integer.valueOf(this.f141476e), Integer.valueOf(sf4.f141476e)) && C46238a.m51546a(Integer.valueOf(this.f141477f), Integer.valueOf(sf4.f141477f)) && C46238a.m51546a(Integer.valueOf(this.f141478g), Integer.valueOf(sf4.f141478g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141475d);
            aVar.mo74318e(2, this.f141476e);
            aVar.mo74318e(3, this.f141477f);
            aVar.mo74318e(4, this.f141478g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f141475d) + 0 + C52418a.m58678e(2, this.f141476e) + C52418a.m58678e(3, this.f141477f) + C52418a.m58678e(4, this.f141478g);
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
                sf4 sf4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    sf4.f141475d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    sf4.f141476e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    sf4.f141477f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    sf4.f141478g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
