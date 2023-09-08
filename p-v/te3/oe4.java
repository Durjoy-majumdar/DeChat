package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class oe4 extends C47465a {

    /* renamed from: d */
    public String f64334d;

    /* renamed from: e */
    public String f64335e;

    /* renamed from: f */
    public int f64336f;

    /* renamed from: g */
    public String f64337g;

    /* renamed from: h */
    public String f64338h;

    /* renamed from: i */
    public String f64339i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof oe4)) {
            return false;
        }
        oe4 oe4 = (oe4) aVar;
        return C46238a.m51546a(this.f64334d, oe4.f64334d) && C46238a.m51546a(this.f64335e, oe4.f64335e) && C46238a.m51546a(Integer.valueOf(this.f64336f), Integer.valueOf(oe4.f64336f)) && C46238a.m51546a(this.f64337g, oe4.f64337g) && C46238a.m51546a(this.f64338h, oe4.f64338h) && C46238a.m51546a(this.f64339i, oe4.f64339i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64334d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f64335e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f64336f);
            String str3 = this.f64337g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f64338h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f64339i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f64334d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f64335e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f64336f);
            String str8 = this.f64337g;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f64338h;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f64339i;
            return str10 != null ? e + C52418a.m58683j(6, str10) : e;
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
            oe4 oe4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oe4.f64334d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    oe4.f64335e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    oe4.f64336f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oe4.f64337g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oe4.f64338h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oe4.f64339i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
