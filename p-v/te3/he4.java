package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class he4 extends C47465a {

    /* renamed from: d */
    public int f134585d;

    /* renamed from: e */
    public int f134586e;

    /* renamed from: f */
    public C89349b f134587f;

    /* renamed from: g */
    public int f134588g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof he4)) {
            return false;
        }
        he4 he4 = (he4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134585d), Integer.valueOf(he4.f134585d)) && C46238a.m51546a(Integer.valueOf(this.f134586e), Integer.valueOf(he4.f134586e)) && C46238a.m51546a(this.f134587f, he4.f134587f) && C46238a.m51546a(Integer.valueOf(this.f134588g), Integer.valueOf(he4.f134588g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134585d);
            aVar.mo74318e(2, this.f134586e);
            C89349b bVar = this.f134587f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f134588g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134585d) + 0 + C52418a.m58678e(2, this.f134586e);
            C89349b bVar2 = this.f134587f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f134588g);
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
            he4 he4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                he4.f134585d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                he4.f134586e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                he4.f134587f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                he4.f134588g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
