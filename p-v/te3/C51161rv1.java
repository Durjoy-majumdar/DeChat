package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.rv1 */
public class C51161rv1 extends C49335eu3 {

    /* renamed from: d */
    public LinkedList<String> f141161d = new LinkedList<>();

    /* renamed from: e */
    public int f141162e;

    /* renamed from: f */
    public String f141163f;

    /* renamed from: g */
    public String f141164g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51161rv1)) {
            return false;
        }
        C51161rv1 rv12 = (C51161rv1) aVar;
        return C46238a.m51546a(this.BaseResponse, rv12.BaseResponse) && C46238a.m51546a(this.f141161d, rv12.f141161d) && C46238a.m51546a(Integer.valueOf(this.f141162e), Integer.valueOf(rv12.f141162e)) && C46238a.m51546a(this.f141163f, rv12.f141163f) && C46238a.m51546a(this.f141164g, rv12.f141164g);
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
                aVar.mo74320g(2, 1, this.f141161d);
                aVar.mo74318e(3, this.f141162e);
                String str = this.f141163f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                String str2 = this.f141164g;
                if (str2 != null) {
                    aVar.mo74323j(5, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int g = i2 + C52418a.m58680g(2, 1, this.f141161d) + C52418a.m58678e(3, this.f141162e);
            String str3 = this.f141163f;
            if (str3 != null) {
                g += C52418a.m58683j(4, str3);
            }
            String str4 = this.f141164g;
            return str4 != null ? g + C52418a.m58683j(5, str4) : g;
        } else if (i == 2) {
            this.f141161d.clear();
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
            C51161rv1 rv12 = objArr[1];
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
                    rv12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                rv12.f141161d.add(aVar3.mo141633k(intValue));
                return 0;
            } else if (intValue == 3) {
                rv12.f141162e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                rv12.f141163f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                rv12.f141164g = aVar3.mo141633k(intValue);
                return 0;
            }
        }
    }
}
