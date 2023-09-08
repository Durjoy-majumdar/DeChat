package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.q5 */
public class C50915q5 extends C47465a {

    /* renamed from: d */
    public int f140141d;

    /* renamed from: e */
    public LinkedList<C49111d83> f140142e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C48971c83> f140143f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50915q5)) {
            return false;
        }
        C50915q5 q5Var = (C50915q5) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f140141d), Integer.valueOf(q5Var.f140141d)) && C46238a.m51546a(this.f140142e, q5Var.f140142e) && C46238a.m51546a(this.f140143f, q5Var.f140143f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f140141d);
            aVar.mo74320g(2, 8, this.f140142e);
            aVar.mo74320g(3, 8, this.f140143f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f140141d) + 0 + C52418a.m58680g(2, 8, this.f140142e) + C52418a.m58680g(3, 8, this.f140143f);
        } else {
            if (i == 2) {
                this.f140142e.clear();
                this.f140143f.clear();
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
                C50915q5 q5Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    q5Var.f140141d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C49111d83 d832 = new C49111d83();
                        if (bArr != null && bArr.length > 0) {
                            d832.parseFrom(bArr);
                        }
                        q5Var.f140142e.add(d832);
                    }
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C48971c83 c832 = new C48971c83();
                        if (bArr2 != null && bArr2.length > 0) {
                            c832.parseFrom(bArr2);
                        }
                        q5Var.f140143f.add(c832);
                    }
                    return 0;
                }
            }
        }
    }
}
