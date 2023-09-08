package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.gr */
public class C49598gr extends C49335eu3 {

    /* renamed from: d */
    public int f134203d;

    /* renamed from: e */
    public String f134204e;

    /* renamed from: f */
    public String f134205f;

    /* renamed from: g */
    public b54 f134206g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C49598gr)) {
            return false;
        }
        C49598gr grVar = (C49598gr) aVar;
        return C46238a.m51546a(this.BaseResponse, grVar.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f134203d), Integer.valueOf(grVar.f134203d)) && C46238a.m51546a(this.f134204e, grVar.f134204e) && C46238a.m51546a(this.f134205f, grVar.f134205f) && C46238a.m51546a(this.f134206g, grVar.f134206g);
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
                aVar.mo74318e(2, this.f134203d);
                String str = this.f134204e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f134205f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                b54 b54 = this.f134206g;
                if (b54 != null) {
                    aVar.mo74322i(5, b54.computeSize());
                    this.f134206g.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f134203d);
            String str3 = this.f134204e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f134205f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            b54 b542 = this.f134206g;
            return b542 != null ? e + C52418a.m58682i(5, b542.computeSize()) : e;
        } else if (i == 2) {
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
            C49598gr grVar = objArr[1];
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
                    grVar.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                grVar.f134203d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                grVar.f134204e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                grVar.f134205f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    b54 b543 = new b54();
                    if (bArr2 != null && bArr2.length > 0) {
                        b543.parseFrom(bArr2);
                    }
                    grVar.f134206g = b543;
                }
                return 0;
            }
        }
    }
}
