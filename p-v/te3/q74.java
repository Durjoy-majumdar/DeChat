package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class q74 extends C101820nt3 {

    /* renamed from: d */
    public long f140174d;

    /* renamed from: e */
    public int f140175e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q74)) {
            return false;
        }
        q74 q74 = (q74) aVar;
        return C46238a.m51546a(this.BaseRequest, q74.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f140174d), Long.valueOf(q74.f140174d)) && C46238a.m51546a(Integer.valueOf(this.f140175e), Integer.valueOf(q74.f140175e));
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
            aVar.mo74321h(2, this.f140174d);
            aVar.mo74318e(3, this.f140175e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f140174d) + C52418a.m58678e(3, this.f140175e);
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
            q74 q74 = objArr[1];
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
                    q74.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                q74.f140174d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                q74.f140175e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
