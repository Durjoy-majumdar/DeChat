package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class wz4 extends C47465a {

    /* renamed from: d */
    public String f144370d;

    /* renamed from: e */
    public String f144371e;

    /* renamed from: f */
    public float f144372f;

    /* renamed from: g */
    public String f144373g;

    /* renamed from: h */
    public String f144374h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof wz4)) {
            return false;
        }
        wz4 wz4 = (wz4) aVar;
        return C46238a.m51546a(this.f144370d, wz4.f144370d) && C46238a.m51546a(this.f144371e, wz4.f144371e) && C46238a.m51546a(Float.valueOf(this.f144372f), Float.valueOf(wz4.f144372f)) && C46238a.m51546a(this.f144373g, wz4.f144373g) && C46238a.m51546a(this.f144374h, wz4.f144374h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144370d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f144371e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            aVar.mo74317d(3, this.f144372f);
            String str3 = this.f144373g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            String str4 = this.f144374h;
            if (str4 != null) {
                aVar.mo74323j(5, str4);
            }
            return 0;
        } else if (i == 1) {
            String str5 = this.f144370d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f144371e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            int d = i2 + C52418a.m58677d(3, this.f144372f);
            String str7 = this.f144373g;
            if (str7 != null) {
                d += C52418a.m58683j(4, str7);
            }
            String str8 = this.f144374h;
            return str8 != null ? d + C52418a.m58683j(5, str8) : d;
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
            wz4 wz4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wz4.f144370d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                wz4.f144371e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wz4.f144372f = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 4) {
                wz4.f144373g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                wz4.f144374h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
