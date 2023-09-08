package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.j4 */
public class C47608j4 extends C47465a {

    /* renamed from: d */
    public String f127815d;

    /* renamed from: e */
    public LinkedList<C47584g1> f127816e = new LinkedList<>();

    /* renamed from: f */
    public String f127817f;

    /* renamed from: g */
    public String f127818g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47608j4)) {
            return false;
        }
        C47608j4 j4Var = (C47608j4) aVar;
        return C46238a.m51546a(this.f127815d, j4Var.f127815d) && C46238a.m51546a(this.f127816e, j4Var.f127816e) && C46238a.m51546a(this.f127817f, j4Var.f127817f) && C46238a.m51546a(this.f127818g, j4Var.f127818g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127815d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f127816e);
            String str2 = this.f127817f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f127818g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            String str4 = this.f127815d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f127816e);
            String str5 = this.f127817f;
            if (str5 != null) {
                g += C52418a.m58683j(3, str5);
            }
            String str6 = this.f127818g;
            return str6 != null ? g + C52418a.m58683j(4, str6) : g;
        } else if (i == 2) {
            this.f127816e.clear();
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
            C47608j4 j4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j4Var.f127815d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47584g1 g1Var = new C47584g1();
                    if (bArr != null && bArr.length > 0) {
                        g1Var.parseFrom(bArr);
                    }
                    j4Var.f127816e.add(g1Var);
                }
                return 0;
            } else if (intValue == 3) {
                j4Var.f127817f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                j4Var.f127818g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
