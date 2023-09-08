package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dx3 */
public class C90407dx3 extends C49335eu3 {

    /* renamed from: A */
    public C89349b f259465A;

    /* renamed from: B */
    public boolean f259466B;

    /* renamed from: C */
    public C89349b f259467C;

    /* renamed from: d */
    public LinkedList<C90442v43> f259468d = new LinkedList<>();

    /* renamed from: e */
    public String f259469e;

    /* renamed from: f */
    public String f259470f;

    /* renamed from: g */
    public String f259471g;

    /* renamed from: h */
    public boolean f259472h;

    /* renamed from: i */
    public boolean f259473i;

    /* renamed from: j */
    public boolean f259474j;

    /* renamed from: n */
    public LinkedList<C90438s43> f259475n = new LinkedList<>();

    /* renamed from: o */
    public boolean f259476o;

    /* renamed from: p */
    public boolean f259477p;

    /* renamed from: q */
    public int f259478q;

    /* renamed from: r */
    public int f259479r;

    /* renamed from: s */
    public String f259480s;

    /* renamed from: t */
    public String f259481t;

    /* renamed from: u */
    public String f259482u;

    /* renamed from: v */
    public String f259483v;

    /* renamed from: w */
    public C89349b f259484w;

    /* renamed from: x */
    public C89349b f259485x;

    /* renamed from: y */
    public C90445w43 f259486y;

    /* renamed from: z */
    public boolean f259487z;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90407dx3)) {
            return false;
        }
        C90407dx3 dx32 = (C90407dx3) aVar;
        return C46238a.m51546a(this.BaseResponse, dx32.BaseResponse) && C46238a.m51546a(this.f259468d, dx32.f259468d) && C46238a.m51546a(this.f259469e, dx32.f259469e) && C46238a.m51546a(this.f259470f, dx32.f259470f) && C46238a.m51546a(this.f259471g, dx32.f259471g) && C46238a.m51546a(Boolean.valueOf(this.f259472h), Boolean.valueOf(dx32.f259472h)) && C46238a.m51546a(Boolean.valueOf(this.f259473i), Boolean.valueOf(dx32.f259473i)) && C46238a.m51546a(Boolean.valueOf(this.f259474j), Boolean.valueOf(dx32.f259474j)) && C46238a.m51546a(this.f259475n, dx32.f259475n) && C46238a.m51546a(Boolean.valueOf(this.f259476o), Boolean.valueOf(dx32.f259476o)) && C46238a.m51546a(Boolean.valueOf(this.f259477p), Boolean.valueOf(dx32.f259477p)) && C46238a.m51546a(Integer.valueOf(this.f259478q), Integer.valueOf(dx32.f259478q)) && C46238a.m51546a(Integer.valueOf(this.f259479r), Integer.valueOf(dx32.f259479r)) && C46238a.m51546a(this.f259480s, dx32.f259480s) && C46238a.m51546a(this.f259481t, dx32.f259481t) && C46238a.m51546a(this.f259482u, dx32.f259482u) && C46238a.m51546a(this.f259483v, dx32.f259483v) && C46238a.m51546a(this.f259484w, dx32.f259484w) && C46238a.m51546a(this.f259485x, dx32.f259485x) && C46238a.m51546a(this.f259486y, dx32.f259486y) && C46238a.m51546a(Boolean.valueOf(this.f259487z), Boolean.valueOf(dx32.f259487z)) && C46238a.m51546a(this.f259465A, dx32.f259465A) && C46238a.m51546a(Boolean.valueOf(this.f259466B), Boolean.valueOf(dx32.f259466B)) && C46238a.m51546a(this.f259467C, dx32.f259467C);
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
                aVar.mo74320g(3, 8, this.f259468d);
                String str = this.f259469e;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f259470f;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259471g;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74314a(8, this.f259472h);
                aVar.mo74314a(9, this.f259473i);
                aVar.mo74314a(10, this.f259474j);
                aVar.mo74320g(11, 8, this.f259475n);
                aVar.mo74314a(12, this.f259476o);
                aVar.mo74314a(13, this.f259477p);
                aVar.mo74318e(14, this.f259478q);
                aVar.mo74318e(15, this.f259479r);
                String str4 = this.f259480s;
                if (str4 != null) {
                    aVar.mo74323j(16, str4);
                }
                String str5 = this.f259481t;
                if (str5 != null) {
                    aVar.mo74323j(17, str5);
                }
                String str6 = this.f259482u;
                if (str6 != null) {
                    aVar.mo74323j(20, str6);
                }
                String str7 = this.f259483v;
                if (str7 != null) {
                    aVar.mo74323j(21, str7);
                }
                C89349b bVar = this.f259484w;
                if (bVar != null) {
                    aVar.mo74315b(22, bVar);
                }
                C89349b bVar2 = this.f259485x;
                if (bVar2 != null) {
                    aVar.mo74315b(24, bVar2);
                }
                C90445w43 w432 = this.f259486y;
                if (w432 != null) {
                    aVar.mo74322i(25, w432.computeSize());
                    this.f259486y.writeFields(aVar);
                }
                aVar.mo74314a(26, this.f259487z);
                C89349b bVar3 = this.f259465A;
                if (bVar3 != null) {
                    aVar.mo74315b(27, bVar3);
                }
                aVar.mo74314a(28, this.f259466B);
                C89349b bVar4 = this.f259467C;
                if (bVar4 != null) {
                    aVar.mo74315b(29, bVar4);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f259468d);
            String str8 = this.f259469e;
            if (str8 != null) {
                g += C52418a.m58683j(4, str8);
            }
            String str9 = this.f259470f;
            if (str9 != null) {
                g += C52418a.m58683j(5, str9);
            }
            String str10 = this.f259471g;
            if (str10 != null) {
                g += C52418a.m58683j(6, str10);
            }
            int a = g + C52418a.m58674a(8, this.f259472h) + C52418a.m58674a(9, this.f259473i) + C52418a.m58674a(10, this.f259474j) + C52418a.m58680g(11, 8, this.f259475n) + C52418a.m58674a(12, this.f259476o) + C52418a.m58674a(13, this.f259477p) + C52418a.m58678e(14, this.f259478q) + C52418a.m58678e(15, this.f259479r);
            String str11 = this.f259480s;
            if (str11 != null) {
                a += C52418a.m58683j(16, str11);
            }
            String str12 = this.f259481t;
            if (str12 != null) {
                a += C52418a.m58683j(17, str12);
            }
            String str13 = this.f259482u;
            if (str13 != null) {
                a += C52418a.m58683j(20, str13);
            }
            String str14 = this.f259483v;
            if (str14 != null) {
                a += C52418a.m58683j(21, str14);
            }
            C89349b bVar5 = this.f259484w;
            if (bVar5 != null) {
                a += C52418a.m58675b(22, bVar5);
            }
            C89349b bVar6 = this.f259485x;
            if (bVar6 != null) {
                a += C52418a.m58675b(24, bVar6);
            }
            C90445w43 w433 = this.f259486y;
            if (w433 != null) {
                a += C52418a.m58682i(25, w433.computeSize());
            }
            int a2 = a + C52418a.m58674a(26, this.f259487z);
            C89349b bVar7 = this.f259465A;
            if (bVar7 != null) {
                a2 += C52418a.m58675b(27, bVar7);
            }
            int a3 = a2 + C52418a.m58674a(28, this.f259466B);
            C89349b bVar8 = this.f259467C;
            return bVar8 != null ? a3 + C52418a.m58675b(29, bVar8) : a3;
        } else if (i2 == 2) {
            this.f259468d.clear();
            this.f259475n.clear();
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
            C90407dx3 dx32 = objArr[1];
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
                        dx32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C90442v43 v432 = new C90442v43();
                        if (bArr2 != null && bArr2.length > 0) {
                            v432.parseFrom(bArr2);
                        }
                        dx32.f259468d.add(v432);
                    }
                    return 0;
                case 4:
                    dx32.f259469e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    dx32.f259470f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    dx32.f259471g = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    dx32.f259472h = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    dx32.f259473i = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    dx32.f259474j = aVar3.mo141625c(intValue);
                    return 0;
                case 11:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C90438s43 s432 = new C90438s43();
                        if (bArr3 != null && bArr3.length > 0) {
                            s432.parseFrom(bArr3);
                        }
                        dx32.f259475n.add(s432);
                    }
                    return 0;
                case 12:
                    dx32.f259476o = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    dx32.f259477p = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    dx32.f259478q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    dx32.f259479r = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    dx32.f259480s = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    dx32.f259481t = aVar3.mo141633k(intValue);
                    return 0;
                case 20:
                    dx32.f259482u = aVar3.mo141633k(intValue);
                    return 0;
                case 21:
                    dx32.f259483v = aVar3.mo141633k(intValue);
                    return 0;
                case 22:
                    dx32.f259484w = aVar3.mo141626d(intValue);
                    return 0;
                case 24:
                    dx32.f259485x = aVar3.mo141626d(intValue);
                    return 0;
                case 25:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C90445w43 w434 = new C90445w43();
                        if (bArr4 != null && bArr4.length > 0) {
                            w434.parseFrom(bArr4);
                        }
                        dx32.f259486y = w434;
                    }
                    return 0;
                case 26:
                    dx32.f259487z = aVar3.mo141625c(intValue);
                    return 0;
                case 27:
                    dx32.f259465A = aVar3.mo141626d(intValue);
                    return 0;
                case 28:
                    dx32.f259466B = aVar3.mo141625c(intValue);
                    return 0;
                case 29:
                    dx32.f259467C = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
