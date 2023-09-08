package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class vt4 extends C47465a {

    /* renamed from: d */
    public int f143694d;

    /* renamed from: e */
    public int f143695e;

    /* renamed from: f */
    public String f143696f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof vt4)) {
            return false;
        }
        vt4 vt4 = (vt4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143694d), Integer.valueOf(vt4.f143694d)) && C46238a.m51546a(Integer.valueOf(this.f143695e), Integer.valueOf(vt4.f143695e)) && C46238a.m51546a(this.f143696f, vt4.f143696f);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143694d);
            aVar.mo74318e(2, this.f143695e);
            String str = this.f143696f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143694d) + 0 + C52418a.m58678e(2, this.f143695e);
            String str2 = this.f143696f;
            return str2 != null ? e + C52418a.m58683j(3, str2) : e;
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
            vt4 vt4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vt4.f143694d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                vt4.f143695e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                vt4.f143696f = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
