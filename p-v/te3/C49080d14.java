package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d14 */
public class C49080d14 extends C47465a {

    /* renamed from: d */
    public C51696vh2 f132068d;

    /* renamed from: e */
    public long f132069e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49080d14)) {
            return false;
        }
        C49080d14 d142 = (C49080d14) aVar;
        return C46238a.m51546a(this.f132068d, d142.f132068d) && C46238a.m51546a(Long.valueOf(this.f132069e), Long.valueOf(d142.f132069e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51696vh2 vh22 = this.f132068d;
            if (vh22 != null) {
                aVar.mo74322i(1, vh22.computeSize());
                this.f132068d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f132069e);
            return 0;
        } else if (i == 1) {
            C51696vh2 vh23 = this.f132068d;
            if (vh23 != null) {
                i2 = 0 + C52418a.m58682i(1, vh23.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f132069e);
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
            C49080d14 d142 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51696vh2 vh24 = new C51696vh2();
                    if (bArr != null && bArr.length > 0) {
                        vh24.parseFrom(bArr);
                    }
                    d142.f132068d = vh24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                d142.f132069e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
