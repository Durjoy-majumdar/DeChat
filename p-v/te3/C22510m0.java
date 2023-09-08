package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m0 */
public class C22510m0 extends C101820nt3 {

    /* renamed from: d */
    public String f64189d;

    /* renamed from: e */
    public int f64190e;

    /* renamed from: f */
    public String f64191f;

    /* renamed from: g */
    public String f64192g;

    /* renamed from: h */
    public String f64193h;

    /* renamed from: i */
    public String f64194i;

    /* renamed from: j */
    public int f64195j;

    /* renamed from: n */
    public int f64196n;

    /* renamed from: o */
    public xa4 f64197o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C22510m0)) {
            return false;
        }
        C22510m0 m0Var = (C22510m0) aVar;
        return C46238a.m51546a(this.BaseRequest, m0Var.BaseRequest) && C46238a.m51546a(this.f64189d, m0Var.f64189d) && C46238a.m51546a(Integer.valueOf(this.f64190e), Integer.valueOf(m0Var.f64190e)) && C46238a.m51546a(this.f64191f, m0Var.f64191f) && C46238a.m51546a(this.f64192g, m0Var.f64192g) && C46238a.m51546a(this.f64193h, m0Var.f64193h) && C46238a.m51546a(this.f64194i, m0Var.f64194i) && C46238a.m51546a(Integer.valueOf(this.f64195j), Integer.valueOf(m0Var.f64195j)) && C46238a.m51546a(Integer.valueOf(this.f64196n), Integer.valueOf(m0Var.f64196n)) && C46238a.m51546a(this.f64197o, m0Var.f64197o);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f64191f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f64189d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f64190e);
                String str2 = this.f64191f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                String str3 = this.f64192g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f64193h;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                String str5 = this.f64194i;
                if (str5 != null) {
                    aVar.mo74323j(7, str5);
                }
                aVar.mo74318e(8, this.f64195j);
                aVar.mo74318e(9, this.f64196n);
                xa4 xa4 = this.f64197o;
                if (xa4 != null) {
                    aVar.mo74322i(10, xa4.computeSize());
                    this.f64197o.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: card_id");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str6 = this.f64189d;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f64190e);
            String str7 = this.f64191f;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f64192g;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            String str9 = this.f64193h;
            if (str9 != null) {
                e += C52418a.m58683j(6, str9);
            }
            String str10 = this.f64194i;
            if (str10 != null) {
                e += C52418a.m58683j(7, str10);
            }
            int e2 = e + C52418a.m58678e(8, this.f64195j) + C52418a.m58678e(9, this.f64196n);
            xa4 xa42 = this.f64197o;
            return xa42 != null ? e2 + C52418a.m58682i(10, xa42.computeSize()) : e2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f64191f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: card_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C22510m0 m0Var = objArr[1];
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
                        m0Var.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    m0Var.f64189d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    m0Var.f64190e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    m0Var.f64191f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    m0Var.f64192g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    m0Var.f64193h = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    m0Var.f64194i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    m0Var.f64195j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    m0Var.f64196n = aVar3.mo141629g(intValue);
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
                        m0Var.f64197o = xa43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
