package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.io2 */
public class C49878io2 extends C47465a {

    /* renamed from: d */
    public String f135542d;

    /* renamed from: e */
    public String f135543e;

    /* renamed from: f */
    public String f135544f;

    /* renamed from: g */
    public String f135545g;

    /* renamed from: h */
    public int f135546h;

    /* renamed from: i */
    public int f135547i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49878io2)) {
            return false;
        }
        C49878io2 io22 = (C49878io2) aVar;
        return C46238a.m51546a(this.f135542d, io22.f135542d) && C46238a.m51546a(this.f135543e, io22.f135543e) && C46238a.m51546a(this.f135544f, io22.f135544f) && C46238a.m51546a(this.f135545g, io22.f135545g) && C46238a.m51546a(Integer.valueOf(this.f135546h), Integer.valueOf(io22.f135546h)) && C46238a.m51546a(Integer.valueOf(this.f135547i), Integer.valueOf(io22.f135547i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f135542d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f135543e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f135544f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            String str4 = this.f135545g;
            if (str4 != null) {
                aVar.mo74323j(4, str4);
            }
            aVar.mo74318e(5, this.f135546h);
            aVar.mo74318e(6, this.f135547i);
            return 0;
        } else if (i == 1) {
            String str5 = this.f135542d;
            if (str5 != null) {
                i2 = 0 + C52418a.m58683j(1, str5);
            }
            String str6 = this.f135543e;
            if (str6 != null) {
                i2 += C52418a.m58683j(2, str6);
            }
            String str7 = this.f135544f;
            if (str7 != null) {
                i2 += C52418a.m58683j(3, str7);
            }
            String str8 = this.f135545g;
            if (str8 != null) {
                i2 += C52418a.m58683j(4, str8);
            }
            return i2 + C52418a.m58678e(5, this.f135546h) + C52418a.m58678e(6, this.f135547i);
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
            C49878io2 io22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    io22.f135542d = aVar3.mo141633k(intValue);
                    return 0;
                case 2:
                    io22.f135543e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    io22.f135544f = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    io22.f135545g = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    io22.f135546h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    io22.f135547i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
