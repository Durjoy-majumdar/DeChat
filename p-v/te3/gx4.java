package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class gx4 extends C47465a {

    /* renamed from: d */
    public dw4 f134346d;

    /* renamed from: e */
    public String f134347e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof gx4)) {
            return false;
        }
        gx4 gx4 = (gx4) aVar;
        return C46238a.m51546a(this.f134346d, gx4.f134346d) && C46238a.m51546a(this.f134347e, gx4.f134347e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            dw4 dw4 = this.f134346d;
            if (dw4 != null) {
                if (dw4 != null) {
                    aVar.mo74322i(1, dw4.computeSize());
                    this.f134346d.writeFields(aVar);
                }
                String str = this.f134347e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i == 1) {
            dw4 dw42 = this.f134346d;
            if (dw42 != null) {
                i2 = 0 + C52418a.m58682i(1, dw42.computeSize());
            }
            String str2 = this.f134347e;
            return str2 != null ? i2 + C52418a.m58683j(2, str2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134346d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_request");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            gx4 gx4 = objArr[1];
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
                    gx4.f134346d = dw43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                gx4.f134347e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
