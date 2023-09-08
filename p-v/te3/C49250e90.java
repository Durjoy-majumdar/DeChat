package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e90 */
public class C49250e90 extends C49335eu3 {

    /* renamed from: d */
    public int f132803d;

    /* renamed from: e */
    public long f132804e;

    /* renamed from: f */
    public int f132805f;

    /* renamed from: g */
    public int f132806g;

    /* renamed from: h */
    public LinkedList<gf4> f132807h = new LinkedList<>();

    /* renamed from: i */
    public int f132808i;

    /* renamed from: j */
    public int f132809j;

    /* renamed from: n */
    public LinkedList<ff4> f132810n = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49250e90)) {
            return false;
        }
        C49250e90 e902 = (C49250e90) aVar;
        return C46238a.m51546a(this.BaseResponse, e902.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132803d), Integer.valueOf(e902.f132803d)) && C46238a.m51546a(Long.valueOf(this.f132804e), Long.valueOf(e902.f132804e)) && C46238a.m51546a(Integer.valueOf(this.f132805f), Integer.valueOf(e902.f132805f)) && C46238a.m51546a(Integer.valueOf(this.f132806g), Integer.valueOf(e902.f132806g)) && C46238a.m51546a(this.f132807h, e902.f132807h) && C46238a.m51546a(Integer.valueOf(this.f132808i), Integer.valueOf(e902.f132808i)) && C46238a.m51546a(Integer.valueOf(this.f132809j), Integer.valueOf(e902.f132809j)) && C46238a.m51546a(this.f132810n, e902.f132810n);
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
                aVar.mo74318e(2, this.f132803d);
                aVar.mo74321h(3, this.f132804e);
                aVar.mo74318e(4, this.f132805f);
                aVar.mo74318e(5, this.f132806g);
                aVar.mo74320g(6, 8, this.f132807h);
                aVar.mo74318e(7, this.f132808i);
                aVar.mo74318e(8, this.f132809j);
                aVar.mo74320g(9, 8, this.f132810n);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f132803d) + C52418a.m58681h(3, this.f132804e) + C52418a.m58678e(4, this.f132805f) + C52418a.m58678e(5, this.f132806g) + C52418a.m58680g(6, 8, this.f132807h) + C52418a.m58678e(7, this.f132808i) + C52418a.m58678e(8, this.f132809j) + C52418a.m58680g(9, 8, this.f132810n);
        } else if (i == 2) {
            this.f132807h.clear();
            this.f132810n.clear();
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
            C49250e90 e902 = objArr[1];
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
                        e902.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    e902.f132803d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e902.f132804e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    e902.f132805f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e902.f132806g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        gf4 gf4 = new gf4();
                        if (bArr2 != null && bArr2.length > 0) {
                            gf4.parseFrom(bArr2);
                        }
                        e902.f132807h.add(gf4);
                    }
                    return 0;
                case 7:
                    e902.f132808i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e902.f132809j = aVar3.mo141629g(intValue);
                    return 0;
                case 9:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ff4 ff4 = new ff4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ff4.parseFrom(bArr3);
                        }
                        e902.f132810n.add(ff4);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
