package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class mw4 extends C47465a {

    /* renamed from: d */
    public int f138252d;

    /* renamed from: e */
    public int f138253e;

    /* renamed from: f */
    public String f138254f;

    /* renamed from: g */
    public C89349b f138255g;

    /* renamed from: h */
    public int f138256h;

    /* renamed from: i */
    public int f138257i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof mw4)) {
            return false;
        }
        mw4 mw4 = (mw4) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138252d), Integer.valueOf(mw4.f138252d)) && C46238a.m51546a(Integer.valueOf(this.f138253e), Integer.valueOf(mw4.f138253e)) && C46238a.m51546a(this.f138254f, mw4.f138254f) && C46238a.m51546a(this.f138255g, mw4.f138255g) && C46238a.m51546a(Integer.valueOf(this.f138256h), Integer.valueOf(mw4.f138256h)) && C46238a.m51546a(Integer.valueOf(this.f138257i), Integer.valueOf(mw4.f138257i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138252d);
            aVar.mo74318e(2, this.f138253e);
            String str = this.f138254f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            C89349b bVar = this.f138255g;
            if (bVar != null) {
                aVar.mo74315b(4, bVar);
            }
            aVar.mo74318e(5, this.f138256h);
            aVar.mo74318e(6, this.f138257i);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138252d) + 0 + C52418a.m58678e(2, this.f138253e);
            String str2 = this.f138254f;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f138255g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f138256h) + C52418a.m58678e(6, this.f138257i);
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
            mw4 mw4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    mw4.f138252d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    mw4.f138253e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mw4.f138254f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mw4.f138255g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    mw4.f138256h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mw4.f138257i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
