package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.at1 */
public class C64244at1 extends C49335eu3 {

    /* renamed from: d */
    public String f182157d;

    /* renamed from: e */
    public String f182158e;

    /* renamed from: f */
    public int f182159f;

    /* renamed from: g */
    public String f182160g;

    /* renamed from: h */
    public wy4 f182161h;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64244at1)) {
            return false;
        }
        C64244at1 at12 = (C64244at1) aVar;
        return C46238a.m51546a(this.BaseResponse, at12.BaseResponse) && C46238a.m51546a(this.f182157d, at12.f182157d) && C46238a.m51546a(this.f182158e, at12.f182158e) && C46238a.m51546a(Integer.valueOf(this.f182159f), Integer.valueOf(at12.f182159f)) && C46238a.m51546a(this.f182160g, at12.f182160g) && C46238a.m51546a(this.f182161h, at12.f182161h);
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
                String str = this.f182157d;
                if (str != null) {
                    aVar.mo74323j(2, str);
                }
                String str2 = this.f182158e;
                if (str2 != null) {
                    aVar.mo74323j(3, str2);
                }
                aVar.mo74318e(4, this.f182159f);
                String str3 = this.f182160g;
                if (str3 != null) {
                    aVar.mo74323j(5, str3);
                }
                wy4 wy4 = this.f182161h;
                if (wy4 != null) {
                    aVar.mo74322i(6, wy4.computeSize());
                    this.f182161h.writeFields(aVar);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            String str4 = this.f182157d;
            if (str4 != null) {
                i2 += C52418a.m58683j(2, str4);
            }
            String str5 = this.f182158e;
            if (str5 != null) {
                i2 += C52418a.m58683j(3, str5);
            }
            int e = i2 + C52418a.m58678e(4, this.f182159f);
            String str6 = this.f182160g;
            if (str6 != null) {
                e += C52418a.m58683j(5, str6);
            }
            wy4 wy42 = this.f182161h;
            return wy42 != null ? e + C52418a.m58682i(6, wy42.computeSize()) : e;
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
            C64244at1 at12 = objArr[1];
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
                        at12.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    at12.f182157d = aVar3.mo141633k(intValue);
                    return 0;
                case 3:
                    at12.f182158e = aVar3.mo141633k(intValue);
                    return 0;
                case 4:
                    at12.f182159f = aVar3.mo141629g(intValue);
                    return 0;
                case 5:
                    at12.f182160g = aVar3.mo141633k(intValue);
                    return 0;
                case 6:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        wy4 wy43 = new wy4();
                        if (bArr2 != null && bArr2.length > 0) {
                            wy43.parseFrom(bArr2);
                        }
                        at12.f182161h = wy43;
                    }
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
