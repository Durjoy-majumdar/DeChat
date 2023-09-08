package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.s3 */
public class C47670s3 extends C47465a {

    /* renamed from: d */
    public int f127997d;

    /* renamed from: e */
    public String f127998e;

    /* renamed from: f */
    public String f127999f;

    /* renamed from: g */
    public boolean f128000g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47670s3)) {
            return false;
        }
        C47670s3 s3Var = (C47670s3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f127997d), Integer.valueOf(s3Var.f127997d)) && C46238a.m51546a(this.f127998e, s3Var.f127998e) && C46238a.m51546a(this.f127999f, s3Var.f127999f) && C46238a.m51546a(Boolean.valueOf(this.f128000g), Boolean.valueOf(s3Var.f128000g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f127999f != null) {
                aVar.mo74318e(1, this.f127997d);
                String str = this.f127998e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f127999f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74314a(4, this.f128000g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaURL");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f127997d) + 0;
            String str3 = this.f127998e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f127999f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58674a(4, this.f128000g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127999f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: MediaURL");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47670s3 s3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s3Var.f127997d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                s3Var.f127998e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                s3Var.f127999f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s3Var.f128000g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
