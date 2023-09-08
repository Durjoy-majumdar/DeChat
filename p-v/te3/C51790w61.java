package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.w61 */
public class C51790w61 extends C47465a {

    /* renamed from: d */
    public String f143878d;

    /* renamed from: e */
    public long f143879e;

    /* renamed from: f */
    public long f143880f;

    /* renamed from: g */
    public int f143881g;

    /* renamed from: h */
    public String f143882h;

    /* renamed from: i */
    public String f143883i;

    /* renamed from: j */
    public int f143884j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51790w61)) {
            return false;
        }
        C51790w61 w612 = (C51790w61) aVar;
        return C46238a.m51546a(this.f143878d, w612.f143878d) && C46238a.m51546a(Long.valueOf(this.f143879e), Long.valueOf(w612.f143879e)) && C46238a.m51546a(Long.valueOf(this.f143880f), Long.valueOf(w612.f143880f)) && C46238a.m51546a(Integer.valueOf(this.f143881g), Integer.valueOf(w612.f143881g)) && C46238a.m51546a(this.f143882h, w612.f143882h) && C46238a.m51546a(this.f143883i, w612.f143883i) && C46238a.m51546a(Integer.valueOf(this.f143884j), Integer.valueOf(w612.f143884j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f143878d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f143879e);
            aVar.mo74321h(3, this.f143880f);
            aVar.mo74318e(4, this.f143881g);
            String str2 = this.f143882h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f143883i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f143884j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f143878d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int h = i2 + C52418a.m58681h(2, this.f143879e) + C52418a.m58681h(3, this.f143880f) + C52418a.m58678e(4, this.f143881g);
            String str5 = this.f143882h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f143883i;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            return h + C52418a.m58678e(7, this.f143884j);
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
            C51790w61 w612 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    w612.f143878d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    w612.f143879e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    w612.f143880f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    w612.f143881g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    w612.f143882h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    w612.f143883i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    w612.f143884j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
