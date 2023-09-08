package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oz2 */
public class C50758oz2 extends C47465a {

    /* renamed from: d */
    public int f139463d;

    /* renamed from: e */
    public int f139464e;

    /* renamed from: f */
    public C89349b f139465f;

    /* renamed from: g */
    public String f139466g;

    /* renamed from: h */
    public String f139467h;

    /* renamed from: i */
    public String f139468i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50758oz2)) {
            return false;
        }
        C50758oz2 oz22 = (C50758oz2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139463d), Integer.valueOf(oz22.f139463d)) && C46238a.m51546a(Integer.valueOf(this.f139464e), Integer.valueOf(oz22.f139464e)) && C46238a.m51546a(this.f139465f, oz22.f139465f) && C46238a.m51546a(this.f139466g, oz22.f139466g) && C46238a.m51546a(this.f139467h, oz22.f139467h) && C46238a.m51546a(this.f139468i, oz22.f139468i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139463d);
            aVar.mo74318e(2, this.f139464e);
            C89349b bVar = this.f139465f;
            if (bVar != null) {
                aVar.mo74315b(3, bVar);
            }
            String str = this.f139466g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f139467h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f139468i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139463d) + 0 + C52418a.m58678e(2, this.f139464e);
            C89349b bVar2 = this.f139465f;
            if (bVar2 != null) {
                e += C52418a.m58675b(3, bVar2);
            }
            String str4 = this.f139466g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f139467h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f139468i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
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
            C50758oz2 oz22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oz22.f139463d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oz22.f139464e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oz22.f139465f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    oz22.f139466g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oz22.f139467h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oz22.f139468i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
