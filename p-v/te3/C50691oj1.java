package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oj1 */
public class C50691oj1 extends C47465a {

    /* renamed from: d */
    public long f139216d;

    /* renamed from: e */
    public String f139217e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50691oj1)) {
            return false;
        }
        C50691oj1 oj12 = (C50691oj1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139216d), Long.valueOf(oj12.f139216d)) && C46238a.m51546a(this.f139217e, oj12.f139217e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139216d);
            String str = this.f139217e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139216d) + 0;
            String str2 = this.f139217e;
            return str2 != null ? h + C52418a.m58683j(2, str2) : h;
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
            C50691oj1 oj12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                oj12.f139216d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                oj12.f139217e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
