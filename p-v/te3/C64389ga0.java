package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ga0 */
public class C64389ga0 extends C47465a {

    /* renamed from: d */
    public int f183291d;

    /* renamed from: e */
    public int f183292e;

    /* renamed from: f */
    public int f183293f;

    /* renamed from: g */
    public int f183294g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64389ga0)) {
            return false;
        }
        C64389ga0 ga02 = (C64389ga0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183291d), Integer.valueOf(ga02.f183291d)) && C46238a.m51546a(Integer.valueOf(this.f183292e), Integer.valueOf(ga02.f183292e)) && C46238a.m51546a(Integer.valueOf(this.f183293f), Integer.valueOf(ga02.f183293f)) && C46238a.m51546a(Integer.valueOf(this.f183294g), Integer.valueOf(ga02.f183294g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183291d);
            aVar.mo74318e(2, this.f183292e);
            aVar.mo74318e(3, this.f183293f);
            aVar.mo74318e(4, this.f183294g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f183291d) + 0 + C52418a.m58678e(2, this.f183292e) + C52418a.m58678e(3, this.f183293f) + C52418a.m58678e(4, this.f183294g);
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
                C64389ga0 ga02 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ga02.f183291d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ga02.f183292e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ga02.f183293f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ga02.f183294g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
