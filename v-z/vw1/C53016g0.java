package vw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vw1.g0 */
public class C53016g0 extends C47465a {

    /* renamed from: d */
    public C53028s f147979d;

    /* renamed from: e */
    public C53028s f147980e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C53016g0)) {
            return false;
        }
        C53016g0 g0Var = (C53016g0) aVar;
        return C46238a.m51546a(this.f147979d, g0Var.f147979d) && C46238a.m51546a(this.f147980e, g0Var.f147980e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C53028s sVar = this.f147979d;
            if (sVar != null) {
                aVar.mo74322i(1, sVar.computeSize());
                this.f147979d.writeFields(aVar);
            }
            C53028s sVar2 = this.f147980e;
            if (sVar2 != null) {
                aVar.mo74322i(2, sVar2.computeSize());
                this.f147980e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C53028s sVar3 = this.f147979d;
            if (sVar3 != null) {
                i2 = 0 + C52418a.m58682i(1, sVar3.computeSize());
            }
            C53028s sVar4 = this.f147980e;
            return sVar4 != null ? i2 + C52418a.m58682i(2, sVar4.computeSize()) : i2;
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
            C53016g0 g0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C53028s sVar5 = new C53028s();
                    if (bArr != null && bArr.length > 0) {
                        sVar5.parseFrom(bArr);
                    }
                    g0Var.f147979d = sVar5;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C53028s sVar6 = new C53028s();
                    if (bArr2 != null && bArr2.length > 0) {
                        sVar6.parseFrom(bArr2);
                    }
                    g0Var.f147980e = sVar6;
                }
                return 0;
            }
        }
    }
}
