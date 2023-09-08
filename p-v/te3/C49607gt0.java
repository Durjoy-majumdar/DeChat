package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gt0 */
public class C49607gt0 extends C47465a {

    /* renamed from: d */
    public C49765hx0 f134255d;

    /* renamed from: e */
    public String f134256e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49607gt0)) {
            return false;
        }
        C49607gt0 gt02 = (C49607gt0) aVar;
        return C46238a.m51546a(this.f134255d, gt02.f134255d) && C46238a.m51546a(this.f134256e, gt02.f134256e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49765hx0 hx02 = this.f134255d;
            if (hx02 != null) {
                aVar.mo74322i(101, hx02.computeSize());
                this.f134255d.writeFields(aVar);
            }
            String str = this.f134256e;
            if (str != null) {
                aVar.mo74323j(102, str);
            }
            return 0;
        } else if (i == 1) {
            C49765hx0 hx03 = this.f134255d;
            if (hx03 != null) {
                i2 = 0 + C52418a.m58682i(101, hx03.computeSize());
            }
            String str2 = this.f134256e;
            return str2 != null ? i2 + C52418a.m58683j(102, str2) : i2;
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
            C49607gt0 gt02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 101) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49765hx0 hx04 = new C49765hx0();
                    if (bArr != null && bArr.length > 0) {
                        hx04.parseFrom(bArr);
                    }
                    gt02.f134255d = hx04;
                }
                return 0;
            } else if (intValue != 102) {
                return -1;
            } else {
                gt02.f134256e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
