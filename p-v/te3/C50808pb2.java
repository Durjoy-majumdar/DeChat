package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pb2 */
public class C50808pb2 extends C101820nt3 {

    /* renamed from: d */
    public int f139691d;

    /* renamed from: e */
    public String f139692e;

    /* renamed from: f */
    public C51018qv3 f139693f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50808pb2)) {
            return false;
        }
        C50808pb2 pb22 = (C50808pb2) aVar;
        return C46238a.m51546a(this.BaseRequest, pb22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f139691d), Integer.valueOf(pb22.f139691d)) && C46238a.m51546a(this.f139692e, pb22.f139692e) && C46238a.m51546a(this.f139693f, pb22.f139693f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f139693f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f139691d);
                String str = this.f139692e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C51018qv3 qv32 = this.f139693f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f139693f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139691d);
            String str2 = this.f139692e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C51018qv3 qv33 = this.f139693f;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f139693f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: RandomEncryKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50808pb2 pb22 = objArr[1];
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
                    pb22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                pb22.f139691d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                pb22.f139692e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
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
                    pb22.f139693f = qv34;
                }
                return 0;
            }
        }
    }
}
