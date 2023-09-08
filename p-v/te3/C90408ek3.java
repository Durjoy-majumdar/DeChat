package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ek3 */
public class C90408ek3 extends C49335eu3 {

    /* renamed from: d */
    public boolean f259488d;

    /* renamed from: e */
    public LinkedList<C90442v43> f259489e = new LinkedList<>();

    /* renamed from: f */
    public String f259490f;

    /* renamed from: g */
    public String f259491g;

    /* renamed from: h */
    public String f259492h;

    /* renamed from: i */
    public LinkedList<C90438s43> f259493i = new LinkedList<>();

    /* renamed from: j */
    public boolean f259494j;

    /* renamed from: n */
    public int f259495n;

    /* renamed from: o */
    public int f259496o;

    /* renamed from: p */
    public String f259497p;

    /* renamed from: q */
    public String f259498q;

    /* renamed from: r */
    public C90445w43 f259499r;

    /* renamed from: s */
    public C89349b f259500s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90408ek3)) {
            return false;
        }
        C90408ek3 ek32 = (C90408ek3) aVar;
        return C46238a.m51546a(this.BaseResponse, ek32.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f259488d), Boolean.valueOf(ek32.f259488d)) && C46238a.m51546a(this.f259489e, ek32.f259489e) && C46238a.m51546a(this.f259490f, ek32.f259490f) && C46238a.m51546a(this.f259491g, ek32.f259491g) && C46238a.m51546a(this.f259492h, ek32.f259492h) && C46238a.m51546a(this.f259493i, ek32.f259493i) && C46238a.m51546a(Boolean.valueOf(this.f259494j), Boolean.valueOf(ek32.f259494j)) && C46238a.m51546a(Integer.valueOf(this.f259495n), Integer.valueOf(ek32.f259495n)) && C46238a.m51546a(Integer.valueOf(this.f259496o), Integer.valueOf(ek32.f259496o)) && C46238a.m51546a(this.f259497p, ek32.f259497p) && C46238a.m51546a(this.f259498q, ek32.f259498q) && C46238a.m51546a(this.f259499r, ek32.f259499r) && C46238a.m51546a(this.f259500s, ek32.f259500s);
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
                aVar.mo74314a(2, this.f259488d);
                aVar.mo74320g(3, 8, this.f259489e);
                String str = this.f259490f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f259491g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f259492h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                aVar.mo74320g(7, 8, this.f259493i);
                aVar.mo74314a(8, this.f259494j);
                aVar.mo74318e(9, this.f259495n);
                aVar.mo74318e(10, this.f259496o);
                String str4 = this.f259497p;
                if (str4 != null) {
                    aVar.mo74323j(11, str4);
                }
                String str5 = this.f259498q;
                if (str5 != null) {
                    aVar.mo74323j(12, str5);
                }
                C90445w43 w432 = this.f259499r;
                if (w432 != null) {
                    aVar.mo74322i(13, w432.computeSize());
                    this.f259499r.writeFields(aVar);
                }
                C89349b bVar = this.f259500s;
                if (bVar != null) {
                    aVar.mo74315b(14, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int a = i3 + C52418a.m58674a(2, this.f259488d) + C52418a.m58680g(3, 8, this.f259489e);
            String str6 = this.f259490f;
            if (str6 != null) {
                a += C52418a.m58683j(4, str6);
            }
            String str7 = this.f259491g;
            if (str7 != null) {
                a += C52418a.m58683j(5, str7);
            }
            String str8 = this.f259492h;
            if (str8 != null) {
                a += C52418a.m58683j(6, str8);
            }
            int g = a + C52418a.m58680g(7, 8, this.f259493i) + C52418a.m58674a(8, this.f259494j) + C52418a.m58678e(9, this.f259495n) + C52418a.m58678e(10, this.f259496o);
            String str9 = this.f259497p;
            if (str9 != null) {
                g += C52418a.m58683j(11, str9);
            }
            String str10 = this.f259498q;
            if (str10 != null) {
                g += C52418a.m58683j(12, str10);
            }
            C90445w43 w433 = this.f259499r;
            if (w433 != null) {
                g += C52418a.m58682i(13, w433.computeSize());
            }
            C89349b bVar2 = this.f259500s;
            return bVar2 != null ? g + C52418a.m58675b(14, bVar2) : g;
        } else if (i2 == 2) {
            this.f259489e.clear();
            this.f259493i.clear();
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
            C90408ek3 ek32 = objArr[1];
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
                        ek32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ek32.f259488d = aVar3.mo141625c(intValue);
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
                        ek32.f259489e.add(v432);
                    }
                    return 0;
                case 4:
                    ek32.f259490f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ek32.f259491g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ek32.f259492h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C90438s43 s432 = new C90438s43();
                        if (bArr3 != null && bArr3.length > 0) {
                            s432.parseFrom(bArr3);
                        }
                        ek32.f259493i.add(s432);
                    }
                    return 0;
                case 8:
                    ek32.f259494j = aVar3.mo141625c(intValue);
                    return 0;
                case 9:
                    ek32.f259495n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    ek32.f259496o = aVar3.mo141629g(intValue);
                    return 0;
                case 11:
                    ek32.f259497p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    ek32.f259498q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C90445w43 w434 = new C90445w43();
                        if (bArr4 != null && bArr4.length > 0) {
                            w434.parseFrom(bArr4);
                        }
                        ek32.f259499r = w434;
                    }
                    return 0;
                case 14:
                    ek32.f259500s = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
