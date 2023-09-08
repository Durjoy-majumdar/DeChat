package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.o3 */
public class C47642o3 extends C47465a {

    /* renamed from: d */
    public LinkedList<C47561d> f127902d = new LinkedList<>();

    /* renamed from: e */
    public C47714z3 f127903e;

    /* renamed from: f */
    public LinkedList<C47686v> f127904f = new LinkedList<>();

    /* renamed from: g */
    public C47684u3 f127905g;

    /* renamed from: h */
    public LinkedList<C47657q4> f127906h = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47642o3)) {
            return false;
        }
        C47642o3 o3Var = (C47642o3) aVar;
        return C46238a.m51546a(this.f127902d, o3Var.f127902d) && C46238a.m51546a(this.f127903e, o3Var.f127903e) && C46238a.m51546a(this.f127904f, o3Var.f127904f) && C46238a.m51546a(this.f127905g, o3Var.f127905g) && C46238a.m51546a(this.f127906h, o3Var.f127906h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f127902d);
            C47714z3 z3Var = this.f127903e;
            if (z3Var != null) {
                aVar.mo74322i(2, z3Var.computeSize());
                this.f127903e.writeFields(aVar);
            }
            aVar.mo74320g(3, 8, this.f127904f);
            C47684u3 u3Var = this.f127905g;
            if (u3Var != null) {
                aVar.mo74322i(4, u3Var.computeSize());
                this.f127905g.writeFields(aVar);
            }
            aVar.mo74320g(5, 8, this.f127906h);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f127902d) + 0;
            C47714z3 z3Var2 = this.f127903e;
            if (z3Var2 != null) {
                g += C52418a.m58682i(2, z3Var2.computeSize());
            }
            int g2 = g + C52418a.m58680g(3, 8, this.f127904f);
            C47684u3 u3Var2 = this.f127905g;
            if (u3Var2 != null) {
                g2 += C52418a.m58682i(4, u3Var2.computeSize());
            }
            return g2 + C52418a.m58680g(5, 8, this.f127906h);
        } else if (i == 2) {
            this.f127902d.clear();
            this.f127904f.clear();
            this.f127906h.clear();
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
            C47642o3 o3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C47561d dVar = new C47561d();
                    if (bArr != null && bArr.length > 0) {
                        dVar.parseFrom(bArr);
                    }
                    o3Var.f127902d.add(dVar);
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C47714z3 z3Var3 = new C47714z3();
                    if (bArr2 != null && bArr2.length > 0) {
                        z3Var3.parseFrom(bArr2);
                    }
                    o3Var.f127903e = z3Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    byte[] bArr3 = j3.get(i4);
                    C47686v vVar = new C47686v();
                    if (bArr3 != null && bArr3.length > 0) {
                        vVar.parseFrom(bArr3);
                    }
                    o3Var.f127904f.add(vVar);
                }
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    byte[] bArr4 = j4.get(i5);
                    C47684u3 u3Var3 = new C47684u3();
                    if (bArr4 != null && bArr4.length > 0) {
                        u3Var3.parseFrom(bArr4);
                    }
                    o3Var.f127905g = u3Var3;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j5 = aVar3.mo141632j(intValue);
                int size5 = j5.size();
                for (int i6 = 0; i6 < size5; i6++) {
                    byte[] bArr5 = j5.get(i6);
                    C47657q4 q4Var = new C47657q4();
                    if (bArr5 != null && bArr5.length > 0) {
                        q4Var.parseFrom(bArr5);
                    }
                    o3Var.f127906h.add(q4Var);
                }
                return 0;
            }
        }
    }
}
