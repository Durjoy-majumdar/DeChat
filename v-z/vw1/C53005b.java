package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.b */
public class C53005b extends C101820nt3 {

    /* renamed from: d */
    public C53003a f147919d;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53005b)) {
            return false;
        }
        C53005b bVar = (C53005b) aVar;
        return C46238a.m51546a(this.BaseRequest, bVar.BaseRequest) && C46238a.m51546a(this.f147919d, bVar.f147919d);
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
            C53003a aVar2 = this.f147919d;
            if (aVar2 != null) {
                aVar.mo74322i(2, aVar2.computeSize());
                this.f147919d.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            C53003a aVar3 = this.f147919d;
            return aVar3 != null ? i2 + C52418a.m58682i(2, aVar3.computeSize()) : i2;
        } else if (i == 2) {
            C102122a aVar4 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar4); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar4)) {
                if (!super.populateBuilderWithField(aVar4, this, nextFieldNumber)) {
                    aVar4.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar5 = objArr[0];
            C53005b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar5.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C90417ia iaVar3 = new C90417ia();
                    if (bArr != null && bArr.length > 0) {
                        iaVar3.parseFrom(bArr);
                    }
                    bVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar5.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53003a aVar6 = new C53003a();
                    if (bArr2 != null && bArr2.length > 0) {
                        aVar6.parseFrom(bArr2);
                    }
                    bVar.f147919d = aVar6;
                }
                return 0;
            }
        }
    }
}
