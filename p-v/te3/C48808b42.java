package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b42 */
public class C48808b42 extends C101820nt3 {

    /* renamed from: d */
    public int f130932d;

    /* renamed from: e */
    public int f130933e;

    /* renamed from: f */
    public double f130934f;

    /* renamed from: g */
    public double f130935g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48808b42)) {
            return false;
        }
        C48808b42 b422 = (C48808b42) aVar;
        return C46238a.m51546a(this.BaseRequest, b422.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f130932d), Integer.valueOf(b422.f130932d)) && C46238a.m51546a(Integer.valueOf(this.f130933e), Integer.valueOf(b422.f130933e)) && C46238a.m51546a(Double.valueOf(this.f130934f), Double.valueOf(b422.f130934f)) && C46238a.m51546a(Double.valueOf(this.f130935g), Double.valueOf(b422.f130935g));
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
            aVar.mo74318e(2, this.f130932d);
            aVar.mo74318e(3, this.f130933e);
            aVar.mo74316c(4, this.f130934f);
            aVar.mo74316c(5, this.f130935g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f130932d) + C52418a.m58678e(3, this.f130933e) + C52418a.m58676c(4, this.f130934f) + C52418a.m58676c(5, this.f130935g);
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
            C48808b42 b422 = objArr[1];
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
                    b422.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b422.f130932d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                b422.f130933e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                b422.f130934f = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b422.f130935g = aVar3.mo141627e(intValue);
                return 0;
            }
        }
    }
}
