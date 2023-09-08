package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gy3 */
public class C49629gy3 extends C47465a {

    /* renamed from: d */
    public C51163rv3 f134351d;

    /* renamed from: e */
    public C51163rv3 f134352e;

    /* renamed from: f */
    public int f134353f;

    /* renamed from: g */
    public String f134354g;

    /* renamed from: h */
    public String f134355h;

    /* renamed from: i */
    public String f134356i;

    /* renamed from: j */
    public int f134357j;

    /* renamed from: n */
    public int f134358n;

    /* renamed from: o */
    public String f134359o;

    /* renamed from: p */
    public String f134360p;

    /* renamed from: q */
    public String f134361q;

    /* renamed from: r */
    public String f134362r;

    /* renamed from: s */
    public int f134363s;

    /* renamed from: t */
    public String f134364t;

    /* renamed from: u */
    public C51043r10 f134365u;

    /* renamed from: v */
    public String f134366v;

    /* renamed from: w */
    public String f134367w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49629gy3)) {
            return false;
        }
        C49629gy3 gy32 = (C49629gy3) aVar;
        return C46238a.m51546a(this.f134351d, gy32.f134351d) && C46238a.m51546a(this.f134352e, gy32.f134352e) && C46238a.m51546a(Integer.valueOf(this.f134353f), Integer.valueOf(gy32.f134353f)) && C46238a.m51546a(this.f134354g, gy32.f134354g) && C46238a.m51546a(this.f134355h, gy32.f134355h) && C46238a.m51546a(this.f134356i, gy32.f134356i) && C46238a.m51546a(Integer.valueOf(this.f134357j), Integer.valueOf(gy32.f134357j)) && C46238a.m51546a(Integer.valueOf(this.f134358n), Integer.valueOf(gy32.f134358n)) && C46238a.m51546a(this.f134359o, gy32.f134359o) && C46238a.m51546a(this.f134360p, gy32.f134360p) && C46238a.m51546a(this.f134361q, gy32.f134361q) && C46238a.m51546a(this.f134362r, gy32.f134362r) && C46238a.m51546a(Integer.valueOf(this.f134363s), Integer.valueOf(gy32.f134363s)) && C46238a.m51546a(this.f134364t, gy32.f134364t) && C46238a.m51546a(this.f134365u, gy32.f134365u) && C46238a.m51546a(this.f134366v, gy32.f134366v) && C46238a.m51546a(this.f134367w, gy32.f134367w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C51163rv3 rv32 = this.f134351d;
            if (rv32 == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f134352e != null) {
                if (rv32 != null) {
                    aVar.mo74322i(1, rv32.computeSize());
                    this.f134351d.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f134352e;
                if (rv33 != null) {
                    aVar.mo74322i(2, rv33.computeSize());
                    this.f134352e.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f134353f);
                String str = this.f134354g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f134355h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f134356i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74318e(7, this.f134357j);
                aVar.mo74318e(8, this.f134358n);
                String str4 = this.f134359o;
                if (str4 != null) {
                    aVar.mo74323j(9, str4);
                }
                String str5 = this.f134360p;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f134361q;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                String str7 = this.f134362r;
                if (str7 != null) {
                    aVar.mo74323j(12, str7);
                }
                aVar.mo74318e(13, this.f134363s);
                String str8 = this.f134364t;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                C51043r10 r102 = this.f134365u;
                if (r102 != null) {
                    aVar.mo74322i(15, r102.computeSize());
                    this.f134365u.writeFields(aVar);
                }
                String str9 = this.f134366v;
                if (str9 != null) {
                    aVar.mo74323j(16, str9);
                }
                String str10 = this.f134367w;
                if (str10 != null) {
                    aVar.mo74323j(17, str10);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i2 == 1) {
            C51163rv3 rv34 = this.f134351d;
            if (rv34 != null) {
                i3 = C52418a.m58682i(1, rv34.computeSize()) + 0;
            }
            C51163rv3 rv35 = this.f134352e;
            if (rv35 != null) {
                i3 += C52418a.m58682i(2, rv35.computeSize());
            }
            int e = i3 + C52418a.m58678e(3, this.f134353f);
            String str11 = this.f134354g;
            if (str11 != null) {
                e += C52418a.m58683j(4, str11);
            }
            String str12 = this.f134355h;
            if (str12 != null) {
                e += C52418a.m58683j(5, str12);
            }
            String str13 = this.f134356i;
            if (str13 != null) {
                e += C52418a.m58683j(6, str13);
            }
            int e2 = e + C52418a.m58678e(7, this.f134357j) + C52418a.m58678e(8, this.f134358n);
            String str14 = this.f134359o;
            if (str14 != null) {
                e2 += C52418a.m58683j(9, str14);
            }
            String str15 = this.f134360p;
            if (str15 != null) {
                e2 += C52418a.m58683j(10, str15);
            }
            String str16 = this.f134361q;
            if (str16 != null) {
                e2 += C52418a.m58683j(11, str16);
            }
            String str17 = this.f134362r;
            if (str17 != null) {
                e2 += C52418a.m58683j(12, str17);
            }
            int e3 = e2 + C52418a.m58678e(13, this.f134363s);
            String str18 = this.f134364t;
            if (str18 != null) {
                e3 += C52418a.m58683j(14, str18);
            }
            C51043r10 r103 = this.f134365u;
            if (r103 != null) {
                e3 += C52418a.m58682i(15, r103.computeSize());
            }
            String str19 = this.f134366v;
            if (str19 != null) {
                e3 += C52418a.m58683j(16, str19);
            }
            String str20 = this.f134367w;
            return str20 != null ? e3 + C52418a.m58683j(17, str20) : e3;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134351d == null) {
                throw new C52419b("Not all required fields were included: UserName");
            } else if (this.f134352e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: NickName");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49629gy3 gy32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C51163rv3 rv36 = new C51163rv3();
                        if (bArr != null && bArr.length > 0) {
                            rv36.mo73356d(bArr);
                        }
                        gy32.f134351d = rv36;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv37 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv37.mo73356d(bArr2);
                        }
                        gy32.f134352e = rv37;
                    }
                    return 0;
                case 3:
                    gy32.f134353f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gy32.f134354g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    gy32.f134355h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    gy32.f134356i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gy32.f134357j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    gy32.f134358n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    gy32.f134359o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    gy32.f134360p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    gy32.f134361q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    gy32.f134362r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    gy32.f134363s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    gy32.f134364t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51043r10 r104 = new C51043r10();
                        if (bArr3 != null && bArr3.length > 0) {
                            r104.parseFrom(bArr3);
                        }
                        gy32.f134365u = r104;
                    }
                    return 0;
                case 16:
                    gy32.f134366v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    gy32.f134367w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
