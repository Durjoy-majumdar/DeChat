package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yh0 */
public class C64856yh0 extends C101820nt3 {

    /* renamed from: d */
    public String f186515d;

    /* renamed from: e */
    public long f186516e;

    /* renamed from: f */
    public String f186517f;

    /* renamed from: g */
    public long f186518g;

    /* renamed from: h */
    public long f186519h;

    /* renamed from: i */
    public String f186520i;

    /* renamed from: j */
    public int f186521j;

    /* renamed from: n */
    public String f186522n;

    /* renamed from: o */
    public long f186523o;

    /* renamed from: p */
    public int f186524p;

    /* renamed from: q */
    public String f186525q;

    /* renamed from: r */
    public C49842ig0 f186526r;

    /* renamed from: s */
    public String f186527s;

    /* renamed from: t */
    public int f186528t;

    /* renamed from: u */
    public LinkedList<C64829xh0> f186529u = new LinkedList<>();

    /* renamed from: v */
    public LinkedList<String> f186530v = new LinkedList<>();

    /* renamed from: w */
    public String f186531w;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64856yh0)) {
            return false;
        }
        C64856yh0 yh02 = (C64856yh0) aVar;
        return C46238a.m51546a(this.BaseRequest, yh02.BaseRequest) && C46238a.m51546a(this.f186515d, yh02.f186515d) && C46238a.m51546a(Long.valueOf(this.f186516e), Long.valueOf(yh02.f186516e)) && C46238a.m51546a(this.f186517f, yh02.f186517f) && C46238a.m51546a(Long.valueOf(this.f186518g), Long.valueOf(yh02.f186518g)) && C46238a.m51546a(Long.valueOf(this.f186519h), Long.valueOf(yh02.f186519h)) && C46238a.m51546a(this.f186520i, yh02.f186520i) && C46238a.m51546a(Integer.valueOf(this.f186521j), Integer.valueOf(yh02.f186521j)) && C46238a.m51546a(this.f186522n, yh02.f186522n) && C46238a.m51546a(Long.valueOf(this.f186523o), Long.valueOf(yh02.f186523o)) && C46238a.m51546a(Integer.valueOf(this.f186524p), Integer.valueOf(yh02.f186524p)) && C46238a.m51546a(this.f186525q, yh02.f186525q) && C46238a.m51546a(this.f186526r, yh02.f186526r) && C46238a.m51546a(this.f186527s, yh02.f186527s) && C46238a.m51546a(Integer.valueOf(this.f186528t), Integer.valueOf(yh02.f186528t)) && C46238a.m51546a(this.f186529u, yh02.f186529u) && C46238a.m51546a(this.f186530v, yh02.f186530v) && C46238a.m51546a(this.f186531w, yh02.f186531w);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f186515d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f186516e);
            String str2 = this.f186517f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f186518g);
            aVar.mo74321h(6, this.f186519h);
            String str3 = this.f186520i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            aVar.mo74318e(8, this.f186521j);
            String str4 = this.f186522n;
            if (str4 != null) {
                aVar.mo74323j(9, str4);
            }
            aVar.mo74321h(10, this.f186523o);
            aVar.mo74318e(11, this.f186524p);
            String str5 = this.f186525q;
            if (str5 != null) {
                aVar.mo74323j(12, str5);
            }
            C49842ig0 ig02 = this.f186526r;
            if (ig02 != null) {
                aVar.mo74322i(13, ig02.computeSize());
                this.f186526r.writeFields(aVar);
            }
            String str6 = this.f186527s;
            if (str6 != null) {
                aVar.mo74323j(14, str6);
            }
            aVar.mo74318e(15, this.f186528t);
            aVar.mo74320g(16, 8, this.f186529u);
            aVar.mo74320g(17, 1, this.f186530v);
            String str7 = this.f186531w;
            if (str7 != null) {
                aVar.mo74323j(18, str7);
            }
            return 0;
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i3 = C52418a.m58682i(1, iaVar2.computeSize()) + 0;
            }
            String str8 = this.f186515d;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            int h = i3 + C52418a.m58681h(3, this.f186516e);
            String str9 = this.f186517f;
            if (str9 != null) {
                h += C52418a.m58683j(4, str9);
            }
            int h2 = h + C52418a.m58681h(5, this.f186518g) + C52418a.m58681h(6, this.f186519h);
            String str10 = this.f186520i;
            if (str10 != null) {
                h2 += C52418a.m58683j(7, str10);
            }
            int e = h2 + C52418a.m58678e(8, this.f186521j);
            String str11 = this.f186522n;
            if (str11 != null) {
                e += C52418a.m58683j(9, str11);
            }
            int h3 = e + C52418a.m58681h(10, this.f186523o) + C52418a.m58678e(11, this.f186524p);
            String str12 = this.f186525q;
            if (str12 != null) {
                h3 += C52418a.m58683j(12, str12);
            }
            C49842ig0 ig03 = this.f186526r;
            if (ig03 != null) {
                h3 += C52418a.m58682i(13, ig03.computeSize());
            }
            String str13 = this.f186527s;
            if (str13 != null) {
                h3 += C52418a.m58683j(14, str13);
            }
            int e2 = h3 + C52418a.m58678e(15, this.f186528t) + C52418a.m58680g(16, 8, this.f186529u) + C52418a.m58680g(17, 1, this.f186530v);
            String str14 = this.f186531w;
            return str14 != null ? e2 + C52418a.m58683j(18, str14) : e2;
        } else if (i2 == 2) {
            this.f186529u.clear();
            this.f186530v.clear();
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
            C64856yh0 yh02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        yh02.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    yh02.f186515d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yh02.f186516e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    yh02.f186517f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yh02.f186518g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    yh02.f186519h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    yh02.f186520i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    yh02.f186521j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    yh02.f186522n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    yh02.f186523o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    yh02.f186524p = aVar3.mo141629g(intValue);
                    return 0;
                case 12:
                    yh02.f186525q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C49842ig0 ig04 = new C49842ig0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig04.parseFrom(bArr2);
                        }
                        yh02.f186526r = ig04;
                    }
                    return 0;
                case 14:
                    yh02.f186527s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    yh02.f186528t = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C64829xh0 xh02 = new C64829xh0();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh02.parseFrom(bArr3);
                        }
                        yh02.f186529u.add(xh02);
                    }
                    return 0;
                case 17:
                    yh02.f186530v.add(aVar3.mo141633k(intValue));
                    return 0;
                case 18:
                    yh02.f186531w = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
