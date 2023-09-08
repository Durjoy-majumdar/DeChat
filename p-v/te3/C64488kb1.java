package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.kb1 */
public class C64488kb1 extends C47465a {

    /* renamed from: d */
    public String f183904d;

    /* renamed from: e */
    public String f183905e;

    /* renamed from: f */
    public String f183906f;

    /* renamed from: g */
    public String f183907g;

    /* renamed from: h */
    public String f183908h;

    /* renamed from: i */
    public String f183909i;

    /* renamed from: j */
    public String f183910j;

    /* renamed from: n */
    public String f183911n;

    /* renamed from: o */
    public String f183912o;

    /* renamed from: p */
    public String f183913p;

    /* renamed from: q */
    public String f183914q;

    /* renamed from: r */
    public long f183915r;

    /* renamed from: s */
    public String f183916s;

    /* renamed from: t */
    public String f183917t;

    /* renamed from: u */
    public int f183918u;

    /* renamed from: v */
    public boolean f183919v;

    /* renamed from: w */
    public String f183920w;

    /* renamed from: x */
    public C64519lb1 f183921x;

    /* renamed from: y */
    public String f183922y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64488kb1)) {
            return false;
        }
        C64488kb1 kb12 = (C64488kb1) aVar;
        return C46238a.m51546a(this.f183904d, kb12.f183904d) && C46238a.m51546a(this.f183905e, kb12.f183905e) && C46238a.m51546a(this.f183906f, kb12.f183906f) && C46238a.m51546a(this.f183907g, kb12.f183907g) && C46238a.m51546a(this.f183908h, kb12.f183908h) && C46238a.m51546a(this.f183909i, kb12.f183909i) && C46238a.m51546a(this.f183910j, kb12.f183910j) && C46238a.m51546a(this.f183911n, kb12.f183911n) && C46238a.m51546a(this.f183912o, kb12.f183912o) && C46238a.m51546a(this.f183913p, kb12.f183913p) && C46238a.m51546a(this.f183914q, kb12.f183914q) && C46238a.m51546a(Long.valueOf(this.f183915r), Long.valueOf(kb12.f183915r)) && C46238a.m51546a(this.f183916s, kb12.f183916s) && C46238a.m51546a(this.f183917t, kb12.f183917t) && C46238a.m51546a(Integer.valueOf(this.f183918u), Integer.valueOf(kb12.f183918u)) && C46238a.m51546a(Boolean.valueOf(this.f183919v), Boolean.valueOf(kb12.f183919v)) && C46238a.m51546a(this.f183920w, kb12.f183920w) && C46238a.m51546a(this.f183921x, kb12.f183921x) && C46238a.m51546a(this.f183922y, kb12.f183922y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183904d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183905e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f183906f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f183907g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f183908h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            String str6 = this.f183909i;
            if (str6 != null) {
                aVar.mo74323j(6, str6);
            }
            String str7 = this.f183910j;
            if (str7 != null) {
                aVar.mo74323j(7, str7);
            }
            String str8 = this.f183911n;
            if (str8 != null) {
                aVar.mo74323j(8, str8);
            }
            String str9 = this.f183912o;
            if (str9 != null) {
                aVar.mo74323j(9, str9);
            }
            String str10 = this.f183913p;
            if (str10 != null) {
                aVar.mo74323j(10, str10);
            }
            String str11 = this.f183914q;
            if (str11 != null) {
                aVar.mo74323j(11, str11);
            }
            aVar.mo74321h(12, this.f183915r);
            String str12 = this.f183916s;
            if (str12 != null) {
                aVar.mo74323j(13, str12);
            }
            String str13 = this.f183917t;
            if (str13 != null) {
                aVar.mo74323j(14, str13);
            }
            aVar.mo74318e(15, this.f183918u);
            aVar.mo74314a(16, this.f183919v);
            String str14 = this.f183920w;
            if (str14 != null) {
                aVar.mo74323j(17, str14);
            }
            C64519lb1 lb12 = this.f183921x;
            if (lb12 != null) {
                aVar.mo74322i(18, lb12.computeSize());
                this.f183921x.writeFields(aVar);
            }
            String str15 = this.f183922y;
            if (str15 != null) {
                aVar.mo74323j(19, str15);
            }
            return 0;
        } else if (i2 == 1) {
            String str16 = this.f183904d;
            if (str16 != null) {
                i3 = C52418a.m58683j(1, str16) + 0;
            }
            String str17 = this.f183905e;
            if (str17 != null) {
                i3 += C52418a.m58683j(2, str17);
            }
            String str18 = this.f183906f;
            if (str18 != null) {
                i3 += C52418a.m58683j(3, str18);
            }
            String str19 = this.f183907g;
            if (str19 != null) {
                i3 += C52418a.m58683j(4, str19);
            }
            String str20 = this.f183908h;
            if (str20 != null) {
                i3 += C52418a.m58683j(5, str20);
            }
            String str21 = this.f183909i;
            if (str21 != null) {
                i3 += C52418a.m58683j(6, str21);
            }
            String str22 = this.f183910j;
            if (str22 != null) {
                i3 += C52418a.m58683j(7, str22);
            }
            String str23 = this.f183911n;
            if (str23 != null) {
                i3 += C52418a.m58683j(8, str23);
            }
            String str24 = this.f183912o;
            if (str24 != null) {
                i3 += C52418a.m58683j(9, str24);
            }
            String str25 = this.f183913p;
            if (str25 != null) {
                i3 += C52418a.m58683j(10, str25);
            }
            String str26 = this.f183914q;
            if (str26 != null) {
                i3 += C52418a.m58683j(11, str26);
            }
            int h = i3 + C52418a.m58681h(12, this.f183915r);
            String str27 = this.f183916s;
            if (str27 != null) {
                h += C52418a.m58683j(13, str27);
            }
            String str28 = this.f183917t;
            if (str28 != null) {
                h += C52418a.m58683j(14, str28);
            }
            int e = h + C52418a.m58678e(15, this.f183918u) + C52418a.m58674a(16, this.f183919v);
            String str29 = this.f183920w;
            if (str29 != null) {
                e += C52418a.m58683j(17, str29);
            }
            C64519lb1 lb13 = this.f183921x;
            if (lb13 != null) {
                e += C52418a.m58682i(18, lb13.computeSize());
            }
            String str30 = this.f183922y;
            return str30 != null ? e + C52418a.m58683j(19, str30) : e;
        } else if (i2 == 2) {
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
            C64488kb1 kb12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kb12.f183904d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kb12.f183905e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    kb12.f183906f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    kb12.f183907g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kb12.f183908h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kb12.f183909i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kb12.f183910j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kb12.f183911n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kb12.f183912o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    kb12.f183913p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    kb12.f183914q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    kb12.f183915r = aVar3.mo141631i(intValue);
                    return 0;
                case 13:
                    kb12.f183916s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    kb12.f183917t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    kb12.f183918u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    kb12.f183919v = aVar3.mo141625c(intValue);
                    return 0;
                case 17:
                    kb12.f183920w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64519lb1 lb14 = new C64519lb1();
                        if (bArr != null && bArr.length > 0) {
                            lb14.parseFrom(bArr);
                        }
                        kb12.f183921x = lb14;
                    }
                    return 0;
                case 19:
                    kb12.f183922y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
