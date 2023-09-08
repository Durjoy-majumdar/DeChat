package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gb3 */
public class C49540gb3 extends C47465a {

    /* renamed from: d */
    public int f133951d;

    /* renamed from: e */
    public String f133952e;

    /* renamed from: f */
    public String f133953f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49540gb3)) {
            return false;
        }
        C49540gb3 gb32 = (C49540gb3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133951d), Integer.valueOf(gb32.f133951d)) && C46238a.m51546a(this.f133952e, gb32.f133952e) && C46238a.m51546a(this.f133953f, gb32.f133953f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133951d);
            String str = this.f133952e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f133953f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133951d) + 0;
            String str3 = this.f133952e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f133953f;
            return str4 != null ? e + C52418a.m58683j(3, str4) : e;
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
            C49540gb3 gb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gb32.f133951d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                gb32.f133952e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                gb32.f133953f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
