package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class n44 extends C47465a {

    /* renamed from: d */
    public LinkedList<String> f184433d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f184434e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<Integer> f184435f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<Integer> f184436g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof n44)) {
            return false;
        }
        n44 n44 = (n44) aVar;
        return C46238a.m51546a(this.f184433d, n44.f184433d) && C46238a.m51546a(this.f184434e, n44.f184434e) && C46238a.m51546a(this.f184435f, n44.f184435f) && C46238a.m51546a(this.f184436g, n44.f184436g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 1, this.f184433d);
            aVar.mo74320g(2, 1, this.f184434e);
            aVar.mo74320g(3, 2, this.f184435f);
            aVar.mo74320g(4, 2, this.f184436g);
            return 0;
        } else if (i == 1) {
            return C52418a.m58680g(1, 1, this.f184433d) + 0 + C52418a.m58680g(2, 1, this.f184434e) + C52418a.m58680g(3, 2, this.f184435f) + C52418a.m58680g(4, 2, this.f184436g);
        } else {
            if (i == 2) {
                this.f184433d.clear();
                this.f184434e.clear();
                this.f184435f.clear();
                this.f184436g.clear();
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
                n44 n44 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    n44.f184433d.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 2) {
                    n44.f184434e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 3) {
                    n44.f184435f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                } else if (intValue != 4) {
                    return -1;
                } else {
                    n44.f184436g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                }
            }
        }
    }
}
