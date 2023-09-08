package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d0 */
public class C64303d0 extends C47465a {

    /* renamed from: d */
    public String f182621d;

    /* renamed from: e */
    public C64354f f182622e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64303d0)) {
            return false;
        }
        C64303d0 d0Var = (C64303d0) aVar;
        return C46238a.m51546a(this.f182621d, d0Var.f182621d) && C46238a.m51546a(this.f182622e, d0Var.f182622e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182621d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C64354f fVar = this.f182622e;
            if (fVar != null) {
                aVar.mo74322i(2, fVar.computeSize());
                this.f182622e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f182621d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C64354f fVar2 = this.f182622e;
            return fVar2 != null ? i2 + C52418a.m58682i(2, fVar2.computeSize()) : i2;
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
            C64303d0 d0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                d0Var.f182621d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64354f fVar3 = new C64354f();
                    if (bArr != null && bArr.length > 0) {
                        fVar3.parseFrom(bArr);
                    }
                    d0Var.f182622e = fVar3;
                }
                return 0;
            }
        }
    }
}
