package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.lc3 */
public class C50244lc3 extends C49335eu3 {

    /* renamed from: d */
    public int f137301d;

    /* renamed from: e */
    public String f137302e;

    /* renamed from: f */
    public String f137303f;

    /* renamed from: g */
    public int f137304g;

    /* renamed from: h */
    public long f137305h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50244lc3)) {
            return false;
        }
        C50244lc3 lc32 = (C50244lc3) aVar;
        return C46238a.m51546a(this.BaseResponse, lc32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f137301d), Integer.valueOf(lc32.f137301d)) && C46238a.m51546a(this.f137302e, lc32.f137302e) && C46238a.m51546a(this.f137303f, lc32.f137303f) && C46238a.m51546a(Integer.valueOf(this.f137304g), Integer.valueOf(lc32.f137304g)) && C46238a.m51546a(Long.valueOf(this.f137305h), Long.valueOf(lc32.f137305h));
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
            aVar.mo74318e(2, this.f137301d);
            String str = this.f137302e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            String str2 = this.f137303f;
            if (str2 != null) {
                aVar.mo74323j(4, str2);
            }
            aVar.mo74318e(5, this.f137304g);
            aVar.mo74321h(100, this.f137305h);
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f137301d);
            String str3 = this.f137302e;
            if (str3 != null) {
                e += C52418a.m58683j(3, str3);
            }
            String str4 = this.f137303f;
            if (str4 != null) {
                e += C52418a.m58683j(4, str4);
            }
            return e + C52418a.m58678e(5, this.f137304g) + C52418a.m58681h(100, this.f137305h);
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
            C50244lc3 lc32 = objArr[1];
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
                    lc32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                lc32.f137301d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                lc32.f137302e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                lc32.f137303f = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 5) {
                lc32.f137304g = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue != 100) {
                return -1;
            } else {
                lc32.f137305h = aVar3.mo141631i(intValue);
                return 0;
            }
        }
    }
}
