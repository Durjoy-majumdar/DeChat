package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a6 */
public class C48670a6 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C49983jf> f130324d = new LinkedList<>();

    /* renamed from: e */
    public boolean f130325e;

    /* renamed from: f */
    public int f130326f;

    /* renamed from: g */
    public int f130327g;

    /* renamed from: h */
    public int f130328h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48670a6)) {
            return false;
        }
        C48670a6 a6Var = (C48670a6) aVar;
        return C46238a.m51546a(this.BaseResponse, a6Var.BaseResponse) && C46238a.m51546a(this.f130324d, a6Var.f130324d) && C46238a.m51546a(Boolean.valueOf(this.f130325e), Boolean.valueOf(a6Var.f130325e)) && C46238a.m51546a(Integer.valueOf(this.f130326f), Integer.valueOf(a6Var.f130326f)) && C46238a.m51546a(Integer.valueOf(this.f130327g), Integer.valueOf(a6Var.f130327g)) && C46238a.m51546a(Integer.valueOf(this.f130328h), Integer.valueOf(a6Var.f130328h));
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
                aVar.mo74320g(2, 8, this.f130324d);
                aVar.mo74314a(3, this.f130325e);
                aVar.mo74318e(4, this.f130326f);
                aVar.mo74318e(5, this.f130327g);
                aVar.mo74318e(6, this.f130328h);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f130324d) + C52418a.m58674a(3, this.f130325e) + C52418a.m58678e(4, this.f130326f) + C52418a.m58678e(5, this.f130327g) + C52418a.m58678e(6, this.f130328h);
        } else if (i == 2) {
            this.f130324d.clear();
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
            C48670a6 a6Var = objArr[1];
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
                        a6Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49983jf jfVar = new C49983jf();
                        if (bArr2 != null && bArr2.length > 0) {
                            jfVar.parseFrom(bArr2);
                        }
                        a6Var.f130324d.add(jfVar);
                    }
                    return 0;
                case 3:
                    a6Var.f130325e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    a6Var.f130326f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    a6Var.f130327g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    a6Var.f130328h = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
