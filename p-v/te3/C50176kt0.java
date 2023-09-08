package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kt0 */
public class C50176kt0 extends C47465a {

    /* renamed from: d */
    public C89349b f137033d;

    /* renamed from: e */
    public C49906iw0 f137034e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50176kt0)) {
            return false;
        }
        C50176kt0 kt02 = (C50176kt0) aVar;
        return C46238a.m51546a(this.f137033d, kt02.f137033d) && C46238a.m51546a(this.f137034e, kt02.f137034e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C89349b bVar = this.f137033d;
            if (bVar != null) {
                aVar.mo74315b(1, bVar);
            }
            C49906iw0 iw02 = this.f137034e;
            if (iw02 != null) {
                aVar.mo74322i(106, iw02.computeSize());
                this.f137034e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C89349b bVar2 = this.f137033d;
            if (bVar2 != null) {
                i2 = 0 + C52418a.m58675b(1, bVar2);
            }
            C49906iw0 iw03 = this.f137034e;
            return iw03 != null ? i2 + C52418a.m58682i(106, iw03.computeSize()) : i2;
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
            C50176kt0 kt02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                kt02.f137033d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 106) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49906iw0 iw04 = new C49906iw0();
                    if (bArr != null && bArr.length > 0) {
                        iw04.parseFrom(bArr);
                    }
                    kt02.f137034e = iw04;
                }
                return 0;
            }
        }
    }
}
