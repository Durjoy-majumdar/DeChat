package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rw2 */
public class C51167rw2 extends C101820nt3 {

    /* renamed from: d */
    public String f141186d;

    /* renamed from: e */
    public String f141187e;

    /* renamed from: f */
    public int f141188f;

    /* renamed from: g */
    public int f141189g;

    /* renamed from: h */
    public String f141190h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51167rw2)) {
            return false;
        }
        C51167rw2 rw22 = (C51167rw2) aVar;
        return C46238a.m51546a(this.BaseRequest, rw22.BaseRequest) && C46238a.m51546a(this.f141186d, rw22.f141186d) && C46238a.m51546a(this.f141187e, rw22.f141187e) && C46238a.m51546a(Integer.valueOf(this.f141188f), Integer.valueOf(rw22.f141188f)) && C46238a.m51546a(Integer.valueOf(this.f141189g), Integer.valueOf(rw22.f141189g)) && C46238a.m51546a(this.f141190h, rw22.f141190h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141186d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f141186d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f141187e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f141188f);
                aVar.mo74318e(5, this.f141189g);
                String str3 = this.f141190h;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: qr_url");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str4 = this.f141186d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f141187e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f141188f) + C52418a.m58678e(5, this.f141189g);
            String str6 = this.f141190h;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141186d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: qr_url");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51167rw2 rw22 = objArr[1];
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
                        rw22.BaseRequest = iaVar3;
                    }
                    return 0;
                case 2:
                    rw22.f141186d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rw22.f141187e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    rw22.f141188f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    rw22.f141189g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    rw22.f141190h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
