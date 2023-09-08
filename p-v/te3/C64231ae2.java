package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ae2 */
public class C64231ae2 extends C47465a {

    /* renamed from: d */
    public String f182080d;

    /* renamed from: e */
    public LinkedList<C101804kv2> f182081e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64231ae2)) {
            return false;
        }
        C64231ae2 ae22 = (C64231ae2) aVar;
        return C46238a.m51546a(this.f182080d, ae22.f182080d) && C46238a.m51546a(this.f182081e, ae22.f182081e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182080d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f182081e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f182080d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f182081e);
        } else if (i == 2) {
            this.f182081e.clear();
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
            C64231ae2 ae22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ae22.f182080d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C101804kv2 kv22 = new C101804kv2();
                    if (bArr != null && bArr.length > 0) {
                        kv22.parseFrom(bArr);
                    }
                    ae22.f182081e.add(kv22);
                }
                return 0;
            }
        }
    }
}
