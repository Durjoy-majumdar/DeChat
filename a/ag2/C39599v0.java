package ag2;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import te3.C49335eu3;
import te3.C49966ja;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: ag2.v0 */
public class C39599v0 extends C49335eu3 {

    /* renamed from: d */
    public String f106315d;

    /* renamed from: e */
    public boolean f106316e;

    /* renamed from: f */
    public String f106317f;

    /* renamed from: g */
    public String f106318g;

    /* renamed from: h */
    public int f106319h;

    /* renamed from: i */
    public int f106320i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C39599v0)) {
            return false;
        }
        C39599v0 v0Var = (C39599v0) aVar;
        return C46238a.m51546a(this.BaseResponse, v0Var.BaseResponse) && C46238a.m51546a(this.f106315d, v0Var.f106315d) && C46238a.m51546a(Boolean.valueOf(this.f106316e), Boolean.valueOf(v0Var.f106316e)) && C46238a.m51546a(this.f106317f, v0Var.f106317f) && C46238a.m51546a(this.f106318g, v0Var.f106318g) && C46238a.m51546a(Integer.valueOf(this.f106319h), Integer.valueOf(v0Var.f106319h)) && C46238a.m51546a(Integer.valueOf(this.f106320i), Integer.valueOf(v0Var.f106320i));
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
            String str = this.f106315d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74314a(3, this.f106316e);
            String str2 = this.f106317f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            String str3 = this.f106318g;
            if (str3 != null) {
                aVar.mo74323j(5, str3);
            }
            aVar.mo74318e(6, this.f106319h);
            aVar.mo74318e(7, this.f106320i);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f106315d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            int a = i2 + C52418a.m58674a(3, this.f106316e);
            String str5 = this.f106317f;
            if (str5 != null) {
                a += C52418a.m58683j(4, str5);
            }
            String str6 = this.f106318g;
            if (str6 != null) {
                a += C52418a.m58683j(5, str6);
            }
            return a + C52418a.m58678e(6, this.f106319h) + C52418a.m58678e(7, this.f106320i);
        } else if (i == 2) {
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
            C39599v0 v0Var = objArr[1];
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
                        v0Var.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    v0Var.f106315d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    v0Var.f106316e = aVar3.mo141625c(intValue);
                    return 0;
                case 4:
                    v0Var.f106317f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    v0Var.f106318g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    v0Var.f106319h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    v0Var.f106320i = aVar3.mo141629g(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
