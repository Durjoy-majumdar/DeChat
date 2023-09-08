package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.r */
public class C52849r extends C49335eu3 {

    /* renamed from: d */
    public C52845p f147622d;

    /* renamed from: e */
    public C52847q f147623e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52849r)) {
            return false;
        }
        C52849r rVar = (C52849r) aVar;
        return C46238a.m51546a(this.BaseResponse, rVar.BaseResponse) && C46238a.m51546a(this.f147622d, rVar.f147622d) && C46238a.m51546a(this.f147623e, rVar.f147623e);
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
            C52845p pVar = this.f147622d;
            if (pVar != null) {
                aVar.mo74322i(2, pVar.computeSize());
                this.f147622d.writeFields(aVar);
            }
            C52847q qVar = this.f147623e;
            if (qVar != null) {
                aVar.mo74322i(3, qVar.computeSize());
                this.f147623e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C52845p pVar2 = this.f147622d;
            if (pVar2 != null) {
                i2 += C52418a.m58682i(2, pVar2.computeSize());
            }
            C52847q qVar2 = this.f147623e;
            return qVar2 != null ? i2 + C52418a.m58682i(3, qVar2.computeSize()) : i2;
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
            C52849r rVar = objArr[1];
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
                    rVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52845p pVar3 = new C52845p();
                    if (bArr2 != null && bArr2.length > 0) {
                        pVar3.parseFrom(bArr2);
                    }
                    rVar.f147622d = pVar3;
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C52847q qVar3 = new C52847q();
                    if (bArr3 != null && bArr3.length > 0) {
                        qVar3.parseFrom(bArr3);
                    }
                    rVar.f147623e = qVar3;
                }
                return 0;
            }
        }
    }
}
