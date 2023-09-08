package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ax2 */
public class C48777ax2 extends C47465a {

    /* renamed from: d */
    public String f130830d;

    /* renamed from: e */
    public String f130831e;

    /* renamed from: f */
    public String f130832f;

    /* renamed from: g */
    public String f130833g;

    /* renamed from: h */
    public String f130834h;

    /* renamed from: i */
    public String f130835i;

    /* renamed from: j */
    public String f130836j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48777ax2)) {
            return false;
        }
        C48777ax2 ax22 = (C48777ax2) aVar;
        return C46238a.m51546a(this.f130830d, ax22.f130830d) && C46238a.m51546a(this.f130831e, ax22.f130831e) && C46238a.m51546a(this.f130832f, ax22.f130832f) && C46238a.m51546a(this.f130833g, ax22.f130833g) && C46238a.m51546a(this.f130834h, ax22.f130834h) && C46238a.m51546a(this.f130835i, ax22.f130835i) && C46238a.m51546a(this.f130836j, ax22.f130836j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f130830d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f130831e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f130832f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f130833g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f130834h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f130835i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f130836j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            return 0;
        } else if (i == 1) {
            String str8 = this.f130830d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f130831e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f130832f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f130833g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f130834h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f130835i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f130836j;
            return str14 != null ? i2 + C52418a.m58683j(7, str14) : i2;
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
            C48777ax2 ax22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ax22.f130830d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ax22.f130831e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ax22.f130832f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ax22.f130833g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ax22.f130834h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ax22.f130835i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ax22.f130836j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
