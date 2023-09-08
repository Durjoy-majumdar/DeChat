package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class cx4 extends C47465a {

    /* renamed from: d */
    public dw4 f132015d;

    /* renamed from: e */
    public int f132016e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof cx4)) {
            return false;
        }
        cx4 cx4 = (cx4) aVar;
        return C46238a.m51546a(this.f132015d, cx4.f132015d) && C46238a.m51546a(Integer.valueOf(this.f132016e), Integer.valueOf(cx4.f132016e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            dw4 dw4 = this.f132015d;
            if (dw4 != null) {
                if (dw4 != null) {
                    aVar.mo74322i(1, dw4.computeSize());
                    this.f132015d.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f132016e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i == 1) {
            dw4 dw42 = this.f132015d;
            if (dw42 != null) {
                i2 = 0 + C52418a.m58682i(1, dw42.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f132016e);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132015d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            cx4 cx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    dw4 dw43 = new dw4();
                    if (bArr != null && bArr.length > 0) {
                        dw43.parseFrom(bArr);
                    }
                    cx4.f132015d = dw43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                cx4.f132016e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
