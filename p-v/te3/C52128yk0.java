package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yk0 */
public class C52128yk0 extends C47465a {

    /* renamed from: d */
    public int f145339d;

    /* renamed from: e */
    public C50019jp1 f145340e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52128yk0)) {
            return false;
        }
        C52128yk0 yk02 = (C52128yk0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f145339d), Integer.valueOf(yk02.f145339d)) && C46238a.m51546a(this.f145340e, yk02.f145340e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f145339d);
            C50019jp1 jp12 = this.f145340e;
            if (jp12 != null) {
                aVar.mo74322i(2, jp12.computeSize());
                this.f145340e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f145339d) + 0;
            C50019jp1 jp13 = this.f145340e;
            return jp13 != null ? e + C52418a.m58682i(2, jp13.computeSize()) : e;
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
            C52128yk0 yk02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                yk02.f145339d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50019jp1 jp14 = new C50019jp1();
                    if (bArr != null && bArr.length > 0) {
                        jp14.parseFrom(bArr);
                    }
                    yk02.f145340e = jp14;
                }
                return 0;
            }
        }
    }
}
