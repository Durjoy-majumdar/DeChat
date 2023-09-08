package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.g3 */
public class C47586g3 extends C47465a {

    /* renamed from: d */
    public String f127712d;

    /* renamed from: e */
    public LinkedList<C47593h3> f127713e = new LinkedList<>();

    /* renamed from: f */
    public C47600i3 f127714f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47586g3)) {
            return false;
        }
        C47586g3 g3Var = (C47586g3) aVar;
        return C46238a.m51546a(this.f127712d, g3Var.f127712d) && C46238a.m51546a(this.f127713e, g3Var.f127713e) && C46238a.m51546a(this.f127714f, g3Var.f127714f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127712d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f127713e);
                C47600i3 i3Var = this.f127714f;
                if (i3Var != null) {
                    aVar.mo74322i(3, i3Var.computeSize());
                    this.f127714f.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i == 1) {
            String str2 = this.f127712d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f127713e);
            C47600i3 i3Var2 = this.f127714f;
            return i3Var2 != null ? g + C52418a.m58682i(3, i3Var2.computeSize()) : g;
        } else if (i == 2) {
            this.f127713e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127712d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Title");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47586g3 g3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                g3Var.f127712d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47593h3 h3Var = new C47593h3();
                    if (bArr != null && bArr.length > 0) {
                        h3Var.parseFrom(bArr);
                    }
                    g3Var.f127713e.add(h3Var);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47600i3 i3Var3 = new C47600i3();
                    if (bArr2 != null && bArr2.length > 0) {
                        i3Var3.parseFrom(bArr2);
                    }
                    g3Var.f127714f = i3Var3;
                }
                return 0;
            }
        }
    }
}
