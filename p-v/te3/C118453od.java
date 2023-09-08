package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.od */
public class C118453od extends C47465a {

    /* renamed from: d */
    public C89349b f354208d;

    /* renamed from: e */
    public C89349b f354209e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118453od)) {
            return false;
        }
        C118453od odVar = (C118453od) aVar;
        return C46238a.m51546a(this.f354208d, odVar.f354208d) && C46238a.m51546a(this.f354209e, odVar.f354209e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f354208d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f354209e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f354208d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f354209e;
            return bVar4 != null ? i2 + C52418a.m58675b(2, bVar4) : i2;
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
            C118453od odVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                odVar.f354208d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                odVar.f354209e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
