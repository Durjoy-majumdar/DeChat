package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ta2 */
public class C51368ta2 extends C101820nt3 {

    /* renamed from: d */
    public C89349b f142078d;

    /* renamed from: e */
    public boolean f142079e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51368ta2)) {
            return false;
        }
        C51368ta2 ta22 = (C51368ta2) aVar;
        return C46238a.m51546a(this.BaseRequest, ta22.BaseRequest) && C46238a.m51546a(this.f142078d, ta22.f142078d) && C46238a.m51546a(Boolean.valueOf(this.f142079e), Boolean.valueOf(ta22.f142079e));
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
            C89349b bVar = this.f142078d;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74314a(3, this.f142079e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C89349b bVar2 = this.f142078d;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(2, bVar2);
            }
            return i2 + C52418a.m58674a(3, this.f142079e);
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
            C51368ta2 ta22 = objArr[1];
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
                    ta22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ta22.f142078d = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ta22.f142079e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
