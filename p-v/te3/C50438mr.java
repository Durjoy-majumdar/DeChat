package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mr */
public class C50438mr extends C101820nt3 {

    /* renamed from: d */
    public String f138163d;

    /* renamed from: e */
    public int f138164e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50438mr)) {
            return false;
        }
        C50438mr mrVar = (C50438mr) aVar;
        return C46238a.m51546a(this.BaseRequest, mrVar.BaseRequest) && C46238a.m51546a(this.f138163d, mrVar.f138163d) && C46238a.m51546a(Integer.valueOf(this.f138164e), Integer.valueOf(mrVar.f138164e));
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
            String str = this.f138163d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(4, this.f138164e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f138163d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(4, this.f138164e);
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
            C50438mr mrVar = objArr[1];
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
                    mrVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                mrVar.f138163d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                mrVar.f138164e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}