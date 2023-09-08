package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r43 */
public class C90433r43 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C90442v43> f259762d = new LinkedList<>();

    /* renamed from: e */
    public String f259763e;

    /* renamed from: f */
    public String f259764f;

    /* renamed from: g */
    public String f259765g;

    /* renamed from: h */
    public boolean f259766h;

    /* renamed from: i */
    public boolean f259767i;

    /* renamed from: j */
    public boolean f259768j;

    /* renamed from: n */
    public LinkedList<C90438s43> f259769n = new LinkedList<>();

    /* renamed from: o */
    public boolean f259770o;

    /* renamed from: p */
    public boolean f259771p;

    /* renamed from: q */
    public int f259772q;

    /* renamed from: r */
    public int f259773r;

    /* renamed from: s */
    public String f259774s;

    /* renamed from: t */
    public String f259775t;

    /* renamed from: u */
    public boolean f259776u;

    /* renamed from: v */
    public C90445w43 f259777v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90433r43)) {
            return false;
        }
        C90433r43 r432 = (C90433r43) aVar;
        return C46238a.m51546a(this.BaseResponse, r432.BaseResponse) && C46238a.m51546a(this.f259762d, r432.f259762d) && C46238a.m51546a(this.f259763e, r432.f259763e) && C46238a.m51546a(this.f259764f, r432.f259764f) && C46238a.m51546a(this.f259765g, r432.f259765g) && C46238a.m51546a(Boolean.valueOf(this.f259766h), Boolean.valueOf(r432.f259766h)) && C46238a.m51546a(Boolean.valueOf(this.f259767i), Boolean.valueOf(r432.f259767i)) && C46238a.m51546a(Boolean.valueOf(this.f259768j), Boolean.valueOf(r432.f259768j)) && C46238a.m51546a(this.f259769n, r432.f259769n) && C46238a.m51546a(Boolean.valueOf(this.f259770o), Boolean.valueOf(r432.f259770o)) && C46238a.m51546a(Boolean.valueOf(this.f259771p), Boolean.valueOf(r432.f259771p)) && C46238a.m51546a(Integer.valueOf(this.f259772q), Integer.valueOf(r432.f259772q)) && C46238a.m51546a(Integer.valueOf(this.f259773r), Integer.valueOf(r432.f259773r)) && C46238a.m51546a(this.f259774s, r432.f259774s) && C46238a.m51546a(this.f259775t, r432.f259775t) && C46238a.m51546a(Boolean.valueOf(this.f259776u), Boolean.valueOf(r432.f259776u)) && C46238a.m51546a(this.f259777v, r432.f259777v);
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
                aVar.mo74320g(3, 8, this.f259762d);
                String str = this.f259763e;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f259764f;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259765g;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74314a(8, this.f259766h);
                aVar.mo74314a(9, this.f259767i);
                aVar.mo74314a(10, this.f259768j);
                aVar.mo74320g(11, 8, this.f259769n);
                aVar.mo74314a(12, this.f259770o);
                aVar.mo74314a(13, this.f259771p);
                aVar.mo74318e(14, this.f259772q);
                aVar.mo74318e(15, this.f259773r);
                String str4 = this.f259774s;
                if (str4 != null) {
                    aVar.mo74323j(16, str4);
                }
                String str5 = this.f259775t;
                if (str5 != null) {
                    aVar.mo74323j(17, str5);
                }
                aVar.mo74314a(18, this.f259776u);
                C90445w43 w432 = this.f259777v;
                if (w432 != null) {
                    aVar.mo74322i(19, w432.computeSize());
                    this.f259777v.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(3, 8, this.f259762d);
            String str6 = this.f259763e;
            if (str6 != null) {
                g += C52418a.m58683j(4, str6);
            }
            String str7 = this.f259764f;
            if (str7 != null) {
                g += C52418a.m58683j(5, str7);
            }
            String str8 = this.f259765g;
            if (str8 != null) {
                g += C52418a.m58683j(6, str8);
            }
            int a = g + C52418a.m58674a(8, this.f259766h) + C52418a.m58674a(9, this.f259767i) + C52418a.m58674a(10, this.f259768j) + C52418a.m58680g(11, 8, this.f259769n) + C52418a.m58674a(12, this.f259770o) + C52418a.m58674a(13, this.f259771p) + C52418a.m58678e(14, this.f259772q) + C52418a.m58678e(15, this.f259773r);
            String str9 = this.f259774s;
            if (str9 != null) {
                a += C52418a.m58683j(16, str9);
            }
            String str10 = this.f259775t;
            if (str10 != null) {
                a += C52418a.m58683j(17, str10);
            }
            int a2 = a + C52418a.m58674a(18, this.f259776u);
            C90445w43 w433 = this.f259777v;
            return w433 != null ? a2 + C52418a.m58682i(19, w433.computeSize()) : a2;
        } else if (i2 == 2) {
            this.f259762d.clear();
            this.f259769n.clear();
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
            C90433r43 r432 = objArr[1];
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
                        r432.BaseResponse = jaVar3;
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
                        r432.f259762d.add(v432);
                    }
                    return 0;
                case 4:
                    r432.f259763e = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r432.f259764f = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    r432.f259765g = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    r432.f259766h = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    r432.f259767i = aVar3.mo141625c(intValue);
                    return 0;
                case 10:
                    r432.f259768j = aVar3.mo141625c(intValue);
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
                        r432.f259769n.add(s432);
                    }
                    return 0;
                case 12:
                    r432.f259770o = aVar3.mo141625c(intValue);
                    return 0;
                case 13:
                    r432.f259771p = aVar3.mo141625c(intValue);
                    return 0;
                case 14:
                    r432.f259772q = aVar3.mo141629g(intValue);
                    return 0;
                case 15:
                    r432.f259773r = aVar3.mo141629g(intValue);
                    return 0;
                case 16:
                    r432.f259774s = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    r432.f259775t = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    r432.f259776u = aVar3.mo141625c(intValue);
                    return 0;
                case 19:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C90445w43 w434 = new C90445w43();
                        if (bArr4 != null && bArr4.length > 0) {
                            w434.parseFrom(bArr4);
                        }
                        r432.f259777v = w434;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
