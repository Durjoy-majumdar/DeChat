package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.az3 */
public class C48784az3 extends C47465a {

    /* renamed from: d */
    public int f130852d;

    /* renamed from: e */
    public int f130853e;

    /* renamed from: f */
    public C89349b f130854f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48784az3)) {
            return false;
        }
        C48784az3 az32 = (C48784az3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130852d), Integer.valueOf(az32.f130852d)) && C46238a.m51546a(Integer.valueOf(this.f130853e), Integer.valueOf(az32.f130853e)) && C46238a.m51546a(this.f130854f, az32.f130854f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130852d);
            aVar.mo74318e(2, this.f130853e);
            C89349b bVar = this.f130854f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130852d) + 0 + C52418a.m58678e(2, this.f130853e);
            C89349b bVar2 = this.f130854f;
            return bVar2 != null ? e + C52418a.m58675b(3, bVar2) : e;
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
            C48784az3 az32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                az32.f130852d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                az32.f130853e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                az32.f130854f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
