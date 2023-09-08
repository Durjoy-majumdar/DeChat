package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fu0 */
public class C49471fu0 extends C47465a {

    /* renamed from: d */
    public C51559uk1 f133685d;

    /* renamed from: e */
    public int f133686e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49471fu0)) {
            return false;
        }
        C49471fu0 fu02 = (C49471fu0) aVar;
        return C46238a.m51546a(this.f133685d, fu02.f133685d) && C46238a.m51546a(Integer.valueOf(this.f133686e), Integer.valueOf(fu02.f133686e));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C51559uk1 uk12 = this.f133685d;
            if (uk12 != null) {
                aVar.mo74322i(101, uk12.computeSize());
                this.f133685d.writeFields(aVar);
            }
            aVar.mo74318e(102, this.f133686e);
            return 0;
        } else if (i == 1) {
            C51559uk1 uk13 = this.f133685d;
            if (uk13 != null) {
                i2 = 0 + C52418a.m58682i(101, uk13.computeSize());
            }
            return i2 + C52418a.m58678e(102, this.f133686e);
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
            C49471fu0 fu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 101) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C51559uk1 uk14 = new C51559uk1();
                    if (bArr != null && bArr.length > 0) {
                        uk14.parseFrom(bArr);
                    }
                    fu02.f133685d = uk14;
                }
                return 0;
            } else if (intValue != 102) {
                return -1;
            } else {
                fu02.f133686e = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
