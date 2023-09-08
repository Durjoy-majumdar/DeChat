package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vg3 */
public class C90443vg3 extends C47465a {

    /* renamed from: d */
    public String f259876d;

    /* renamed from: e */
    public String f259877e;

    /* renamed from: f */
    public int f259878f;

    /* renamed from: g */
    public int f259879g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90443vg3)) {
            return false;
        }
        C90443vg3 vg32 = (C90443vg3) aVar;
        return C46238a.m51546a(this.f259876d, vg32.f259876d) && C46238a.m51546a(this.f259877e, vg32.f259877e) && C46238a.m51546a(Integer.valueOf(this.f259878f), Integer.valueOf(vg32.f259878f)) && C46238a.m51546a(Integer.valueOf(this.f259879g), Integer.valueOf(vg32.f259879g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259876d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259877e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f259878f);
            aVar.mo74318e(4, this.f259879g);
            return 0;
        } else if (i == 1) {
            String str3 = this.f259876d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f259877e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f259878f) + C52418a.m58678e(4, this.f259879g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90443vg3 vg32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vg32.f259876d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vg32.f259877e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vg32.f259878f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vg32.f259879g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
