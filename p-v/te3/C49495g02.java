package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.g02 */
public class C49495g02 extends C49335eu3 {

    /* renamed from: d */
    public int f133759d;

    /* renamed from: e */
    public int f133760e;

    /* renamed from: f */
    public LinkedList<Integer> f133761f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<C49967ja0> f133762g = new LinkedList<>();

    /* renamed from: h */
    public int f133763h;

    /* renamed from: i */
    public LinkedList<C50782p5> f133764i = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49495g02)) {
            return false;
        }
        C49495g02 g022 = (C49495g02) aVar;
        return C46238a.m51546a(this.BaseResponse, g022.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f133759d), Integer.valueOf(g022.f133759d)) && C46238a.m51546a(Integer.valueOf(this.f133760e), Integer.valueOf(g022.f133760e)) && C46238a.m51546a(this.f133761f, g022.f133761f) && C46238a.m51546a(this.f133762g, g022.f133762g) && C46238a.m51546a(Integer.valueOf(this.f133763h), Integer.valueOf(g022.f133763h)) && C46238a.m51546a(this.f133764i, g022.f133764i);
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
                aVar.mo74318e(2, this.f133759d);
                aVar.mo74318e(3, this.f133760e);
                aVar.mo74320g(4, 2, this.f133761f);
                aVar.mo74320g(5, 8, this.f133762g);
                aVar.mo74318e(6, this.f133763h);
                aVar.mo74320g(7, 8, this.f133764i);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            return i2 + C52418a.m58678e(2, this.f133759d) + C52418a.m58678e(3, this.f133760e) + C52418a.m58680g(4, 2, this.f133761f) + C52418a.m58680g(5, 8, this.f133762g) + C52418a.m58678e(6, this.f133763h) + C52418a.m58680g(7, 8, this.f133764i);
        } else if (i == 2) {
            this.f133761f.clear();
            this.f133762g.clear();
            this.f133764i.clear();
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
            C49495g02 g022 = objArr[1];
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
                        g022.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    g022.f133759d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    g022.f133760e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    g022.f133761f.add(Integer.valueOf(aVar3.mo141629g(intValue)));
                    return 0;
                case 5:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C49967ja0 ja02 = new C49967ja0();
                        if (bArr2 != null && bArr2.length > 0) {
                            ja02.parseFrom(bArr2);
                        }
                        g022.f133762g.add(ja02);
                    }
                    return 0;
                case 6:
                    g022.f133763h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        C50782p5 p5Var = new C50782p5();
                        if (bArr3 != null && bArr3.length > 0) {
                            p5Var.parseFrom(bArr3);
                        }
                        g022.f133764i.add(p5Var);
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
