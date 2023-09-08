package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.d1 */
public class C47563d1 extends C47465a {

    /* renamed from: d */
    public int f127633d;

    /* renamed from: e */
    public String f127634e;

    /* renamed from: f */
    public int f127635f;

    /* renamed from: g */
    public String f127636g;

    /* renamed from: h */
    public boolean f127637h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47563d1)) {
            return false;
        }
        C47563d1 d1Var = (C47563d1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127633d), Integer.valueOf(d1Var.f127633d)) && C46238a.m51546a(this.f127634e, d1Var.f127634e) && C46238a.m51546a(Integer.valueOf(this.f127635f), Integer.valueOf(d1Var.f127635f)) && C46238a.m51546a(this.f127636g, d1Var.f127636g) && C46238a.m51546a(Boolean.valueOf(this.f127637h), Boolean.valueOf(d1Var.f127637h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127633d);
            String str = this.f127634e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f127635f);
            String str2 = this.f127636g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74314a(5, this.f127637h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127633d) + 0;
            String str3 = this.f127634e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f127635f);
            String str4 = this.f127636g;
            if (str4 != null) {
                e2 += C52418a.m58683j(4, str4);
            }
            return e2 + C52418a.m58674a(5, this.f127637h);
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
            C47563d1 d1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d1Var.f127633d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                d1Var.f127634e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                d1Var.f127635f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                d1Var.f127636g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                d1Var.f127637h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
