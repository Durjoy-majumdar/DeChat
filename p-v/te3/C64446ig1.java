package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ig1 */
public class C64446ig1 extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f183688d = new LinkedList<>();

    /* renamed from: e */
    public C64489kg1 f183689e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64446ig1)) {
            return false;
        }
        C64446ig1 ig12 = (C64446ig1) aVar;
        return C46238a.m51546a(this.f183688d, ig12.f183688d) && C46238a.m51546a(this.f183689e, ig12.f183689e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 2, this.f183688d);
            C64489kg1 kg12 = this.f183689e;
            if (kg12 != null) {
                aVar.mo74322i(2, kg12.computeSize());
                this.f183689e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 2, this.f183688d) + 0;
            C64489kg1 kg13 = this.f183689e;
            return kg13 != null ? g + C52418a.m58682i(2, kg13.computeSize()) : g;
        } else if (i == 2) {
            this.f183688d.clear();
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
            C64446ig1 ig12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ig12.f183688d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C64489kg1 kg14 = new C64489kg1();
                    if (bArr != null && bArr.length > 0) {
                        kg14.parseFrom(bArr);
                    }
                    ig12.f183689e = kg14;
                }
                return 0;
            }
        }
    }
}
