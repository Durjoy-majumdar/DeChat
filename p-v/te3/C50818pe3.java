package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pe3 */
public class C50818pe3 extends C47465a {

    /* renamed from: d */
    public String f139727d;

    /* renamed from: e */
    public String f139728e;

    /* renamed from: f */
    public float f139729f;

    /* renamed from: g */
    public float f139730g;

    /* renamed from: h */
    public String f139731h;

    /* renamed from: i */
    public String f139732i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50818pe3)) {
            return false;
        }
        C50818pe3 pe32 = (C50818pe3) aVar;
        return C46238a.m51546a(this.f139727d, pe32.f139727d) && C46238a.m51546a(this.f139728e, pe32.f139728e) && C46238a.m51546a(Float.valueOf(this.f139729f), Float.valueOf(pe32.f139729f)) && C46238a.m51546a(Float.valueOf(this.f139730g), Float.valueOf(pe32.f139730g)) && C46238a.m51546a(this.f139731h, pe32.f139731h) && C46238a.m51546a(this.f139732i, pe32.f139732i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f139727d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f139728e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74317d(3, this.f139729f);
            aVar.mo74317d(4, this.f139730g);
            String str3 = this.f139731h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f139732i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f139727d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f139728e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int d = i2 + C52418a.m58677d(3, this.f139729f) + C52418a.m58677d(4, this.f139730g);
            String str7 = this.f139731h;
            if (str7 != null) {
                d += C52418a.m58683j(5, str7);
            }
            String str8 = this.f139732i;
            return str8 != null ? d + C52418a.m58683j(6, str8) : d;
        } else if (i == 2) {
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
            C50818pe3 pe32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    pe32.f139727d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    pe32.f139728e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    pe32.f139729f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    pe32.f139730g = aVar3.mo141628f(intValue);
                    return 0;
                case 5:
                    pe32.f139731h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pe32.f139732i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
