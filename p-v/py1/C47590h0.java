package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.h0 */
public class C47590h0 extends C47465a {

    /* renamed from: d */
    public int f127746d;

    /* renamed from: e */
    public String f127747e;

    /* renamed from: f */
    public int f127748f;

    /* renamed from: g */
    public String f127749g;

    /* renamed from: h */
    public int f127750h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47590h0)) {
            return false;
        }
        C47590h0 h0Var = (C47590h0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127746d), Integer.valueOf(h0Var.f127746d)) && C46238a.m51546a(this.f127747e, h0Var.f127747e) && C46238a.m51546a(Integer.valueOf(this.f127748f), Integer.valueOf(h0Var.f127748f)) && C46238a.m51546a(this.f127749g, h0Var.f127749g) && C46238a.m51546a(Integer.valueOf(this.f127750h), Integer.valueOf(h0Var.f127750h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f127746d);
            String str = this.f127747e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f127748f);
            String str2 = this.f127749g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f127750h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127746d) + 0;
            String str3 = this.f127747e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f127748f);
            String str4 = this.f127749g;
            if (str4 != null) {
                e2 += C52418a.m58683j(4, str4);
            }
            return e2 + C52418a.m58678e(5, this.f127750h);
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
            C47590h0 h0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h0Var.f127746d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                h0Var.f127747e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h0Var.f127748f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                h0Var.f127749g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                h0Var.f127750h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
