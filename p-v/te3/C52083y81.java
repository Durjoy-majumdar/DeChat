package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.y81 */
public class C52083y81 extends C47465a {

    /* renamed from: d */
    public long f145169d;

    /* renamed from: e */
    public String f145170e;

    /* renamed from: f */
    public long f145171f;

    /* renamed from: g */
    public int f145172g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52083y81)) {
            return false;
        }
        C52083y81 y812 = (C52083y81) aVar;
        return C46238a.m51546a(Long.valueOf(this.f145169d), Long.valueOf(y812.f145169d)) && C46238a.m51546a(this.f145170e, y812.f145170e) && C46238a.m51546a(Long.valueOf(this.f145171f), Long.valueOf(y812.f145171f)) && C46238a.m51546a(Integer.valueOf(this.f145172g), Integer.valueOf(y812.f145172g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f145169d);
            String str = this.f145170e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f145171f);
            aVar.mo74318e(4, this.f145172g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f145169d) + 0;
            String str2 = this.f145170e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58681h(3, this.f145171f) + C52418a.m58678e(4, this.f145172g);
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
            C52083y81 y812 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                y812.f145169d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                y812.f145170e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                y812.f145171f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                y812.f145172g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
