package ag2;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.r0 */
public class C39596r0 extends C47465a {

    /* renamed from: d */
    public String f106287d;

    /* renamed from: e */
    public String f106288e;

    /* renamed from: f */
    public long f106289f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39596r0)) {
            return false;
        }
        C39596r0 r0Var = (C39596r0) aVar;
        return C46238a.m51546a(this.f106287d, r0Var.f106287d) && C46238a.m51546a(this.f106288e, r0Var.f106288e) && C46238a.m51546a(Long.valueOf(this.f106289f), Long.valueOf(r0Var.f106289f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f106287d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f106288e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74321h(3, this.f106289f);
            return 0;
        } else if (i == 1) {
            String str3 = this.f106287d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f106288e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58681h(3, this.f106289f);
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
            C39596r0 r0Var = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                r0Var.f106287d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                r0Var.f106288e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                r0Var.f106289f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
