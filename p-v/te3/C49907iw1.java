package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iw1 */
public class C49907iw1 extends C101820nt3 {

    /* renamed from: d */
    public String f135705d;

    /* renamed from: e */
    public int f135706e;

    /* renamed from: f */
    public String f135707f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49907iw1)) {
            return false;
        }
        C49907iw1 iw12 = (C49907iw1) aVar;
        return C46238a.m51546a(this.BaseRequest, iw12.BaseRequest) && C46238a.m51546a(this.f135705d, iw12.f135705d) && C46238a.m51546a(Integer.valueOf(this.f135706e), Integer.valueOf(iw12.f135706e)) && C46238a.m51546a(this.f135707f, iw12.f135707f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135705d == null) {
                throw new C52419b("Not all required fields were included: corp_id");
            } else if (this.f135707f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                String str = this.f135705d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74318e(3, this.f135706e);
                String str2 = this.f135707f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: data");
            }
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str3 = this.f135705d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f135706e);
            String str4 = this.f135707f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135705d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: corp_id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49907iw1 iw12 = objArr[1];
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
                    iw12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                iw12.f135705d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                iw12.f135706e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                iw12.f135707f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
