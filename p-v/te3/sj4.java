package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class sj4 extends C47465a {

    /* renamed from: d */
    public int f141564d;

    /* renamed from: e */
    public C89349b f141565e;

    /* renamed from: f */
    public C89349b f141566f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof sj4)) {
            return false;
        }
        sj4 sj4 = (sj4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141564d), Integer.valueOf(sj4.f141564d)) && C46238a.m51546a(this.f141565e, sj4.f141565e) && C46238a.m51546a(this.f141566f, sj4.f141566f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141564d);
            C89349b bVar = this.f141565e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            C89349b bVar2 = this.f141566f;
            if (bVar2 != null) {
                aVar.mo74315b(3, bVar2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141564d) + 0;
            C89349b bVar3 = this.f141565e;
            if (bVar3 != null) {
                e += C52418a.m58675b(2, bVar3);
            }
            C89349b bVar4 = this.f141566f;
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
            sj4 sj4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sj4.f141564d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                sj4.f141565e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                sj4.f141566f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
