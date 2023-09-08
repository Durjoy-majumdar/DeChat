package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ec0 */
public class C49261ec0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C48737am2> f132843d = new LinkedList<>();

    /* renamed from: e */
    public C49996ji3 f132844e;

    /* renamed from: f */
    public String f132845f;

    /* renamed from: g */
    public String f132846g;

    /* renamed from: h */
    public String f132847h;

    /* renamed from: i */
    public String f132848i;

    /* renamed from: j */
    public float f132849j;

    /* renamed from: n */
    public int f132850n;

    /* renamed from: o */
    public String f132851o;

    /* renamed from: p */
    public String f132852p;

    /* renamed from: q */
    public float f132853q;

    /* renamed from: r */
    public String f132854r;

    /* renamed from: s */
    public String f132855s;

    /* renamed from: t */
    public String f132856t;

    /* renamed from: u */
    public String f132857u;

    /* renamed from: v */
    public C49996ji3 f132858v;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49261ec0)) {
            return false;
        }
        C49261ec0 ec02 = (C49261ec0) aVar;
        return C46238a.m51546a(this.BaseResponse, ec02.BaseResponse) && C46238a.m51546a(this.f132843d, ec02.f132843d) && C46238a.m51546a(this.f132844e, ec02.f132844e) && C46238a.m51546a(this.f132845f, ec02.f132845f) && C46238a.m51546a(this.f132846g, ec02.f132846g) && C46238a.m51546a(this.f132847h, ec02.f132847h) && C46238a.m51546a(this.f132848i, ec02.f132848i) && C46238a.m51546a(Float.valueOf(this.f132849j), Float.valueOf(ec02.f132849j)) && C46238a.m51546a(Integer.valueOf(this.f132850n), Integer.valueOf(ec02.f132850n)) && C46238a.m51546a(this.f132851o, ec02.f132851o) && C46238a.m51546a(this.f132852p, ec02.f132852p) && C46238a.m51546a(Float.valueOf(this.f132853q), Float.valueOf(ec02.f132853q)) && C46238a.m51546a(this.f132854r, ec02.f132854r) && C46238a.m51546a(this.f132855s, ec02.f132855s) && C46238a.m51546a(this.f132856t, ec02.f132856t) && C46238a.m51546a(this.f132857u, ec02.f132857u) && C46238a.m51546a(this.f132858v, ec02.f132858v);
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
                aVar.mo74320g(2, 8, this.f132843d);
                C49996ji3 ji32 = this.f132844e;
                if (ji32 != null) {
                    aVar.mo74322i(3, ji32.computeSize());
                    this.f132844e.writeFields(aVar);
                }
                String str = this.f132845f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f132846g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f132847h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                String str4 = this.f132848i;
                if (str4 != null) {
                    aVar.mo74323j(7, str4);
                }
                aVar.mo74317d(8, this.f132849j);
                aVar.mo74318e(9, this.f132850n);
                String str5 = this.f132851o;
                if (str5 != null) {
                    aVar.mo74323j(10, str5);
                }
                String str6 = this.f132852p;
                if (str6 != null) {
                    aVar.mo74323j(11, str6);
                }
                aVar.mo74317d(12, this.f132853q);
                String str7 = this.f132854r;
                if (str7 != null) {
                    aVar.mo74323j(13, str7);
                }
                String str8 = this.f132855s;
                if (str8 != null) {
                    aVar.mo74323j(14, str8);
                }
                String str9 = this.f132856t;
                if (str9 != null) {
                    aVar.mo74323j(15, str9);
                }
                String str10 = this.f132857u;
                if (str10 != null) {
                    aVar.mo74323j(16, str10);
                }
                C49996ji3 ji33 = this.f132858v;
                if (ji33 != null) {
                    aVar.mo74322i(17, ji33.computeSize());
                    this.f132858v.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int g = i3 + C52418a.m58680g(2, 8, this.f132843d);
            C49996ji3 ji34 = this.f132844e;
            if (ji34 != null) {
                g += C52418a.m58682i(3, ji34.computeSize());
            }
            String str11 = this.f132845f;
            if (str11 != null) {
                g += C52418a.m58683j(4, str11);
            }
            String str12 = this.f132846g;
            if (str12 != null) {
                g += C52418a.m58683j(5, str12);
            }
            String str13 = this.f132847h;
            if (str13 != null) {
                g += C52418a.m58683j(6, str13);
            }
            String str14 = this.f132848i;
            if (str14 != null) {
                g += C52418a.m58683j(7, str14);
            }
            int d = g + C52418a.m58677d(8, this.f132849j) + C52418a.m58678e(9, this.f132850n);
            String str15 = this.f132851o;
            if (str15 != null) {
                d += C52418a.m58683j(10, str15);
            }
            String str16 = this.f132852p;
            if (str16 != null) {
                d += C52418a.m58683j(11, str16);
            }
            int d2 = d + C52418a.m58677d(12, this.f132853q);
            String str17 = this.f132854r;
            if (str17 != null) {
                d2 += C52418a.m58683j(13, str17);
            }
            String str18 = this.f132855s;
            if (str18 != null) {
                d2 += C52418a.m58683j(14, str18);
            }
            String str19 = this.f132856t;
            if (str19 != null) {
                d2 += C52418a.m58683j(15, str19);
            }
            String str20 = this.f132857u;
            if (str20 != null) {
                d2 += C52418a.m58683j(16, str20);
            }
            C49996ji3 ji35 = this.f132858v;
            return ji35 != null ? d2 + C52418a.m58682i(17, ji35.computeSize()) : d2;
        } else if (i2 == 2) {
            this.f132843d.clear();
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
            C49261ec0 ec02 = objArr[1];
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
                        ec02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C48737am2 am22 = new C48737am2();
                        if (bArr2 != null && bArr2.length > 0) {
                            am22.parseFrom(bArr2);
                        }
                        ec02.f132843d.add(am22);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C49996ji3 ji36 = new C49996ji3();
                        if (bArr3 != null && bArr3.length > 0) {
                            ji36.parseFrom(bArr3);
                        }
                        ec02.f132844e = ji36;
                    }
                    return 0;
                case 4:
                    ec02.f132845f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ec02.f132846g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ec02.f132847h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    ec02.f132848i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ec02.f132849j = aVar3.mo141628f(intValue);
                    return 0;
                case 9:
                    ec02.f132850n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ec02.f132851o = aVar3.mo141633k(intValue);
                    return 0;
                case 11:
                    ec02.f132852p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ec02.f132853q = aVar3.mo141628f(intValue);
                    return 0;
                case 13:
                    ec02.f132854r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    ec02.f132855s = aVar3.mo141633k(intValue);
                    return 0;
                case 15:
                    ec02.f132856t = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    ec02.f132857u = aVar3.mo141633k(intValue);
                    return 0;
                case 17:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C49996ji3 ji37 = new C49996ji3();
                        if (bArr4 != null && bArr4.length > 0) {
                            ji37.parseFrom(bArr4);
                        }
                        ec02.f132858v = ji37;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
