package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class lj4 extends C101820nt3 {

    /* renamed from: d */
    public String f137460d;

    /* renamed from: e */
    public String f137461e;

    /* renamed from: f */
    public String f137462f;

    /* renamed from: g */
    public String f137463g;

    /* renamed from: h */
    public long f137464h;

    /* renamed from: i */
    public String f137465i;

    /* renamed from: j */
    public String f137466j;

    /* renamed from: n */
    public String f137467n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof lj4)) {
            return false;
        }
        lj4 lj4 = (lj4) aVar;
        return C46238a.m51546a(this.BaseRequest, lj4.BaseRequest) && C46238a.m51546a(this.f137460d, lj4.f137460d) && C46238a.m51546a(this.f137461e, lj4.f137461e) && C46238a.m51546a(this.f137462f, lj4.f137462f) && C46238a.m51546a(this.f137463g, lj4.f137463g) && C46238a.m51546a(Long.valueOf(this.f137464h), Long.valueOf(lj4.f137464h)) && C46238a.m51546a(this.f137465i, lj4.f137465i) && C46238a.m51546a(this.f137466j, lj4.f137466j) && C46238a.m51546a(this.f137467n, lj4.f137467n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            C53733a aVar = objArr[0];
            if (this.f137460d == null) {
                throw new C52419b("Not all required fields were included: req_key");
            } else if (this.f137461e == null) {
                throw new C52419b("Not all required fields were included: transfer_id");
            } else if (this.f137462f == null) {
                throw new C52419b("Not all required fields were included: transaction_id");
            } else if (this.f137463g != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f137460d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f137461e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f137462f;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                String str4 = this.f137463g;
                if (str4 != null) {
                    aVar.mo74323j(5, str4);
                }
                aVar.mo74321h(6, this.f137464h);
                String str5 = this.f137465i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                String str6 = this.f137466j;
                if (str6 != null) {
                    aVar.mo74323j(8, str6);
                }
                String str7 = this.f137467n;
                if (str7 == null) {
                    return 0;
                }
                aVar.mo74323j(9, str7);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_openid");
            }
        } else if (i2 == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            int i3 = iaVar2 != null ? C52418a.m58682i(1, iaVar2.computeSize()) + 0 : 0;
            String str8 = this.f137460d;
            if (str8 != null) {
                i3 += C52418a.m58683j(2, str8);
            }
            String str9 = this.f137461e;
            if (str9 != null) {
                i3 += C52418a.m58683j(3, str9);
            }
            String str10 = this.f137462f;
            if (str10 != null) {
                i3 += C52418a.m58683j(4, str10);
            }
            String str11 = this.f137463g;
            if (str11 != null) {
                i3 += C52418a.m58683j(5, str11);
            }
            int h = i3 + C52418a.m58681h(6, this.f137464h);
            String str12 = this.f137465i;
            if (str12 != null) {
                h += C52418a.m58683j(7, str12);
            }
            String str13 = this.f137466j;
            if (str13 != null) {
                h += C52418a.m58683j(8, str13);
            }
            String str14 = this.f137467n;
            return str14 != null ? h + C52418a.m58683j(9, str14) : h;
        } else if (i2 == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137460d == null) {
                throw new C52419b("Not all required fields were included: req_key");
            } else if (this.f137461e == null) {
                throw new C52419b("Not all required fields were included: transfer_id");
            } else if (this.f137462f == null) {
                throw new C52419b("Not all required fields were included: transaction_id");
            } else if (this.f137463g != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: receiver_openid");
            }
        } else if (i2 != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            lj4 lj4 = objArr[1];
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
                        lj4.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    lj4.f137460d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lj4.f137461e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lj4.f137462f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lj4.f137463g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lj4.f137464h = aVar3.mo141631i(intValue);
                    return 0;
                case 7:
                    lj4.f137465i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    lj4.f137466j = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    lj4.f137467n = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
