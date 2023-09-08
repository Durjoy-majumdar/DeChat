package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.an2 */
public class C64234an2 extends C47465a {

    /* renamed from: d */
    public float f182094d;

    /* renamed from: e */
    public float f182095e;

    /* renamed from: f */
    public int f182096f;

    /* renamed from: g */
    public String f182097g;

    /* renamed from: h */
    public String f182098h;

    /* renamed from: i */
    public int f182099i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64234an2)) {
            return false;
        }
        C64234an2 an22 = (C64234an2) aVar;
        return C46238a.m51546a(Float.valueOf(this.f182094d), Float.valueOf(an22.f182094d)) && C46238a.m51546a(Float.valueOf(this.f182095e), Float.valueOf(an22.f182095e)) && C46238a.m51546a(Integer.valueOf(this.f182096f), Integer.valueOf(an22.f182096f)) && C46238a.m51546a(this.f182097g, an22.f182097g) && C46238a.m51546a(this.f182098h, an22.f182098h) && C46238a.m51546a(Integer.valueOf(this.f182099i), Integer.valueOf(an22.f182099i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f182094d);
            aVar.mo74317d(2, this.f182095e);
            aVar.mo74318e(3, this.f182096f);
            String str = this.f182097g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f182098h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f182099i);
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f182094d) + 0 + C52418a.m58677d(2, this.f182095e) + C52418a.m58678e(3, this.f182096f);
            String str3 = this.f182097g;
            if (str3 != null) {
                d += C52418a.m58683j(4, str3);
            }
            String str4 = this.f182098h;
            if (str4 != null) {
                d += C52418a.m58683j(5, str4);
            }
            return d + C52418a.m58678e(6, this.f182099i);
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
            C64234an2 an22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    an22.f182094d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    an22.f182095e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    an22.f182096f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    an22.f182097g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    an22.f182098h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    an22.f182099i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
