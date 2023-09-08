package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qd3 */
public class C64655qd3 extends C47465a {

    /* renamed from: d */
    public int f184998d;

    /* renamed from: e */
    public C89349b f184999e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64655qd3)) {
            return false;
        }
        C64655qd3 qd32 = (C64655qd3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184998d), Integer.valueOf(qd32.f184998d)) && C46238a.m51546a(this.f184999e, qd32.f184999e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184998d);
            C89349b bVar = this.f184999e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184998d) + 0;
            C89349b bVar2 = this.f184999e;
            return bVar2 != null ? e + C52418a.m58675b(2, bVar2) : e;
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
            C64655qd3 qd32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qd32.f184998d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                qd32.f184999e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
