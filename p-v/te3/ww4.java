package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ww4 extends C47465a {

    /* renamed from: d */
    public long f144328d;

    /* renamed from: e */
    public int f144329e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ww4)) {
            return false;
        }
        ww4 ww4 = (ww4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144328d), Long.valueOf(ww4.f144328d)) && C46238a.m51546a(Integer.valueOf(this.f144329e), Integer.valueOf(ww4.f144329e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144328d);
            aVar.mo74318e(2, this.f144329e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f144328d) + 0 + C52418a.m58678e(2, this.f144329e);
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
                ww4 ww4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    ww4.f144328d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    ww4.f144329e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
