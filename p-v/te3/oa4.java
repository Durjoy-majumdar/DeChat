package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oa4 extends C47465a {

    /* renamed from: d */
    public int f139068d;

    /* renamed from: e */
    public int f139069e;

    /* renamed from: f */
    public double f139070f;

    /* renamed from: g */
    public double f139071g;

    /* renamed from: h */
    public int f139072h;

    /* renamed from: i */
    public int f139073i;

    /* renamed from: j */
    public String f139074j;

    /* renamed from: n */
    public String f139075n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oa4)) {
            return false;
        }
        oa4 oa4 = (oa4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139068d), Integer.valueOf(oa4.f139068d)) && C46238a.m51546a(Integer.valueOf(this.f139069e), Integer.valueOf(oa4.f139069e)) && C46238a.m51546a(Double.valueOf(this.f139070f), Double.valueOf(oa4.f139070f)) && C46238a.m51546a(Double.valueOf(this.f139071g), Double.valueOf(oa4.f139071g)) && C46238a.m51546a(Integer.valueOf(this.f139072h), Integer.valueOf(oa4.f139072h)) && C46238a.m51546a(Integer.valueOf(this.f139073i), Integer.valueOf(oa4.f139073i)) && C46238a.m51546a(this.f139074j, oa4.f139074j) && C46238a.m51546a(this.f139075n, oa4.f139075n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139068d);
            aVar.mo74318e(2, this.f139069e);
            aVar.mo74316c(3, this.f139070f);
            aVar.mo74316c(4, this.f139071g);
            aVar.mo74318e(5, this.f139072h);
            aVar.mo74318e(6, this.f139073i);
            String str = this.f139074j;
            if (str != null) {
                aVar.mo74323j(7, str);
            }
            String str2 = this.f139075n;
            if (str2 != null) {
                aVar.mo74323j(8, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139068d) + 0 + C52418a.m58678e(2, this.f139069e) + C52418a.m58676c(3, this.f139070f) + C52418a.m58676c(4, this.f139071g) + C52418a.m58678e(5, this.f139072h) + C52418a.m58678e(6, this.f139073i);
            String str3 = this.f139074j;
            if (str3 != null) {
                e += C52418a.m58683j(7, str3);
            }
            String str4 = this.f139075n;
            return str4 != null ? e + C52418a.m58683j(8, str4) : e;
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
            oa4 oa4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oa4.f139068d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oa4.f139069e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oa4.f139070f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    oa4.f139071g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    oa4.f139072h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    oa4.f139073i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    oa4.f139074j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    oa4.f139075n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
