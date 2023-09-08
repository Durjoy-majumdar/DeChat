package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n8 */
public class C64572n8 extends C47465a {

    /* renamed from: d */
    public C64604o8 f184444d;

    /* renamed from: e */
    public C118442l8 f184445e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64572n8)) {
            return false;
        }
        C64572n8 n8Var = (C64572n8) aVar;
        return C46238a.m51546a(this.f184444d, n8Var.f184444d) && C46238a.m51546a(this.f184445e, n8Var.f184445e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64604o8 o8Var = this.f184444d;
            if (o8Var == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f184445e != null) {
                if (o8Var != null) {
                    aVar.mo74322i(1, o8Var.computeSize());
                    this.f184444d.writeFields(aVar);
                }
                C118442l8 l8Var = this.f184445e;
                if (l8Var != null) {
                    aVar.mo74322i(2, l8Var.computeSize());
                    this.f184445e.writeFields(aVar);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i == 1) {
            C64604o8 o8Var2 = this.f184444d;
            if (o8Var2 != null) {
                i2 = 0 + C52418a.m58682i(1, o8Var2.computeSize());
            }
            C118442l8 l8Var2 = this.f184445e;
            return l8Var2 != null ? i2 + C52418a.m58682i(2, l8Var2.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f184444d == null) {
                throw new C52419b("Not all required fields were included: RsaReqData");
            } else if (this.f184445e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: AesReqData");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64572n8 n8Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64604o8 o8Var3 = new C64604o8();
                    if (bArr != null && bArr.length > 0) {
                        o8Var3.parseFrom(bArr);
                    }
                    n8Var.f184444d = o8Var3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C118442l8 l8Var3 = new C118442l8();
                    if (bArr2 != null && bArr2.length > 0) {
                        l8Var3.parseFrom(bArr2);
                    }
                    n8Var.f184445e = l8Var3;
                }
                return 0;
            }
        }
    }
}
