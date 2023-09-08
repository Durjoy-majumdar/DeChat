package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e72 */
public class C77919e72 extends C49335eu3 {

    /* renamed from: A */
    public C77942hl2 f227212A;

    /* renamed from: B */
    public boolean f227213B;

    /* renamed from: C */
    public boolean f227214C;

    /* renamed from: D */
    public boolean f227215D;

    /* renamed from: E */
    public LinkedList<C77922en3> f227216E = new LinkedList<>();

    /* renamed from: F */
    public String f227217F;

    /* renamed from: G */
    public String f227218G;

    /* renamed from: H */
    public boolean f227219H;

    /* renamed from: I */
    public da4 f227220I;

    /* renamed from: d */
    public int f227221d;

    /* renamed from: e */
    public String f227222e;

    /* renamed from: f */
    public String f227223f;

    /* renamed from: g */
    public String f227224g;

    /* renamed from: h */
    public String f227225h;

    /* renamed from: i */
    public String f227226i;

    /* renamed from: j */
    public String f227227j;

    /* renamed from: n */
    public boolean f227228n;

    /* renamed from: o */
    public String f227229o;

    /* renamed from: p */
    public long f227230p;

    /* renamed from: q */
    public boolean f227231q;

    /* renamed from: r */
    public boolean f227232r;

    /* renamed from: s */
    public boolean f227233s;

    /* renamed from: t */
    public String f227234t;

    /* renamed from: u */
    public String f227235u;

    /* renamed from: v */
    public String f227236v;

    /* renamed from: w */
    public String f227237w;

    /* renamed from: x */
    public boolean f227238x;

    /* renamed from: y */
    public LinkedList<String> f227239y = new LinkedList<>();

    /* renamed from: z */
    public boolean f227240z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77919e72)) {
            return false;
        }
        C77919e72 e722 = (C77919e72) aVar;
        return C46238a.m51546a(this.BaseResponse, e722.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f227221d), Integer.valueOf(e722.f227221d)) && C46238a.m51546a(this.f227222e, e722.f227222e) && C46238a.m51546a(this.f227223f, e722.f227223f) && C46238a.m51546a(this.f227224g, e722.f227224g) && C46238a.m51546a(this.f227225h, e722.f227225h) && C46238a.m51546a(this.f227226i, e722.f227226i) && C46238a.m51546a(this.f227227j, e722.f227227j) && C46238a.m51546a(Boolean.valueOf(this.f227228n), Boolean.valueOf(e722.f227228n)) && C46238a.m51546a(this.f227229o, e722.f227229o) && C46238a.m51546a(Long.valueOf(this.f227230p), Long.valueOf(e722.f227230p)) && C46238a.m51546a(Boolean.valueOf(this.f227231q), Boolean.valueOf(e722.f227231q)) && C46238a.m51546a(Boolean.valueOf(this.f227232r), Boolean.valueOf(e722.f227232r)) && C46238a.m51546a(Boolean.valueOf(this.f227233s), Boolean.valueOf(e722.f227233s)) && C46238a.m51546a(this.f227234t, e722.f227234t) && C46238a.m51546a(this.f227235u, e722.f227235u) && C46238a.m51546a(this.f227236v, e722.f227236v) && C46238a.m51546a(this.f227237w, e722.f227237w) && C46238a.m51546a(Boolean.valueOf(this.f227238x), Boolean.valueOf(e722.f227238x)) && C46238a.m51546a(this.f227239y, e722.f227239y) && C46238a.m51546a(Boolean.valueOf(this.f227240z), Boolean.valueOf(e722.f227240z)) && C46238a.m51546a(this.f227212A, e722.f227212A) && C46238a.m51546a(Boolean.valueOf(this.f227213B), Boolean.valueOf(e722.f227213B)) && C46238a.m51546a(Boolean.valueOf(this.f227214C), Boolean.valueOf(e722.f227214C)) && C46238a.m51546a(Boolean.valueOf(this.f227215D), Boolean.valueOf(e722.f227215D)) && C46238a.m51546a(this.f227216E, e722.f227216E) && C46238a.m51546a(this.f227217F, e722.f227217F) && C46238a.m51546a(this.f227218G, e722.f227218G) && C46238a.m51546a(Boolean.valueOf(this.f227219H), Boolean.valueOf(e722.f227219H)) && C46238a.m51546a(this.f227220I, e722.f227220I);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f227221d);
                String str = this.f227222e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f227223f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f227224g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f227225h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f227226i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f227227j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                aVar.mo74314a(9, this.f227228n);
                String str7 = this.f227229o;
                if (str7 != null) {
                    aVar.mo74323j(10, str7);
                }
                aVar.mo74321h(11, this.f227230p);
                aVar.mo74314a(12, this.f227231q);
                aVar.mo74314a(13, this.f227232r);
                aVar.mo74314a(14, this.f227233s);
                String str8 = this.f227234t;
                if (str8 != null) {
                    aVar.mo74323j(15, str8);
                }
                String str9 = this.f227235u;
                if (str9 != null) {
                    aVar.mo74323j(16, str9);
                }
                String str10 = this.f227236v;
                if (str10 != null) {
                    aVar.mo74323j(17, str10);
                }
                String str11 = this.f227237w;
                if (str11 != null) {
                    aVar.mo74323j(18, str11);
                }
                aVar.mo74314a(19, this.f227238x);
                aVar.mo74320g(20, 1, this.f227239y);
                aVar.mo74314a(21, this.f227240z);
                C77942hl2 hl22 = this.f227212A;
                if (hl22 != null) {
                    aVar.mo74322i(22, hl22.computeSize());
                    this.f227212A.writeFields(aVar);
                }
                aVar.mo74314a(23, this.f227213B);
                aVar.mo74314a(26, this.f227214C);
                aVar.mo74314a(27, this.f227215D);
                aVar.mo74320g(28, 8, this.f227216E);
                String str12 = this.f227217F;
                if (str12 != null) {
                    aVar.mo74323j(29, str12);
                }
                String str13 = this.f227218G;
                if (str13 != null) {
                    aVar.mo74323j(30, str13);
                }
                aVar.mo74314a(31, this.f227219H);
                da4 da4 = this.f227220I;
                if (da4 != null) {
                    aVar.mo74322i(32, da4.computeSize());
                    this.f227220I.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f227221d);
            String str14 = this.f227222e;
            if (str14 != null) {
                e += C52418a.m58683j(3, str14);
            }
            String str15 = this.f227223f;
            if (str15 != null) {
                e += C52418a.m58683j(4, str15);
            }
            String str16 = this.f227224g;
            if (str16 != null) {
                e += C52418a.m58683j(5, str16);
            }
            String str17 = this.f227225h;
            if (str17 != null) {
                e += C52418a.m58683j(6, str17);
            }
            String str18 = this.f227226i;
            if (str18 != null) {
                e += C52418a.m58683j(7, str18);
            }
            String str19 = this.f227227j;
            if (str19 != null) {
                e += C52418a.m58683j(8, str19);
            }
            int a = e + C52418a.m58674a(9, this.f227228n);
            String str20 = this.f227229o;
            if (str20 != null) {
                a += C52418a.m58683j(10, str20);
            }
            int h = a + C52418a.m58681h(11, this.f227230p) + C52418a.m58674a(12, this.f227231q) + C52418a.m58674a(13, this.f227232r) + C52418a.m58674a(14, this.f227233s);
            String str21 = this.f227234t;
            if (str21 != null) {
                h += C52418a.m58683j(15, str21);
            }
            String str22 = this.f227235u;
            if (str22 != null) {
                h += C52418a.m58683j(16, str22);
            }
            String str23 = this.f227236v;
            if (str23 != null) {
                h += C52418a.m58683j(17, str23);
            }
            String str24 = this.f227237w;
            if (str24 != null) {
                h += C52418a.m58683j(18, str24);
            }
            int a2 = h + C52418a.m58674a(19, this.f227238x) + C52418a.m58680g(20, 1, this.f227239y) + C52418a.m58674a(21, this.f227240z);
            C77942hl2 hl23 = this.f227212A;
            if (hl23 != null) {
                a2 += C52418a.m58682i(22, hl23.computeSize());
            }
            int a3 = a2 + C52418a.m58674a(23, this.f227213B) + C52418a.m58674a(26, this.f227214C) + C52418a.m58674a(27, this.f227215D) + C52418a.m58680g(28, 8, this.f227216E);
            String str25 = this.f227217F;
            if (str25 != null) {
                a3 += C52418a.m58683j(29, str25);
            }
            String str26 = this.f227218G;
            if (str26 != null) {
                a3 += C52418a.m58683j(30, str26);
            }
            int a4 = a3 + C52418a.m58674a(31, this.f227219H);
            da4 da42 = this.f227220I;
            return da42 != null ? a4 + C52418a.m58682i(32, da42.computeSize()) : a4;
        } else if (i2 == 2) {
            this.f227239y.clear();
            this.f227216E.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C77919e72 e722 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        e722.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    e722.f227221d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e722.f227222e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    e722.f227223f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e722.f227224g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    e722.f227225h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e722.f227226i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e722.f227227j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    e722.f227228n = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    e722.f227229o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    e722.f227230p = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    e722.f227231q = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    e722.f227232r = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    e722.f227233s = aVar3.mo141625c(intValue);
                    return 0;
                case 15:
                    e722.f227234t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    e722.f227235u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    e722.f227236v = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    e722.f227237w = aVar3.mo141633k(intValue);
                    return 0;
                case 19:
                    e722.f227238x = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    e722.f227239y.add(aVar3.mo141633k(intValue));
                    return 0;
                case 21:
                    e722.f227240z = aVar3.mo141625c(intValue);
                    return 0;
                case 22:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C77942hl2 hl24 = new C77942hl2();
                        if (bArr2 != null && bArr2.length > 0) {
                            hl24.parseFrom(bArr2);
                        }
                        e722.f227212A = hl24;
                    }
                    return 0;
                case 23:
                    e722.f227213B = aVar3.mo141625c(intValue);
                    return 0;
                case 26:
                    e722.f227214C = aVar3.mo141625c(intValue);
                    return 0;
                case 27:
                    e722.f227215D = aVar3.mo141625c(intValue);
                    return 0;
                case 28:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C77922en3 en32 = new C77922en3();
                        if (bArr3 != null && bArr3.length > 0) {
                            en32.parseFrom(bArr3);
                        }
                        e722.f227216E.add(en32);
                    }
                    return 0;
                case 29:
                    e722.f227217F = aVar3.mo141633k(intValue);
                    return 0;
                case 30:
                    e722.f227218G = aVar3.mo141633k(intValue);
                    return 0;
                case 31:
                    e722.f227219H = aVar3.mo141625c(intValue);
                    return 0;
                case 32:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        da4 da43 = new da4();
                        if (bArr4 != null && bArr4.length > 0) {
                            da43.parseFrom(bArr4);
                        }
                        e722.f227220I = da43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
