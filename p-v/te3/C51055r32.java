package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r32 */
public class C51055r32 extends C101820nt3 {

    /* renamed from: d */
    public long f140684d;

    /* renamed from: e */
    public long f140685e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51055r32)) {
            return false;
        }
        C51055r32 r322 = (C51055r32) aVar;
        return C46238a.m51546a(this.BaseRequest, r322.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f140684d), Long.valueOf(r322.f140684d)) && C46238a.m51546a(Long.valueOf(this.f140685e), Long.valueOf(r322.f140685e));
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
            aVar.mo74321h(2, this.f140684d);
            aVar.mo74321h(3, this.f140685e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f140684d) + C52418a.m58681h(3, this.f140685e);
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
            C51055r32 r322 = objArr[1];
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
                    r322.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                r322.f140684d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                r322.f140685e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
