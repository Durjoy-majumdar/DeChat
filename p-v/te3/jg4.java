package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class jg4 extends C47465a {

    /* renamed from: d */
    public long f136111d;

    /* renamed from: e */
    public long f136112e;

    /* renamed from: f */
    public int f136113f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof jg4)) {
            return false;
        }
        jg4 jg4 = (jg4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f136111d), Long.valueOf(jg4.f136111d)) && C46238a.m51546a(Long.valueOf(this.f136112e), Long.valueOf(jg4.f136112e)) && C46238a.m51546a(Integer.valueOf(this.f136113f), Integer.valueOf(jg4.f136113f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f136111d);
            aVar.mo74321h(2, this.f136112e);
            aVar.mo74318e(3, this.f136113f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f136111d) + 0 + C52418a.m58681h(2, this.f136112e) + C52418a.m58678e(3, this.f136113f);
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
                jg4 jg4 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    jg4.f136111d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    jg4.f136112e = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    jg4.f136113f = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
