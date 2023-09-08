package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wy */
public class C51892wy extends C47465a {

    /* renamed from: d */
    public String f144345d;

    /* renamed from: e */
    public String f144346e;

    /* renamed from: f */
    public int f144347f;

    /* renamed from: g */
    public String f144348g;

    /* renamed from: h */
    public String f144349h;

    /* renamed from: i */
    public int f144350i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51892wy)) {
            return false;
        }
        C51892wy wyVar = (C51892wy) aVar;
        return C46238a.m51546a(this.f144345d, wyVar.f144345d) && C46238a.m51546a(this.f144346e, wyVar.f144346e) && C46238a.m51546a(Integer.valueOf(this.f144347f), Integer.valueOf(wyVar.f144347f)) && C46238a.m51546a(this.f144348g, wyVar.f144348g) && C46238a.m51546a(this.f144349h, wyVar.f144349h) && C46238a.m51546a(Integer.valueOf(this.f144350i), Integer.valueOf(wyVar.f144350i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144345d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144346e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f144347f);
            String str3 = this.f144348g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144349h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            aVar.mo74318e(6, this.f144350i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f144345d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f144346e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int e = i2 + C52418a.m58678e(3, this.f144347f);
            String str7 = this.f144348g;
            if (str7 != null) {
                e += C52418a.m58683j(4, str7);
            }
            String str8 = this.f144349h;
            if (str8 != null) {
                e += C52418a.m58683j(5, str8);
            }
            return e + C52418a.m58678e(6, this.f144350i);
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
            C51892wy wyVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    wyVar.f144345d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    wyVar.f144346e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    wyVar.f144347f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    wyVar.f144348g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    wyVar.f144349h = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    wyVar.f144350i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
