package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ci4 extends C47465a {

    /* renamed from: d */
    public int f182519d;

    /* renamed from: e */
    public C89349b f182520e;

    /* renamed from: f */
    public int f182521f;

    /* renamed from: g */
    public int f182522g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ci4)) {
            return false;
        }
        ci4 ci4 = (ci4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182519d), Integer.valueOf(ci4.f182519d)) && C46238a.m51546a(this.f182520e, ci4.f182520e) && C46238a.m51546a(Integer.valueOf(this.f182521f), Integer.valueOf(ci4.f182521f)) && C46238a.m51546a(Integer.valueOf(this.f182522g), Integer.valueOf(ci4.f182522g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(7, this.f182519d);
            C89349b bVar = this.f182520e;
            if (bVar != null) {
                aVar.mo74315b(8, bVar);
            }
            aVar.mo74318e(9, this.f182521f);
            aVar.mo74318e(10, this.f182522g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(7, this.f182519d) + 0;
            C89349b bVar2 = this.f182520e;
            if (bVar2 != null) {
                e += C52418a.m58675b(8, bVar2);
            }
            return e + C52418a.m58678e(9, this.f182521f) + C52418a.m58678e(10, this.f182522g);
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
            ci4 ci4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 7:
                    ci4.f182519d = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ci4.f182520e = aVar3.mo141626d(intValue);
                    return 0;
                case 9:
                    ci4.f182521f = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ci4.f182522g = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
