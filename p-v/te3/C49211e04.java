package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e04 */
public class C49211e04 extends C47465a {

    /* renamed from: d */
    public String f132612d;

    /* renamed from: e */
    public String f132613e;

    /* renamed from: f */
    public String f132614f;

    /* renamed from: g */
    public long f132615g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49211e04)) {
            return false;
        }
        C49211e04 e042 = (C49211e04) aVar;
        return C46238a.m51546a(this.f132612d, e042.f132612d) && C46238a.m51546a(this.f132613e, e042.f132613e) && C46238a.m51546a(this.f132614f, e042.f132614f) && C46238a.m51546a(Long.valueOf(this.f132615g), Long.valueOf(e042.f132615g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132612d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f132613e == null) {
                throw new C52419b("Not all required fields were included: verify_content");
            } else if (this.f132614f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f132613e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                String str3 = this.f132614f;
                if (str3 != null) {
                    aVar.mo74323j(3, str3);
                }
                aVar.mo74321h(4, this.f132615g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: antispam_ticket");
            }
        } else if (i == 1) {
            String str4 = this.f132612d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f132613e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f132614f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f132615g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132612d == null) {
                throw new C52419b("Not all required fields were included: tp_username");
            } else if (this.f132613e == null) {
                throw new C52419b("Not all required fields were included: verify_content");
            } else if (this.f132614f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: antispam_ticket");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49211e04 e042 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e042.f132612d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e042.f132613e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                e042.f132614f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                e042.f132615g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
