package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ls1 */
public class C50304ls1 extends C47465a {

    /* renamed from: d */
    public String f137623d;

    /* renamed from: e */
    public int f137624e;

    /* renamed from: f */
    public int f137625f;

    /* renamed from: g */
    public C89349b f137626g;

    /* renamed from: h */
    public String f137627h;

    /* renamed from: i */
    public String f137628i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50304ls1)) {
            return false;
        }
        C50304ls1 ls12 = (C50304ls1) aVar;
        return C46238a.m51546a(this.f137623d, ls12.f137623d) && C46238a.m51546a(Integer.valueOf(this.f137624e), Integer.valueOf(ls12.f137624e)) && C46238a.m51546a(Integer.valueOf(this.f137625f), Integer.valueOf(ls12.f137625f)) && C46238a.m51546a(this.f137626g, ls12.f137626g) && C46238a.m51546a(this.f137627h, ls12.f137627h) && C46238a.m51546a(this.f137628i, ls12.f137628i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137623d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f137626g == null) {
                throw new C52419b("Not all required fields were included: Data");
            } else if (this.f137628i != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f137624e);
                aVar.mo74318e(3, this.f137625f);
                C89349b bVar = this.f137626g;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                String str2 = this.f137627h;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                String str3 = this.f137628i;
                if (str3 != null) {
                    aVar.mo74323j(6, str3);
                }
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EventInfo");
            }
        } else if (i == 1) {
            String str4 = this.f137623d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            int e = i2 + C52418a.m58678e(2, this.f137624e) + C52418a.m58678e(3, this.f137625f);
            C89349b bVar2 = this.f137626g;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            String str5 = this.f137627h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f137628i;
            return str6 != null ? e + C52418a.m58683j(6, str6) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f137623d == null) {
                throw new C52419b("Not all required fields were included: AppId");
            } else if (this.f137626g == null) {
                throw new C52419b("Not all required fields were included: Data");
            } else if (this.f137628i != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: EventInfo");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50304ls1 ls12 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ls12.f137623d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ls12.f137624e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ls12.f137625f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ls12.f137626g = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    ls12.f137627h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    ls12.f137628i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
