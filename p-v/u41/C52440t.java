package u41;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: u41.t */
public class C52440t extends C47465a {

    /* renamed from: d */
    public int f146546d;

    /* renamed from: e */
    public boolean f146547e;

    /* renamed from: f */
    public long f146548f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52440t)) {
            return false;
        }
        C52440t tVar = (C52440t) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f146546d), Integer.valueOf(tVar.f146546d)) && C46238a.m51546a(Boolean.valueOf(this.f146547e), Boolean.valueOf(tVar.f146547e)) && C46238a.m51546a(Long.valueOf(this.f146548f), Long.valueOf(tVar.f146548f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f146546d);
            aVar.mo74314a(2, this.f146547e);
            aVar.mo74321h(3, this.f146548f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f146546d) + 0 + C52418a.m58674a(2, this.f146547e) + C52418a.m58681h(3, this.f146548f);
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
                C52440t tVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    tVar.f146546d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    tVar.f146547e = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    tVar.f146548f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
