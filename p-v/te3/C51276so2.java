package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.so2 */
public class C51276so2 extends C47465a {

    /* renamed from: d */
    public boolean f141651d;

    /* renamed from: e */
    public String f141652e;

    /* renamed from: f */
    public long f141653f;

    /* renamed from: g */
    public long f141654g;

    /* renamed from: h */
    public boolean f141655h;

    /* renamed from: i */
    public int f141656i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51276so2)) {
            return false;
        }
        C51276so2 so22 = (C51276so2) aVar;
        return C46238a.m51546a(Boolean.valueOf(this.f141651d), Boolean.valueOf(so22.f141651d)) && C46238a.m51546a(this.f141652e, so22.f141652e) && C46238a.m51546a(Long.valueOf(this.f141653f), Long.valueOf(so22.f141653f)) && C46238a.m51546a(Long.valueOf(this.f141654g), Long.valueOf(so22.f141654g)) && C46238a.m51546a(Boolean.valueOf(this.f141655h), Boolean.valueOf(so22.f141655h)) && C46238a.m51546a(Integer.valueOf(this.f141656i), Integer.valueOf(so22.f141656i));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74314a(1, this.f141651d);
            String str = this.f141652e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74321h(3, this.f141653f);
            aVar.mo74321h(4, this.f141654g);
            aVar.mo74314a(5, this.f141655h);
            aVar.mo74318e(6, this.f141656i);
            return 0;
        } else if (i == 1) {
            int a = C52418a.m58674a(1, this.f141651d) + 0;
            String str2 = this.f141652e;
            if (str2 != null) {
                a += C52418a.m58683j(2, str2);
            }
            return a + C52418a.m58681h(3, this.f141653f) + C52418a.m58681h(4, this.f141654g) + C52418a.m58674a(5, this.f141655h) + C52418a.m58678e(6, this.f141656i);
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
            C51276so2 so22 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    so22.f141651d = aVar3.mo141625c(intValue);
                    return 0;
                case 2:
                    so22.f141652e = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    so22.f141653f = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    so22.f141654g = aVar3.mo141631i(intValue);
                    return 0;
                case 5:
                    so22.f141655h = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    so22.f141656i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
