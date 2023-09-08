package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vl3 */
public class C51708vl3 extends C47465a {

    /* renamed from: d */
    public int f143548d;

    /* renamed from: e */
    public int f143549e;

    /* renamed from: f */
    public String f143550f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51708vl3)) {
            return false;
        }
        C51708vl3 vl32 = (C51708vl3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143548d), Integer.valueOf(vl32.f143548d)) && C46238a.m51546a(Integer.valueOf(this.f143549e), Integer.valueOf(vl32.f143549e)) && C46238a.m51546a(this.f143550f, vl32.f143550f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143548d);
            aVar.mo74318e(2, this.f143549e);
            String str = this.f143550f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143548d) + 0 + C52418a.m58678e(2, this.f143549e);
            String str2 = this.f143550f;
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
            C51708vl3 vl32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vl32.f143548d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                vl32.f143549e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vl32.f143550f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
