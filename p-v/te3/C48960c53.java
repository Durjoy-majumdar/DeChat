package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.c53 */
public class C48960c53 extends C47465a {

    /* renamed from: d */
    public long f131529d;

    /* renamed from: e */
    public String f131530e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48960c53)) {
            return false;
        }
        C48960c53 c532 = (C48960c53) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131529d), Long.valueOf(c532.f131529d)) && C46238a.m51546a(this.f131530e, c532.f131530e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131529d);
            String str = this.f131530e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131529d) + 0;
            String str2 = this.f131530e;
            return str2 != null ? h + C52418a.m58683j(2, str2) : h;
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
            C48960c53 c532 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                c532.f131529d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                c532.f131530e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
