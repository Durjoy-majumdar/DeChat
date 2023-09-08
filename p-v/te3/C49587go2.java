package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.go2 */
public class C49587go2 extends C47465a {

    /* renamed from: d */
    public LinkedList<vr4> f134175d = new LinkedList<>();

    /* renamed from: e */
    public String f134176e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49587go2)) {
            return false;
        }
        C49587go2 go22 = (C49587go2) aVar;
        return C46238a.m51546a(this.f134175d, go22.f134175d) && C46238a.m51546a(this.f134176e, go22.f134176e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74320g(1, 8, this.f134175d);
            String str = this.f134176e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int g = C52418a.m58680g(1, 8, this.f134175d) + 0;
            String str2 = this.f134176e;
            return str2 != null ? g + C52418a.m58683j(2, str2) : g;
        } else if (i == 2) {
            this.f134175d.clear();
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
            C49587go2 go22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i2 = 0; i2 < size; i2++) {
                    byte[] bArr = j.get(i2);
                    vr4 vr4 = new vr4();
                    if (bArr != null && bArr.length > 0) {
                        vr4.parseFrom(bArr);
                    }
                    go22.f134175d.add(vr4);
                }
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                go22.f134176e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
