package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m12 */
public class C50337m12 extends C47465a {

    /* renamed from: d */
    public int f137747d;

    /* renamed from: e */
    public int f137748e;

    /* renamed from: f */
    public C49697hf2 f137749f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50337m12)) {
            return false;
        }
        C50337m12 m122 = (C50337m12) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137747d), Integer.valueOf(m122.f137747d)) && C46238a.m51546a(Integer.valueOf(this.f137748e), Integer.valueOf(m122.f137748e)) && C46238a.m51546a(this.f137749f, m122.f137749f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f137749f != null) {
                aVar.mo74318e(1, this.f137747d);
                aVar.mo74318e(2, this.f137748e);
                C49697hf2 hf22 = this.f137749f;
                if (hf22 != null) {
                    aVar.mo74322i(3, hf22.computeSize());
                    this.f137749f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Device");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137747d) + 0 + C52418a.m58678e(2, this.f137748e);
            C49697hf2 hf23 = this.f137749f;
            return hf23 != null ? e + C52418a.m58682i(3, hf23.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137749f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Device");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50337m12 m122 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m122.f137747d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                m122.f137748e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49697hf2 hf24 = new C49697hf2();
                    if (bArr != null && bArr.length > 0) {
                        hf24.parseFrom(bArr);
                    }
                    m122.f137749f = hf24;
                }
                return 0;
            }
        }
    }
}
