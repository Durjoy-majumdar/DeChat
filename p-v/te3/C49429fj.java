package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fj */
public class C49429fj extends C47465a {

    /* renamed from: d */
    public String f133528d;

    /* renamed from: e */
    public LinkedList<String> f133529e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49429fj)) {
            return false;
        }
        C49429fj fjVar = (C49429fj) aVar;
        return C46238a.m51546a(this.f133528d, fjVar.f133528d) && C46238a.m51546a(this.f133529e, fjVar.f133529e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133528d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f133529e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i == 1) {
            String str2 = this.f133528d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58680g(3, 1, this.f133529e);
        } else if (i == 2) {
            this.f133529e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f133528d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: brand_user_name");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C49429fj fjVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 2) {
                fjVar.f133528d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                fjVar.f133529e.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
