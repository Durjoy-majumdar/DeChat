package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hh4 extends C47465a {

    /* renamed from: d */
    public int f183486d;

    /* renamed from: e */
    public String f183487e;

    /* renamed from: f */
    public long f183488f;

    /* renamed from: g */
    public int f183489g;

    /* renamed from: h */
    public String f183490h;

    /* renamed from: i */
    public String f183491i;

    /* renamed from: j */
    public C89349b f183492j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hh4)) {
            return false;
        }
        hh4 hh4 = (hh4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183486d), Integer.valueOf(hh4.f183486d)) && C46238a.m51546a(this.f183487e, hh4.f183487e) && C46238a.m51546a(Long.valueOf(this.f183488f), Long.valueOf(hh4.f183488f)) && C46238a.m51546a(Integer.valueOf(this.f183489g), Integer.valueOf(hh4.f183489g)) && C46238a.m51546a(this.f183490h, hh4.f183490h) && C46238a.m51546a(this.f183491i, hh4.f183491i) && C46238a.m51546a(this.f183492j, hh4.f183492j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183486d);
            String str = this.f183487e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f183488f);
            aVar.mo74318e(4, this.f183489g);
            String str2 = this.f183490h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f183491i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            C89349b bVar = this.f183492j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183486d) + 0;
            String str4 = this.f183487e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int h = e + C52418a.m58681h(3, this.f183488f) + C52418a.m58678e(4, this.f183489g);
            String str5 = this.f183490h;
            if (str5 != null) {
                h += C52418a.m58683j(5, str5);
            }
            String str6 = this.f183491i;
            if (str6 != null) {
                h += C52418a.m58683j(6, str6);
            }
            C89349b bVar2 = this.f183492j;
            return bVar2 != null ? h + C52418a.m58675b(7, bVar2) : h;
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
            hh4 hh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hh4.f183486d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    hh4.f183487e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    hh4.f183488f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    hh4.f183489g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hh4.f183490h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    hh4.f183491i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    hh4.f183492j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
