package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pd1 */
public class C64627pd1 extends C47465a {

    /* renamed from: d */
    public int f184815d;

    /* renamed from: e */
    public LinkedList<C22521pi1> f184816e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64627pd1)) {
            return false;
        }
        C64627pd1 pd12 = (C64627pd1) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184815d), Integer.valueOf(pd12.f184815d)) && C46238a.m51546a(this.f184816e, pd12.f184816e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184815d);
            aVar.mo74320g(2, 8, this.f184816e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f184815d) + 0 + C52418a.m58680g(2, 8, this.f184816e);
        } else {
            if (i == 2) {
                this.f184816e.clear();
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
                C64627pd1 pd12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    pd12.f184815d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C22521pi1 pi12 = new C22521pi1();
                        if (bArr != null && bArr.length > 0) {
                            pi12.parseFrom(bArr);
                        }
                        pd12.f184816e.add(pi12);
                    }
                    return 0;
                }
            }
        }
    }
}
