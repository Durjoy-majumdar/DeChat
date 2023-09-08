package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sm */
public class C51265sm extends C101820nt3 {

    /* renamed from: d */
    public int f141598d;

    /* renamed from: e */
    public int f141599e;

    /* renamed from: f */
    public String f141600f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51265sm)) {
            return false;
        }
        C51265sm smVar = (C51265sm) aVar;
        return C46238a.m51546a(this.BaseRequest, smVar.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141598d), Integer.valueOf(smVar.f141598d)) && C46238a.m51546a(Integer.valueOf(this.f141599e), Integer.valueOf(smVar.f141599e)) && C46238a.m51546a(this.f141600f, smVar.f141600f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141600f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f141598d);
                aVar.mo74318e(3, this.f141599e);
                String str = this.f141600f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqKey");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141598d) + C52418a.m58678e(3, this.f141599e);
            String str2 = this.f141600f;
            return str2 != null ? e + C52418a.m58683j(4, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141600f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51265sm smVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    smVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                smVar.f141598d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                smVar.f141599e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                smVar.f141600f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
