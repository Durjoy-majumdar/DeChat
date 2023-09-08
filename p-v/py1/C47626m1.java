package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.m1 */
public class C47626m1 extends C47465a {

    /* renamed from: d */
    public LinkedList<C47639o0> f127865d = new LinkedList<>();

    /* renamed from: e */
    public String f127866e;

    /* renamed from: f */
    public String f127867f;

    /* renamed from: g */
    public String f127868g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47626m1)) {
            return false;
        }
        C47626m1 m1Var = (C47626m1) aVar;
        return C46238a.m51546a(this.f127865d, m1Var.f127865d) && C46238a.m51546a(this.f127866e, m1Var.f127866e) && C46238a.m51546a(this.f127867f, m1Var.f127867f) && C46238a.m51546a(this.f127868g, m1Var.f127868g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f127865d);
            String str = this.f127866e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f127867f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f127868g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f127865d) + 0;
            String str4 = this.f127866e;
            if (str4 != null) {
                g += C52418a.m58683j(2, str4);
            }
            String str5 = this.f127867f;
            if (str5 != null) {
                g += C52418a.m58683j(3, str5);
            }
            String str6 = this.f127868g;
            return str6 != null ? g + C52418a.m58683j(4, str6) : g;
        } else if (i == 2) {
            this.f127865d.clear();
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
            C47626m1 m1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47639o0 o0Var = new C47639o0();
                    if (bArr != null && bArr.length > 0) {
                        o0Var.parseFrom(bArr);
                    }
                    m1Var.f127865d.add(o0Var);
                }
                return 0;
            } else if (intValue == 2) {
                m1Var.f127866e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                m1Var.f127867f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                m1Var.f127868g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
