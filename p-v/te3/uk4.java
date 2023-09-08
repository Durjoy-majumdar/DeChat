package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class uk4 extends C47465a {

    /* renamed from: d */
    public String f142916d;

    /* renamed from: e */
    public String f142917e;

    /* renamed from: f */
    public String f142918f;

    /* renamed from: g */
    public String f142919g;

    /* renamed from: h */
    public String f142920h;

    /* renamed from: i */
    public String f142921i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof uk4)) {
            return false;
        }
        uk4 uk4 = (uk4) aVar;
        return C46238a.m51546a(this.f142916d, uk4.f142916d) && C46238a.m51546a(this.f142917e, uk4.f142917e) && C46238a.m51546a(this.f142918f, uk4.f142918f) && C46238a.m51546a(this.f142919g, uk4.f142919g) && C46238a.m51546a(this.f142920h, uk4.f142920h) && C46238a.m51546a(this.f142921i, uk4.f142921i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142916d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f142917e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f142918f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f142919g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f142920h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f142921i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f142916d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f142917e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f142918f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f142919g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f142920h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            String str12 = this.f142921i;
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
            uk4 uk4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    uk4.f142916d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    uk4.f142917e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    uk4.f142918f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    uk4.f142919g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    uk4.f142920h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    uk4.f142921i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
