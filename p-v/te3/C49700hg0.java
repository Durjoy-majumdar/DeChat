package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hg0 */
public class C49700hg0 extends C47465a {

    /* renamed from: d */
    public int f134610d;

    /* renamed from: e */
    public C49739hq0 f134611e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49700hg0)) {
            return false;
        }
        C49700hg0 hg02 = (C49700hg0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134610d), Integer.valueOf(hg02.f134610d)) && C46238a.m51546a(this.f134611e, hg02.f134611e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134610d);
            C49739hq0 hq02 = this.f134611e;
            if (hq02 != null) {
                aVar.mo74322i(2, hq02.computeSize());
                this.f134611e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134610d) + 0;
            C49739hq0 hq03 = this.f134611e;
            return hq03 != null ? e + C52418a.m58682i(2, hq03.computeSize()) : e;
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
            C49700hg0 hg02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                hg02.f134610d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C49739hq0 hq04 = new C49739hq0();
                    if (bArr != null && bArr.length > 0) {
                        hq04.parseFrom(bArr);
                    }
                    hg02.f134611e = hq04;
                }
                return 0;
            }
        }
    }
}
