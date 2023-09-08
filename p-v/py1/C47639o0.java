package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.o0 */
public class C47639o0 extends C47465a {

    /* renamed from: d */
    public C47589h f127896d;

    /* renamed from: e */
    public LinkedList<String> f127897e = new LinkedList<>();

    /* renamed from: f */
    public String f127898f;

    /* renamed from: g */
    public String f127899g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47639o0)) {
            return false;
        }
        C47639o0 o0Var = (C47639o0) aVar;
        return C46238a.m51546a(this.f127896d, o0Var.f127896d) && C46238a.m51546a(this.f127897e, o0Var.f127897e) && C46238a.m51546a(this.f127898f, o0Var.f127898f) && C46238a.m51546a(this.f127899g, o0Var.f127899g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C47589h hVar = this.f127896d;
            if (hVar != null) {
                aVar.mo74322i(1, hVar.computeSize());
                this.f127896d.writeFields(aVar);
            }
            aVar.mo74320g(2, 1, this.f127897e);
            String str = this.f127898f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f127899g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            C47589h hVar2 = this.f127896d;
            if (hVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, hVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f127897e);
            String str3 = this.f127898f;
            if (str3 != null) {
                g += C52418a.m58683j(3, str3);
            }
            String str4 = this.f127899g;
            return str4 != null ? g + C52418a.m58683j(4, str4) : g;
        } else if (i == 2) {
            this.f127897e.clear();
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
            C47639o0 o0Var = objArr[1];
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
                    o0Var.f127896d = hVar3;
                }
                return 0;
            } else if (intValue == 2) {
                o0Var.f127897e.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                o0Var.f127898f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                o0Var.f127899g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
