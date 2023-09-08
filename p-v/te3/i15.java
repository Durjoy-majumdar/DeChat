package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class i15 extends C47465a {

    /* renamed from: d */
    public int f135027d;

    /* renamed from: e */
    public String f135028e;

    /* renamed from: f */
    public C89349b f135029f;

    /* renamed from: g */
    public C89349b f135030g;

    /* renamed from: h */
    public String f135031h;

    /* renamed from: i */
    public String f135032i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof i15)) {
            return false;
        }
        i15 i15 = (i15) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f135027d), Integer.valueOf(i15.f135027d)) && C46238a.m51546a(this.f135028e, i15.f135028e) && C46238a.m51546a(this.f135029f, i15.f135029f) && C46238a.m51546a(this.f135030g, i15.f135030g) && C46238a.m51546a(this.f135031h, i15.f135031h) && C46238a.m51546a(this.f135032i, i15.f135032i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f135028e != null) {
                aVar.mo74318e(1, this.f135027d);
                String str = this.f135028e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                C89349b bVar = this.f135029f;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                C89349b bVar2 = this.f135030g;
                if (bVar2 != null) {
                    aVar.mo74315b(4, bVar2);
                }
                String str2 = this.f135031h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f135032i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: Msg");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f135027d) + 0;
            String str4 = this.f135028e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            C89349b bVar3 = this.f135029f;
            if (bVar3 != null) {
                e += C52418a.m58675b(3, bVar3);
            }
            C89349b bVar4 = this.f135030g;
            if (bVar4 != null) {
                e += C52418a.m58675b(4, bVar4);
            }
            String str5 = this.f135031h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f135032i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f135028e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: Msg");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            i15 i15 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    i15.f135027d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    i15.f135028e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    i15.f135029f = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    i15.f135030g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    i15.f135031h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    i15.f135032i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
