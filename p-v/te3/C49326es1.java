package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.es1 */
public class C49326es1 extends C47465a {

    /* renamed from: d */
    public int f133100d;

    /* renamed from: e */
    public int f133101e;

    /* renamed from: f */
    public e65 f133102f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49326es1)) {
            return false;
        }
        C49326es1 es12 = (C49326es1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f133100d), Integer.valueOf(es12.f133100d)) && C46238a.m51546a(Integer.valueOf(this.f133101e), Integer.valueOf(es12.f133101e)) && C46238a.m51546a(this.f133102f, es12.f133102f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f133100d);
            aVar.mo74318e(2, this.f133101e);
            e65 e65 = this.f133102f;
            if (e65 != null) {
                aVar.mo74322i(3, e65.computeSize());
                this.f133102f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f133100d) + 0 + C52418a.m58678e(2, this.f133101e);
            e65 e652 = this.f133102f;
            return e652 != null ? e + C52418a.m58682i(3, e652.computeSize()) : e;
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
            C49326es1 es12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                es12.f133100d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                es12.f133101e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    e65 e653 = new e65();
                    if (bArr != null && bArr.length > 0) {
                        e653.parseFrom(bArr);
                    }
                    es12.f133102f = e653;
                }
                return 0;
            }
        }
    }
}
