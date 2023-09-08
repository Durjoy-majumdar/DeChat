package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ol2 */
public class C64610ol2 extends C47465a {

    /* renamed from: d */
    public int f184671d;

    /* renamed from: e */
    public C89349b f184672e;

    /* renamed from: f */
    public int f184673f;

    /* renamed from: g */
    public int f184674g;

    /* renamed from: h */
    public int f184675h;

    /* renamed from: i */
    public int f184676i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64610ol2)) {
            return false;
        }
        C64610ol2 ol22 = (C64610ol2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184671d), Integer.valueOf(ol22.f184671d)) && C46238a.m51546a(this.f184672e, ol22.f184672e) && C46238a.m51546a(Integer.valueOf(this.f184673f), Integer.valueOf(ol22.f184673f)) && C46238a.m51546a(Integer.valueOf(this.f184674g), Integer.valueOf(ol22.f184674g)) && C46238a.m51546a(Integer.valueOf(this.f184675h), Integer.valueOf(ol22.f184675h)) && C46238a.m51546a(Integer.valueOf(this.f184676i), Integer.valueOf(ol22.f184676i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184671d);
            C89349b bVar = this.f184672e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f184673f);
            aVar.mo74318e(4, this.f184674g);
            aVar.mo74318e(5, this.f184675h);
            aVar.mo74318e(6, this.f184676i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184671d) + 0;
            C89349b bVar2 = this.f184672e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            return e + C52418a.m58678e(3, this.f184673f) + C52418a.m58678e(4, this.f184674g) + C52418a.m58678e(5, this.f184675h) + C52418a.m58678e(6, this.f184676i);
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
            C64610ol2 ol22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ol22.f184671d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ol22.f184672e = aVar3.mo141626d(intValue);
                    return 0;
                case 3:
                    ol22.f184673f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ol22.f184674g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    ol22.f184675h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ol22.f184676i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
