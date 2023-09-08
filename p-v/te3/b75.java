package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class b75 extends C101820nt3 {

    /* renamed from: d */
    public String f131002d;

    /* renamed from: e */
    public int f131003e;

    /* renamed from: f */
    public int f131004f;

    /* renamed from: g */
    public int f131005g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof b75)) {
            return false;
        }
        b75 b75 = (b75) aVar;
        return C46238a.m51546a(this.BaseRequest, b75.BaseRequest) && C46238a.m51546a(this.f131002d, b75.f131002d) && C46238a.m51546a(Integer.valueOf(this.f131003e), Integer.valueOf(b75.f131003e)) && C46238a.m51546a(Integer.valueOf(this.f131004f), Integer.valueOf(b75.f131004f)) && C46238a.m51546a(Integer.valueOf(this.f131005g), Integer.valueOf(b75.f131005g));
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
            String str = this.f131002d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f131003e);
            aVar.mo74318e(4, this.f131004f);
            aVar.mo74318e(5, this.f131005g);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f131002d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58678e(3, this.f131003e) + C52418a.m58678e(4, this.f131004f) + C52418a.m58678e(5, this.f131005g);
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
            b75 b75 = objArr[1];
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
                    b75.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                b75.f131002d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                b75.f131003e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                b75.f131004f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                b75.f131005g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
