package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.a1 */
public class C47542a1 extends C47465a {

    /* renamed from: d */
    public String f127555d;

    /* renamed from: e */
    public LinkedList<C47601i4> f127556e = new LinkedList<>();

    /* renamed from: f */
    public String f127557f;

    /* renamed from: g */
    public String f127558g;

    /* renamed from: h */
    public String f127559h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47542a1)) {
            return false;
        }
        C47542a1 a1Var = (C47542a1) aVar;
        return C46238a.m51546a(this.f127555d, a1Var.f127555d) && C46238a.m51546a(this.f127556e, a1Var.f127556e) && C46238a.m51546a(this.f127557f, a1Var.f127557f) && C46238a.m51546a(this.f127558g, a1Var.f127558g) && C46238a.m51546a(this.f127559h, a1Var.f127559h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127555d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74320g(2, 8, this.f127556e);
            String str2 = this.f127557f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f127558g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f127559h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f127555d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f127556e);
            String str6 = this.f127557f;
            if (str6 != null) {
                g += C52418a.m58683j(3, str6);
            }
            String str7 = this.f127558g;
            if (str7 != null) {
                g += C52418a.m58683j(4, str7);
            }
            String str8 = this.f127559h;
            return str8 != null ? g + C52418a.m58683j(5, str8) : g;
        } else if (i == 2) {
            this.f127556e.clear();
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
            C47542a1 a1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                a1Var.f127555d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47601i4 i4Var = new C47601i4();
                    if (bArr != null && bArr.length > 0) {
                        i4Var.parseFrom(bArr);
                    }
                    a1Var.f127556e.add(i4Var);
                }
                return 0;
            } else if (intValue == 3) {
                a1Var.f127557f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                a1Var.f127558g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                a1Var.f127559h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
