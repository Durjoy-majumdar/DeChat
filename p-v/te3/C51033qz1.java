package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.qz1 */
public class C51033qz1 extends C47465a {

    /* renamed from: d */
    public String f140621d;

    /* renamed from: e */
    public C51018qv3 f140622e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51033qz1)) {
            return false;
        }
        C51033qz1 qz12 = (C51033qz1) aVar;
        return C46238a.m51546a(this.f140621d, qz12.f140621d) && C46238a.m51546a(this.f140622e, qz12.f140622e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140621d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: ProductID");
            } else if (this.f140622e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                C51018qv3 qv32 = this.f140622e;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f140622e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i == 1) {
            String str2 = this.f140621d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C51018qv3 qv33 = this.f140622e;
            return qv33 != null ? i2 + C52418a.m58682i(2, qv33.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140621d == null) {
                throw new C52419b("Not all required fields were included: ProductID");
            } else if (this.f140622e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: ReqBuf");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51033qz1 qz12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                qz12.f140621d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    qz12.f140622e = qv34;
                }
                return 0;
            }
        }
    }
}
