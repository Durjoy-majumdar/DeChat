package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vu0 */
public class C51741vu0 extends C47465a {

    /* renamed from: d */
    public String f143698d;

    /* renamed from: e */
    public C50263lh1 f143699e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51741vu0)) {
            return false;
        }
        C51741vu0 vu02 = (C51741vu0) aVar;
        return C46238a.m51546a(this.f143698d, vu02.f143698d) && C46238a.m51546a(this.f143699e, vu02.f143699e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143698d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C50263lh1 lh12 = this.f143699e;
            if (lh12 != null) {
                aVar.mo74322i(2, lh12.computeSize());
                this.f143699e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f143698d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C50263lh1 lh13 = this.f143699e;
            return lh13 != null ? i2 + C52418a.m58682i(2, lh13.computeSize()) : i2;
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
            C51741vu0 vu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vu02.f143698d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C50263lh1 lh14 = new C50263lh1();
                    if (bArr != null && bArr.length > 0) {
                        lh14.parseFrom(bArr);
                    }
                    vu02.f143699e = lh14;
                }
                return 0;
            }
        }
    }
}
