package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.w3 */
public class C47696w3 extends C47465a {

    /* renamed from: d */
    public String f128116d;

    /* renamed from: e */
    public C47621l3 f128117e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47696w3)) {
            return false;
        }
        C47696w3 w3Var = (C47696w3) aVar;
        return C46238a.m51546a(this.f128116d, w3Var.f128116d) && C46238a.m51546a(this.f128117e, w3Var.f128117e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128116d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            C47621l3 l3Var = this.f128117e;
            if (l3Var != null) {
                aVar.mo74322i(2, l3Var.computeSize());
                this.f128117e.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            String str2 = this.f128116d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            C47621l3 l3Var2 = this.f128117e;
            return l3Var2 != null ? i2 + C52418a.m58682i(2, l3Var2.computeSize()) : i2;
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
            C47696w3 w3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                w3Var.f128116d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47621l3 l3Var3 = new C47621l3();
                    if (bArr != null && bArr.length > 0) {
                        l3Var3.parseFrom(bArr);
                    }
                    w3Var.f128117e = l3Var3;
                }
                return 0;
            }
        }
    }
}
