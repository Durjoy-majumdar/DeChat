package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.de0 */
public class C49132de0 extends C47465a {

    /* renamed from: d */
    public LinkedList<Integer> f132264d = new LinkedList<>();

    /* renamed from: e */
    public String f132265e;

    /* renamed from: f */
    public LinkedList<Float> f132266f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49132de0)) {
            return false;
        }
        C49132de0 de02 = (C49132de0) aVar;
        return C46238a.m51546a(this.f132264d, de02.f132264d) && C46238a.m51546a(this.f132265e, de02.f132265e) && C46238a.m51546a(this.f132266f, de02.f132266f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 2, this.f132264d);
            String str = this.f132265e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 5, this.f132266f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 2, this.f132264d) + 0;
            String str2 = this.f132265e;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            return g + C52418a.m58680g(3, 5, this.f132266f);
        } else if (i == 2) {
            this.f132264d.clear();
            this.f132266f.clear();
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
            C49132de0 de02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                de02.f132264d.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                return 0;
            } else if (intValue == 2) {
                de02.f132265e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                de02.f132266f.add(Float.valueOf(aVar3.mo141628f(intValue)));
                return 0;
            }
        }
    }
}
