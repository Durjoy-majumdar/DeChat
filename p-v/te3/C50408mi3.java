package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mi3 */
public class C50408mi3 extends C47465a {

    /* renamed from: d */
    public int f138051d;

    /* renamed from: e */
    public String f138052e;

    /* renamed from: f */
    public int f138053f;

    /* renamed from: g */
    public String f138054g;

    /* renamed from: h */
    public String f138055h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50408mi3)) {
            return false;
        }
        C50408mi3 mi32 = (C50408mi3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138051d), Integer.valueOf(mi32.f138051d)) && C46238a.m51546a(this.f138052e, mi32.f138052e) && C46238a.m51546a(Integer.valueOf(this.f138053f), Integer.valueOf(mi32.f138053f)) && C46238a.m51546a(this.f138054g, mi32.f138054g) && C46238a.m51546a(this.f138055h, mi32.f138055h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138051d);
            String str = this.f138052e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138053f);
            String str2 = this.f138054g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f138055h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138051d) + 0;
            String str4 = this.f138052e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            int e2 = e + C52418a.m58678e(3, this.f138053f);
            String str5 = this.f138054g;
            if (str5 != null) {
                e2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f138055h;
            return str6 != null ? e2 + C52418a.m58683j(5, str6) : e2;
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
            C50408mi3 mi32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                mi32.f138051d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                mi32.f138052e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                mi32.f138053f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                mi32.f138054g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                mi32.f138055h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
