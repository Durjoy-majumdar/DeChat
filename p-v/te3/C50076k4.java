package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.k4 */
public class C50076k4 extends C47465a {

    /* renamed from: d */
    public String f136537d;

    /* renamed from: e */
    public LinkedList<ib4> f136538e = new LinkedList<>();

    /* renamed from: f */
    public String f136539f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50076k4)) {
            return false;
        }
        C50076k4 k4Var = (C50076k4) aVar;
        return C46238a.m51546a(this.f136537d, k4Var.f136537d) && C46238a.m51546a(this.f136538e, k4Var.f136538e) && C46238a.m51546a(this.f136539f, k4Var.f136539f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f136537d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f136538e);
            String str2 = this.f136539f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f136537d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f136538e);
            String str4 = this.f136539f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f136538e.clear();
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
            C50076k4 k4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k4Var.f136537d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    ib4 ib4 = new ib4();
                    if (bArr != null && bArr.length > 0) {
                        ib4.parseFrom(bArr);
                    }
                    k4Var.f136538e.add(ib4);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                k4Var.f136539f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
