package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class eh4 extends C47465a {

    /* renamed from: d */
    public String f132930d;

    /* renamed from: e */
    public String f132931e;

    /* renamed from: f */
    public String f132932f;

    /* renamed from: g */
    public int f132933g;

    /* renamed from: h */
    public String f132934h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof eh4)) {
            return false;
        }
        eh4 eh4 = (eh4) aVar;
        return C46238a.m51546a(this.f132930d, eh4.f132930d) && C46238a.m51546a(this.f132931e, eh4.f132931e) && C46238a.m51546a(this.f132932f, eh4.f132932f) && C46238a.m51546a(Integer.valueOf(this.f132933g), Integer.valueOf(eh4.f132933g)) && C46238a.m51546a(this.f132934h, eh4.f132934h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f132930d;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            String str2 = this.f132931e;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f132932f;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            aVar.mo74318e(7, this.f132933g);
            String str4 = this.f132934h;
            if (str4 != null) {
                aVar.mo74323j(8, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f132930d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(4, str5);
            }
            String str6 = this.f132931e;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            String str7 = this.f132932f;
            if (str7 != null) {
                i2 += C52418a.m58683j(6, str7);
            }
            int e = i2 + C52418a.m58678e(7, this.f132933g);
            String str8 = this.f132934h;
            return str8 != null ? e + C52418a.m58683j(8, str8) : e;
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
            eh4 eh4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 4:
                    eh4.f132930d = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eh4.f132931e = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    eh4.f132932f = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    eh4.f132933g = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    eh4.f132934h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
