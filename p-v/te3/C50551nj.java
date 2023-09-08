package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.nj */
public class C50551nj extends C47465a {

    /* renamed from: d */
    public int f138624d;

    /* renamed from: e */
    public String f138625e;

    /* renamed from: f */
    public int f138626f;

    /* renamed from: g */
    public String f138627g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50551nj)) {
            return false;
        }
        C50551nj njVar = (C50551nj) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f138624d), Integer.valueOf(njVar.f138624d)) && C46238a.m51546a(this.f138625e, njVar.f138625e) && C46238a.m51546a(Integer.valueOf(this.f138626f), Integer.valueOf(njVar.f138626f)) && C46238a.m51546a(this.f138627g, njVar.f138627g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f138624d);
            String str = this.f138625e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f138626f);
            String str2 = this.f138627g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f138624d) + 0;
            String str3 = this.f138625e;
            if (str3 != null) {
                e += C52418a.m58683j(2, str3);
            }
            int e2 = e + C52418a.m58678e(3, this.f138626f);
            String str4 = this.f138627g;
            return str4 != null ? e2 + C52418a.m58683j(4, str4) : e2;
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
            C50551nj njVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                njVar.f138624d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                njVar.f138625e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                njVar.f138626f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                njVar.f138627g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
