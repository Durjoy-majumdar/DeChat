package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.p0 */
public class C67039p0 extends C47465a {

    /* renamed from: d */
    public String f192579d;

    /* renamed from: e */
    public String f192580e;

    /* renamed from: f */
    public long f192581f;

    /* renamed from: g */
    public int f192582g;

    /* renamed from: h */
    public long f192583h;

    /* renamed from: i */
    public String f192584i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C67039p0)) {
            return false;
        }
        C67039p0 p0Var = (C67039p0) aVar;
        return C46238a.m51546a(this.f192579d, p0Var.f192579d) && C46238a.m51546a(this.f192580e, p0Var.f192580e) && C46238a.m51546a(Long.valueOf(this.f192581f), Long.valueOf(p0Var.f192581f)) && C46238a.m51546a(Integer.valueOf(this.f192582g), Integer.valueOf(p0Var.f192582g)) && C46238a.m51546a(Long.valueOf(this.f192583h), Long.valueOf(p0Var.f192583h)) && C46238a.m51546a(this.f192584i, p0Var.f192584i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f192579d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: path");
            } else if (this.f192580e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f192580e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74321h(3, this.f192581f);
                aVar.mo74318e(4, this.f192582g);
                aVar.mo74321h(5, this.f192583h);
                String str3 = this.f192584i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: name");
            }
        } else if (i == 1) {
            String str4 = this.f192579d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f192580e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int h = i2 + C52418a.m58681h(3, this.f192581f) + C52418a.m58678e(4, this.f192582g) + C52418a.m58681h(5, this.f192583h);
            String str6 = this.f192584i;
            return str6 != null ? h + C52418a.m58683j(6, str6) : h;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f192579d == null) {
                throw new C52419b("Not all required fields were included: path");
            } else if (this.f192580e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: name");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C67039p0 p0Var = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    p0Var.f192579d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    p0Var.f192580e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    p0Var.f192581f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    p0Var.f192582g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    p0Var.f192583h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    p0Var.f192584i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
