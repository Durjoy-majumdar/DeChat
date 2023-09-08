package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.h90 */
public class C49674h90 extends C47465a {

    /* renamed from: d */
    public int f134511d;

    /* renamed from: e */
    public String f134512e;

    /* renamed from: f */
    public String f134513f;

    /* renamed from: g */
    public int f134514g;

    /* renamed from: h */
    public String f134515h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49674h90)) {
            return false;
        }
        C49674h90 h902 = (C49674h90) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f134511d), Integer.valueOf(h902.f134511d)) && C46238a.m51546a(this.f134512e, h902.f134512e) && C46238a.m51546a(this.f134513f, h902.f134513f) && C46238a.m51546a(Integer.valueOf(this.f134514g), Integer.valueOf(h902.f134514g)) && C46238a.m51546a(this.f134515h, h902.f134515h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f134511d);
            String str = this.f134512e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f134513f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74318e(4, this.f134514g);
            String str3 = this.f134515h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f134511d) + 0;
            String str4 = this.f134512e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f134513f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            int e2 = e + C52418a.m58678e(4, this.f134514g);
            String str6 = this.f134515h;
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
            C49674h90 h902 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                h902.f134511d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                h902.f134512e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                h902.f134513f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                h902.f134514g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                h902.f134515h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
