package tw1;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: tw1.f */
public class C52372f extends C49335eu3 {

    /* renamed from: d */
    public String f146378d;

    /* renamed from: e */
    public LinkedList<String> f146379e = new LinkedList<>();

    /* renamed from: f */
    public LinkedList<C52373g> f146380f = new LinkedList<>();

    /* renamed from: g */
    public int f146381g;

    /* renamed from: h */
    public int f146382h;

    /* renamed from: i */
    public String f146383i;

    /* renamed from: j */
    public int f146384j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52372f)) {
            return false;
        }
        C52372f fVar = (C52372f) aVar;
        return C46238a.m51546a(this.BaseResponse, fVar.BaseResponse) && C46238a.m51546a(this.f146378d, fVar.f146378d) && C46238a.m51546a(this.f146379e, fVar.f146379e) && C46238a.m51546a(this.f146380f, fVar.f146380f) && C46238a.m51546a(Integer.valueOf(this.f146381g), Integer.valueOf(fVar.f146381g)) && C46238a.m51546a(Integer.valueOf(this.f146382h), Integer.valueOf(fVar.f146382h)) && C46238a.m51546a(this.f146383i, fVar.f146383i) && C46238a.m51546a(Integer.valueOf(this.f146384j), Integer.valueOf(fVar.f146384j));
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
                String str = this.f146378d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                aVar.mo74320g(3, 1, this.f146379e);
                aVar.mo74320g(4, 8, this.f146380f);
                aVar.mo74318e(5, this.f146381g);
                aVar.mo74318e(6, this.f146382h);
                String str2 = this.f146383i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                aVar.mo74318e(8, this.f146384j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f146378d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int g = i2 + C52418a.m58680g(3, 1, this.f146379e) + C52418a.m58680g(4, 8, this.f146380f) + C52418a.m58678e(5, this.f146381g) + C52418a.m58678e(6, this.f146382h);
            String str4 = this.f146383i;
            if (str4 != null) {
                g += C52418a.m58683j(7, str4);
            }
            return g + C52418a.m58678e(8, this.f146384j);
        } else if (i == 2) {
            this.f146379e.clear();
            this.f146380f.clear();
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
            C52372f fVar = objArr[1];
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
                        fVar.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    fVar.f146378d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    fVar.f146379e.add(aVar3.mo141633k(intValue));
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C52373g gVar = new C52373g();
                        if (bArr2 != null && bArr2.length > 0) {
                            gVar.parseFrom(bArr2);
                        }
                        fVar.f146380f.add(gVar);
                    }
                    return 0;
                case 5:
                    fVar.f146381g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    fVar.f146382h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    fVar.f146383i = aVar3.mo141633k(intValue);
                    return 0;
                case 8:
                    fVar.f146384j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
