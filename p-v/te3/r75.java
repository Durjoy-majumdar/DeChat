package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class r75 extends C47465a {

    /* renamed from: d */
    public e75 f140751d;

    /* renamed from: e */
    public int f140752e;

    /* renamed from: f */
    public int f140753f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof r75)) {
            return false;
        }
        r75 r75 = (r75) aVar;
        return C46238a.m51546a(this.f140751d, r75.f140751d) && C46238a.m51546a(Integer.valueOf(this.f140752e), Integer.valueOf(r75.f140752e)) && C46238a.m51546a(Integer.valueOf(this.f140753f), Integer.valueOf(r75.f140753f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            e75 e75 = this.f140751d;
            if (e75 != null) {
                aVar.mo74322i(1, e75.computeSize());
                this.f140751d.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f140752e);
            aVar.mo74318e(3, this.f140753f);
            return 0;
        } else if (i == 1) {
            e75 e752 = this.f140751d;
            if (e752 != null) {
                i2 = 0 + C52418a.m58682i(1, e752.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f140752e) + C52418a.m58678e(3, this.f140753f);
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
            r75 r75 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    e75 e753 = new e75();
                    if (bArr != null && bArr.length > 0) {
                        e753.parseFrom(bArr);
                    }
                    r75.f140751d = e753;
                }
                return 0;
            } else if (intValue == 2) {
                r75.f140752e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                r75.f140753f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
