package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ds4 extends C47465a {

    /* renamed from: d */
    public String f331956d;

    /* renamed from: e */
    public int f331957e;

    /* renamed from: f */
    public boolean f331958f;

    /* renamed from: g */
    public long f331959g;

    /* renamed from: h */
    public long f331960h;

    /* renamed from: i */
    public long f331961i;

    /* renamed from: j */
    public int f331962j;

    /* renamed from: n */
    public long f331963n;

    /* renamed from: o */
    public String f331964o;

    /* renamed from: p */
    public int f331965p;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ds4)) {
            return false;
        }
        ds4 ds4 = (ds4) aVar;
        return C46238a.m51546a(this.f331956d, ds4.f331956d) && C46238a.m51546a(Integer.valueOf(this.f331957e), Integer.valueOf(ds4.f331957e)) && C46238a.m51546a(Boolean.valueOf(this.f331958f), Boolean.valueOf(ds4.f331958f)) && C46238a.m51546a(Long.valueOf(this.f331959g), Long.valueOf(ds4.f331959g)) && C46238a.m51546a(Long.valueOf(this.f331960h), Long.valueOf(ds4.f331960h)) && C46238a.m51546a(Long.valueOf(this.f331961i), Long.valueOf(ds4.f331961i)) && C46238a.m51546a(Integer.valueOf(this.f331962j), Integer.valueOf(ds4.f331962j)) && C46238a.m51546a(Long.valueOf(this.f331963n), Long.valueOf(ds4.f331963n)) && C46238a.m51546a(this.f331964o, ds4.f331964o) && C46238a.m51546a(Integer.valueOf(this.f331965p), Integer.valueOf(ds4.f331965p));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f331956d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f331957e);
            aVar.mo74314a(3, this.f331958f);
            aVar.mo74321h(4, this.f331959g);
            aVar.mo74321h(5, this.f331960h);
            aVar.mo74321h(6, this.f331961i);
            aVar.mo74318e(7, this.f331962j);
            aVar.mo74321h(8, this.f331963n);
            String str2 = this.f331964o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74318e(10, this.f331965p);
            return 0;
        } else if (i == 1) {
            String str3 = this.f331956d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f331957e) + C52418a.m58674a(3, this.f331958f) + C52418a.m58681h(4, this.f331959g) + C52418a.m58681h(5, this.f331960h) + C52418a.m58681h(6, this.f331961i) + C52418a.m58678e(7, this.f331962j) + C52418a.m58681h(8, this.f331963n);
            String str4 = this.f331964o;
            if (str4 != null) {
                e += C52418a.m58683j(9, str4);
            }
            return e + C52418a.m58678e(10, this.f331965p);
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
            ds4 ds4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ds4.f331956d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ds4.f331957e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ds4.f331958f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    ds4.f331959g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    ds4.f331960h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ds4.f331961i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    ds4.f331962j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ds4.f331963n = aVar3.mo141631i(intValue);
                    return 0;
                case 9:
                    ds4.f331964o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ds4.f331965p = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
