package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e70 */
public class C101773e70 extends C47465a {

    /* renamed from: A */
    public wb4 f298149A;

    /* renamed from: B */
    public int f298150B;

    /* renamed from: C */
    public long f298151C;

    /* renamed from: D */
    public LinkedList<String> f298152D = new LinkedList<>();

    /* renamed from: E */
    public C89349b f298153E;

    /* renamed from: F */
    public int f298154F;

    /* renamed from: G */
    public int f298155G;

    /* renamed from: H */
    public int f298156H;

    /* renamed from: I */
    public int f298157I;

    /* renamed from: d */
    public String f298158d;

    /* renamed from: e */
    public long f298159e;

    /* renamed from: f */
    public long f298160f;

    /* renamed from: g */
    public String f298161g;

    /* renamed from: h */
    public int f298162h;

    /* renamed from: i */
    public String f298163i;

    /* renamed from: j */
    public String f298164j;

    /* renamed from: n */
    public int f298165n;

    /* renamed from: o */
    public String f298166o;

    /* renamed from: p */
    public boolean f298167p;

    /* renamed from: q */
    public boolean f298168q;

    /* renamed from: r */
    public int f298169r;

    /* renamed from: s */
    public int f298170s;

    /* renamed from: t */
    public int f298171t;

    /* renamed from: u */
    public int f298172u;

    /* renamed from: v */
    public LinkedList<C64339ea> f298173v = new LinkedList<>();

    /* renamed from: w */
    public long f298174w;

    /* renamed from: x */
    public int f298175x;

    /* renamed from: y */
    public boolean f298176y;

    /* renamed from: z */
    public C101765cp3 f298177z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101773e70)) {
            return false;
        }
        C101773e70 e702 = (C101773e70) aVar;
        return C46238a.m51546a(this.f298158d, e702.f298158d) && C46238a.m51546a(Long.valueOf(this.f298159e), Long.valueOf(e702.f298159e)) && C46238a.m51546a(Long.valueOf(this.f298160f), Long.valueOf(e702.f298160f)) && C46238a.m51546a(this.f298161g, e702.f298161g) && C46238a.m51546a(Integer.valueOf(this.f298162h), Integer.valueOf(e702.f298162h)) && C46238a.m51546a(this.f298163i, e702.f298163i) && C46238a.m51546a(this.f298164j, e702.f298164j) && C46238a.m51546a(Integer.valueOf(this.f298165n), Integer.valueOf(e702.f298165n)) && C46238a.m51546a(this.f298166o, e702.f298166o) && C46238a.m51546a(Boolean.valueOf(this.f298167p), Boolean.valueOf(e702.f298167p)) && C46238a.m51546a(Boolean.valueOf(this.f298168q), Boolean.valueOf(e702.f298168q)) && C46238a.m51546a(Integer.valueOf(this.f298169r), Integer.valueOf(e702.f298169r)) && C46238a.m51546a(Integer.valueOf(this.f298170s), Integer.valueOf(e702.f298170s)) && C46238a.m51546a(Integer.valueOf(this.f298171t), Integer.valueOf(e702.f298171t)) && C46238a.m51546a(Integer.valueOf(this.f298172u), Integer.valueOf(e702.f298172u)) && C46238a.m51546a(this.f298173v, e702.f298173v) && C46238a.m51546a(Long.valueOf(this.f298174w), Long.valueOf(e702.f298174w)) && C46238a.m51546a(Integer.valueOf(this.f298175x), Integer.valueOf(e702.f298175x)) && C46238a.m51546a(Boolean.valueOf(this.f298176y), Boolean.valueOf(e702.f298176y)) && C46238a.m51546a(this.f298177z, e702.f298177z) && C46238a.m51546a(this.f298149A, e702.f298149A) && C46238a.m51546a(Integer.valueOf(this.f298150B), Integer.valueOf(e702.f298150B)) && C46238a.m51546a(Long.valueOf(this.f298151C), Long.valueOf(e702.f298151C)) && C46238a.m51546a(this.f298152D, e702.f298152D) && C46238a.m51546a(this.f298153E, e702.f298153E) && C46238a.m51546a(Integer.valueOf(this.f298154F), Integer.valueOf(e702.f298154F)) && C46238a.m51546a(Integer.valueOf(this.f298155G), Integer.valueOf(e702.f298155G)) && C46238a.m51546a(Integer.valueOf(this.f298156H), Integer.valueOf(e702.f298156H)) && C46238a.m51546a(Integer.valueOf(this.f298157I), Integer.valueOf(e702.f298157I));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            String str = this.f298158d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: videoPath");
            } else if (this.f298163i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f298159e);
                aVar.mo74321h(3, this.f298160f);
                String str2 = this.f298161g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74318e(5, this.f298162h);
                String str3 = this.f298163i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f298164j;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74318e(8, this.f298165n);
                String str5 = this.f298166o;
                if (str5 != null) {
                    aVar.mo74323j(9, str5);
                }
                aVar.mo74314a(10, this.f298167p);
                aVar.mo74314a(11, this.f298168q);
                aVar.mo74318e(12, this.f298169r);
                aVar.mo74318e(13, this.f298170s);
                aVar.mo74318e(14, this.f298171t);
                aVar.mo74318e(15, this.f298172u);
                aVar.mo74320g(16, 8, this.f298173v);
                aVar.mo74321h(17, this.f298174w);
                aVar.mo74318e(18, this.f298175x);
                aVar.mo74314a(19, this.f298176y);
                C101765cp3 cp32 = this.f298177z;
                if (cp32 != null) {
                    aVar.mo74322i(20, cp32.computeSize());
                    this.f298177z.writeFields(aVar);
                }
                wb4 wb4 = this.f298149A;
                if (wb4 != null) {
                    aVar.mo74322i(21, wb4.computeSize());
                    this.f298149A.writeFields(aVar);
                }
                aVar.mo74318e(22, this.f298150B);
                aVar.mo74321h(23, this.f298151C);
                aVar.mo74320g(24, 1, this.f298152D);
                C89349b bVar = this.f298153E;
                if (bVar != null) {
                    aVar.mo74315b(25, bVar);
                }
                aVar.mo74318e(26, this.f298154F);
                aVar.mo74318e(27, this.f298155G);
                aVar.mo74318e(28, this.f298156H);
                aVar.mo74318e(29, this.f298157I);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: thumbPath");
            }
        } else if (i2 == 1) {
            String str6 = this.f298158d;
            if (str6 != null) {
                i3 = C52418a.m58683j(1, str6) + 0;
            }
            int h = i3 + C52418a.m58681h(2, this.f298159e) + C52418a.m58681h(3, this.f298160f);
            String str7 = this.f298161g;
            if (str7 != null) {
                h += C52418a.m58683j(4, str7);
            }
            int e = h + C52418a.m58678e(5, this.f298162h);
            String str8 = this.f298163i;
            if (str8 != null) {
                e += C52418a.m58683j(6, str8);
            }
            String str9 = this.f298164j;
            if (str9 != null) {
                e += C52418a.m58683j(7, str9);
            }
            int e2 = e + C52418a.m58678e(8, this.f298165n);
            String str10 = this.f298166o;
            if (str10 != null) {
                e2 += C52418a.m58683j(9, str10);
            }
            int a = e2 + C52418a.m58674a(10, this.f298167p) + C52418a.m58674a(11, this.f298168q) + C52418a.m58678e(12, this.f298169r) + C52418a.m58678e(13, this.f298170s) + C52418a.m58678e(14, this.f298171t) + C52418a.m58678e(15, this.f298172u) + C52418a.m58680g(16, 8, this.f298173v) + C52418a.m58681h(17, this.f298174w) + C52418a.m58678e(18, this.f298175x) + C52418a.m58674a(19, this.f298176y);
            C101765cp3 cp33 = this.f298177z;
            if (cp33 != null) {
                a += C52418a.m58682i(20, cp33.computeSize());
            }
            wb4 wb42 = this.f298149A;
            if (wb42 != null) {
                a += C52418a.m58682i(21, wb42.computeSize());
            }
            int e3 = a + C52418a.m58678e(22, this.f298150B) + C52418a.m58681h(23, this.f298151C) + C52418a.m58680g(24, 1, this.f298152D);
            C89349b bVar2 = this.f298153E;
            if (bVar2 != null) {
                e3 += C52418a.m58675b(25, bVar2);
            }
            return e3 + C52418a.m58678e(26, this.f298154F) + C52418a.m58678e(27, this.f298155G) + C52418a.m58678e(28, this.f298156H) + C52418a.m58678e(29, this.f298157I);
        } else if (i2 == 2) {
            this.f298173v.clear();
            this.f298152D.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f298158d == null) {
                throw new C52419b("Not all required fields were included: videoPath");
            } else if (this.f298163i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: thumbPath");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C101773e70 e702 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    e702.f298158d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    e702.f298159e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    e702.f298160f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    e702.f298161g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    e702.f298162h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    e702.f298163i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    e702.f298164j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    e702.f298165n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    e702.f298166o = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    e702.f298167p = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    e702.f298168q = aVar3.mo141625c(intValue);
                    return 0;
                case 12:
                    e702.f298169r = aVar3.mo141629g(intValue);
                    return 0;
                case 13:
                    e702.f298170s = aVar3.mo141629g(intValue);
                    return 0;
                case 14:
                    e702.f298171t = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    e702.f298172u = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        byte[] bArr = j.get(i4);
                        C64339ea eaVar = new C64339ea();
                        if (bArr != null && bArr.length > 0) {
                            eaVar.parseFrom(bArr);
                        }
                        e702.f298173v.add(eaVar);
                    }
                    return 0;
                case 17:
                    e702.f298174w = aVar3.mo141631i(intValue);
                    return 0;
                case 18:
                    e702.f298175x = aVar3.mo141629g(intValue);
                    return 0;
                case 19:
                    e702.f298176y = aVar3.mo141625c(intValue);
                    return 0;
                case 20:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C101765cp3 cp34 = new C101765cp3();
                        if (bArr2 != null && bArr2.length > 0) {
                            cp34.parseFrom(bArr2);
                        }
                        e702.f298177z = cp34;
                    }
                    return 0;
                case 21:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        wb4 wb43 = new wb4();
                        if (bArr3 != null && bArr3.length > 0) {
                            wb43.parseFrom(bArr3);
                        }
                        e702.f298149A = wb43;
                    }
                    return 0;
                case 22:
                    e702.f298150B = aVar3.mo141629g(intValue);
                    return 0;
                case 23:
                    e702.f298151C = aVar3.mo141631i(intValue);
                    return 0;
                case 24:
                    e702.f298152D.add(aVar3.mo141633k(intValue));
                    return 0;
                case 25:
                    e702.f298153E = aVar3.mo141626d(intValue);
                    return 0;
                case 26:
                    e702.f298154F = aVar3.mo141629g(intValue);
                    return 0;
                case 27:
                    e702.f298155G = aVar3.mo141629g(intValue);
                    return 0;
                case 28:
                    e702.f298156H = aVar3.mo141629g(intValue);
                    return 0;
                case 29:
                    e702.f298157I = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
