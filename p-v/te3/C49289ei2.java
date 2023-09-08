package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ei2 */
public class C49289ei2 extends C101820nt3 {

    /* renamed from: d */
    public String f132939d;

    /* renamed from: e */
    public String f132940e;

    /* renamed from: f */
    public LinkedList<String> f132941f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49289ei2)) {
            return false;
        }
        C49289ei2 ei22 = (C49289ei2) aVar;
        return C46238a.m51546a(this.BaseRequest, ei22.BaseRequest) && C46238a.m51546a(this.f132939d, ei22.f132939d) && C46238a.m51546a(this.f132940e, ei22.f132940e) && C46238a.m51546a(this.f132941f, ei22.f132941f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f132939d == null) {
                throw new C52419b("Not all required fields were included: corp_id");
            } else if (this.f132940e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f132939d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f132940e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74320g(4, 1, this.f132941f);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: bizchat_name");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f132939d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f132940e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            return i2 + C52418a.m58680g(4, 1, this.f132941f);
        } else if (i == 2) {
            this.f132941f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f132939d == null) {
                throw new C52419b("Not all required fields were included: corp_id");
            } else if (this.f132940e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: bizchat_name");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49289ei2 ei22 = objArr[1];
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
                    ei22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ei22.f132939d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                ei22.f132940e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ei22.f132941f.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
