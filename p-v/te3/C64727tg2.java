package te3;

import if0.C46238a;
import java.util.LinkedList;
import pe3.C47465a;
import u14.C52418a;
import u14.C52419b;
import v14.C102122a;
import z14.C53733a;

/* renamed from: te3.tg2 */
public class C64727tg2 extends C49335eu3 {

    /* renamed from: d */
    public C51018qv3 f185557d;

    /* renamed from: e */
    public int f185558e;

    /* renamed from: f */
    public String f185559f;

    /* renamed from: g */
    public int f185560g;

    /* renamed from: h */
    public int f185561h;

    /* renamed from: i */
    public String f185562i;

    public boolean compareContent(C47465a aVar) {
        if (aVar == null || !(aVar instanceof C64727tg2)) {
            return false;
        }
        C64727tg2 tg22 = (C64727tg2) aVar;
        return C46238a.m51546a(this.BaseResponse, tg22.BaseResponse) && C46238a.m51546a(this.f185557d, tg22.f185557d) && C46238a.m51546a(Integer.valueOf(this.f185558e), Integer.valueOf(tg22.f185558e)) && C46238a.m51546a(this.f185559f, tg22.f185559f) && C46238a.m51546a(Integer.valueOf(this.f185560g), Integer.valueOf(tg22.f185560g)) && C46238a.m51546a(Integer.valueOf(this.f185561h), Integer.valueOf(tg22.f185561h)) && C46238a.m51546a(this.f185562i, tg22.f185562i);
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
                C51018qv3 qv32 = this.f185557d;
                if (qv32 != null) {
                    aVar.mo74322i(2, qv32.computeSize());
                    this.f185557d.writeFields(aVar);
                }
                aVar.mo74318e(3, this.f185558e);
                String str = this.f185559f;
                if (str != null) {
                    aVar.mo74323j(4, str);
                }
                aVar.mo74318e(5, this.f185560g);
                aVar.mo74318e(6, this.f185561h);
                String str2 = this.f185562i;
                if (str2 != null) {
                    aVar.mo74323j(7, str2);
                }
                return 0;
            }
            throw new C52419b("Not all required fields were included: BaseResponse");
        } else if (i == 1) {
            C49966ja jaVar2 = this.BaseResponse;
            if (jaVar2 != null) {
                i2 = 0 + C52418a.m58682i(1, jaVar2.computeSize());
            }
            C51018qv3 qv33 = this.f185557d;
            if (qv33 != null) {
                i2 += C52418a.m58682i(2, qv33.computeSize());
            }
            int e = i2 + C52418a.m58678e(3, this.f185558e);
            String str3 = this.f185559f;
            if (str3 != null) {
                e += C52418a.m58683j(4, str3);
            }
            int e2 = e + C52418a.m58678e(5, this.f185560g) + C52418a.m58678e(6, this.f185561h);
            String str4 = this.f185562i;
            return str4 != null ? e2 + C52418a.m58683j(7, str4) : e2;
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
            C64727tg2 tg22 = objArr[1];
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
                        tg22.BaseResponse = jaVar3;
                    }
                    return 0;
                case 2:
                    LinkedList<byte[]> j2 = aVar3.mo141632j(intValue);
                    int size2 = j2.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        byte[] bArr2 = j2.get(i4);
                        C51018qv3 qv34 = new C51018qv3();
                        if (bArr2 != null && bArr2.length > 0) {
                            qv34.mo73348f(bArr2);
                        }
                        tg22.f185557d = qv34;
                    }
                    return 0;
                case 3:
                    tg22.f185558e = aVar3.mo141629g(intValue);
                    return 0;
                case 4:
                    tg22.f185559f = aVar3.mo141633k(intValue);
                    return 0;
                case 5:
                    tg22.f185560g = aVar3.mo141629g(intValue);
                    return 0;
                case 6:
                    tg22.f185561h = aVar3.mo141629g(intValue);
                    return 0;
                case 7:
                    tg22.f185562i = aVar3.mo141633k(intValue);
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
