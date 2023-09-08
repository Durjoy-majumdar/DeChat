package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.a4 */
public class C47545a4 extends C47465a {

    /* renamed from: d */
    public C47589h f127561d;

    /* renamed from: e */
    public String f127562e;

    /* renamed from: f */
    public boolean f127563f;

    /* renamed from: g */
    public LinkedList<String> f127564g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47545a4)) {
            return false;
        }
        C47545a4 a4Var = (C47545a4) aVar;
        return C46238a.m51546a(this.f127561d, a4Var.f127561d) && C46238a.m51546a(this.f127562e, a4Var.f127562e) && C46238a.m51546a(Boolean.valueOf(this.f127563f), Boolean.valueOf(a4Var.f127563f)) && C46238a.m51546a(this.f127564g, a4Var.f127564g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47589h hVar = this.f127561d;
            if (hVar != null) {
                if (hVar != null) {
                    aVar.mo74322i(1, hVar.computeSize());
                    this.f127561d.writeFields(aVar);
                }
                String str = this.f127562e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74314a(3, this.f127563f);
                aVar.mo74320g(4, 1, this.f127564g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i == 1) {
            C47589h hVar2 = this.f127561d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            String str2 = this.f127562e;
            if (str2 != null) {
                i2 += C52418a.m58683j(2, str2);
            }
            return i2 + C52418a.m58674a(3, this.f127563f) + C52418a.m58680g(4, 1, this.f127564g);
        } else if (i == 2) {
            this.f127564g.clear();
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f127561d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: AppItem");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C47545a4 a4Var = objArr[1];
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
                    a4Var.f127561d = hVar3;
                }
                return 0;
            } else if (intValue == 2) {
                a4Var.f127562e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                a4Var.f127563f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                a4Var.f127564g.add(aVar3.mo141633k(intValue));
                return 0;
            }
        }
    }
}
