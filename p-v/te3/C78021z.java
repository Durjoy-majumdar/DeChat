package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z */
public class C78021z extends C49335eu3 {

    /* renamed from: A */
    public LinkedList<C64820x> f228649A = new LinkedList<>();

    /* renamed from: B */
    public String f228650B;

    /* renamed from: C */
    public int f228651C;

    /* renamed from: D */
    public long f228652D;

    /* renamed from: E */
    public String f228653E;

    /* renamed from: F */
    public String f228654F;

    /* renamed from: G */
    public C77903a f228655G;

    /* renamed from: H */
    public String f228656H;

    /* renamed from: I */
    public LinkedList<C64303d0> f228657I = new LinkedList<>();

    /* renamed from: J */
    public C77933g43 f228658J;

    /* renamed from: d */
    public int f228659d = 268513600;

    /* renamed from: e */
    public String f228660e = "请求不成功，请稍候再试";

    /* renamed from: f */
    public String f228661f;

    /* renamed from: g */
    public String f228662g;

    /* renamed from: h */
    public int f228663h;

    /* renamed from: i */
    public String f228664i;

    /* renamed from: j */
    public long f228665j;

    /* renamed from: n */
    public int f228666n;

    /* renamed from: o */
    public long f228667o;

    /* renamed from: p */
    public int f228668p;

    /* renamed from: q */
    public int f228669q;

    /* renamed from: r */
    public int f228670r;

    /* renamed from: s */
    public int f228671s;

    /* renamed from: t */
    public int f228672t;

    /* renamed from: u */
    public int f228673u;

    /* renamed from: v */
    public long f228674v;

    /* renamed from: w */
    public long f228675w;

    /* renamed from: x */
    public long f228676x;

    /* renamed from: y */
    public int f228677y;

    /* renamed from: z */
    public String f228678z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78021z)) {
            return false;
        }
        C78021z zVar = (C78021z) aVar;
        return C46238a.m51546a(this.BaseResponse, zVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f228659d), Integer.valueOf(zVar.f228659d)) && C46238a.m51546a(this.f228660e, zVar.f228660e) && C46238a.m51546a(this.f228661f, zVar.f228661f) && C46238a.m51546a(this.f228662g, zVar.f228662g) && C46238a.m51546a(Integer.valueOf(this.f228663h), Integer.valueOf(zVar.f228663h)) && C46238a.m51546a(this.f228664i, zVar.f228664i) && C46238a.m51546a(Long.valueOf(this.f228665j), Long.valueOf(zVar.f228665j)) && C46238a.m51546a(Integer.valueOf(this.f228666n), Integer.valueOf(zVar.f228666n)) && C46238a.m51546a(Long.valueOf(this.f228667o), Long.valueOf(zVar.f228667o)) && C46238a.m51546a(Integer.valueOf(this.f228668p), Integer.valueOf(zVar.f228668p)) && C46238a.m51546a(Integer.valueOf(this.f228669q), Integer.valueOf(zVar.f228669q)) && C46238a.m51546a(Integer.valueOf(this.f228670r), Integer.valueOf(zVar.f228670r)) && C46238a.m51546a(Integer.valueOf(this.f228671s), Integer.valueOf(zVar.f228671s)) && C46238a.m51546a(Integer.valueOf(this.f228672t), Integer.valueOf(zVar.f228672t)) && C46238a.m51546a(Integer.valueOf(this.f228673u), Integer.valueOf(zVar.f228673u)) && C46238a.m51546a(Long.valueOf(this.f228674v), Long.valueOf(zVar.f228674v)) && C46238a.m51546a(Long.valueOf(this.f228675w), Long.valueOf(zVar.f228675w)) && C46238a.m51546a(Long.valueOf(this.f228676x), Long.valueOf(zVar.f228676x)) && C46238a.m51546a(Integer.valueOf(this.f228677y), Integer.valueOf(zVar.f228677y)) && C46238a.m51546a(this.f228678z, zVar.f228678z) && C46238a.m51546a(this.f228649A, zVar.f228649A) && C46238a.m51546a(this.f228650B, zVar.f228650B) && C46238a.m51546a(Integer.valueOf(this.f228651C), Integer.valueOf(zVar.f228651C)) && C46238a.m51546a(Long.valueOf(this.f228652D), Long.valueOf(zVar.f228652D)) && C46238a.m51546a(this.f228653E, zVar.f228653E) && C46238a.m51546a(this.f228654F, zVar.f228654F) && C46238a.m51546a(this.f228655G, zVar.f228655G) && C46238a.m51546a(this.f228656H, zVar.f228656H) && C46238a.m51546a(this.f228657I, zVar.f228657I) && C46238a.m51546a(this.f228658J, zVar.f228658J);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f228659d);
                String str = this.f228660e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f228661f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f228662g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                aVar.mo74318e(6, this.f228663h);
                String str4 = this.f228664i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74321h(8, this.f228665j);
                aVar.mo74318e(9, this.f228666n);
                aVar.mo74321h(10, this.f228667o);
                aVar.mo74318e(11, this.f228668p);
                aVar.mo74318e(12, this.f228669q);
                aVar.mo74318e(13, this.f228670r);
                aVar.mo74318e(14, this.f228671s);
                aVar.mo74318e(15, this.f228672t);
                aVar.mo74318e(16, this.f228673u);
                aVar.mo74321h(17, this.f228674v);
                aVar.mo74321h(18, this.f228675w);
                aVar.mo74321h(19, this.f228676x);
                aVar.mo74318e(20, this.f228677y);
                String str5 = this.f228678z;
                if (str5 != null) {
                    aVar.mo74323j(21, str5);
                }
                aVar.mo74320g(22, 8, this.f228649A);
                String str6 = this.f228650B;
                if (str6 != null) {
                    aVar.mo74323j(23, str6);
                }
                aVar.mo74318e(24, this.f228651C);
                aVar.mo74321h(25, this.f228652D);
                String str7 = this.f228653E;
                if (str7 != null) {
                    aVar.mo74323j(26, str7);
                }
                String str8 = this.f228654F;
                if (str8 != null) {
                    aVar.mo74323j(27, str8);
                }
                C77903a aVar2 = this.f228655G;
                if (aVar2 != null) {
                    aVar.mo74322i(28, aVar2.computeSize());
                    this.f228655G.writeFields(aVar);
                }
                String str9 = this.f228656H;
                if (str9 != null) {
                    aVar.mo74323j(29, str9);
                }
                aVar.mo74320g(30, 8, this.f228657I);
                C77933g43 g432 = this.f228658J;
                if (g432 != null) {
                    aVar.mo74322i(31, g432.computeSize());
                    this.f228658J.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f228659d);
            String str10 = this.f228660e;
            if (str10 != null) {
                e += C52418a.m58683j(3, str10);
            }
            String str11 = this.f228661f;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f228662g;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            int e2 = e + C52418a.m58678e(6, this.f228663h);
            String str13 = this.f228664i;
            if (str13 != null) {
                e2 += C52418a.m58683j(7, str13);
            }
            int h = e2 + C52418a.m58681h(8, this.f228665j) + C52418a.m58678e(9, this.f228666n) + C52418a.m58681h(10, this.f228667o) + C52418a.m58678e(11, this.f228668p) + C52418a.m58678e(12, this.f228669q) + C52418a.m58678e(13, this.f228670r) + C52418a.m58678e(14, this.f228671s) + C52418a.m58678e(15, this.f228672t) + C52418a.m58678e(16, this.f228673u) + C52418a.m58681h(17, this.f228674v) + C52418a.m58681h(18, this.f228675w) + C52418a.m58681h(19, this.f228676x) + C52418a.m58678e(20, this.f228677y);
            String str14 = this.f228678z;
            if (str14 != null) {
                h += C52418a.m58683j(21, str14);
            }
            int g = h + C52418a.m58680g(22, 8, this.f228649A);
            String str15 = this.f228650B;
            if (str15 != null) {
                g += C52418a.m58683j(23, str15);
            }
            int e3 = g + C52418a.m58678e(24, this.f228651C) + C52418a.m58681h(25, this.f228652D);
            String str16 = this.f228653E;
            if (str16 != null) {
                e3 += C52418a.m58683j(26, str16);
            }
            String str17 = this.f228654F;
            if (str17 != null) {
                e3 += C52418a.m58683j(27, str17);
            }
            C77903a aVar3 = this.f228655G;
            if (aVar3 != null) {
                e3 += C52418a.m58682i(28, aVar3.computeSize());
            }
            String str18 = this.f228656H;
            if (str18 != null) {
                e3 += C52418a.m58683j(29, str18);
            }
            int g2 = e3 + C52418a.m58680g(30, 8, this.f228657I);
            C77933g43 g433 = this.f228658J;
            return g433 != null ? g2 + C52418a.m58682i(31, g433.computeSize()) : g2;
        } else if (i2 == 2) {
            this.f228649A.clear();
            this.f228657I.clear();
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C78021z zVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        zVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    zVar.f228659d = aVar5.mo141629g(intValue);
                    return 0;
                case 3:
                    zVar.f228660e = aVar5.mo141633k(intValue);
                    return 0;
                case 4:
                    zVar.f228661f = aVar5.mo141633k(intValue);
                    return 0;
                case 5:
                    zVar.f228662g = aVar5.mo141633k(intValue);
                    return 0;
                case 6:
                    zVar.f228663h = aVar5.mo141629g(intValue);
                    return 0;
                case 7:
                    zVar.f228664i = aVar5.mo141633k(intValue);
                    return 0;
                case 8:
                    zVar.f228665j = aVar5.mo141631i(intValue);
                    return 0;
                case 9:
                    zVar.f228666n = aVar5.mo141629g(intValue);
                    return 0;
                case 10:
                    zVar.f228667o = aVar5.mo141631i(intValue);
                    return 0;
                case 11:
                    zVar.f228668p = aVar5.mo141629g(intValue);
                    return 0;
                case 12:
                    zVar.f228669q = aVar5.mo141629g(intValue);
                    return 0;
                case 13:
                    zVar.f228670r = aVar5.mo141629g(intValue);
                    return 0;
                case 14:
                    zVar.f228671s = aVar5.mo141629g(intValue);
                    return 0;
                case 15:
                    zVar.f228672t = aVar5.mo141629g(intValue);
                    return 0;
                case 16:
                    zVar.f228673u = aVar5.mo141629g(intValue);
                    return 0;
                case 17:
                    zVar.f228674v = aVar5.mo141631i(intValue);
                    return 0;
                case 18:
                    zVar.f228675w = aVar5.mo141631i(intValue);
                    return 0;
                case 19:
                    zVar.f228676x = aVar5.mo141631i(intValue);
                    return 0;
                case 20:
                    zVar.f228677y = aVar5.mo141629g(intValue);
                    return 0;
                case 21:
                    zVar.f228678z = aVar5.mo141633k(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C64820x xVar = new C64820x();
                        if (bArr2 != null && bArr2.length > 0) {
                            xVar.parseFrom(bArr2);
                        }
                        zVar.f228649A.add(xVar);
                    }
                    return 0;
                case 23:
                    zVar.f228650B = aVar5.mo141633k(intValue);
                    return 0;
                case 24:
                    zVar.f228651C = aVar5.mo141629g(intValue);
                    return 0;
                case 25:
                    zVar.f228652D = aVar5.mo141631i(intValue);
                    return 0;
                case 26:
                    zVar.f228653E = aVar5.mo141633k(intValue);
                    return 0;
                case 27:
                    zVar.f228654F = aVar5.mo141633k(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j3 = aVar5.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77903a aVar6 = new C77903a();
                        if (bArr3 != null && bArr3.length > 0) {
                            aVar6.parseFrom(bArr3);
                        }
                        zVar.f228655G = aVar6;
                    }
                    return 0;
                case 29:
                    zVar.f228656H = aVar5.mo141633k(intValue);
                    return 0;
                case 30:
                    LinkedList<byte[]> j4 = aVar5.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C64303d0 d0Var = new C64303d0();
                        if (bArr4 != null && bArr4.length > 0) {
                            d0Var.parseFrom(bArr4);
                        }
                        zVar.f228657I.add(d0Var);
                    }
                    return 0;
                case 31:
                    LinkedList<byte[]> j5 = aVar5.mo141632j(intValue);
                    int size5 = j5.size();
                    for (int i8 = 0; i8 < size5; i8++) {
                        byte[] bArr5 = j5.get(i8);
                        C77933g43 g434 = new C77933g43();
                        if (bArr5 != null && bArr5.length > 0) {
                            g434.parseFrom(bArr5);
                        }
                        zVar.f228658J = g434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
