package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lm2 */
public class C64526lm2 extends C47465a {

    /* renamed from: d */
    public int f184110d;

    /* renamed from: e */
    public String f184111e;

    /* renamed from: f */
    public String f184112f;

    /* renamed from: g */
    public boolean f184113g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64526lm2)) {
            return false;
        }
        C64526lm2 lm22 = (C64526lm2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184110d), Integer.valueOf(lm22.f184110d)) && C46238a.m51546a(this.f184111e, lm22.f184111e) && C46238a.m51546a(this.f184112f, lm22.f184112f) && C46238a.m51546a(Boolean.valueOf(this.f184113g), Boolean.valueOf(lm22.f184113g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184110d);
            String str = this.f184111e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184112f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(4, this.f184113g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184110d) + 0;
            String str3 = this.f184111e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f184112f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58674a(4, this.f184113g);
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
            C64526lm2 lm22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lm22.f184110d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                lm22.f184111e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                lm22.f184112f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                lm22.f184113g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
