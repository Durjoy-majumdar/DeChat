package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a5 */
public class C48665a5 extends C47465a {

    /* renamed from: d */
    public int f130312d;

    /* renamed from: e */
    public String f130313e;

    /* renamed from: f */
    public String f130314f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48665a5)) {
            return false;
        }
        C48665a5 a5Var = (C48665a5) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130312d), Integer.valueOf(a5Var.f130312d)) && C46238a.m51546a(this.f130313e, a5Var.f130313e) && C46238a.m51546a(this.f130314f, a5Var.f130314f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f130313e == null) {
                throw new C52419b("Not all required fields were included: wording");
            } else if (this.f130314f != null) {
                aVar.mo74318e(1, this.f130312d);
                String str = this.f130313e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f130314f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url");
            }
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130312d) + 0;
            String str3 = this.f130313e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f130314f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130313e == null) {
                throw new C52419b("Not all required fields were included: wording");
            } else if (this.f130314f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: url");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48665a5 a5Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a5Var.f130312d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                a5Var.f130313e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                a5Var.f130314f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
