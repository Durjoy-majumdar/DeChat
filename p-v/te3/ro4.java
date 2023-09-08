package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ro4 extends C47465a {

    /* renamed from: d */
    public int f141064d;

    /* renamed from: e */
    public int f141065e;

    /* renamed from: f */
    public long f141066f;

    /* renamed from: g */
    public int f141067g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ro4)) {
            return false;
        }
        ro4 ro4 = (ro4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f141064d), Integer.valueOf(ro4.f141064d)) && C46238a.m51546a(Integer.valueOf(this.f141065e), Integer.valueOf(ro4.f141065e)) && C46238a.m51546a(Long.valueOf(this.f141066f), Long.valueOf(ro4.f141066f)) && C46238a.m51546a(Integer.valueOf(this.f141067g), Integer.valueOf(ro4.f141067g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f141064d);
            aVar.mo74318e(2, this.f141065e);
            aVar.mo74321h(3, this.f141066f);
            aVar.mo74318e(4, this.f141067g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f141064d) + 0 + C52418a.m58678e(2, this.f141065e) + C52418a.m58681h(3, this.f141066f) + C52418a.m58678e(4, this.f141067g);
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
                ro4 ro4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ro4.f141064d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ro4.f141065e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ro4.f141066f = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ro4.f141067g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
