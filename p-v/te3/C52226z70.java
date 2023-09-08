package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.z70 */
public class C52226z70 extends C47465a {

    /* renamed from: d */
    public String f145737d;

    /* renamed from: e */
    public int f145738e;

    /* renamed from: f */
    public int f145739f;

    /* renamed from: g */
    public String f145740g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52226z70)) {
            return false;
        }
        C52226z70 z702 = (C52226z70) aVar;
        return C46238a.m51546a(this.f145737d, z702.f145737d) && C46238a.m51546a(Integer.valueOf(this.f145738e), Integer.valueOf(z702.f145738e)) && C46238a.m51546a(Integer.valueOf(this.f145739f), Integer.valueOf(z702.f145739f)) && C46238a.m51546a(this.f145740g, z702.f145740g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145737d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74318e(2, this.f145738e);
            aVar.mo74318e(3, this.f145739f);
            String str2 = this.f145740g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f145737d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int e = i2 + C52418a.m58678e(2, this.f145738e) + C52418a.m58678e(3, this.f145739f);
            String str4 = this.f145740g;
            return str4 != null ? e + C52418a.m58683j(4, str4) : e;
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
            C52226z70 z702 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                z702.f145737d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                z702.f145738e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                z702.f145739f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                z702.f145740g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
