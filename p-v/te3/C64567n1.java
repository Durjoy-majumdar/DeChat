package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n1 */
public class C64567n1 extends C47465a {

    /* renamed from: d */
    public boolean f184418d;

    /* renamed from: e */
    public boolean f184419e;

    /* renamed from: f */
    public int f184420f;

    /* renamed from: g */
    public boolean f184421g;

    /* renamed from: h */
    public C89349b f184422h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64567n1)) {
            return false;
        }
        C64567n1 n1Var = (C64567n1) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f184418d), Boolean.valueOf(n1Var.f184418d)) && C46238a.m51546a(Boolean.valueOf(this.f184419e), Boolean.valueOf(n1Var.f184419e)) && C46238a.m51546a(Integer.valueOf(this.f184420f), Integer.valueOf(n1Var.f184420f)) && C46238a.m51546a(Boolean.valueOf(this.f184421g), Boolean.valueOf(n1Var.f184421g)) && C46238a.m51546a(this.f184422h, n1Var.f184422h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f184418d);
            aVar.mo74314a(2, this.f184419e);
            aVar.mo74318e(3, this.f184420f);
            aVar.mo74314a(4, this.f184421g);
            C89349b bVar = this.f184422h;
            if (bVar != null) {
                aVar.mo74315b(5, bVar);
            }
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f184418d) + 0 + C52418a.m58674a(2, this.f184419e) + C52418a.m58678e(3, this.f184420f) + C52418a.m58674a(4, this.f184421g);
            C89349b bVar2 = this.f184422h;
            return bVar2 != null ? a + C52418a.m58675b(5, bVar2) : a;
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
            C64567n1 n1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n1Var.f184418d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 2) {
                n1Var.f184419e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 3) {
                n1Var.f184420f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                n1Var.f184421g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n1Var.f184422h = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
