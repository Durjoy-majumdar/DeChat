package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.uu0 */
public class C64759uu0 extends C47465a {

    /* renamed from: d */
    public C64359f71 f185793d;

    /* renamed from: e */
    public C64387g71 f185794e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64759uu0)) {
            return false;
        }
        C64759uu0 uu02 = (C64759uu0) aVar;
        return C46238a.m51546a(this.f185793d, uu02.f185793d) && C46238a.m51546a(this.f185794e, uu02.f185794e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64359f71 f712 = this.f185793d;
            if (f712 != null) {
                aVar.mo74322i(1, f712.computeSize());
                this.f185793d.writeFields(aVar);
            }
            C64387g71 g712 = this.f185794e;
            if (g712 != null) {
                aVar.mo74322i(2, g712.computeSize());
                this.f185794e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C64359f71 f713 = this.f185793d;
            if (f713 != null) {
                i2 = 0 + C52418a.m58682i(1, f713.computeSize());
            }
            C64387g71 g713 = this.f185794e;
            return g713 != null ? i2 + C52418a.m58682i(2, g713.computeSize()) : i2;
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
            C64759uu0 uu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64359f71 f714 = new C64359f71();
                    if (bArr != null && bArr.length > 0) {
                        f714.parseFrom(bArr);
                    }
                    uu02.f185793d = f714;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64387g71 g714 = new C64387g71();
                    if (bArr2 != null && bArr2.length > 0) {
                        g714.parseFrom(bArr2);
                    }
                    uu02.f185794e = g714;
                }
                return 0;
            }
        }
    }
}
