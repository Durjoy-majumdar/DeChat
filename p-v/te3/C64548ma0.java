package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ma0 */
public class C64548ma0 extends C47465a {

    /* renamed from: d */
    public String f184250d;

    /* renamed from: e */
    public String f184251e;

    /* renamed from: f */
    public String f184252f;

    /* renamed from: g */
    public String f184253g;

    /* renamed from: h */
    public String f184254h;

    /* renamed from: i */
    public String f184255i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64548ma0)) {
            return false;
        }
        C64548ma0 ma02 = (C64548ma0) aVar;
        return C46238a.m51546a(this.f184250d, ma02.f184250d) && C46238a.m51546a(this.f184251e, ma02.f184251e) && C46238a.m51546a(this.f184252f, ma02.f184252f) && C46238a.m51546a(this.f184253g, ma02.f184253g) && C46238a.m51546a(this.f184254h, ma02.f184254h) && C46238a.m51546a(this.f184255i, ma02.f184255i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f184250d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f184251e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f184252f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f184253g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f184254h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f184255i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f184250d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f184251e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f184252f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f184253g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f184254h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f184255i;
            return str12 != null ? i2 + C52418a.m58683j(6, str12) : i2;
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
            C64548ma0 ma02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ma02.f184250d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ma02.f184251e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ma02.f184252f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ma02.f184253g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ma02.f184254h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ma02.f184255i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
