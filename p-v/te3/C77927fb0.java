package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fb0 */
public class C77927fb0 extends C47465a {

    /* renamed from: d */
    public String f227352d;

    /* renamed from: e */
    public String f227353e;

    /* renamed from: f */
    public LinkedList<C77920eb0> f227354f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77927fb0)) {
            return false;
        }
        C77927fb0 fb02 = (C77927fb0) aVar;
        return C46238a.m51546a(this.f227352d, fb02.f227352d) && C46238a.m51546a(this.f227353e, fb02.f227353e) && C46238a.m51546a(this.f227354f, fb02.f227354f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227352d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227353e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74320g(3, 8, this.f227354f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f227352d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f227353e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58680g(3, 8, this.f227354f);
        } else if (i == 2) {
            this.f227354f.clear();
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
            C77927fb0 fb02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fb02.f227352d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fb02.f227353e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C77920eb0 eb02 = new C77920eb0();
                    if (bArr != null && bArr.length > 0) {
                        eb02.parseFrom(bArr);
                    }
                    fb02.f227354f.add(eb02);
                }
                return 0;
            }
        }
    }
}
