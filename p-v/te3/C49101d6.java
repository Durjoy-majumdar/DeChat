package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.d6 */
public class C49101d6 extends C47465a {

    /* renamed from: d */
    public LinkedList<C48950c33> f132138d = new LinkedList<>();

    /* renamed from: e */
    public String f132139e;

    /* renamed from: f */
    public LinkedList<C48950c33> f132140f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49101d6)) {
            return false;
        }
        C49101d6 d6Var = (C49101d6) aVar;
        return C46238a.m51546a(this.f132138d, d6Var.f132138d) && C46238a.m51546a(this.f132139e, d6Var.f132139e) && C46238a.m51546a(this.f132140f, d6Var.f132140f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f132138d);
            String str = this.f132139e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74320g(3, 8, this.f132140f);
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f132138d) + 0;
            String str2 = this.f132139e;
            if (str2 != null) {
                g += C52418a.m58683j(2, str2);
            }
            return g + C52418a.m58680g(3, 8, this.f132140f);
        } else if (i == 2) {
            this.f132138d.clear();
            this.f132140f.clear();
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
            C49101d6 d6Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    C48950c33 c332 = new C48950c33();
                    if (bArr != null && bArr.length > 0) {
                        c332.parseFrom(bArr);
                    }
                    d6Var.f132138d.add(c332);
                }
                return 0;
            } else if (intValue == 2) {
                d6Var.f132139e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    byte[] bArr2 = j2.get(i3);
                    C48950c33 c333 = new C48950c33();
                    if (bArr2 != null && bArr2.length > 0) {
                        c333.parseFrom(bArr2);
                    }
                    d6Var.f132140f.add(c333);
                }
                return 0;
            }
        }
    }
}
