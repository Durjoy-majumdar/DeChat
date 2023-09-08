package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.l0 */
public class C62566l0 extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f177711d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f177712e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f177713f = new LinkedList<>();

    /* renamed from: g */
    public String f177714g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62566l0)) {
            return false;
        }
        C62566l0 l0Var = (C62566l0) aVar;
        return C46238a.m51546a(this.f177711d, l0Var.f177711d) && C46238a.m51546a(this.f177712e, l0Var.f177712e) && C46238a.m51546a(this.f177713f, l0Var.f177713f) && C46238a.m51546a(this.f177714g, l0Var.f177714g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f177714g != null) {
                aVar.mo74320g(1, 3, this.f177711d);
                aVar.mo74320g(2, 1, this.f177712e);
                aVar.mo74320g(3, 1, this.f177713f);
                String str = this.f177714g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 3, this.f177711d) + 0 + C52418a.m58680g(2, 1, this.f177712e) + C52418a.m58680g(3, 1, this.f177713f);
            String str2 = this.f177714g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f177711d.clear();
            this.f177712e.clear();
            this.f177713f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177714g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62566l0 l0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l0Var.f177711d.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            } else if (intValue == 2) {
                l0Var.f177712e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                l0Var.f177713f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l0Var.f177714g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
