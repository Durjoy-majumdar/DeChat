package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bb1 */
public class C48833bb1 extends C47465a {

    /* renamed from: d */
    public String f131034d;

    /* renamed from: e */
    public LinkedList<C48688ab1> f131035e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48833bb1)) {
            return false;
        }
        C48833bb1 bb12 = (C48833bb1) aVar;
        return C46238a.m51546a(this.f131034d, bb12.f131034d) && C46238a.m51546a(this.f131035e, bb12.f131035e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131034d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f131035e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131034d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 8, this.f131035e);
        } else if (i == 2) {
            this.f131035e.clear();
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
            C48833bb1 bb12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bb12.f131034d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C48688ab1 ab12 = new C48688ab1();
                    if (bArr != null && bArr.length > 0) {
                        ab12.parseFrom(bArr);
                    }
                    bb12.f131035e.add(ab12);
                }
                return 0;
            }
        }
    }
}
