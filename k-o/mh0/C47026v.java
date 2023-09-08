package mh0;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: mh0.v */
public class C47026v extends C47465a {

    /* renamed from: d */
    public String f126384d;

    /* renamed from: e */
    public String f126385e;

    /* renamed from: f */
    public String f126386f;

    /* renamed from: g */
    public int f126387g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47026v)) {
            return false;
        }
        C47026v vVar = (C47026v) aVar;
        return C46238a.m51546a(this.f126384d, vVar.f126384d) && C46238a.m51546a(this.f126385e, vVar.f126385e) && C46238a.m51546a(this.f126386f, vVar.f126386f) && C46238a.m51546a(Integer.valueOf(this.f126387g), Integer.valueOf(vVar.f126387g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f126384d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f126385e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f126386f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74318e(4, this.f126387g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f126384d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f126385e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f126386f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58678e(4, this.f126387g);
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
            C47026v vVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                vVar.f126384d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                vVar.f126385e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                vVar.f126386f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                vVar.f126387g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
