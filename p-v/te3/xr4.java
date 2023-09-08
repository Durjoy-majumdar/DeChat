package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class xr4 extends C47465a {

    /* renamed from: d */
    public String f354547d = "";

    /* renamed from: e */
    public String f354548e = "";

    /* renamed from: f */
    public String f354549f = "";

    /* renamed from: g */
    public String f354550g = "";

    /* renamed from: h */
    public String f354551h = "";

    /* renamed from: i */
    public int f354552i = 0;

    /* renamed from: j */
    public int f354553j;

    /* renamed from: n */
    public int f354554n;

    /* renamed from: o */
    public long f354555o = 0;

    /* renamed from: p */
    public long f354556p = 0;

    /* renamed from: q */
    public int f354557q = 0;

    /* renamed from: r */
    public LinkedList<C101862wg> f354558r = new LinkedList<>();

    /* renamed from: s */
    public LinkedList<C51991xl2> f354559s = new LinkedList<>();

    /* renamed from: t */
    public boolean f354560t = true;

    /* renamed from: u */
    public int f354561u = -1;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof xr4)) {
            return false;
        }
        xr4 xr4 = (xr4) aVar;
        return C46238a.m51546a(this.f354547d, xr4.f354547d) && C46238a.m51546a(this.f354548e, xr4.f354548e) && C46238a.m51546a(this.f354549f, xr4.f354549f) && C46238a.m51546a(this.f354550g, xr4.f354550g) && C46238a.m51546a(this.f354551h, xr4.f354551h) && C46238a.m51546a(Integer.valueOf(this.f354552i), Integer.valueOf(xr4.f354552i)) && C46238a.m51546a(Integer.valueOf(this.f354553j), Integer.valueOf(xr4.f354553j)) && C46238a.m51546a(Integer.valueOf(this.f354554n), Integer.valueOf(xr4.f354554n)) && C46238a.m51546a(Long.valueOf(this.f354555o), Long.valueOf(xr4.f354555o)) && C46238a.m51546a(Long.valueOf(this.f354556p), Long.valueOf(xr4.f354556p)) && C46238a.m51546a(Integer.valueOf(this.f354557q), Integer.valueOf(xr4.f354557q)) && C46238a.m51546a(this.f354558r, xr4.f354558r) && C46238a.m51546a(this.f354559s, xr4.f354559s) && C46238a.m51546a(Boolean.valueOf(this.f354560t), Boolean.valueOf(xr4.f354560t)) && C46238a.m51546a(Integer.valueOf(this.f354561u), Integer.valueOf(xr4.f354561u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f354547d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f354548e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f354549f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f354550g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f354551h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74318e(6, this.f354552i);
            aVar.mo74318e(7, this.f354553j);
            aVar.mo74318e(8, this.f354554n);
            aVar.mo74321h(9, this.f354555o);
            aVar.mo74321h(10, this.f354556p);
            aVar.mo74318e(11, this.f354557q);
            aVar.mo74320g(12, 8, this.f354558r);
            aVar.mo74320g(13, 8, this.f354559s);
            aVar.mo74314a(14, this.f354560t);
            aVar.mo74318e(15, this.f354561u);
            return 0;
        } else if (i2 == 1) {
            String str6 = this.f354547d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            String str7 = this.f354548e;
            if (str7 != null) {
                i3 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f354549f;
            if (str8 != null) {
                i3 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f354550g;
            if (str9 != null) {
                i3 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f354551h;
            if (str10 != null) {
                i3 += C52418a.m58683j(5, str10);
            }
            return i3 + C52418a.m58678e(6, this.f354552i) + C52418a.m58678e(7, this.f354553j) + C52418a.m58678e(8, this.f354554n) + C52418a.m58681h(9, this.f354555o) + C52418a.m58681h(10, this.f354556p) + C52418a.m58678e(11, this.f354557q) + C52418a.m58680g(12, 8, this.f354558r) + C52418a.m58680g(13, 8, this.f354559s) + C52418a.m58674a(14, this.f354560t) + C52418a.m58678e(15, this.f354561u);
        } else if (i2 == 2) {
            this.f354558r.clear();
            this.f354559s.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            xr4 xr4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xr4.f354547d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    xr4.f354548e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    xr4.f354549f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    xr4.f354550g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xr4.f354551h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    xr4.f354552i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    xr4.f354553j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    xr4.f354554n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    xr4.f354555o = aVar3.mo141631i(intValue);
                    return 0;
                case 10:
                    xr4.f354556p = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    xr4.f354557q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C101862wg wgVar = new C101862wg();
                        if (bArr != null && bArr.length > 0) {
                            wgVar.parseFrom(bArr);
                        }
                        xr4.f354558r.add(wgVar);
                    }
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51991xl2 xl22 = new C51991xl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            xl22.parseFrom(bArr2);
                        }
                        xr4.f354559s.add(xl22);
                    }
                    return 0;
                case 14:
                    xr4.f354560t = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    xr4.f354561u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
