package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.c */
public class C52744c extends C47465a {

    /* renamed from: d */
    public String f147349d;

    /* renamed from: e */
    public String f147350e;

    /* renamed from: f */
    public long f147351f;

    /* renamed from: g */
    public String f147352g;

    /* renamed from: h */
    public int f147353h;

    /* renamed from: i */
    public int f147354i;

    /* renamed from: j */
    public String f147355j;

    /* renamed from: n */
    public C52756o f147356n;

    /* renamed from: o */
    public String f147357o;

    /* renamed from: p */
    public String f147358p;

    /* renamed from: q */
    public boolean f147359q;

    /* renamed from: r */
    public LinkedList<C52742a> f147360r = new LinkedList<>();

    /* renamed from: s */
    public String f147361s;

    /* renamed from: t */
    public String f147362t;

    /* renamed from: u */
    public long f147363u;

    /* renamed from: v */
    public String f147364v;

    /* renamed from: w */
    public String f147365w;

    /* renamed from: x */
    public String f147366x;

    /* renamed from: y */
    public String f147367y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52744c)) {
            return false;
        }
        C52744c cVar = (C52744c) aVar;
        return C46238a.m51546a(this.f147349d, cVar.f147349d) && C46238a.m51546a(this.f147350e, cVar.f147350e) && C46238a.m51546a(Long.valueOf(this.f147351f), Long.valueOf(cVar.f147351f)) && C46238a.m51546a(this.f147352g, cVar.f147352g) && C46238a.m51546a(Integer.valueOf(this.f147353h), Integer.valueOf(cVar.f147353h)) && C46238a.m51546a(Integer.valueOf(this.f147354i), Integer.valueOf(cVar.f147354i)) && C46238a.m51546a(this.f147355j, cVar.f147355j) && C46238a.m51546a(this.f147356n, cVar.f147356n) && C46238a.m51546a(this.f147357o, cVar.f147357o) && C46238a.m51546a(this.f147358p, cVar.f147358p) && C46238a.m51546a(Boolean.valueOf(this.f147359q), Boolean.valueOf(cVar.f147359q)) && C46238a.m51546a(this.f147360r, cVar.f147360r) && C46238a.m51546a(this.f147361s, cVar.f147361s) && C46238a.m51546a(this.f147362t, cVar.f147362t) && C46238a.m51546a(Long.valueOf(this.f147363u), Long.valueOf(cVar.f147363u)) && C46238a.m51546a(this.f147364v, cVar.f147364v) && C46238a.m51546a(this.f147365w, cVar.f147365w) && C46238a.m51546a(this.f147366x, cVar.f147366x) && C46238a.m51546a(this.f147367y, cVar.f147367y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147349d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f147350e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f147351f);
            String str3 = this.f147352g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(6, this.f147353h);
            aVar.mo74318e(7, this.f147354i);
            String str4 = this.f147355j;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            C52756o oVar = this.f147356n;
            if (oVar != null) {
                aVar.mo74322i(9, oVar.computeSize());
                this.f147356n.writeFields(aVar);
            }
            String str5 = this.f147357o;
            if (str5 != null) {
                aVar.mo74323j(10, str5);
            }
            String str6 = this.f147358p;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            aVar.mo74314a(12, this.f147359q);
            aVar.mo74320g(13, 8, this.f147360r);
            String str7 = this.f147361s;
            if (str7 != null) {
                aVar.mo74323j(14, str7);
            }
            String str8 = this.f147362t;
            if (str8 != null) {
                aVar.mo74323j(15, str8);
            }
            aVar.mo74321h(16, this.f147363u);
            String str9 = this.f147364v;
            if (str9 != null) {
                aVar.mo74323j(17, str9);
            }
            String str10 = this.f147365w;
            if (str10 != null) {
                aVar.mo74323j(19, str10);
            }
            String str11 = this.f147366x;
            if (str11 != null) {
                aVar.mo74323j(20, str11);
            }
            String str12 = this.f147367y;
            if (str12 != null) {
                aVar.mo74323j(21, str12);
            }
            return 0;
        } else if (i2 == 1) {
            String str13 = this.f147349d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            String str14 = this.f147350e;
            if (str14 != null) {
                i3 += C52418a.m58683j(2, str14);
            }
            int h = i3 + C52418a.m58681h(3, this.f147351f);
            String str15 = this.f147352g;
            if (str15 != null) {
                h += C52418a.m58683j(4, str15);
            }
            int e = h + C52418a.m58678e(6, this.f147353h) + C52418a.m58678e(7, this.f147354i);
            String str16 = this.f147355j;
            if (str16 != null) {
                e += C52418a.m58683j(8, str16);
            }
            C52756o oVar2 = this.f147356n;
            if (oVar2 != null) {
                e += C52418a.m58682i(9, oVar2.computeSize());
            }
            String str17 = this.f147357o;
            if (str17 != null) {
                e += C52418a.m58683j(10, str17);
            }
            String str18 = this.f147358p;
            if (str18 != null) {
                e += C52418a.m58683j(11, str18);
            }
            int a = e + C52418a.m58674a(12, this.f147359q) + C52418a.m58680g(13, 8, this.f147360r);
            String str19 = this.f147361s;
            if (str19 != null) {
                a += C52418a.m58683j(14, str19);
            }
            String str20 = this.f147362t;
            if (str20 != null) {
                a += C52418a.m58683j(15, str20);
            }
            int h2 = a + C52418a.m58681h(16, this.f147363u);
            String str21 = this.f147364v;
            if (str21 != null) {
                h2 += C52418a.m58683j(17, str21);
            }
            String str22 = this.f147365w;
            if (str22 != null) {
                h2 += C52418a.m58683j(19, str22);
            }
            String str23 = this.f147366x;
            if (str23 != null) {
                h2 += C52418a.m58683j(20, str23);
            }
            String str24 = this.f147367y;
            return str24 != null ? h2 + C52418a.m58683j(21, str24) : h2;
        } else if (i2 == 2) {
            this.f147360r.clear();
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
            C52744c cVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    cVar.f147349d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    cVar.f147350e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    cVar.f147351f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    cVar.f147352g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    cVar.f147353h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    cVar.f147354i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    cVar.f147355j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C52756o oVar3 = new C52756o();
                        if (bArr != null && bArr.length > 0) {
                            oVar3.parseFrom(bArr);
                        }
                        cVar.f147356n = oVar3;
                    }
                    return 0;
                case 10:
                    cVar.f147357o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    cVar.f147358p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    cVar.f147359q = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C52742a aVar4 = new C52742a();
                        if (bArr2 != null && bArr2.length > 0) {
                            aVar4.parseFrom(bArr2);
                        }
                        cVar.f147360r.add(aVar4);
                    }
                    return 0;
                case 14:
                    cVar.f147361s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    cVar.f147362t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    cVar.f147363u = aVar3.mo141631i(intValue);
                    return 0;
                case 17:
                    cVar.f147364v = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    cVar.f147365w = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    cVar.f147366x = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    cVar.f147367y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
