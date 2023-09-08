package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n60 */
public class C50500n60 extends C101820nt3 {

    /* renamed from: d */
    public String f138427d;

    /* renamed from: e */
    public String f138428e;

    /* renamed from: f */
    public int f138429f;

    /* renamed from: g */
    public int f138430g;

    /* renamed from: h */
    public boolean f138431h;

    /* renamed from: i */
    public String f138432i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50500n60)) {
            return false;
        }
        C50500n60 n602 = (C50500n60) aVar;
        return C46238a.m51546a(this.BaseRequest, n602.BaseRequest) && C46238a.m51546a(this.f138427d, n602.f138427d) && C46238a.m51546a(this.f138428e, n602.f138428e) && C46238a.m51546a(Integer.valueOf(this.f138429f), Integer.valueOf(n602.f138429f)) && C46238a.m51546a(Integer.valueOf(this.f138430g), Integer.valueOf(n602.f138430g)) && C46238a.m51546a(Boolean.valueOf(this.f138431h), Boolean.valueOf(n602.f138431h)) && C46238a.m51546a(this.f138432i, n602.f138432i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C90417ia iaVar = this.BaseRequest;
            if (iaVar != null) {
                aVar.mo74322i(1, iaVar.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            String str = this.f138427d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f138428e;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f138429f);
            aVar.mo74318e(5, this.f138430g);
            aVar.mo74314a(6, this.f138431h);
            String str3 = this.f138432i;
            if (str3 != null) {
                aVar.mo74323j(7, str3);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f138427d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f138428e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f138429f) + C52418a.m58678e(5, this.f138430g) + C52418a.m58674a(6, this.f138431h);
            String str6 = this.f138432i;
            return str6 != null ? e + C52418a.m58683j(7, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50500n60 n602 = objArr[1];
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
                        n602.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    n602.f138427d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    n602.f138428e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    n602.f138429f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    n602.f138430g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    n602.f138431h = aVar3.mo141625c(intValue);
                    return 0;
                case 7:
                    n602.f138432i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
