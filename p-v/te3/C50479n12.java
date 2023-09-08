package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n12 */
public class C50479n12 extends C47465a {

    /* renamed from: d */
    public LinkedList<C50337m12> f138327d = new LinkedList<>();

    /* renamed from: e */
    public C50202l12 f138328e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50479n12)) {
            return false;
        }
        C50479n12 n122 = (C50479n12) aVar;
        return C46238a.m51546a(this.f138327d, n122.f138327d) && C46238a.m51546a(this.f138328e, n122.f138328e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f138327d);
            C50202l12 l122 = this.f138328e;
            if (l122 != null) {
                aVar.mo74322i(2, l122.computeSize());
                this.f138328e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f138327d) + 0;
            C50202l12 l123 = this.f138328e;
            return l123 != null ? g + C52418a.m58682i(2, l123.computeSize()) : g;
        } else if (i == 2) {
            this.f138327d.clear();
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
            C50479n12 n122 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C50337m12 m122 = new C50337m12();
                    if (bArr != null && bArr.length > 0) {
                        m122.parseFrom(bArr);
                    }
                    n122.f138327d.add(m122);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C50202l12 l124 = new C50202l12();
                    if (bArr2 != null && bArr2.length > 0) {
                        l124.parseFrom(bArr2);
                    }
                    n122.f138328e = l124;
                }
                return 0;
            }
        }
    }
}
