package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.of2 */
public class C50674of2 extends C47465a {

    /* renamed from: d */
    public C89349b f139139d;

    /* renamed from: e */
    public C89349b f139140e;

    /* renamed from: f */
    public int f139141f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50674of2)) {
            return false;
        }
        C50674of2 of22 = (C50674of2) aVar;
        return C46238a.m51546a(this.f139139d, of22.f139139d) && C46238a.m51546a(this.f139140e, of22.f139140e) && C46238a.m51546a(Integer.valueOf(this.f139141f), Integer.valueOf(of22.f139141f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f139139d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f139140e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            aVar.mo74318e(3, this.f139141f);
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f139139d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f139140e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            return i2 + C52418a.m58678e(3, this.f139141f);
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
            C50674of2 of22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                of22.f139139d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                of22.f139140e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                of22.f139141f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
