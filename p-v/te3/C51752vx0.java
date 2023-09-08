package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vx0 */
public class C51752vx0 extends C47465a {

    /* renamed from: d */
    public w44 f143755d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51752vx0) && C46238a.m51546a(this.f143755d, ((C51752vx0) aVar).f143755d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            w44 w44 = this.f143755d;
            if (w44 != null) {
                aVar.mo74322i(1, w44.computeSize());
                this.f143755d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            w44 w442 = this.f143755d;
            if (w442 != null) {
                return 0 + C52418a.m58682i(1, w442.computeSize());
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
            C51752vx0 vx02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                w44 w443 = new w44();
                if (bArr != null && bArr.length > 0) {
                    w443.parseFrom(bArr);
                }
                vx02.f143755d = w443;
            }
            return 0;
        }
    }
}
