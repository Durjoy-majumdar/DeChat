package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class rr4 extends C47465a {

    /* renamed from: d */
    public String f185289d;

    /* renamed from: e */
    public String f185290e;

    /* renamed from: f */
    public long f185291f;

    /* renamed from: g */
    public boolean f185292g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof rr4)) {
            return false;
        }
        rr4 rr4 = (rr4) aVar;
        return C46238a.m51546a(this.f185289d, rr4.f185289d) && C46238a.m51546a(this.f185290e, rr4.f185290e) && C46238a.m51546a(Long.valueOf(this.f185291f), Long.valueOf(rr4.f185291f)) && C46238a.m51546a(Boolean.valueOf(this.f185292g), Boolean.valueOf(rr4.f185292g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185289d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: templatePath");
            } else if (this.f185290e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f185290e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74321h(3, this.f185291f);
                aVar.mo74314a(4, this.f185292g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: musicPath");
            }
        } else if (i == 1) {
            String str3 = this.f185289d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f185290e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f185291f) + C52418a.m58674a(4, this.f185292g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f185289d == null) {
                throw new C52419b("Not all required fields were included: templatePath");
            } else if (this.f185290e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: musicPath");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            rr4 rr4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                rr4.f185289d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                rr4.f185290e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                rr4.f185291f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                rr4.f185292g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
