package te3;

import if0.C46238a;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ly */
public class C50325ly extends C47465a {

    /* renamed from: d */
    public String f137698d;

    /* renamed from: e */
    public String f137699e;

    /* renamed from: f */
    public String f137700f;

    /* renamed from: g */
    public String f137701g;

    /* renamed from: h */
    public String f137702h;

    /* renamed from: i */
    public C89349b f137703i;

    /* renamed from: j */
    public int f137704j;

    /* renamed from: n */
    public int f137705n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50325ly)) {
            return false;
        }
        C50325ly lyVar = (C50325ly) aVar;
        return C46238a.m51546a(this.f137698d, lyVar.f137698d) && C46238a.m51546a(this.f137699e, lyVar.f137699e) && C46238a.m51546a(this.f137700f, lyVar.f137700f) && C46238a.m51546a(this.f137701g, lyVar.f137701g) && C46238a.m51546a(this.f137702h, lyVar.f137702h) && C46238a.m51546a(this.f137703i, lyVar.f137703i) && C46238a.m51546a(Integer.valueOf(this.f137704j), Integer.valueOf(lyVar.f137704j)) && C46238a.m51546a(Integer.valueOf(this.f137705n), Integer.valueOf(lyVar.f137705n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f137698d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f137699e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f137700f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f137701g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            String str5 = this.f137702h;
            if (str5 != null) {
                aVar.mo74323j(5, str5);
            }
            C89349b bVar = this.f137703i;
            if (bVar != null) {
                aVar.mo74315b(6, bVar);
            }
            aVar.mo74318e(7, this.f137704j);
            aVar.mo74318e(8, this.f137705n);
            return 0;
        } else if (i == 1) {
            String str6 = this.f137698d;
            if (str6 != null) {
                i2 = 0 + C52418a.m58683j(1, str6);
            }
            String str7 = this.f137699e;
            if (str7 != null) {
                i2 += C52418a.m58683j(2, str7);
            }
            String str8 = this.f137700f;
            if (str8 != null) {
                i2 += C52418a.m58683j(3, str8);
            }
            String str9 = this.f137701g;
            if (str9 != null) {
                i2 += C52418a.m58683j(4, str9);
            }
            String str10 = this.f137702h;
            if (str10 != null) {
                i2 += C52418a.m58683j(5, str10);
            }
            C89349b bVar2 = this.f137703i;
            if (bVar2 != null) {
                i2 += C52418a.m58675b(6, bVar2);
            }
            return i2 + C52418a.m58678e(7, this.f137704j) + C52418a.m58678e(8, this.f137705n);
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
            C50325ly lyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    lyVar.f137698d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    lyVar.f137699e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    lyVar.f137700f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    lyVar.f137701g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    lyVar.f137702h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    lyVar.f137703i = aVar3.mo141626d(intValue);
                    return 0;
                case 7:
                    lyVar.f137704j = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    lyVar.f137705n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
