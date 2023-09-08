package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.h */
public class C52749h extends C47465a {

    /* renamed from: d */
    public C52750i f147390d;

    /* renamed from: e */
    public C52750i f147391e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52749h)) {
            return false;
        }
        C52749h hVar = (C52749h) aVar;
        return C46238a.m51546a(this.f147390d, hVar.f147390d) && C46238a.m51546a(this.f147391e, hVar.f147391e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52750i iVar = this.f147390d;
            if (iVar != null) {
                aVar.mo74322i(1, iVar.computeSize());
                this.f147390d.writeFields(aVar);
            }
            C52750i iVar2 = this.f147391e;
            if (iVar2 != null) {
                aVar.mo74322i(2, iVar2.computeSize());
                this.f147391e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C52750i iVar3 = this.f147390d;
            if (iVar3 != null) {
                i2 = 0 + C52418a.m58682i(1, iVar3.computeSize());
            }
            C52750i iVar4 = this.f147391e;
            return iVar4 != null ? i2 + C52418a.m58682i(2, iVar4.computeSize()) : i2;
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
            C52749h hVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52750i iVar5 = new C52750i();
                    if (bArr != null && bArr.length > 0) {
                        iVar5.parseFrom(bArr);
                    }
                    hVar.f147390d = iVar5;
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52750i iVar6 = new C52750i();
                    if (bArr2 != null && bArr2.length > 0) {
                        iVar6.parseFrom(bArr2);
                    }
                    hVar.f147391e = iVar6;
                }
                return 0;
            }
        }
    }
}
