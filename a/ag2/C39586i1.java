package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.i1 */
public class C39586i1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<C39596r0> f106260d = new LinkedList<>();

    /* renamed from: e */
    public LinkedList<C39596r0> f106261e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C39596r0> f106262f = new LinkedList<>();

    /* renamed from: g */
    public long f106263g;

    /* renamed from: h */
    public boolean f106264h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39586i1)) {
            return false;
        }
        C39586i1 i1Var = (C39586i1) aVar;
        return C46238a.m51546a(this.BaseResponse, i1Var.BaseResponse) && C46238a.m51546a(this.f106260d, i1Var.f106260d) && C46238a.m51546a(this.f106261e, i1Var.f106261e) && C46238a.m51546a(this.f106262f, i1Var.f106262f) && C46238a.m51546a(Long.valueOf(this.f106263g), Long.valueOf(i1Var.f106263g)) && C46238a.m51546a(Boolean.valueOf(this.f106264h), Boolean.valueOf(i1Var.f106264h));
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
            aVar.mo74320g(2, 8, this.f106260d);
            aVar.mo74320g(3, 8, this.f106261e);
            aVar.mo74320g(4, 8, this.f106262f);
            aVar.mo74321h(5, this.f106263g);
            aVar.mo74314a(6, this.f106264h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58680g(2, 8, this.f106260d) + C52418a.m58680g(3, 8, this.f106261e) + C52418a.m58680g(4, 8, this.f106262f) + C52418a.m58681h(5, this.f106263g) + C52418a.m58674a(6, this.f106264h);
        } else if (i == 2) {
            this.f106260d.clear();
            this.f106261e.clear();
            this.f106262f.clear();
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
            C39586i1 i1Var = objArr[1];
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
                        i1Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C39596r0 r0Var = new C39596r0();
                        if (bArr2 != null && bArr2.length > 0) {
                            r0Var.parseFrom(bArr2);
                        }
                        i1Var.f106260d.add(r0Var);
                    }
                    return 0;
                case 3:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C39596r0 r0Var2 = new C39596r0();
                        if (bArr3 != null && bArr3.length > 0) {
                            r0Var2.parseFrom(bArr3);
                        }
                        i1Var.f106261e.add(r0Var2);
                    }
                    return 0;
                case 4:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C39596r0 r0Var3 = new C39596r0();
                        if (bArr4 != null && bArr4.length > 0) {
                            r0Var3.parseFrom(bArr4);
                        }
                        i1Var.f106262f.add(r0Var3);
                    }
                    return 0;
                case 5:
                    i1Var.f106263g = aVar3.mo141631i(intValue);
                    return 0;
                case 6:
                    i1Var.f106264h = aVar3.mo141625c(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
