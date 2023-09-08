package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bd2 */
public class C48842bd2 extends C101820nt3 {

    /* renamed from: d */
    public String f131057d;

    /* renamed from: e */
    public boolean f131058e = false;

    /* renamed from: f */
    public int f131059f = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48842bd2)) {
            return false;
        }
        C48842bd2 bd22 = (C48842bd2) aVar;
        return C46238a.m51546a(this.BaseRequest, bd22.BaseRequest) && C46238a.m51546a(this.f131057d, bd22.f131057d) && C46238a.m51546a(Boolean.valueOf(this.f131058e), Boolean.valueOf(bd22.f131058e)) && C46238a.m51546a(Integer.valueOf(this.f131059f), Integer.valueOf(bd22.f131059f));
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
            String str = this.f131057d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f131058e);
            aVar.mo74318e(4, this.f131059f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131057d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f131058e) + C52418a.m58678e(4, this.f131059f);
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
            C48842bd2 bd22 = objArr[1];
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
                    bd22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                bd22.f131057d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                bd22.f131058e = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bd22.f131059f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
