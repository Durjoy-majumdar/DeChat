package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ci2 */
public class C64288ci2 extends C47465a {

    /* renamed from: d */
    public int f182515d;

    /* renamed from: e */
    public long f182516e;

    /* renamed from: f */
    public int f182517f;

    /* renamed from: g */
    public int f182518g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64288ci2)) {
            return false;
        }
        C64288ci2 ci22 = (C64288ci2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182515d), Integer.valueOf(ci22.f182515d)) && C46238a.m51546a(Long.valueOf(this.f182516e), Long.valueOf(ci22.f182516e)) && C46238a.m51546a(Integer.valueOf(this.f182517f), Integer.valueOf(ci22.f182517f)) && C46238a.m51546a(Integer.valueOf(this.f182518g), Integer.valueOf(ci22.f182518g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f182515d);
            aVar.mo74321h(2, this.f182516e);
            aVar.mo74318e(3, this.f182517f);
            aVar.mo74318e(4, this.f182518g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f182515d) + 0 + C52418a.m58681h(2, this.f182516e) + C52418a.m58678e(3, this.f182517f) + C52418a.m58678e(4, this.f182518g);
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
                C64288ci2 ci22 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ci22.f182515d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ci22.f182516e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ci22.f182517f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ci22.f182518g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
