package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ry0 */
public class C51174ry0 extends C47465a {

    /* renamed from: d */
    public int f141213d;

    /* renamed from: e */
    public int f141214e;

    /* renamed from: f */
    public C89349b f141215f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51174ry0)) {
            return false;
        }
        C51174ry0 ry02 = (C51174ry0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141213d), Integer.valueOf(ry02.f141213d)) && C46238a.m51546a(Integer.valueOf(this.f141214e), Integer.valueOf(ry02.f141214e)) && C46238a.m51546a(this.f141215f, ry02.f141215f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141213d);
            aVar.mo74318e(2, this.f141214e);
            C89349b bVar = this.f141215f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f141213d) + 0 + C52418a.m58678e(2, this.f141214e);
            C89349b bVar2 = this.f141215f;
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
            C51174ry0 ry02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ry02.f141213d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ry02.f141214e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ry02.f141215f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
