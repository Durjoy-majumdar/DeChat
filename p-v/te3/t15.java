package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class t15 extends C47465a {

    /* renamed from: d */
    public String f141903d;

    /* renamed from: e */
    public String f141904e;

    /* renamed from: f */
    public String f141905f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof t15)) {
            return false;
        }
        t15 t15 = (t15) aVar;
        return C46238a.m51546a(this.f141903d, t15.f141903d) && C46238a.m51546a(this.f141904e, t15.f141904e) && C46238a.m51546a(this.f141905f, t15.f141905f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141903d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Plugin");
            } else if (this.f141904e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f141904e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f141905f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ActivityPath");
            }
        } else if (i == 1) {
            String str4 = this.f141903d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f141904e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f141905f;
            return str6 != null ? i2 + C52418a.m58683j(3, str6) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141903d == null) {
                throw new C52419b("Not all required fields were included: Plugin");
            } else if (this.f141904e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ActivityPath");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            t15 t15 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t15.f141903d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                t15.f141904e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t15.f141905f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
