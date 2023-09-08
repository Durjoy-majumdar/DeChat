package ve3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ve3.i */
public class C52833i extends C47465a {

    /* renamed from: d */
    public String f147588d;

    /* renamed from: e */
    public C65684l0 f147589e;

    /* renamed from: f */
    public C65685n0 f147590f;

    /* renamed from: g */
    public long f147591g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52833i)) {
            return false;
        }
        C52833i iVar = (C52833i) aVar;
        return C46238a.m51546a(this.f147588d, iVar.f147588d) && C46238a.m51546a(this.f147589e, iVar.f147589e) && C46238a.m51546a(this.f147590f, iVar.f147590f) && C46238a.m51546a(Long.valueOf(this.f147591g), Long.valueOf(iVar.f147591g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f147588d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C65684l0 l0Var = this.f147589e;
            if (l0Var != null) {
                aVar.mo74322i(2, l0Var.computeSize());
                this.f147589e.writeFields(aVar);
            }
            C65685n0 n0Var = this.f147590f;
            if (n0Var != null) {
                aVar.mo74322i(3, n0Var.computeSize());
                this.f147590f.writeFields(aVar);
            }
            aVar.mo74321h(4, this.f147591g);
            return 0;
        } else if (i == 1) {
            String str2 = this.f147588d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C65684l0 l0Var2 = this.f147589e;
            if (l0Var2 != null) {
                i2 += C52418a.m58682i(2, l0Var2.computeSize());
            }
            C65685n0 n0Var2 = this.f147590f;
            if (n0Var2 != null) {
                i2 += C52418a.m58682i(3, n0Var2.computeSize());
            }
            return i2 + C52418a.m58681h(4, this.f147591g);
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
            C52833i iVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iVar.f147588d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C65684l0 l0Var3 = new C65684l0();
                    if (bArr != null && bArr.length > 0) {
                        l0Var3.parseFrom(bArr);
                    }
                    iVar.f147589e = l0Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C65685n0 n0Var3 = new C65685n0();
                    if (bArr2 != null && bArr2.length > 0) {
                        n0Var3.parseFrom(bArr2);
                    }
                    iVar.f147590f = n0Var3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                iVar.f147591g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
