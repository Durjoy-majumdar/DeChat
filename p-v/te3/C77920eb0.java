package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eb0 */
public class C77920eb0 extends C47465a {

    /* renamed from: d */
    public long f227241d;

    /* renamed from: e */
    public String f227242e;

    /* renamed from: f */
    public long f227243f;

    /* renamed from: g */
    public long f227244g;

    /* renamed from: h */
    public String f227245h;

    /* renamed from: i */
    public String f227246i;

    /* renamed from: j */
    public int f227247j;

    /* renamed from: n */
    public String f227248n;

    /* renamed from: o */
    public boolean f227249o;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77920eb0)) {
            return false;
        }
        C77920eb0 eb02 = (C77920eb0) aVar;
        return C46238a.m51546a(Long.valueOf(this.f227241d), Long.valueOf(eb02.f227241d)) && C46238a.m51546a(this.f227242e, eb02.f227242e) && C46238a.m51546a(Long.valueOf(this.f227243f), Long.valueOf(eb02.f227243f)) && C46238a.m51546a(Long.valueOf(this.f227244g), Long.valueOf(eb02.f227244g)) && C46238a.m51546a(this.f227245h, eb02.f227245h) && C46238a.m51546a(this.f227246i, eb02.f227246i) && C46238a.m51546a(Integer.valueOf(this.f227247j), Integer.valueOf(eb02.f227247j)) && C46238a.m51546a(this.f227248n, eb02.f227248n) && C46238a.m51546a(Boolean.valueOf(this.f227249o), Boolean.valueOf(eb02.f227249o));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(5, this.f227241d);
            String str = this.f227242e;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            aVar.mo74321h(10, this.f227243f);
            aVar.mo74321h(11, this.f227244g);
            String str2 = this.f227245h;
            if (str2 != null) {
                aVar.mo74323j(12, str2);
            }
            String str3 = this.f227246i;
            if (str3 != null) {
                aVar.mo74323j(13, str3);
            }
            aVar.mo74318e(16, this.f227247j);
            String str4 = this.f227248n;
            if (str4 != null) {
                aVar.mo74323j(17, str4);
            }
            aVar.mo74314a(18, this.f227249o);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(5, this.f227241d) + 0;
            String str5 = this.f227242e;
            if (str5 != null) {
                h += C52418a.m58683j(6, str5);
            }
            int h2 = h + C52418a.m58681h(10, this.f227243f) + C52418a.m58681h(11, this.f227244g);
            String str6 = this.f227245h;
            if (str6 != null) {
                h2 += C52418a.m58683j(12, str6);
            }
            String str7 = this.f227246i;
            if (str7 != null) {
                h2 += C52418a.m58683j(13, str7);
            }
            int e = h2 + C52418a.m58678e(16, this.f227247j);
            String str8 = this.f227248n;
            if (str8 != null) {
                e += C52418a.m58683j(17, str8);
            }
            return e + C52418a.m58674a(18, this.f227249o);
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
            C77920eb0 eb02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 5:
                    eb02.f227241d = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    eb02.f227242e = aVar3.mo141633k(intValue);
                    return 0;
                case 10:
                    eb02.f227243f = aVar3.mo141631i(intValue);
                    return 0;
                case 11:
                    eb02.f227244g = aVar3.mo141631i(intValue);
                    return 0;
                case 12:
                    eb02.f227245h = aVar3.mo141633k(intValue);
                    return 0;
                case 13:
                    eb02.f227246i = aVar3.mo141633k(intValue);
                    return 0;
                case 16:
                    eb02.f227247j = aVar3.mo141629g(intValue);
                    return 0;
                case 17:
                    eb02.f227248n = aVar3.mo141633k(intValue);
                    return 0;
                case 18:
                    eb02.f227249o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
