package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f40 */
public class C49376f40 extends C47465a {

    /* renamed from: d */
    public C49160dl f133278d;

    /* renamed from: e */
    public C50232l93 f133279e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49376f40)) {
            return false;
        }
        C49376f40 f402 = (C49376f40) aVar;
        return C46238a.m51546a(this.f133278d, f402.f133278d) && C46238a.m51546a(this.f133279e, f402.f133279e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49160dl dlVar = this.f133278d;
            if (dlVar != null) {
                aVar.mo74322i(1, dlVar.computeSize());
                this.f133278d.writeFields(aVar);
            }
            C50232l93 l932 = this.f133279e;
            if (l932 != null) {
                aVar.mo74322i(2, l932.computeSize());
                this.f133279e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49160dl dlVar2 = this.f133278d;
            if (dlVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dlVar2.computeSize());
            }
            C50232l93 l933 = this.f133279e;
            return l933 != null ? i2 + C52418a.m58682i(2, l933.computeSize()) : i2;
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
            C49376f40 f402 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49160dl dlVar3 = new C49160dl();
                    if (bArr != null && bArr.length > 0) {
                        dlVar3.parseFrom(bArr);
                    }
                    f402.f133278d = dlVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50232l93 l934 = new C50232l93();
                    if (bArr2 != null && bArr2.length > 0) {
                        l934.parseFrom(bArr2);
                    }
                    f402.f133279e = l934;
                }
                return 0;
            }
        }
    }
}
