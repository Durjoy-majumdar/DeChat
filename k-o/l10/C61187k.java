package l10;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.k */
public class C61187k extends C47465a {

    /* renamed from: d */
    public String f174183d;

    /* renamed from: e */
    public long f174184e;

    /* renamed from: f */
    public int f174185f;

    /* renamed from: g */
    public String f174186g;

    /* renamed from: h */
    public String f174187h;

    /* renamed from: i */
    public String f174188i;

    /* renamed from: j */
    public String f174189j;

    /* renamed from: n */
    public String f174190n;

    /* renamed from: o */
    public String f174191o;

    /* renamed from: p */
    public String f174192p;

    /* renamed from: q */
    public String f174193q;

    /* renamed from: r */
    public C61183b f174194r;

    /* renamed from: s */
    public boolean f174195s;

    /* renamed from: t */
    public String f174196t;

    /* renamed from: u */
    public String f174197u;

    /* renamed from: v */
    public String f174198v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C61187k)) {
            return false;
        }
        C61187k kVar = (C61187k) aVar;
        return C46238a.m51546a(this.f174183d, kVar.f174183d) && C46238a.m51546a(Long.valueOf(this.f174184e), Long.valueOf(kVar.f174184e)) && C46238a.m51546a(Integer.valueOf(this.f174185f), Integer.valueOf(kVar.f174185f)) && C46238a.m51546a(this.f174186g, kVar.f174186g) && C46238a.m51546a(this.f174187h, kVar.f174187h) && C46238a.m51546a(this.f174188i, kVar.f174188i) && C46238a.m51546a(this.f174189j, kVar.f174189j) && C46238a.m51546a(this.f174190n, kVar.f174190n) && C46238a.m51546a(this.f174191o, kVar.f174191o) && C46238a.m51546a(this.f174192p, kVar.f174192p) && C46238a.m51546a(this.f174193q, kVar.f174193q) && C46238a.m51546a(this.f174194r, kVar.f174194r) && C46238a.m51546a(Boolean.valueOf(this.f174195s), Boolean.valueOf(kVar.f174195s)) && C46238a.m51546a(this.f174196t, kVar.f174196t) && C46238a.m51546a(this.f174197u, kVar.f174197u) && C46238a.m51546a(this.f174198v, kVar.f174198v);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f174183d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: id");
            } else if (this.f174186g != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f174184e);
                aVar.mo74318e(3, this.f174185f);
                String str2 = this.f174186g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f174187h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f174188i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f174189j;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f174190n;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f174191o;
                if (str7 != null) {
                    aVar.mo74323j(9, str7);
                }
                String str8 = this.f174192p;
                if (str8 != null) {
                    aVar.mo74323j(10, str8);
                }
                String str9 = this.f174193q;
                if (str9 != null) {
                    aVar.mo74323j(11, str9);
                }
                C61183b bVar = this.f174194r;
                if (bVar != null) {
                    aVar.mo74322i(12, bVar.computeSize());
                    this.f174194r.writeFields(aVar);
                }
                aVar.mo74314a(13, this.f174195s);
                String str10 = this.f174196t;
                if (str10 != null) {
                    aVar.mo74323j(14, str10);
                }
                String str11 = this.f174197u;
                if (str11 != null) {
                    aVar.mo74323j(15, str11);
                }
                String str12 = this.f174198v;
                if (str12 != null) {
                    aVar.mo74323j(16, str12);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: iconUrl");
            }
        } else if (i2 == 1) {
            String str13 = this.f174183d;
            if (str13 != null) {
                i3 = C52418a.m58683j(1, str13) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f174184e) + C52418a.m58678e(3, this.f174185f);
            String str14 = this.f174186g;
            if (str14 != null) {
                h += C52418a.m58683j(4, str14);
            }
            String str15 = this.f174187h;
            if (str15 != null) {
                h += C52418a.m58683j(5, str15);
            }
            String str16 = this.f174188i;
            if (str16 != null) {
                h += C52418a.m58683j(6, str16);
            }
            String str17 = this.f174189j;
            if (str17 != null) {
                h += C52418a.m58683j(7, str17);
            }
            String str18 = this.f174190n;
            if (str18 != null) {
                h += C52418a.m58683j(8, str18);
            }
            String str19 = this.f174191o;
            if (str19 != null) {
                h += C52418a.m58683j(9, str19);
            }
            String str20 = this.f174192p;
            if (str20 != null) {
                h += C52418a.m58683j(10, str20);
            }
            String str21 = this.f174193q;
            if (str21 != null) {
                h += C52418a.m58683j(11, str21);
            }
            C61183b bVar2 = this.f174194r;
            if (bVar2 != null) {
                h += C52418a.m58682i(12, bVar2.computeSize());
            }
            int a = h + C52418a.m58674a(13, this.f174195s);
            String str22 = this.f174196t;
            if (str22 != null) {
                a += C52418a.m58683j(14, str22);
            }
            String str23 = this.f174197u;
            if (str23 != null) {
                a += C52418a.m58683j(15, str23);
            }
            String str24 = this.f174198v;
            return str24 != null ? a + C52418a.m58683j(16, str24) : a;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f174183d == null) {
                throw new C52419b("Not all required fields were included: id");
            } else if (this.f174186g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: iconUrl");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C61187k kVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    kVar.f174183d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    kVar.f174184e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    kVar.f174185f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    kVar.f174186g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    kVar.f174187h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    kVar.f174188i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    kVar.f174189j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    kVar.f174190n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    kVar.f174191o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    kVar.f174192p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    kVar.f174193q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C61183b bVar3 = new C61183b();
                        if (bArr != null && bArr.length > 0) {
                            bVar3.parseFrom(bArr);
                        }
                        kVar.f174194r = bVar3;
                    }
                    return 0;
                case 13:
                    kVar.f174195s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    kVar.f174196t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    kVar.f174197u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    kVar.f174198v = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
