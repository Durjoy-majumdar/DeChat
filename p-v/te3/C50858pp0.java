package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.pp0 */
public class C50858pp0 extends C49335eu3 {

    /* renamed from: d */
    public C64370fp1 f139889d;

    /* renamed from: e */
    public int f139890e;

    /* renamed from: f */
    public int f139891f;

    /* renamed from: g */
    public String f139892g;

    /* renamed from: h */
    public String f139893h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50858pp0)) {
            return false;
        }
        C50858pp0 pp02 = (C50858pp0) aVar;
        return C46238a.m51546a(this.BaseResponse, pp02.BaseResponse) && C46238a.m51546a(this.f139889d, pp02.f139889d) && C46238a.m51546a(Integer.valueOf(this.f139890e), Integer.valueOf(pp02.f139890e)) && C46238a.m51546a(Integer.valueOf(this.f139891f), Integer.valueOf(pp02.f139891f)) && C46238a.m51546a(this.f139892g, pp02.f139892g) && C46238a.m51546a(this.f139893h, pp02.f139893h);
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
            C64370fp1 fp12 = this.f139889d;
            if (fp12 != null) {
                aVar.mo74322i(2, fp12.computeSize());
                this.f139889d.writeFields(aVar);
            }
            aVar.mo74318e(3, this.f139890e);
            aVar.mo74318e(4, this.f139891f);
            String str = this.f139892g;
            if (str != null) {
                aVar.mo74323j(5, str);
            }
            String str2 = this.f139893h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C64370fp1 fp13 = this.f139889d;
            if (fp13 != null) {
                i2 += C52418a.m58682i(2, fp13.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f139890e) + C52418a.m58678e(4, this.f139891f);
            String str3 = this.f139892g;
            if (str3 != null) {
                e += C52418a.m58683j(5, str3);
            }
            String str4 = this.f139893h;
            return str4 != null ? e + C52418a.m58683j(6, str4) : e;
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
            C50858pp0 pp02 = objArr[1];
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
                        pp02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64370fp1 fp14 = new C64370fp1();
                        if (bArr2 != null && bArr2.length > 0) {
                            fp14.parseFrom(bArr2);
                        }
                        pp02.f139889d = fp14;
                    }
                    return 0;
                case 3:
                    pp02.f139890e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    pp02.f139891f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    pp02.f139892g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    pp02.f139893h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
