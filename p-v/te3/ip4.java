package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ip4 extends C47465a {

    /* renamed from: d */
    public String f135573d;

    /* renamed from: e */
    public String f135574e;

    /* renamed from: f */
    public String f135575f;

    /* renamed from: g */
    public String f135576g;

    /* renamed from: h */
    public String f135577h;

    /* renamed from: i */
    public String f135578i;

    /* renamed from: j */
    public String f135579j;

    /* renamed from: n */
    public long f135580n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ip4)) {
            return false;
        }
        ip4 ip4 = (ip4) aVar;
        return C46238a.m51546a(this.f135573d, ip4.f135573d) && C46238a.m51546a(this.f135574e, ip4.f135574e) && C46238a.m51546a(this.f135575f, ip4.f135575f) && C46238a.m51546a(this.f135576g, ip4.f135576g) && C46238a.m51546a(this.f135577h, ip4.f135577h) && C46238a.m51546a(this.f135578i, ip4.f135578i) && C46238a.m51546a(this.f135579j, ip4.f135579j) && C46238a.m51546a(Long.valueOf(this.f135580n), Long.valueOf(ip4.f135580n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135573d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135574e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135575f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f135576g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f135577h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f135578i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f135579j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            aVar.mo74321h(8, this.f135580n);
            return 0;
        } else if (i == 1) {
            String str8 = this.f135573d;
            if (str8 != null) {
                i2 = 0 + C52418a.m58683j(1, str8);
            }
            String str9 = this.f135574e;
            if (str9 != null) {
                i2 += C52418a.m58683j(2, str9);
            }
            String str10 = this.f135575f;
            if (str10 != null) {
                i2 += C52418a.m58683j(3, str10);
            }
            String str11 = this.f135576g;
            if (str11 != null) {
                i2 += C52418a.m58683j(4, str11);
            }
            String str12 = this.f135577h;
            if (str12 != null) {
                i2 += C52418a.m58683j(5, str12);
            }
            String str13 = this.f135578i;
            if (str13 != null) {
                i2 += C52418a.m58683j(6, str13);
            }
            String str14 = this.f135579j;
            if (str14 != null) {
                i2 += C52418a.m58683j(7, str14);
            }
            return i2 + C52418a.m58681h(8, this.f135580n);
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
            ip4 ip4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ip4.f135573d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ip4.f135574e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ip4.f135575f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ip4.f135576g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ip4.f135577h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ip4.f135578i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ip4.f135579j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ip4.f135580n = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
