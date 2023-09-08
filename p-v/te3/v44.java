package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class v44 extends C47465a {

    /* renamed from: d */
    public String f185838d;

    /* renamed from: e */
    public String f185839e;

    /* renamed from: f */
    public long f185840f;

    /* renamed from: g */
    public long f185841g;

    /* renamed from: h */
    public String f185842h;

    /* renamed from: i */
    public String f185843i;

    /* renamed from: j */
    public String f185844j;

    /* renamed from: n */
    public String f185845n;

    /* renamed from: o */
    public int f185846o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof v44)) {
            return false;
        }
        v44 v44 = (v44) aVar;
        return C46238a.m51546a(this.f185838d, v44.f185838d) && C46238a.m51546a(this.f185839e, v44.f185839e) && C46238a.m51546a(Long.valueOf(this.f185840f), Long.valueOf(v44.f185840f)) && C46238a.m51546a(Long.valueOf(this.f185841g), Long.valueOf(v44.f185841g)) && C46238a.m51546a(this.f185842h, v44.f185842h) && C46238a.m51546a(this.f185843i, v44.f185843i) && C46238a.m51546a(this.f185844j, v44.f185844j) && C46238a.m51546a(this.f185845n, v44.f185845n) && C46238a.m51546a(Integer.valueOf(this.f185846o), Integer.valueOf(v44.f185846o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f185838d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f185839e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f185840f);
            aVar.mo74321h(4, this.f185841g);
            String str3 = this.f185842h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f185843i;
            if (str4 != null) {
                aVar.mo74323j(6, str4);
            }
            String str5 = this.f185844j;
            if (str5 != null) {
                aVar.mo74323j(7, str5);
            }
            String str6 = this.f185845n;
            if (str6 != null) {
                aVar.mo74323j(8, str6);
            }
            aVar.mo74318e(9, this.f185846o);
            return 0;
        } else if (i == 1) {
            String str7 = this.f185838d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f185839e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int h = i2 + C52418a.m58681h(3, this.f185840f) + C52418a.m58681h(4, this.f185841g);
            String str9 = this.f185842h;
            if (str9 != null) {
                h += C52418a.m58683j(5, str9);
            }
            String str10 = this.f185843i;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            String str11 = this.f185844j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            String str12 = this.f185845n;
            if (str12 != null) {
                h += C52418a.m58683j(8, str12);
            }
            return h + C52418a.m58678e(9, this.f185846o);
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
            v44 v44 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    v44.f185838d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    v44.f185839e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v44.f185840f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    v44.f185841g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    v44.f185842h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v44.f185843i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    v44.f185844j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    v44.f185845n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    v44.f185846o = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
