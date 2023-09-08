package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class m54 extends C47465a {

    /* renamed from: d */
    public int f137847d;

    /* renamed from: e */
    public n54 f137848e;

    /* renamed from: f */
    public s54 f137849f;

    /* renamed from: g */
    public o54 f137850g;

    /* renamed from: h */
    public LinkedList<n54> f137851h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m54)) {
            return false;
        }
        m54 m54 = (m54) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f137847d), Integer.valueOf(m54.f137847d)) && C46238a.m51546a(this.f137848e, m54.f137848e) && C46238a.m51546a(this.f137849f, m54.f137849f) && C46238a.m51546a(this.f137850g, m54.f137850g) && C46238a.m51546a(this.f137851h, m54.f137851h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f137847d);
            n54 n54 = this.f137848e;
            if (n54 != null) {
                aVar.mo74322i(2, n54.computeSize());
                this.f137848e.writeFields(aVar);
            }
            s54 s54 = this.f137849f;
            if (s54 != null) {
                aVar.mo74322i(3, s54.computeSize());
                this.f137849f.writeFields(aVar);
            }
            o54 o54 = this.f137850g;
            if (o54 != null) {
                aVar.mo74322i(4, o54.computeSize());
                this.f137850g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f137851h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f137847d) + 0;
            n54 n542 = this.f137848e;
            if (n542 != null) {
                e += C52418a.m58682i(2, n542.computeSize());
            }
            s54 s542 = this.f137849f;
            if (s542 != null) {
                e += C52418a.m58682i(3, s542.computeSize());
            }
            o54 o542 = this.f137850g;
            if (o542 != null) {
                e += C52418a.m58682i(4, o542.computeSize());
            }
            return e + C52418a.m58680g(5, 8, this.f137851h);
        } else if (i == 2) {
            this.f137851h.clear();
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
            m54 m54 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m54.f137847d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    n54 n543 = new n54();
                    if (bArr != null && bArr.length > 0) {
                        n543.parseFrom(bArr);
                    }
                    m54.f137848e = n543;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    s54 s543 = new s54();
                    if (bArr2 != null && bArr2.length > 0) {
                        s543.parseFrom(bArr2);
                    }
                    m54.f137849f = s543;
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    o54 o543 = new o54();
                    if (bArr3 != null && bArr3.length > 0) {
                        o543.parseFrom(bArr3);
                    }
                    m54.f137850g = o543;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    n54 n544 = new n54();
                    if (bArr4 != null && bArr4.length > 0) {
                        n544.parseFrom(bArr4);
                    }
                    m54.f137851h.add(n544);
                }
                return 0;
            }
        }
    }
}
