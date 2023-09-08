package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.aa0 */
public class C64227aa0 extends C47465a {

    /* renamed from: d */
    public int f182041d;

    /* renamed from: e */
    public int f182042e;

    /* renamed from: f */
    public int f182043f;

    /* renamed from: g */
    public int f182044g;

    /* renamed from: h */
    public long f182045h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64227aa0)) {
            return false;
        }
        C64227aa0 aa02 = (C64227aa0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182041d), Integer.valueOf(aa02.f182041d)) && C46238a.m51546a(Integer.valueOf(this.f182042e), Integer.valueOf(aa02.f182042e)) && C46238a.m51546a(Integer.valueOf(this.f182043f), Integer.valueOf(aa02.f182043f)) && C46238a.m51546a(Integer.valueOf(this.f182044g), Integer.valueOf(aa02.f182044g)) && C46238a.m51546a(Long.valueOf(this.f182045h), Long.valueOf(aa02.f182045h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182041d);
            aVar.mo74318e(2, this.f182042e);
            aVar.mo74318e(3, this.f182043f);
            aVar.mo74318e(4, this.f182044g);
            aVar.mo74321h(5, this.f182045h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182041d) + 0 + C52418a.m58678e(2, this.f182042e) + C52418a.m58678e(3, this.f182043f) + C52418a.m58678e(4, this.f182044g) + C52418a.m58681h(5, this.f182045h);
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
                C64227aa0 aa02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    aa02.f182041d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    aa02.f182042e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    aa02.f182043f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 4) {
                    aa02.f182044g = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    aa02.f182045h = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
