package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.t2 */
public class C47676t2 extends C47465a {

    /* renamed from: d */
    public String f128022d;

    /* renamed from: e */
    public LinkedList<C47683u2> f128023e = new LinkedList<>();

    /* renamed from: f */
    public String f128024f;

    /* renamed from: g */
    public String f128025g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47676t2)) {
            return false;
        }
        C47676t2 t2Var = (C47676t2) aVar;
        return C46238a.m51546a(this.f128022d, t2Var.f128022d) && C46238a.m51546a(this.f128023e, t2Var.f128023e) && C46238a.m51546a(this.f128024f, t2Var.f128024f) && C46238a.m51546a(this.f128025g, t2Var.f128025g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f128022d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f128023e);
                String str2 = this.f128024f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                String str3 = this.f128025g;
                if (str3 != null) {
                    aVar.mo74323j(4, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str4 = this.f128022d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f128023e);
            String str5 = this.f128024f;
            if (str5 != null) {
                g += C52418a.m58683j(3, str5);
            }
            String str6 = this.f128025g;
            return str6 != null ? g + C52418a.m58683j(4, str6) : g;
        } else if (i == 2) {
            this.f128023e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f128022d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47676t2 t2Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                t2Var.f128022d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47683u2 u2Var = new C47683u2();
                    if (bArr != null && bArr.length > 0) {
                        u2Var.parseFrom(bArr);
                    }
                    t2Var.f128023e.add(u2Var);
                }
                return 0;
            } else if (intValue == 3) {
                t2Var.f128024f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                t2Var.f128025g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
