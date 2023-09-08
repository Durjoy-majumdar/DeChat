package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ik3 */
public class C49861ik3 extends C101820nt3 {

    /* renamed from: d */
    public long f135433d;

    /* renamed from: e */
    public long f135434e;

    /* renamed from: f */
    public long f135435f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49861ik3)) {
            return false;
        }
        C49861ik3 ik32 = (C49861ik3) aVar;
        return C46238a.m51546a(this.BaseRequest, ik32.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f135433d), Long.valueOf(ik32.f135433d)) && C46238a.m51546a(Long.valueOf(this.f135434e), Long.valueOf(ik32.f135434e)) && C46238a.m51546a(Long.valueOf(this.f135435f), Long.valueOf(ik32.f135435f));
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
            aVar.mo74321h(2, this.f135433d);
            aVar.mo74321h(3, this.f135434e);
            aVar.mo74321h(4, this.f135435f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f135433d) + C52418a.m58681h(3, this.f135434e) + C52418a.m58681h(4, this.f135435f);
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
            C49861ik3 ik32 = objArr[1];
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
                    ik32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ik32.f135433d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                ik32.f135434e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ik32.f135435f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
