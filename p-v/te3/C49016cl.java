package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.cl */
public class C49016cl extends C47465a {

    /* renamed from: d */
    public long f131802d;

    /* renamed from: e */
    public String f131803e;

    /* renamed from: f */
    public long f131804f;

    /* renamed from: g */
    public int f131805g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49016cl)) {
            return false;
        }
        C49016cl clVar = (C49016cl) aVar;
        return C46238a.m51546a(Long.valueOf(this.f131802d), Long.valueOf(clVar.f131802d)) && C46238a.m51546a(this.f131803e, clVar.f131803e) && C46238a.m51546a(Long.valueOf(this.f131804f), Long.valueOf(clVar.f131804f)) && C46238a.m51546a(Integer.valueOf(this.f131805g), Integer.valueOf(clVar.f131805g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f131802d);
            String str = this.f131803e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f131804f);
            aVar.mo74318e(4, this.f131805g);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f131802d) + 0;
            String str2 = this.f131803e;
            if (str2 != null) {
                h += C52418a.m58683j(2, str2);
            }
            return h + C52418a.m58681h(3, this.f131804f) + C52418a.m58678e(4, this.f131805g);
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
            C49016cl clVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                clVar.f131802d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                clVar.f131803e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                clVar.f131804f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                clVar.f131805g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
