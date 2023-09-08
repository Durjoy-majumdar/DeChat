package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gv0 */
public class C64404gv0 extends C47465a {

    /* renamed from: d */
    public long f183357d;

    /* renamed from: e */
    public long f183358e;

    /* renamed from: f */
    public String f183359f;

    /* renamed from: g */
    public long f183360g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64404gv0)) {
            return false;
        }
        C64404gv0 gv02 = (C64404gv0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f183357d), Long.valueOf(gv02.f183357d)) && C46238a.m51546a(Long.valueOf(this.f183358e), Long.valueOf(gv02.f183358e)) && C46238a.m51546a(this.f183359f, gv02.f183359f) && C46238a.m51546a(Long.valueOf(this.f183360g), Long.valueOf(gv02.f183360g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f183357d);
            aVar.mo74321h(2, this.f183358e);
            String str = this.f183359f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74321h(4, this.f183360g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f183357d) + 0 + C52418a.m58681h(2, this.f183358e);
            String str2 = this.f183359f;
            if (str2 != null) {
                h += C52418a.m58683j(3, str2);
            }
            return h + C52418a.m58681h(4, this.f183360g);
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
            C64404gv0 gv02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gv02.f183357d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                gv02.f183358e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                gv02.f183359f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gv02.f183360g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
