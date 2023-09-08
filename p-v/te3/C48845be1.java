package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.be1 */
public class C48845be1 extends C47465a {

    /* renamed from: d */
    public int f131065d;

    /* renamed from: e */
    public int f131066e;

    /* renamed from: f */
    public String f131067f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48845be1)) {
            return false;
        }
        C48845be1 be12 = (C48845be1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f131065d), Integer.valueOf(be12.f131065d)) && C46238a.m51546a(Integer.valueOf(this.f131066e), Integer.valueOf(be12.f131066e)) && C46238a.m51546a(this.f131067f, be12.f131067f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f131065d);
            aVar.mo74318e(2, this.f131066e);
            String str = this.f131067f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f131065d) + 0 + C52418a.m58678e(2, this.f131066e);
            String str2 = this.f131067f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            C48845be1 be12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                be12.f131065d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                be12.f131066e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                be12.f131067f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
