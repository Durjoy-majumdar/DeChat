package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.l21 */
public class C64510l21 extends C47465a {

    /* renamed from: d */
    public int f184023d;

    /* renamed from: e */
    public C89349b f184024e;

    /* renamed from: f */
    public int f184025f;

    /* renamed from: g */
    public String f184026g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64510l21)) {
            return false;
        }
        C64510l21 l212 = (C64510l21) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f184023d), Integer.valueOf(l212.f184023d)) && C46238a.m51546a(this.f184024e, l212.f184024e) && C46238a.m51546a(Integer.valueOf(this.f184025f), Integer.valueOf(l212.f184025f)) && C46238a.m51546a(this.f184026g, l212.f184026g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f184023d);
            C89349b bVar = this.f184024e;
            if (bVar != null) {
                aVar.mo74315b(2, bVar);
            }
            aVar.mo74318e(3, this.f184025f);
            String str = this.f184026g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f184023d) + 0;
            C89349b bVar2 = this.f184024e;
            if (bVar2 != null) {
                e += C52418a.m58675b(2, bVar2);
            }
            int e2 = e + C52418a.m58678e(3, this.f184025f);
            String str2 = this.f184026g;
            return str2 != null ? e2 + C52418a.m58683j(4, str2) : e2;
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
            C64510l21 l212 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                l212.f184023d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                l212.f184024e = aVar3.mo141626d(intValue);
                return 0;
            } else if (intValue == 3) {
                l212.f184025f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                l212.f184026g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
