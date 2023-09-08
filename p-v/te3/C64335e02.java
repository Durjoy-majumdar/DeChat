package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.e02 */
public class C64335e02 extends C49335eu3 {

    /* renamed from: d */
    public int f182906d;

    /* renamed from: e */
    public int f182907e;

    /* renamed from: f */
    public int f182908f;

    /* renamed from: g */
    public LinkedList<Integer> f182909g = new LinkedList<>();

    /* renamed from: h */
    public LinkedList<C64361fa0> f182910h = new LinkedList<>();

    /* renamed from: i */
    public int f182911i;

    /* renamed from: j */
    public String f182912j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64335e02)) {
            return false;
        }
        C64335e02 e022 = (C64335e02) aVar;
        return C46238a.m51546a(this.BaseResponse, e022.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f182906d), Integer.valueOf(e022.f182906d)) && C46238a.m51546a(Integer.valueOf(this.f182907e), Integer.valueOf(e022.f182907e)) && C46238a.m51546a(Integer.valueOf(this.f182908f), Integer.valueOf(e022.f182908f)) && C46238a.m51546a(this.f182909g, e022.f182909g) && C46238a.m51546a(this.f182910h, e022.f182910h) && C46238a.m51546a(Integer.valueOf(this.f182911i), Integer.valueOf(e022.f182911i)) && C46238a.m51546a(this.f182912j, e022.f182912j);
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
                aVar.mo74318e(2, this.f182906d);
                aVar.mo74318e(3, this.f182907e);
                aVar.mo74318e(4, this.f182908f);
                aVar.mo74320g(5, 2, this.f182909g);
                aVar.mo74320g(6, 8, this.f182910h);
                aVar.mo74318e(7, this.f182911i);
                String str = this.f182912j;
                if (str != null) {
                    aVar.mo74323j(8, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f182906d) + C52418a.m58678e(3, this.f182907e) + C52418a.m58678e(4, this.f182908f) + C52418a.m58680g(5, 2, this.f182909g) + C52418a.m58680g(6, 8, this.f182910h) + C52418a.m58678e(7, this.f182911i);
            String str2 = this.f182912j;
            return str2 != null ? e + C52418a.m58683j(8, str2) : e;
        } else if (i == 2) {
            this.f182909g.clear();
            this.f182910h.clear();
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
            C64335e02 e022 = objArr[1];
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
                        e022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    e022.f182906d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    e022.f182907e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    e022.f182908f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    e022.f182909g.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C64361fa0 fa02 = new C64361fa0();
                        if (bArr2 != null && bArr2.length > 0) {
                            fa02.parseFrom(bArr2);
                        }
                        e022.f182910h.add(fa02);
                    }
                    return 0;
                case 7:
                    e022.f182911i = aVar3.mo141629g(intValue);
                    return 0;
                case 8:
                    e022.f182912j = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
