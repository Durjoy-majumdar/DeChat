package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vx2 */
public class C64788vx2 extends C47465a {

    /* renamed from: d */
    public String f186009d;

    /* renamed from: e */
    public String f186010e;

    /* renamed from: f */
    public int f186011f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64788vx2)) {
            return false;
        }
        C64788vx2 vx22 = (C64788vx2) aVar;
        return C46238a.m51546a(this.f186009d, vx22.f186009d) && C46238a.m51546a(this.f186010e, vx22.f186010e) && C46238a.m51546a(Integer.valueOf(this.f186011f), Integer.valueOf(vx22.f186011f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186009d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186010e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f186011f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f186009d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f186010e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f186011f);
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
            C64788vx2 vx22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vx22.f186009d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vx22.f186010e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vx22.f186011f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
