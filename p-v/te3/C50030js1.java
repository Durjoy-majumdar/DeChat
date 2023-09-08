package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.js1 */
public class C50030js1 extends C47465a {

    /* renamed from: d */
    public String f136284d;

    /* renamed from: e */
    public String f136285e;

    /* renamed from: f */
    public String f136286f;

    /* renamed from: g */
    public String f136287g;

    /* renamed from: h */
    public String f136288h;

    /* renamed from: i */
    public long f136289i;

    /* renamed from: j */
    public String f136290j;

    /* renamed from: n */
    public int f136291n;

    /* renamed from: o */
    public int f136292o;

    /* renamed from: p */
    public String f136293p;

    /* renamed from: q */
    public int f136294q;

    /* renamed from: r */
    public c05 f136295r;

    /* renamed from: s */
    public String f136296s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50030js1)) {
            return false;
        }
        C50030js1 js12 = (C50030js1) aVar;
        return C46238a.m51546a(this.f136284d, js12.f136284d) && C46238a.m51546a(this.f136285e, js12.f136285e) && C46238a.m51546a(this.f136286f, js12.f136286f) && C46238a.m51546a(this.f136287g, js12.f136287g) && C46238a.m51546a(this.f136288h, js12.f136288h) && C46238a.m51546a(Long.valueOf(this.f136289i), Long.valueOf(js12.f136289i)) && C46238a.m51546a(this.f136290j, js12.f136290j) && C46238a.m51546a(Integer.valueOf(this.f136291n), Integer.valueOf(js12.f136291n)) && C46238a.m51546a(Integer.valueOf(this.f136292o), Integer.valueOf(js12.f136292o)) && C46238a.m51546a(this.f136293p, js12.f136293p) && C46238a.m51546a(Integer.valueOf(this.f136294q), Integer.valueOf(js12.f136294q)) && C46238a.m51546a(this.f136295r, js12.f136295r) && C46238a.m51546a(this.f136296s, js12.f136296s);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136284d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f136285e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f136286f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f136287g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f136288h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            aVar.mo74321h(6, this.f136289i);
            String str6 = this.f136290j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            aVar.mo74318e(8, this.f136291n);
            aVar.mo74318e(9, this.f136292o);
            String str7 = this.f136293p;
            if (str7 != null) {
                aVar.mo74323j(10, str7);
            }
            aVar.mo74318e(11, this.f136294q);
            c05 c05 = this.f136295r;
            if (c05 != null) {
                aVar.mo74322i(12, c05.computeSize());
                this.f136295r.writeFields(aVar);
            }
            String str8 = this.f136296s;
            if (str8 == null) {
                return 0;
            }
            aVar.mo74323j(13, str8);
            return 0;
        } else if (i2 == 1) {
            String str9 = this.f136284d;
            int j = str9 != null ? 0 + C52418a.m58683j(1, str9) : 0;
            String str10 = this.f136285e;
            if (str10 != null) {
                j += C52418a.m58683j(2, str10);
            }
            String str11 = this.f136286f;
            if (str11 != null) {
                j += C52418a.m58683j(3, str11);
            }
            String str12 = this.f136287g;
            if (str12 != null) {
                j += C52418a.m58683j(4, str12);
            }
            String str13 = this.f136288h;
            if (str13 != null) {
                j += C52418a.m58683j(5, str13);
            }
            int h = j + C52418a.m58681h(6, this.f136289i);
            String str14 = this.f136290j;
            if (str14 != null) {
                h += C52418a.m58683j(7, str14);
            }
            int e = h + C52418a.m58678e(8, this.f136291n) + C52418a.m58678e(9, this.f136292o);
            String str15 = this.f136293p;
            if (str15 != null) {
                e += C52418a.m58683j(10, str15);
            }
            int e2 = e + C52418a.m58678e(11, this.f136294q);
            c05 c052 = this.f136295r;
            if (c052 != null) {
                e2 += C52418a.m58682i(12, c052.computeSize());
            }
            String str16 = this.f136296s;
            return str16 != null ? e2 + C52418a.m58683j(13, str16) : e2;
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
            C50030js1 js12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    js12.f136284d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    js12.f136285e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    js12.f136286f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    js12.f136287g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    js12.f136288h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    js12.f136289i = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    js12.f136290j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    js12.f136291n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    js12.f136292o = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    js12.f136293p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    js12.f136294q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size = j2.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j2.get(i3);
                        c05 c053 = new c05();
                        if (bArr != null && bArr.length > 0) {
                            c053.parseFrom(bArr);
                        }
                        js12.f136295r = c053;
                    }
                    return 0;
                case 13:
                    js12.f136296s = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
