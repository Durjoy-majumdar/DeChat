package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class k94 extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f183902d = new LinkedList<>();

    /* renamed from: e */
    public String f183903e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof k94)) {
            return false;
        }
        k94 k94 = (k94) aVar;
        return C46238a.m51546a(this.f183902d, k94.f183902d) && C46238a.m51546a(this.f183903e, k94.f183903e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 3, this.f183902d);
            String str = this.f183903e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 3, this.f183902d) + 0;
            String str2 = this.f183903e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f183902d.clear();
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
            k94 k94 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k94.f183902d.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                k94.f183903e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
