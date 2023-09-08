package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yw1 */
public class C22537yw1 extends C101820nt3 {

    /* renamed from: d */
    public String f64822d;

    /* renamed from: e */
    public int f64823e;

    /* renamed from: f */
    public String f64824f;

    /* renamed from: g */
    public String f64825g;

    /* renamed from: h */
    public String f64826h;

    /* renamed from: i */
    public String f64827i;

    /* renamed from: j */
    public int f64828j;

    /* renamed from: n */
    public String f64829n;

    /* renamed from: o */
    public xa4 f64830o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22537yw1)) {
            return false;
        }
        C22537yw1 yw12 = (C22537yw1) aVar;
        return C46238a.m51546a(this.BaseRequest, yw12.BaseRequest) && C46238a.m51546a(this.f64822d, yw12.f64822d) && C46238a.m51546a(Integer.valueOf(this.f64823e), Integer.valueOf(yw12.f64823e)) && C46238a.m51546a(this.f64824f, yw12.f64824f) && C46238a.m51546a(this.f64825g, yw12.f64825g) && C46238a.m51546a(this.f64826h, yw12.f64826h) && C46238a.m51546a(this.f64827i, yw12.f64827i) && C46238a.m51546a(Integer.valueOf(this.f64828j), Integer.valueOf(yw12.f64828j)) && C46238a.m51546a(this.f64829n, yw12.f64829n) && C46238a.m51546a(this.f64830o, yw12.f64830o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f64822d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f64822d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f64823e);
                String str2 = this.f64824f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f64825g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f64826h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f64827i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74318e(8, this.f64828j);
                String str6 = this.f64829n;
                if (str6 != null) {
                    aVar.mo74323j(9, str6);
                }
                xa4 xa4 = this.f64830o;
                if (xa4 != null) {
                    aVar.mo74322i(10, xa4.computeSize());
                    this.f64830o.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: card_id");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str7 = this.f64822d;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            int e = i2 + C52418a.m58678e(3, this.f64823e);
            String str8 = this.f64824f;
            if (str8 != null) {
                e += C52418a.m58683j(4, str8);
            }
            String str9 = this.f64825g;
            if (str9 != null) {
                e += C52418a.m58683j(5, str9);
            }
            String str10 = this.f64826h;
            if (str10 != null) {
                e += C52418a.m58683j(6, str10);
            }
            String str11 = this.f64827i;
            if (str11 != null) {
                e += C52418a.m58683j(7, str11);
            }
            int e2 = e + C52418a.m58678e(8, this.f64828j);
            String str12 = this.f64829n;
            if (str12 != null) {
                e2 += C52418a.m58683j(9, str12);
            }
            xa4 xa42 = this.f64830o;
            return xa42 != null ? e2 + C52418a.m58682i(10, xa42.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f64822d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: card_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22537yw1 yw12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C90417ia iaVar3 = new C90417ia();
                        if (bArr != null && bArr.length > 0) {
                            iaVar3.parseFrom(bArr);
                        }
                        yw12.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    yw12.f64822d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    yw12.f64823e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    yw12.f64824f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    yw12.f64825g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    yw12.f64826h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    yw12.f64827i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    yw12.f64828j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    yw12.f64829n = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        xa4 xa43 = new xa4();
                        if (bArr2 != null && bArr2.length > 0) {
                            xa43.parseFrom(bArr2);
                        }
                        yw12.f64830o = xa43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
