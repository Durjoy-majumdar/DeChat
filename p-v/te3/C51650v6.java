package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.v6 */
public class C51650v6 extends C49335eu3 {

    /* renamed from: d */
    public int f143334d;

    /* renamed from: e */
    public int f143335e;

    /* renamed from: f */
    public C89349b f143336f;

    /* renamed from: g */
    public C48673a7 f143337g;

    /* renamed from: h */
    public C51788w6 f143338h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51650v6)) {
            return false;
        }
        C51650v6 v6Var = (C51650v6) aVar;
        return C46238a.m51546a(this.BaseResponse, v6Var.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f143334d), Integer.valueOf(v6Var.f143334d)) && C46238a.m51546a(Integer.valueOf(this.f143335e), Integer.valueOf(v6Var.f143335e)) && C46238a.m51546a(this.f143336f, v6Var.f143336f) && C46238a.m51546a(this.f143337g, v6Var.f143337g) && C46238a.m51546a(this.f143338h, v6Var.f143338h);
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
                aVar.mo74318e(2, this.f143334d);
                aVar.mo74318e(3, this.f143335e);
                C89349b bVar = this.f143336f;
                if (bVar != null) {
                    aVar.mo74315b(4, bVar);
                }
                C48673a7 a7Var = this.f143337g;
                if (a7Var != null) {
                    aVar.mo74322i(5, a7Var.computeSize());
                    this.f143337g.writeFields(aVar);
                }
                C51788w6 w6Var = this.f143338h;
                if (w6Var != null) {
                    aVar.mo74322i(6, w6Var.computeSize());
                    this.f143338h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f143334d) + C52418a.m58678e(3, this.f143335e);
            C89349b bVar2 = this.f143336f;
            if (bVar2 != null) {
                e += C52418a.m58675b(4, bVar2);
            }
            C48673a7 a7Var2 = this.f143337g;
            if (a7Var2 != null) {
                e += C52418a.m58682i(5, a7Var2.computeSize());
            }
            C51788w6 w6Var2 = this.f143338h;
            return w6Var2 != null ? e + C52418a.m58682i(6, w6Var2.computeSize()) : e;
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
            C51650v6 v6Var = objArr[1];
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
                        v6Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    v6Var.f143334d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    v6Var.f143335e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    v6Var.f143336f = aVar3.mo141626d(intValue);
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C48673a7 a7Var3 = new C48673a7();
                        if (bArr2 != null && bArr2.length > 0) {
                            a7Var3.parseFrom(bArr2);
                        }
                        v6Var.f143337g = a7Var3;
                    }
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51788w6 w6Var3 = new C51788w6();
                        if (bArr3 != null && bArr3.length > 0) {
                            w6Var3.parseFrom(bArr3);
                        }
                        v6Var.f143338h = w6Var3;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
