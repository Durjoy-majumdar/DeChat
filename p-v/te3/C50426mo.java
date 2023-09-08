package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mo */
public class C50426mo extends C47465a {

    /* renamed from: d */
    public String f138120d;

    /* renamed from: e */
    public long f138121e;

    /* renamed from: f */
    public int f138122f;

    /* renamed from: g */
    public int f138123g;

    /* renamed from: h */
    public int f138124h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50426mo)) {
            return false;
        }
        C50426mo moVar = (C50426mo) aVar;
        return C46238a.m51546a(this.f138120d, moVar.f138120d) && C46238a.m51546a(Long.valueOf(this.f138121e), Long.valueOf(moVar.f138121e)) && C46238a.m51546a(Integer.valueOf(this.f138122f), Integer.valueOf(moVar.f138122f)) && C46238a.m51546a(Integer.valueOf(this.f138123g), Integer.valueOf(moVar.f138123g)) && C46238a.m51546a(Integer.valueOf(this.f138124h), Integer.valueOf(moVar.f138124h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f138120d;
            if (str != null) {
                aVar.mo74323j(1, str);
            }
            aVar.mo74321h(2, this.f138121e);
            aVar.mo74318e(3, this.f138122f);
            aVar.mo74318e(4, this.f138123g);
            aVar.mo74318e(5, this.f138124h);
            return 0;
        } else if (i == 1) {
            String str2 = this.f138120d;
            if (str2 != null) {
                i2 = 0 + C52418a.m58683j(1, str2);
            }
            return i2 + C52418a.m58681h(2, this.f138121e) + C52418a.m58678e(3, this.f138122f) + C52418a.m58678e(4, this.f138123g) + C52418a.m58678e(5, this.f138124h);
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
            C50426mo moVar = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                moVar.f138120d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                moVar.f138121e = aVar3.mo141631i(intValue);
                return 0;
            } else if (intValue == 3) {
                moVar.f138122f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                moVar.f138123g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                moVar.f138124h = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
