package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ec */
public class C49260ec extends C101820nt3 {

    /* renamed from: d */
    public long f132841d;

    /* renamed from: e */
    public C89349b f132842e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49260ec)) {
            return false;
        }
        C49260ec ecVar = (C49260ec) aVar;
        return C46238a.m51546a(this.BaseRequest, ecVar.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f132841d), Long.valueOf(ecVar.f132841d)) && C46238a.m51546a(this.f132842e, ecVar.f132842e);
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
            aVar.mo74321h(2, this.f132841d);
            C89349b bVar = this.f132842e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f132841d);
            C89349b bVar2 = this.f132842e;
            return bVar2 != null ? h + C52418a.m58675b(3, bVar2) : h;
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
            C49260ec ecVar = objArr[1];
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
                    ecVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ecVar.f132841d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ecVar.f132842e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
