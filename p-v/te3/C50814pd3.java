package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pd3 */
public class C50814pd3 extends C47465a {

    /* renamed from: d */
    public C64234an2 f139708d;

    /* renamed from: e */
    public int f139709e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50814pd3)) {
            return false;
        }
        C50814pd3 pd32 = (C50814pd3) aVar;
        return C46238a.m51546a(this.f139708d, pd32.f139708d) && C46238a.m51546a(Integer.valueOf(this.f139709e), Integer.valueOf(pd32.f139709e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64234an2 an22 = this.f139708d;
            if (an22 != null) {
                aVar.mo74322i(1, an22.computeSize());
                this.f139708d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f139709e);
            return 0;
        } else if (i == 1) {
            C64234an2 an23 = this.f139708d;
            if (an23 != null) {
                i2 = 0 + C52418a.m58682i(1, an23.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f139709e);
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
            C50814pd3 pd32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64234an2 an24 = new C64234an2();
                    if (bArr != null && bArr.length > 0) {
                        an24.parseFrom(bArr);
                    }
                    pd32.f139708d = an24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                pd32.f139709e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
