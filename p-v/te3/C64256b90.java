package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b90 */
public class C64256b90 extends C47465a {

    /* renamed from: d */
    public String f182241d;

    /* renamed from: e */
    public String f182242e;

    /* renamed from: f */
    public long f182243f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64256b90)) {
            return false;
        }
        C64256b90 b902 = (C64256b90) aVar;
        return C46238a.m51546a(this.f182241d, b902.f182241d) && C46238a.m51546a(this.f182242e, b902.f182242e) && C46238a.m51546a(Long.valueOf(this.f182243f), Long.valueOf(b902.f182243f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182241d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f182242e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f182243f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f182241d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f182242e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f182243f);
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
            C64256b90 b902 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b902.f182241d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                b902.f182242e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                b902.f182243f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
