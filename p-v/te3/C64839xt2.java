package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xt2 */
public class C64839xt2 extends C47465a {

    /* renamed from: d */
    public int f186384d;

    /* renamed from: e */
    public float f186385e;

    /* renamed from: f */
    public float f186386f;

    /* renamed from: g */
    public String f186387g;

    /* renamed from: h */
    public LinkedList<String> f186388h = new LinkedList<>();

    /* renamed from: i */
    public String f186389i;

    /* renamed from: j */
    public LinkedList<String> f186390j = new LinkedList<>();

    /* renamed from: n */
    public LinkedList<C64866yt2> f186391n = new LinkedList<>();

    /* renamed from: o */
    public String f186392o;

    /* renamed from: p */
    public String f186393p;

    /* renamed from: q */
    public LinkedList<C51738vt2> f186394q = new LinkedList<>();

    /* renamed from: r */
    public int f186395r;

    /* renamed from: s */
    public int f186396s;

    /* renamed from: t */
    public int f186397t = 1;

    /* renamed from: u */
    public String f186398u;

    /* renamed from: v */
    public int f186399v;

    /* renamed from: w */
    public long f186400w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64839xt2)) {
            return false;
        }
        C64839xt2 xt22 = (C64839xt2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f186384d), Integer.valueOf(xt22.f186384d)) && C46238a.m51546a(Float.valueOf(this.f186385e), Float.valueOf(xt22.f186385e)) && C46238a.m51546a(Float.valueOf(this.f186386f), Float.valueOf(xt22.f186386f)) && C46238a.m51546a(this.f186387g, xt22.f186387g) && C46238a.m51546a(this.f186388h, xt22.f186388h) && C46238a.m51546a(this.f186389i, xt22.f186389i) && C46238a.m51546a(this.f186390j, xt22.f186390j) && C46238a.m51546a(this.f186391n, xt22.f186391n) && C46238a.m51546a(this.f186392o, xt22.f186392o) && C46238a.m51546a(this.f186393p, xt22.f186393p) && C46238a.m51546a(this.f186394q, xt22.f186394q) && C46238a.m51546a(Integer.valueOf(this.f186395r), Integer.valueOf(xt22.f186395r)) && C46238a.m51546a(Integer.valueOf(this.f186396s), Integer.valueOf(xt22.f186396s)) && C46238a.m51546a(Integer.valueOf(this.f186397t), Integer.valueOf(xt22.f186397t)) && C46238a.m51546a(this.f186398u, xt22.f186398u) && C46238a.m51546a(Integer.valueOf(this.f186399v), Integer.valueOf(xt22.f186399v)) && C46238a.m51546a(Long.valueOf(this.f186400w), Long.valueOf(xt22.f186400w));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f186387g != null) {
                aVar.mo74318e(1, this.f186384d);
                aVar.mo74317d(2, this.f186385e);
                aVar.mo74317d(3, this.f186386f);
                String str = this.f186387g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74320g(5, 1, this.f186388h);
                String str2 = this.f186389i;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                aVar.mo74320g(7, 1, this.f186390j);
                aVar.mo74320g(8, 8, this.f186391n);
                String str3 = this.f186392o;
                if (str3 != null) {
                    aVar.mo74323j(9, str3);
                }
                String str4 = this.f186393p;
                if (str4 != null) {
                    aVar.mo74323j(10, str4);
                }
                aVar.mo74320g(11, 8, this.f186394q);
                aVar.mo74318e(12, this.f186395r);
                aVar.mo74318e(13, this.f186396s);
                aVar.mo74318e(14, this.f186397t);
                String str5 = this.f186398u;
                if (str5 != null) {
                    aVar.mo74323j(15, str5);
                }
                aVar.mo74318e(16, this.f186399v);
                aVar.mo74321h(17, this.f186400w);
                return 0;
            }
            throw new C52419b("Not all required fields were included: music_url");
        } else if (i2 == 1) {
            int e = C52418a.m58678e(1, this.f186384d) + 0 + C52418a.m58677d(2, this.f186385e) + C52418a.m58677d(3, this.f186386f);
            String str6 = this.f186387g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            int g = e + C52418a.m58680g(5, 1, this.f186388h);
            String str7 = this.f186389i;
            if (str7 != null) {
                g += C52418a.m58683j(6, str7);
            }
            int g2 = g + C52418a.m58680g(7, 1, this.f186390j) + C52418a.m58680g(8, 8, this.f186391n);
            String str8 = this.f186392o;
            if (str8 != null) {
                g2 += C52418a.m58683j(9, str8);
            }
            String str9 = this.f186393p;
            if (str9 != null) {
                g2 += C52418a.m58683j(10, str9);
            }
            int g3 = g2 + C52418a.m58680g(11, 8, this.f186394q) + C52418a.m58678e(12, this.f186395r) + C52418a.m58678e(13, this.f186396s) + C52418a.m58678e(14, this.f186397t);
            String str10 = this.f186398u;
            if (str10 != null) {
                g3 += C52418a.m58683j(15, str10);
            }
            return g3 + C52418a.m58678e(16, this.f186399v) + C52418a.m58681h(17, this.f186400w);
        } else if (i2 == 2) {
            this.f186388h.clear();
            this.f186390j.clear();
            this.f186391n.clear();
            this.f186394q.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f186387g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: music_url");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64839xt2 xt22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    xt22.f186384d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    xt22.f186385e = aVar3.mo141628f(intValue);
                    return 0;
                case 3:
                    xt22.f186386f = aVar3.mo141628f(intValue);
                    return 0;
                case 4:
                    xt22.f186387g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    xt22.f186388h.add(aVar3.mo141633k(intValue));
                    return 0;
                case 6:
                    xt22.f186389i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    xt22.f186390j.add(aVar3.mo141633k(intValue));
                    return 0;
                case 8:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C64866yt2 yt22 = new C64866yt2();
                        if (bArr != null && bArr.length > 0) {
                            yt22.parseFrom(bArr);
                        }
                        xt22.f186391n.add(yt22);
                    }
                    return 0;
                case 9:
                    xt22.f186392o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    xt22.f186393p = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51738vt2 vt22 = new C51738vt2();
                        if (bArr2 != null && bArr2.length > 0) {
                            vt22.parseFrom(bArr2);
                        }
                        xt22.f186394q.add(vt22);
                    }
                    return 0;
                case 12:
                    xt22.f186395r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    xt22.f186396s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    xt22.f186397t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    xt22.f186398u = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    xt22.f186399v = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    xt22.f186400w = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
