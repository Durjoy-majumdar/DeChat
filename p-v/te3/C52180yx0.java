package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yx0 */
public class C52180yx0 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f145557d;

    /* renamed from: e */
    public int f145558e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52180yx0)) {
            return false;
        }
        C52180yx0 yx02 = (C52180yx0) aVar;
        return C46238a.m51546a(this.BaseRequest, yx02.BaseRequest) && C46238a.m51546a(this.f145557d, yx02.f145557d) && C46238a.m51546a(Integer.valueOf(this.f145558e), Integer.valueOf(yx02.f145558e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f145557d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f145557d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f145558e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C49842ig0 ig03 = this.f145557d;
            if (ig03 != null) {
                i2 += C52418a.m58682i(2, ig03.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f145558e);
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
            C52180yx0 yx02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    yx02.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49842ig0 ig04 = new C49842ig0();
                    if (bArr2 != null && bArr2.length > 0) {
                        ig04.parseFrom(bArr2);
                    }
                    yx02.f145557d = ig04;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                yx02.f145558e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
