package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.r93 */
public class C90435r93 extends C49335eu3 {

    /* renamed from: d */
    public C90441u93 f259789d;

    /* renamed from: e */
    public String f259790e;

    /* renamed from: f */
    public String f259791f;

    /* renamed from: g */
    public String f259792g;

    /* renamed from: h */
    public LinkedList<C90435r93> f259793h = new LinkedList<>();

    /* renamed from: i */
    public int f259794i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C90435r93)) {
            return false;
        }
        C90435r93 r932 = (C90435r93) aVar;
        return C46238a.m51546a(this.BaseResponse, r932.BaseResponse) && C46238a.m51546a(this.f259789d, r932.f259789d) && C46238a.m51546a(this.f259790e, r932.f259790e) && C46238a.m51546a(this.f259791f, r932.f259791f) && C46238a.m51546a(this.f259792g, r932.f259792g) && C46238a.m51546a(this.f259793h, r932.f259793h) && C46238a.m51546a(Integer.valueOf(this.f259794i), Integer.valueOf(r932.f259794i));
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
            C90441u93 u932 = this.f259789d;
            if (u932 != null) {
                aVar.mo74322i(2, u932.computeSize());
                this.f259789d.writeFields(aVar);
            }
            String str = this.f259790e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f259791f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f259792g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74320g(6, 8, this.f259793h);
            aVar.mo74318e(7, this.f259794i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C90441u93 u933 = this.f259789d;
            if (u933 != null) {
                i2 += C52418a.m58682i(2, u933.computeSize());
            }
            String str4 = this.f259790e;
            if (str4 != null) {
                i2 += C52418a.m58683j(3, str4);
            }
            String str5 = this.f259791f;
            if (str5 != null) {
                i2 += C52418a.m58683j(4, str5);
            }
            String str6 = this.f259792g;
            if (str6 != null) {
                i2 += C52418a.m58683j(5, str6);
            }
            return i2 + C52418a.m58680g(6, 8, this.f259793h) + C52418a.m58678e(7, this.f259794i);
        } else if (i == 2) {
            this.f259793h.clear();
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
            C90435r93 r932 = objArr[1];
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
                        r932.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C90441u93 u934 = new C90441u93();
                        if (bArr2 != null && bArr2.length > 0) {
                            u934.parseFrom(bArr2);
                        }
                        r932.f259789d = u934;
                    }
                    return 0;
                case 3:
                    r932.f259790e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    r932.f259791f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    r932.f259792g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C90435r93 r933 = new C90435r93();
                        if (bArr3 != null && bArr3.length > 0) {
                            r933.parseFrom(bArr3);
                        }
                        r932.f259793h.add(r933);
                    }
                    return 0;
                case 7:
                    r932.f259794i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
