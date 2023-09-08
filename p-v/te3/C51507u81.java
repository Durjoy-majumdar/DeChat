package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.u81 */
public class C51507u81 extends C47465a {

    /* renamed from: d */
    public long f142660d;

    /* renamed from: e */
    public C51835wh3 f142661e;

    /* renamed from: f */
    public String f142662f;

    /* renamed from: g */
    public String f142663g;

    /* renamed from: h */
    public int f142664h;

    /* renamed from: i */
    public int f142665i;

    /* renamed from: j */
    public int f142666j;

    /* renamed from: n */
    public int f142667n;

    /* renamed from: o */
    public String f142668o;

    /* renamed from: p */
    public String f142669p;

    /* renamed from: q */
    public int f142670q;

    /* renamed from: r */
    public C51835wh3 f142671r;

    /* renamed from: s */
    public int f142672s;

    /* renamed from: t */
    public String f142673t;

    /* renamed from: u */
    public String f142674u;

    /* renamed from: v */
    public String f142675v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51507u81)) {
            return false;
        }
        C51507u81 u812 = (C51507u81) aVar;
        return C46238a.m51546a(Long.valueOf(this.f142660d), Long.valueOf(u812.f142660d)) && C46238a.m51546a(this.f142661e, u812.f142661e) && C46238a.m51546a(this.f142662f, u812.f142662f) && C46238a.m51546a(this.f142663g, u812.f142663g) && C46238a.m51546a(Integer.valueOf(this.f142664h), Integer.valueOf(u812.f142664h)) && C46238a.m51546a(Integer.valueOf(this.f142665i), Integer.valueOf(u812.f142665i)) && C46238a.m51546a(Integer.valueOf(this.f142666j), Integer.valueOf(u812.f142666j)) && C46238a.m51546a(Integer.valueOf(this.f142667n), Integer.valueOf(u812.f142667n)) && C46238a.m51546a(this.f142668o, u812.f142668o) && C46238a.m51546a(this.f142669p, u812.f142669p) && C46238a.m51546a(Integer.valueOf(this.f142670q), Integer.valueOf(u812.f142670q)) && C46238a.m51546a(this.f142671r, u812.f142671r) && C46238a.m51546a(Integer.valueOf(this.f142672s), Integer.valueOf(u812.f142672s)) && C46238a.m51546a(this.f142673t, u812.f142673t) && C46238a.m51546a(this.f142674u, u812.f142674u) && C46238a.m51546a(this.f142675v, u812.f142675v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f142660d);
            C51835wh3 wh32 = this.f142661e;
            if (wh32 != null) {
                aVar.mo74322i(2, wh32.computeSize());
                this.f142661e.writeFields(aVar);
            }
            String str = this.f142662f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f142663g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f142664h);
            aVar.mo74318e(6, this.f142665i);
            aVar.mo74318e(7, this.f142666j);
            aVar.mo74318e(8, this.f142667n);
            String str3 = this.f142668o;
            if (str3 != null) {
                aVar.mo74323j(9, str3);
            }
            String str4 = this.f142669p;
            if (str4 != null) {
                aVar.mo74323j(10, str4);
            }
            aVar.mo74318e(11, this.f142670q);
            C51835wh3 wh33 = this.f142671r;
            if (wh33 != null) {
                aVar.mo74322i(12, wh33.computeSize());
                this.f142671r.writeFields(aVar);
            }
            aVar.mo74318e(13, this.f142672s);
            String str5 = this.f142673t;
            if (str5 != null) {
                aVar.mo74323j(14, str5);
            }
            String str6 = this.f142674u;
            if (str6 != null) {
                aVar.mo74323j(15, str6);
            }
            String str7 = this.f142675v;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f142660d) + 0;
            C51835wh3 wh34 = this.f142661e;
            if (wh34 != null) {
                h += C52418a.m58682i(2, wh34.computeSize());
            }
            String str8 = this.f142662f;
            if (str8 != null) {
                h += C52418a.m58683j(3, str8);
            }
            String str9 = this.f142663g;
            if (str9 != null) {
                h += C52418a.m58683j(4, str9);
            }
            int e = h + C52418a.m58678e(5, this.f142664h) + C52418a.m58678e(6, this.f142665i) + C52418a.m58678e(7, this.f142666j) + C52418a.m58678e(8, this.f142667n);
            String str10 = this.f142668o;
            if (str10 != null) {
                e += C52418a.m58683j(9, str10);
            }
            String str11 = this.f142669p;
            if (str11 != null) {
                e += C52418a.m58683j(10, str11);
            }
            int e2 = e + C52418a.m58678e(11, this.f142670q);
            C51835wh3 wh35 = this.f142671r;
            if (wh35 != null) {
                e2 += C52418a.m58682i(12, wh35.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(13, this.f142672s);
            String str12 = this.f142673t;
            if (str12 != null) {
                e3 += C52418a.m58683j(14, str12);
            }
            String str13 = this.f142674u;
            if (str13 != null) {
                e3 += C52418a.m58683j(15, str13);
            }
            String str14 = this.f142675v;
            return str14 != null ? e3 + C52418a.m58683j(16, str14) : e3;
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
            C51507u81 u812 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    u812.f142660d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C51835wh3 wh36 = new C51835wh3();
                        if (bArr != null && bArr.length > 0) {
                            wh36.parseFrom(bArr);
                        }
                        u812.f142661e = wh36;
                    }
                    return 0;
                case 3:
                    u812.f142662f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    u812.f142663g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    u812.f142664h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    u812.f142665i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    u812.f142666j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    u812.f142667n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    u812.f142668o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    u812.f142669p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    u812.f142670q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51835wh3 wh37 = new C51835wh3();
                        if (bArr2 != null && bArr2.length > 0) {
                            wh37.parseFrom(bArr2);
                        }
                        u812.f142671r = wh37;
                    }
                    return 0;
                case 13:
                    u812.f142672s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    u812.f142673t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    u812.f142674u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    u812.f142675v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
