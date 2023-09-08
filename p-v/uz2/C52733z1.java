package uz2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: uz2.z1 */
public class C52733z1 extends C47465a {

    /* renamed from: d */
    public C52696l f147311d;

    /* renamed from: e */
    public String f147312e;

    /* renamed from: f */
    public String f147313f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52733z1)) {
            return false;
        }
        C52733z1 z1Var = (C52733z1) aVar;
        return C46238a.m51546a(this.f147311d, z1Var.f147311d) && C46238a.m51546a(this.f147312e, z1Var.f147312e) && C46238a.m51546a(this.f147313f, z1Var.f147313f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C52696l lVar = this.f147311d;
            if (lVar != null) {
                aVar.mo74322i(1, lVar.computeSize());
                this.f147311d.writeFields(aVar);
            }
            String str = this.f147312e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f147313f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            C52696l lVar2 = this.f147311d;
            if (lVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, lVar2.computeSize());
            }
            String str3 = this.f147312e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f147313f;
            return str4 != null ? i2 + C52418a.m58683j(3, str4) : i2;
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
            C52733z1 z1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C52696l lVar3 = new C52696l();
                    if (bArr != null && bArr.length > 0) {
                        lVar3.parseFrom(bArr);
                    }
                    z1Var.f147311d = lVar3;
                }
                return 0;
            } else if (intValue == 2) {
                z1Var.f147312e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                z1Var.f147313f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
