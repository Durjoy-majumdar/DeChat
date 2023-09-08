package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;

/* renamed from: te3.nl */
public class C50560nl extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f138654d = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        return aVar != null && (aVar instanceof C50560nl) && C46238a.m51546a(this.f138654d, ((C50560nl) aVar).f138654d);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            objArr[0].mo74320g(1, 2, this.f138654d);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 2, this.f138654d) + 0;
        } else {
            if (i == 2) {
                this.f138654d.clear();
                C102122a aVar = new C102122a(objArr[0], C47465a.unknownTagHandler);
                for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar)) {
                    if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                        aVar.mo141624b();
                    }
                }
                return 0;
            } else if (i != 3) {
                return -1;
            } else {
                C102122a aVar2 = objArr[0];
                C50560nl nlVar = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue != 1) {
                    return -1;
                }
                nlVar.f138654d.add(Integer.valueOf(aVar2.mo141629g(intValue)));
                return 0;
            }
        }
    }
}
