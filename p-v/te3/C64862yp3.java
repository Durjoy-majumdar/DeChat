package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yp3 */
public class C64862yp3 extends C47465a {

    /* renamed from: d */
    public int f186579d;

    /* renamed from: e */
    public String f186580e;

    /* renamed from: f */
    public String f186581f;

    /* renamed from: g */
    public int f186582g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64862yp3)) {
            return false;
        }
        C64862yp3 yp32 = (C64862yp3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186579d), Integer.valueOf(yp32.f186579d)) && C46238a.m51546a(this.f186580e, yp32.f186580e) && C46238a.m51546a(this.f186581f, yp32.f186581f) && C46238a.m51546a(Integer.valueOf(this.f186582g), Integer.valueOf(yp32.f186582g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f186579d);
            String str = this.f186580e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f186581f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f186582g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f186579d) + 0;
            String str3 = this.f186580e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f186581f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f186582g);
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
            C64862yp3 yp32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yp32.f186579d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                yp32.f186580e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yp32.f186581f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                yp32.f186582g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
