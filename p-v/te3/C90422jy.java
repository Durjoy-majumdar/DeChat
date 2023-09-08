package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jy */
public class C90422jy extends C47465a {

    /* renamed from: d */
    public int f259639d;

    /* renamed from: e */
    public boolean f259640e;

    /* renamed from: f */
    public int f259641f;

    /* renamed from: g */
    public int f259642g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90422jy)) {
            return false;
        }
        C90422jy jyVar = (C90422jy) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f259639d), Integer.valueOf(jyVar.f259639d)) && C46238a.m51546a(Boolean.valueOf(this.f259640e), Boolean.valueOf(jyVar.f259640e)) && C46238a.m51546a(Integer.valueOf(this.f259641f), Integer.valueOf(jyVar.f259641f)) && C46238a.m51546a(Integer.valueOf(this.f259642g), Integer.valueOf(jyVar.f259642g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f259639d);
            aVar.mo74314a(2, this.f259640e);
            aVar.mo74318e(3, this.f259641f);
            aVar.mo74318e(4, this.f259642g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f259639d) + 0 + C52418a.m58674a(2, this.f259640e) + C52418a.m58678e(3, this.f259641f) + C52418a.m58678e(4, this.f259642g);
        } else {
            if (i == 2) {
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
                C90422jy jyVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jyVar.f259639d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jyVar.f259640e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 3) {
                    jyVar.f259641f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    jyVar.f259642g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
