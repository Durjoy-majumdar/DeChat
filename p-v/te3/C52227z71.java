package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z71 */
public class C52227z71 extends C47465a {

    /* renamed from: d */
    public int f145741d;

    /* renamed from: e */
    public String f145742e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52227z71)) {
            return false;
        }
        C52227z71 z712 = (C52227z71) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145741d), Integer.valueOf(z712.f145741d)) && C46238a.m51546a(this.f145742e, z712.f145742e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145741d);
            String str = this.f145742e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145741d) + 0;
            String str2 = this.f145742e;
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
            C52227z71 z712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z712.f145741d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                z712.f145742e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
