package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.og0 */
public class C50676og0 extends C47465a {

    /* renamed from: d */
    public long f139150d;

    /* renamed from: e */
    public String f139151e;

    /* renamed from: f */
    public String f139152f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50676og0)) {
            return false;
        }
        C50676og0 og02 = (C50676og0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f139150d), Long.valueOf(og02.f139150d)) && C46238a.m51546a(this.f139151e, og02.f139151e) && C46238a.m51546a(this.f139152f, og02.f139152f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f139150d);
            String str = this.f139151e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f139152f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f139150d) + 0;
            String str3 = this.f139151e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            String str4 = this.f139152f;
            return str4 != null ? h + C52418a.m58683j(3, str4) : h;
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
            C50676og0 og02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                og02.f139150d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                og02.f139151e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                og02.f139152f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
