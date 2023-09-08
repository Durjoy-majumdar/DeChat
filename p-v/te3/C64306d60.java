package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d60 */
public class C64306d60 extends C47465a {

    /* renamed from: d */
    public int f182634d;

    /* renamed from: e */
    public C51018qv3 f182635e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64306d60)) {
            return false;
        }
        C64306d60 d602 = (C64306d60) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f182634d), Integer.valueOf(d602.f182634d)) && C46238a.m51546a(this.f182635e, d602.f182635e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f182635e != null) {
                aVar.mo74318e(1, this.f182634d);
                C51018qv3 qv32 = this.f182635e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f182635e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Key");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f182634d) + 0;
            C51018qv3 qv33 = this.f182635e;
            return qv33 != null ? e + C52418a.m58682i(2, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182635e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Key");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64306d60 d602 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d602.f182634d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    d602.f182635e = qv34;
                }
                return 0;
            }
        }
    }
}
