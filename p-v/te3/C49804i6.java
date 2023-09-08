package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import s90.C48298d;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i6 */
public class C49804i6 extends C47465a {

    /* renamed from: d */
    public C48298d f135123d;

    /* renamed from: e */
    public long f135124e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49804i6)) {
            return false;
        }
        C49804i6 i6Var = (C49804i6) aVar;
        return C46238a.m51546a(this.f135123d, i6Var.f135123d) && C46238a.m51546a(Long.valueOf(this.f135124e), Long.valueOf(i6Var.f135124e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48298d dVar = this.f135123d;
            if (dVar != null) {
                aVar.mo74322i(1, dVar.computeSize());
                this.f135123d.writeFields(aVar);
            }
            aVar.mo74321h(2, this.f135124e);
            return 0;
        } else if (i == 1) {
            C48298d dVar2 = this.f135123d;
            if (dVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, dVar2.computeSize());
            }
            return i2 + C52418a.m58681h(2, this.f135124e);
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
            C49804i6 i6Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48298d dVar3 = new C48298d();
                    if (bArr != null && bArr.length > 0) {
                        dVar3.parseFrom(bArr);
                    }
                    i6Var.f135123d = dVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                i6Var.f135124e = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
