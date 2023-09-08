package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.i51 */
public class C49801i51 extends C47465a {

    /* renamed from: d */
    public int f135109d;

    /* renamed from: e */
    public LinkedList<String> f135110e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f135111f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<String> f135112g = new LinkedList<>();

    /* renamed from: h */
    public int f135113h = 0;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49801i51)) {
            return false;
        }
        C49801i51 i512 = (C49801i51) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135109d), Integer.valueOf(i512.f135109d)) && C46238a.m51546a(this.f135110e, i512.f135110e) && C46238a.m51546a(this.f135111f, i512.f135111f) && C46238a.m51546a(this.f135112g, i512.f135112g) && C46238a.m51546a(Integer.valueOf(this.f135113h), Integer.valueOf(i512.f135113h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f135109d);
            aVar.mo74320g(2, 1, this.f135110e);
            aVar.mo74320g(3, 1, this.f135111f);
            aVar.mo74320g(5, 1, this.f135112g);
            aVar.mo74318e(6, this.f135113h);
            return 0;
        } else if (i == 1) {
            return C52418a.m58678e(1, this.f135109d) + 0 + C52418a.m58680g(2, 1, this.f135110e) + C52418a.m58680g(3, 1, this.f135111f) + C52418a.m58680g(5, 1, this.f135112g) + C52418a.m58678e(6, this.f135113h);
        } else {
            if (i == 2) {
                this.f135110e.clear();
                this.f135111f.clear();
                this.f135112g.clear();
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
                C49801i51 i512 = objArr[1];
                int intValue = objArr[2].intValue();
                if (intValue == 1) {
                    i512.f135109d = aVar3.mo141629g(intValue);
                    return 0;
                } else if (intValue == 2) {
                    i512.f135110e.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 3) {
                    i512.f135111f.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue == 5) {
                    i512.f135112g.add(aVar3.mo141633k(intValue));
                    return 0;
                } else if (intValue != 6) {
                    return -1;
                } else {
                    i512.f135113h = aVar3.mo141629g(intValue);
                    return 0;
                }
            }
        }
    }
}
