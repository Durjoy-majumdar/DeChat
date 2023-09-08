package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class h44 extends C47465a {

    /* renamed from: d */
    public String f259542d;

    /* renamed from: e */
    public String f259543e;

    /* renamed from: f */
    public String f259544f;

    /* renamed from: g */
    public String f259545g;

    /* renamed from: h */
    public String f259546h;

    /* renamed from: i */
    public int f259547i;

    /* renamed from: j */
    public int f259548j;

    /* renamed from: n */
    public String f259549n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof h44)) {
            return false;
        }
        h44 h44 = (h44) aVar;
        return C46238a.m51546a(this.f259542d, h44.f259542d) && C46238a.m51546a(this.f259543e, h44.f259543e) && C46238a.m51546a(this.f259544f, h44.f259544f) && C46238a.m51546a(this.f259545g, h44.f259545g) && C46238a.m51546a(this.f259546h, h44.f259546h) && C46238a.m51546a(Integer.valueOf(this.f259547i), Integer.valueOf(h44.f259547i)) && C46238a.m51546a(Integer.valueOf(this.f259548j), Integer.valueOf(h44.f259548j)) && C46238a.m51546a(this.f259549n, h44.f259549n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259542d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259543e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f259544f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f259545g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f259546h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f259547i);
            aVar.mo74318e(7, this.f259548j);
            String str6 = this.f259549n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f259542d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f259543e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f259544f;
            if (str9 != null) {
                i2 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f259545g;
            if (str10 != null) {
                i2 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f259546h;
            if (str11 != null) {
                i2 += C52418a.m58683j(5, str11);
            }
            int e = i2 + C52418a.m58678e(6, this.f259547i) + C52418a.m58678e(7, this.f259548j);
            String str12 = this.f259549n;
            return str12 != null ? e + C52418a.m58683j(8, str12) : e;
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
            h44 h44 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    h44.f259542d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    h44.f259543e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    h44.f259544f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    h44.f259545g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    h44.f259546h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    h44.f259547i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    h44.f259548j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    h44.f259549n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
