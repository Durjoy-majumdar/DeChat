package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class di4 extends C101820nt3 {

    /* renamed from: d */
    public int f132358d;

    /* renamed from: e */
    public String f132359e;

    /* renamed from: f */
    public String f132360f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof di4)) {
            return false;
        }
        di4 di4 = (di4) aVar;
        return C46238a.m51546a(this.BaseRequest, di4.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f132358d), Integer.valueOf(di4.f132358d)) && C46238a.m51546a(this.f132359e, di4.f132359e) && C46238a.m51546a(this.f132360f, di4.f132360f);
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
            aVar.mo74318e(2, this.f132358d);
            String str = this.f132359e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f132360f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132358d);
            String str3 = this.f132359e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f132360f;
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
            di4 di4 = objArr[1];
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
                    di4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                di4.f132358d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                di4.f132359e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                di4.f132360f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
