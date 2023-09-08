package uw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uw1.a */
public class C52623a extends C101820nt3 {

    /* renamed from: d */
    public String f146929d;

    /* renamed from: e */
    public C89349b f146930e;

    /* renamed from: f */
    public int f146931f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52623a)) {
            return false;
        }
        C52623a aVar2 = (C52623a) aVar;
        return C46238a.m51546a(this.BaseRequest, aVar2.BaseRequest) && C46238a.m51546a(this.f146929d, aVar2.f146929d) && C46238a.m51546a(this.f146930e, aVar2.f146930e) && C46238a.m51546a(Integer.valueOf(this.f146931f), Integer.valueOf(aVar2.f146931f));
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
            String str = this.f146929d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C89349b bVar = this.f146930e;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            aVar.mo74318e(4, this.f146931f);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f146929d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C89349b bVar2 = this.f146930e;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(3, bVar2);
            }
            return i2 + C52418a.m58678e(4, this.f146931f);
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
            C52623a aVar4 = objArr[1];
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
                    aVar4.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                aVar4.f146929d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                aVar4.f146930e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                aVar4.f146931f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
