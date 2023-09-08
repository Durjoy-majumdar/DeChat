package u41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.u */
public class C52441u extends C47465a {

    /* renamed from: d */
    public int f146549d;

    /* renamed from: e */
    public int f146550e;

    /* renamed from: f */
    public int f146551f;

    /* renamed from: g */
    public int f146552g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52441u)) {
            return false;
        }
        C52441u uVar = (C52441u) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146549d), Integer.valueOf(uVar.f146549d)) && C46238a.m51546a(Integer.valueOf(this.f146550e), Integer.valueOf(uVar.f146550e)) && C46238a.m51546a(Integer.valueOf(this.f146551f), Integer.valueOf(uVar.f146551f)) && C46238a.m51546a(Integer.valueOf(this.f146552g), Integer.valueOf(uVar.f146552g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146549d);
            aVar.mo74318e(2, this.f146550e);
            aVar.mo74318e(3, this.f146551f);
            aVar.mo74318e(4, this.f146552g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f146549d) + 0 + C52418a.m58678e(2, this.f146550e) + C52418a.m58678e(3, this.f146551f) + C52418a.m58678e(4, this.f146552g);
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
                C52441u uVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    uVar.f146549d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    uVar.f146550e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 3) {
                    uVar.f146551f = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    uVar.f146552g = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
