package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lb3 */
public class C64520lb3 extends C47465a {

    /* renamed from: d */
    public int f184070d;

    /* renamed from: e */
    public a45 f184071e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64520lb3)) {
            return false;
        }
        C64520lb3 lb32 = (C64520lb3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184070d), Integer.valueOf(lb32.f184070d)) && C46238a.m51546a(this.f184071e, lb32.f184071e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184070d);
            a45 a45 = this.f184071e;
            if (a45 != null) {
                aVar.mo74322i(2, a45.computeSize());
                this.f184071e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184070d) + 0;
            a45 a452 = this.f184071e;
            return a452 != null ? e + C52418a.m58682i(2, a452.computeSize()) : e;
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
            C64520lb3 lb32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                lb32.f184070d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    a45 a453 = new a45();
                    if (bArr != null && bArr.length > 0) {
                        a453.parseFrom(bArr);
                    }
                    lb32.f184071e = a453;
                }
                return 0;
            }
        }
    }
}
