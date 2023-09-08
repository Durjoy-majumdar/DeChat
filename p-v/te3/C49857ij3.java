package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ij3 */
public class C49857ij3 extends C101820nt3 {

    /* renamed from: d */
    public int f135416d;

    /* renamed from: e */
    public int f135417e;

    /* renamed from: f */
    public String f135418f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49857ij3)) {
            return false;
        }
        C49857ij3 ij32 = (C49857ij3) aVar;
        return C46238a.m51546a(this.BaseRequest, ij32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135416d), Integer.valueOf(ij32.f135416d)) && C46238a.m51546a(Integer.valueOf(this.f135417e), Integer.valueOf(ij32.f135417e)) && C46238a.m51546a(this.f135418f, ij32.f135418f);
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
            aVar.mo74318e(2, this.f135416d);
            aVar.mo74318e(3, this.f135417e);
            String str = this.f135418f;
            if (str != null) {
                aVar.mo74323j(100, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135416d) + C52418a.m58678e(3, this.f135417e);
            String str2 = this.f135418f;
            return str2 != null ? e + C52418a.m58683j(100, str2) : e;
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
            C49857ij3 ij32 = objArr[1];
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
                    ij32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ij32.f135416d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ij32.f135417e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                ij32.f135418f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
