package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.wk */
public class C78008wk extends C47465a {

    /* renamed from: d */
    public int f228351d;

    /* renamed from: e */
    public String f228352e;

    /* renamed from: f */
    public String f228353f;

    /* renamed from: g */
    public String f228354g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C78008wk)) {
            return false;
        }
        C78008wk wkVar = (C78008wk) aVar;
        return C46238a.m51546a(Integer.valueOf(this.f228351d), Integer.valueOf(wkVar.f228351d)) && C46238a.m51546a(this.f228352e, wkVar.f228352e) && C46238a.m51546a(this.f228353f, wkVar.f228353f) && C46238a.m51546a(this.f228354g, wkVar.f228354g);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        if (i == 0) {
            C53733a aVar = objArr[0];
            aVar.mo74318e(1, this.f228351d);
            String str = this.f228352e;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            String str2 = this.f228353f;
            if (str2 != null) {
                aVar.mo74323j(3, str2);
            }
            String str3 = this.f228354g;
            if (str3 != null) {
                aVar.mo74323j(4, str3);
            }
            return 0;
        } else if (i == 1) {
            int e = C52418a.m58678e(1, this.f228351d) + 0;
            String str4 = this.f228352e;
            if (str4 != null) {
                e += C52418a.m58683j(2, str4);
            }
            String str5 = this.f228353f;
            if (str5 != null) {
                e += C52418a.m58683j(3, str5);
            }
            String str6 = this.f228354g;
            return str6 != null ? e + C52418a.m58683j(4, str6) : e;
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
            C78008wk wkVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                wkVar.f228351d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 2) {
                wkVar.f228352e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                wkVar.f228353f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                wkVar.f228354g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
