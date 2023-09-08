package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c7 */
public class C64275c7 extends C47465a {

    /* renamed from: d */
    public C64761ux2 f182422d;

    /* renamed from: e */
    public String f182423e;

    /* renamed from: f */
    public String f182424f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64275c7)) {
            return false;
        }
        C64275c7 c7Var = (C64275c7) aVar;
        return C46238a.m51546a(this.f182422d, c7Var.f182422d) && C46238a.m51546a(this.f182423e, c7Var.f182423e) && C46238a.m51546a(this.f182424f, c7Var.f182424f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C64761ux2 ux22 = this.f182422d;
            if (ux22 != null) {
                aVar.mo74322i(1, ux22.computeSize());
                this.f182422d.writeFields(aVar);
            }
            String str = this.f182423e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f182424f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            C64761ux2 ux23 = this.f182422d;
            if (ux23 != null) {
                i2 = 0 + C52418a.m58682i(1, ux23.computeSize());
            }
            String str3 = this.f182423e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            String str4 = this.f182424f;
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
            C64275c7 c7Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C64761ux2 ux24 = new C64761ux2();
                    if (bArr != null && bArr.length > 0) {
                        ux24.parseFrom(bArr);
                    }
                    c7Var.f182422d = ux24;
                }
                return 0;
            } else if (intValue == 2) {
                c7Var.f182423e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                c7Var.f182424f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
