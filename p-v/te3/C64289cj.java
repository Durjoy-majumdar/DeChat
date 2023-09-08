package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cj */
public class C64289cj extends C47465a {

    /* renamed from: d */
    public long f182523d;

    /* renamed from: e */
    public int f182524e;

    /* renamed from: f */
    public boolean f182525f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64289cj)) {
            return false;
        }
        C64289cj cjVar = (C64289cj) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182523d), Long.valueOf(cjVar.f182523d)) && C46238a.m51546a(Integer.valueOf(this.f182524e), Integer.valueOf(cjVar.f182524e)) && C46238a.m51546a(Boolean.valueOf(this.f182525f), Boolean.valueOf(cjVar.f182525f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182523d);
            aVar.mo74318e(2, this.f182524e);
            aVar.mo74314a(3, this.f182525f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f182523d) + 0 + C52418a.m58678e(2, this.f182524e) + C52418a.m58674a(3, this.f182525f);
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
                C64289cj cjVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    cjVar.f182523d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    cjVar.f182524e = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    cjVar.f182525f = aVar3.mo141625c(intValue);
                    return 0;
                }
            }
        }
    }
}
