package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vi0 */
public class C64775vi0 extends C47465a {

    /* renamed from: d */
    public float f185902d;

    /* renamed from: e */
    public float f185903e;

    /* renamed from: f */
    public int f185904f;

    /* renamed from: g */
    public String f185905g;

    /* renamed from: h */
    public String f185906h;

    /* renamed from: i */
    public float f185907i;

    /* renamed from: j */
    public int f185908j;

    /* renamed from: n */
    public String f185909n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64775vi0)) {
            return false;
        }
        C64775vi0 vi02 = (C64775vi0) aVar;
        return C46238a.m51546a(Float.valueOf(this.f185902d), Float.valueOf(vi02.f185902d)) && C46238a.m51546a(Float.valueOf(this.f185903e), Float.valueOf(vi02.f185903e)) && C46238a.m51546a(Integer.valueOf(this.f185904f), Integer.valueOf(vi02.f185904f)) && C46238a.m51546a(this.f185905g, vi02.f185905g) && C46238a.m51546a(this.f185906h, vi02.f185906h) && C46238a.m51546a(Float.valueOf(this.f185907i), Float.valueOf(vi02.f185907i)) && C46238a.m51546a(Integer.valueOf(this.f185908j), Integer.valueOf(vi02.f185908j)) && C46238a.m51546a(this.f185909n, vi02.f185909n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f185902d);
            aVar.mo74317d(2, this.f185903e);
            aVar.mo74318e(3, this.f185904f);
            String str = this.f185905g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f185906h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74317d(6, this.f185907i);
            aVar.mo74318e(7, this.f185908j);
            String str3 = this.f185909n;
            if (str3 != null) {
                aVar.mo74323j(8, str3);
            }
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f185902d) + 0 + C52418a.m58677d(2, this.f185903e) + C52418a.m58678e(3, this.f185904f);
            String str4 = this.f185905g;
            if (str4 != null) {
                d += C52418a.m58683j(4, str4);
            }
            String str5 = this.f185906h;
            if (str5 != null) {
                d += C52418a.m58683j(5, str5);
            }
            int d2 = d + C52418a.m58677d(6, this.f185907i) + C52418a.m58678e(7, this.f185908j);
            String str6 = this.f185909n;
            return str6 != null ? d2 + C52418a.m58683j(8, str6) : d2;
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
            C64775vi0 vi02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    vi02.f185902d = aVar3.mo141628f(intValue);
                    return 0;
                case 2:
                    vi02.f185903e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    vi02.f185904f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    vi02.f185905g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    vi02.f185906h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    vi02.f185907i = aVar3.mo141628f(intValue);
                    return 0;
                case 7:
                    vi02.f185908j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    vi02.f185909n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
