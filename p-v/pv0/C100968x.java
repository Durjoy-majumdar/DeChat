package pv0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.x */
public class C100968x extends C47465a {

    /* renamed from: d */
    public int f295673d;

    /* renamed from: e */
    public String f295674e;

    /* renamed from: f */
    public String f295675f;

    /* renamed from: g */
    public String f295676g;

    /* renamed from: h */
    public int f295677h;

    /* renamed from: i */
    public int f295678i;

    /* renamed from: j */
    public long f295679j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C100968x)) {
            return false;
        }
        C100968x xVar = (C100968x) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f295673d), Integer.valueOf(xVar.f295673d)) && C46238a.m51546a(this.f295674e, xVar.f295674e) && C46238a.m51546a(this.f295675f, xVar.f295675f) && C46238a.m51546a(this.f295676g, xVar.f295676g) && C46238a.m51546a(Integer.valueOf(this.f295677h), Integer.valueOf(xVar.f295677h)) && C46238a.m51546a(Integer.valueOf(this.f295678i), Integer.valueOf(xVar.f295678i)) && C46238a.m51546a(Long.valueOf(this.f295679j), Long.valueOf(xVar.f295679j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f295673d);
            String str = this.f295674e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f295675f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f295676g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f295677h);
            aVar.mo74318e(6, this.f295678i);
            aVar.mo74321h(7, this.f295679j);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f295673d) + 0;
            String str4 = this.f295674e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f295675f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f295676g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f295677h) + C52418a.m58678e(6, this.f295678i) + C52418a.m58681h(7, this.f295679j);
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
            C100968x xVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xVar.f295673d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    xVar.f295674e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xVar.f295675f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xVar.f295676g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xVar.f295677h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    xVar.f295678i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xVar.f295679j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
