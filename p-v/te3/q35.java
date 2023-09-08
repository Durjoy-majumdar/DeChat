package te3;

import if0.C46238a;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class q35 extends C47465a {

    /* renamed from: d */
    public String f140116d;

    /* renamed from: e */
    public String f140117e;

    /* renamed from: f */
    public int f140118f;

    /* renamed from: g */
    public int f140119g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof q35)) {
            return false;
        }
        q35 q35 = (q35) aVar;
        return C46238a.m51546a(this.f140116d, q35.f140116d) && C46238a.m51546a(this.f140117e, q35.f140117e) && C46238a.m51546a(Integer.valueOf(this.f140118f), Integer.valueOf(q35.f140118f)) && C46238a.m51546a(Integer.valueOf(this.f140119g), Integer.valueOf(q35.f140119g));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            String str = this.f140116d;
            if (str == null) {
                throw new C52419b("Not all required fields were included: Md5");
            } else if (this.f140117e != null) {
                if (str != null) {
                    aVar.mo74323j(1, str);
                }
                String str2 = this.f140117e;
                if (str2 != null) {
                    aVar.mo74323j(2, str2);
                }
                aVar.mo74318e(3, this.f140118f);
                aVar.mo74318e(4, this.f140119g);
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadUrl");
            }
        } else if (i == 1) {
            String str3 = this.f140116d;
            if (str3 != null) {
                i2 = 0 + C52418a.m58683j(1, str3);
            }
            String str4 = this.f140117e;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            return i2 + C52418a.m58678e(3, this.f140118f) + C52418a.m58678e(4, this.f140119g);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.f140116d == null) {
                throw new C52419b("Not all required fields were included: Md5");
            } else if (this.f140117e != null) {
                return 0;
            } else {
                throw new C52419b("Not all required fields were included: DownloadUrl");
            }
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            q35 q35 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                q35.f140116d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 2) {
                q35.f140117e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                q35.f140118f = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                q35.f140119g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
