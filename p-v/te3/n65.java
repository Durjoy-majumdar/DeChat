package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class n65 extends C47465a {

    /* renamed from: d */
    public int f138447d;

    /* renamed from: e */
    public String f138448e;

    /* renamed from: f */
    public String f138449f;

    /* renamed from: g */
    public boolean f138450g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n65)) {
            return false;
        }
        n65 n65 = (n65) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138447d), Integer.valueOf(n65.f138447d)) && C46238a.m51546a(this.f138448e, n65.f138448e) && C46238a.m51546a(this.f138449f, n65.f138449f) && C46238a.m51546a(Boolean.valueOf(this.f138450g), Boolean.valueOf(n65.f138450g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138447d);
            String str = this.f138448e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138449f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f138450g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138447d) + 0;
            String str3 = this.f138448e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138449f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58674a(4, this.f138450g);
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
            n65 n65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n65.f138447d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                n65.f138448e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                n65.f138449f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                n65.f138450g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
