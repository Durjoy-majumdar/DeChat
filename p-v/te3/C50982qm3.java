package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qm3 */
public class C50982qm3 extends C101820nt3 {

    /* renamed from: d */
    public int f140395d;

    /* renamed from: e */
    public C51018qv3 f140396e;

    /* renamed from: f */
    public C51018qv3 f140397f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50982qm3)) {
            return false;
        }
        C50982qm3 qm32 = (C50982qm3) aVar;
        return C46238a.m51546a(this.BaseRequest, qm32.BaseRequest) && C46238a.m51546a(Integer.valueOf(this.f140395d), Integer.valueOf(qm32.f140395d)) && C46238a.m51546a(this.f140396e, qm32.f140396e) && C46238a.m51546a(this.f140397f, qm32.f140397f);
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
            aVar.mo74318e(2, this.f140395d);
            C51018qv3 qv32 = this.f140396e;
            if (qv32 != null) {
                aVar.mo74322i(3, qv32.computeSize());
                this.f140396e.writeFields(aVar);
            }
            C51018qv3 qv33 = this.f140397f;
            if (qv33 != null) {
                aVar.mo74322i(4, qv33.computeSize());
                this.f140397f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f140395d);
            C51018qv3 qv34 = this.f140396e;
            if (qv34 != null) {
                e += C52418a.m58682i(3, qv34.computeSize());
            }
            C51018qv3 qv35 = this.f140397f;
            return qv35 != null ? e + C52418a.m58682i(4, qv35.computeSize()) : e;
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
            C50982qm3 qm32 = objArr[1];
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
                    qm32.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                qm32.f140395d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51018qv3 qv36 = new C51018qv3();
                    if (bArr2 != null && bArr2.length > 0) {
                        qv36.mo73348f(bArr2);
                    }
                    qm32.f140396e = qv36;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C51018qv3 qv37 = new C51018qv3();
                    if (bArr3 != null && bArr3.length > 0) {
                        qv37.mo73348f(bArr3);
                    }
                    qm32.f140397f = qv37;
                }
                return 0;
            }
        }
    }
}
