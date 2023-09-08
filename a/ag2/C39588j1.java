package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.j1 */
public class C39588j1 extends C47465a {

    /* renamed from: d */
    public long f106267d;

    /* renamed from: e */
    public LinkedList<String> f106268e = new LinkedList<>();

    /* renamed from: f */
    public long f106269f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39588j1)) {
            return false;
        }
        C39588j1 j1Var = (C39588j1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f106267d), Long.valueOf(j1Var.f106267d)) && C46238a.m51546a(this.f106268e, j1Var.f106268e) && C46238a.m51546a(Long.valueOf(this.f106269f), Long.valueOf(j1Var.f106269f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f106267d);
            aVar.mo74320g(2, 1, this.f106268e);
            aVar.mo74321h(3, this.f106269f);
            return 0;
        } else if (i == 1) {
            return C52418a.m58681h(1, this.f106267d) + 0 + C52418a.m58680g(2, 1, this.f106268e) + C52418a.m58681h(3, this.f106269f);
        } else {
            if (i == 2) {
                this.f106268e.clear();
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
                C39588j1 j1Var = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    j1Var.f106267d = aVar3.mo141631i(intValue);
                    return 0;
                } else if (intValue == 2) {
                    j1Var.f106268e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 3) {
                    return -1;
                } else {
                    j1Var.f106269f = aVar3.mo141631i(intValue);
                    return 0;
                }
            }
        }
    }
}
