package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.ol3 */
public class C50701ol3 extends C49335eu3 {

    /* renamed from: d */
    public int f139251d;

    /* renamed from: e */
    public String f139252e;

    /* renamed from: f */
    public wk4 f139253f;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C50701ol3)) {
            return false;
        }
        C50701ol3 ol32 = (C50701ol3) aVar;
        return C46238a.m51546a(this.BaseResponse, ol32.BaseResponse) && C46238a.m51546a(Integer.valueOf(this.f139251d), Integer.valueOf(ol32.f139251d)) && C46238a.m51546a(this.f139252e, ol32.f139252e) && C46238a.m51546a(this.f139253f, ol32.f139253f);
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
            aVar.mo74318e(2, this.f139251d);
            String str = this.f139252e;
            if (str != null) {
                aVar.mo74323j(3, str);
            }
            wk4 wk4 = this.f139253f;
            if (wk4 != null) {
                aVar.mo74322i(4, wk4.computeSize());
                this.f139253f.writeFields(aVar);
            }
            return 0;
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            int e = i2 + C52418a.m58678e(2, this.f139251d);
            String str2 = this.f139252e;
            if (str2 != null) {
                e += C52418a.m58683j(3, str2);
            }
            wk4 wk42 = this.f139253f;
            return wk42 != null ? e + C52418a.m58682i(4, wk42.computeSize()) : e;
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
            C50701ol3 ol32 = objArr[1];
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
                    ol32.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                ol32.f139251d = aVar3.mo141629g(intValue);
                return 0;
            } else if (intValue == 3) {
                ol32.f139252e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue != 4) {
                return -1;
            } else {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    wk4 wk43 = new wk4();
                    if (bArr2 != null && bArr2.length > 0) {
                        wk43.parseFrom(bArr2);
                    }
                    ol32.f139253f = wk43;
                }
                return 0;
            }
        }
    }
}
