package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.oi */
public class C50685oi extends C47465a {

    /* renamed from: d */
    public int f139188d;

    /* renamed from: e */
    public int f139189e;

    /* renamed from: f */
    public int f139190f;

    /* renamed from: g */
    public String f139191g;

    /* renamed from: h */
    public String f139192h;

    /* renamed from: i */
    public String f139193i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50685oi)) {
            return false;
        }
        C50685oi oiVar = (C50685oi) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f139188d), Integer.valueOf(oiVar.f139188d)) && C46238a.m51546a(Integer.valueOf(this.f139189e), Integer.valueOf(oiVar.f139189e)) && C46238a.m51546a(Integer.valueOf(this.f139190f), Integer.valueOf(oiVar.f139190f)) && C46238a.m51546a(this.f139191g, oiVar.f139191g) && C46238a.m51546a(this.f139192h, oiVar.f139192h) && C46238a.m51546a(this.f139193i, oiVar.f139193i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f139188d);
            aVar.mo74318e(2, this.f139189e);
            aVar.mo74318e(3, this.f139190f);
            String str = this.f139191g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f139192h;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f139193i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f139188d) + 0 + C52418a.m58678e(2, this.f139189e) + C52418a.m58678e(3, this.f139190f);
            String str4 = this.f139191g;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            String str5 = this.f139192h;
            if (str5 != null) {
                e += C52418a.m58683j(5, str5);
            }
            String str6 = this.f139193i;
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
            C50685oi oiVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    oiVar.f139188d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    oiVar.f139189e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    oiVar.f139190f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    oiVar.f139191g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    oiVar.f139192h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    oiVar.f139193i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
