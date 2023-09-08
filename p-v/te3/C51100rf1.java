package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rf1 */
public class C51100rf1 extends C47465a {

    /* renamed from: d */
    public int f140879d;

    /* renamed from: e */
    public C51966xf1 f140880e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51100rf1)) {
            return false;
        }
        C51100rf1 rf12 = (C51100rf1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140879d), Integer.valueOf(rf12.f140879d)) && C46238a.m51546a(this.f140880e, rf12.f140880e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140879d);
            C51966xf1 xf12 = this.f140880e;
            if (xf12 != null) {
                aVar.mo74322i(50, xf12.computeSize());
                this.f140880e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f140879d) + 0;
            C51966xf1 xf13 = this.f140880e;
            return xf13 != null ? e + C52418a.m58682i(50, xf13.computeSize()) : e;
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
            C51100rf1 rf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rf12.f140879d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 50) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C51966xf1 xf14 = new C51966xf1();
                    if (bArr != null && bArr.length > 0) {
                        xf14.parseFrom(bArr);
                    }
                    rf12.f140880e = xf14;
                }
                return 0;
            }
        }
    }
}
