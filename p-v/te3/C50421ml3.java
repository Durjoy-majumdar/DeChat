package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ml3 */
public class C50421ml3 extends C49335eu3 {

    /* renamed from: d */
    public int f138100d;

    /* renamed from: e */
    public String f138101e;

    /* renamed from: f */
    public LinkedList<rj4> f138102f = new LinkedList<>();

    /* renamed from: g */
    public LinkedList<rj4> f138103g = new LinkedList<>();

    /* renamed from: h */
    public String f138104h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50421ml3)) {
            return false;
        }
        C50421ml3 ml32 = (C50421ml3) aVar;
        return C46238a.m51546a(this.BaseResponse, ml32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f138100d), Integer.valueOf(ml32.f138100d)) && C46238a.m51546a(this.f138101e, ml32.f138101e) && C46238a.m51546a(this.f138102f, ml32.f138102f) && C46238a.m51546a(this.f138103g, ml32.f138103g) && C46238a.m51546a(this.f138104h, ml32.f138104h);
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
                aVar.mo74318e(2, this.f138100d);
                String str = this.f138101e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                aVar.mo74320g(4, 8, this.f138102f);
                aVar.mo74320g(5, 8, this.f138103g);
                String str2 = this.f138104h;
                if (str2 != null) {
                    aVar.mo74323j(6, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f138100d);
            String str3 = this.f138101e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int g = e + C52418a.m58680g(4, 8, this.f138102f) + C52418a.m58680g(5, 8, this.f138103g);
            String str4 = this.f138104h;
            return str4 != null ? g + C52418a.m58683j(6, str4) : g;
        } else if (i == 2) {
            this.f138102f.clear();
            this.f138103g.clear();
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
            C50421ml3 ml32 = objArr[1];
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
                        ml32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ml32.f138100d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ml32.f138101e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        rj4 rj4 = new rj4();
                        if (bArr2 != null && bArr2.length > 0) {
                            rj4.parseFrom(bArr2);
                        }
                        ml32.f138102f.add(rj4);
                    }
                    return 0;
                case 5:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        rj4 rj42 = new rj4();
                        if (bArr3 != null && bArr3.length > 0) {
                            rj42.parseFrom(bArr3);
                        }
                        ml32.f138103g.add(rj42);
                    }
                    return 0;
                case 6:
                    ml32.f138104h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
