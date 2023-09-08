package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class ic4 extends C47465a {

    /* renamed from: d */
    public long f135223d;

    /* renamed from: e */
    public int f135224e;

    /* renamed from: f */
    public C51018qv3 f135225f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ic4)) {
            return false;
        }
        ic4 ic4 = (ic4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f135223d), Long.valueOf(ic4.f135223d)) && C46238a.m51546a(Integer.valueOf(this.f135224e), Integer.valueOf(ic4.f135224e)) && C46238a.m51546a(this.f135225f, ic4.f135225f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135225f != null) {
                aVar.mo74321h(1, this.f135223d);
                aVar.mo74318e(2, this.f135224e);
                C51018qv3 qv32 = this.f135225f;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f135225f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: OpContent");
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f135223d) + 0 + C52418a.m58678e(2, this.f135224e);
            C51018qv3 qv33 = this.f135225f;
            return qv33 != null ? h + C52418a.m58682i(3, qv33.computeSize()) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135225f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: OpContent");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            ic4 ic4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ic4.f135223d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                ic4.f135224e = aVar3.mo141629g(intValue);
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
                    ic4.f135225f = qv34;
                }
                return 0;
            }
        }
    }
}
