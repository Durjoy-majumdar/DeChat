package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class hf4 extends C47465a {

    /* renamed from: d */
    public int f134600d;

    /* renamed from: e */
    public C51163rv3 f134601e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hf4)) {
            return false;
        }
        hf4 hf4 = (hf4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134600d), Integer.valueOf(hf4.f134600d)) && C46238a.m51546a(this.f134601e, hf4.f134601e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134601e != null) {
                aVar.mo74318e(1, this.f134600d);
                C51163rv3 rv32 = this.f134601e;
                if (rv32 != null) {
                    aVar.mo74322i(2, rv32.computeSize());
                    this.f134601e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: StatReport");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134600d) + 0;
            C51163rv3 rv33 = this.f134601e;
            return rv33 != null ? e + C52418a.m58682i(2, rv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134601e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: StatReport");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            hf4 hf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hf4.f134600d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51163rv3 rv34 = new C51163rv3();
                    if (bArr != null && bArr.length > 0) {
                        rv34.mo73356d(bArr);
                    }
                    hf4.f134601e = rv34;
                }
                return 0;
            }
        }
    }
}
