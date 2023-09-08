package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ir2 */
public class C64452ir2 extends C47465a {

    /* renamed from: d */
    public String f183729d;

    /* renamed from: e */
    public int f183730e;

    /* renamed from: f */
    public int f183731f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64452ir2)) {
            return false;
        }
        C64452ir2 ir22 = (C64452ir2) aVar;
        return C46238a.m51546a(this.f183729d, ir22.f183729d) && C46238a.m51546a(Integer.valueOf(this.f183730e), Integer.valueOf(ir22.f183730e)) && C46238a.m51546a(Integer.valueOf(this.f183731f), Integer.valueOf(ir22.f183731f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183729d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f183730e);
            aVar.mo74318e(3, this.f183731f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f183729d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f183730e) + C52418a.m58678e(3, this.f183731f);
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
            C64452ir2 ir22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                ir22.f183729d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                ir22.f183730e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                ir22.f183731f = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
