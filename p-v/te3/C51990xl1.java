package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xl1 */
public class C51990xl1 extends C47465a {

    /* renamed from: d */
    public long f144734d;

    /* renamed from: e */
    public String f144735e;

    /* renamed from: f */
    public int f144736f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51990xl1)) {
            return false;
        }
        C51990xl1 xl12 = (C51990xl1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144734d), Long.valueOf(xl12.f144734d)) && C46238a.m51546a(this.f144735e, xl12.f144735e) && C46238a.m51546a(Integer.valueOf(this.f144736f), Integer.valueOf(xl12.f144736f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144734d);
            String str = this.f144735e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f144736f);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144734d) + 0;
            String str2 = this.f144735e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58678e(3, this.f144736f);
        } else if (i == 2) {
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
            C51990xl1 xl12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xl12.f144734d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                xl12.f144735e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xl12.f144736f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
