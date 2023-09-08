package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C101820nt3;
import te3.C90417ia;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.o */
public class C52843o extends C101820nt3 {

    /* renamed from: d */
    public String f147610d;

    /* renamed from: e */
    public boolean f147611e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52843o)) {
            return false;
        }
        C52843o oVar = (C52843o) aVar;
        return C46238a.m51546a(this.BaseRequest, oVar.BaseRequest) && C46238a.m51546a(this.f147610d, oVar.f147610d) && C46238a.m51546a(Boolean.valueOf(this.f147611e), Boolean.valueOf(oVar.f147611e));
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
            String str = this.f147610d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f147611e);
            return 0;
        } else if (i == 1) {
            C90417ia iaVar2 = this.BaseRequest;
            if (iaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, iaVar2.computeSize());
            }
            String str2 = this.f147610d;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f147611e);
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
            C52843o oVar = objArr[1];
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
                    oVar.BaseRequest = iaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                oVar.f147610d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                oVar.f147611e = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
