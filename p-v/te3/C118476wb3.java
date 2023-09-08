package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wb3 */
public class C118476wb3 extends C47465a {

    /* renamed from: d */
    public String f354507d;

    /* renamed from: e */
    public String f354508e;

    /* renamed from: f */
    public double f354509f;

    /* renamed from: g */
    public double f354510g;

    /* renamed from: h */
    public long f354511h;

    /* renamed from: i */
    public String f354512i;

    /* renamed from: j */
    public String f354513j;

    /* renamed from: n */
    public String f354514n;

    /* renamed from: o */
    public String f354515o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118476wb3)) {
            return false;
        }
        C118476wb3 wb32 = (C118476wb3) aVar;
        return C46238a.m51546a(this.f354507d, wb32.f354507d) && C46238a.m51546a(this.f354508e, wb32.f354508e) && C46238a.m51546a(Double.valueOf(this.f354509f), Double.valueOf(wb32.f354509f)) && C46238a.m51546a(Double.valueOf(this.f354510g), Double.valueOf(wb32.f354510g)) && C46238a.m51546a(Long.valueOf(this.f354511h), Long.valueOf(wb32.f354511h)) && C46238a.m51546a(this.f354512i, wb32.f354512i) && C46238a.m51546a(this.f354513j, wb32.f354513j) && C46238a.m51546a(this.f354514n, wb32.f354514n) && C46238a.m51546a(this.f354515o, wb32.f354515o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354507d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354508e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74316c(3, this.f354509f);
            aVar.mo74316c(4, this.f354510g);
            aVar.mo74321h(5, this.f354511h);
            String str3 = this.f354512i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f354513j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f354514n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            String str6 = this.f354515o;
            if (str6 != null) {
                aVar.mo74323j(9, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f354507d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f354508e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int c = i2 + C52418a.m58676c(3, this.f354509f) + C52418a.m58676c(4, this.f354510g) + C52418a.m58681h(5, this.f354511h);
            String str9 = this.f354512i;
            if (str9 != null) {
                c += C52418a.m58683j(6, str9);
            }
            String str10 = this.f354513j;
            if (str10 != null) {
                c += C52418a.m58683j(7, str10);
            }
            String str11 = this.f354514n;
            if (str11 != null) {
                c += C52418a.m58683j(8, str11);
            }
            String str12 = this.f354515o;
            return str12 != null ? c + C52418a.m58683j(9, str12) : c;
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
            C118476wb3 wb32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wb32.f354507d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wb32.f354508e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wb32.f354509f = aVar3.mo141627e(intValue);
                    return 0;
                case 4:
                    wb32.f354510g = aVar3.mo141627e(intValue);
                    return 0;
                case 5:
                    wb32.f354511h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    wb32.f354512i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    wb32.f354513j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    wb32.f354514n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    wb32.f354515o = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
