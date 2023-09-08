package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k90 */
public class C64487k90 extends C47465a {

    /* renamed from: d */
    public int f183898d;

    /* renamed from: e */
    public int f183899e;

    /* renamed from: f */
    public int f183900f;

    /* renamed from: g */
    public int f183901g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64487k90)) {
            return false;
        }
        C64487k90 k902 = (C64487k90) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183898d), Integer.valueOf(k902.f183898d)) && C46238a.m51546a(Integer.valueOf(this.f183899e), Integer.valueOf(k902.f183899e)) && C46238a.m51546a(Integer.valueOf(this.f183900f), Integer.valueOf(k902.f183900f)) && C46238a.m51546a(Integer.valueOf(this.f183901g), Integer.valueOf(k902.f183901g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183898d);
            aVar.mo74318e(2, this.f183899e);
            aVar.mo74318e(3, this.f183900f);
            aVar.mo74318e(4, this.f183901g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f183898d) + 0 + C52418a.m58678e(2, this.f183899e) + C52418a.m58678e(3, this.f183900f) + C52418a.m58678e(4, this.f183901g);
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
                C64487k90 k902 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    k902.f183898d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    k902.f183899e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    k902.f183900f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    k902.f183901g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
