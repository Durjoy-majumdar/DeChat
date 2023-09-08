package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class hu4 extends C47465a {

    /* renamed from: d */
    public long f298364d;

    /* renamed from: e */
    public long f298365e;

    /* renamed from: f */
    public int f298366f;

    /* renamed from: g */
    public int f298367g;

    /* renamed from: h */
    public int f298368h;

    /* renamed from: i */
    public int f298369i;

    /* renamed from: j */
    public C89349b f298370j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof hu4)) {
            return false;
        }
        hu4 hu4 = (hu4) aVar;
        return C46238a.m51546a(Long.valueOf(this.f298364d), Long.valueOf(hu4.f298364d)) && C46238a.m51546a(Long.valueOf(this.f298365e), Long.valueOf(hu4.f298365e)) && C46238a.m51546a(Integer.valueOf(this.f298366f), Integer.valueOf(hu4.f298366f)) && C46238a.m51546a(Integer.valueOf(this.f298367g), Integer.valueOf(hu4.f298367g)) && C46238a.m51546a(Integer.valueOf(this.f298368h), Integer.valueOf(hu4.f298368h)) && C46238a.m51546a(Integer.valueOf(this.f298369i), Integer.valueOf(hu4.f298369i)) && C46238a.m51546a(this.f298370j, hu4.f298370j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f298364d);
            aVar.mo74321h(2, this.f298365e);
            aVar.mo74318e(3, this.f298366f);
            aVar.mo74318e(4, this.f298367g);
            aVar.mo74318e(5, this.f298368h);
            aVar.mo74318e(6, this.f298369i);
            C89349b bVar = this.f298370j;
            if (bVar != null) {
                aVar.mo74315b(7, bVar);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f298364d) + 0 + C52418a.m58681h(2, this.f298365e) + C52418a.m58678e(3, this.f298366f) + C52418a.m58678e(4, this.f298367g) + C52418a.m58678e(5, this.f298368h) + C52418a.m58678e(6, this.f298369i);
            C89349b bVar2 = this.f298370j;
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
            hu4 hu4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    hu4.f298364d = aVar3.mo141631i(intValue);
                    return 0;
                case 2:
                    hu4.f298365e = aVar3.mo141631i(intValue);
                    return 0;
                case 3:
                    hu4.f298366f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    hu4.f298367g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    hu4.f298368h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    hu4.f298369i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    hu4.f298370j = aVar3.mo141626d(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
