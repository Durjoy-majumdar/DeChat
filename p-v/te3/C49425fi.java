package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fi */
public class C49425fi extends C47465a {

    /* renamed from: d */
    public String f133510d;

    /* renamed from: e */
    public String f133511e;

    /* renamed from: f */
    public String f133512f;

    /* renamed from: g */
    public long f133513g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49425fi)) {
            return false;
        }
        C49425fi fiVar = (C49425fi) aVar;
        return C46238a.m51546a(this.f133510d, fiVar.f133510d) && C46238a.m51546a(this.f133511e, fiVar.f133511e) && C46238a.m51546a(this.f133512f, fiVar.f133512f) && C46238a.m51546a(Long.valueOf(this.f133513g), Long.valueOf(fiVar.f133513g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f133510d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            String str2 = this.f133511e;
            if (str2 != null) {
                aVar.mo74323j(2, str2);
            }
            String str3 = this.f133512f;
            if (str3 != null) {
                aVar.mo74323j(3, str3);
            }
            aVar.mo74321h(4, this.f133513g);
            return 0;
        } else if (i == 1) {
            String str4 = this.f133510d;
            if (str4 != null) {
                i2 = 0 + C52418a.m58683j(1, str4);
            }
            String str5 = this.f133511e;
            if (str5 != null) {
                i2 += C52418a.m58683j(2, str5);
            }
            String str6 = this.f133512f;
            if (str6 != null) {
                i2 += C52418a.m58683j(3, str6);
            }
            return i2 + C52418a.m58681h(4, this.f133513g);
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
            C49425fi fiVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                fiVar.f133510d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                fiVar.f133511e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                fiVar.f133512f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                fiVar.f133513g = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
