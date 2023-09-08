package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class k65 extends C47465a {

    /* renamed from: d */
    public j65 f136588d;

    /* renamed from: e */
    public C48761au f136589e;

    /* renamed from: f */
    public int f136590f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k65)) {
            return false;
        }
        k65 k65 = (k65) aVar;
        return C46238a.m51546a(this.f136588d, k65.f136588d) && C46238a.m51546a(this.f136589e, k65.f136589e) && C46238a.m51546a(Integer.valueOf(this.f136590f), Integer.valueOf(k65.f136590f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            j65 j65 = this.f136588d;
            if (j65 != null) {
                aVar.mo74322i(1, j65.computeSize());
                this.f136588d.writeFields(aVar);
            }
            C48761au auVar = this.f136589e;
            if (auVar != null) {
                aVar.mo74322i(2, auVar.computeSize());
                this.f136589e.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f136590f);
            return 0;
        } else if (i == 1) {
            j65 j652 = this.f136588d;
            if (j652 != null) {
                i2 = 0 + C52418a.m58682i(1, j652.computeSize());
            }
            C48761au auVar2 = this.f136589e;
            if (auVar2 != null) {
                i2 += C52418a.m58682i(2, auVar2.computeSize());
            }
            return i2 + C52418a.m58678e(3, this.f136590f);
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
            k65 k65 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    j65 j653 = new j65();
                    if (bArr != null && bArr.length > 0) {
                        j653.parseFrom(bArr);
                    }
                    k65.f136588d = j653;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C48761au auVar3 = new C48761au();
                    if (bArr2 != null && bArr2.length > 0) {
                        auVar3.parseFrom(bArr2);
                    }
                    k65.f136589e = auVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                k65.f136590f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
