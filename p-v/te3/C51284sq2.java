package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sq2 */
public class C51284sq2 extends C47465a {

    /* renamed from: d */
    public String f141675d;

    /* renamed from: e */
    public String f141676e;

    /* renamed from: f */
    public int f141677f;

    /* renamed from: g */
    public int f141678g;

    /* renamed from: h */
    public int f141679h;

    /* renamed from: i */
    public int f141680i;

    /* renamed from: j */
    public int f141681j;

    /* renamed from: n */
    public int f141682n;

    /* renamed from: o */
    public int f141683o;

    /* renamed from: p */
    public int f141684p;

    /* renamed from: q */
    public int f141685q;

    /* renamed from: r */
    public C49890is1 f141686r;

    /* renamed from: s */
    public C48718ai1 f141687s;

    /* renamed from: t */
    public LinkedList<C64373fs0> f141688t = new LinkedList<>();

    /* renamed from: u */
    public int f141689u;

    /* renamed from: v */
    public long f141690v;

    /* renamed from: w */
    public C52110yf3 f141691w;

    /* renamed from: x */
    public int f141692x;

    /* renamed from: y */
    public boolean f141693y;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51284sq2)) {
            return false;
        }
        C51284sq2 sq22 = (C51284sq2) aVar;
        return C46238a.m51546a(this.f141675d, sq22.f141675d) && C46238a.m51546a(this.f141676e, sq22.f141676e) && C46238a.m51546a(Integer.valueOf(this.f141677f), Integer.valueOf(sq22.f141677f)) && C46238a.m51546a(Integer.valueOf(this.f141678g), Integer.valueOf(sq22.f141678g)) && C46238a.m51546a(Integer.valueOf(this.f141679h), Integer.valueOf(sq22.f141679h)) && C46238a.m51546a(Integer.valueOf(this.f141680i), Integer.valueOf(sq22.f141680i)) && C46238a.m51546a(Integer.valueOf(this.f141681j), Integer.valueOf(sq22.f141681j)) && C46238a.m51546a(Integer.valueOf(this.f141682n), Integer.valueOf(sq22.f141682n)) && C46238a.m51546a(Integer.valueOf(this.f141683o), Integer.valueOf(sq22.f141683o)) && C46238a.m51546a(Integer.valueOf(this.f141684p), Integer.valueOf(sq22.f141684p)) && C46238a.m51546a(Integer.valueOf(this.f141685q), Integer.valueOf(sq22.f141685q)) && C46238a.m51546a(this.f141686r, sq22.f141686r) && C46238a.m51546a(this.f141687s, sq22.f141687s) && C46238a.m51546a(this.f141688t, sq22.f141688t) && C46238a.m51546a(Integer.valueOf(this.f141689u), Integer.valueOf(sq22.f141689u)) && C46238a.m51546a(Long.valueOf(this.f141690v), Long.valueOf(sq22.f141690v)) && C46238a.m51546a(this.f141691w, sq22.f141691w) && C46238a.m51546a(Integer.valueOf(this.f141692x), Integer.valueOf(sq22.f141692x)) && C46238a.m51546a(Boolean.valueOf(this.f141693y), Boolean.valueOf(sq22.f141693y));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f141675d;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f141676e;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            aVar.mo74318e(6, this.f141677f);
            aVar.mo74318e(7, this.f141678g);
            aVar.mo74318e(8, this.f141679h);
            aVar.mo74318e(9, this.f141680i);
            aVar.mo74318e(11, this.f141681j);
            aVar.mo74318e(12, this.f141682n);
            aVar.mo74318e(13, this.f141683o);
            aVar.mo74318e(14, this.f141684p);
            aVar.mo74318e(15, this.f141685q);
            C49890is1 is12 = this.f141686r;
            if (is12 != null) {
                aVar.mo74322i(16, is12.computeSize());
                this.f141686r.writeFields(aVar);
            }
            C48718ai1 ai12 = this.f141687s;
            if (ai12 != null) {
                aVar.mo74322i(17, ai12.computeSize());
                this.f141687s.writeFields(aVar);
            }
            aVar.mo74320g(18, 8, this.f141688t);
            aVar.mo74318e(19, this.f141689u);
            aVar.mo74321h(20, this.f141690v);
            C52110yf3 yf32 = this.f141691w;
            if (yf32 != null) {
                aVar.mo74322i(21, yf32.computeSize());
                this.f141691w.writeFields(aVar);
            }
            aVar.mo74318e(22, this.f141692x);
            aVar.mo74314a(10000, this.f141693y);
            return 0;
        } else if (i2 == 1) {
            String str3 = this.f141675d;
            if (str3 != null) {
                i3 = C52418a.m58683j(4, str3) + 0;
            }
            String str4 = this.f141676e;
            if (str4 != null) {
                i3 += C52418a.m58683j(5, str4);
            }
            int e = i3 + C52418a.m58678e(6, this.f141677f) + C52418a.m58678e(7, this.f141678g) + C52418a.m58678e(8, this.f141679h) + C52418a.m58678e(9, this.f141680i) + C52418a.m58678e(11, this.f141681j) + C52418a.m58678e(12, this.f141682n) + C52418a.m58678e(13, this.f141683o) + C52418a.m58678e(14, this.f141684p) + C52418a.m58678e(15, this.f141685q);
            C49890is1 is13 = this.f141686r;
            if (is13 != null) {
                e += C52418a.m58682i(16, is13.computeSize());
            }
            C48718ai1 ai13 = this.f141687s;
            if (ai13 != null) {
                e += C52418a.m58682i(17, ai13.computeSize());
            }
            int g = e + C52418a.m58680g(18, 8, this.f141688t) + C52418a.m58678e(19, this.f141689u) + C52418a.m58681h(20, this.f141690v);
            C52110yf3 yf33 = this.f141691w;
            if (yf33 != null) {
                g += C52418a.m58682i(21, yf33.computeSize());
            }
            return g + C52418a.m58678e(22, this.f141692x) + C52418a.m58674a(10000, this.f141693y);
        } else if (i2 == 2) {
            this.f141688t.clear();
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
            C51284sq2 sq22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue != 10000) {
                switch (intValue) {
                    case 4:
                        sq22.f141675d = aVar3.mo141633k(intValue);
                        return 0;
                    case 5:
                        sq22.f141676e = aVar3.mo141633k(intValue);
                        return 0;
                    case 6:
                        sq22.f141677f = aVar3.mo141629g(intValue);
                        return 0;
                    case 7:
                        sq22.f141678g = aVar3.mo141629g(intValue);
                        return 0;
                    case 8:
                        sq22.f141679h = aVar3.mo141629g(intValue);
                        return 0;
                    case 9:
                        sq22.f141680i = aVar3.mo141629g(intValue);
                        return 0;
                    default:
                        switch (intValue) {
                            case 11:
                                sq22.f141681j = aVar3.mo141629g(intValue);
                                return 0;
                            case 12:
                                sq22.f141682n = aVar3.mo141629g(intValue);
                                return 0;
                            case 13:
                                sq22.f141683o = aVar3.mo141629g(intValue);
                                return 0;
                            case 14:
                                sq22.f141684p = aVar3.mo141629g(intValue);
                                return 0;
                            case 15:
                                sq22.f141685q = aVar3.mo141629g(intValue);
                                return 0;
                            case 16:
                                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                                int size = j.size();
                                for (int i4 = 0; i4 < size; i4++) {
                                    byte[] bArr = j.get(i4);
                                    C49890is1 is14 = new C49890is1();
                                    if (bArr != null && bArr.length > 0) {
                                        is14.parseFrom(bArr);
                                    }
                                    sq22.f141686r = is14;
                                }
                                return 0;
                            case 17:
                                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                                int size2 = j2.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    byte[] bArr2 = j2.get(i5);
                                    C48718ai1 ai14 = new C48718ai1();
                                    if (bArr2 != null && bArr2.length > 0) {
                                        ai14.parseFrom(bArr2);
                                    }
                                    sq22.f141687s = ai14;
                                }
                                return 0;
                            case 18:
                                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                                int size3 = j3.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    byte[] bArr3 = j3.get(i6);
                                    C64373fs0 fs02 = new C64373fs0();
                                    if (bArr3 != null && bArr3.length > 0) {
                                        fs02.parseFrom(bArr3);
                                    }
                                    sq22.f141688t.add(fs02);
                                }
                                return 0;
                            case 19:
                                sq22.f141689u = aVar3.mo141629g(intValue);
                                return 0;
                            case 20:
                                sq22.f141690v = aVar3.mo141631i(intValue);
                                return 0;
                            case 21:
                                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                                int size4 = j4.size();
                                for (int i7 = 0; i7 < size4; i7++) {
                                    byte[] bArr4 = j4.get(i7);
                                    C52110yf3 yf34 = new C52110yf3();
                                    if (bArr4 != null && bArr4.length > 0) {
                                        yf34.parseFrom(bArr4);
                                    }
                                    sq22.f141691w = yf34;
                                }
                                return 0;
                            case 22:
                                sq22.f141692x = aVar3.mo141629g(intValue);
                                return 0;
                            default:
                                return -1;
                        }
                }
            } else {
                sq22.f141693y = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
