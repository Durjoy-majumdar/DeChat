package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q1 */
public class C22524q1 extends C47465a {

    /* renamed from: d */
    public boolean f64463d = false;

    /* renamed from: e */
    public boolean f64464e = false;

    /* renamed from: f */
    public boolean f64465f = false;

    /* renamed from: g */
    public boolean f64466g = false;

    /* renamed from: h */
    public String f64467h = "";

    /* renamed from: i */
    public String f64468i = "";

    /* renamed from: j */
    public String f64469j = "";

    /* renamed from: n */
    public String f64470n = "";

    /* renamed from: o */
    public int f64471o = -1;

    /* renamed from: p */
    public String f64472p = "";

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22524q1)) {
            return false;
        }
        C22524q1 q1Var = (C22524q1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f64463d), Boolean.valueOf(q1Var.f64463d)) && C46238a.m51546a(Boolean.valueOf(this.f64464e), Boolean.valueOf(q1Var.f64464e)) && C46238a.m51546a(Boolean.valueOf(this.f64465f), Boolean.valueOf(q1Var.f64465f)) && C46238a.m51546a(Boolean.valueOf(this.f64466g), Boolean.valueOf(q1Var.f64466g)) && C46238a.m51546a(this.f64467h, q1Var.f64467h) && C46238a.m51546a(this.f64468i, q1Var.f64468i) && C46238a.m51546a(this.f64469j, q1Var.f64469j) && C46238a.m51546a(this.f64470n, q1Var.f64470n) && C46238a.m51546a(Integer.valueOf(this.f64471o), Integer.valueOf(q1Var.f64471o)) && C46238a.m51546a(this.f64472p, q1Var.f64472p);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f64463d);
            aVar.mo74314a(2, this.f64464e);
            aVar.mo74314a(3, this.f64465f);
            aVar.mo74314a(4, this.f64466g);
            String str = this.f64467h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f64468i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f64469j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f64470n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f64471o);
            String str5 = this.f64472p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f64463d) + 0 + C52418a.m58674a(2, this.f64464e) + C52418a.m58674a(3, this.f64465f) + C52418a.m58674a(4, this.f64466g);
            String str6 = this.f64467h;
            if (str6 != null) {
                a += C52418a.m58683j(5, str6);
            }
            String str7 = this.f64468i;
            if (str7 != null) {
                a += C52418a.m58683j(6, str7);
            }
            String str8 = this.f64469j;
            if (str8 != null) {
                a += C52418a.m58683j(7, str8);
            }
            String str9 = this.f64470n;
            if (str9 != null) {
                a += C52418a.m58683j(8, str9);
            }
            int e = a + C52418a.m58678e(9, this.f64471o);
            String str10 = this.f64472p;
            return str10 != null ? e + C52418a.m58683j(10, str10) : e;
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
            C22524q1 q1Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    q1Var.f64463d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    q1Var.f64464e = aVar3.mo141625c(intValue);
                    return 0;
                case 3:
                    q1Var.f64465f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    q1Var.f64466g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    q1Var.f64467h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    q1Var.f64468i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    q1Var.f64469j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    q1Var.f64470n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    q1Var.f64471o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    q1Var.f64472p = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
