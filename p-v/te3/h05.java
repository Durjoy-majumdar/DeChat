package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h05 extends C47465a {

    /* renamed from: d */
    public long f134396d;

    /* renamed from: e */
    public C89349b f134397e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h05)) {
            return false;
        }
        h05 h05 = (h05) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134396d), Long.valueOf(h05.f134396d)) && C46238a.m51546a(this.f134397e, h05.f134397e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134396d);
            C89349b bVar = this.f134397e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f134396d) + 0;
            C89349b bVar2 = this.f134397e;
            return bVar2 != null ? h + C52418a.m58675b(2, bVar2) : h;
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
            h05 h05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h05.f134396d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                h05.f134397e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
