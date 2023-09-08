package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fs0 */
public class C64373fs0 extends C47465a {

    /* renamed from: d */
    public String f183213d;

    /* renamed from: e */
    public String f183214e;

    /* renamed from: f */
    public int f183215f;

    /* renamed from: g */
    public String f183216g;

    /* renamed from: h */
    public int f183217h;

    /* renamed from: i */
    public int f183218i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64373fs0)) {
            return false;
        }
        C64373fs0 fs02 = (C64373fs0) aVar;
        return C46238a.m51546a(this.f183213d, fs02.f183213d) && C46238a.m51546a(this.f183214e, fs02.f183214e) && C46238a.m51546a(Integer.valueOf(this.f183215f), Integer.valueOf(fs02.f183215f)) && C46238a.m51546a(this.f183216g, fs02.f183216g) && C46238a.m51546a(Integer.valueOf(this.f183217h), Integer.valueOf(fs02.f183217h)) && C46238a.m51546a(Integer.valueOf(this.f183218i), Integer.valueOf(fs02.f183218i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f183213d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f183214e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f183215f);
            String str3 = this.f183216g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            aVar.mo74318e(5, this.f183217h);
            aVar.mo74318e(6, this.f183218i);
            return 0;
        } else if (i == 1) {
            String str4 = this.f183213d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f183214e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f183215f);
            String str6 = this.f183216g;
            if (str6 != null) {
                e += C52418a.m58683j(4, str6);
            }
            return e + C52418a.m58678e(5, this.f183217h) + C52418a.m58678e(6, this.f183218i);
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
            C64373fs0 fs02 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    fs02.f183213d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    fs02.f183214e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fs02.f183215f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    fs02.f183216g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    fs02.f183217h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    fs02.f183218i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
