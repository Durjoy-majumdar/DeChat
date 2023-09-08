package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.m3 */
public class C50345m3 extends C47465a {

    /* renamed from: d */
    public String f137797d;

    /* renamed from: e */
    public LinkedList<String> f137798e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50345m3)) {
            return false;
        }
        C50345m3 m3Var = (C50345m3) aVar;
        return C46238a.m51546a(this.f137797d, m3Var.f137797d) && C46238a.m51546a(this.f137798e, m3Var.f137798e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137797d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 1, this.f137798e);
            return 0;
        } else if (i == 1) {
            String str2 = this.f137797d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(2, 1, this.f137798e);
        } else if (i == 2) {
            this.f137798e.clear();
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
            C50345m3 m3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                m3Var.f137797d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                m3Var.f137798e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
