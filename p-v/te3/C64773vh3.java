package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vh3 */
public class C64773vh3 extends C47465a {

    /* renamed from: d */
    public String f185893d;

    /* renamed from: e */
    public String f185894e;

    /* renamed from: f */
    public C89349b f185895f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64773vh3)) {
            return false;
        }
        C64773vh3 vh32 = (C64773vh3) aVar;
        return C46238a.m51546a(this.f185893d, vh32.f185893d) && C46238a.m51546a(this.f185894e, vh32.f185894e) && C46238a.m51546a(this.f185895f, vh32.f185895f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185893d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185894e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            C89349b bVar = this.f185895f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f185893d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185894e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            C89349b bVar2 = this.f185895f;
            return bVar2 != null ? i2 + C52418a.m58675b(3, bVar2) : i2;
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
            C64773vh3 vh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vh32.f185893d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vh32.f185894e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vh32.f185895f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
