package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zz1 */
public class C52330zz1 extends C101820nt3 {

    /* renamed from: d */
    public LinkedList<Integer> f146291d = new LinkedList<>();

    /* renamed from: e */
    public String f146292e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52330zz1)) {
            return false;
        }
        C52330zz1 zz12 = (C52330zz1) aVar;
        return C46238a.m51546a(this.BaseRequest, zz12.BaseRequest) && C46238a.m51546a(this.f146291d, zz12.f146291d) && C46238a.m51546a(this.f146292e, zz12.f146292e);
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
            aVar.mo74320g(2, 2, this.f146291d);
            String str = this.f146292e;
            if (str != null) {
                aVar.mo74323j(101, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 2, this.f146291d);
            String str2 = this.f146292e;
            return str2 != null ? g + C52418a.m58683j(101, str2) : g;
        } else if (i == 2) {
            this.f146291d.clear();
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
            C52330zz1 zz12 = objArr[1];
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
                    zz12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                zz12.f146291d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue != 101) {
                return -1;
            } else {
                zz12.f146292e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
