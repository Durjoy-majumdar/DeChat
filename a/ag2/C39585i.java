package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.i */
public class C39585i extends C47465a {

    /* renamed from: d */
    public int f106258d;

    /* renamed from: e */
    public long f106259e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39585i)) {
            return false;
        }
        C39585i iVar = (C39585i) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f106258d), Integer.valueOf(iVar.f106258d)) && C46238a.m51546a(Long.valueOf(this.f106259e), Long.valueOf(iVar.f106259e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f106258d);
            aVar.mo74321h(2, this.f106259e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f106258d) + 0 + C52418a.m58681h(2, this.f106259e);
        } else {
            if (i == 2) {
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
                C39585i iVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    iVar.f106258d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 2) {
                    return -1;
                } else {
                    iVar.f106259e = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
