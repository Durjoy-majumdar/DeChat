package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.b24 */
public class C64250b24 extends C47465a {

    /* renamed from: d */
    public String f182207d;

    /* renamed from: e */
    public LinkedList<C118438ja3> f182208e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64250b24)) {
            return false;
        }
        C64250b24 b242 = (C64250b24) aVar;
        return C46238a.m51546a(this.f182207d, b242.f182207d) && C46238a.m51546a(this.f182208e, b242.f182208e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182207d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f182208e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f182207d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f182208e);
        } else if (i == 2) {
            this.f182208e.clear();
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
            C64250b24 b242 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                b242.f182207d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C118438ja3 ja32 = new C118438ja3();
                    if (bArr != null && bArr.length > 0) {
                        ja32.parseFrom(bArr);
                    }
                    b242.f182208e.add(ja32);
                }
                return 0;
            }
        }
    }
}
