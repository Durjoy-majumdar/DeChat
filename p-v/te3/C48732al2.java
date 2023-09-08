package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.al2 */
public class C48732al2 extends C47465a {

    /* renamed from: d */
    public C51125rl2 f130618d;

    /* renamed from: e */
    public LinkedList<C51263sl2> f130619e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48732al2)) {
            return false;
        }
        C48732al2 al22 = (C48732al2) aVar;
        return C46238a.m51546a(this.f130618d, al22.f130618d) && C46238a.m51546a(this.f130619e, al22.f130619e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51125rl2 rl22 = this.f130618d;
            if (rl22 != null) {
                if (rl22 != null) {
                    aVar.mo74322i(1, rl22.computeSize());
                    this.f130618d.writeFields(aVar);
                }
                aVar.mo74320g(2, 8, this.f130619e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: LogHead");
        } else if (i == 1) {
            C51125rl2 rl23 = this.f130618d;
            if (rl23 != null) {
                i2 = 0 + C52418a.m58682i(1, rl23.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f130619e);
        } else if (i == 2) {
            this.f130619e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130618d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: LogHead");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48732al2 al22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51125rl2 rl24 = new C51125rl2();
                    if (bArr != null && bArr.length > 0) {
                        rl24.parseFrom(bArr);
                    }
                    al22.f130618d = rl24;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51263sl2 sl22 = new C51263sl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        sl22.parseFrom(bArr2);
                    }
                    al22.f130619e.add(sl22);
                }
                return 0;
            }
        }
    }
}
