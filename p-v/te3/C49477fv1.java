package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.fv1 */
public class C49477fv1 extends C49335eu3 {

    /* renamed from: d */
    public int f133706d;

    /* renamed from: e */
    public String f133707e;

    /* renamed from: f */
    public int f133708f;

    /* renamed from: g */
    public String f133709g;

    /* renamed from: h */
    public String f133710h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49477fv1)) {
            return false;
        }
        C49477fv1 fv12 = (C49477fv1) aVar;
        return C46238a.m51546a(this.BaseResponse, fv12.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133706d), Integer.valueOf(fv12.f133706d)) && C46238a.m51546a(this.f133707e, fv12.f133707e) && C46238a.m51546a(Integer.valueOf(this.f133708f), Integer.valueOf(fv12.f133708f)) && C46238a.m51546a(this.f133709g, fv12.f133709g) && C46238a.m51546a(this.f133710h, fv12.f133710h);
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
            aVar.mo74318e(2, this.f133706d);
            String str = this.f133707e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74318e(4, this.f133708f);
            String str2 = this.f133709g;
            if (str2 != null) {
                aVar.mo74323j(5, str2);
            }
            String str3 = this.f133710h;
            if (str3 != null) {
                aVar.mo74323j(6, str3);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f133706d);
            String str4 = this.f133707e;
            if (str4 != null) {
                e += C52418a.m58683j(3, str4);
            }
            int e2 = e + C52418a.m58678e(4, this.f133708f);
            String str5 = this.f133709g;
            if (str5 != null) {
                e2 += C52418a.m58683j(5, str5);
            }
            String str6 = this.f133710h;
            return str6 != null ? e2 + C52418a.m58683j(6, str6) : e2;
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
            C49477fv1 fv12 = objArr[1];
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
                        fv12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fv12.f133706d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    fv12.f133707e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    fv12.f133708f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    fv12.f133709g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    fv12.f133710h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
