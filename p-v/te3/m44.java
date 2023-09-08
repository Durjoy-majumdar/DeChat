package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m44 extends C47465a {

    /* renamed from: d */
    public int f184200d;

    /* renamed from: e */
    public C64638pv3 f184201e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m44)) {
            return false;
        }
        m44 m44 = (m44) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184200d), Integer.valueOf(m44.f184200d)) && C46238a.m51546a(this.f184201e, m44.f184201e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184200d);
            C64638pv3 pv32 = this.f184201e;
            if (pv32 != null) {
                aVar.mo74322i(2, pv32.computeSize());
                this.f184201e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184200d) + 0;
            C64638pv3 pv33 = this.f184201e;
            return pv33 != null ? e + C52418a.m58682i(2, pv33.computeSize()) : e;
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
            m44 m44 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m44.f184200d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64638pv3 pv34 = new C64638pv3();
                    if (bArr != null && bArr.length > 0) {
                        pv34.parseFrom(bArr);
                    }
                    m44.f184201e = pv34;
                }
                return 0;
            }
        }
    }
}
