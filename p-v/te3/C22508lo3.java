package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lo3 */
public class C22508lo3 extends C47465a {

    /* renamed from: d */
    public String f64171d;

    /* renamed from: e */
    public LinkedList<C22533wo3> f64172e = new LinkedList<>();

    /* renamed from: f */
    public int f64173f;

    /* renamed from: g */
    public int f64174g;

    /* renamed from: h */
    public String f64175h;

    /* renamed from: i */
    public LinkedList<String> f64176i = new LinkedList<>();

    /* renamed from: j */
    public String f64177j;

    /* renamed from: n */
    public String f64178n;

    /* renamed from: o */
    public String f64179o;

    /* renamed from: p */
    public C22539zo3 f64180p;

    /* renamed from: q */
    public int f64181q;

    /* renamed from: r */
    public LinkedList<String> f64182r = new LinkedList<>();

    /* renamed from: s */
    public String f64183s;

    /* renamed from: t */
    public int f64184t;

    /* renamed from: u */
    public int f64185u;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22508lo3)) {
            return false;
        }
        C22508lo3 lo32 = (C22508lo3) aVar;
        return C46238a.m51546a(this.f64171d, lo32.f64171d) && C46238a.m51546a(this.f64172e, lo32.f64172e) && C46238a.m51546a(Integer.valueOf(this.f64173f), Integer.valueOf(lo32.f64173f)) && C46238a.m51546a(Integer.valueOf(this.f64174g), Integer.valueOf(lo32.f64174g)) && C46238a.m51546a(this.f64175h, lo32.f64175h) && C46238a.m51546a(this.f64176i, lo32.f64176i) && C46238a.m51546a(this.f64177j, lo32.f64177j) && C46238a.m51546a(this.f64178n, lo32.f64178n) && C46238a.m51546a(this.f64179o, lo32.f64179o) && C46238a.m51546a(this.f64180p, lo32.f64180p) && C46238a.m51546a(Integer.valueOf(this.f64181q), Integer.valueOf(lo32.f64181q)) && C46238a.m51546a(this.f64182r, lo32.f64182r) && C46238a.m51546a(this.f64183s, lo32.f64183s) && C46238a.m51546a(Integer.valueOf(this.f64184t), Integer.valueOf(lo32.f64184t)) && C46238a.m51546a(Integer.valueOf(this.f64185u), Integer.valueOf(lo32.f64185u));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f64171d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f64172e);
            aVar.mo74318e(3, this.f64173f);
            aVar.mo74318e(4, this.f64174g);
            String str2 = this.f64175h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74320g(6, 1, this.f64176i);
            String str3 = this.f64177j;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            String str4 = this.f64178n;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            String str5 = this.f64179o;
            if (str5 != null) {
                aVar.mo74323j(9, str5);
            }
            C22539zo3 zo32 = this.f64180p;
            if (zo32 != null) {
                aVar.mo74322i(10, zo32.computeSize());
                this.f64180p.writeFields(aVar);
            }
            aVar.mo74318e(11, this.f64181q);
            aVar.mo74320g(12, 1, this.f64182r);
            String str6 = this.f64183s;
            if (str6 != null) {
                aVar.mo74323j(13, str6);
            }
            aVar.mo74318e(14, this.f64184t);
            aVar.mo74318e(15, this.f64185u);
            return 0;
        } else if (i2 == 1) {
            String str7 = this.f64171d;
            if (str7 != null) {
                i3 = C52418a.m58683j(1, str7) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f64172e) + C52418a.m58678e(3, this.f64173f) + C52418a.m58678e(4, this.f64174g);
            String str8 = this.f64175h;
            if (str8 != null) {
                g += C52418a.m58683j(5, str8);
            }
            int g2 = g + C52418a.m58680g(6, 1, this.f64176i);
            String str9 = this.f64177j;
            if (str9 != null) {
                g2 += C52418a.m58683j(7, str9);
            }
            String str10 = this.f64178n;
            if (str10 != null) {
                g2 += C52418a.m58683j(8, str10);
            }
            String str11 = this.f64179o;
            if (str11 != null) {
                g2 += C52418a.m58683j(9, str11);
            }
            C22539zo3 zo33 = this.f64180p;
            if (zo33 != null) {
                g2 += C52418a.m58682i(10, zo33.computeSize());
            }
            int e = g2 + C52418a.m58678e(11, this.f64181q) + C52418a.m58680g(12, 1, this.f64182r);
            String str12 = this.f64183s;
            if (str12 != null) {
                e += C52418a.m58683j(13, str12);
            }
            return e + C52418a.m58678e(14, this.f64184t) + C52418a.m58678e(15, this.f64185u);
        } else if (i2 == 2) {
            this.f64172e.clear();
            this.f64176i.clear();
            this.f64182r.clear();
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
            C22508lo3 lo32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lo32.f64171d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C22533wo3 wo32 = new C22533wo3();
                        if (bArr != null && bArr.length > 0) {
                            wo32.parseFrom(bArr);
                        }
                        lo32.f64172e.add(wo32);
                    }
                    return 0;
                case 3:
                    lo32.f64173f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    lo32.f64174g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    lo32.f64175h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lo32.f64176i.add(aVar3.mo141633k(intValue));
                    return 0;
                case 7:
                    lo32.f64177j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lo32.f64178n = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lo32.f64179o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C22539zo3 zo34 = new C22539zo3();
                        if (bArr2 != null && bArr2.length > 0) {
                            zo34.parseFrom(bArr2);
                        }
                        lo32.f64180p = zo34;
                    }
                    return 0;
                case 11:
                    lo32.f64181q = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    lo32.f64182r.add(aVar3.mo141633k(intValue));
                    return 0;
                case 13:
                    lo32.f64183s = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    lo32.f64184t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    lo32.f64185u = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
