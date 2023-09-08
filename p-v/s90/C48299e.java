package s90;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: s90.e */
public class C48299e extends C47465a {

    /* renamed from: d */
    public String f129336d;

    /* renamed from: e */
    public int f129337e;

    /* renamed from: f */
    public int f129338f;

    /* renamed from: g */
    public String f129339g;

    /* renamed from: h */
    public long f129340h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48299e)) {
            return false;
        }
        C48299e eVar = (C48299e) aVar;
        return C46238a.m51546a(this.f129336d, eVar.f129336d) && C46238a.m51546a(Integer.valueOf(this.f129337e), Integer.valueOf(eVar.f129337e)) && C46238a.m51546a(Integer.valueOf(this.f129338f), Integer.valueOf(eVar.f129338f)) && C46238a.m51546a(this.f129339g, eVar.f129339g) && C46238a.m51546a(Long.valueOf(this.f129340h), Long.valueOf(eVar.f129340h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f129336d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f129337e);
            aVar.mo74318e(3, this.f129338f);
            String str2 = this.f129339g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74321h(5, this.f129340h);
            return 0;
        } else if (i == 1) {
            String str3 = this.f129336d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f129337e) + C52418a.m58678e(3, this.f129338f);
            String str4 = this.f129339g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58681h(5, this.f129340h);
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
            C48299e eVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                eVar.f129336d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                eVar.f129337e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                eVar.f129338f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                eVar.f129339g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                eVar.f129340h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
