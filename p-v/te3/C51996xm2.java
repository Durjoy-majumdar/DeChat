package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xm2 */
public class C51996xm2 extends C47465a {

    /* renamed from: d */
    public double f144751d;

    /* renamed from: e */
    public double f144752e;

    /* renamed from: f */
    public String f144753f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51996xm2)) {
            return false;
        }
        C51996xm2 xm22 = (C51996xm2) aVar;
        return C46238a.m51546a(Double.valueOf(this.f144751d), Double.valueOf(xm22.f144751d)) && C46238a.m51546a(Double.valueOf(this.f144752e), Double.valueOf(xm22.f144752e)) && C46238a.m51546a(this.f144753f, xm22.f144753f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74316c(1, this.f144751d);
            aVar.mo74316c(2, this.f144752e);
            String str = this.f144753f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int c = C52418a.m58676c(1, this.f144751d) + 0 + C52418a.m58676c(2, this.f144752e);
            String str2 = this.f144753f;
            return str2 != null ? c + C52418a.m58683j(3, str2) : c;
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
            C51996xm2 xm22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xm22.f144751d = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue == 2) {
                xm22.f144752e = aVar3.mo141627e(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                xm22.f144753f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
