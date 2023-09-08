package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.h4 */
public class C47594h4 extends C47465a {

    /* renamed from: d */
    public String f127757d;

    /* renamed from: e */
    public int f127758e;

    /* renamed from: f */
    public long f127759f;

    /* renamed from: g */
    public String f127760g;

    /* renamed from: h */
    public boolean f127761h;

    /* renamed from: i */
    public int f127762i;

    /* renamed from: j */
    public String f127763j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47594h4)) {
            return false;
        }
        C47594h4 h4Var = (C47594h4) aVar;
        return C46238a.m51546a(this.f127757d, h4Var.f127757d) && C46238a.m51546a(Integer.valueOf(this.f127758e), Integer.valueOf(h4Var.f127758e)) && C46238a.m51546a(Long.valueOf(this.f127759f), Long.valueOf(h4Var.f127759f)) && C46238a.m51546a(this.f127760g, h4Var.f127760g) && C46238a.m51546a(Boolean.valueOf(this.f127761h), Boolean.valueOf(h4Var.f127761h)) && C46238a.m51546a(Integer.valueOf(this.f127762i), Integer.valueOf(h4Var.f127762i)) && C46238a.m51546a(this.f127763j, h4Var.f127763j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127757d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f127758e);
                aVar.mo74321h(3, this.f127759f);
                String str2 = this.f127760g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74314a(5, this.f127761h);
                aVar.mo74318e(6, this.f127762i);
                String str3 = this.f127763j;
                if (str3 != null) {
                    aVar.mo74323j(7, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i == 1) {
            String str4 = this.f127757d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f127758e) + C52418a.m58681h(3, this.f127759f);
            String str5 = this.f127760g;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            int a = e + C52418a.m58674a(5, this.f127761h) + C52418a.m58678e(6, this.f127762i);
            String str6 = this.f127763j;
            return str6 != null ? a + C52418a.m58683j(7, str6) : a;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127757d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: UserName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47594h4 h4Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    h4Var.f127757d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    h4Var.f127758e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    h4Var.f127759f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    h4Var.f127760g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    h4Var.f127761h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    h4Var.f127762i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    h4Var.f127763j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
