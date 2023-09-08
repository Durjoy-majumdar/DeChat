package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ww2 */
public class C51887ww2 extends C47465a {

    /* renamed from: d */
    public long f144323d;

    /* renamed from: e */
    public long f144324e;

    /* renamed from: f */
    public String f144325f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51887ww2)) {
            return false;
        }
        C51887ww2 ww22 = (C51887ww2) aVar;
        return C46238a.m51546a(Long.valueOf(this.f144323d), Long.valueOf(ww22.f144323d)) && C46238a.m51546a(Long.valueOf(this.f144324e), Long.valueOf(ww22.f144324e)) && C46238a.m51546a(this.f144325f, ww22.f144325f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f144323d);
            aVar.mo74321h(2, this.f144324e);
            String str = this.f144325f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f144323d) + 0 + C52418a.m58681h(2, this.f144324e);
            String str2 = this.f144325f;
            return str2 != null ? h + C52418a.m58683j(3, str2) : h;
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
            C51887ww2 ww22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ww22.f144323d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                ww22.f144324e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ww22.f144325f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
