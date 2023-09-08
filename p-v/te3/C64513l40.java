package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l40 */
public class C64513l40 extends C47465a {

    /* renamed from: d */
    public String f184031d;

    /* renamed from: e */
    public String f184032e;

    /* renamed from: f */
    public String f184033f;

    /* renamed from: g */
    public String f184034g;

    /* renamed from: h */
    public String f184035h;

    /* renamed from: i */
    public int f184036i;

    /* renamed from: j */
    public int f184037j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64513l40)) {
            return false;
        }
        C64513l40 l402 = (C64513l40) aVar;
        return C46238a.m51546a(this.f184031d, l402.f184031d) && C46238a.m51546a(this.f184032e, l402.f184032e) && C46238a.m51546a(this.f184033f, l402.f184033f) && C46238a.m51546a(this.f184034g, l402.f184034g) && C46238a.m51546a(this.f184035h, l402.f184035h) && C46238a.m51546a(Integer.valueOf(this.f184036i), Integer.valueOf(l402.f184036i)) && C46238a.m51546a(Integer.valueOf(this.f184037j), Integer.valueOf(l402.f184037j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184031d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184032e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184033f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184034g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f184035h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f184036i);
            aVar.mo74318e(7, this.f184037j);
            return 0;
        } else if (i == 1) {
            String str6 = this.f184031d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f184032e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f184033f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f184034g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f184035h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            return i2 + C52418a.m58678e(6, this.f184036i) + C52418a.m58678e(7, this.f184037j);
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
            C64513l40 l402 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    l402.f184031d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    l402.f184032e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    l402.f184033f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    l402.f184034g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    l402.f184035h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    l402.f184036i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    l402.f184037j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
