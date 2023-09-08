package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.iv2 */
public class C64455iv2 extends C47465a {

    /* renamed from: d */
    public int f183740d;

    /* renamed from: e */
    public int f183741e;

    /* renamed from: f */
    public int f183742f;

    /* renamed from: g */
    public String f183743g;

    /* renamed from: h */
    public int f183744h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64455iv2)) {
            return false;
        }
        C64455iv2 iv22 = (C64455iv2) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f183740d), Integer.valueOf(iv22.f183740d)) && C46238a.m51546a(Integer.valueOf(this.f183741e), Integer.valueOf(iv22.f183741e)) && C46238a.m51546a(Integer.valueOf(this.f183742f), Integer.valueOf(iv22.f183742f)) && C46238a.m51546a(this.f183743g, iv22.f183743g) && C46238a.m51546a(Integer.valueOf(this.f183744h), Integer.valueOf(iv22.f183744h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f183740d);
            aVar.mo74318e(2, this.f183741e);
            aVar.mo74318e(3, this.f183742f);
            String str = this.f183743g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74318e(5, this.f183744h);
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f183740d) + 0 + C52418a.m58678e(2, this.f183741e) + C52418a.m58678e(3, this.f183742f);
            String str2 = this.f183743g;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            return e + C52418a.m58678e(5, this.f183744h);
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
            C64455iv2 iv22 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                iv22.f183740d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                iv22.f183741e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                iv22.f183742f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                iv22.f183743g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                iv22.f183744h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
