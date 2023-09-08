package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.n21 */
public class C50483n21 extends C47465a {

    /* renamed from: d */
    public long f138339d;

    /* renamed from: e */
    public int f138340e;

    /* renamed from: f */
    public long f138341f;

    /* renamed from: g */
    public int f138342g;

    /* renamed from: h */
    public String f138343h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50483n21)) {
            return false;
        }
        C50483n21 n212 = (C50483n21) aVar;
        return C46238a.m51546a(Long.valueOf(this.f138339d), Long.valueOf(n212.f138339d)) && C46238a.m51546a(Integer.valueOf(this.f138340e), Integer.valueOf(n212.f138340e)) && C46238a.m51546a(Long.valueOf(this.f138341f), Long.valueOf(n212.f138341f)) && C46238a.m51546a(Integer.valueOf(this.f138342g), Integer.valueOf(n212.f138342g)) && C46238a.m51546a(this.f138343h, n212.f138343h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f138339d);
            aVar.mo74318e(2, this.f138340e);
            aVar.mo74321h(3, this.f138341f);
            aVar.mo74318e(4, this.f138342g);
            String str = this.f138343h;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f138339d) + 0 + C52418a.m58678e(2, this.f138340e) + C52418a.m58681h(3, this.f138341f) + C52418a.m58678e(4, this.f138342g);
            String str2 = this.f138343h;
            return str2 != null ? h + C52418a.m58683j(5, str2) : h;
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
            C50483n21 n212 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                n212.f138339d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                n212.f138340e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                n212.f138341f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                n212.f138342g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                n212.f138343h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
