package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.e1 */
public class C39576e1 extends C47465a {

    /* renamed from: d */
    public long f106238d;

    /* renamed from: e */
    public C39598t0 f106239e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39576e1)) {
            return false;
        }
        C39576e1 e1Var = (C39576e1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f106238d), Long.valueOf(e1Var.f106238d)) && C46238a.m51546a(this.f106239e, e1Var.f106239e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f106238d);
            C39598t0 t0Var = this.f106239e;
            if (t0Var != null) {
                aVar.mo74322i(2, t0Var.computeSize());
                this.f106239e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f106238d) + 0;
            C39598t0 t0Var2 = this.f106239e;
            return t0Var2 != null ? h + C52418a.m58682i(2, t0Var2.computeSize()) : h;
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
            C39576e1 e1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e1Var.f106238d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C39598t0 t0Var3 = new C39598t0();
                    if (bArr != null && bArr.length > 0) {
                        t0Var3.parseFrom(bArr);
                    }
                    e1Var.f106239e = t0Var3;
                }
                return 0;
            }
        }
    }
}
