package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tv1 */
public class C51453tv1 extends C49335eu3 {

    /* renamed from: d */
    public C49846ih2 f142438d;

    /* renamed from: e */
    public String f142439e;

    /* renamed from: f */
    public C49423fh2 f142440f;

    /* renamed from: g */
    public int f142441g;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C51453tv1)) {
            return false;
        }
        C51453tv1 tv12 = (C51453tv1) aVar;
        return C46238a.m51546a(this.BaseResponse, tv12.BaseResponse) && C46238a.m51546a(this.f142438d, tv12.f142438d) && C46238a.m51546a(this.f142439e, tv12.f142439e) && C46238a.m51546a(this.f142440f, tv12.f142440f) && C46238a.m51546a(Integer.valueOf(this.f142441g), Integer.valueOf(tv12.f142441g));
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
                C49846ih2 ih22 = this.f142438d;
                if (ih22 != null) {
                    aVar.mo74322i(2, ih22.computeSize());
                    this.f142438d.writeFields(aVar);
                }
                String str = this.f142439e;
                if (str != null) {
                    aVar.mo74323j(3, str);
                }
                C49423fh2 fh22 = this.f142440f;
                if (fh22 != null) {
                    aVar.mo74322i(4, fh22.computeSize());
                    this.f142440f.writeFields(aVar);
                }
                aVar.mo74318e(5, this.f142441g);
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C49846ih2 ih23 = this.f142438d;
            if (ih23 != null) {
                i2 += C52418a.m58682i(2, ih23.computeSize());
            }
            String str2 = this.f142439e;
            if (str2 != null) {
                i2 += C52418a.m58683j(3, str2);
            }
            C49423fh2 fh23 = this.f142440f;
            if (fh23 != null) {
                i2 += C52418a.m58682i(4, fh23.computeSize());
            }
            return i2 + C52418a.m58678e(5, this.f142441g);
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
            C51453tv1 tv12 = objArr[1];
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
                    tv12.BaseResponse = jaVar3;
                }
                return 0;
            } else if (intValue == 2) {
                LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                int size2 = j2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    byte[] bArr2 = j2.get(i4);
                    C49846ih2 ih24 = new C49846ih2();
                    if (bArr2 != null && bArr2.length > 0) {
                        ih24.parseFrom(bArr2);
                    }
                    tv12.f142438d = ih24;
                }
                return 0;
            } else if (intValue == 3) {
                tv12.f142439e = aVar3.mo141633k(intValue);
                return 0;
            } else if (intValue == 4) {
                LinkedList<byte[]> j3 = aVar3.mo141632j(intValue);
                int size3 = j3.size();
                for (int i5 = 0; i5 < size3; i5++) {
                    byte[] bArr3 = j3.get(i5);
                    C49423fh2 fh24 = new C49423fh2();
                    if (bArr3 != null && bArr3.length > 0) {
                        fh24.parseFrom(bArr3);
                    }
                    tv12.f142440f = fh24;
                }
                return 0;
            } else if (intValue != 5) {
                return -1;
            } else {
                tv12.f142441g = aVar3.mo141629g(intValue);
                return 0;
            }
        }
    }
}
