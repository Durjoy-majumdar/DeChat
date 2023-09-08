package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bf1 */
public class C48849bf1 extends C47465a {

    /* renamed from: d */
    public long f131076d;

    /* renamed from: e */
    public String f131077e;

    /* renamed from: f */
    public long f131078f;

    /* renamed from: g */
    public int f131079g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48849bf1)) {
            return false;
        }
        C48849bf1 bf12 = (C48849bf1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131076d), Long.valueOf(bf12.f131076d)) && C46238a.m51546a(this.f131077e, bf12.f131077e) && C46238a.m51546a(Long.valueOf(this.f131078f), Long.valueOf(bf12.f131078f)) && C46238a.m51546a(Integer.valueOf(this.f131079g), Integer.valueOf(bf12.f131079g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131076d);
            String str = this.f131077e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f131078f);
            aVar.mo74318e(4, this.f131079g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131076d) + 0;
            String str2 = this.f131077e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58681h(3, this.f131078f) + C52418a.m58678e(4, this.f131079g);
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
            C48849bf1 bf12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bf12.f131076d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                bf12.f131077e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                bf12.f131078f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                bf12.f131079g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
