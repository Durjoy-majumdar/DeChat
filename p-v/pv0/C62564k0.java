package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.k0 */
public class C62564k0 extends C47465a {

    /* renamed from: d */
    public LinkedList<Long> f177705d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<String> f177706e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<String> f177707f = new LinkedList<>();

    /* renamed from: g */
    public String f177708g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C62564k0)) {
            return false;
        }
        C62564k0 k0Var = (C62564k0) aVar;
        return C46238a.m51546a(this.f177705d, k0Var.f177705d) && C46238a.m51546a(this.f177706e, k0Var.f177706e) && C46238a.m51546a(this.f177707f, k0Var.f177707f) && C46238a.m51546a(this.f177708g, k0Var.f177708g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f177708g != null) {
                aVar.mo74320g(1, 3, this.f177705d);
                aVar.mo74320g(2, 1, this.f177706e);
                aVar.mo74320g(3, 1, this.f177707f);
                String str = this.f177708g;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 3, this.f177705d) + 0 + C52418a.m58680g(2, 1, this.f177706e) + C52418a.m58680g(3, 1, this.f177707f);
            String str2 = this.f177708g;
            return str2 != null ? g + C52418a.m58683j(4, str2) : g;
        } else if (i == 2) {
            this.f177705d.clear();
            this.f177706e.clear();
            this.f177707f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f177708g != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C62564k0 k0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                k0Var.f177705d.add(Long.valueOf(aVar3.mo141631i(intValue)));
                return 0;
            } else if (intValue == 2) {
                k0Var.f177706e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                k0Var.f177707f.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                k0Var.f177708g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
