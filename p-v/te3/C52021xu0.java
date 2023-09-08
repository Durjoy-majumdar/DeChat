package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.xu0 */
public class C52021xu0 extends C47465a {

    /* renamed from: d */
    public String f144969d;

    /* renamed from: e */
    public long f144970e;

    /* renamed from: f */
    public long f144971f;

    /* renamed from: g */
    public String f144972g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52021xu0)) {
            return false;
        }
        C52021xu0 xu02 = (C52021xu0) aVar;
        return C46238a.m51546a(this.f144969d, xu02.f144969d) && C46238a.m51546a(Long.valueOf(this.f144970e), Long.valueOf(xu02.f144970e)) && C46238a.m51546a(Long.valueOf(this.f144971f), Long.valueOf(xu02.f144971f)) && C46238a.m51546a(this.f144972g, xu02.f144972g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f144969d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f144970e);
            aVar.mo74321h(3, this.f144971f);
            String str2 = this.f144972g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f144969d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f144970e) + C52418a.m58681h(3, this.f144971f);
            String str4 = this.f144972g;
            return str4 != null ? h + C52418a.m58683j(4, str4) : h;
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
            C52021xu0 xu02 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                xu02.f144969d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                xu02.f144970e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                xu02.f144971f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                xu02.f144972g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
