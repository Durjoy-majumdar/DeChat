package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class hx4 extends C47465a {

    /* renamed from: d */
    public ew4 f134949d;

    /* renamed from: e */
    public yw4 f134950e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hx4)) {
            return false;
        }
        hx4 hx4 = (hx4) aVar;
        return C46238a.m51546a(this.f134949d, hx4.f134949d) && C46238a.m51546a(this.f134950e, hx4.f134950e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            ew4 ew4 = this.f134949d;
            if (ew4 != null) {
                if (ew4 != null) {
                    aVar.mo74322i(1, ew4.computeSize());
                    this.f134949d.writeFields(aVar);
                }
                yw4 yw4 = this.f134950e;
                if (yw4 != null) {
                    aVar.mo74322i(2, yw4.computeSize());
                    this.f134950e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i == 1) {
            ew4 ew42 = this.f134949d;
            if (ew42 != null) {
                i2 = 0 + C52418a.m58682i(1, ew42.computeSize());
            }
            yw4 yw42 = this.f134950e;
            return yw42 != null ? i2 + C52418a.m58682i(2, yw42.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134949d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: base_response");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            hx4 hx4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ew4 ew43 = new ew4();
                    if (bArr != null && bArr.length > 0) {
                        ew43.parseFrom(bArr);
                    }
                    hx4.f134949d = ew43;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    yw4 yw43 = new yw4();
                    if (bArr2 != null && bArr2.length > 0) {
                        yw43.parseFrom(bArr2);
                    }
                    hx4.f134950e = yw43;
                }
                return 0;
            }
        }
    }
}
