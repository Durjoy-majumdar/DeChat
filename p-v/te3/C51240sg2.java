package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sg2 */
public class C51240sg2 extends C101820nt3 {

    /* renamed from: d */
    public int f141493d;

    /* renamed from: e */
    public int f141494e;

    /* renamed from: f */
    public C51018qv3 f141495f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51240sg2)) {
            return false;
        }
        C51240sg2 sg22 = (C51240sg2) aVar;
        return C46238a.m51546a(this.BaseRequest, sg22.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f141493d), Integer.valueOf(sg22.f141493d)) && C46238a.m51546a(Integer.valueOf(this.f141494e), Integer.valueOf(sg22.f141494e)) && C46238a.m51546a(this.f141495f, sg22.f141495f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f141495f != null) {
                C90417ia iaVar = this.BaseRequest;
                if (iaVar != null) {
                    aVar.mo74322i(1, iaVar.computeSize());
                    this.BaseRequest.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f141493d);
                aVar.mo74318e(3, this.f141494e);
                C51018qv3 qv32 = this.f141495f;
                if (qv32 != null) {
                    aVar.mo74322i(4, qv32.computeSize());
                    this.f141495f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141493d) + C52418a.m58678e(3, this.f141494e);
            C51018qv3 qv33 = this.f141495f;
            return qv33 != null ? e + C52418a.m58682i(4, qv33.computeSize()) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f141495f != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: ReqText");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51240sg2 sg22 = objArr[1];
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
                    sg22.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                sg22.f141493d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                sg22.f141494e = aVar3.mo141629g(intValue);
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
                    sg22.f141495f = qv34;
                }
                return 0;
            }
        }
    }
}
