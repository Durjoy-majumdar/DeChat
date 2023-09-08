package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eg3 */
public class C49283eg3 extends C101820nt3 {

    /* renamed from: d */
    public int f132919d;

    /* renamed from: e */
    public String f132920e;

    /* renamed from: f */
    public String f132921f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49283eg3)) {
            return false;
        }
        C49283eg3 eg32 = (C49283eg3) aVar;
        return C46238a.m51546a(this.BaseRequest, eg32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132919d), Integer.valueOf(eg32.f132919d)) && C46238a.m51546a(this.f132920e, eg32.f132920e) && C46238a.m51546a(this.f132921f, eg32.f132921f);
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
            aVar.mo74318e(2, this.f132919d);
            String str = this.f132920e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132921f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132919d);
            String str3 = this.f132920e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f132921f;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C49283eg3 eg32 = objArr[1];
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
                    eg32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                eg32.f132919d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                eg32.f132920e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                eg32.f132921f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
