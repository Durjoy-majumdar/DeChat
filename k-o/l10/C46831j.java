package l10;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: l10.j */
public class C46831j extends C47465a {

    /* renamed from: d */
    public int f125969d;

    /* renamed from: e */
    public String f125970e;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C46831j)) {
            return false;
        }
        C46831j jVar = (C46831j) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f125969d), Integer.valueOf(jVar.f125969d)) && C46238a.m51546a(this.f125970e, jVar.f125970e);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            if (this.f125970e != null) {
                aVar.mo74318e(1, this.f125969d);
                String str = this.f125970e;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: mediaId");
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f125969d) + 0;
            String str2 = this.f125970e;
            return str2 != null ? e + C52418a.m58683j(2, str2) : e;
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f125970e != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: mediaId");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C46831j jVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                jVar.f125969d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 2) {
                return -1;
            } else {
                jVar.f125970e = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
