package py1;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.s */
public class C47666s extends C47465a {

    /* renamed from: d */
    public long f127984d;

    /* renamed from: e */
    public int f127985e;

    /* renamed from: f */
    public long f127986f;

    /* renamed from: g */
    public String f127987g;

    /* renamed from: h */
    public boolean f127988h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47666s)) {
            return false;
        }
        C47666s sVar = (C47666s) aVar;
        return C46238a.m51546a(Long.valueOf(this.f127984d), Long.valueOf(sVar.f127984d)) && C46238a.m51546a(Integer.valueOf(this.f127985e), Integer.valueOf(sVar.f127985e)) && C46238a.m51546a(Long.valueOf(this.f127986f), Long.valueOf(sVar.f127986f)) && C46238a.m51546a(this.f127987g, sVar.f127987g) && C46238a.m51546a(Boolean.valueOf(this.f127988h), Boolean.valueOf(sVar.f127988h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f127984d);
            aVar.mo74318e(2, this.f127985e);
            aVar.mo74321h(3, this.f127986f);
            String str = this.f127987g;
            if (str != null) {
                aVar.mo74323j(4, str);
            }
            aVar.mo74314a(5, this.f127988h);
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f127984d) + 0 + C52418a.m58678e(2, this.f127985e) + C52418a.m58681h(3, this.f127986f);
            String str2 = this.f127987g;
            if (str2 != null) {
                h += C52418a.m58683j(4, str2);
            }
            return h + C52418a.m58674a(5, this.f127988h);
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
            C47666s sVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                sVar.f127984d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                sVar.f127985e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                sVar.f127986f = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 4) {
                sVar.f127987g = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                sVar.f127988h = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
