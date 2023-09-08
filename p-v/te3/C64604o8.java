package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.o8 */
public class C64604o8 extends C47465a {

    /* renamed from: d */
    public C51018qv3 f184632d;

    /* renamed from: e */
    public C64306d60 f184633e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64604o8)) {
            return false;
        }
        C64604o8 o8Var = (C64604o8) aVar;
        return C46238a.m51546a(this.f184632d, o8Var.f184632d) && C46238a.m51546a(this.f184633e, o8Var.f184633e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51018qv3 qv32 = this.f184632d;
            if (qv32 != null) {
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f184632d.writeFields(aVar);
                }
                C64306d60 d602 = this.f184633e;
                if (d602 != null) {
                    aVar.mo74322i(3, d602.computeSize());
                    this.f184633e.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AesEncryptKey");
        } else if (i == 1) {
            C51018qv3 qv33 = this.f184632d;
            if (qv33 != null) {
                i2 = 0 + C52418a.m58682i(2, qv33.computeSize());
            }
            C64306d60 d603 = this.f184633e;
            return d603 != null ? i2 + C52418a.m58682i(3, d603.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184632d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AesEncryptKey");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64604o8 o8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51018qv3 qv34 = new C51018qv3();
                    if (bArr != null && bArr.length > 0) {
                        qv34.mo73348f(bArr);
                    }
                    o8Var.f184632d = qv34;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C64306d60 d604 = new C64306d60();
                    if (bArr2 != null && bArr2.length > 0) {
                        d604.parseFrom(bArr2);
                    }
                    o8Var.f184633e = d604;
                }
                return 0;
            }
        }
    }
}
