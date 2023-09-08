package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class pn4 extends C49335eu3 {

    /* renamed from: d */
    public int f139845d;

    /* renamed from: e */
    public C51163rv3 f139846e;

    /* renamed from: f */
    public C51163rv3 f139847f;

    /* renamed from: g */
    public C51163rv3 f139848g;

    /* renamed from: h */
    public int f139849h;

    /* renamed from: i */
    public int f139850i;

    /* renamed from: j */
    public int f139851j;

    /* renamed from: n */
    public int f139852n;

    /* renamed from: o */
    public long f139853o;

    /* renamed from: p */
    public String f139854p;

    /* renamed from: q */
    public String f139855q;

    /* renamed from: r */
    public String f139856r;

    /* renamed from: s */
    public int f139857s;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof pn4)) {
            return false;
        }
        pn4 pn4 = (pn4) aVar;
        return C46238a.m51546a(this.BaseResponse, pn4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139845d), Integer.valueOf(pn4.f139845d)) && C46238a.m51546a(this.f139846e, pn4.f139846e) && C46238a.m51546a(this.f139847f, pn4.f139847f) && C46238a.m51546a(this.f139848g, pn4.f139848g) && C46238a.m51546a(Integer.valueOf(this.f139849h), Integer.valueOf(pn4.f139849h)) && C46238a.m51546a(Integer.valueOf(this.f139850i), Integer.valueOf(pn4.f139850i)) && C46238a.m51546a(Integer.valueOf(this.f139851j), Integer.valueOf(pn4.f139851j)) && C46238a.m51546a(Integer.valueOf(this.f139852n), Integer.valueOf(pn4.f139852n)) && C46238a.m51546a(Long.valueOf(this.f139853o), Long.valueOf(pn4.f139853o)) && C46238a.m51546a(this.f139854p, pn4.f139854p) && C46238a.m51546a(this.f139855q, pn4.f139855q) && C46238a.m51546a(this.f139856r, pn4.f139856r) && C46238a.m51546a(Integer.valueOf(this.f139857s), Integer.valueOf(pn4.f139857s));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        int i3 = 0;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139846e == null) {
                throw new C52419b("Not all required fields were included: ClientImgId");
            } else if (this.f139847f == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f139848g != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139845d);
                C51163rv3 rv32 = this.f139846e;
                if (rv32 != null) {
                    aVar.mo74322i(3, rv32.computeSize());
                    this.f139846e.writeFields(aVar);
                }
                C51163rv3 rv33 = this.f139847f;
                if (rv33 != null) {
                    aVar.mo74322i(4, rv33.computeSize());
                    this.f139847f.writeFields(aVar);
                }
                C51163rv3 rv34 = this.f139848g;
                if (rv34 != null) {
                    aVar.mo74322i(5, rv34.computeSize());
                    this.f139848g.writeFields(aVar);
                }
                aVar.mo74318e(6, this.f139849h);
                aVar.mo74318e(7, this.f139850i);
                aVar.mo74318e(8, this.f139851j);
                aVar.mo74318e(9, this.f139852n);
                aVar.mo74321h(10, this.f139853o);
                String str = this.f139854p;
                if (str != null) {
                    aVar.mo74323j(11, str);
                }
                String str2 = this.f139855q;
                if (str2 != null) {
                    aVar.mo74323j(12, str2);
                }
                String str3 = this.f139856r;
                if (str3 != null) {
                    aVar.mo74323j(13, str3);
                }
                aVar.mo74318e(14, this.f139857s);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ToUserName");
            }
        } else if (i2 == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i3 = C52418a.m58682i(1, jaVar2.computeSize()) + 0;
            }
            int e = i3 + C52418a.m58678e(2, this.f139845d);
            C51163rv3 rv35 = this.f139846e;
            if (rv35 != null) {
                e += C52418a.m58682i(3, rv35.computeSize());
            }
            C51163rv3 rv36 = this.f139847f;
            if (rv36 != null) {
                e += C52418a.m58682i(4, rv36.computeSize());
            }
            C51163rv3 rv37 = this.f139848g;
            if (rv37 != null) {
                e += C52418a.m58682i(5, rv37.computeSize());
            }
            int e2 = e + C52418a.m58678e(6, this.f139849h) + C52418a.m58678e(7, this.f139850i) + C52418a.m58678e(8, this.f139851j) + C52418a.m58678e(9, this.f139852n) + C52418a.m58681h(10, this.f139853o);
            String str4 = this.f139854p;
            if (str4 != null) {
                e2 += C52418a.m58683j(11, str4);
            }
            String str5 = this.f139855q;
            if (str5 != null) {
                e2 += C52418a.m58683j(12, str5);
            }
            String str6 = this.f139856r;
            if (str6 != null) {
                e2 += C52418a.m58683j(13, str6);
            }
            return e2 + C52418a.m58678e(14, this.f139857s);
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f139846e == null) {
                throw new C52419b("Not all required fields were included: ClientImgId");
            } else if (this.f139847f == null) {
                throw new C52419b("Not all required fields were included: FromUserName");
            } else if (this.f139848g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ToUserName");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            pn4 pn4 = objArr[1];
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
                        pn4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    pn4.f139845d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i5 = 0; i5 < size2; i5++) {
                        byte[] bArr2 = j2.get(i5);
                        C51163rv3 rv38 = new C51163rv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            rv38.mo73356d(bArr2);
                        }
                        pn4.f139846e = rv38;
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i6 = 0; i6 < size3; i6++) {
                        byte[] bArr3 = j3.get(i6);
                        C51163rv3 rv39 = new C51163rv3();
                        if (bArr3 != null && bArr3.length > 0) {
                            rv39.mo73356d(bArr3);
                        }
                        pn4.f139847f = rv39;
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        byte[] bArr4 = j4.get(i7);
                        C51163rv3 rv310 = new C51163rv3();
                        if (bArr4 != null && bArr4.length > 0) {
                            rv310.mo73356d(bArr4);
                        }
                        pn4.f139848g = rv310;
                    }
                    return 0;
                case 6:
                    pn4.f139849h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    pn4.f139850i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    pn4.f139851j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    pn4.f139852n = aVar3.mo141629g(intValue);
                    return 0;
                case 10:
                    pn4.f139853o = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    pn4.f139854p = aVar3.mo141633k(intValue);
                    return 0;
                case 12:
                    pn4.f139855q = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    pn4.f139856r = aVar3.mo141633k(intValue);
                    return 0;
                case 14:
                    pn4.f139857s = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
