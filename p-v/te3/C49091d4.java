package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d4 */
public class C49091d4 extends C47465a {

    /* renamed from: d */
    public int f132101d;

    /* renamed from: e */
    public long f132102e;

    /* renamed from: f */
    public C51018qv3 f132103f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49091d4)) {
            return false;
        }
        C49091d4 d4Var = (C49091d4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f132101d), Integer.valueOf(d4Var.f132101d)) && C46238a.m51546a(Long.valueOf(this.f132102e), Long.valueOf(d4Var.f132102e)) && C46238a.m51546a(this.f132103f, d4Var.f132103f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f132101d);
            aVar.mo74321h(2, this.f132102e);
            C51018qv3 qv32 = this.f132103f;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f132103f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f132101d) + 0 + C52418a.m58681h(2, this.f132102e);
            C51018qv3 qv33 = this.f132103f;
            return qv33 != null ? e + C52418a.m58682i(3, qv33.computeSize()) : e;
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
            C49091d4 d4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d4Var.f132101d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                d4Var.f132102e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
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
                    d4Var.f132103f = qv34;
                }
                return 0;
            }
        }
    }
}
