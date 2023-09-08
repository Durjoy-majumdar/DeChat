package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.bz */
public class C64270bz extends C47465a {

    /* renamed from: d */
    public String f182337d;

    /* renamed from: e */
    public int f182338e;

    /* renamed from: f */
    public long f182339f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64270bz)) {
            return false;
        }
        C64270bz bzVar = (C64270bz) aVar;
        return C46238a.m51546a(this.f182337d, bzVar.f182337d) && C46238a.m51546a(Integer.valueOf(this.f182338e), Integer.valueOf(bzVar.f182338e)) && C46238a.m51546a(Long.valueOf(this.f182339f), Long.valueOf(bzVar.f182339f));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f182337d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74318e(2, this.f182338e);
                aVar.mo74321h(3, this.f182339f);
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i == 1) {
            String str2 = this.f182337d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58678e(2, this.f182338e) + C52418a.m58681h(3, this.f182339f);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f182337d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: path");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C64270bz bzVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                bzVar.f182337d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                bzVar.f182338e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 3) {
                return -1;
            } else {
                bzVar.f182339f = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
