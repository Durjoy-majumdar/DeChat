package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.eq3 */
public class C118428eq3 extends C49335eu3 {

    /* renamed from: d */
    public int f353980d;

    /* renamed from: e */
    public LinkedList<ep4> f353981e = new LinkedList<>();

    /* renamed from: f */
    public String f353982f;

    /* renamed from: g */
    public int f353983g;

    /* renamed from: h */
    public ii4 f353984h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C118428eq3)) {
            return false;
        }
        C118428eq3 eq32 = (C118428eq3) aVar;
        return C46238a.m51546a(this.BaseResponse, eq32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f353980d), Integer.valueOf(eq32.f353980d)) && C46238a.m51546a(this.f353981e, eq32.f353981e) && C46238a.m51546a(this.f353982f, eq32.f353982f) && C46238a.m51546a(Integer.valueOf(this.f353983g), Integer.valueOf(eq32.f353983g)) && C46238a.m51546a(this.f353984h, eq32.f353984h);
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
                aVar.mo74318e(2, this.f353980d);
                aVar.mo74320g(3, 8, this.f353981e);
                String str = this.f353982f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f353983g);
                ii4 ii4 = this.f353984h;
                if (ii4 != null) {
                    aVar.mo74322i(6, ii4.computeSize());
                    this.f353984h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f353980d) + C52418a.m58680g(3, 8, this.f353981e);
            String str2 = this.f353982f;
            if (str2 != null) {
                e += C52418a.m58683j(4, str2);
            }
            int e2 = e + C52418a.m58678e(5, this.f353983g);
            ii4 ii42 = this.f353984h;
            return ii42 != null ? e2 + C52418a.m58682i(6, ii42.computeSize()) : e2;
        } else if (i == 2) {
            this.f353981e.clear();
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
            C118428eq3 eq32 = objArr[1];
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
                        eq32.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    eq32.f353980d = aVar3.mo141629g(intValue);
                    return 0;
                case 3:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        ep4 ep4 = new ep4();
                        if (bArr2 != null && bArr2.length > 0) {
                            ep4.parseFrom(bArr2);
                        }
                        eq32.f353981e.add(ep4);
                    }
                    return 0;
                case 4:
                    eq32.f353982f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    eq32.f353983g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                    int size3 = j3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        byte[] bArr3 = j3.get(i5);
                        ii4 ii43 = new ii4();
                        if (bArr3 != null && bArr3.length > 0) {
                            ii43.parseFrom(bArr3);
                        }
                        eq32.f353984h = ii43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
