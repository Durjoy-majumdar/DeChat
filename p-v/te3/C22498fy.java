package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fy */
public class C22498fy extends C47465a {

    /* renamed from: d */
    public String f63884d;

    /* renamed from: e */
    public String f63885e;

    /* renamed from: f */
    public String f63886f;

    /* renamed from: g */
    public String f63887g;

    /* renamed from: h */
    public long f63888h;

    /* renamed from: i */
    public String f63889i;

    /* renamed from: j */
    public String f63890j;

    /* renamed from: n */
    public String f63891n;

    /* renamed from: o */
    public C64748ud2 f63892o;

    /* renamed from: p */
    public String f63893p;

    /* renamed from: q */
    public String f63894q;

    /* renamed from: r */
    public String f63895r;

    /* renamed from: s */
    public String f63896s;

    /* renamed from: t */
    public String f63897t;

    /* renamed from: u */
    public String f63898u;

    /* renamed from: v */
    public String f63899v;

    /* renamed from: w */
    public String f63900w;

    /* renamed from: x */
    public String f63901x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22498fy)) {
            return false;
        }
        C22498fy fyVar = (C22498fy) aVar;
        return C46238a.m51546a(this.f63884d, fyVar.f63884d) && C46238a.m51546a(this.f63885e, fyVar.f63885e) && C46238a.m51546a(this.f63886f, fyVar.f63886f) && C46238a.m51546a(this.f63887g, fyVar.f63887g) && C46238a.m51546a(Long.valueOf(this.f63888h), Long.valueOf(fyVar.f63888h)) && C46238a.m51546a(this.f63889i, fyVar.f63889i) && C46238a.m51546a(this.f63890j, fyVar.f63890j) && C46238a.m51546a(this.f63891n, fyVar.f63891n) && C46238a.m51546a(this.f63892o, fyVar.f63892o) && C46238a.m51546a(this.f63893p, fyVar.f63893p) && C46238a.m51546a(this.f63894q, fyVar.f63894q) && C46238a.m51546a(this.f63895r, fyVar.f63895r) && C46238a.m51546a(this.f63896s, fyVar.f63896s) && C46238a.m51546a(this.f63897t, fyVar.f63897t) && C46238a.m51546a(this.f63898u, fyVar.f63898u) && C46238a.m51546a(this.f63899v, fyVar.f63899v) && C46238a.m51546a(this.f63900w, fyVar.f63900w) && C46238a.m51546a(this.f63901x, fyVar.f63901x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f63884d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f63885e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f63886f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f63887g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(5, this.f63888h);
            String str5 = this.f63889i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f63890j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f63891n;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            C64748ud2 ud22 = this.f63892o;
            if (ud22 != null) {
                aVar.mo74322i(9, ud22.computeSize());
                this.f63892o.writeFields(aVar);
            }
            String str8 = this.f63893p;
            if (str8 != null) {
                aVar.mo74323j(10, str8);
            }
            String str9 = this.f63894q;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f63895r;
            if (str10 != null) {
                aVar.mo74323j(13, str10);
            }
            String str11 = this.f63896s;
            if (str11 != null) {
                aVar.mo74323j(14, str11);
            }
            String str12 = this.f63897t;
            if (str12 != null) {
                aVar.mo74323j(15, str12);
            }
            String str13 = this.f63898u;
            if (str13 != null) {
                aVar.mo74323j(16, str13);
            }
            String str14 = this.f63899v;
            if (str14 != null) {
                aVar.mo74323j(17, str14);
            }
            String str15 = this.f63900w;
            if (str15 != null) {
                aVar.mo74323j(18, str15);
            }
            String str16 = this.f63901x;
            if (str16 != null) {
                aVar.mo74323j(19, str16);
            }
            return 0;
        } else if (i2 == 1) {
            String str17 = this.f63884d;
            if (str17 != null) {
                i3 = C52418a.m58683j(1, str17) + 0;
            }
            String str18 = this.f63885e;
            if (str18 != null) {
                i3 += C52418a.m58683j(2, str18);
            }
            String str19 = this.f63886f;
            if (str19 != null) {
                i3 += C52418a.m58683j(3, str19);
            }
            String str20 = this.f63887g;
            if (str20 != null) {
                i3 += C52418a.m58683j(4, str20);
            }
            int h = i3 + C52418a.m58681h(5, this.f63888h);
            String str21 = this.f63889i;
            if (str21 != null) {
                h += C52418a.m58683j(6, str21);
            }
            String str22 = this.f63890j;
            if (str22 != null) {
                h += C52418a.m58683j(7, str22);
            }
            String str23 = this.f63891n;
            if (str23 != null) {
                h += C52418a.m58683j(8, str23);
            }
            C64748ud2 ud23 = this.f63892o;
            if (ud23 != null) {
                h += C52418a.m58682i(9, ud23.computeSize());
            }
            String str24 = this.f63893p;
            if (str24 != null) {
                h += C52418a.m58683j(10, str24);
            }
            String str25 = this.f63894q;
            if (str25 != null) {
                h += C52418a.m58683j(11, str25);
            }
            String str26 = this.f63895r;
            if (str26 != null) {
                h += C52418a.m58683j(13, str26);
            }
            String str27 = this.f63896s;
            if (str27 != null) {
                h += C52418a.m58683j(14, str27);
            }
            String str28 = this.f63897t;
            if (str28 != null) {
                h += C52418a.m58683j(15, str28);
            }
            String str29 = this.f63898u;
            if (str29 != null) {
                h += C52418a.m58683j(16, str29);
            }
            String str30 = this.f63899v;
            if (str30 != null) {
                h += C52418a.m58683j(17, str30);
            }
            String str31 = this.f63900w;
            if (str31 != null) {
                h += C52418a.m58683j(18, str31);
            }
            String str32 = this.f63901x;
            return str32 != null ? h + C52418a.m58683j(19, str32) : h;
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
            C22498fy fyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fyVar.f63884d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fyVar.f63885e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fyVar.f63886f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fyVar.f63887g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fyVar.f63888h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    fyVar.f63889i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    fyVar.f63890j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fyVar.f63891n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64748ud2 ud24 = new C64748ud2();
                        if (bArr != null && bArr.length > 0) {
                            ud24.parseFrom(bArr);
                        }
                        fyVar.f63892o = ud24;
                    }
                    return 0;
                case 10:
                    fyVar.f63893p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    fyVar.f63894q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    fyVar.f63895r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    fyVar.f63896s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    fyVar.f63897t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    fyVar.f63898u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    fyVar.f63899v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    fyVar.f63900w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    fyVar.f63901x = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
