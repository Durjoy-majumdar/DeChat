package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pz */
public class C64643pz extends C47465a {

    /* renamed from: d */
    public int f184926d;

    /* renamed from: e */
    public String f184927e;

    /* renamed from: f */
    public String f184928f;

    /* renamed from: g */
    public int f184929g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64643pz)) {
            return false;
        }
        C64643pz pzVar = (C64643pz) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184926d), Integer.valueOf(pzVar.f184926d)) && C46238a.m51546a(this.f184927e, pzVar.f184927e) && C46238a.m51546a(this.f184928f, pzVar.f184928f) && C46238a.m51546a(Integer.valueOf(this.f184929g), Integer.valueOf(pzVar.f184929g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184926d);
            String str = this.f184927e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f184928f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f184929g);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184926d) + 0;
            String str3 = this.f184927e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            String str4 = this.f184928f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58678e(4, this.f184929g);
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
            C64643pz pzVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pzVar.f184926d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                pzVar.f184927e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                pzVar.f184928f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                pzVar.f184929g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
