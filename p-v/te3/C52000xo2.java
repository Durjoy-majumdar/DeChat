package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xo2 */
public class C52000xo2 extends C47465a {

    /* renamed from: d */
    public String f144775d;

    /* renamed from: e */
    public int f144776e;

    /* renamed from: f */
    public long f144777f;

    /* renamed from: g */
    public String f144778g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52000xo2)) {
            return false;
        }
        C52000xo2 xo22 = (C52000xo2) aVar;
        return C46238a.m51546a(this.f144775d, xo22.f144775d) && C46238a.m51546a(Integer.valueOf(this.f144776e), Integer.valueOf(xo22.f144776e)) && C46238a.m51546a(Long.valueOf(this.f144777f), Long.valueOf(xo22.f144777f)) && C46238a.m51546a(this.f144778g, xo22.f144778g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144775d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f144776e);
            aVar.mo74321h(3, this.f144777f);
            String str2 = this.f144778g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f144775d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f144776e) + C52418a.m58681h(3, this.f144777f);
            String str4 = this.f144778g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C52000xo2 xo22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xo22.f144775d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xo22.f144776e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                xo22.f144777f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xo22.f144778g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
