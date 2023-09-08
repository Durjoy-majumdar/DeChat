package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zu2 */
public class C64896zu2 extends C47465a {

    /* renamed from: d */
    public String f186876d;

    /* renamed from: e */
    public String f186877e;

    /* renamed from: f */
    public String f186878f;

    /* renamed from: g */
    public String f186879g;

    /* renamed from: h */
    public int f186880h;

    /* renamed from: i */
    public String f186881i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64896zu2)) {
            return false;
        }
        C64896zu2 zu22 = (C64896zu2) aVar;
        return C46238a.m51546a(this.f186876d, zu22.f186876d) && C46238a.m51546a(this.f186877e, zu22.f186877e) && C46238a.m51546a(this.f186878f, zu22.f186878f) && C46238a.m51546a(this.f186879g, zu22.f186879g) && C46238a.m51546a(Integer.valueOf(this.f186880h), Integer.valueOf(zu22.f186880h)) && C46238a.m51546a(this.f186881i, zu22.f186881i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f186876d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f186877e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f186878f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f186879g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f186880h);
            String str5 = this.f186881i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            return 0;
        } else if (i == 1) {
            String str6 = this.f186876d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f186877e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f186878f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f186879g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            int e = i2 + C52418a.m58678e(5, this.f186880h);
            String str10 = this.f186881i;
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
            C64896zu2 zu22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    zu22.f186876d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    zu22.f186877e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zu22.f186878f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zu22.f186879g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zu22.f186880h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    zu22.f186881i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
