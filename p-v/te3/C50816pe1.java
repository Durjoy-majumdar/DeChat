package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pe1 */
public class C50816pe1 extends C47465a {

    /* renamed from: d */
    public long f139721d;

    /* renamed from: e */
    public LinkedList<C50949qe1> f139722e = new LinkedList<>();

    /* renamed from: f */
    public long f139723f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50816pe1)) {
            return false;
        }
        C50816pe1 pe12 = (C50816pe1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139721d), Long.valueOf(pe12.f139721d)) && C46238a.m51546a(this.f139722e, pe12.f139722e) && C46238a.m51546a(Long.valueOf(this.f139723f), Long.valueOf(pe12.f139723f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139721d);
            aVar.mo74320g(2, 8, this.f139722e);
            aVar.mo74321h(3, this.f139723f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f139721d) + 0 + C52418a.m58680g(2, 8, this.f139722e) + C52418a.m58681h(3, this.f139723f);
        } else {
            if (i == 2) {
                this.f139722e.clear();
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
                C50816pe1 pe12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    pe12.f139721d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C50949qe1 qe12 = new C50949qe1();
                        if (bArr != null && bArr.length > 0) {
                            qe12.parseFrom(bArr);
                        }
                        pe12.f139722e.add(qe12);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    pe12.f139723f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
