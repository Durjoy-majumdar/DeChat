package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.k1 */
public class C47612k1 extends C47465a {

    /* renamed from: d */
    public C47589h f127825d;

    /* renamed from: e */
    public String f127826e;

    /* renamed from: f */
    public LinkedList<C47619l1> f127827f = new LinkedList<>();

    /* renamed from: g */
    public String f127828g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47612k1)) {
            return false;
        }
        C47612k1 k1Var = (C47612k1) aVar;
        return C46238a.m51546a(this.f127825d, k1Var.f127825d) && C46238a.m51546a(this.f127826e, k1Var.f127826e) && C46238a.m51546a(this.f127827f, k1Var.f127827f) && C46238a.m51546a(this.f127828g, k1Var.f127828g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47589h hVar = this.f127825d;
            if (hVar != null) {
                if (hVar != null) {
                    aVar.mo74322i(1, hVar.computeSize());
                    this.f127825d.writeFields(aVar);
                }
                String str = this.f127826e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 8, this.f127827f);
                String str2 = this.f127828g;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i == 1) {
            C47589h hVar2 = this.f127825d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            String str3 = this.f127826e;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 8, this.f127827f);
            String str4 = this.f127828g;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f127827f.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127825d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47612k1 k1Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47589h hVar3 = new C47589h();
                    if (bArr != null && bArr.length > 0) {
                        hVar3.parseFrom(bArr);
                    }
                    k1Var.f127825d = hVar3;
                }
                return 0;
            } else if (intValue == 2) {
                k1Var.f127826e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47619l1 l1Var = new C47619l1();
                    if (bArr2 != null && bArr2.length > 0) {
                        l1Var.parseFrom(bArr2);
                    }
                    k1Var.f127827f.add(l1Var);
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                k1Var.f127828g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
