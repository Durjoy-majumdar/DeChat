package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.jk3 */
public class C50004jk3 extends C49335eu3 {

    /* renamed from: d */
    public int f136170d;

    /* renamed from: e */
    public String f136171e;

    /* renamed from: f */
    public String f136172f;

    /* renamed from: g */
    public LinkedList<C52250zd3> f136173g = new LinkedList<>();

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50004jk3)) {
            return false;
        }
        C50004jk3 jk32 = (C50004jk3) aVar;
        return C46238a.m51546a(this.BaseResponse, jk32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f136170d), Integer.valueOf(jk32.f136170d)) && C46238a.m51546a(this.f136171e, jk32.f136171e) && C46238a.m51546a(this.f136172f, jk32.f136172f) && C46238a.m51546a(this.f136173g, jk32.f136173g);
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
                aVar.mo74318e(2, this.f136170d);
                String str = this.f136171e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                String str2 = this.f136172f;
                if (str2 != null) {
                    aVar.mo74323j(4, str2);
                }
                aVar.mo74320g(5, 8, this.f136173g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f136170d);
            String str3 = this.f136171e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f136172f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58680g(5, 8, this.f136173g);
        } else if (i == 2) {
            this.f136173g.clear();
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
            C50004jk3 jk32 = objArr[1];
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
                    jk32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                jk32.f136170d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                jk32.f136171e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                jk32.f136172f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C52250zd3 zd32 = new C52250zd3();
                    if (bArr2 != null && bArr2.length > 0) {
                        zd32.parseFrom(bArr2);
                    }
                    jk32.f136173g.add(zd32);
                }
                return 0;
            }
        }
    }
}
