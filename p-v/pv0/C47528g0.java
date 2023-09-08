package pv0;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: pv0.g0 */
public class C47528g0 extends C47465a {

    /* renamed from: d */
    public String f127516d;

    /* renamed from: e */
    public LinkedList<C47530h0> f127517e = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47528g0)) {
            return false;
        }
        C47528g0 g0Var = (C47528g0) aVar;
        return C46238a.m51546a(this.f127516d, g0Var.f127516d) && C46238a.m51546a(this.f127517e, g0Var.f127517e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127516d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(4, 8, this.f127517e);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i == 1) {
            String str2 = this.f127516d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58680g(4, 8, this.f127517e);
        } else if (i == 2) {
            this.f127517e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127516d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BakChatName");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47528g0 g0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g0Var.f127516d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47530h0 h0Var = new C47530h0();
                    if (bArr != null && bArr.length > 0) {
                        h0Var.parseFrom(bArr);
                    }
                    g0Var.f127517e.add(h0Var);
                }
                return 0;
            }
        }
    }
}
