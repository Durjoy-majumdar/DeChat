package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gw */
public class C49618gw extends C47465a {

    /* renamed from: d */
    public long f134308d;

    /* renamed from: e */
    public int f134309e;

    /* renamed from: f */
    public String f134310f;

    /* renamed from: g */
    public String f134311g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49618gw)) {
            return false;
        }
        C49618gw gwVar = (C49618gw) aVar;
        return C46238a.m51546a(Long.valueOf(this.f134308d), Long.valueOf(gwVar.f134308d)) && C46238a.m51546a(Integer.valueOf(this.f134309e), Integer.valueOf(gwVar.f134309e)) && C46238a.m51546a(this.f134310f, gwVar.f134310f) && C46238a.m51546a(this.f134311g, gwVar.f134311g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74321h(1, this.f134308d);
            aVar.mo74318e(2, this.f134309e);
            String str = this.f134310f;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f134311g;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            return 0;
        } else if (i == 1) {
            int h = C52418a.m58681h(1, this.f134308d) + 0 + C52418a.m58678e(2, this.f134309e);
            String str3 = this.f134310f;
            if (str3 != null) {
                h += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134311g;
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
            C49618gw gwVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                gwVar.f134308d = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 2) {
                gwVar.f134309e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                gwVar.f134310f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                gwVar.f134311g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
