package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.t43 */
public class C51344t43 extends C101820nt3 {

    /* renamed from: d */
    public int f141955d;

    /* renamed from: e */
    public int f141956e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51344t43)) {
            return false;
        }
        C51344t43 t432 = (C51344t43) aVar;
        return C46238a.m51546a(this.BaseRequest, t432.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141955d), Integer.valueOf(t432.f141955d)) && C46238a.m51546a(Integer.valueOf(this.f141956e), Integer.valueOf(t432.f141956e));
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
            aVar.mo74318e(2, this.f141955d);
            aVar.mo74318e(3, this.f141956e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f141955d) + C52418a.m58678e(3, this.f141956e);
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
            C51344t43 t432 = objArr[1];
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
                    t432.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                t432.f141955d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                t432.f141956e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}