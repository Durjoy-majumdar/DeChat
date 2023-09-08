package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h71 */
public class C64414h71 extends C47465a {

    /* renamed from: d */
    public String f183424d;

    /* renamed from: e */
    public String f183425e;

    /* renamed from: f */
    public long f183426f;

    /* renamed from: g */
    public long f183427g;

    /* renamed from: h */
    public String f183428h;

    /* renamed from: i */
    public String f183429i;

    /* renamed from: j */
    public long f183430j;

    /* renamed from: n */
    public String f183431n;

    /* renamed from: o */
    public long f183432o;

    /* renamed from: p */
    public long f183433p;

    /* renamed from: q */
    public int f183434q;

    /* renamed from: r */
    public int f183435r;

    /* renamed from: s */
    public String f183436s;

    /* renamed from: t */
    public int f183437t;

    /* renamed from: u */
    public String f183438u;

    /* renamed from: v */
    public int f183439v;

    /* renamed from: w */
    public C52025xv f183440w;

    /* renamed from: x */
    public int f183441x;

    /* renamed from: y */
    public C51986xk2 f183442y;

    /* renamed from: z */
    public String f183443z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64414h71)) {
            return false;
        }
        C64414h71 h712 = (C64414h71) aVar;
        return C46238a.m51546a(this.f183424d, h712.f183424d) && C46238a.m51546a(this.f183425e, h712.f183425e) && C46238a.m51546a(Long.valueOf(this.f183426f), Long.valueOf(h712.f183426f)) && C46238a.m51546a(Long.valueOf(this.f183427g), Long.valueOf(h712.f183427g)) && C46238a.m51546a(this.f183428h, h712.f183428h) && C46238a.m51546a(this.f183429i, h712.f183429i) && C46238a.m51546a(Long.valueOf(this.f183430j), Long.valueOf(h712.f183430j)) && C46238a.m51546a(this.f183431n, h712.f183431n) && C46238a.m51546a(Long.valueOf(this.f183432o), Long.valueOf(h712.f183432o)) && C46238a.m51546a(Long.valueOf(this.f183433p), Long.valueOf(h712.f183433p)) && C46238a.m51546a(Integer.valueOf(this.f183434q), Integer.valueOf(h712.f183434q)) && C46238a.m51546a(Integer.valueOf(this.f183435r), Integer.valueOf(h712.f183435r)) && C46238a.m51546a(this.f183436s, h712.f183436s) && C46238a.m51546a(Integer.valueOf(this.f183437t), Integer.valueOf(h712.f183437t)) && C46238a.m51546a(this.f183438u, h712.f183438u) && C46238a.m51546a(Integer.valueOf(this.f183439v), Integer.valueOf(h712.f183439v)) && C46238a.m51546a(this.f183440w, h712.f183440w) && C46238a.m51546a(Integer.valueOf(this.f183441x), Integer.valueOf(h712.f183441x)) && C46238a.m51546a(this.f183442y, h712.f183442y) && C46238a.m51546a(this.f183443z, h712.f183443z);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183424d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183425e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f183426f);
            aVar.mo74321h(4, this.f183427g);
            String str3 = this.f183428h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            String str4 = this.f183429i;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            aVar.mo74321h(8, this.f183430j);
            String str5 = this.f183431n;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            aVar.mo74321h(10, this.f183432o);
            aVar.mo74321h(11, this.f183433p);
            aVar.mo74318e(12, this.f183434q);
            aVar.mo74318e(13, this.f183435r);
            String str6 = this.f183436s;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            aVar.mo74318e(15, this.f183437t);
            String str7 = this.f183438u;
            if (str7 != null) {
                aVar.mo74323j(16, str7);
            }
            aVar.mo74318e(17, this.f183439v);
            C52025xv xvVar = this.f183440w;
            if (xvVar != null) {
                aVar.mo74322i(18, xvVar.computeSize());
                this.f183440w.writeFields(aVar);
            }
            aVar.mo74318e(19, this.f183441x);
            C51986xk2 xk22 = this.f183442y;
            if (xk22 != null) {
                aVar.mo74322i(20, xk22.computeSize());
                this.f183442y.writeFields(aVar);
            }
            String str8 = this.f183443z;
            if (str8 != null) {
                aVar.mo74323j(1001, str8);
            }
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f183424d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            String str10 = this.f183425e;
            if (str10 != null) {
                i3 += C52418a.m58683j(2, str10);
            }
            int h = i3 + C52418a.m58681h(3, this.f183426f) + C52418a.m58681h(4, this.f183427g);
            String str11 = this.f183428h;
            if (str11 != null) {
                h += C52418a.m58683j(5, str11);
            }
            String str12 = this.f183429i;
            if (str12 != null) {
                h += C52418a.m58683j(7, str12);
            }
            int h2 = h + C52418a.m58681h(8, this.f183430j);
            String str13 = this.f183431n;
            if (str13 != null) {
                h2 += C52418a.m58683j(9, str13);
            }
            int h3 = h2 + C52418a.m58681h(10, this.f183432o) + C52418a.m58681h(11, this.f183433p) + C52418a.m58678e(12, this.f183434q) + C52418a.m58678e(13, this.f183435r);
            String str14 = this.f183436s;
            if (str14 != null) {
                h3 += C52418a.m58683j(14, str14);
            }
            int e = h3 + C52418a.m58678e(15, this.f183437t);
            String str15 = this.f183438u;
            if (str15 != null) {
                e += C52418a.m58683j(16, str15);
            }
            int e2 = e + C52418a.m58678e(17, this.f183439v);
            C52025xv xvVar2 = this.f183440w;
            if (xvVar2 != null) {
                e2 += C52418a.m58682i(18, xvVar2.computeSize());
            }
            int e3 = e2 + C52418a.m58678e(19, this.f183441x);
            C51986xk2 xk23 = this.f183442y;
            if (xk23 != null) {
                e3 += C52418a.m58682i(20, xk23.computeSize());
            }
            String str16 = this.f183443z;
            return str16 != null ? e3 + C52418a.m58683j(1001, str16) : e3;
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
            C64414h71 h712 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h712.f183424d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                h712.f183425e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h712.f183426f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                h712.f183427g = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 5) {
                h712.f183428h = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 1001) {
                switch (intValue) {
                    case 7:
                        h712.f183429i = aVar3.mo141633k(intValue);
                        return 0;
                    case 8:
                        h712.f183430j = aVar3.mo141631i(intValue);
                        return 0;
                    case 9:
                        h712.f183431n = aVar3.mo141633k(intValue);
                        return 0;
                    case 10:
                        h712.f183432o = aVar3.mo141631i(intValue);
                        return 0;
                    case 11:
                        h712.f183433p = aVar3.mo141631i(intValue);
                        return 0;
                    case 12:
                        h712.f183434q = aVar3.mo141629g(intValue);
                        return 0;
                    case 13:
                        h712.f183435r = aVar3.mo141629g(intValue);
                        return 0;
                    case 14:
                        h712.f183436s = aVar3.mo141633k(intValue);
                        return 0;
                    case 15:
                        h712.f183437t = aVar3.mo141629g(intValue);
                        return 0;
                    case 16:
                        h712.f183438u = aVar3.mo141633k(intValue);
                        return 0;
                    case 17:
                        h712.f183439v = aVar3.mo141629g(intValue);
                        return 0;
                    case 18:
                        LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                        int size = j.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            byte[] bArr = j.get(i4);
                            C52025xv xvVar3 = new C52025xv();
                            if (bArr != null && bArr.length > 0) {
                                xvVar3.parseFrom(bArr);
                            }
                            h712.f183440w = xvVar3;
                        }
                        return 0;
                    case 19:
                        h712.f183441x = aVar3.mo141629g(intValue);
                        return 0;
                    case 20:
                        LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                        int size2 = j2.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            byte[] bArr2 = j2.get(i5);
                            C51986xk2 xk24 = new C51986xk2();
                            if (bArr2 != null && bArr2.length > 0) {
                                xk24.parseFrom(bArr2);
                            }
                            h712.f183442y = xk24;
                        }
                        return 0;
                    default:
                        return -1;
                }
            } else {
                h712.f183443z = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
