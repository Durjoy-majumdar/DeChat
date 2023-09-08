package tw1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.g */
public class C52373g extends C47465a {

    /* renamed from: d */
    public String f146385d;

    /* renamed from: e */
    public String f146386e;

    /* renamed from: f */
    public int f146387f;

    /* renamed from: g */
    public int f146388g;

    /* renamed from: h */
    public int f146389h;

    /* renamed from: i */
    public String f146390i;

    /* renamed from: j */
    public long f146391j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52373g)) {
            return false;
        }
        C52373g gVar = (C52373g) aVar;
        return C46238a.m51546a(this.f146385d, gVar.f146385d) && C46238a.m51546a(this.f146386e, gVar.f146386e) && C46238a.m51546a(Integer.valueOf(this.f146387f), Integer.valueOf(gVar.f146387f)) && C46238a.m51546a(Integer.valueOf(this.f146388g), Integer.valueOf(gVar.f146388g)) && C46238a.m51546a(Integer.valueOf(this.f146389h), Integer.valueOf(gVar.f146389h)) && C46238a.m51546a(this.f146390i, gVar.f146390i) && C46238a.m51546a(Long.valueOf(this.f146391j), Long.valueOf(gVar.f146391j));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146385d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f146386e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74318e(3, this.f146387f);
            aVar.mo74318e(4, this.f146388g);
            aVar.mo74318e(5, this.f146389h);
            String str3 = this.f146390i;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74321h(7, this.f146391j);
            return 0;
        } else if (i == 1) {
            String str4 = this.f146385d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f146386e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            int e = i2 + C52418a.m58678e(3, this.f146387f) + C52418a.m58678e(4, this.f146388g) + C52418a.m58678e(5, this.f146389h);
            String str6 = this.f146390i;
            if (str6 != null) {
                e += C52418a.m58683j(6, str6);
            }
            return e + C52418a.m58681h(7, this.f146391j);
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
            C52373g gVar = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    gVar.f146385d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    gVar.f146386e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    gVar.f146387f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    gVar.f146388g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    gVar.f146389h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    gVar.f146390i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    gVar.f146391j = aVar3.mo141631i(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
