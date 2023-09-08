package te3;

import com.tencent.p014mm.protocal.protobuf.FinderObject;
import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import pe3.C89349b;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.vm0 */
public class C51710vm0 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<FinderObject> f143556d = new LinkedList<>();

    /* renamed from: e */
    public C89349b f143557e;

    /* renamed from: f */
    public int f143558f;

    /* renamed from: g */
    public int f143559g;

    /* renamed from: h */
    public int f143560h;

    /* renamed from: i */
    public int f143561i;

    /* renamed from: j */
    public C51974xh1 f143562j;

    /* renamed from: n */
    public LinkedList<C51270sn1> f143563n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51710vm0)) {
            return false;
        }
        C51710vm0 vm02 = (C51710vm0) aVar;
        return C46238a.m51546a(this.BaseResponse, vm02.BaseResponse) && C46238a.m51546a(this.f143556d, vm02.f143556d) && C46238a.m51546a(this.f143557e, vm02.f143557e) && C46238a.m51546a(Integer.valueOf(this.f143558f), Integer.valueOf(vm02.f143558f)) && C46238a.m51546a(Integer.valueOf(this.f143559g), Integer.valueOf(vm02.f143559g)) && C46238a.m51546a(Integer.valueOf(this.f143560h), Integer.valueOf(vm02.f143560h)) && C46238a.m51546a(Integer.valueOf(this.f143561i), Integer.valueOf(vm02.f143561i)) && C46238a.m51546a(this.f143562j, vm02.f143562j) && C46238a.m51546a(this.f143563n, vm02.f143563n);
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
                aVar.mo74320g(2, 8, this.f143556d);
                C89349b bVar = this.f143557e;
                if (bVar != null) {
                    aVar.mo74315b(3, bVar);
                }
                aVar.mo74318e(4, this.f143558f);
                aVar.mo74318e(5, this.f143559g);
                aVar.mo74318e(6, this.f143560h);
                aVar.mo74318e(7, this.f143561i);
                C51974xh1 xh12 = this.f143562j;
                if (xh12 != null) {
                    aVar.mo74322i(8, xh12.computeSize());
                    this.f143562j.writeFields(aVar);
                }
                aVar.mo74320g(9, 8, this.f143563n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 8, this.f143556d);
            C89349b bVar2 = this.f143557e;
            if (bVar2 != null) {
                g += C52418a.m58675b(3, bVar2);
            }
            int e = g + C52418a.m58678e(4, this.f143558f) + C52418a.m58678e(5, this.f143559g) + C52418a.m58678e(6, this.f143560h) + C52418a.m58678e(7, this.f143561i);
            C51974xh1 xh13 = this.f143562j;
            if (xh13 != null) {
                e += C52418a.m58682i(8, xh13.computeSize());
            }
            return e + C52418a.m58680g(9, 8, this.f143563n);
        } else if (i == 2) {
            this.f143556d.clear();
            this.f143563n.clear();
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
            C51710vm0 vm02 = objArr[1];
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
                        vm02.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        FinderObject finderObject = new FinderObject();
                        if (bArr2 != null && bArr2.length > 0) {
                            finderObject.parseFrom(bArr2);
                        }
                        vm02.f143556d.add(finderObject);
                    }
                    return 0;
                case 3:
                    vm02.f143557e = aVar3.mo141626d(intValue);
                    return 0;
                case 4:
                    vm02.f143558f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    vm02.f143559g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    vm02.f143560h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    vm02.f143561i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C51974xh1 xh14 = new C51974xh1();
                        if (bArr3 != null && bArr3.length > 0) {
                            xh14.parseFrom(bArr3);
                        }
                        vm02.f143562j = xh14;
                    }
                    return 0;
                case 9:
                    LinkedList<byte[]> j4 = aVar3.mo141632j(intValue);
                    int size4 = j4.size();
                    for (int i6 = 0; i6 < size4; i6++) {
                        byte[] bArr4 = j4.get(i6);
                        C51270sn1 sn12 = new C51270sn1();
                        if (bArr4 != null && bArr4.length > 0) {
                            sn12.parseFrom(bArr4);
                        }
                        vm02.f143563n.add(sn12);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
