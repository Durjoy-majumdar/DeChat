package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lp4 extends C47465a {

    /* renamed from: d */
    public String f332170d;

    /* renamed from: e */
    public String f332171e;

    /* renamed from: f */
    public int f332172f;

    /* renamed from: g */
    public int f332173g;

    /* renamed from: h */
    public long f332174h;

    /* renamed from: i */
    public long f332175i;

    /* renamed from: j */
    public long f332176j;

    /* renamed from: n */
    public long f332177n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lp4)) {
            return false;
        }
        lp4 lp4 = (lp4) aVar;
        return C46238a.m51546a(this.f332170d, lp4.f332170d) && C46238a.m51546a(this.f332171e, lp4.f332171e) && C46238a.m51546a(Integer.valueOf(this.f332172f), Integer.valueOf(lp4.f332172f)) && C46238a.m51546a(Integer.valueOf(this.f332173g), Integer.valueOf(lp4.f332173g)) && C46238a.m51546a(Long.valueOf(this.f332174h), Long.valueOf(lp4.f332174h)) && C46238a.m51546a(Long.valueOf(this.f332175i), Long.valueOf(lp4.f332175i)) && C46238a.m51546a(Long.valueOf(this.f332176j), Long.valueOf(lp4.f332176j)) && C46238a.m51546a(Long.valueOf(this.f332177n), Long.valueOf(lp4.f332177n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f332170d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f332171e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f332172f);
            aVar.mo74318e(4, this.f332173g);
            aVar.mo74321h(5, this.f332174h);
            aVar.mo74321h(6, this.f332175i);
            aVar.mo74321h(7, this.f332176j);
            aVar.mo74321h(8, this.f332177n);
            return 0;
        } else if (i == 1) {
            String str3 = this.f332170d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f332171e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f332172f) + C52418a.m58678e(4, this.f332173g) + C52418a.m58681h(5, this.f332174h) + C52418a.m58681h(6, this.f332175i) + C52418a.m58681h(7, this.f332176j) + C52418a.m58681h(8, this.f332177n);
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
            lp4 lp4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lp4.f332170d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lp4.f332171e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lp4.f332172f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    lp4.f332173g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lp4.f332174h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    lp4.f332175i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    lp4.f332176j = aVar3.mo141631i(intValue);
                    return 0;
                case 8:
                    lp4.f332177n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
