package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class pf4 extends C47465a {

    /* renamed from: d */
    public int f139744d;

    /* renamed from: e */
    public C51018qv3 f139745e;

    /* renamed from: f */
    public int f139746f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pf4)) {
            return false;
        }
        pf4 pf4 = (pf4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139744d), Integer.valueOf(pf4.f139744d)) && C46238a.m51546a(this.f139745e, pf4.f139745e) && C46238a.m51546a(Integer.valueOf(this.f139746f), Integer.valueOf(pf4.f139746f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139744d);
            C51018qv3 qv32 = this.f139745e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f139745e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139746f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139744d) + 0;
            C51018qv3 qv33 = this.f139745e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f139746f);
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
            pf4 pf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                pf4.f139744d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    pf4.f139745e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                pf4.f139746f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
