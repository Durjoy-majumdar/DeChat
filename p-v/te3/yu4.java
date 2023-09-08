package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

public class yu4 extends C49335eu3 {

    /* renamed from: d */
    public int f145520d;

    /* renamed from: e */
    public long f145521e;

    /* renamed from: f */
    public int f145522f;

    /* renamed from: g */
    public int f145523g;

    /* renamed from: h */
    public LinkedList<aw4> f145524h = new LinkedList<>();

    /* renamed from: i */
    public String f145525i;

    /* renamed from: j */
    public int f145526j;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof yu4)) {
            return false;
        }
        yu4 yu4 = (yu4) aVar;
        return C46238a.m51546a(this.BaseResponse, yu4.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f145520d), Integer.valueOf(yu4.f145520d)) && C46238a.m51546a(Long.valueOf(this.f145521e), Long.valueOf(yu4.f145521e)) && C46238a.m51546a(Integer.valueOf(this.f145522f), Integer.valueOf(yu4.f145522f)) && C46238a.m51546a(Integer.valueOf(this.f145523g), Integer.valueOf(yu4.f145523g)) && C46238a.m51546a(this.f145524h, yu4.f145524h) && C46238a.m51546a(this.f145525i, yu4.f145525i) && C46238a.m51546a(Integer.valueOf(this.f145526j), Integer.valueOf(yu4.f145526j));
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
                aVar.mo74318e(2, this.f145520d);
                aVar.mo74321h(3, this.f145521e);
                aVar.mo74318e(4, this.f145522f);
                aVar.mo74318e(6, this.f145523g);
                aVar.mo74320g(7, 8, this.f145524h);
                String str = this.f145525i;
                if (str != null) {
                    aVar.mo74323j(8, str);
                }
                aVar.mo74318e(9, this.f145526j);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f145520d) + C52418a.m58681h(3, this.f145521e) + C52418a.m58678e(4, this.f145522f) + C52418a.m58678e(6, this.f145523g) + C52418a.m58680g(7, 8, this.f145524h);
            String str2 = this.f145525i;
            if (str2 != null) {
                e += C52418a.m58683j(8, str2);
            }
            return e + C52418a.m58678e(9, this.f145526j);
        } else if (i == 2) {
            this.f145524h.clear();
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
            yu4 yu4 = objArr[1];
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
                        yu4.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    yu4.f145520d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    yu4.f145521e = aVar3.mo141631i(intValue);
                    return 0;
                case 4:
                    yu4.f145522f = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    yu4.f145523g = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        aw4 aw4 = new aw4();
                        if (bArr2 != null && bArr2.length > 0) {
                            aw4.parseFrom(bArr2);
                        }
                        yu4.f145524h.add(aw4);
                    }
                    return 0;
                case 8:
                    yu4.f145525i = aVar3.mo141633k(intValue);
                    return 0;
                case 9:
                    yu4.f145526j = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
