package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class xp4 extends C47465a {

    /* renamed from: d */
    public String f144800d;

    /* renamed from: e */
    public String f144801e;

    /* renamed from: f */
    public long f144802f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xp4)) {
            return false;
        }
        xp4 xp4 = (xp4) aVar;
        return C46238a.m51546a(this.f144800d, xp4.f144800d) && C46238a.m51546a(this.f144801e, xp4.f144801e) && C46238a.m51546a(Long.valueOf(this.f144802f), Long.valueOf(xp4.f144802f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144800d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f144801e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f144801e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74321h(3, this.f144802f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: verify_ticket");
            }
        } else if (i == 1) {
            String str3 = this.f144800d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f144801e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f144802f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f144800d == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f144801e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: verify_ticket");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            xp4 xp4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xp4.f144800d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xp4.f144801e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xp4.f144802f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
