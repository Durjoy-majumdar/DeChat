package te3;

import di3.C86312j;
import ht1.C8802s1;
import if0.C46238a;
import java.util.LinkedList;
import ob0.C47350c;
import ob0.C89132b;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s71 */
public class C64703s71 extends C101820nt3 {

    /* renamed from: d */
    public C49842ig0 f185356d;

    /* renamed from: e */
    public String f185357e;

    /* renamed from: f */
    public long f185358f;

    /* renamed from: g */
    public long f185359g;

    /* renamed from: h */
    public String f185360h;

    /* renamed from: i */
    public int f185361i;

    /* renamed from: j */
    public int f185362j;

    /* renamed from: n */
    public String f185363n;

    /* renamed from: o */
    public String f185364o;

    /* renamed from: p */
    public C89349b f185365p;

    /* renamed from: q */
    public boolean f185366q;

    /* renamed from: r */
    public String f185367r;

    /* renamed from: s */
    public String f185368s;

    /* renamed from: t */
    public int f185369t;

    /* renamed from: u */
    public C89349b f185370u;

    /* renamed from: v */
    public LinkedList<C89349b> f185371v = new LinkedList<>();

    /* renamed from: w */
    public String f185372w;

    /* renamed from: x */
    public String f185373x;

    /* renamed from: b */
    public C89132b<C51354t71> mo89036b() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 5891;
        bVar.f127068c = "/cgi-bin/micromsg-bin/finderlivereward";
        bVar.f127066a = this;
        bVar.f127067b = new C51354t71();
        C47350c a = bVar.mo72403a();
        C89132b<C51354t71> ui = ((C8802s1) C86312j.m106911c(C8802s1.class)).mo9632ui();
        ui.mo123453j(a);
        return ui;
    }

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64703s71)) {
            return false;
        }
        C64703s71 s712 = (C64703s71) aVar;
        return C46238a.m51546a(this.BaseRequest, s712.BaseRequest) && C46238a.m51546a(this.f185356d, s712.f185356d) && C46238a.m51546a(this.f185357e, s712.f185357e) && C46238a.m51546a(Long.valueOf(this.f185358f), Long.valueOf(s712.f185358f)) && C46238a.m51546a(Long.valueOf(this.f185359g), Long.valueOf(s712.f185359g)) && C46238a.m51546a(this.f185360h, s712.f185360h) && C46238a.m51546a(Integer.valueOf(this.f185361i), Integer.valueOf(s712.f185361i)) && C46238a.m51546a(Integer.valueOf(this.f185362j), Integer.valueOf(s712.f185362j)) && C46238a.m51546a(this.f185363n, s712.f185363n) && C46238a.m51546a(this.f185364o, s712.f185364o) && C46238a.m51546a(this.f185365p, s712.f185365p) && C46238a.m51546a(Boolean.valueOf(this.f185366q), Boolean.valueOf(s712.f185366q)) && C46238a.m51546a(this.f185367r, s712.f185367r) && C46238a.m51546a(this.f185368s, s712.f185368s) && C46238a.m51546a(Integer.valueOf(this.f185369t), Integer.valueOf(s712.f185369t)) && C46238a.m51546a(this.f185370u, s712.f185370u) && C46238a.m51546a(this.f185371v, s712.f185371v) && C46238a.m51546a(this.f185372w, s712.f185372w) && C46238a.m51546a(this.f185373x, s712.f185373x);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            C49842ig0 ig02 = this.f185356d;
            if (ig02 != null) {
                aVar.mo74322i(2, ig02.computeSize());
                this.f185356d.writeFields(aVar);
            }
            String str = this.f185357e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f185358f);
            aVar.mo74321h(5, this.f185359g);
            String str2 = this.f185360h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            aVar.mo74318e(7, this.f185361i);
            aVar.mo74318e(8, this.f185362j);
            String str3 = this.f185363n;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f185364o;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            C89349b bVar = this.f185365p;
            if (bVar != null) {
                aVar.mo74315b(11, bVar);
            }
            aVar.mo74314a(12, this.f185366q);
            String str5 = this.f185367r;
            if (str5 != null) {
                aVar.mo74323j(13, str5);
            }
            String str6 = this.f185368s;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            aVar.mo74318e(15, this.f185369t);
            C89349b bVar2 = this.f185370u;
            if (bVar2 != null) {
                aVar.mo74315b(16, bVar2);
            }
            aVar.mo74320g(19, 6, this.f185371v);
            String str7 = this.f185372w;
            if (str7 != null) {
                aVar.mo74323j(20, str7);
            }
            String str8 = this.f185373x;
            if (str8 != null) {
                aVar.mo74323j(21, str8);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            C49842ig0 ig03 = this.f185356d;
            if (ig03 != null) {
                i3 += C52418a.m58682i(2, ig03.computeSize());
            }
            String str9 = this.f185357e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            int h = i3 + C52418a.m58681h(4, this.f185358f) + C52418a.m58681h(5, this.f185359g);
            String str10 = this.f185360h;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            int e = h + C52418a.m58678e(7, this.f185361i) + C52418a.m58678e(8, this.f185362j);
            String str11 = this.f185363n;
            if (str11 != null) {
                e += C52418a.m58683j(9, str11);
            }
            String str12 = this.f185364o;
            if (str12 != null) {
                e += C52418a.m58683j(10, str12);
            }
            C89349b bVar3 = this.f185365p;
            if (bVar3 != null) {
                e += C52418a.m58675b(11, bVar3);
            }
            int a = e + C52418a.m58674a(12, this.f185366q);
            String str13 = this.f185367r;
            if (str13 != null) {
                a += C52418a.m58683j(13, str13);
            }
            String str14 = this.f185368s;
            if (str14 != null) {
                a += C52418a.m58683j(14, str14);
            }
            int e2 = a + C52418a.m58678e(15, this.f185369t);
            C89349b bVar4 = this.f185370u;
            if (bVar4 != null) {
                e2 += C52418a.m58675b(16, bVar4);
            }
            int g = e2 + C52418a.m58680g(19, 6, this.f185371v);
            String str15 = this.f185372w;
            if (str15 != null) {
                g += C52418a.m58683j(20, str15);
            }
            String str16 = this.f185373x;
            return str16 != null ? g + C52418a.m58683j(21, str16) : g;
        } else if (i2 == 2) {
            this.f185371v.clear();
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
            C64703s71 s712 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        s712.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        s712.f185356d = ig04;
                    }
                    return 0;
                case 3:
                    s712.f185357e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    s712.f185358f = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    s712.f185359g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    s712.f185360h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    s712.f185361i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    s712.f185362j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    s712.f185363n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    s712.f185364o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    s712.f185365p = aVar3.mo141626d(intValue);
                    return 0;
                case 12:
                    s712.f185366q = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    s712.f185367r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    s712.f185368s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    s712.f185369t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    s712.f185370u = aVar3.mo141626d(intValue);
                    return 0;
                case 19:
                    s712.f185371v.add(aVar3.mo141626d(intValue));
                    return 0;
                case 20:
                    s712.f185372w = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    s712.f185373x = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
