package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ca1 */
public class C64281ca1 extends C47465a {

    /* renamed from: d */
    public long f182455d;

    /* renamed from: e */
    public long f182456e;

    /* renamed from: f */
    public int f182457f;

    /* renamed from: g */
    public String f182458g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64281ca1)) {
            return false;
        }
        C64281ca1 ca12 = (C64281ca1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f182455d), Long.valueOf(ca12.f182455d)) && C46238a.m51546a(Long.valueOf(this.f182456e), Long.valueOf(ca12.f182456e)) && C46238a.m51546a(Integer.valueOf(this.f182457f), Integer.valueOf(ca12.f182457f)) && C46238a.m51546a(this.f182458g, ca12.f182458g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f182455d);
            aVar.mo74321h(2, this.f182456e);
            aVar.mo74318e(3, this.f182457f);
            String str = this.f182458g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f182455d) + 0 + C52418a.m58681h(2, this.f182456e) + C52418a.m58678e(3, this.f182457f);
            String str2 = this.f182458g;
            return str2 != null ? h + C52418a.m58683j(4, str2) : h;
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
            C64281ca1 ca12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ca12.f182455d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                ca12.f182456e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                ca12.f182457f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                ca12.f182458g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
