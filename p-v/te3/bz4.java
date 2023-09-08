package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bz4 extends C47465a {

    /* renamed from: d */
    public String f182349d;

    /* renamed from: e */
    public String f182350e;

    /* renamed from: f */
    public int f182351f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bz4)) {
            return false;
        }
        bz4 bz4 = (bz4) aVar;
        return C46238a.m51546a(this.f182349d, bz4.f182349d) && C46238a.m51546a(this.f182350e, bz4.f182350e) && C46238a.m51546a(Integer.valueOf(this.f182351f), Integer.valueOf(bz4.f182351f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182349d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182350e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f182351f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f182349d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f182350e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f182351f);
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
            bz4 bz4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bz4.f182349d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bz4.f182350e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bz4.f182351f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
