package s71;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s71.b */
public class C48242b extends C48250j {

    /* renamed from: e */
    public C89349b f129244e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48242b)) {
            return false;
        }
        C48242b bVar = (C48242b) aVar;
        return C46238a.m51546a(this.f129267d, bVar.f129267d) && C46238a.m51546a(this.f129244e, bVar.f129244e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C48245e eVar = this.f129267d;
            if (eVar == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f129244e != null) {
                if (eVar != null) {
                    aVar.mo74322i(1, eVar.computeSize());
                    this.f129267d.writeFields(aVar);
                }
                C89349b bVar = this.f129244e;
                if (bVar != null) {
                    aVar.mo74315b(2, bVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesSessionKey");
            }
        } else if (i == 1) {
            C48245e eVar2 = this.f129267d;
            if (eVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, eVar2.computeSize());
            }
            C89349b bVar2 = this.f129244e;
            return bVar2 != null ? i2 + C52418a.m58675b(2, bVar2) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f129267d == null) {
                throw new C52419b("Not all required fields were included: BaseResponse");
            } else if (this.f129244e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesSessionKey");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C48242b bVar3 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48245e eVar3 = new C48245e();
                    if (bArr != null && bArr.length > 0) {
                        eVar3.parseFrom(bArr);
                    }
                    bVar3.f129267d = eVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                bVar3.f129244e = aVar3.mo141626d(intValue);
                return 0;
            }
        }
    }
}
