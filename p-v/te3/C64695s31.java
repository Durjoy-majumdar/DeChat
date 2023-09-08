package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s31 */
public class C64695s31 extends C47465a {

    /* renamed from: d */
    public int f185323d;

    /* renamed from: e */
    public C64813wr2 f185324e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64695s31)) {
            return false;
        }
        C64695s31 s312 = (C64695s31) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f185323d), Integer.valueOf(s312.f185323d)) && C46238a.m51546a(this.f185324e, s312.f185324e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f185323d);
            C64813wr2 wr22 = this.f185324e;
            if (wr22 != null) {
                aVar.mo74322i(2, wr22.computeSize());
                this.f185324e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f185323d) + 0;
            C64813wr2 wr23 = this.f185324e;
            return wr23 != null ? e + C52418a.m58682i(2, wr23.computeSize()) : e;
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
            C64695s31 s312 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                s312.f185323d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64813wr2 wr24 = new C64813wr2();
                    if (bArr != null && bArr.length > 0) {
                        wr24.parseFrom(bArr);
                    }
                    s312.f185324e = wr24;
                }
                return 0;
            }
        }
    }
}
