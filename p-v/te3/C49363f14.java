package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f14 */
public class C49363f14 extends C47465a {

    /* renamed from: d */
    public C89349b f133241d;

    /* renamed from: e */
    public C89349b f133242e;

    /* renamed from: f */
    public String f133243f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49363f14)) {
            return false;
        }
        C49363f14 f142 = (C49363f14) aVar;
        return C46238a.m51546a(this.f133241d, f142.f133241d) && C46238a.m51546a(this.f133242e, f142.f133242e) && C46238a.m51546a(this.f133243f, f142.f133243f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f133241d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C89349b bVar2 = this.f133242e;
            if (bVar2 != null) {
                aVar.mo74315b(2, bVar2);
            }
            String str = this.f133243f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar3 = this.f133241d;
            if (bVar3 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar3);
            }
            C89349b bVar4 = this.f133242e;
            if (bVar4 != null) {
                i2 += C52418a.m58675b(2, bVar4);
            }
            String str2 = this.f133243f;
            return str2 != null ? i2 + C52418a.m58683j(3, str2) : i2;
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
            C49363f14 f142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                f142.f133241d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 2) {
                f142.f133242e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f142.f133243f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
