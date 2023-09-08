package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.j3 */
public class C47607j3 extends C47465a {

    /* renamed from: d */
    public String f127812d;

    /* renamed from: e */
    public LinkedList<C47670s3> f127813e = new LinkedList<>();

    /* renamed from: f */
    public String f127814f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47607j3)) {
            return false;
        }
        C47607j3 j3Var = (C47607j3) aVar;
        return C46238a.m51546a(this.f127812d, j3Var.f127812d) && C46238a.m51546a(this.f127813e, j3Var.f127813e) && C46238a.m51546a(this.f127814f, j3Var.f127814f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f127812d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127814f != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74320g(2, 8, this.f127813e);
                String str2 = this.f127814f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Detail");
            }
        } else if (i == 1) {
            String str3 = this.f127812d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f127813e);
            String str4 = this.f127814f;
            return str4 != null ? g + C52418a.m58683j(3, str4) : g;
        } else if (i == 2) {
            this.f127813e.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127812d == null) {
                throw new C52419b("Not all required fields were included: Title");
            } else if (this.f127814f != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: Detail");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47607j3 j3Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                j3Var.f127812d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C47670s3 s3Var = new C47670s3();
                    if (bArr != null && bArr.length > 0) {
                        s3Var.parseFrom(bArr);
                    }
                    j3Var.f127813e.add(s3Var);
                }
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                j3Var.f127814f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
