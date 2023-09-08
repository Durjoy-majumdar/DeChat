package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class tj4 extends C47465a {

    /* renamed from: d */
    public String f142248d;

    /* renamed from: e */
    public long f142249e;

    /* renamed from: f */
    public long f142250f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof tj4)) {
            return false;
        }
        tj4 tj4 = (tj4) aVar;
        return C46238a.m51546a(this.f142248d, tj4.f142248d) && C46238a.m51546a(Long.valueOf(this.f142249e), Long.valueOf(tj4.f142249e)) && C46238a.m51546a(Long.valueOf(this.f142250f), Long.valueOf(tj4.f142250f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142248d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f142249e);
                aVar.mo74321h(3, this.f142250f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i == 1) {
            String str2 = this.f142248d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f142249e) + C52418a.m58681h(3, this.f142250f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142248d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            tj4 tj4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tj4.f142248d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                tj4.f142249e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                tj4.f142250f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
