package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

public class ej4 extends C49335eu3 {

    /* renamed from: d */
    public int f132961d;

    /* renamed from: e */
    public String f132962e;

    /* renamed from: f */
    public LinkedList<C77947ig2> f132963f = new LinkedList<>();

    /* renamed from: g */
    public boolean f132964g;

    /* renamed from: h */
    public String f132965h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof ej4)) {
            return false;
        }
        ej4 ej4 = (ej4) aVar;
        return C46238a.m51546a(this.BaseResponse, ej4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f132961d), Integer.valueOf(ej4.f132961d)) && C46238a.m51546a(this.f132962e, ej4.f132962e) && C46238a.m51546a(this.f132963f, ej4.f132963f) && C46238a.m51546a(Boolean.valueOf(this.f132964g), Boolean.valueOf(ej4.f132964g)) && C46238a.m51546a(this.f132965h, ej4.f132965h);
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
            aVar.mo74318e(2, this.f132961d);
            String str = this.f132962e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            aVar.mo74320g(4, 8, this.f132963f);
            aVar.mo74314a(5, this.f132964g);
            String str2 = this.f132965h;
            if (str2 != null) {
                aVar.mo74323j(6, str2);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f132961d);
            String str3 = this.f132962e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            int g = e + C52418a.m58680g(4, 8, this.f132963f) + C52418a.m58674a(5, this.f132964g);
            String str4 = this.f132965h;
            return str4 != null ? g + C52418a.m58683j(6, str4) : g;
        } else if (i == 2) {
            this.f132963f.clear();
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
            ej4 ej4 = objArr[1];
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
                        ej4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    ej4.f132961d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    ej4.f132962e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C77947ig2 ig22 = new C77947ig2();
                        if (bArr2 != null && bArr2.length > 0) {
                            ig22.parseFrom(bArr2);
                        }
                        ej4.f132963f.add(ig22);
                    }
                    return 0;
                case 5:
                    ej4.f132964g = aVar3.mo141625c(intValue);
                    return 0;
                case 6:
                    ej4.f132965h = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
