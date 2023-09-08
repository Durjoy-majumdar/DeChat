package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class aj4 extends C49335eu3 {

    /* renamed from: d */
    public int f130567d;

    /* renamed from: e */
    public String f130568e;

    /* renamed from: f */
    public String f130569f;

    /* renamed from: g */
    public String f130570g;

    /* renamed from: h */
    public C48754ar3 f130571h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof aj4)) {
            return false;
        }
        aj4 aj4 = (aj4) aVar;
        return C46238a.m51546a(this.BaseResponse, aj4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130567d), Integer.valueOf(aj4.f130567d)) && C46238a.m51546a(this.f130568e, aj4.f130568e) && C46238a.m51546a(this.f130569f, aj4.f130569f) && C46238a.m51546a(this.f130570g, aj4.f130570g) && C46238a.m51546a(this.f130571h, aj4.f130571h);
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                aVar.mo74322i(1, jaVar.computeSize());
                this.BaseResponse.writeFields(aVar);
            }
            aVar.mo74318e(2, this.f130567d);
            String str = this.f130568e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f130569f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f130570g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            C48754ar3 ar32 = this.f130571h;
            if (ar32 != null) {
                aVar.mo74322i(6, ar32.computeSize());
                this.f130571h.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130567d);
            String str4 = this.f130568e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            String str5 = this.f130569f;
            if (str5 != null) {
                e += C52418a.m58683j(4, str5);
            }
            String str6 = this.f130570g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            C48754ar3 ar33 = this.f130571h;
            return ar33 != null ? e + C52418a.m58682i(6, ar33.computeSize()) : e;
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
            aj4 aj4 = objArr[1];
            int intValue = objArr[2].intValue();
            switch (intValue) {
                case 1:
                    LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                    int size = j.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        byte[] bArr = j.get(i3);
                        C49966ja jaVar3 = new C49966ja();
                        if (bArr != null && bArr.length > 0) {
                            jaVar3.parseFrom(bArr);
                        }
                        aj4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    aj4.f130567d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    aj4.f130568e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    aj4.f130569f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    aj4.f130570g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48754ar3 ar34 = new C48754ar3();
                        if (bArr2 != null && bArr2.length > 0) {
                            ar34.parseFrom(bArr2);
                        }
                        aj4.f130571h = ar34;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
