package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cz1 */
public class C49069cz1 extends C101820nt3 {

    /* renamed from: d */
    public long f132039d;

    /* renamed from: e */
    public int f132040e;

    /* renamed from: f */
    public String f132041f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49069cz1)) {
            return false;
        }
        C49069cz1 cz12 = (C49069cz1) aVar;
        return C46238a.m51546a(this.BaseRequest, cz12.BaseRequest) && C46238a.m51546a(Long.valueOf(this.f132039d), Long.valueOf(cz12.f132039d)) && C46238a.m51546a(Integer.valueOf(this.f132040e), Integer.valueOf(cz12.f132040e)) && C46238a.m51546a(this.f132041f, cz12.f132041f);
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
            aVar.mo74321h(2, this.f132039d);
            aVar.mo74318e(3, this.f132040e);
            String str = this.f132041f;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int h = i2 + C52418a.m58681h(2, this.f132039d) + C52418a.m58678e(3, this.f132040e);
            String str2 = this.f132041f;
            return str2 != null ? h + C52418a.m58683j(4, str2) : h;
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
            C49069cz1 cz12 = objArr[1];
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
                    cz12.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                cz12.f132039d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                cz12.f132040e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                cz12.f132041f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
