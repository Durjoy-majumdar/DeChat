package py1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: py1.j2 */
public class C47606j2 extends C49335eu3 {

    /* renamed from: d */
    public C47642o3 f127808d;

    /* renamed from: e */
    public LinkedList<C47575f> f127809e = new LinkedList<>();

    /* renamed from: f */
    public boolean f127810f;

    /* renamed from: g */
    public int f127811g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C47606j2)) {
            return false;
        }
        C47606j2 j2Var = (C47606j2) aVar;
        return C46238a.m51546a(this.BaseResponse, j2Var.BaseResponse) && C46238a.m51546a(this.f127808d, j2Var.f127808d) && C46238a.m51546a(this.f127809e, j2Var.f127809e) && C46238a.m51546a(Boolean.valueOf(this.f127810f), Boolean.valueOf(j2Var.f127810f)) && C46238a.m51546a(Integer.valueOf(this.f127811g), Integer.valueOf(j2Var.f127811g));
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
                C47642o3 o3Var = this.f127808d;
                if (o3Var != null) {
                    aVar.mo74322i(2, o3Var.computeSize());
                    this.f127808d.writeFields(aVar);
                }
                aVar.mo74320g(3, 8, this.f127809e);
                aVar.mo74314a(4, this.f127810f);
                aVar.mo74318e(5, this.f127811g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C47642o3 o3Var2 = this.f127808d;
            if (o3Var2 != null) {
                i2 += C52418a.m58682i(2, o3Var2.computeSize());
            }
            return i2 + C52418a.m58680g(3, 8, this.f127809e) + C52418a.m58674a(4, this.f127810f) + C52418a.m58678e(5, this.f127811g);
        } else if (i == 2) {
            this.f127809e.clear();
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
            C47606j2 j2Var = objArr[1];
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
                    j2Var.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C47642o3 o3Var3 = new C47642o3();
                    if (bArr2 != null && bArr2.length > 0) {
                        o3Var3.parseFrom(bArr2);
                    }
                    j2Var.f127808d = o3Var3;
                }
                return 0;
            } else if (intValue == 3) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C47575f fVar = new C47575f();
                    if (bArr3 != null && bArr3.length > 0) {
                        fVar.parseFrom(bArr3);
                    }
                    j2Var.f127809e.add(fVar);
                }
                return 0;
            } else if (intValue == 4) {
                j2Var.f127810f = aVar3.mo141625c(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                j2Var.f127811g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
