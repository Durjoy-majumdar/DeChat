package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.yo0 */
public class C52144yo0 extends C49335eu3 {

    /* renamed from: d */
    public String f145430d;

    /* renamed from: e */
    public int f145431e;

    /* renamed from: f */
    public String f145432f;

    /* renamed from: g */
    public C51092rd1 f145433g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C52144yo0)) {
            return false;
        }
        C52144yo0 yo02 = (C52144yo0) aVar;
        return C46238a.m51546a(this.BaseResponse, yo02.BaseResponse) && C46238a.m51546a(this.f145430d, yo02.f145430d) && C46238a.m51546a(Integer.valueOf(this.f145431e), Integer.valueOf(yo02.f145431e)) && C46238a.m51546a(this.f145432f, yo02.f145432f) && C46238a.m51546a(this.f145433g, yo02.f145433g);
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
            String str = this.f145430d;
            if (str != null) {
                aVar.mo74323j(2, str);
            }
            aVar.mo74318e(3, this.f145431e);
            String str2 = this.f145432f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            C51092rd1 rd12 = this.f145433g;
            if (rd12 != null) {
                aVar.mo74322i(5, rd12.computeSize());
                this.f145433g.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str3 = this.f145430d;
            if (str3 != null) {
                i2 += C52418a.m58683j(2, str3);
            }
            int e = i2 + C52418a.m58678e(3, this.f145431e);
            String str4 = this.f145432f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            C51092rd1 rd13 = this.f145433g;
            return rd13 != null ? e + C52418a.m58682i(5, rd13.computeSize()) : e;
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
            C52144yo0 yo02 = objArr[1];
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
                    yo02.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                yo02.f145430d = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 3) {
                yo02.f145431e = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 4) {
                yo02.f145432f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C51092rd1 rd14 = new C51092rd1();
                    if (bArr2 != null && bArr2.length > 0) {
                        rd14.parseFrom(bArr2);
                    }
                    yo02.f145433g = rd14;
                }
                return 0;
            }
        }
    }
}
