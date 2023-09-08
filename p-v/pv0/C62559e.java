package pv0;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.e */
public class C62559e extends C47465a {

    /* renamed from: d */
    public int f177684d;

    /* renamed from: e */
    public C89349b f177685e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62559e)) {
            return false;
        }
        C62559e eVar = (C62559e) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f177684d), Integer.valueOf(eVar.f177684d)) && C46238a.m51546a(this.f177685e, eVar.f177685e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f177684d);
            C89349b bVar = this.f177685e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f177684d) + 0;
            C89349b bVar2 = this.f177685e;
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
            C62559e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eVar.f177684d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                eVar.f177685e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
