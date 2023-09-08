package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.s12 */
public class C51189s12 extends C49335eu3 {

    /* renamed from: d */
    public int f141267d;

    /* renamed from: e */
    public int f141268e;

    /* renamed from: f */
    public LinkedList<C49019cl2> f141269f = new LinkedList<>();

    /* renamed from: g */
    public String f141270g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51189s12)) {
            return false;
        }
        C51189s12 s122 = (C51189s12) aVar;
        return C46238a.m51546a(this.BaseResponse, s122.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f141267d), Integer.valueOf(s122.f141267d)) && C46238a.m51546a(Integer.valueOf(this.f141268e), Integer.valueOf(s122.f141268e)) && C46238a.m51546a(this.f141269f, s122.f141269f) && C46238a.m51546a(this.f141270g, s122.f141270g);
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
                aVar.mo74318e(2, this.f141267d);
                aVar.mo74318e(3, this.f141268e);
                aVar.mo74320g(4, 8, this.f141269f);
                String str = this.f141270g;
                if (str != null) {
                    aVar.mo74323j(5, str);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f141267d) + C52418a.m58678e(3, this.f141268e) + C52418a.m58680g(4, 8, this.f141269f);
            String str2 = this.f141270g;
            return str2 != null ? e + C52418a.m58683j(5, str2) : e;
        } else if (i == 2) {
            this.f141269f.clear();
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
            C51189s12 s122 = objArr[1];
            int intValue = objArr[2].intValue();
            if (intValue == 1) {
                LinkedList<byte[]> j = aVar3.mo141632j(intValue);
                int size = j.size();
                for (int i3 = 0; i3 < size; i3++) {
                    byte[] bArr = j.get(i3);
                    C49966ja jaVar3 = new C49966ja();
                    if (bArr != null && bArr.length > 0) {
                        jaVar3.parseFrom(bArr);
                    }
                    s122.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                s122.f141267d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                s122.f141268e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49019cl2 cl22 = new C49019cl2();
                    if (bArr2 != null && bArr2.length > 0) {
                        cl22.parseFrom(bArr2);
                    }
                    s122.f141269f.add(cl22);
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                s122.f141270g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
