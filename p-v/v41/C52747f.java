package v41;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: v41.f */
public class C52747f extends C47465a {

    /* renamed from: d */
    public LinkedList<C52757p> f147383d = new LinkedList<>();

    /* renamed from: e */
    public int f147384e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52747f)) {
            return false;
        }
        C52747f fVar = (C52747f) aVar;
        return C46238a.m51546a(this.f147383d, fVar.f147383d) && C46238a.m51546a(Integer.valueOf(this.f147384e), Integer.valueOf(fVar.f147384e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(4, 8, this.f147383d);
            aVar.mo74318e(5, this.f147384e);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(4, 8, this.f147383d) + 0 + C52418a.m58678e(5, this.f147384e);
        } else {
            if (i == 2) {
                this.f147383d.clear();
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
                C52747f fVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 4) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C52757p pVar = new C52757p();
                        if (bArr != null && bArr.length > 0) {
                            pVar.parseFrom(bArr);
                        }
                        fVar.f147383d.add(pVar);
                    }
                    return 0;
                } else if (intValue != 5) {
                    return -1;
                } else {
                    fVar.f147384e = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
