package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j02 */
public class C49925j02 extends C101820nt3 {

    /* renamed from: d */
    public int f135796d;

    /* renamed from: e */
    public String f135797e;

    /* renamed from: f */
    public String f135798f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49925j02)) {
            return false;
        }
        C49925j02 j022 = (C49925j02) aVar;
        return C46238a.m51546a(this.BaseRequest, j022.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f135796d), Integer.valueOf(j022.f135796d)) && C46238a.m51546a(this.f135797e, j022.f135797e) && C46238a.m51546a(this.f135798f, j022.f135798f);
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
            aVar.mo74318e(2, this.f135796d);
            String str = this.f135797e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135798f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f135796d);
            String str3 = this.f135797e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f135798f;
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
            C49925j02 j022 = objArr[1];
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
                    j022.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                j022.f135796d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                j022.f135797e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                j022.f135798f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
