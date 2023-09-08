package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hb0 */
public class C22499hb0 extends C47465a {

    /* renamed from: d */
    public String f63902d;

    /* renamed from: e */
    public String f63903e;

    /* renamed from: f */
    public long f63904f;

    /* renamed from: g */
    public LinkedList<C22495eh> f63905g = new LinkedList<>();

    /* renamed from: h */
    public int f63906h;

    /* renamed from: i */
    public String f63907i;

    /* renamed from: j */
    public String f63908j;

    /* renamed from: n */
    public String f63909n;

    /* renamed from: o */
    public LinkedList<String> f63910o = new LinkedList<>();

    /* renamed from: p */
    public int f63911p;

    /* renamed from: q */
    public String f63912q;

    /* renamed from: r */
    public String f63913r;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22499hb0)) {
            return false;
        }
        C22499hb0 hb02 = (C22499hb0) aVar;
        return C46238a.m51546a(this.f63902d, hb02.f63902d) && C46238a.m51546a(this.f63903e, hb02.f63903e) && C46238a.m51546a(Long.valueOf(this.f63904f), Long.valueOf(hb02.f63904f)) && C46238a.m51546a(this.f63905g, hb02.f63905g) && C46238a.m51546a(Integer.valueOf(this.f63906h), Integer.valueOf(hb02.f63906h)) && C46238a.m51546a(this.f63907i, hb02.f63907i) && C46238a.m51546a(this.f63908j, hb02.f63908j) && C46238a.m51546a(this.f63909n, hb02.f63909n) && C46238a.m51546a(this.f63910o, hb02.f63910o) && C46238a.m51546a(Integer.valueOf(this.f63911p), Integer.valueOf(hb02.f63911p)) && C46238a.m51546a(this.f63912q, hb02.f63912q) && C46238a.m51546a(this.f63913r, hb02.f63913r);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f63902d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f63903e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f63904f);
            aVar.mo74320g(4, 8, this.f63905g);
            aVar.mo74318e(5, this.f63906h);
            String str3 = this.f63907i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            String str4 = this.f63908j;
            if (str4 != null) {
                aVar.mo74323j(7, str4);
            }
            String str5 = this.f63909n;
            if (str5 != null) {
                aVar.mo74323j(8, str5);
            }
            aVar.mo74320g(9, 1, this.f63910o);
            aVar.mo74318e(10, this.f63911p);
            String str6 = this.f63912q;
            if (str6 != null) {
                aVar.mo74323j(11, str6);
            }
            String str7 = this.f63913r;
            if (str7 == null) {
                return 0;
            }
            aVar.mo74323j(12, str7);
            return 0;
        } else if (i2 == 1) {
            String str8 = this.f63902d;
            int j = str8 != null ? 0 + C52418a.m58683j(1, str8) : 0;
            String str9 = this.f63903e;
            if (str9 != null) {
                j += C52418a.m58683j(2, str9);
            }
            int h = j + C52418a.m58681h(3, this.f63904f) + C52418a.m58680g(4, 8, this.f63905g) + C52418a.m58678e(5, this.f63906h);
            String str10 = this.f63907i;
            if (str10 != null) {
                h += C52418a.m58683j(6, str10);
            }
            String str11 = this.f63908j;
            if (str11 != null) {
                h += C52418a.m58683j(7, str11);
            }
            String str12 = this.f63909n;
            if (str12 != null) {
                h += C52418a.m58683j(8, str12);
            }
            int g = h + C52418a.m58680g(9, 1, this.f63910o) + C52418a.m58678e(10, this.f63911p);
            String str13 = this.f63912q;
            if (str13 != null) {
                g += C52418a.m58683j(11, str13);
            }
            String str14 = this.f63913r;
            return str14 != null ? g + C52418a.m58683j(12, str14) : g;
        } else if (i2 == 2) {
            this.f63905g.clear();
            this.f63910o.clear();
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
            C22499hb0 hb02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hb02.f63902d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    hb02.f63903e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hb02.f63904f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        C22495eh ehVar = new C22495eh();
                        if (bArr != null && bArr.length > 0) {
                            ehVar.parseFrom(bArr);
                        }
                        hb02.f63905g.add(ehVar);
                    }
                    return 0;
                case 5:
                    hb02.f63906h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hb02.f63907i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hb02.f63908j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    hb02.f63909n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    hb02.f63910o.add(aVar3.mo141633k(intValue));
                    return 0;
                case 10:
                    hb02.f63911p = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    hb02.f63912q = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    hb02.f63913r = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
