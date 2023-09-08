package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.p5 */
public class C47651p5 extends C47465a {

    /* renamed from: d */
    public boolean f127930d;

    /* renamed from: e */
    public LinkedList<C47566d4> f127931e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C47566d4> f127932f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47651p5)) {
            return false;
        }
        C47651p5 p5Var = (C47651p5) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f127930d), Boolean.valueOf(p5Var.f127930d)) && C46238a.m51546a(this.f127931e, p5Var.f127931e) && C46238a.m51546a(this.f127932f, p5Var.f127932f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f127930d);
            aVar.mo74320g(3, 8, this.f127931e);
            aVar.mo74320g(4, 8, this.f127932f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58674a(1, this.f127930d) + 0 + C52418a.m58680g(3, 8, this.f127931e) + C52418a.m58680g(4, 8, this.f127932f);
        } else {
            if (i == 2) {
                this.f127931e.clear();
                this.f127932f.clear();
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
                C47651p5 p5Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    p5Var.f127930d = aVar3.mo141625c(intValue);
                    return 0;
                } else if (intValue == 3) {
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        byte[] bArr = j.get(i2);
                        C47566d4 d4Var = new C47566d4();
                        if (bArr != null && bArr.length > 0) {
                            d4Var.parseFrom(bArr);
                        }
                        p5Var.f127931e.add(d4Var);
                    }
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        byte[] bArr2 = j2.get(i3);
                        C47566d4 d4Var2 = new C47566d4();
                        if (bArr2 != null && bArr2.length > 0) {
                            d4Var2.parseFrom(bArr2);
                        }
                        p5Var.f127932f.add(d4Var2);
                    }
                    return 0;
                }
            }
        }
    }
}
