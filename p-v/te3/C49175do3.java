package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.do3 */
public class C49175do3 extends C47465a {

    /* renamed from: d */
    public int f132457d;

    /* renamed from: e */
    public String f132458e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49175do3)) {
            return false;
        }
        C49175do3 do32 = (C49175do3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132457d), Integer.valueOf(do32.f132457d)) && C46238a.m51546a(this.f132458e, do32.f132458e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132457d);
            String str = this.f132458e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132457d) + 0;
            String str2 = this.f132458e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
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
            C49175do3 do32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                do32.f132457d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                do32.f132458e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
