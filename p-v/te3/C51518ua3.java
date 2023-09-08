package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ua3 */
public class C51518ua3 extends C47465a {

    /* renamed from: d */
    public int f142701d;

    /* renamed from: e */
    public int f142702e;

    /* renamed from: f */
    public int f142703f;

    /* renamed from: g */
    public String f142704g;

    /* renamed from: h */
    public long f142705h;

    /* renamed from: i */
    public int f142706i;

    /* renamed from: j */
    public String f142707j;

    /* renamed from: n */
    public int f142708n;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51518ua3)) {
            return false;
        }
        C51518ua3 ua32 = (C51518ua3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f142701d), Integer.valueOf(ua32.f142701d)) && C46238a.m51546a(Integer.valueOf(this.f142702e), Integer.valueOf(ua32.f142702e)) && C46238a.m51546a(Integer.valueOf(this.f142703f), Integer.valueOf(ua32.f142703f)) && C46238a.m51546a(this.f142704g, ua32.f142704g) && C46238a.m51546a(Long.valueOf(this.f142705h), Long.valueOf(ua32.f142705h)) && C46238a.m51546a(Integer.valueOf(this.f142706i), Integer.valueOf(ua32.f142706i)) && C46238a.m51546a(this.f142707j, ua32.f142707j) && C46238a.m51546a(Integer.valueOf(this.f142708n), Integer.valueOf(ua32.f142708n));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f142701d);
            aVar.mo74318e(2, this.f142702e);
            aVar.mo74318e(3, this.f142703f);
            String str = this.f142704g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74321h(5, this.f142705h);
            aVar.mo74318e(6, this.f142706i);
            String str2 = this.f142707j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            aVar.mo74318e(8, this.f142708n);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f142701d) + 0 + C52418a.m58678e(2, this.f142702e) + C52418a.m58678e(3, this.f142703f);
            String str3 = this.f142704g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int h = e + C52418a.m58681h(5, this.f142705h) + C52418a.m58678e(6, this.f142706i);
            String str4 = this.f142707j;
            if (str4 != null) {
                h += C52418a.m58683j(7, str4);
            }
            return h + C52418a.m58678e(8, this.f142708n);
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
            C51518ua3 ua32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    ua32.f142701d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    ua32.f142702e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ua32.f142703f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    ua32.f142704g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    ua32.f142705h = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    ua32.f142706i = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    ua32.f142707j = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    ua32.f142708n = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
