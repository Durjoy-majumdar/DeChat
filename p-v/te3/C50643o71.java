package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o71 */
public class C50643o71 extends C47465a {

    /* renamed from: d */
    public int f138995d;

    /* renamed from: e */
    public String f138996e;

    /* renamed from: f */
    public String f138997f;

    /* renamed from: g */
    public boolean f138998g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50643o71)) {
            return false;
        }
        C50643o71 o712 = (C50643o71) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138995d), Integer.valueOf(o712.f138995d)) && C46238a.m51546a(this.f138996e, o712.f138996e) && C46238a.m51546a(this.f138997f, o712.f138997f) && C46238a.m51546a(Boolean.valueOf(this.f138998g), Boolean.valueOf(o712.f138998g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138995d);
            String str = this.f138996e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138997f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f138998g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138995d) + 0;
            String str3 = this.f138996e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f138997f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58674a(4, this.f138998g);
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
            C50643o71 o712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                o712.f138995d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                o712.f138996e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                o712.f138997f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o712.f138998g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
