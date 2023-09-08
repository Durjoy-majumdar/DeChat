package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a83 */
public class C48679a83 extends C101820nt3 {

    /* renamed from: d */
    public int f130367d;

    /* renamed from: e */
    public C51018qv3 f130368e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48679a83)) {
            return false;
        }
        C48679a83 a832 = (C48679a83) aVar;
        return C46238a.m51546a(this.BaseRequest, a832.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f130367d), Integer.valueOf(a832.f130367d)) && C46238a.m51546a(this.f130368e, a832.f130368e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f130368e != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f130367d);
                C51018qv3 qv32 = this.f130368e;
                if (qv32 != null) {
                    aVar.mo74322i(3, qv32.computeSize());
                    this.f130368e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: key_buf");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130367d);
            C51018qv3 qv33 = this.f130368e;
            return qv33 != null ? e + C52418a.m58682i(3, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f130368e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: key_buf");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48679a83 a832 = objArr[1];
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
                    a832.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                a832.f130367d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv34.mo73348f(bArr2);
                    }
                    a832.f130368e = qv34;
                }
                return 0;
            }
        }
    }
}
