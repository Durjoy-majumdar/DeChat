package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jv */
public class C77954jv extends C101820nt3 {

    /* renamed from: d */
    public String f227680d;

    /* renamed from: e */
    public String f227681e;

    /* renamed from: f */
    public String f227682f;

    /* renamed from: g */
    public String f227683g;

    /* renamed from: h */
    public String f227684h;

    /* renamed from: i */
    public String f227685i;

    /* renamed from: j */
    public String f227686j;

    /* renamed from: n */
    public int f227687n;

    /* renamed from: o */
    public C77963l1 f227688o;

    /* renamed from: p */
    public String f227689p;

    /* renamed from: q */
    public String f227690q;

    /* renamed from: r */
    public int f227691r;

    /* renamed from: s */
    public int f227692s;

    /* renamed from: t */
    public String f227693t;

    /* renamed from: u */
    public String f227694u;

    /* renamed from: v */
    public int f227695v;

    /* renamed from: w */
    public int f227696w;

    /* renamed from: x */
    public String f227697x;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77954jv)) {
            return false;
        }
        C77954jv jvVar = (C77954jv) aVar;
        return C46238a.m51546a(this.BaseRequest, jvVar.BaseRequest) && C46238a.m51546a(this.f227680d, jvVar.f227680d) && C46238a.m51546a(this.f227681e, jvVar.f227681e) && C46238a.m51546a(this.f227682f, jvVar.f227682f) && C46238a.m51546a(this.f227683g, jvVar.f227683g) && C46238a.m51546a(this.f227684h, jvVar.f227684h) && C46238a.m51546a(this.f227685i, jvVar.f227685i) && C46238a.m51546a(this.f227686j, jvVar.f227686j) && C46238a.m51546a(Integer.valueOf(this.f227687n), Integer.valueOf(jvVar.f227687n)) && C46238a.m51546a(this.f227688o, jvVar.f227688o) && C46238a.m51546a(this.f227689p, jvVar.f227689p) && C46238a.m51546a(this.f227690q, jvVar.f227690q) && C46238a.m51546a(Integer.valueOf(this.f227691r), Integer.valueOf(jvVar.f227691r)) && C46238a.m51546a(Integer.valueOf(this.f227692s), Integer.valueOf(jvVar.f227692s)) && C46238a.m51546a(this.f227693t, jvVar.f227693t) && C46238a.m51546a(this.f227694u, jvVar.f227694u) && C46238a.m51546a(Integer.valueOf(this.f227695v), Integer.valueOf(jvVar.f227695v)) && C46238a.m51546a(Integer.valueOf(this.f227696w), Integer.valueOf(jvVar.f227696w)) && C46238a.m51546a(this.f227697x, jvVar.f227697x);
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
            String str = this.f227680d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f227681e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f227682f;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f227683g;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f227684h;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f227685i;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            String str7 = this.f227686j;
            if (str7 != null) {
                aVar.mo74323j(8, str7);
            }
            aVar.mo74318e(9, this.f227687n);
            C77963l1 l1Var = this.f227688o;
            if (l1Var != null) {
                aVar.mo74322i(10, l1Var.computeSize());
                this.f227688o.writeFields(aVar);
            }
            String str8 = this.f227689p;
            if (str8 != null) {
                aVar.mo74323j(11, str8);
            }
            String str9 = this.f227690q;
            if (str9 != null) {
                aVar.mo74323j(12, str9);
            }
            aVar.mo74318e(13, this.f227691r);
            aVar.mo74318e(14, this.f227692s);
            String str10 = this.f227693t;
            if (str10 != null) {
                aVar.mo74323j(15, str10);
            }
            String str11 = this.f227694u;
            if (str11 != null) {
                aVar.mo74323j(16, str11);
            }
            aVar.mo74318e(17, this.f227695v);
            aVar.mo74318e(18, this.f227696w);
            String str12 = this.f227697x;
            if (str12 != null) {
                aVar.mo74323j(19, str12);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str13 = this.f227680d;
            if (str13 != null) {
                i3 += C52418a.m58683j(2, str13);
            }
            String str14 = this.f227681e;
            if (str14 != null) {
                i3 += C52418a.m58683j(3, str14);
            }
            String str15 = this.f227682f;
            if (str15 != null) {
                i3 += C52418a.m58683j(4, str15);
            }
            String str16 = this.f227683g;
            if (str16 != null) {
                i3 += C52418a.m58683j(5, str16);
            }
            String str17 = this.f227684h;
            if (str17 != null) {
                i3 += C52418a.m58683j(6, str17);
            }
            String str18 = this.f227685i;
            if (str18 != null) {
                i3 += C52418a.m58683j(7, str18);
            }
            String str19 = this.f227686j;
            if (str19 != null) {
                i3 += C52418a.m58683j(8, str19);
            }
            int e = i3 + C52418a.m58678e(9, this.f227687n);
            C77963l1 l1Var2 = this.f227688o;
            if (l1Var2 != null) {
                e += C52418a.m58682i(10, l1Var2.computeSize());
            }
            String str20 = this.f227689p;
            if (str20 != null) {
                e += C52418a.m58683j(11, str20);
            }
            String str21 = this.f227690q;
            if (str21 != null) {
                e += C52418a.m58683j(12, str21);
            }
            int e2 = e + C52418a.m58678e(13, this.f227691r) + C52418a.m58678e(14, this.f227692s);
            String str22 = this.f227693t;
            if (str22 != null) {
                e2 += C52418a.m58683j(15, str22);
            }
            String str23 = this.f227694u;
            if (str23 != null) {
                e2 += C52418a.m58683j(16, str23);
            }
            int e3 = e2 + C52418a.m58678e(17, this.f227695v) + C52418a.m58678e(18, this.f227696w);
            String str24 = this.f227697x;
            return str24 != null ? e3 + C52418a.m58683j(19, str24) : e3;
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
            C77954jv jvVar = objArr[1];
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
                        jvVar.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    jvVar.f227680d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    jvVar.f227681e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    jvVar.f227682f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    jvVar.f227683g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    jvVar.f227684h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    jvVar.f227685i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    jvVar.f227686j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    jvVar.f227687n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77963l1 l1Var3 = new C77963l1();
                        if (bArr2 != null && bArr2.length > 0) {
                            l1Var3.parseFrom(bArr2);
                        }
                        jvVar.f227688o = l1Var3;
                    }
                    return 0;
                case 11:
                    jvVar.f227689p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    jvVar.f227690q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    jvVar.f227691r = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    jvVar.f227692s = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    jvVar.f227693t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    jvVar.f227694u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    jvVar.f227695v = aVar3.mo141629g(intValue);
                    return 0;
                case 18:
                    jvVar.f227696w = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    jvVar.f227697x = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
