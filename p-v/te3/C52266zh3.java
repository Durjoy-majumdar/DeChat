package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zh3 */
public class C52266zh3 extends C47465a {

    /* renamed from: d */
    public C48720ai3 f145963d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C52266zh3) && C46238a.m51546a(this.f145963d, ((C52266zh3) aVar).f145963d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48720ai3 ai32 = this.f145963d;
            if (ai32 != null) {
                aVar.mo74322i(1, ai32.computeSize());
                this.f145963d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C48720ai3 ai33 = this.f145963d;
            if (ai33 != null) {
                return 0 + C52418a.m58682i(1, ai33.computeSize());
            }
            return 0;
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
            C52266zh3 zh32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C48720ai3 ai34 = new C48720ai3();
                if (bArr != null && bArr.length > 0) {
                    ai34.parseFrom(bArr);
                }
                zh32.f145963d = ai34;
            }
            return 0;
        }
    }
}
