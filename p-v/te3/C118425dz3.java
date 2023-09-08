package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.dz3 */
public class C118425dz3 extends C47465a {

    /* renamed from: d */
    public int f353954d;

    /* renamed from: e */
    public int f353955e;

    /* renamed from: f */
    public int f353956f;

    /* renamed from: g */
    public int f353957g;

    /* renamed from: h */
    public int f353958h;

    /* renamed from: i */
    public int f353959i;

    /* renamed from: j */
    public int f353960j;

    /* renamed from: n */
    public C89349b f353961n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118425dz3)) {
            return false;
        }
        C118425dz3 dz32 = (C118425dz3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f353954d), Integer.valueOf(dz32.f353954d)) && C46238a.m51546a(Integer.valueOf(this.f353955e), Integer.valueOf(dz32.f353955e)) && C46238a.m51546a(Integer.valueOf(this.f353956f), Integer.valueOf(dz32.f353956f)) && C46238a.m51546a(Integer.valueOf(this.f353957g), Integer.valueOf(dz32.f353957g)) && C46238a.m51546a(Integer.valueOf(this.f353958h), Integer.valueOf(dz32.f353958h)) && C46238a.m51546a(Integer.valueOf(this.f353959i), Integer.valueOf(dz32.f353959i)) && C46238a.m51546a(Integer.valueOf(this.f353960j), Integer.valueOf(dz32.f353960j)) && C46238a.m51546a(this.f353961n, dz32.f353961n);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f353961n != null) {
                aVar.mo74318e(1, this.f353954d);
                aVar.mo74318e(2, this.f353955e);
                aVar.mo74318e(3, this.f353956f);
                aVar.mo74318e(4, this.f353957g);
                aVar.mo74318e(5, this.f353958h);
                aVar.mo74318e(6, this.f353959i);
                aVar.mo74318e(7, this.f353960j);
                C89349b bVar = this.f353961n;
                if (bVar != null) {
                    aVar.mo74315b(8, bVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: data");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f353954d) + 0 + C52418a.m58678e(2, this.f353955e) + C52418a.m58678e(3, this.f353956f) + C52418a.m58678e(4, this.f353957g) + C52418a.m58678e(5, this.f353958h) + C52418a.m58678e(6, this.f353959i) + C52418a.m58678e(7, this.f353960j);
            C89349b bVar2 = this.f353961n;
            return bVar2 != null ? e + C52418a.m58675b(8, bVar2) : e;
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
            C118425dz3 dz32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    dz32.f353954d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    dz32.f353955e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    dz32.f353956f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    dz32.f353957g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    dz32.f353958h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    dz32.f353959i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    dz32.f353960j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    dz32.f353961n = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
