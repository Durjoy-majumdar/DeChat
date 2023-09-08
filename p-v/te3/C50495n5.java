package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n5 */
public class C50495n5 extends C47465a {

    /* renamed from: d */
    public String f138408d;

    /* renamed from: e */
    public int f138409e;

    /* renamed from: f */
    public int f138410f;

    /* renamed from: g */
    public String f138411g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50495n5)) {
            return false;
        }
        C50495n5 n5Var = (C50495n5) aVar;
        return C46238a.m51546a(this.f138408d, n5Var.f138408d) && C46238a.m51546a(Integer.valueOf(this.f138409e), Integer.valueOf(n5Var.f138409e)) && C46238a.m51546a(Integer.valueOf(this.f138410f), Integer.valueOf(n5Var.f138410f)) && C46238a.m51546a(this.f138411g, n5Var.f138411g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138408d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f138409e);
            aVar.mo74318e(3, this.f138410f);
            String str2 = this.f138411g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f138408d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f138409e) + C52418a.m58678e(3, this.f138410f);
            String str4 = this.f138411g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C50495n5 n5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n5Var.f138408d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                n5Var.f138409e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                n5Var.f138410f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n5Var.f138411g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
