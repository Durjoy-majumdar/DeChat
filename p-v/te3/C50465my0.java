package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.my0 */
public class C50465my0 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f138283d;

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50465my0) && C46238a.m51546a(this.f138283d, ((C50465my0) aVar).f138283d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f138283d;
            if (hx02 != null) {
                aVar.mo74322i(1, hx02.computeSize());
                this.f138283d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f138283d;
            if (hx03 != null) {
                return 0 + C52418a.m58682i(1, hx03.computeSize());
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
            C50465my0 my02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 1) {
                return -1;
            }
            LinkedList<byte[]> j = aVar3.mo141632j(intValue);
            int size = j.size();
            for (int i2 = 0; i2 < size; i2++) {
                byte[] bArr = j.get(i2);
                C49765hx0 hx04 = new C49765hx0();
                if (bArr != null && bArr.length > 0) {
                    hx04.parseFrom(bArr);
                }
                my02.f138283d = hx04;
            }
            return 0;
        }
    }
}
