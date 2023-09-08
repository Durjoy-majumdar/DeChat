package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.j52 */
public class C49947j52 extends C49335eu3 {

    /* renamed from: d */
    public C50915q5 f135874d;

    /* renamed from: e */
    public C49076d1 f135875e;

    /* renamed from: f */
    public LinkedList<b45> f135876f = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49947j52)) {
            return false;
        }
        C49947j52 j522 = (C49947j52) aVar;
        return C46238a.m51546a(this.BaseResponse, j522.BaseResponse) && C46238a.m51546a(this.f135874d, j522.f135874d) && C46238a.m51546a(this.f135875e, j522.f135875e) && C46238a.m51546a(this.f135876f, j522.f135876f);
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
            C50915q5 q5Var = this.f135874d;
            if (q5Var != null) {
                aVar.mo74322i(2, q5Var.computeSize());
                this.f135874d.writeFields(aVar);
            }
            C49076d1 d1Var = this.f135875e;
            if (d1Var != null) {
                aVar.mo74322i(3, d1Var.computeSize());
                this.f135875e.writeFields(aVar);
            }
            aVar.mo74320g(4, 8, this.f135876f);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C50915q5 q5Var2 = this.f135874d;
            if (q5Var2 != null) {
                i2 += C52418a.m58682i(2, q5Var2.computeSize());
            }
            C49076d1 d1Var2 = this.f135875e;
            if (d1Var2 != null) {
                i2 += C52418a.m58682i(3, d1Var2.computeSize());
            }
            return i2 + C52418a.m58680g(4, 8, this.f135876f);
        } else if (i == 2) {
            this.f135876f.clear();
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
            C49947j52 j522 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    j522.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C50915q5 q5Var3 = new C50915q5();
                    if (bArr2 != null && bArr2.length > 0) {
                        q5Var3.parseFrom(bArr2);
                    }
                    j522.f135874d = q5Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49076d1 d1Var3 = new C49076d1();
                    if (bArr3 != null && bArr3.length > 0) {
                        d1Var3.parseFrom(bArr3);
                    }
                    j522.f135875e = d1Var3;
                }
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                int size4 = j4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    byte[] bArr4 = j4.get(i6);
                    b45 b45 = new b45();
                    if (bArr4 != null && bArr4.length > 0) {
                        b45.parseFrom(bArr4);
                    }
                    j522.f135876f.add(b45);
                }
                return 0;
            }
        }
    }
}
