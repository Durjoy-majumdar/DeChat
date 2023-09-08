package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class nf4 extends C47465a {

    /* renamed from: d */
    public int f138585d;

    /* renamed from: e */
    public C51018qv3 f138586e;

    /* renamed from: f */
    public int f138587f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof nf4)) {
            return false;
        }
        nf4 nf4 = (nf4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138585d), Integer.valueOf(nf4.f138585d)) && C46238a.m51546a(this.f138586e, nf4.f138586e) && C46238a.m51546a(Integer.valueOf(this.f138587f), Integer.valueOf(nf4.f138587f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138585d);
            C51018qv3 qv32 = this.f138586e;
            if (qv32 != null) {
                aVar.mo74322i(2, qv32.computeSize());
                this.f138586e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f138587f);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138585d) + 0;
            C51018qv3 qv33 = this.f138586e;
            if (qv33 != null) {
                e += C52418a.m58682i(2, qv33.computeSize());
            }
            return e + C52418a.m58678e(3, this.f138587f);
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
            nf4 nf4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                nf4.f138585d = aVar3.mo141629g(intValue);
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
                    nf4.f138586e = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                nf4.f138587f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
