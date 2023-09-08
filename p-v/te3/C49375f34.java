package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.f34 */
public class C49375f34 extends C101820nt3 {

    /* renamed from: d */
    public int f133272d;

    /* renamed from: e */
    public long f133273e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49375f34)) {
            return false;
        }
        C49375f34 f342 = (C49375f34) aVar;
        return C46238a.m51546a(this.BaseRequest, f342.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f133272d), Integer.valueOf(f342.f133272d)) && C46238a.m51546a(Long.valueOf(this.f133273e), Long.valueOf(f342.f133273e));
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
            aVar.mo74318e(2, this.f133272d);
            aVar.mo74321h(3, this.f133273e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133272d) + C52418a.m58681h(3, this.f133273e);
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
            C49375f34 f342 = objArr[1];
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
                    f342.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                f342.f133272d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                f342.f133273e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
