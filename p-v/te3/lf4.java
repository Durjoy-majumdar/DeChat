package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lf4 extends C47465a {

    /* renamed from: d */
    public String f137391d;

    /* renamed from: e */
    public String f137392e;

    /* renamed from: f */
    public int f137393f;

    /* renamed from: g */
    public int f137394g;

    /* renamed from: h */
    public int f137395h;

    /* renamed from: i */
    public int f137396i;

    /* renamed from: j */
    public int f137397j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lf4)) {
            return false;
        }
        lf4 lf4 = (lf4) aVar;
        return C46238a.m51546a(this.f137391d, lf4.f137391d) && C46238a.m51546a(this.f137392e, lf4.f137392e) && C46238a.m51546a(Integer.valueOf(this.f137393f), Integer.valueOf(lf4.f137393f)) && C46238a.m51546a(Integer.valueOf(this.f137394g), Integer.valueOf(lf4.f137394g)) && C46238a.m51546a(Integer.valueOf(this.f137395h), Integer.valueOf(lf4.f137395h)) && C46238a.m51546a(Integer.valueOf(this.f137396i), Integer.valueOf(lf4.f137396i)) && C46238a.m51546a(Integer.valueOf(this.f137397j), Integer.valueOf(lf4.f137397j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137391d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137392e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f137393f);
            aVar.mo74318e(4, this.f137394g);
            aVar.mo74318e(5, this.f137395h);
            aVar.mo74318e(6, this.f137396i);
            aVar.mo74318e(7, this.f137397j);
            return 0;
        } else if (i == 1) {
            String str3 = this.f137391d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f137392e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f137393f) + C52418a.m58678e(4, this.f137394g) + C52418a.m58678e(5, this.f137395h) + C52418a.m58678e(6, this.f137396i) + C52418a.m58678e(7, this.f137397j);
        } else if (i == 2) {
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
            lf4 lf4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lf4.f137391d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lf4.f137392e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lf4.f137393f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    lf4.f137394g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lf4.f137395h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    lf4.f137396i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    lf4.f137397j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
