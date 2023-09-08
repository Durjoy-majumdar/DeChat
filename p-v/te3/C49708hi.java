package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.hi */
public class C49708hi extends C101820nt3 {

    /* renamed from: d */
    public String f134660d;

    /* renamed from: e */
    public int f134661e;

    /* renamed from: f */
    public C89349b f134662f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49708hi)) {
            return false;
        }
        C49708hi hiVar = (C49708hi) aVar;
        return C46238a.m51546a(this.BaseRequest, hiVar.BaseRequest) && C46238a.m51546a(this.f134660d, hiVar.f134660d) && C46238a.m51546a(Integer.valueOf(this.f134661e), Integer.valueOf(hiVar.f134661e)) && C46238a.m51546a(this.f134662f, hiVar.f134662f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f134660d != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f134660d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f134661e);
                C89349b bVar = this.f134662f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: main_brand_user_name");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f134660d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            int e = i2 + C52418a.m58678e(3, this.f134661e);
            C89349b bVar2 = this.f134662f;
            return bVar2 != null ? e + C52418a.m58675b(4, bVar2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f134660d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: main_brand_user_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49708hi hiVar = objArr[1];
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
                    hiVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                hiVar.f134660d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                hiVar.f134661e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                hiVar.f134662f = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
