package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a93 */
public class C48684a93 extends C47465a {

    /* renamed from: d */
    public int f130390d;

    /* renamed from: e */
    public C48825b93 f130391e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48684a93)) {
            return false;
        }
        C48684a93 a932 = (C48684a93) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f130390d), Integer.valueOf(a932.f130390d)) && C46238a.m51546a(this.f130391e, a932.f130391e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f130391e != null) {
                aVar.mo74318e(1, this.f130390d);
                C48825b93 b932 = this.f130391e;
                if (b932 != null) {
                    aVar.mo74322i(2, b932.computeSize());
                    this.f130391e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: OplogRet");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f130390d) + 0;
            C48825b93 b933 = this.f130391e;
            return b933 != null ? e + C52418a.m58682i(2, b933.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130391e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: OplogRet");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48684a93 a932 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a932.f130390d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48825b93 b934 = new C48825b93();
                    if (bArr != null && bArr.length > 0) {
                        b934.parseFrom(bArr);
                    }
                    a932.f130391e = b934;
                }
                return 0;
            }
        }
    }
}
