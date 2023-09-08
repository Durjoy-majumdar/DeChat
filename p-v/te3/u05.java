package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class u05 extends C47465a {

    /* renamed from: d */
    public String f142533d;

    /* renamed from: e */
    public String f142534e;

    /* renamed from: f */
    public boolean f142535f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof u05)) {
            return false;
        }
        u05 u05 = (u05) aVar;
        return C46238a.m51546a(this.f142533d, u05.f142533d) && C46238a.m51546a(this.f142534e, u05.f142534e) && C46238a.m51546a(Boolean.valueOf(this.f142535f), Boolean.valueOf(u05.f142535f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142533d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Username");
            } else if (this.f142534e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f142534e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74314a(3, this.f142535f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Language");
            }
        } else if (i == 1) {
            String str3 = this.f142533d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f142534e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58674a(3, this.f142535f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142533d == null) {
                throw new C52419b("Not all required fields were included: Username");
            } else if (this.f142534e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Language");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            u05 u05 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                u05.f142533d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                u05.f142534e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                u05.f142535f = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
