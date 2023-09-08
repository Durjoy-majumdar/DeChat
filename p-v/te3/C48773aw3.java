package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aw3 */
public class C48773aw3 extends C47465a {

    /* renamed from: d */
    public int f130805d;

    /* renamed from: e */
    public boolean f130806e;

    /* renamed from: f */
    public float f130807f;

    /* renamed from: g */
    public float f130808g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48773aw3)) {
            return false;
        }
        C48773aw3 aw32 = (C48773aw3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130805d), Integer.valueOf(aw32.f130805d)) && C46238a.m51546a(Boolean.valueOf(this.f130806e), Boolean.valueOf(aw32.f130806e)) && C46238a.m51546a(Float.valueOf(this.f130807f), Float.valueOf(aw32.f130807f)) && C46238a.m51546a(Float.valueOf(this.f130808g), Float.valueOf(aw32.f130808g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f130805d);
            aVar.mo74314a(2, this.f130806e);
            aVar.mo74317d(3, this.f130807f);
            aVar.mo74317d(4, this.f130808g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f130805d) + 0 + C52418a.m58674a(2, this.f130806e) + C52418a.m58677d(3, this.f130807f) + C52418a.m58677d(4, this.f130808g);
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
                C48773aw3 aw32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    aw32.f130805d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    aw32.f130806e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 3) {
                    aw32.f130807f = aVar3.mo141628f(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    aw32.f130808g = aVar3.mo141628f(intValue);
                    return 0;
                }
            }
        }
    }
}
