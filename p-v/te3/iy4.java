package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class iy4 extends C47465a {

    /* renamed from: d */
    public float f135758d;

    /* renamed from: e */
    public float f135759e;

    /* renamed from: f */
    public String f135760f;

    /* renamed from: g */
    public String f135761g;

    /* renamed from: h */
    public String f135762h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof iy4)) {
            return false;
        }
        iy4 iy4 = (iy4) aVar;
        return C46238a.m51546a(Float.valueOf(this.f135758d), Float.valueOf(iy4.f135758d)) && C46238a.m51546a(Float.valueOf(this.f135759e), Float.valueOf(iy4.f135759e)) && C46238a.m51546a(this.f135760f, iy4.f135760f) && C46238a.m51546a(this.f135761g, iy4.f135761g) && C46238a.m51546a(this.f135762h, iy4.f135762h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74317d(1, this.f135758d);
            aVar.mo74317d(2, this.f135759e);
            String str = this.f135760f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f135761g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f135762h;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            return 0;
        } else if (i == 1) {
            int d = C52418a.m58677d(1, this.f135758d) + 0 + C52418a.m58677d(2, this.f135759e);
            String str4 = this.f135760f;
            if (str4 != null) {
                d += C52418a.m58683j(3, str4);
            }
            String str5 = this.f135761g;
            if (str5 != null) {
                d += C52418a.m58683j(4, str5);
            }
            String str6 = this.f135762h;
            return str6 != null ? d + C52418a.m58683j(5, str6) : d;
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
            iy4 iy4 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iy4.f135758d = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 2) {
                iy4.f135759e = aVar3.mo141628f(intValue);
                return 0;
            } else if (intValue == 3) {
                iy4.f135760f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                iy4.f135761g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                iy4.f135762h = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
