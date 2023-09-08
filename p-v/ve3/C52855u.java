package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.u */
public class C52855u extends C49335eu3 {

    /* renamed from: d */
    public boolean f147632d;

    /* renamed from: e */
    public LinkedList<C52851s> f147633e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52855u)) {
            return false;
        }
        C52855u uVar = (C52855u) aVar;
        return C46238a.m51546a(this.BaseResponse, uVar.BaseResponse) && C46238a.m51546a(Boolean.valueOf(this.f147632d), Boolean.valueOf(uVar.f147632d)) && C46238a.m51546a(this.f147633e, uVar.f147633e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74314a(2, this.f147632d);
            aVar.mo74320g(3, 8, this.f147633e);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58674a(2, this.f147632d) + C52418a.m58680g(3, 8, this.f147633e);
        } else if (i == 2) {
            this.f147633e.clear();
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
            C52855u uVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    uVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                uVar.f147632d = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52851s sVar = new C52851s();
                    if (bArr2 != null && bArr2.length > 0) {
                        sVar.parseFrom(bArr2);
                    }
                    uVar.f147633e.add(sVar);
                }
                return 0;
            }
        }
    }
}
