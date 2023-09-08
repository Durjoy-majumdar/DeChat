package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class m25 extends C47465a {

    /* renamed from: d */
    public String f137778d;

    /* renamed from: e */
    public long f137779e;

    /* renamed from: f */
    public boolean f137780f;

    /* renamed from: g */
    public boolean f137781g;

    /* renamed from: h */
    public String f137782h;

    /* renamed from: i */
    public String f137783i;

    /* renamed from: j */
    public String f137784j;

    /* renamed from: n */
    public boolean f137785n;

    /* renamed from: o */
    public LinkedList<k25> f137786o = new LinkedList<>();

    /* renamed from: p */
    public int f137787p;

    /* renamed from: q */
    public int f137788q;

    /* renamed from: r */
    public String f137789r;

    /* renamed from: s */
    public boolean f137790s;

    /* renamed from: t */
    public C89349b f137791t;

    /* renamed from: u */
    public String f137792u;

    /* renamed from: v */
    public C89349b f137793v;

    /* renamed from: w */
    public String f137794w;

    /* renamed from: x */
    public int f137795x;

    /* renamed from: y */
    public String f137796y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof m25)) {
            return false;
        }
        m25 m25 = (m25) aVar;
        return C46238a.m51546a(this.f137778d, m25.f137778d) && C46238a.m51546a(Long.valueOf(this.f137779e), Long.valueOf(m25.f137779e)) && C46238a.m51546a(Boolean.valueOf(this.f137780f), Boolean.valueOf(m25.f137780f)) && C46238a.m51546a(Boolean.valueOf(this.f137781g), Boolean.valueOf(m25.f137781g)) && C46238a.m51546a(this.f137782h, m25.f137782h) && C46238a.m51546a(this.f137783i, m25.f137783i) && C46238a.m51546a(this.f137784j, m25.f137784j) && C46238a.m51546a(Boolean.valueOf(this.f137785n), Boolean.valueOf(m25.f137785n)) && C46238a.m51546a(this.f137786o, m25.f137786o) && C46238a.m51546a(Integer.valueOf(this.f137787p), Integer.valueOf(m25.f137787p)) && C46238a.m51546a(Integer.valueOf(this.f137788q), Integer.valueOf(m25.f137788q)) && C46238a.m51546a(this.f137789r, m25.f137789r) && C46238a.m51546a(Boolean.valueOf(this.f137790s), Boolean.valueOf(m25.f137790s)) && C46238a.m51546a(this.f137791t, m25.f137791t) && C46238a.m51546a(this.f137792u, m25.f137792u) && C46238a.m51546a(this.f137793v, m25.f137793v) && C46238a.m51546a(this.f137794w, m25.f137794w) && C46238a.m51546a(Integer.valueOf(this.f137795x), Integer.valueOf(m25.f137795x)) && C46238a.m51546a(this.f137796y, m25.f137796y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137778d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f137779e);
                aVar.mo74314a(3, this.f137780f);
                aVar.mo74314a(4, this.f137781g);
                String str2 = this.f137782h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f137783i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f137784j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74314a(8, this.f137785n);
                aVar.mo74320g(9, 8, this.f137786o);
                aVar.mo74318e(10, this.f137787p);
                aVar.mo74318e(11, this.f137788q);
                String str5 = this.f137789r;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                aVar.mo74314a(13, this.f137790s);
                C89349b bVar = this.f137791t;
                if (bVar != null) {
                    aVar.mo74315b(14, bVar);
                }
                String str6 = this.f137792u;
                if (str6 != null) {
                    aVar.mo74323j(15, str6);
                }
                C89349b bVar2 = this.f137793v;
                if (bVar2 != null) {
                    aVar.mo74315b(16, bVar2);
                }
                String str7 = this.f137794w;
                if (str7 != null) {
                    aVar.mo74323j(17, str7);
                }
                aVar.mo74318e(18, this.f137795x);
                String str8 = this.f137796y;
                if (str8 != null) {
                    aVar.mo74323j(19, str8);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i2 == 1) {
            String str9 = this.f137778d;
            if (str9 != null) {
                i3 = C52418a.m58683j(1, str9) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f137779e) + C52418a.m58674a(3, this.f137780f) + C52418a.m58674a(4, this.f137781g);
            String str10 = this.f137782h;
            if (str10 != null) {
                h += C52418a.m58683j(5, str10);
            }
            String str11 = this.f137783i;
            if (str11 != null) {
                h += C52418a.m58683j(6, str11);
            }
            String str12 = this.f137784j;
            if (str12 != null) {
                h += C52418a.m58683j(7, str12);
            }
            int a = h + C52418a.m58674a(8, this.f137785n) + C52418a.m58680g(9, 8, this.f137786o) + C52418a.m58678e(10, this.f137787p) + C52418a.m58678e(11, this.f137788q);
            String str13 = this.f137789r;
            if (str13 != null) {
                a += C52418a.m58683j(12, str13);
            }
            int a2 = a + C52418a.m58674a(13, this.f137790s);
            C89349b bVar3 = this.f137791t;
            if (bVar3 != null) {
                a2 += C52418a.m58675b(14, bVar3);
            }
            String str14 = this.f137792u;
            if (str14 != null) {
                a2 += C52418a.m58683j(15, str14);
            }
            C89349b bVar4 = this.f137793v;
            if (bVar4 != null) {
                a2 += C52418a.m58675b(16, bVar4);
            }
            String str15 = this.f137794w;
            if (str15 != null) {
                a2 += C52418a.m58683j(17, str15);
            }
            int e = a2 + C52418a.m58678e(18, this.f137795x);
            String str16 = this.f137796y;
            return str16 != null ? e + C52418a.m58683j(19, str16) : e;
        } else if (i2 == 2) {
            this.f137786o.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137778d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: url");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            m25 m25 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    m25.f137778d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    m25.f137779e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    m25.f137780f = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    m25.f137781g = aVar3.mo141625c(intValue);
                    return 0;
                case 5:
                    m25.f137782h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m25.f137783i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    m25.f137784j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    m25.f137785n = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        k25 k25 = new k25();
                        if (bArr != null && bArr.length > 0) {
                            k25.parseFrom(bArr);
                        }
                        m25.f137786o.add(k25);
                    }
                    return 0;
                case 10:
                    m25.f137787p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    m25.f137788q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    m25.f137789r = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    m25.f137790s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    m25.f137791t = aVar3.mo141626d(intValue);
                    return 0;
                case 15:
                    m25.f137792u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    m25.f137793v = aVar3.mo141626d(intValue);
                    return 0;
                case 17:
                    m25.f137794w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    m25.f137795x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    m25.f137796y = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
