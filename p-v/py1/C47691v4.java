package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.v4 */
public class C47691v4 extends C47465a {

    /* renamed from: d */
    public LinkedList<C47546a5> f128089d = new LinkedList<>();

    /* renamed from: e */
    public C47703x4 f128090e;

    /* renamed from: f */
    public String f128091f;

    /* renamed from: g */
    public String f128092g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47691v4)) {
            return false;
        }
        C47691v4 v4Var = (C47691v4) aVar;
        return C46238a.m51546a(this.f128089d, v4Var.f128089d) && C46238a.m51546a(this.f128090e, v4Var.f128090e) && C46238a.m51546a(this.f128091f, v4Var.f128091f) && C46238a.m51546a(this.f128092g, v4Var.f128092g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f128089d);
            C47703x4 x4Var = this.f128090e;
            if (x4Var != null) {
                aVar.mo74322i(2, x4Var.computeSize());
                this.f128090e.writeFields(aVar);
            }
            String str = this.f128091f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f128092g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f128089d) + 0;
            C47703x4 x4Var2 = this.f128090e;
            if (x4Var2 != null) {
                g += C52418a.m58682i(2, x4Var2.computeSize());
            }
            String str3 = this.f128091f;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            String str4 = this.f128092g;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f128089d.clear();
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
            C47691v4 v4Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47546a5 a5Var = new C47546a5();
                    if (bArr != null && bArr.length > 0) {
                        a5Var.parseFrom(bArr);
                    }
                    v4Var.f128089d.add(a5Var);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47703x4 x4Var3 = new C47703x4();
                    if (bArr2 != null && bArr2.length > 0) {
                        x4Var3.parseFrom(bArr2);
                    }
                    v4Var.f128090e = x4Var3;
                }
                return 0;
            } else if (intValue == 3) {
                v4Var.f128091f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                v4Var.f128092g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
