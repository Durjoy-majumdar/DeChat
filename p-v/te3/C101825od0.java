package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.od0 */
public class C101825od0 extends C47465a {

    /* renamed from: d */
    public int f299029d;

    /* renamed from: e */
    public int f299030e;

    /* renamed from: f */
    public int f299031f;

    /* renamed from: g */
    public String f299032g;

    /* renamed from: h */
    public int f299033h;

    /* renamed from: i */
    public String f299034i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C101825od0)) {
            return false;
        }
        C101825od0 od02 = (C101825od0) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f299029d), Integer.valueOf(od02.f299029d)) && C46238a.m51546a(Integer.valueOf(this.f299030e), Integer.valueOf(od02.f299030e)) && C46238a.m51546a(Integer.valueOf(this.f299031f), Integer.valueOf(od02.f299031f)) && C46238a.m51546a(this.f299032g, od02.f299032g) && C46238a.m51546a(Integer.valueOf(this.f299033h), Integer.valueOf(od02.f299033h)) && C46238a.m51546a(this.f299034i, od02.f299034i);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f299029d);
            aVar.mo74318e(2, this.f299030e);
            aVar.mo74318e(3, this.f299031f);
            String str = this.f299032g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f299033h);
            String str2 = this.f299034i;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f299029d) + 0 + C52418a.m58678e(2, this.f299030e) + C52418a.m58678e(3, this.f299031f);
            String str3 = this.f299032g;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f299033h);
            String str4 = this.f299034i;
            return str4 != null ? e2 + C52418a.m58683j(6, str4) : e2;
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
            C101825od0 od02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    od02.f299029d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    od02.f299030e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    od02.f299031f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    od02.f299032g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    od02.f299033h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    od02.f299034i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
