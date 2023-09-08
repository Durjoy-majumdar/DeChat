package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zs1 */
public class C78025zs1 extends C101820nt3 {

    /* renamed from: d */
    public String f228751d;

    /* renamed from: e */
    public String f228752e;

    /* renamed from: f */
    public String f228753f;

    /* renamed from: g */
    public String f228754g;

    /* renamed from: h */
    public String f228755h;

    /* renamed from: i */
    public String f228756i;

    /* renamed from: j */
    public String f228757j;

    /* renamed from: n */
    public String f228758n;

    /* renamed from: o */
    public int f228759o;

    /* renamed from: p */
    public String f228760p;

    /* renamed from: q */
    public String f228761q;

    /* renamed from: r */
    public String f228762r;

    /* renamed from: s */
    public C77963l1 f228763s;

    /* renamed from: t */
    public int f228764t;

    /* renamed from: u */
    public int f228765u;

    /* renamed from: v */
    public String f228766v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78025zs1)) {
            return false;
        }
        C78025zs1 zs12 = (C78025zs1) aVar;
        return C46238a.m51546a(this.BaseRequest, zs12.BaseRequest) && C46238a.m51546a(this.f228751d, zs12.f228751d) && C46238a.m51546a(this.f228752e, zs12.f228752e) && C46238a.m51546a(this.f228753f, zs12.f228753f) && C46238a.m51546a(this.f228754g, zs12.f228754g) && C46238a.m51546a(this.f228755h, zs12.f228755h) && C46238a.m51546a(this.f228756i, zs12.f228756i) && C46238a.m51546a(this.f228757j, zs12.f228757j) && C46238a.m51546a(this.f228758n, zs12.f228758n) && C46238a.m51546a(Integer.valueOf(this.f228759o), Integer.valueOf(zs12.f228759o)) && C46238a.m51546a(this.f228760p, zs12.f228760p) && C46238a.m51546a(this.f228761q, zs12.f228761q) && C46238a.m51546a(this.f228762r, zs12.f228762r) && C46238a.m51546a(this.f228763s, zs12.f228763s) && C46238a.m51546a(Integer.valueOf(this.f228764t), Integer.valueOf(zs12.f228764t)) && C46238a.m51546a(Integer.valueOf(this.f228765u), Integer.valueOf(zs12.f228765u)) && C46238a.m51546a(this.f228766v, zs12.f228766v);
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
            String str = this.f228751d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f228752e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f228753f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f228754g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f228755h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f228756i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f228757j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            String str8 = this.f228758n;
            if (str8 != null) {
                aVar.mo74323j(9, str8);
            }
            aVar.mo74318e(10, this.f228759o);
            String str9 = this.f228760p;
            if (str9 != null) {
                aVar.mo74323j(11, str9);
            }
            String str10 = this.f228761q;
            if (str10 != null) {
                aVar.mo74323j(12, str10);
            }
            String str11 = this.f228762r;
            if (str11 != null) {
                aVar.mo74323j(13, str11);
            }
            C77963l1 l1Var = this.f228763s;
            if (l1Var != null) {
                aVar.mo74322i(14, l1Var.computeSize());
                this.f228763s.writeFields(aVar);
            }
            aVar.mo74318e(15, this.f228764t);
            aVar.mo74318e(16, this.f228765u);
            String str12 = this.f228766v;
            if (str12 != null) {
                aVar.mo74323j(17, str12);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str13 = this.f228751d;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f228752e;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            String str15 = this.f228753f;
            if (str15 != null) {
                i3 += C52418a.m58683j(4, str15);
            }
            String str16 = this.f228754g;
            if (str16 != null) {
                i3 += C52418a.m58683j(5, str16);
            }
            String str17 = this.f228755h;
            if (str17 != null) {
                i3 += C52418a.m58683j(6, str17);
            }
            String str18 = this.f228756i;
            if (str18 != null) {
                i3 += C52418a.m58683j(7, str18);
            }
            String str19 = this.f228757j;
            if (str19 != null) {
                i3 += C52418a.m58683j(8, str19);
            }
            String str20 = this.f228758n;
            if (str20 != null) {
                i3 += C52418a.m58683j(9, str20);
            }
            int e = i3 + C52418a.m58678e(10, this.f228759o);
            String str21 = this.f228760p;
            if (str21 != null) {
                e += C52418a.m58683j(11, str21);
            }
            String str22 = this.f228761q;
            if (str22 != null) {
                e += C52418a.m58683j(12, str22);
            }
            String str23 = this.f228762r;
            if (str23 != null) {
                e += C52418a.m58683j(13, str23);
            }
            C77963l1 l1Var2 = this.f228763s;
            if (l1Var2 != null) {
                e += C52418a.m58682i(14, l1Var2.computeSize());
            }
            int e2 = e + C52418a.m58678e(15, this.f228764t) + C52418a.m58678e(16, this.f228765u);
            String str24 = this.f228766v;
            return str24 != null ? e2 + C52418a.m58683j(17, str24) : e2;
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
            C78025zs1 zs12 = objArr[1];
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
                        zs12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    zs12.f228751d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    zs12.f228752e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    zs12.f228753f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    zs12.f228754g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    zs12.f228755h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    zs12.f228756i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    zs12.f228757j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    zs12.f228758n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    zs12.f228759o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    zs12.f228760p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    zs12.f228761q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    zs12.f228762r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        zs12.f228763s = l1Var3;
                    }
                    return 0;
                case 15:
                    zs12.f228764t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    zs12.f228765u = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    zs12.f228766v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
