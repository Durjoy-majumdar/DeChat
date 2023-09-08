package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.a12 */
public class C48649a12 extends C49335eu3 {

    /* renamed from: d */
    public int f130209d;

    /* renamed from: e */
    public long f130210e;

    /* renamed from: f */
    public C77949j3 f130211f;

    /* renamed from: g */
    public String f130212g;

    /* renamed from: h */
    public int f130213h;

    /* renamed from: i */
    public C50694ok f130214i;

    /* renamed from: j */
    public LinkedList<C77949j3> f130215j = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C48649a12)) {
            return false;
        }
        C48649a12 a122 = (C48649a12) aVar;
        return C46238a.m51546a(this.BaseResponse, a122.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f130209d), Integer.valueOf(a122.f130209d)) && C46238a.m51546a(Long.valueOf(this.f130210e), Long.valueOf(a122.f130210e)) && C46238a.m51546a(this.f130211f, a122.f130211f) && C46238a.m51546a(this.f130212g, a122.f130212g) && C46238a.m51546a(Integer.valueOf(this.f130213h), Integer.valueOf(a122.f130213h)) && C46238a.m51546a(this.f130214i, a122.f130214i) && C46238a.m51546a(this.f130215j, a122.f130215j);
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
                aVar.mo74318e(2, this.f130209d);
                aVar.mo74321h(3, this.f130210e);
                C77949j3 j3Var = this.f130211f;
                if (j3Var != null) {
                    aVar.mo74322i(4, j3Var.computeSize());
                    this.f130211f.writeFields(aVar);
                }
                String str = this.f130212g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                aVar.mo74318e(6, this.f130213h);
                C50694ok okVar = this.f130214i;
                if (okVar != null) {
                    aVar.mo74322i(7, okVar.computeSize());
                    this.f130214i.writeFields(aVar);
                }
                aVar.mo74320g(8, 8, this.f130215j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f130209d) + C52418a.m58681h(3, this.f130210e);
            C77949j3 j3Var2 = this.f130211f;
            if (j3Var2 != null) {
                e += C52418a.m58682i(4, j3Var2.computeSize());
            }
            String str2 = this.f130212g;
            if (str2 != null) {
                e += C52418a.m58683j(5, str2);
            }
            int e2 = e + C52418a.m58678e(6, this.f130213h);
            C50694ok okVar2 = this.f130214i;
            if (okVar2 != null) {
                e2 += C52418a.m58682i(7, okVar2.computeSize());
            }
            return e2 + C52418a.m58680g(8, 8, this.f130215j);
        } else if (i == 2) {
            this.f130215j.clear();
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
            C48649a12 a122 = objArr[1];
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
                        a122.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    a122.f130209d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    a122.f130210e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77949j3 j3Var3 = new C77949j3();
                        if (bArr2 != null && bArr2.length > 0) {
                            j3Var3.parseFrom(bArr2);
                        }
                        a122.f130211f = j3Var3;
                    }
                    return 0;
                case 5:
                    a122.f130212g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    a122.f130213h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50694ok okVar3 = new C50694ok();
                        if (bArr3 != null && bArr3.length > 0) {
                            okVar3.parseFrom(bArr3);
                        }
                        a122.f130214i = okVar3;
                    }
                    return 0;
                case 8:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C77949j3 j3Var4 = new C77949j3();
                        if (bArr4 != null && bArr4.length > 0) {
                            j3Var4.parseFrom(bArr4);
                        }
                        a122.f130215j.add(j3Var4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
