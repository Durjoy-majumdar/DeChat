package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bi3 */
public class C77908bi3 extends C47465a {

    /* renamed from: d */
    public int f227003d;

    /* renamed from: e */
    public LinkedList<C64661ql2> f227004e = new LinkedList<>();

    /* renamed from: f */
    public int f227005f;

    /* renamed from: g */
    public int f227006g;

    /* renamed from: h */
    public String f227007h;

    /* renamed from: i */
    public String f227008i;

    /* renamed from: j */
    public String f227009j;

    /* renamed from: n */
    public String f227010n;

    /* renamed from: o */
    public int f227011o;

    /* renamed from: p */
    public String f227012p;

    /* renamed from: q */
    public String f227013q;

    /* renamed from: r */
    public int f227014r;

    /* renamed from: s */
    public int f227015s;

    /* renamed from: t */
    public String f227016t;

    /* renamed from: u */
    public int f227017u;

    /* renamed from: v */
    public LinkedList<C49097d50> f227018v = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77908bi3)) {
            return false;
        }
        C77908bi3 bi32 = (C77908bi3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f227003d), Integer.valueOf(bi32.f227003d)) && C46238a.m51546a(this.f227004e, bi32.f227004e) && C46238a.m51546a(Integer.valueOf(this.f227005f), Integer.valueOf(bi32.f227005f)) && C46238a.m51546a(Integer.valueOf(this.f227006g), Integer.valueOf(bi32.f227006g)) && C46238a.m51546a(this.f227007h, bi32.f227007h) && C46238a.m51546a(this.f227008i, bi32.f227008i) && C46238a.m51546a(this.f227009j, bi32.f227009j) && C46238a.m51546a(this.f227010n, bi32.f227010n) && C46238a.m51546a(Integer.valueOf(this.f227011o), Integer.valueOf(bi32.f227011o)) && C46238a.m51546a(this.f227012p, bi32.f227012p) && C46238a.m51546a(this.f227013q, bi32.f227013q) && C46238a.m51546a(Integer.valueOf(this.f227014r), Integer.valueOf(bi32.f227014r)) && C46238a.m51546a(Integer.valueOf(this.f227015s), Integer.valueOf(bi32.f227015s)) && C46238a.m51546a(this.f227016t, bi32.f227016t) && C46238a.m51546a(Integer.valueOf(this.f227017u), Integer.valueOf(bi32.f227017u)) && C46238a.m51546a(this.f227018v, bi32.f227018v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f227003d);
            aVar.mo74320g(2, 8, this.f227004e);
            aVar.mo74318e(3, this.f227005f);
            aVar.mo74318e(4, this.f227006g);
            String str = this.f227007h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f227008i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            String str3 = this.f227009j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f227010n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            aVar.mo74318e(9, this.f227011o);
            String str5 = this.f227012p;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f227013q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74318e(12, this.f227014r);
            aVar.mo74318e(13, this.f227015s);
            String str7 = this.f227016t;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            aVar.mo74318e(15, this.f227017u);
            aVar.mo74320g(16, 8, this.f227018v);
            return 0;
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f227003d) + 0 + C52418a.m58680g(2, 8, this.f227004e) + C52418a.m58678e(3, this.f227005f) + C52418a.m58678e(4, this.f227006g);
            String str8 = this.f227007h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f227008i;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f227009j;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            String str11 = this.f227010n;
            if (str11 != null) {
                e += C52418a.m58683j(8, str11);
            }
            int e2 = e + C52418a.m58678e(9, this.f227011o);
            String str12 = this.f227012p;
            if (str12 != null) {
                e2 += C52418a.m58683j(10, str12);
            }
            String str13 = this.f227013q;
            if (str13 != null) {
                e2 += C52418a.m58683j(11, str13);
            }
            int e3 = e2 + C52418a.m58678e(12, this.f227014r) + C52418a.m58678e(13, this.f227015s);
            String str14 = this.f227016t;
            if (str14 != null) {
                e3 += C52418a.m58683j(14, str14);
            }
            return e3 + C52418a.m58678e(15, this.f227017u) + C52418a.m58680g(16, 8, this.f227018v);
        } else if (i2 == 2) {
            this.f227004e.clear();
            this.f227018v.clear();
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
            C77908bi3 bi32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bi32.f227003d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64661ql2 ql22 = new C64661ql2();
                        if (bArr != null && bArr.length > 0) {
                            ql22.parseFrom(bArr);
                        }
                        bi32.f227004e.add(ql22);
                    }
                    return 0;
                case 3:
                    bi32.f227005f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    bi32.f227006g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bi32.f227007h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bi32.f227008i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bi32.f227009j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    bi32.f227010n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    bi32.f227011o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    bi32.f227012p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    bi32.f227013q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    bi32.f227014r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    bi32.f227015s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    bi32.f227016t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    bi32.f227017u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49097d50 d502 = new C49097d50();
                        if (bArr2 != null && bArr2.length > 0) {
                            d502.parseFrom(bArr2);
                        }
                        bi32.f227018v.add(d502);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
