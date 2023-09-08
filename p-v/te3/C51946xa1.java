package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xa1 */
public class C51946xa1 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f144557d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f144558e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f144559f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C51745vv0> f144560g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51946xa1)) {
            return false;
        }
        C51946xa1 xa12 = (C51946xa1) aVar;
        return C46238a.m51546a(this.f144557d, xa12.f144557d) && C46238a.m51546a(this.f144558e, xa12.f144558e) && C46238a.m51546a(this.f144559f, xa12.f144559f) && C46238a.m51546a(this.f144560g, xa12.f144560g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f144557d);
            aVar.mo74320g(2, 1, this.f144558e);
            aVar.mo74320g(3, 1, this.f144559f);
            aVar.mo74320g(4, 8, this.f144560g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f144557d) + 0 + C52418a.m58680g(2, 1, this.f144558e) + C52418a.m58680g(3, 1, this.f144559f) + C52418a.m58680g(4, 8, this.f144560g);
        } else {
            if (i == 2) {
                this.f144557d.clear();
                this.f144558e.clear();
                this.f144559f.clear();
                this.f144560g.clear();
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
                C51946xa1 xa12 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    xa12.f144557d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 2) {
                    xa12.f144558e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 3) {
                    xa12.f144559f.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C51745vv0 vv02 = new C51745vv0();
                        if (bArr != null && bArr.length > 0) {
                            vv02.parseFrom(bArr);
                        }
                        xa12.f144560g.add(vv02);
                    }
                    return 0;
                }
            }
        }
    }
}
