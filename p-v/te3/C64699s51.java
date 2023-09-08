package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s51 */
public class C64699s51 extends C47465a {

    /* renamed from: d */
    public int f185341d;

    /* renamed from: e */
    public int f185342e;

    /* renamed from: f */
    public C89349b f185343f;

    /* renamed from: g */
    public int f185344g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64699s51)) {
            return false;
        }
        C64699s51 s512 = (C64699s51) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185341d), Integer.valueOf(s512.f185341d)) && C46238a.m51546a(Integer.valueOf(this.f185342e), Integer.valueOf(s512.f185342e)) && C46238a.m51546a(this.f185343f, s512.f185343f) && C46238a.m51546a(Integer.valueOf(this.f185344g), Integer.valueOf(s512.f185344g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185341d);
            aVar.mo74318e(2, this.f185342e);
            C89349b bVar = this.f185343f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f185344g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185341d) + 0 + C52418a.m58678e(2, this.f185342e);
            C89349b bVar2 = this.f185343f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            return e + C52418a.m58678e(4, this.f185344g);
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
            C64699s51 s512 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s512.f185341d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                s512.f185342e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                s512.f185343f = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                s512.f185344g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
