package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class du4 extends C101820nt3 {

    /* renamed from: d */
    public long f132538d;

    /* renamed from: e */
    public long f132539e;

    /* renamed from: f */
    public long f132540f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof du4)) {
            return false;
        }
        du4 du4 = (du4) aVar;
        return C46238a.m51546a(this.BaseRequest, du4.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f132538d), Long.valueOf(du4.f132538d)) && C46238a.m51546a(Long.valueOf(this.f132539e), Long.valueOf(du4.f132539e)) && C46238a.m51546a(Long.valueOf(this.f132540f), Long.valueOf(du4.f132540f));
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
            aVar.mo74321h(2, this.f132538d);
            aVar.mo74321h(3, this.f132539e);
            aVar.mo74321h(4, this.f132540f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f132538d) + C52418a.m58681h(3, this.f132539e) + C52418a.m58681h(4, this.f132540f);
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
            du4 du4 = objArr[1];
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
                    du4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                du4.f132538d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                du4.f132539e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                du4.f132540f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
