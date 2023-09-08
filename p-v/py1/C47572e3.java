package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.e3 */
public class C47572e3 extends C47465a {

    /* renamed from: d */
    public String f127669d;

    /* renamed from: e */
    public String f127670e;

    /* renamed from: f */
    public LinkedList<String> f127671f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47572e3)) {
            return false;
        }
        C47572e3 e3Var = (C47572e3) aVar;
        return C46238a.m51546a(this.f127669d, e3Var.f127669d) && C46238a.m51546a(this.f127670e, e3Var.f127670e) && C46238a.m51546a(this.f127671f, e3Var.f127671f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127669d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f127670e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 1, this.f127671f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f127669d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f127670e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 1, this.f127671f);
        } else if (i == 2) {
            this.f127671f.clear();
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
            C47572e3 e3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                e3Var.f127669d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                e3Var.f127670e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                e3Var.f127671f.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
