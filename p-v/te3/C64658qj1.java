package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qj1 */
public class C64658qj1 extends C47465a {

    /* renamed from: d */
    public long f185037d;

    /* renamed from: e */
    public long f185038e;

    /* renamed from: f */
    public C64682rk1 f185039f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64658qj1)) {
            return false;
        }
        C64658qj1 qj12 = (C64658qj1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f185037d), Long.valueOf(qj12.f185037d)) && C46238a.m51546a(Long.valueOf(this.f185038e), Long.valueOf(qj12.f185038e)) && C46238a.m51546a(this.f185039f, qj12.f185039f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f185037d);
            aVar.mo74321h(2, this.f185038e);
            C64682rk1 rk12 = this.f185039f;
            if (rk12 != null) {
                aVar.mo74322i(3, rk12.computeSize());
                this.f185039f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f185037d) + 0 + C52418a.m58681h(2, this.f185038e);
            C64682rk1 rk13 = this.f185039f;
            return rk13 != null ? h + C52418a.m58682i(3, rk13.computeSize()) : h;
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
            C64658qj1 qj12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qj12.f185037d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                qj12.f185038e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64682rk1 rk14 = new C64682rk1();
                    if (bArr != null && bArr.length > 0) {
                        rk14.parseFrom(bArr);
                    }
                    qj12.f185039f = rk14;
                }
                return 0;
            }
        }
    }
}
