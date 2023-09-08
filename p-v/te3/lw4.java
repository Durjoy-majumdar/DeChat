package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class lw4 extends C47465a {

    /* renamed from: d */
    public int f184163d;

    /* renamed from: e */
    public String f184164e;

    /* renamed from: f */
    public C89349b f184165f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lw4)) {
            return false;
        }
        lw4 lw4 = (lw4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184163d), Integer.valueOf(lw4.f184163d)) && C46238a.m51546a(this.f184164e, lw4.f184164e) && C46238a.m51546a(this.f184165f, lw4.f184165f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184163d);
            String str = this.f184164e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f184165f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184163d) + 0;
            String str2 = this.f184164e;
            if (str2 != null) {
                e += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f184165f;
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
            lw4 lw4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lw4.f184163d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                lw4.f184164e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                lw4.f184165f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
