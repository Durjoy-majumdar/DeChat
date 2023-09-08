package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class px4 extends C47465a {

    /* renamed from: d */
    public String f140045d;

    /* renamed from: e */
    public String f140046e;

    /* renamed from: f */
    public int f140047f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof px4)) {
            return false;
        }
        px4 px4 = (px4) aVar;
        return C46238a.m51546a(this.f140045d, px4.f140045d) && C46238a.m51546a(this.f140046e, px4.f140046e) && C46238a.m51546a(Integer.valueOf(this.f140047f), Integer.valueOf(px4.f140047f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140045d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f140046e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f140047f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f140045d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140046e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f140047f);
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
            px4 px4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                px4.f140045d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                px4.f140046e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                px4.f140047f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
