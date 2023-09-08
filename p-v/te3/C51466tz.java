package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tz */
public class C51466tz extends C47465a {

    /* renamed from: d */
    public String f142477d;

    /* renamed from: e */
    public long f142478e;

    /* renamed from: f */
    public int f142479f;

    /* renamed from: g */
    public boolean f142480g = true;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51466tz)) {
            return false;
        }
        C51466tz tzVar = (C51466tz) aVar;
        return C46238a.m51546a(this.f142477d, tzVar.f142477d) && C46238a.m51546a(Long.valueOf(this.f142478e), Long.valueOf(tzVar.f142478e)) && C46238a.m51546a(Integer.valueOf(this.f142479f), Integer.valueOf(tzVar.f142479f)) && C46238a.m51546a(Boolean.valueOf(this.f142480g), Boolean.valueOf(tzVar.f142480g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f142477d;
            if (str != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                aVar.mo74321h(2, this.f142478e);
                aVar.mo74318e(3, this.f142479f);
                aVar.mo74314a(4, this.f142480g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: id");
        } else if (i == 1) {
            String str2 = this.f142477d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f142478e) + C52418a.m58678e(3, this.f142479f) + C52418a.m58674a(4, this.f142480g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f142477d != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: id");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C51466tz tzVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                tzVar.f142477d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                tzVar.f142478e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                tzVar.f142479f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                tzVar.f142480g = aVar3.mo141625c(intValue);
                return 0;
            }
        }
    }
}
