package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ig2 */
public class C77947ig2 extends C47465a {

    /* renamed from: d */
    public String f227615d;

    /* renamed from: e */
    public String f227616e;

    /* renamed from: f */
    public String f227617f;

    /* renamed from: g */
    public String f227618g;

    /* renamed from: h */
    public long f227619h;

    /* renamed from: i */
    public int f227620i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C77947ig2)) {
            return false;
        }
        C77947ig2 ig22 = (C77947ig2) aVar;
        return C46238a.m51546a(this.f227615d, ig22.f227615d) && C46238a.m51546a(this.f227616e, ig22.f227616e) && C46238a.m51546a(this.f227617f, ig22.f227617f) && C46238a.m51546a(this.f227618g, ig22.f227618g) && C46238a.m51546a(Long.valueOf(this.f227619h), Long.valueOf(ig22.f227619h)) && C46238a.m51546a(Integer.valueOf(this.f227620i), Integer.valueOf(ig22.f227620i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f227615d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f227616e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f227617f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f227618g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74321h(6, this.f227619h);
            aVar.mo74318e(5, this.f227620i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f227615d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f227616e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f227617f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f227618g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58681h(6, this.f227619h) + C52418a.m58678e(5, this.f227620i);
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
            C77947ig2 ig22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ig22.f227615d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    ig22.f227616e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    ig22.f227617f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    ig22.f227618g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ig22.f227620i = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    ig22.f227619h = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
