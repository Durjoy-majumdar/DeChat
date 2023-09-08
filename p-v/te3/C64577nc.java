package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nc */
public class C64577nc extends C47465a {

    /* renamed from: d */
    public int f184455d;

    /* renamed from: e */
    public int f184456e;

    /* renamed from: f */
    public int f184457f;

    /* renamed from: g */
    public int f184458g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64577nc)) {
            return false;
        }
        C64577nc ncVar = (C64577nc) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184455d), Integer.valueOf(ncVar.f184455d)) && C46238a.m51546a(Integer.valueOf(this.f184456e), Integer.valueOf(ncVar.f184456e)) && C46238a.m51546a(Integer.valueOf(this.f184457f), Integer.valueOf(ncVar.f184457f)) && C46238a.m51546a(Integer.valueOf(this.f184458g), Integer.valueOf(ncVar.f184458g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184455d);
            aVar.mo74318e(2, this.f184456e);
            aVar.mo74318e(3, this.f184457f);
            aVar.mo74318e(4, this.f184458g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184455d) + 0 + C52418a.m58678e(2, this.f184456e) + C52418a.m58678e(3, this.f184457f) + C52418a.m58678e(4, this.f184458g);
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
                C64577nc ncVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ncVar.f184455d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    ncVar.f184456e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    ncVar.f184457f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    ncVar.f184458g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
