package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.we3 */
public class C51824we3 extends C47465a {

    /* renamed from: d */
    public int f143996d;

    /* renamed from: e */
    public int f143997e;

    /* renamed from: f */
    public int f143998f;

    /* renamed from: g */
    public int f143999g;

    /* renamed from: h */
    public int f144000h;

    /* renamed from: i */
    public String f144001i;

    /* renamed from: j */
    public String f144002j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51824we3)) {
            return false;
        }
        C51824we3 we32 = (C51824we3) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f143996d), Integer.valueOf(we32.f143996d)) && C46238a.m51546a(Integer.valueOf(this.f143997e), Integer.valueOf(we32.f143997e)) && C46238a.m51546a(Integer.valueOf(this.f143998f), Integer.valueOf(we32.f143998f)) && C46238a.m51546a(Integer.valueOf(this.f143999g), Integer.valueOf(we32.f143999g)) && C46238a.m51546a(Integer.valueOf(this.f144000h), Integer.valueOf(we32.f144000h)) && C46238a.m51546a(this.f144001i, we32.f144001i) && C46238a.m51546a(this.f144002j, we32.f144002j);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f143996d);
            aVar.mo74318e(2, this.f143997e);
            aVar.mo74318e(3, this.f143998f);
            aVar.mo74318e(4, this.f143999g);
            aVar.mo74318e(5, this.f144000h);
            String str = this.f144001i;
            if (str != null) {
                aVar.mo74323j(6, str);
            }
            String str2 = this.f144002j;
            if (str2 != null) {
                aVar.mo74323j(7, str2);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f143996d) + 0 + C52418a.m58678e(2, this.f143997e) + C52418a.m58678e(3, this.f143998f) + C52418a.m58678e(4, this.f143999g) + C52418a.m58678e(5, this.f144000h);
            String str3 = this.f144001i;
            if (str3 != null) {
                e += C52418a.m58683j(6, str3);
            }
            String str4 = this.f144002j;
            return str4 != null ? e + C52418a.m58683j(7, str4) : e;
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
            C51824we3 we32 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    we32.f143996d = aVar3.mo141629g(intValue);
                    return 0;
                case 2:
                    we32.f143997e = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    we32.f143998f = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    we32.f143999g = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    we32.f144000h = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    we32.f144001i = aVar3.mo141633k(intValue);
                    return 0;
                case 7:
                    we32.f144002j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
