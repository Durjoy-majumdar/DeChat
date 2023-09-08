package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.sg0 */
public class C51238sg0 extends C47465a {

    /* renamed from: d */
    public z74 f141490d;

    /* renamed from: e */
    public String f141491e;

    /* renamed from: f */
    public C51655v7 f141492f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51238sg0)) {
            return false;
        }
        C51238sg0 sg02 = (C51238sg0) aVar;
        return C46238a.m51546a(this.f141490d, sg02.f141490d) && C46238a.m51546a(this.f141491e, sg02.f141491e) && C46238a.m51546a(this.f141492f, sg02.f141492f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            z74 z74 = this.f141490d;
            if (z74 != null) {
                aVar.mo74322i(1, z74.computeSize());
                this.f141490d.writeFields(aVar);
            }
            String str = this.f141491e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            C51655v7 v7Var = this.f141492f;
            if (v7Var != null) {
                aVar.mo74322i(3, v7Var.computeSize());
                this.f141492f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            z74 z742 = this.f141490d;
            if (z742 != null) {
                i2 = 0 + C52418a.m58682i(1, z742.computeSize());
            }
            String str2 = this.f141491e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            C51655v7 v7Var2 = this.f141492f;
            return v7Var2 != null ? i2 + C52418a.m58682i(3, v7Var2.computeSize()) : i2;
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
            C51238sg0 sg02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    z74 z743 = new z74();
                    if (bArr != null && bArr.length > 0) {
                        z743.parseFrom(bArr);
                    }
                    sg02.f141490d = z743;
                }
                return 0;
            } else if (intValue == 2) {
                sg02.f141491e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51655v7 v7Var3 = new C51655v7();
                    if (bArr2 != null && bArr2.length > 0) {
                        v7Var3.parseFrom(bArr2);
                    }
                    sg02.f141492f = v7Var3;
                }
                return 0;
            }
        }
    }
}
