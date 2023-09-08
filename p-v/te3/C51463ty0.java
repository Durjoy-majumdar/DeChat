package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ty0 */
public class C51463ty0 extends C47465a {

    /* renamed from: d */
    public int f142469d;

    /* renamed from: e */
    public C89349b f142470e;

    /* renamed from: f */
    public int f142471f;

    /* renamed from: g */
    public boolean f142472g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51463ty0)) {
            return false;
        }
        C51463ty0 ty02 = (C51463ty0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142469d), Integer.valueOf(ty02.f142469d)) && C46238a.m51546a(this.f142470e, ty02.f142470e) && C46238a.m51546a(Integer.valueOf(this.f142471f), Integer.valueOf(ty02.f142471f)) && C46238a.m51546a(Boolean.valueOf(this.f142472g), Boolean.valueOf(ty02.f142472g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142469d);
            C89349b bVar = this.f142470e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f142471f);
            aVar.mo74314a(4, this.f142472g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142469d) + 0;
            C89349b bVar2 = this.f142470e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58678e(3, this.f142471f) + C52418a.m58674a(4, this.f142472g);
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
            C51463ty0 ty02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ty02.f142469d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                ty02.f142470e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                ty02.f142471f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ty02.f142472g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
