package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class dg4 extends C47465a {

    /* renamed from: d */
    public C89349b f132313d;

    /* renamed from: e */
    public int f132314e;

    /* renamed from: f */
    public C89349b f132315f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof dg4)) {
            return false;
        }
        dg4 dg4 = (dg4) aVar;
        return C46238a.m51546a(this.f132313d, dg4.f132313d) && C46238a.m51546a(Integer.valueOf(this.f132314e), Integer.valueOf(dg4.f132314e)) && C46238a.m51546a(this.f132315f, dg4.f132315f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f132313d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            aVar.mo74318e(2, this.f132314e);
            C89349b bVar2 = this.f132315f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f132313d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            int e = i2 + C52418a.m58678e(2, this.f132314e);
            C89349b bVar4 = this.f132315f;
            return bVar4 != null ? e + C52418a.m58675b(3, bVar4) : e;
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
            dg4 dg4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                dg4.f132313d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                dg4.f132314e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                dg4.f132315f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
