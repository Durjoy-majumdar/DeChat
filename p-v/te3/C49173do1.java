package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.do1 */
public class C49173do1 extends C47465a {

    /* renamed from: d */
    public long f132446d;

    /* renamed from: e */
    public String f132447e;

    /* renamed from: f */
    public int f132448f;

    /* renamed from: g */
    public String f132449g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49173do1)) {
            return false;
        }
        C49173do1 do12 = (C49173do1) aVar;
        return C46238a.m51546a(Long.valueOf(this.f132446d), Long.valueOf(do12.f132446d)) && C46238a.m51546a(this.f132447e, do12.f132447e) && C46238a.m51546a(Integer.valueOf(this.f132448f), Integer.valueOf(do12.f132448f)) && C46238a.m51546a(this.f132449g, do12.f132449g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f132446d);
            String str = this.f132447e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f132448f);
            String str2 = this.f132449g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f132446d) + 0;
            String str3 = this.f132447e;
            if (str3 != null) {
                h += C52418a.m58683j(2, str3);
            }
            int e = h + C52418a.m58678e(3, this.f132448f);
            String str4 = this.f132449g;
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
            C49173do1 do12 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                do12.f132446d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                do12.f132447e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                do12.f132448f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                do12.f132449g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
