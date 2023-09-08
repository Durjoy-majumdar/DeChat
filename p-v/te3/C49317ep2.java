package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ep2 */
public class C49317ep2 extends C47465a {

    /* renamed from: d */
    public long f133050d;

    /* renamed from: e */
    public String f133051e;

    /* renamed from: f */
    public int f133052f;

    /* renamed from: g */
    public int f133053g;

    /* renamed from: h */
    public int f133054h;

    /* renamed from: i */
    public int f133055i;

    /* renamed from: j */
    public int f133056j;

    /* renamed from: n */
    public int f133057n;

    /* renamed from: o */
    public String f133058o;

    /* renamed from: p */
    public LinkedList<String> f133059p = new LinkedList<>();

    /* renamed from: q */
    public boolean f133060q;

    /* renamed from: r */
    public boolean f133061r;

    /* renamed from: s */
    public boolean f133062s;

    /* renamed from: t */
    public String f133063t;

    /* renamed from: u */
    public String f133064u;

    /* renamed from: v */
    public String f133065v;

    /* renamed from: w */
    public String f133066w;

    /* renamed from: x */
    public int f133067x;

    /* renamed from: y */
    public C49185ds f133068y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49317ep2)) {
            return false;
        }
        C49317ep2 ep22 = (C49317ep2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f133050d), Long.valueOf(ep22.f133050d)) && C46238a.m51546a(this.f133051e, ep22.f133051e) && C46238a.m51546a(Integer.valueOf(this.f133052f), Integer.valueOf(ep22.f133052f)) && C46238a.m51546a(Integer.valueOf(this.f133053g), Integer.valueOf(ep22.f133053g)) && C46238a.m51546a(Integer.valueOf(this.f133054h), Integer.valueOf(ep22.f133054h)) && C46238a.m51546a(Integer.valueOf(this.f133055i), Integer.valueOf(ep22.f133055i)) && C46238a.m51546a(Integer.valueOf(this.f133056j), Integer.valueOf(ep22.f133056j)) && C46238a.m51546a(Integer.valueOf(this.f133057n), Integer.valueOf(ep22.f133057n)) && C46238a.m51546a(this.f133058o, ep22.f133058o) && C46238a.m51546a(this.f133059p, ep22.f133059p) && C46238a.m51546a(Boolean.valueOf(this.f133060q), Boolean.valueOf(ep22.f133060q)) && C46238a.m51546a(Boolean.valueOf(this.f133061r), Boolean.valueOf(ep22.f133061r)) && C46238a.m51546a(Boolean.valueOf(this.f133062s), Boolean.valueOf(ep22.f133062s)) && C46238a.m51546a(this.f133063t, ep22.f133063t) && C46238a.m51546a(this.f133064u, ep22.f133064u) && C46238a.m51546a(this.f133065v, ep22.f133065v) && C46238a.m51546a(this.f133066w, ep22.f133066w) && C46238a.m51546a(Integer.valueOf(this.f133067x), Integer.valueOf(ep22.f133067x)) && C46238a.m51546a(this.f133068y, ep22.f133068y);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f133050d);
            String str = this.f133051e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f133052f);
            aVar.mo74318e(4, this.f133053g);
            aVar.mo74318e(5, this.f133054h);
            aVar.mo74318e(6, this.f133055i);
            aVar.mo74318e(7, this.f133056j);
            aVar.mo74318e(8, this.f133057n);
            String str2 = this.f133058o;
            if (str2 != null) {
                aVar.mo74323j(9, str2);
            }
            aVar.mo74320g(10, 1, this.f133059p);
            aVar.mo74314a(11, this.f133060q);
            aVar.mo74314a(12, this.f133061r);
            aVar.mo74314a(13, this.f133062s);
            String str3 = this.f133063t;
            if (str3 != null) {
                aVar.mo74323j(14, str3);
            }
            String str4 = this.f133064u;
            if (str4 != null) {
                aVar.mo74323j(15, str4);
            }
            String str5 = this.f133065v;
            if (str5 != null) {
                aVar.mo74323j(16, str5);
            }
            String str6 = this.f133066w;
            if (str6 != null) {
                aVar.mo74323j(17, str6);
            }
            aVar.mo74318e(18, this.f133067x);
            C49185ds dsVar = this.f133068y;
            if (dsVar != null) {
                aVar.mo74322i(19, dsVar.computeSize());
                this.f133068y.writeFields(aVar);
            }
            return 0;
        } else if (i2 == 1) {
            int h = C52418a.m58681h(1, this.f133050d) + 0;
            String str7 = this.f133051e;
            if (str7 != null) {
                h += C52418a.m58683j(2, str7);
            }
            int e = h + C52418a.m58678e(3, this.f133052f) + C52418a.m58678e(4, this.f133053g) + C52418a.m58678e(5, this.f133054h) + C52418a.m58678e(6, this.f133055i) + C52418a.m58678e(7, this.f133056j) + C52418a.m58678e(8, this.f133057n);
            String str8 = this.f133058o;
            if (str8 != null) {
                e += C52418a.m58683j(9, str8);
            }
            int g = e + C52418a.m58680g(10, 1, this.f133059p) + C52418a.m58674a(11, this.f133060q) + C52418a.m58674a(12, this.f133061r) + C52418a.m58674a(13, this.f133062s);
            String str9 = this.f133063t;
            if (str9 != null) {
                g += C52418a.m58683j(14, str9);
            }
            String str10 = this.f133064u;
            if (str10 != null) {
                g += C52418a.m58683j(15, str10);
            }
            String str11 = this.f133065v;
            if (str11 != null) {
                g += C52418a.m58683j(16, str11);
            }
            String str12 = this.f133066w;
            if (str12 != null) {
                g += C52418a.m58683j(17, str12);
            }
            int e2 = g + C52418a.m58678e(18, this.f133067x);
            C49185ds dsVar2 = this.f133068y;
            return dsVar2 != null ? e2 + C52418a.m58682i(19, dsVar2.computeSize()) : e2;
        } else if (i2 == 2) {
            this.f133059p.clear();
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
            C49317ep2 ep22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ep22.f133050d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    ep22.f133051e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ep22.f133052f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ep22.f133053g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ep22.f133054h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ep22.f133055i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ep22.f133056j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    ep22.f133057n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    ep22.f133058o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    ep22.f133059p.add(aVar3.mo141633k(intValue));
                    return 0;
                case 11:
                    ep22.f133060q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    ep22.f133061r = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    ep22.f133062s = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    ep22.f133063t = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ep22.f133064u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    ep22.f133065v = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    ep22.f133066w = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    ep22.f133067x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49185ds dsVar3 = new C49185ds();
                        if (bArr != null && bArr.length > 0) {
                            dsVar3.parseFrom(bArr);
                        }
                        ep22.f133068y = dsVar3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
