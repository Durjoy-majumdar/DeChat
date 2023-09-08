package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class bi4 extends C47465a {

    /* renamed from: d */
    public String f131135d;

    /* renamed from: e */
    public int f131136e;

    /* renamed from: f */
    public long f131137f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof bi4)) {
            return false;
        }
        bi4 bi4 = (bi4) aVar;
        return C46238a.m51546a(this.f131135d, bi4.f131135d) && C46238a.m51546a(Integer.valueOf(this.f131136e), Integer.valueOf(bi4.f131136e)) && C46238a.m51546a(Long.valueOf(this.f131137f), Long.valueOf(bi4.f131137f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f131135d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f131136e);
            aVar.mo74321h(3, this.f131137f);
            return 0;
        } else if (i == 1) {
            String str2 = this.f131135d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f131136e) + C52418a.m58681h(3, this.f131137f);
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
            bi4 bi4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bi4.f131135d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bi4.f131136e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bi4.f131137f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
