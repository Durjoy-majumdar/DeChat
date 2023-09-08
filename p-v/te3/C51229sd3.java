package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sd3 */
public class C51229sd3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C52111yg> f141449d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f141450e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f141451f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51229sd3)) {
            return false;
        }
        C51229sd3 sd32 = (C51229sd3) aVar;
        return C46238a.m51546a(this.f141449d, sd32.f141449d) && C46238a.m51546a(this.f141450e, sd32.f141450e) && C46238a.m51546a(this.f141451f, sd32.f141451f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f141449d);
            aVar.mo74320g(2, 1, this.f141450e);
            aVar.mo74320g(3, 1, this.f141451f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 8, this.f141449d) + 0 + C52418a.m58680g(2, 1, this.f141450e) + C52418a.m58680g(3, 1, this.f141451f);
        } else {
            if (i == 2) {
                this.f141449d.clear();
                this.f141450e.clear();
                this.f141451f.clear();
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
                C51229sd3 sd32 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52111yg ygVar = new C52111yg();
                        if (bArr != null && bArr.length > 0) {
                            ygVar.parseFrom(bArr);
                        }
                        sd32.f141449d.add(ygVar);
                    }
                    return 0;
                } else if (intValue == 2) {
                    sd32.f141450e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    sd32.f141451f.add(aVar3.mo141633k(intValue));
                    return 0;
                }
            }
        }
    }
}
