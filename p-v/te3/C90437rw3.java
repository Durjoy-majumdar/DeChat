package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rw3 */
public class C90437rw3 extends C47465a {

    /* renamed from: d */
    public String f259822d;

    /* renamed from: e */
    public String f259823e;

    /* renamed from: f */
    public int f259824f;

    /* renamed from: g */
    public String f259825g;

    /* renamed from: h */
    public String f259826h;

    /* renamed from: i */
    public String f259827i;

    /* renamed from: j */
    public String f259828j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90437rw3)) {
            return false;
        }
        C90437rw3 rw32 = (C90437rw3) aVar;
        return C46238a.m51546a(this.f259822d, rw32.f259822d) && C46238a.m51546a(this.f259823e, rw32.f259823e) && C46238a.m51546a(Integer.valueOf(this.f259824f), Integer.valueOf(rw32.f259824f)) && C46238a.m51546a(this.f259825g, rw32.f259825g) && C46238a.m51546a(this.f259826h, rw32.f259826h) && C46238a.m51546a(this.f259827i, rw32.f259827i) && C46238a.m51546a(this.f259828j, rw32.f259828j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f259822d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f259823e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f259824f);
            String str3 = this.f259825g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f259826h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            String str5 = this.f259827i;
            if (str5 != null) {
                aVar.mo74323j(6, str5);
            }
            String str6 = this.f259828j;
            if (str6 != null) {
                aVar.mo74323j(7, str6);
            }
            return 0;
        } else if (i == 1) {
            String str7 = this.f259822d;
            if (str7 != null) {
                i2 = 0 + C52418a.m58683j(1, str7);
            }
            String str8 = this.f259823e;
            if (str8 != null) {
                i2 += C52418a.m58683j(2, str8);
            }
            int e = i2 + C52418a.m58678e(3, this.f259824f);
            String str9 = this.f259825g;
            if (str9 != null) {
                e += C52418a.m58683j(4, str9);
            }
            String str10 = this.f259826h;
            if (str10 != null) {
                e += C52418a.m58683j(5, str10);
            }
            String str11 = this.f259827i;
            if (str11 != null) {
                e += C52418a.m58683j(6, str11);
            }
            String str12 = this.f259828j;
            return str12 != null ? e + C52418a.m58683j(7, str12) : e;
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
            C90437rw3 rw32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    rw32.f259822d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    rw32.f259823e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    rw32.f259824f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    rw32.f259825g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    rw32.f259826h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    rw32.f259827i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    rw32.f259828j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
