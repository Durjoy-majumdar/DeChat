package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sa3 */
public class C51217sa3 extends C47465a {

    /* renamed from: d */
    public C50739ov2 f141410d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C51217sa3) && C46238a.m51546a(this.f141410d, ((C51217sa3) aVar).f141410d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C50739ov2 ov22 = this.f141410d;
            if (ov22 != null) {
                aVar.mo74322i(1, ov22.computeSize());
                this.f141410d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C50739ov2 ov23 = this.f141410d;
            if (ov23 != null) {
                return 0 + C52418a.m58682i(1, ov23.computeSize());
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
            C51217sa3 sa32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C50739ov2 ov24 = new C50739ov2();
                if (bArr != null && bArr.length > 0) {
                    ov24.parseFrom(bArr);
                }
                sa32.f141410d = ov24;
            }
            return 0;
        }
    }
}
