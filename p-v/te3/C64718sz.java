package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sz */
public class C64718sz extends C47465a {

    /* renamed from: d */
    public long f185455d;

    /* renamed from: e */
    public long f185456e;

    /* renamed from: f */
    public int f185457f;

    /* renamed from: g */
    public int f185458g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64718sz)) {
            return false;
        }
        C64718sz szVar = (C64718sz) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185455d), Long.valueOf(szVar.f185455d)) && C46238a.m51546a(Long.valueOf(this.f185456e), Long.valueOf(szVar.f185456e)) && C46238a.m51546a(Integer.valueOf(this.f185457f), Integer.valueOf(szVar.f185457f)) && C46238a.m51546a(Integer.valueOf(this.f185458g), Integer.valueOf(szVar.f185458g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185455d);
            aVar.mo74321h(2, this.f185456e);
            aVar.mo74318e(3, this.f185457f);
            aVar.mo74318e(4, this.f185458g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f185455d) + 0 + C52418a.m58681h(2, this.f185456e) + C52418a.m58678e(3, this.f185457f) + C52418a.m58678e(4, this.f185458g);
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
                C64718sz szVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    szVar.f185455d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    szVar.f185456e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 3) {
                    szVar.f185457f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    szVar.f185458g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
