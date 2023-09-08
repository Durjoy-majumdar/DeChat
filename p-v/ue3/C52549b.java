package ue3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ue3.b */
public class C52549b extends C47465a {

    /* renamed from: d */
    public String f146763d;

    /* renamed from: e */
    public int f146764e;

    /* renamed from: f */
    public String f146765f;

    /* renamed from: g */
    public boolean f146766g;

    /* renamed from: h */
    public boolean f146767h;

    /* renamed from: i */
    public boolean f146768i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52549b)) {
            return false;
        }
        C52549b bVar = (C52549b) aVar;
        return C46238a.m51546a(this.f146763d, bVar.f146763d) && C46238a.m51546a(Integer.valueOf(this.f146764e), Integer.valueOf(bVar.f146764e)) && C46238a.m51546a(this.f146765f, bVar.f146765f) && C46238a.m51546a(Boolean.valueOf(this.f146766g), Boolean.valueOf(bVar.f146766g)) && C46238a.m51546a(Boolean.valueOf(this.f146767h), Boolean.valueOf(bVar.f146767h)) && C46238a.m51546a(Boolean.valueOf(this.f146768i), Boolean.valueOf(bVar.f146768i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f146763d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f146764e);
            String str2 = this.f146765f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            aVar.mo74314a(5, this.f146766g);
            aVar.mo74314a(11, this.f146767h);
            aVar.mo74314a(12, this.f146768i);
            return 0;
        } else if (i == 1) {
            String str3 = this.f146763d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f146764e);
            String str4 = this.f146765f;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            return e + C52418a.m58674a(5, this.f146766g) + C52418a.m58674a(11, this.f146767h) + C52418a.m58674a(12, this.f146768i);
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
            C52549b bVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bVar.f146763d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bVar.f146764e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                bVar.f146765f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                bVar.f146766g = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue == 11) {
                bVar.f146767h = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 12) {
                return -1;
            } else {
                bVar.f146768i = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
