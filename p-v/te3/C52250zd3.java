package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.zd3 */
public class C52250zd3 extends C47465a {

    /* renamed from: d */
    public String f145841d;

    /* renamed from: e */
    public long f145842e;

    /* renamed from: f */
    public int f145843f;

    /* renamed from: g */
    public String f145844g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52250zd3)) {
            return false;
        }
        C52250zd3 zd32 = (C52250zd3) aVar;
        return C46238a.m51546a(this.f145841d, zd32.f145841d) && C46238a.m51546a(Long.valueOf(this.f145842e), Long.valueOf(zd32.f145842e)) && C46238a.m51546a(Integer.valueOf(this.f145843f), Integer.valueOf(zd32.f145843f)) && C46238a.m51546a(this.f145844g, zd32.f145844g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f145841d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f145842e);
            aVar.mo74318e(3, this.f145843f);
            String str2 = this.f145844g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            String str3 = this.f145841d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            int h = i2 + C52418a.m58681h(2, this.f145842e) + C52418a.m58678e(3, this.f145843f);
            String str4 = this.f145844g;
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
            C52250zd3 zd32 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                zd32.f145841d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                zd32.f145842e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                zd32.f145843f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                zd32.f145844g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
