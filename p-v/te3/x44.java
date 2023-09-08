package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class x44 extends C101820nt3 {

    /* renamed from: d */
    public String f144453d;

    /* renamed from: e */
    public LinkedList<Integer> f144454e = new LinkedList<>();

    /* renamed from: f */
    public int f144455f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof x44)) {
            return false;
        }
        x44 x44 = (x44) aVar;
        return C46238a.m51546a(this.BaseRequest, x44.BaseRequest) && C46238a.m51546a(this.f144453d, x44.f144453d) && C46238a.m51546a(this.f144454e, x44.f144454e) && C46238a.m51546a(Integer.valueOf(this.f144455f), Integer.valueOf(x44.f144455f));
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
            String str = this.f144453d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 2, this.f144454e);
            aVar.mo74318e(4, this.f144455f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f144453d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 2, this.f144454e) + C52418a.m58678e(4, this.f144455f);
        } else if (i == 2) {
            this.f144454e.clear();
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
            x44 x44 = objArr[1];
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
                    x44.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                x44.f144453d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                x44.f144454e.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                x44.f144455f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
