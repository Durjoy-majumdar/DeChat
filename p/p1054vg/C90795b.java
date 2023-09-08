package p1054vg;

import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: vg.b */
public class C90795b extends C47465a {

    /* renamed from: d */
    public String f260727d;

    /* renamed from: e */
    public int f260728e;

    /* renamed from: f */
    public String f260729f;

    /* renamed from: g */
    public int f260730g;

    /* renamed from: h */
    public String f260731h;

    /* renamed from: i */
    public String f260732i;

    /* renamed from: j */
    public boolean f260733j;

    /* renamed from: n */
    public int f260734n;

    /* renamed from: o */
    public boolean f260735o;

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f260727d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f260728e);
                String str2 = this.f260729f;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f260730g);
                String str3 = this.f260731h;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                String str4 = this.f260732i;
                if (str4 != null) {
                    aVar.mo74323j(6, str4);
                }
                aVar.mo74314a(7, this.f260733j);
                aVar.mo74318e(8, this.f260734n);
                aVar.mo74314a(9, this.f260735o);
                return 0;
            }
            throw new C52419b("Not all required fields were included: apkMd5");
        } else if (i == 1) {
            String str5 = this.f260727d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            int e = i2 + C52418a.m58678e(2, this.f260728e);
            String str6 = this.f260729f;
            if (str6 != null) {
                e += C52418a.m58683j(3, str6);
            }
            int e2 = e + C52418a.m58678e(4, this.f260730g);
            String str7 = this.f260731h;
            if (str7 != null) {
                e2 += C52418a.m58683j(5, str7);
            }
            String str8 = this.f260732i;
            if (str8 != null) {
                e2 += C52418a.m58683j(6, str8);
            }
            return e2 + C52418a.m58674a(7, this.f260733j) + C52418a.m58678e(8, this.f260734n) + C52418a.m58674a(9, this.f260735o);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f260727d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: apkMd5");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C90795b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    bVar.f260727d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    bVar.f260728e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    bVar.f260729f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    bVar.f260730g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    bVar.f260731h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    bVar.f260732i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    bVar.f260733j = aVar3.mo141625c(intValue);
                    return 0;
                case 8:
                    bVar.f260734n = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    bVar.f260735o = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
