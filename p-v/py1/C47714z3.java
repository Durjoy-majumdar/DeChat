package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.z3 */
public class C47714z3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C47545a4> f128184d = new LinkedList<>();

    /* renamed from: e */
    public String f128185e;

    /* renamed from: f */
    public String f128186f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47714z3)) {
            return false;
        }
        C47714z3 z3Var = (C47714z3) aVar;
        return C46238a.m51546a(this.f128184d, z3Var.f128184d) && C46238a.m51546a(this.f128185e, z3Var.f128185e) && C46238a.m51546a(this.f128186f, z3Var.f128186f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f128184d);
            String str = this.f128185e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f128186f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f128184d) + 0;
            String str3 = this.f128185e;
            if (str3 != null) {
                g += C52418a.m58683j(2, str3);
            }
            String str4 = this.f128186f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f128184d.clear();
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
            C47714z3 z3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47545a4 a4Var = new C47545a4();
                    if (bArr != null && bArr.length > 0) {
                        a4Var.parseFrom(bArr);
                    }
                    z3Var.f128184d.add(a4Var);
                }
                return 0;
            } else if (intValue == 2) {
                z3Var.f128185e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                z3Var.f128186f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}