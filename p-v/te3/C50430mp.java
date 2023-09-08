package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.mp */
public class C50430mp extends C49335eu3 {

    /* renamed from: d */
    public int f138136d;

    /* renamed from: e */
    public String f138137e;

    /* renamed from: f */
    public C89349b f138138f;

    /* renamed from: g */
    public int f138139g;

    /* renamed from: h */
    public int f138140h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50430mp)) {
            return false;
        }
        C50430mp mpVar = (C50430mp) aVar;
        return C46238a.m51546a(this.BaseResponse, mpVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138136d), Integer.valueOf(mpVar.f138136d)) && C46238a.m51546a(this.f138137e, mpVar.f138137e) && C46238a.m51546a(this.f138138f, mpVar.f138138f) && C46238a.m51546a(Integer.valueOf(this.f138139g), Integer.valueOf(mpVar.f138139g)) && C46238a.m51546a(Integer.valueOf(this.f138140h), Integer.valueOf(mpVar.f138140h));
    }

    /* renamed from: op */
    public final int mo24180op(int i, Object... objArr) {
        int i2 = 0;
        if (i == 0) {
            C53733a aVar = objArr[0];
            C49966ja jaVar = this.BaseResponse;
            if (jaVar != null) {
                if (jaVar != null) {
                    aVar.mo74322i(1, jaVar.computeSize());
                    this.BaseResponse.writeFields(aVar);
                }
                aVar.mo74318e(2, this.f138136d);
                String str = this.f138137e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C89349b bVar = this.f138138f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                aVar.mo74318e(5, this.f138139g);
                aVar.mo74318e(6, this.f138140h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138136d);
            String str2 = this.f138137e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            C89349b bVar2 = this.f138138f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            return e + C52418a.m58678e(5, this.f138139g) + C52418a.m58678e(6, this.f138140h);
        } else if (i == 2) {
            C102122a aVar2 = new C102122a(objArr[0], C47465a.unknownTagHandler);
            for (int nextFieldNumber = C47465a.getNextFieldNumber(aVar2); nextFieldNumber > 0; nextFieldNumber = C47465a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, nextFieldNumber)) {
                    aVar2.mo141624b();
                }
            }
            if (this.BaseResponse != null) {
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            C102122a aVar3 = objArr[0];
            C50430mp mpVar = objArr[1];
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
                        mpVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    mpVar.f138136d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    mpVar.f138137e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    mpVar.f138138f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    mpVar.f138139g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    mpVar.f138140h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
